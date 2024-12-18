package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.3Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC73763Sg {
    public static final C73773Sh A03 = new AbstractC73763Sg() { // from class: X.3Sh
        {
            new C73783Si(C05F.A0C, "    ", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, false, false, false, false, false, true, false, false, false, true, false, false, false);
            C73803Sk c73803Sk = AbstractC73793Sj.A00;
        }
    };
    public final C73783Si A00;
    public final C73813Sl A01 = new C73813Sl();
    public final C73803Sk A02;

    public final Object A00(String str, C3RB c3rb) {
        C3T2 c3t2;
        C14360o3.A0B(c3rb, 0);
        C14360o3.A0B(str, 1);
        if (!this.A00.A03) {
            c3t2 = new C3T2(str);
        } else {
            c3t2 = new C3T2(str);
        }
        Object AOG = new C3T6(c3rb.getDescriptor(), this, c3t2, null, C3T5.A06).AOG(c3rb);
        if (c3t2.A03() == 10) {
            return AOG;
        }
        c3t2.A0F(AnonymousClass001.A0T("Expected EOF after parsing, but had ", " instead", c3t2.A00.charAt(((C3T3) c3t2).A00 - 1)), "", ((C3T3) c3t2).A00);
        throw C00O.createAndThrow();
    }

    public final Object A01(C3RB c3rb, JsonElement jsonElement) {
        Decoder x6x;
        C14360o3.A0B(jsonElement, 1);
        if (jsonElement instanceof JsonObject) {
            x6x = new C71822X6a(null, null, this, (JsonObject) jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            x6x = new X6Y(this, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof JsonLiteral) && !jsonElement.equals(JsonNull.A00)) {
                throw new RuntimeException();
            }
            x6x = new X6X(null, this, jsonElement);
        }
        return x6x.AOG(c3rb);
    }

    public final String A02(Object obj, C3RA c3ra) {
        C4DA c4da;
        C14360o3.A0B(c3ra, 0);
        C4D4 c4d4 = new C4D4();
        try {
            C3T5 c3t5 = C3T5.A06;
            C4D7[] c4d7Arr = new C4D7[C3T5.A02.size()];
            if (this.A00.A0D) {
                c4da = new C4DD(this, c4d4);
            } else {
                c4da = new C4DA(c4d4);
            }
            new C4DB(this, c4da, c3t5, c4d7Arr).ASI(obj, c3ra);
            return c4d4.toString();
        } finally {
            c4d4.A01();
        }
    }

    public AbstractC73763Sg(C73783Si c73783Si, C73803Sk c73803Sk) {
        this.A00 = c73783Si;
        this.A02 = c73803Sk;
    }
}
