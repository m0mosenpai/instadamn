package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WgN implements C1EH {
    public static final WgN A00 = new WgN();

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
        US4 us4 = new US4(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 33554431);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaJoinChatSticker should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                EnumC68154VDy enumC68154VDy = null;
                r3 = null;
                VE3 ve3 = null;
                r3 = null;
                EnumC68150VDu enumC68150VDu = null;
                enumC68154VDy = null;
                switch (A0s.hashCode()) {
                    case -2056597344:
                        if (A0s.equals("connected_member_count")) {
                            us4.A0C = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -2030994180:
                        if (A0s.equals("sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null && (veh = (VEH) VEH.A01.get(A1P)) != null) {
                                us4.A07 = veh;
                                break;
                            }
                        }
                        break;
                    case -2015362923:
                        if (A0s.equals("audience_type")) {
                            us4.A0B = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case -1985806860:
                        if (A0s.equals("selected_variant_index")) {
                            us4.A00 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1766928858:
                        if (A0s.equals("social_context_users")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, Wg7.A00));
                                }
                            }
                            us4.A0O = arrayList;
                            break;
                        }
                        break;
                    case -1562235024:
                        if (A0s.equals(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID)) {
                            us4.A0K = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -1377763017:
                        if (A0s.equals("member_status")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                enumC68154VDy = (EnumC68154VDy) EnumC68154VDy.A01.get(A1P2);
                            }
                            us4.A05 = enumC68154VDy;
                            break;
                        }
                        break;
                    case -1203619573:
                        if (A0s.equals("drawable_transform")) {
                            us4.A03 = (C66629UPr) C16V.A01(c16l, C70734Wg5.A00);
                            break;
                        }
                        break;
                    case -970008040:
                        if (A0s.equals("story_chat_id")) {
                            us4.A0J = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -799136893:
                        if (A0s.equals(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY)) {
                            us4.A0G = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -277885525:
                        if (A0s.equals("thread_id_v2")) {
                            us4.A0L = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -270906245:
                        if (A0s.equals("share_source")) {
                            us4.A0I = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case -59350230:
                        if (A0s.equals("member_count")) {
                            us4.A0D = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 3601339:
                        if (A0s.equals("uuid")) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                us4.A0N = A1P3;
                                break;
                            }
                        }
                        break;
                    case 110371416:
                        if (A0s.equals(DialogModule.KEY_TITLE)) {
                            us4.A0M = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 176121795:
                        if (A0s.equals("active_member_count")) {
                            us4.A0A = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 1085391444:
                        if (A0s.equals("is_creation")) {
                            us4.A08 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 1107859144:
                        if (A0s.equals("group_image_uri")) {
                            us4.A0H = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1126597251:
                        if (A0s.equals("chat_sticker_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                enumC68150VDu = (EnumC68150VDu) EnumC68150VDu.A01.get(A1P4);
                            }
                            us4.A06 = enumC68150VDu;
                            break;
                        }
                        break;
                    case 1169975446:
                        if (A0s.equals("deeplink_url")) {
                            us4.A0F = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 1231504520:
                        if (A0s.equals("duration_s")) {
                            us4.A0E = AbstractC31173DnH.A0h(c16l);
                            break;
                        }
                        break;
                    case 1260322998:
                        if (A0s.equals("timed_info")) {
                            us4.A01 = (UQL) C16V.A01(c16l, C70767Wgg.A00);
                            break;
                        }
                        break;
                    case 1620118465:
                        if (A0s.equals("chat_type")) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                ve3 = (VE3) VE3.A01.get(A1P5);
                            }
                            us4.A04 = ve3;
                            break;
                        }
                        break;
                    case 1776071171:
                        if (A0s.equals("drawable_config")) {
                            us4.A02 = (C66630UPs) C16V.A01(c16l, C70732Wg3.A00);
                            break;
                        }
                        break;
                    case 1832509061:
                        if (A0s.equals("is_editing_enabled")) {
                            us4.A09 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaJoinChatStickerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return us4;
    }
}
