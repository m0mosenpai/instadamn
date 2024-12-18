package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.WgZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70760WgZ implements C1EH {
    public static final C70760WgZ A00 = new C70760WgZ();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        VEH veh;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        EnumC68145VDi enumC68145VDi;
        String A1P6;
        int i = 0;
        C14360o3.A0B(c16l, 0);
        US7 us7 = new US7(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, Integer.MAX_VALUE);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaPromptSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                VEC vec = null;
                switch (A0s.hashCode()) {
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                us7.A0A = veh;
                                break;
                            }
                        }
                        break;
                    case -1996772183:
                        if (A0s.equals("is_trending_prompt")) {
                            us7.A0L = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            us7.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1911580874:
                        if (A0s.equals("is_pinned_by_creator")) {
                            us7.A0I = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1475936846:
                        if (A0s.equals("is_clips_v2_media")) {
                            us7.A0D = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            us7.A06 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -1167125638:
                        if (A0s.equals("facepile_top_participants")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, Wg7.A00));
                                }
                            }
                            us7.A0U = arrayList;
                            break;
                        }
                        break;
                    case -1114680033:
                        if (A0s.equals("is_story_trending_prompt")) {
                            us7.A0K = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -1061345759:
                        if (A0s.equals("sticker_style_str")) {
                            us7.A0R = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1025303767:
                        if (A0s.equals("is_before_and_after")) {
                            us7.A0C = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case -900774058:
                        if (A0s.equals("media_id")) {
                            us7.A0P = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -885136013:
                        if (A0s.equals("prompt_failure_tooltip")) {
                            us7.A03 = (UQE) C16V.A01(c16l, C70774Wgn.A00);
                            break;
                        }
                        break;
                    case -871809258:
                        if (A0s.equals("prompt_style")) {
                            us7.A0Q = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -821815367:
                        if (A0s.equals("original_author")) {
                            us7.A07 = (UPU) C16V.A01(c16l, Wg7.A00);
                            break;
                        }
                        break;
                    case 3355:
                        if (A0s.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                us7.A0O = A1P2;
                                break;
                            }
                        }
                        break;
                    case 3556653:
                        if (A0s.equals("text")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                us7.A0S = A1P3;
                                break;
                            }
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                us7.A0T = A1P4;
                                break;
                            }
                        }
                        break;
                    case 186507096:
                        if (A0s.equals("disablement_state")) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null && (enumC68145VDi = (EnumC68145VDi) EnumC68145VDi.A01.get(A1P5)) != null) {
                                us7.A08 = enumC68145VDi;
                                break;
                            }
                        }
                        break;
                    case 405415469:
                        if (A0s.equals("is_created_from_add_yours_browsing")) {
                            us7.A0E = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 464576065:
                        if (A0s.equals("is_viewer_original_author")) {
                            us7.A0M = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 493270317:
                        if (A0s.equals("is_icon_disabled")) {
                            us7.A0G = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 849767883:
                        if (A0s.equals("has_participated")) {
                            us7.A0B = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 917294641:
                        if (A0s.equals("election_add_yours_info")) {
                            us7.A02 = (C26087BgG) C16V.A01(c16l, C70737Wg9.A00);
                            break;
                        }
                        break;
                    case 1233798655:
                        if (A0s.equals("is_speakeasy")) {
                            us7.A0J = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            us7.A04 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1324364035:
                        if (A0s.equals("participant_count")) {
                            us7.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1356750754:
                        if (A0s.equals("is_original_prompt_media")) {
                            us7.A0H = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1597787285:
                        if (A0s.equals("is_from_add_yours_camera_tool")) {
                            us7.A0F = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1634479413:
                        if (A0s.equals("prompt_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P6 = c16l.A1P()) != null) {
                                vec = (VEC) VEC.A01.get(A1P6);
                            }
                            us7.A09 = vec;
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            us7.A05 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                    case 2036780306:
                        if (A0s.equals("background_color")) {
                            us7.A0N = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaPromptStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return us7;
    }
}
