package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.4ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101654ha {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.4hc, java.lang.Object] */
    public static C101674hc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            EnumC101664hb enumC101664hb = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("timestamp".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    enumC101664hb = EnumC101664hb.valueOf(c16l.A1P().toUpperCase(Locale.US));
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("timestamp", "DirectVisualMessageActionSummary");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (enumC101664hb == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "DirectVisualMessageActionSummary");
                } else {
                    long longValue = l.longValue();
                    int intValue = num.intValue();
                    C14360o3.A0B(enumC101664hb, 3);
                    ?? obj = new Object();
                    obj.A01 = longValue;
                    obj.A00 = intValue;
                    obj.A02 = enumC101664hb;
                    return obj;
                }
            } else {
                ((C07950bF) c16l).A03.A00("count", "DirectVisualMessageActionSummary");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C101674hc c101674hc) {
        anonymousClass182.A0d();
        anonymousClass182.A0R("timestamp", c101674hc.A01);
        anonymousClass182.A0Q("count", c101674hc.A00);
        EnumC101664hb enumC101664hb = c101674hc.A02;
        if (enumC101664hb != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, enumC101664hb.toString());
        }
        anonymousClass182.A0a();
    }
}
