package kotlinx.serialization.json;

import X.AbstractC902640l;
import X.C14360o3;

/* loaded from: classes2.dex */
public final class JsonLiteral extends JsonPrimitive {
    public final String A00;
    public final boolean A01;

    public JsonLiteral(Object obj, boolean z) {
        C14360o3.A0B(obj, 1);
        this.A01 = z;
        this.A00 = obj.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                JsonLiteral jsonLiteral = (JsonLiteral) obj;
                if (this.A01 != jsonLiteral.A01 || !C14360o3.A0K(this.A00, jsonLiteral.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + this.A00.hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        if (this.A01) {
            StringBuilder sb = new StringBuilder();
            AbstractC902640l.A00(sb, this.A00);
            String obj = sb.toString();
            C14360o3.A07(obj);
            return obj;
        }
        return this.A00;
    }
}
