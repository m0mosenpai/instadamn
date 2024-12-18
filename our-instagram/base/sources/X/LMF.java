package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LMF implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public LMF(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C145356gu c145356gu;
        String str;
        boolean z;
        String str2;
        FragmentActivity activity;
        switch (this.A00) {
            case 0:
                VRC.A00((UserSession) this.A01).A08("promotion_list", "view_appeal_dialog_dismiss", this.A02, null);
                return;
            case 1:
                c145356gu = (C145356gu) this.A01;
                str = this.A02;
                z = true;
                break;
            case 2:
                c145356gu = (C145356gu) this.A01;
                str = this.A02;
                z = false;
                break;
            default:
                UserSession userSession = ((C145356gu) this.A01).A01;
                if (userSession == null) {
                    AbstractC31171DnF.A0y();
                    throw C00O.createAndThrow();
                }
                LJH.A03(userSession, "ig_stories_consumption_avatar_qr", "not_now_cta_button", this.A02);
                return;
        }
        UserSession userSession2 = c145356gu.A01;
        if (userSession2 != null) {
            if (z) {
                str2 = "instant_avatars_cta_button";
            } else {
                str2 = "create_from_scratch_cta_button";
            }
            LJH.A03(userSession2, "ig_stories_consumption_avatar_qr", str2, str);
            Fragment fragment = (Fragment) c145356gu.A0H.get();
            if (fragment != null && (activity = fragment.getActivity()) != null) {
                JZ8 jz8 = AbstractC47193KtS.A01;
                UserSession userSession3 = c145356gu.A01;
                if (userSession3 != null) {
                    jz8.A03(activity, null, userSession3, "ig_stories_creation", "ig_stories_creation_avatar_cta_dialog", null, str, null, null, false, z);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }
}
