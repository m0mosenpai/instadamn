package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.HashMap;

/* renamed from: X.FnS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35575FnS implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass740 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public ViewOnClickListenerC35575FnS(AnonymousClass740 anonymousClass740, String str, boolean z) {
        this.A00 = anonymousClass740;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-2045872540);
        AnonymousClass740 anonymousClass740 = this.A00;
        String A0t = AbstractC25231BEo.A0t(anonymousClass740.A08.A0O.A0J);
        if (this.A02) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "CREATOR_PROFILE_MESSAGING");
            String A00 = MSV.A00(1096);
            if (A0t == null) {
                A0t = "";
            }
            A1G.put(A00, A0t);
            AbstractC192798gL A052 = C192108fB.A05(anonymousClass740.A05, MSV.A00(411), A1G);
            C32392EOt.A00(A052, anonymousClass740, 9);
            C1GJ.A03(A052);
        } else {
            UserSession userSession = anonymousClass740.A05;
            UserDetailFragment userDetailFragment = anonymousClass740.A07;
            AbstractC34138F4o.A00(userDetailFragment, anonymousClass740.A02, userDetailFragment, userSession, A0t, this.A01);
        }
        C0f9.A0C(1693691607, A05);
    }
}
