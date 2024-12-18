package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class ERS extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final ENY A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1271801098);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        FLT flt = (FLT) obj;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.user.userlist.adapter.MutualFollowListSeeMoreViewBinder.Holder");
        FMY fmy = (FMY) tag;
        List list = flt.A02;
        int i2 = flt.A00;
        int i3 = flt.A01;
        ENY eny = this.A01;
        C14360o3.A0B(interfaceC11380iw, 0);
        AbstractC167007dF.A1G(fmy, 1, eny);
        if (list.size() >= A06) {
            GradientSpinnerAvatarView gradientSpinnerAvatarView = fmy.A03;
            gradientSpinnerAvatarView.A0G(null, interfaceC11380iw, AbstractC31177DnL.A0T(list, 0), AbstractC31177DnL.A0T(list, 1));
            gradientSpinnerAvatarView.setGradientColorRes(R.style.MutualFollowRowGradientPatternStyle);
            TextView textView = fmy.A01;
            textView.setText(AbstractC166997dE.A0r(textView.getResources(), Integer.valueOf(i2), 2131966900));
            ArrayList A1E = AbstractC166987dD.A1E();
            int min = Math.min(list.size(), i3);
            for (int i4 = 0; i4 < min; i4++) {
                A1E.add(AbstractC31176DnK.A0t(list, i4));
            }
            fmy.A02.setText(new C71473Il(", ").A02(A1E));
            ViewOnClickListenerC35682FpH.A01(fmy.A00, 34, eny);
            C0f9.A0A(57388412, A03);
            return;
        }
        throw AbstractC166987dD.A14("Can't bind a follow list with less than 2 users.");
    }

    public ERS(InterfaceC11380iw interfaceC11380iw, ENY eny) {
        this.A00 = interfaceC11380iw;
        this.A01 = eny;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -961292719);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.mutual_follow_list_row, false);
        A0C.setTag(new FMY(A0C));
        C0f9.A0A(1025302444, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
