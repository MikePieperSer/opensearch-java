/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: ml.get_jobs.Request

public class GetJobsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoJobs;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean excludeGenerated;

	private final List<String> jobId;

	// ---------------------------------------------------------------------------------------------

	private GetJobsRequest(Builder builder) {

		this.allowNoJobs = builder.allowNoJobs;
		this.allowNoMatch = builder.allowNoMatch;
		this.excludeGenerated = builder.excludeGenerated;
		this.jobId = ModelTypeHelper.unmodifiable(builder.jobId);

	}

	public static GetJobsRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Whether to ignore if a wildcard expression matches no jobs. (This includes
	 * <code>_all</code> string or when no jobs have been specified)
	 * <p>
	 * API name: {@code allow_no_jobs}
	 */
	@Nullable
	public final Boolean allowNoJobs() {
		return this.allowNoJobs;
	}

	/**
	 * Specifies what to do when the request:
	 * <ol>
	 * <li>Contains wildcard expressions and there are no jobs that match.</li>
	 * <li>Contains the _all string or no identifiers and there are no matches.</li>
	 * <li>Contains wildcard expressions and there are only partial matches.</li>
	 * </ol>
	 * <p>
	 * The default value is <code>true</code>, which returns an empty
	 * <code>jobs</code> array when there are no matches and the subset of results
	 * when there are partial matches. If this parameter is <code>false</code>, the
	 * request returns a <code>404</code> status code when there are no matches or
	 * only partial matches.
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public final Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * Indicates if certain fields should be removed from the configuration on
	 * retrieval. This allows the configuration to be in an acceptable format to be
	 * retrieved and then added to another cluster.
	 * <p>
	 * API name: {@code exclude_generated}
	 */
	@Nullable
	public final Boolean excludeGenerated() {
		return this.excludeGenerated;
	}

	/**
	 * Identifier for the anomaly detection job. It can be a job identifier, a group
	 * name, or a wildcard expression. If you do not specify one of these options,
	 * the API returns information for all anomaly detection jobs.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final List<String> jobId() {
		return this.jobId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetJobsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetJobsRequest> {
		@Nullable
		private Boolean allowNoJobs;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean excludeGenerated;

		@Nullable
		private List<String> jobId;

		/**
		 * Whether to ignore if a wildcard expression matches no jobs. (This includes
		 * <code>_all</code> string or when no jobs have been specified)
		 * <p>
		 * API name: {@code allow_no_jobs}
		 */
		public final Builder allowNoJobs(@Nullable Boolean value) {
			this.allowNoJobs = value;
			return this;
		}

		/**
		 * Specifies what to do when the request:
		 * <ol>
		 * <li>Contains wildcard expressions and there are no jobs that match.</li>
		 * <li>Contains the _all string or no identifiers and there are no matches.</li>
		 * <li>Contains wildcard expressions and there are only partial matches.</li>
		 * </ol>
		 * <p>
		 * The default value is <code>true</code>, which returns an empty
		 * <code>jobs</code> array when there are no matches and the subset of results
		 * when there are partial matches. If this parameter is <code>false</code>, the
		 * request returns a <code>404</code> status code when there are no matches or
		 * only partial matches.
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public final Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * Indicates if certain fields should be removed from the configuration on
		 * retrieval. This allows the configuration to be in an acceptable format to be
		 * retrieved and then added to another cluster.
		 * <p>
		 * API name: {@code exclude_generated}
		 */
		public final Builder excludeGenerated(@Nullable Boolean value) {
			this.excludeGenerated = value;
			return this;
		}

		/**
		 * Identifier for the anomaly detection job. It can be a job identifier, a group
		 * name, or a wildcard expression. If you do not specify one of these options,
		 * the API returns information for all anomaly detection jobs.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(@Nullable List<String> value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Identifier for the anomaly detection job. It can be a job identifier, a group
		 * name, or a wildcard expression. If you do not specify one of these options,
		 * the API returns information for all anomaly detection jobs.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String... value) {
			this.jobId = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link GetJobsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetJobsRequest build() {
			_checkSingleUse();

			return new GetJobsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_jobs}".
	 */
	public static final Endpoint<GetJobsRequest, GetJobsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_jobs",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.jobId()))
					propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoJobs != null) {
					params.put("allow_no_jobs", String.valueOf(request.allowNoJobs));
				}
				if (request.excludeGenerated != null) {
					params.put("exclude_generated", String.valueOf(request.excludeGenerated));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetJobsResponse._DESERIALIZER);
}
