package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public final class WgG implements C1EH {
    public static final WgG A00 = new WgG();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        US2 us2 = new US2(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 524287);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaCountdownSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            us2.A0H = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2069450039:
                        if (A0s.equals("viewer_is_following")) {
                            us2.A08 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                us2.A05 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            us2.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1549938746:
                        if (A0s.equals("digit_card_color")) {
                            us2.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1298761629:
                        if (A0s.equals("end_ts")) {
                            us2.A09 = AbstractC31173DnH.A0h(c16l);
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            us2.A03 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -309882753:
                        if (A0s.equals("attribution")) {
                            us2.A04 = (UPU) C16V.A01(c16l, Wg7.A00);
                            break;
                        }
                        break;
                    case -209971210:
                        if (A0s.equals("end_background_color")) {
                            us2.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -168253766:
                        if (A0s.equals("background_image_url")) {
                            us2.A0A = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -132220081:
                        if (A0s.equals("start_background_color")) {
                            us2.A0F = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -588909:
                        if (A0s.equals("following_enabled")) {
                            us2.A06 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 3556653:
                        if (A0s.equals("text")) {
                            us2.A0G = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                us2.A0I = A1P2;
                                break;
                            }
                        }
                        break;
                    case 121133918:
                        if (A0s.equals("is_owner")) {
                            us2.A07 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1047508433:
                        if (A0s.equals("digit_color")) {
                            us2.A0D = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            us2.A01 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1677107689:
                        if (A0s.equals("countdown_id")) {
                            us2.A0B = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            us2.A02 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaCountdownStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return us2;
    }
}
