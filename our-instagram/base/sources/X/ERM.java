package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.selectableview.SingleSelectableAvatar;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ERM extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final EQ5 A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERM(InterfaceC11380iw interfaceC11380iw, EQ5 eq5) {
        this.A00 = interfaceC11380iw;
        this.A01 = eq5;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1969686892);
        FN5 fn5 = (FN5) AbstractC31172DnG.A0x(view);
        C34516FJc c34516FJc = (C34516FJc) obj;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        EQ5 eq5 = this.A01;
        CheckBox checkBox = fn5.A01;
        AbstractC31173DnH.A0z(checkBox.getContext(), checkBox, R.drawable.checkbox_selector);
        SingleSelectableAvatar singleSelectableAvatar = fn5.A04;
        User user = c34516FJc.A01;
        singleSelectableAvatar.setUrl(user.Bhu(), interfaceC11380iw);
        TextView textView = fn5.A03;
        C85963sQ.A0B(textView, user.isVerified());
        AbstractC31173DnH.A1F(textView, user);
        fn5.A02.setText(user.getFullName());
        checkBox.setChecked(c34516FJc.A00);
        C0fQ.A00(new ViewOnClickListenerC48068LPt(36, eq5, fn5, c34516FJc), fn5.A00);
        C0f9.A0A(57240168, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1783126738);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_reel_viewer_user);
        A0A.setTag(new FN5(A0A));
        C0f9.A0A(-1650217492, A03);
        return A0A;
    }
}
