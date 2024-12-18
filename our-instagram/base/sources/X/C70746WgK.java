package X;

import java.io.IOException;

/* renamed from: X.WgK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70746WgK implements C1EH {
    public static final C70746WgK A00 = new C70746WgK();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        C66650URo c66650URo = new C66650URo(null, null, null, null, null, null, null, 0.0f, 0, 0, 511);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaHashtagSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66650URo.A06 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66650URo.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66650URo.A05 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1037596717:
                        if (A0s.equals("text_size")) {
                            c66650URo.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -230974677:
                        if (A0s.equals("max_width")) {
                            c66650URo.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case 3556653:
                        if (A0s.equals("text")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66650URo.A07 = A1P2;
                                break;
                            }
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                c66650URo.A08 = A1P3;
                                break;
                            }
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66650URo.A03 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66650URo.A04 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaHashtagStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66650URo;
    }
}
