package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Wg5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70734Wg5 implements C1EH {
    public static final C70734Wg5 A00 = new C70734Wg5();

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.UPr] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        String A0j = AbstractC167017dG.A0j();
        ?? obj = new Object();
        C66629UPr.A00(obj, A0j);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaDrawableTransform should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1221029593:
                        if (A0s.equals(IgReactMediaPickerNativeModule.HEIGHT)) {
                            obj.A07 = c16l.A1D();
                            break;
                        }
                        break;
                    case -755984436:
                        if (A0s.equals("offset_x")) {
                            obj.A01 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -755984435:
                        if (A0s.equals("offset_y")) {
                            obj.A02 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -560345157:
                        if (A0s.equals("pivot_x")) {
                            obj.A03 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -560345156:
                        if (A0s.equals("pivot_y")) {
                            obj.A04 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -415894406:
                        if (A0s.equals(AbstractC111324zv.A00(1057))) {
                            obj.A0D = c16l.A0d();
                            break;
                        }
                        break;
                    case -40300674:
                        if (A0s.equals("rotation")) {
                            obj.A05 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 122:
                        if (A0s.equals("z")) {
                            obj.A0B = c16l.A1D();
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            obj.A08 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                obj.A0C = A1P;
                                break;
                            }
                        }
                        break;
                    case 102749521:
                        if (A0s.equals("layer")) {
                            obj.A09 = c16l.A1D();
                            break;
                        }
                        break;
                    case 109250890:
                        if (A0s.equals("scale")) {
                            obj.A06 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 113126854:
                        if (A0s.equals(IgReactMediaPickerNativeModule.WIDTH)) {
                            obj.A0A = c16l.A1D();
                            break;
                        }
                        break;
                    case 1017591248:
                        if (A0s.equals("bouncing_scale")) {
                            obj.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaDrawableTransformJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return obj;
    }
}
