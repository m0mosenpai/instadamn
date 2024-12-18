package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.G8j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36511G8j implements InterfaceC58152PqH {
    public final /* synthetic */ AnonymousClass740 A00;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36511G8j(AnonymousClass740 anonymousClass740) {
        this.A00 = anonymousClass740;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        AnonymousClass740 anonymousClass740 = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(anonymousClass740.A04, "unfollow_reciprocal_toast_tap");
        A0f.AAP("target_id", AbstractC25231BEo.A0t(anonymousClass740.A09.A03));
        A0f.Cht();
        UserDetailFragment userDetailFragment = anonymousClass740.A07;
        Context context = userDetailFragment.getContext();
        MUB mub = userDetailFragment.A10;
        User user = mub.A03;
        if (context != null && user != null) {
            String A0f2 = AbstractC167007dF.A0f(context, mub.A03(), 2131972217);
            FHF fhf = userDetailFragment.A0w;
            if (fhf == null) {
                fhf = new FHF(userDetailFragment.A0I);
                userDetailFragment.A0w = fhf;
            }
            String A02 = userDetailFragment.A10.A02();
            C14360o3.A0B(A02, 0);
            InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(fhf.A00, "remove_follower_dialog_impression");
            A0f3.AAP("target_id", A02);
            A0f3.Cht();
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131972218);
            A0I.A0r(A0f2);
            A0I.A0o(user.Bhu(), userDetailFragment);
            DialogInterfaceOnClickListenerC35455FkC.A01(A0I, userDetailFragment, user, 51, 2131972214);
            DialogInterfaceOnClickListenerC35454FkB.A01(A0I, userDetailFragment, 46);
            Dialog A022 = A0I.A02();
            userDetailFragment.mRemoveFollowerDialog = A022;
            C0fJ.A00(A022);
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        AnonymousClass740 anonymousClass740 = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(anonymousClass740.A04, "unfollow_reciprocal_toast_impression");
        A0f.AAP("target_id", AbstractC25231BEo.A0t(anonymousClass740.A09.A03));
        A0f.Cht();
    }
}
