package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.WgS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70753WgS implements C1EH {
    public static final C70753WgS A00 = new C70753WgS();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        VE9 ve9;
        String A1P3;
        int i = 0;
        C14360o3.A0B(c16l, 0);
        C66653URr c66653URr = new C66653URr(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 1023);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaLyricsSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            c66653URr.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66653URr.A07 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66653URr.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66653URr.A04 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -898186784:
                        if (A0s.equals("music_overlay_model")) {
                            C66619UPg c66619UPg = (C66619UPg) C16V.A01(c16l, C70770Wgj.A00);
                            C14360o3.A0B(c66619UPg, 0);
                            c66653URr.A05 = c66619UPg;
                            break;
                        }
                        break;
                    case -859682253:
                        if (A0s.equals("music_sticker_display_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null && (ve9 = (VE9) VE9.A01.get(A1P2)) != null) {
                                c66653URr.A06 = ve9;
                                break;
                            }
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                c66653URr.A08 = A1P3;
                                break;
                            }
                        }
                        break;
                    case 374680573:
                        if (A0s.equals(AbstractC111324zv.A00(1117))) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, C70741WgE.A00));
                                }
                            }
                            c66653URr.A09 = arrayList;
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66653URr.A02 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66653URr.A03 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaLyricsStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66653URr;
    }
}
