package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.WgU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70755WgU implements C1EH {
    public static final C70755WgU A00 = new C70755WgU();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        String A1P3;
        int i = 0;
        C14360o3.A0B(c16l, 0);
        C66654URs c66654URs = new C66654URs(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, i, i, 1023);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaMentionSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66654URs.A07 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66654URs.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66654URs.A05 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1037596717:
                        if (A0s.equals("text_size")) {
                            c66654URs.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -230974677:
                        if (A0s.equals("max_width")) {
                            c66654URs.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3556653:
                        if (A0s.equals("text")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66654URs.A08 = A1P2;
                                break;
                            }
                        }
                        break;
                    case 3599307:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
                            c66654URs.A06 = (UPU) C16V.A01(c16l, Wg7.A00);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                c66654URs.A09 = A1P3;
                                break;
                            }
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66654URs.A03 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66654URs.A04 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaMentionStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66654URs;
    }
}
