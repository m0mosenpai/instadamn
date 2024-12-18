package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.api.schemas.AudienceListIntf;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.FcM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35049FcM {
    public static final void A00(Activity activity, AudienceListIntf audienceListIntf, UserSession userSession) {
        String str;
        String str2;
        boolean z = false;
        if (audienceListIntf != null) {
            if (audienceListIntf.CSR()) {
                A01(activity, EnumC33409Epg.AUDIENCE_LISTS_LIST, userSession, false, false);
                return;
            } else {
                str2 = audienceListIntf.BNl();
                str = audienceListIntf.getName();
                z = audienceListIntf.CXV();
            }
        } else {
            str = null;
            str2 = null;
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("audience_list_id", str2);
        if (z) {
            A0b.putString("audience_list_name", str);
        }
        A0b.putBoolean("is_bottomsheet", false);
        A0b.putBoolean("delete_enabled", false);
        AbstractC31177DnL.A0n(activity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(1953));
    }

    public static final void A02(AudienceListIntf audienceListIntf, AbstractC59962oe abstractC59962oe, UserSession userSession, int i, boolean z) {
        String str;
        String str2;
        boolean z2;
        Bundle A0b;
        Class<ModalActivity> cls;
        Activity rootActivity;
        int i2;
        C14360o3.A0B(userSession, 0);
        if (audienceListIntf != null) {
            if (audienceListIntf.CSR()) {
                A0b = AbstractC61636Rr0.A00(AbstractC167007dF.A1b(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, EnumC33409Epg.AUDIENCE_LISTS_LIST, AbstractC166987dD.A1L(AbstractC111324zv.A00(258), "not_eligible"), AbstractC166987dD.A1L("private_story_share_to_fb", false)));
                if (i == 58548288) {
                    i = 1000;
                }
                cls = ModalActivity.class;
                rootActivity = abstractC59962oe.getRootActivity();
                i2 = 39;
                AbstractC31173DnH.A0Z(rootActivity, A0b, userSession, cls, AbstractC111324zv.A00(i2)).A0D(abstractC59962oe, i);
            }
            str2 = audienceListIntf.BNl();
            str = audienceListIntf.getName();
            z2 = audienceListIntf.CXV();
        } else {
            str = null;
            str2 = null;
            z2 = false;
        }
        A0b = AbstractC166987dD.A0b();
        A0b.putString("audience_list_id", str2);
        if (z2) {
            A0b.putString("audience_list_name", str);
        }
        A0b.putBoolean("is_bottomsheet", false);
        A0b.putBoolean("delete_enabled", z);
        cls = ModalActivity.class;
        rootActivity = abstractC59962oe.getRootActivity();
        i2 = 1953;
        AbstractC31173DnH.A0Z(rootActivity, A0b, userSession, cls, AbstractC111324zv.A00(i2)).A0D(abstractC59962oe, i);
    }

    public static final void A01(Activity activity, EnumC33409Epg enumC33409Epg, UserSession userSession, boolean z, boolean z2) {
        String str;
        Bundle A0b = AbstractC166987dD.A0b();
        if (z) {
            str = "eligible_to_see";
        } else {
            str = "not_eligible";
        }
        A0b.putString(AbstractC111324zv.A00(258), str);
        A0b.putBoolean("private_story_share_to_fb", z2);
        A0b.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33409Epg);
        AbstractC31177DnL.A0n(activity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(39));
    }
}
