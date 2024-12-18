package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ER0 extends AbstractC65632xz {
    public final ELI A00;
    public final InterfaceC11380iw A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ER0(ELI eli, InterfaceC11380iw interfaceC11380iw) {
        this.A01 = interfaceC11380iw;
        this.A00 = eli;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1368348544);
        FK6 fk6 = (FK6) AbstractC31172DnG.A0x(view);
        FID fid = (FID) obj;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        ELI eli = this.A00;
        User user = fid.A01;
        CircularImageView circularImageView = fk6.A01;
        AbstractC34728FRr.A01(circularImageView.getContext(), interfaceC11380iw, circularImageView, user);
        AbstractC31173DnH.A1F(fk6.A00, user);
        C57012jc c57012jc = fk6.A02;
        c57012jc.A01().setBackgroundDrawable(C3LQ.A07(view.getContext(), R.color.badge_color));
        ((CompoundButton) c57012jc.A01()).setChecked(fid.A00);
        ViewOnClickListenerC35683FpI.A00(view, 0, fid, eli);
        C0f9.A0A(255625654, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(2041397109);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_account_linking_child_account_for_selection);
        viewGroup2.setTag(new FK6(viewGroup2));
        C0f9.A0A(-974288455, A03);
        return viewGroup2;
    }
}
