package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ERL extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final C31721DwQ A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERL(InterfaceC11380iw interfaceC11380iw, C31721DwQ c31721DwQ) {
        this.A00 = interfaceC11380iw;
        this.A01 = c31721DwQ;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 306631248);
        C14360o3.A0B(obj, 2);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.edit.adapter.FeaturedAccountsRowViewBinder.Holder");
        FL4 fl4 = (FL4) tag;
        FJW fjw = (FJW) obj;
        C31721DwQ c31721DwQ = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        boolean A1Y = AbstractC25229BEm.A1Y(fl4);
        AbstractC25233BEq.A0w(2, fjw, c31721DwQ, interfaceC11380iw);
        User user = fjw.A01;
        ImageUrl Bhu = user.Bhu();
        CircularImageView circularImageView = fl4.A01;
        C14360o3.A0B(circularImageView, A1Y ? 1 : 0);
        circularImageView.setUrl(Bhu, interfaceC11380iw);
        AbstractC31173DnH.A1F(fl4.A00, user);
        IgdsSwitch igdsSwitch = fl4.A02;
        igdsSwitch.setCheckedAnimated(fjw.A00);
        igdsSwitch.setClickable(A1Y);
        ViewOnClickListenerC35687FpM.A00(view, 14, c31721DwQ, user);
        C0f9.A0A(668191954, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 976694697);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_featured_accounts, false);
        viewGroup2.setTag(new FL4(viewGroup2));
        C0f9.A0A(319688547, A0G);
        return viewGroup2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
