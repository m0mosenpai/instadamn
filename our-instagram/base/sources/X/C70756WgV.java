package X;

import java.io.IOException;

/* renamed from: X.WgV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70756WgV implements C1EH {
    public static final C70756WgV A00 = new C70756WgV();

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
        C66652URq c66652URq = new C66652URq(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 511);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaMusicOverlaySticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            c66652URq.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66652URq.A07 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66652URq.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66652URq.A04 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -898186784:
                        if (A0s.equals("music_overlay_model")) {
                            C66619UPg c66619UPg = (C66619UPg) C16V.A01(c16l, C70770Wgj.A00);
                            C14360o3.A0B(c66619UPg, 0);
                            c66652URq.A05 = c66619UPg;
                            break;
                        }
                        break;
                    case -859682253:
                        if (A0s.equals("music_sticker_display_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null && (ve9 = (VE9) VE9.A01.get(A1P2)) != null) {
                                c66652URq.A06 = ve9;
                                break;
                            }
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                c66652URq.A08 = A1P3;
                                break;
                            }
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66652URq.A02 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66652URq.A03 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaMusicOverlayStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66652URq;
    }
}
