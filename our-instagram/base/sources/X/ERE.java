package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ERE extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final C32280EJr A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7b(0, obj, obj2);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERE(InterfaceC11380iw interfaceC11380iw, C32280EJr c32280EJr) {
        this.A00 = interfaceC11380iw;
        this.A01 = c32280EJr;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        LinearLayout linearLayout;
        int i2;
        int A03 = C0f9.A03(1035765544);
        C34613FMw c34613FMw = (C34613FMw) AbstractC31172DnG.A0x(view);
        User user = (User) obj;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C32280EJr c32280EJr = this.A01;
        c34613FMw.A03.setUrl(user.Bhu(), interfaceC11380iw);
        AbstractC31173DnH.A1F(c34613FMw.A02, user);
        c34613FMw.A01.setText(user.A0Q());
        int ordinal = ((EnumC33339EoY) obj2).ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal == 2) {
                    IgdsCheckBox igdsCheckBox = c34613FMw.A04;
                    igdsCheckBox.setChecked(true);
                    igdsCheckBox.setEnabled(false);
                    c34613FMw.A00.setOnClickListener(null);
                }
                C0f9.A0A(289050270, A03);
            }
            IgdsCheckBox igdsCheckBox2 = c34613FMw.A04;
            igdsCheckBox2.setChecked(false);
            igdsCheckBox2.setEnabled(true);
            linearLayout = c34613FMw.A00;
            i2 = 60;
        } else {
            IgdsCheckBox igdsCheckBox3 = c34613FMw.A04;
            igdsCheckBox3.setChecked(true);
            igdsCheckBox3.setEnabled(true);
            linearLayout = c34613FMw.A00;
            i2 = 59;
        }
        C0fQ.A00(new ViewOnClickListenerC31591DuJ(c32280EJr, user, i2), linearLayout);
        C0f9.A0A(289050270, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1072609808);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_account_recovery_user_redesign);
        viewGroup2.setTag(new C34613FMw(viewGroup2));
        C0f9.A0A(80410062, A03);
        return viewGroup2;
    }
}
