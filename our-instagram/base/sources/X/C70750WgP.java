package X;

import java.io.IOException;

/* renamed from: X.WgP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70750WgP implements C1EH {
    public static final C70750WgP A00 = new C70750WgP();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        C66660URy c66660URy = new C66660URy(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 65535);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaLinkSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66660URy.A04 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66660URy.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1864688508:
                        if (A0s.equals(AbstractC111324zv.A00(1264))) {
                            c66660URy.A08 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1844659745:
                        if (A0s.equals("is_dynamic_dwell_enabled")) {
                            c66660URy.A05 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1624275873:
                        if (A0s.equals("link_type")) {
                            c66660URy.A0D = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1581376446:
                        if (A0s.equals("custom_cta")) {
                            c66660URy.A0A = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66660URy.A03 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case 116079:
                        if (A0s.equals("url")) {
                            c66660URy.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66660URy.A0F = A1P2;
                                break;
                            }
                        }
                        break;
                    case 4887561:
                        if (A0s.equals("open_external_browser")) {
                            c66660URy.A07 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 488622371:
                        if (A0s.equals("is_universal_link")) {
                            c66660URy.A06 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 906452786:
                        if (A0s.equals("click_id")) {
                            c66660URy.A09 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1186582995:
                        if (A0s.equals("link_title")) {
                            c66660URy.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66660URy.A01 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1714674802:
                        if (A0s.equals("display_url")) {
                            c66660URy.A0B = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66660URy.A02 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaLinkStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66660URy;
    }
}
