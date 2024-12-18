package X;

import android.app.Activity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.G6f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36455G6f implements MR6 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ EN8 A01;
    public final /* synthetic */ String A02;

    @Override // X.MR6
    public final void onFailure() {
    }

    @Override // X.MR6
    public final /* synthetic */ void onFailureInBackground(InterfaceC40821up interfaceC40821up) {
    }

    @Override // X.MR6
    public final /* synthetic */ void onStart() {
    }

    @Override // X.MR6
    public final /* synthetic */ void onSuccessInBackground(C2EC c2ec) {
    }

    public C36455G6f(Activity activity, EN8 en8, String str) {
        this.A01 = en8;
        this.A02 = str;
        this.A00 = activity;
    }

    @Override // X.MR6
    public final void onSuccess(C2EC c2ec) {
        EN8 en8 = this.A01;
        String str = this.A02;
        Activity activity = this.A00;
        UserSession A0r = AbstractC166987dD.A0r(en8.A0N);
        String str2 = "inbox";
        switch (en8.A0B.ordinal()) {
            case 0:
                str2 = "reel_viewer_chat_sticker";
                break;
            case 1:
                str2 = "clips_viewer_chat_sticker";
                break;
            case 2:
            case Process.SIGTERM /* 15 */:
                break;
            case 3:
                str2 = "inbox_search";
                break;
            case 4:
                str2 = AbstractC111324zv.A00(2258);
                break;
            case 5:
                str2 = AbstractC111324zv.A00(4301);
                break;
            case 6:
                str2 = AbstractC111324zv.A00(2257);
                break;
            case 7:
            default:
                str2 = "ig_direct_group_invite";
                break;
            case 8:
                str2 = AbstractC111324zv.A00(2990);
                break;
            case 9:
                str2 = AbstractC111324zv.A00(1219);
                break;
            case 10:
                str2 = "via_push_notification";
                break;
            case 11:
                str2 = "channel_link_bottom_sheet";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str2 = "pinned_ssc_on_profile";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str2 = "quick_promotions";
                break;
            case 14:
                str2 = "ssc_list";
                break;
            case 16:
                str2 = "note_chat";
                break;
            case 17:
                str2 = "inbox_channel_invitation";
                break;
        }
        C36881nl A01 = C36881nl.A01(activity, en8, A0r, str2);
        AbstractC31179DnN.A1R(A01, str);
        AbstractC31174DnI.A1P(A01);
        EnumC33373Ep6 enumC33373Ep6 = en8.A0B;
        if (enumC33373Ep6 == EnumC33373Ep6.A03 || enumC33373Ep6 == EnumC33373Ep6.A0C || enumC33373Ep6 == EnumC33373Ep6.A0D || enumC33373Ep6 == EnumC33373Ep6.A06 || enumC33373Ep6 == EnumC33373Ep6.A0F) {
            AbstractC167017dG.A0y(activity, C3DN.A00);
        }
    }
}
