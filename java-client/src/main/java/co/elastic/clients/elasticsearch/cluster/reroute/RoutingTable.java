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

package co.elastic.clients.elasticsearch.cluster.reroute;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.RoutingTable
@JsonpDeserializable
public final class RoutingTable implements JsonpSerializable {
	private final Map<String, RoutingTableIndex> indices;

	// ---------------------------------------------------------------------------------------------

	public RoutingTable(Builder builder) {

		this.indices = Objects.requireNonNull(builder.indices, "indices");

	}

	/**
	 * API name: {@code indices}
	 */
	public Map<String, RoutingTableIndex> indices() {
		return this.indices;
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

		generator.writeKey("indices");
		generator.writeStartObject();
		for (Map.Entry<String, RoutingTableIndex> item0 : this.indices.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoutingTable}.
	 */
	public static class Builder implements ObjectBuilder<RoutingTable> {
		private Map<String, RoutingTableIndex> indices;

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(Map<String, RoutingTableIndex> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, RoutingTableIndex value) {
			if (this.indices == null) {
				this.indices = new HashMap<>();
			}
			this.indices.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<RoutingTableIndex.Builder, ObjectBuilder<RoutingTableIndex>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new RoutingTableIndex.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key,
				Function<RoutingTableIndex.Builder, ObjectBuilder<RoutingTableIndex>> fn) {
			return this.putIndices(key, fn.apply(new RoutingTableIndex.Builder()).build());
		}

		/**
		 * Builds a {@link RoutingTable}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoutingTable build() {

			return new RoutingTable(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoutingTable}
	 */
	public static final JsonpDeserializer<RoutingTable> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RoutingTable::setupRoutingTableDeserializer, Builder::build);

	protected static void setupRoutingTableDeserializer(DelegatingDeserializer<RoutingTable.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(RoutingTableIndex._DESERIALIZER), "indices");

	}

}
