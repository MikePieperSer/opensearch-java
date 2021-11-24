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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.WaitForActiveShards;
import co.elastic.clients.elasticsearch.indices.rollover.IndexRolloverMapping;
import co.elastic.clients.elasticsearch.indices.rollover.RolloverConditions;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.rollover.Request
@JsonpDeserializable
public class RolloverRequest extends RequestBase implements JsonpSerializable {
	private final String alias;

	private final Map<String, Alias> aliases;

	@Nullable
	private final RolloverConditions conditions;

	@Nullable
	private final Boolean dryRun;

	@Nullable
	private final Boolean includeTypeName;

	@Nullable
	private final IndexRolloverMapping mappings;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final String newIndex;

	private final Map<String, JsonData> settings;

	@Nullable
	private final Time timeout;

	@Nullable
	private final WaitForActiveShards waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	private RolloverRequest(Builder builder) {

		this.alias = ModelTypeHelper.requireNonNull(builder.alias, this, "alias");
		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.conditions = builder.conditions;
		this.dryRun = builder.dryRun;
		this.includeTypeName = builder.includeTypeName;
		this.mappings = builder.mappings;
		this.masterTimeout = builder.masterTimeout;
		this.newIndex = builder.newIndex;
		this.settings = ModelTypeHelper.unmodifiable(builder.settings);
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public static RolloverRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - The name of the alias to rollover
	 * <p>
	 * API name: {@code alias}
	 */
	public final String alias() {
		return this.alias;
	}

	/**
	 * API name: {@code aliases}
	 */
	public final Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code conditions}
	 */
	@Nullable
	public final RolloverConditions conditions() {
		return this.conditions;
	}

	/**
	 * If set to true the rollover action will only be validated but not actually
	 * performed even if a condition matches. The default is false
	 * <p>
	 * API name: {@code dry_run}
	 */
	@Nullable
	public final Boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * Whether a type should be included in the body of the mappings.
	 * <p>
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public final Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public final IndexRolloverMapping mappings() {
		return this.mappings;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The name of the rollover index
	 * <p>
	 * API name: {@code new_index}
	 */
	@Nullable
	public final String newIndex() {
		return this.newIndex;
	}

	/**
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Set the number of active shards to wait for on the newly created rollover
	 * index before the operation returns.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final WaitForActiveShards waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ModelTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.conditions != null) {
			generator.writeKey("conditions");
			this.conditions.serialize(generator, mapper);

		}
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RolloverRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RolloverRequest> {
		private String alias;

		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private RolloverConditions conditions;

		@Nullable
		private Boolean dryRun;

		@Nullable
		private Boolean includeTypeName;

		@Nullable
		private IndexRolloverMapping mappings;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private String newIndex;

		@Nullable
		private Map<String, JsonData> settings;

		@Nullable
		private Time timeout;

		@Nullable
		private WaitForActiveShards waitForActiveShards;

		/**
		 * Required - The name of the alias to rollover
		 * <p>
		 * API name: {@code alias}
		 */
		public final Builder alias(String value) {
			this.alias = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public final Builder aliases(@Nullable Map<String, Alias> value) {
			this.aliases = value;
			return this;
		}

		public final Builder aliases(
				Function<MapBuilder<String, Alias, Alias.Builder>, ObjectBuilder<Map<String, Alias>>> fn) {
			return aliases(fn.apply(new MapBuilder<>(Alias.Builder::new)).build());
		}

		/**
		 * API name: {@code conditions}
		 */
		public final Builder conditions(@Nullable RolloverConditions value) {
			this.conditions = value;
			return this;
		}

		/**
		 * API name: {@code conditions}
		 */
		public final Builder conditions(Consumer<RolloverConditions.Builder> fn) {
			RolloverConditions.Builder builder = new RolloverConditions.Builder();
			fn.accept(builder);
			return this.conditions(builder.build());
		}

		/**
		 * If set to true the rollover action will only be validated but not actually
		 * performed even if a condition matches. The default is false
		 * <p>
		 * API name: {@code dry_run}
		 */
		public final Builder dryRun(@Nullable Boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * Whether a type should be included in the body of the mappings.
		 * <p>
		 * API name: {@code include_type_name}
		 */
		public final Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable IndexRolloverMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Consumer<IndexRolloverMapping.Builder> fn) {
			IndexRolloverMapping.Builder builder = new IndexRolloverMapping.Builder();
			fn.accept(builder);
			return this.mappings(builder.build());
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.masterTimeout(builder.build());
		}

		/**
		 * The name of the rollover index
		 * <p>
		 * API name: {@code new_index}
		 */
		public final Builder newIndex(@Nullable String value) {
			this.newIndex = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public final Builder settings(@Nullable Map<String, JsonData> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Consumer<Time.Builder> fn) {
			Time.Builder builder = new Time.Builder();
			fn.accept(builder);
			return this.timeout(builder.build());
		}

		/**
		 * Set the number of active shards to wait for on the newly created rollover
		 * index before the operation returns.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Set the number of active shards to wait for on the newly created rollover
		 * index before the operation returns.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(Consumer<WaitForActiveShards.Builder> fn) {
			WaitForActiveShards.Builder builder = new WaitForActiveShards.Builder();
			fn.accept(builder);
			return this.waitForActiveShards(builder.build());
		}

		/**
		 * Builds a {@link RolloverRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolloverRequest build() {
			_checkSingleUse();

			return new RolloverRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RolloverRequest}
	 */
	public static final JsonpDeserializer<RolloverRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RolloverRequest::setupRolloverRequestDeserializer);

	protected static void setupRolloverRequestDeserializer(ObjectDeserializer<RolloverRequest.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::conditions, RolloverConditions._DESERIALIZER, "conditions");
		op.add(Builder::mappings, IndexRolloverMapping._DESERIALIZER, "mappings");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.rollover}".
	 */
	public static final Endpoint<RolloverRequest, RolloverResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.rollover",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _newIndex = 1 << 0;
				final int _alias = 1 << 1;

				int propsSet = 0;

				if (request.newIndex() != null)
					propsSet |= _newIndex;
				propsSet |= _alias;

				if (propsSet == (_alias)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.alias, buf);
					buf.append("/_rollover");
					return buf.toString();
				}
				if (propsSet == (_alias | _newIndex)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.alias, buf);
					buf.append("/_rollover");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.newIndex, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.includeTypeName != null) {
					params.put("include_type_name", String.valueOf(request.includeTypeName));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards._toJsonString());
				}
				if (request.dryRun != null) {
					params.put("dry_run", String.valueOf(request.dryRun));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, RolloverResponse._DESERIALIZER);
}
