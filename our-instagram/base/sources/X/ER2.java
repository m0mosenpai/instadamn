package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ER2 extends AbstractC65632xz {
    public final C32373ENz A00;
    public final InterfaceC11380iw A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ER2(C32373ENz c32373ENz, InterfaceC11380iw interfaceC11380iw) {
        this.A01 = interfaceC11380iw;
        this.A00 = c32373ENz;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1139565827);
        C34572FLh c34572FLh = (C34572FLh) AbstractC31172DnG.A0x(view);
        User user = (User) obj;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C32373ENz c32373ENz = this.A00;
        if (AbstractC13620mo.A02(view.getContext())) {
            view.setLayoutDirection(1);
        }
        CircularImageView circularImageView = c34572FLh.A03;
        AbstractC34728FRr.A01(circularImageView.getContext(), interfaceC11380iw, circularImageView, user);
        AbstractC31173DnH.A1F(c34572FLh.A02, user);
        ViewOnClickListenerC35684FpJ.A00(c34572FLh.A00, c32373ENz, user, c34572FLh, 0);
        C0f9.A0A(-1982366828, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(166901295);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_account_linking_main_account_for_manage);
        viewGroup2.setTag(new C34572FLh(viewGroup2));
        C0f9.A0A(1806618589, A03);
        return viewGroup2;
    }
}
