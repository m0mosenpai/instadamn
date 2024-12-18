package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6iU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146316iU {
    public final Map A00 = new HashMap();
    public final String A01;

    public final void A00(InterfaceC43071ya interfaceC43071ya, C41181vS c41181vS, C141596ac c141596ac) {
        String str;
        Map map = this.A00;
        if (!map.containsKey(c141596ac)) {
            StringBuilder sb = new StringBuilder();
            sb.append("could not clean state at: ");
            sb.append(c141596ac.A0I);
            sb.append(" last action: ");
            switch (c141596ac.A0W.intValue()) {
                case 0:
                    str = "TAP_FORWARD";
                    break;
                case 1:
                    str = "TAP_BACK";
                    break;
                case 2:
                    str = "SWIPE_FORWARD";
                    break;
                case 3:
                    str = "SWIPE_BACK";
                    break;
                case 4:
                    str = "AUTOMATIC_FORWARD";
                    break;
                case 5:
                    str = "SWIPE_DOWN";
                    break;
                case 6:
                    str = "SWIPE_UP";
                    break;
                case 7:
                    str = "TAP_EXIT";
                    break;
                case 8:
                    str = "TAP_DASHBOARD";
                    break;
                case 9:
                    str = "HIDE_AD";
                    break;
                case 10:
                    str = "HIDE";
                    break;
                case 11:
                    str = "DELETE_LAST_ITEM";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str = "DELETE_LAST_PENDING_ITEM";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str = "TYPE_SELECTOR_TAP";
                    break;
                case 14:
                    str = "REEL_VIEWER_TRAY_TAP";
                    break;
                case Process.SIGTERM /* 15 */:
                    str = "MID_CARD_CREATE_STORY_TAP";
                    break;
                case 16:
                    str = "MID_CARD_PROFILE_PICTURE_TAP";
                    break;
                default:
                    str = "TAP_CREATOR_INSIGHTS_TIP";
                    break;
            }
            sb.append(str);
            sb.append(" for action: ");
            sb.append(interfaceC43071ya);
            sb.append(" is netego: ");
            sb.append(c41181vS.A1Q());
            sb.append(" is ad: ");
            sb.append(c41181vS.CdW());
            sb.append(" id: ");
            sb.append(c41181vS.A0j);
            sb.append(" session id: ");
            sb.append(this.A01);
            C0w9.A03("reel_item_state_cleaner_mismatch", sb.toString());
            c141596ac.A01();
            return;
        }
        java.util.Set set = (java.util.Set) map.get(c141596ac);
        if (!set.remove(interfaceC43071ya) || !set.isEmpty()) {
            return;
        }
        c141596ac.A01();
        map.remove(c141596ac);
    }

    public C146316iU(String str) {
        this.A01 = str;
    }
}
