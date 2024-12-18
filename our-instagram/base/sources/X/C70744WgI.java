package X;

import java.io.IOException;

/* renamed from: X.WgI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70744WgI implements C1EH {
    public static final C70744WgI A00 = new C70744WgI();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        int i = 0;
        C14360o3.A0B(c16l, 0);
        C66649URn c66649URn = new C66649URn(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, i, 511);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaGallerySticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66649URn.A07 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66649URn.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66649URn.A05 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1078030475:
                        if (A0s.equals("medium")) {
                            UQM uqm = (UQM) C16V.A01(c16l, C70754WgT.A00);
                            C14360o3.A0B(uqm, 0);
                            c66649URn.A06 = uqm;
                            break;
                        }
                        break;
                    case -230974677:
                        if (A0s.equals("max_width")) {
                            c66649URn.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66649URn.A08 = A1P2;
                                break;
                            }
                        }
                        break;
                    case 996724834:
                        if (A0s.equals("max_height")) {
                            c66649URn.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66649URn.A03 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66649URn.A04 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaGalleryStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66649URn;
    }
}
