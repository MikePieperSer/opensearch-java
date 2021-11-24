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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _global.close_point_in_time.Request
@JsonpDeserializable
public class ClosePointInTimeRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	// ---------------------------------------------------------------------------------------------

	private ClosePointInTimeRequest(Builder builder) {

		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");

	}

	public static ClosePointInTimeRequest of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
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

		generator.writeKey("id");
		generator.write(this.id);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClosePointInTimeRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClosePointInTimeRequest> {
		private String id;

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Builds a {@link ClosePointInTimeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClosePointInTimeRequest build() {
			_checkSingleUse();

			return new ClosePointInTimeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClosePointInTimeRequest}
	 */
	public static final JsonpDeserializer<ClosePointInTimeRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClosePointInTimeRequest::setupClosePointInTimeRequestDeserializer);

	protected static void setupClosePointInTimeRequestDeserializer(
			ObjectDeserializer<ClosePointInTimeRequest.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code close_point_in_time}".
	 */
	public static final Endpoint<ClosePointInTimeRequest, ClosePointInTimeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/close_point_in_time",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				return "/_pit";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, ClosePointInTimeResponse._DESERIALIZER);
}
