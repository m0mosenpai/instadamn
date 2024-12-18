package com.facebook.spherical.util;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
/* loaded from: classes3.dex */
public class Quaternion {

    @JsonProperty("w")
    public float w = 1.0f;

    @JsonProperty("z")
    public float z = 0.0f;

    @JsonProperty("y")
    public float y = 0.0f;

    @JsonProperty("x")
    public float x = 0.0f;

    public final void A00(Quaternion quaternion) {
        float f = quaternion.w;
        float f2 = this.w;
        float f3 = quaternion.x;
        float f4 = this.x;
        float f5 = quaternion.y;
        float f6 = this.y;
        float f7 = quaternion.z;
        float f8 = this.z;
        this.w = (((f * f2) - (f3 * f4)) - (f5 * f6)) - (f7 * f8);
        this.x = (((f * f4) + (f3 * f2)) + (f5 * f8)) - (f7 * f6);
        this.y = ((f * f6) - (f3 * f8)) + (f5 * f2) + (f7 * f4);
        this.z = (((f * f8) + (f3 * f6)) - (f5 * f4)) + (f7 * f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quaternion{w=");
        sb.append(this.w);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", z=");
        sb.append(this.z);
        sb.append('}');
        return sb.toString();
    }
}
