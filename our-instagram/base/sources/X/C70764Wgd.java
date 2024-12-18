package X;

import java.io.IOException;

/* renamed from: X.Wgd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70764Wgd implements C1EH {
    public static final C70764Wgd A00 = new C70764Wgd();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        C66661URz c66661URz = new C66661URz(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 65535);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaSliderSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            c66661URz.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66661URz.A04 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66661URz.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66661URz.A03 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1165870106:
                        if (A0s.equals("question")) {
                            c66661URz.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1085479528:
                        if (A0s.equals("slider_vote_count")) {
                            c66661URz.A09 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -1058048922:
                        if (A0s.equals("slider_vote_average")) {
                            c66661URz.A07 = AbstractC167007dF.A0b(c16l);
                            break;
                        }
                        break;
                    case -795590343:
                        if (A0s.equals("slider_id")) {
                            c66661URz.A0D = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66661URz.A0F = A1P2;
                                break;
                            }
                        }
                        break;
                    case 96632902:
                        if (A0s.equals("emoji")) {
                            c66661URz.A0B = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1093411206:
                        if (A0s.equals("viewer_can_vote")) {
                            c66661URz.A06 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1124422903:
                        if (A0s.equals("viewer_vote")) {
                            c66661URz.A08 = AbstractC167007dF.A0b(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66661URz.A01 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1323957169:
                        if (A0s.equals("is_interactive_music_sticker")) {
                            c66661URz.A05 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66661URz.A02 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                    case 2036780306:
                        if (A0s.equals("background_color")) {
                            c66661URz.A0A = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaSliderStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66661URz;
    }
}
