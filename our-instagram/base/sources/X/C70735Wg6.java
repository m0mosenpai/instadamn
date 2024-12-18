package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Wg6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70735Wg6 implements C1EH {
    public static final C70735Wg6 A00 = new C70735Wg6();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        C26068Bfw c26068Bfw = new C26068Bfw();
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for ProfilePicUrlInfo should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                int hashCode = A0s.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode != 116079) {
                        if (hashCode == 113126854 && A0s.equals(IgReactMediaPickerNativeModule.WIDTH)) {
                            c26068Bfw.A01 = c16l.A1D();
                        }
                        C0K8.A0C("ProfilePicUrlInfoJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                    } else {
                        if (A0s.equals("url")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                c26068Bfw.A02 = A1P;
                            }
                        }
                        C0K8.A0C("ProfilePicUrlInfoJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                    }
                } else {
                    if (A0s.equals(IgReactMediaPickerNativeModule.HEIGHT)) {
                        c26068Bfw.A00 = c16l.A1D();
                    }
                    C0K8.A0C("ProfilePicUrlInfoJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                }
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c26068Bfw;
    }
}
