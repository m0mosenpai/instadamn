package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ERC extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final EIW A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERC(InterfaceC11380iw interfaceC11380iw, EIW eiw) {
        this.A00 = interfaceC11380iw;
        this.A01 = eiw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(782356875);
        C34560FKu c34560FKu = (C34560FKu) AbstractC31172DnG.A0x(view);
        FJK fjk = (FJK) obj;
        EIW eiw = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        User user = fjk.A01;
        CircularImageView circularImageView = c34560FKu.A01;
        ImageUrl Bhu = user.Bhu();
        AbstractC167017dG.A1O(circularImageView, interfaceC11380iw);
        circularImageView.setUrl(Bhu, interfaceC11380iw);
        AbstractC31173DnH.A1F(c34560FKu.A00, user);
        IgdsCheckBox igdsCheckBox = c34560FKu.A02;
        igdsCheckBox.setBackgroundDrawable(C3LQ.A07(view.getContext(), R.color.badge_color));
        igdsCheckBox.setChecked(fjk.A00);
        ViewOnClickListenerC31591DuJ.A00(view, 55, eiw, fjk);
        C0f9.A0A(-1445431143, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1219787994);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_follow_from_other_accounts);
        viewGroup2.setTag(new C34560FKu(viewGroup2));
        C0f9.A0A(-1577359078, A03);
        return viewGroup2;
    }
}
