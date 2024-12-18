package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Wgl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70772Wgl implements C1EH {
    public static final C70772Wgl A00 = new C70772Wgl();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        C45116Jxl c45116Jxl = new C45116Jxl(null, 7, 20);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for RingGlyph should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                int hashCode = A0s.hashCode();
                if (hashCode != -877823861) {
                    if (hashCode != 3373707) {
                        if (hashCode == 473808408 && A0s.equals(AbstractC111324zv.A00(221))) {
                            c45116Jxl.A01 = AbstractC65702TsY.A0b(c16l);
                        }
                        C0K8.A0C("RingGlyphJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                    } else {
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c45116Jxl.A02 = A1P2;
                            }
                        }
                        C0K8.A0C("RingGlyphJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                    }
                } else {
                    if (A0s.equals("image_url")) {
                        if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                            c45116Jxl.A00 = A1P;
                        }
                    }
                    C0K8.A0C("RingGlyphJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                }
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c45116Jxl;
    }
}
