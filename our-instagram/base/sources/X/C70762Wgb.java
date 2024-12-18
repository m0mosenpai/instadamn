package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wgb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70762Wgb implements C1EH {
    public static final C70762Wgb A00 = new C70762Wgb();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        US3 us3 = new US3(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 524287);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaQuizSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2115337775:
                        if (A0s.equals("text_color")) {
                            us3.A0F = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -2100963494:
                        if (A0s.equals("viewer_can_answer")) {
                            us3.A06 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                us3.A04 = veh;
                                break;
                            }
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            us3.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1791284941:
                        if (A0s.equals("correct_answer")) {
                            us3.A07 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -1543665910:
                        if (A0s.equals("tallies")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, C70763Wgc.A00));
                                }
                            }
                            us3.A0I = arrayList;
                            break;
                        }
                        break;
                    case -1249474914:
                        if (A0s.equals("options")) {
                            ArrayList arrayList2 = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList2.add(C16V.A01(c16l, C70763Wgc.A00));
                                }
                            }
                            us3.A0H = arrayList2;
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            us3.A03 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1165870106:
                        if (A0s.equals("question")) {
                            us3.A0C = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -673660814:
                        if (A0s.equals("finished")) {
                            us3.A05 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -209971210:
                        if (A0s.equals("end_background_color")) {
                            us3.A0A = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -132220081:
                        if (A0s.equals("start_background_color")) {
                            us3.A0E = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            us3.A0B = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                us3.A0G = A1P2;
                                break;
                            }
                        }
                        break;
                    case 659010373:
                        if (A0s.equals("quiz_id")) {
                            us3.A0D = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            us3.A01 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            us3.A02 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                    case 1931473547:
                        if (A0s.equals("viewer_answer")) {
                            us3.A08 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 2068129058:
                        if (A0s.equals("default_prompt")) {
                            us3.A09 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaQuizStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return us3;
    }
}
