package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.WgX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70758WgX implements C1EH {
    public static final C70758WgX A00 = new C70758WgX();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        C66658URw c66658URw = new C66658URw(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 16383, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaPollV2Sticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                c66658URw.A04 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            c66658URw.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1543665910:
                        if (A0s.equals("tallies")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, C70759WgY.A00));
                                }
                            }
                            c66658URw.A0B = arrayList;
                            break;
                        }
                        break;
                    case -1463231774:
                        if (A0s.equals("is_shared_result")) {
                            c66658URw.A0C = c16l.A0d();
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            c66658URw.A03 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1165870106:
                        if (A0s.equals("question")) {
                            c66658URw.A08 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -897309819:
                        if (A0s.equals("option_tally_ratios")) {
                            ArrayList arrayList2 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC166997dE.A1W(arrayList2, c16l.A1D());
                                }
                            }
                            c66658URw.A0A = arrayList2;
                            break;
                        }
                        break;
                    case -397914725:
                        if (A0s.equals("poll_id")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c66658URw.A07 = A1P2;
                                break;
                            }
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                c66658URw.A09 = A1P3;
                                break;
                            }
                        }
                        break;
                    case 94842723:
                        if (A0s.equals("color")) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                c66658URw.A06 = A1P4;
                                break;
                            }
                        }
                        break;
                    case 1093411206:
                        if (A0s.equals("viewer_can_vote")) {
                            c66658URw.A0D = c16l.A0d();
                            break;
                        }
                        break;
                    case 1124422903:
                        if (A0s.equals("viewer_vote")) {
                            c66658URw.A05 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            c66658URw.A01 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            c66658URw.A02 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaPollV2StickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66658URw;
    }
}
