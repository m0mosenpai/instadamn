package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.WgO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70749WgO implements C1EH {
    public static final C70749WgO A00 = new C70749WgO();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        VE6 ve6;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        C66659URx c66659URx = new C66659URx(VE6.A06, VEH.A1d, null, AbstractC167017dG.A0j(), null, C16930sl.A00, 0, 0, 0);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaKaraokeCaptionSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            c66659URx.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66659URx.A08 = veh;
                                break;
                            }
                        }
                        break;
                    case -1992012396:
                        if (A0s.equals("duration")) {
                            c66659URx.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66659URx.A03 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1833386028:
                        if (A0s.equals("karaoke_sticker_display_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null && (ve6 = (VE6) VE6.A01.get(A1P2)) != null) {
                                c66659URx.A07 = ve6;
                                break;
                            }
                        }
                        break;
                    case -1475936846:
                        if (A0s.equals("is_clips_v2_media")) {
                            c66659URx.A09 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1226035186:
                        if (A0s.equals("emphasis_state")) {
                            c66659URx.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66659URx.A06 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1195408547:
                        if (A0s.equals("sticker_id")) {
                            c66659URx.A0B = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -868186726:
                        if (A0s.equals("tokens")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, WgD.A00));
                                }
                            }
                            c66659URx.A0E = arrayList;
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                c66659URx.A0D = A1P3;
                                break;
                            }
                        }
                        break;
                    case 94842723:
                        if (A0s.equals("color")) {
                            c66659URx.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66659URx.A04 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66659URx.A05 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                    case 2036780306:
                        if (A0s.equals("background_color")) {
                            c66659URx.A0A = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaKaraokeCaptionStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66659URx;
    }
}
