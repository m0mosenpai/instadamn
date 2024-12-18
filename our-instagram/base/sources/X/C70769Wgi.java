package X;

import java.io.IOException;

/* renamed from: X.Wgi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70769Wgi implements C1EH {
    public static final C70769Wgi A00 = new C70769Wgi();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        C14360o3.A0B(c16l, 0);
        US0 us0 = new US0(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 65535, 0 == true ? 1 : 0);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaVisualCommentReplySticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            us0.A0D = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2048029722:
                        if (A0s.equals("can_viewer_link_back_to_original_media_from_vcr")) {
                            us0.A0F = c16l.A0d();
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                us0.A05 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            us0.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1970527703:
                        if (A0s.equals("original_comment_id")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                us0.A09 = A1P2;
                                break;
                            }
                        }
                        break;
                    case -1824429564:
                        if (A0s.equals("original_media_id")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                us0.A0B = A1P3;
                                break;
                            }
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            us0.A03 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -557632268:
                        if (A0s.equals("end_time_ms")) {
                            us0.A06 = AbstractC167007dF.A0b(c16l);
                            break;
                        }
                        break;
                    case -209971210:
                        if (A0s.equals("end_background_color")) {
                            us0.A08 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -132220081:
                        if (A0s.equals("start_background_color")) {
                            us0.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                us0.A0E = A1P4;
                                break;
                            }
                        }
                        break;
                    case 403787451:
                        if (A0s.equals("original_comment_text")) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                us0.A0A = A1P5;
                                break;
                            }
                        }
                        break;
                    case 963379097:
                        if (A0s.equals("original_comment_author")) {
                            UPU upu = (UPU) C16V.A01(c16l, Wg7.A00);
                            C14360o3.A0B(upu, 0);
                            us0.A04 = upu;
                            break;
                        }
                        break;
                    case 1106770299:
                        if (A0s.equals("start_time_ms")) {
                            us0.A07 = AbstractC167007dF.A0b(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            us0.A01 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            us0.A02 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaVisualCommentReplyStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return us0;
    }
}
