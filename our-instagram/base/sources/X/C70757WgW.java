package X;

import java.io.IOException;

/* renamed from: X.WgW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70757WgW implements C1EH {
    public static final C70757WgW A00 = new C70757WgW();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        String A1P3;
        String A1P4;
        int i = 0;
        C14360o3.A0B(c16l, 0);
        float f = 0.0f;
        C66657URv c66657URv = new C66657URv(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, f, f, i, i, i, 16383);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaPollSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66657URv.A09 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66657URv.A05 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1369440366:
                        if (A0s.equals("question_padding_bottom")) {
                            c66657URv.A04 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66657URv.A08 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1165870106:
                        if (A0s.equals("question")) {
                            c66657URv.A0B = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -792211212:
                        if (A0s.equals("second_option_text_size")) {
                            c66657URv.A02 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -760638832:
                        if (A0s.equals("second_option_string")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66657URv.A0C = A1P2;
                                break;
                            }
                        }
                        break;
                    case -468347206:
                        if (A0s.equals("question_text_size")) {
                            c66657URv.A01 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                c66657URv.A0D = A1P3;
                                break;
                            }
                        }
                        break;
                    case 338274834:
                        if (A0s.equals("question_max_width")) {
                            c66657URv.A03 = c16l.A1D();
                            break;
                        }
                        break;
                    case 630818764:
                        if (A0s.equals("first_option_string")) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                c66657URv.A0A = A1P4;
                                break;
                            }
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66657URv.A06 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1391657528:
                        if (A0s.equals("first_option_text_size")) {
                            c66657URv.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66657URv.A07 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaPollStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66657URv;
    }
}
