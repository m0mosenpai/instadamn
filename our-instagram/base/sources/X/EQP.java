package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* loaded from: classes6.dex */
public final class EQP extends AbstractC65632xz {
    public EKJ A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-2089916208);
        C34562FKw c34562FKw = (C34562FKw) AbstractC31172DnG.A0x(view);
        FR0 fr0 = (FR0) obj;
        Boolean bool = (Boolean) obj2;
        EKJ ekj = this.A00;
        c34562FKw.A01.setText(fr0.A00);
        TextView textView = c34562FKw.A00;
        textView.setText(2131965052);
        ViewOnClickListenerC35667Fp2.A00(textView, 16, fr0);
        IgdsCheckBox igdsCheckBox = c34562FKw.A02;
        igdsCheckBox.setChecked(bool.booleanValue());
        ViewOnClickListenerC35684FpJ.A00(igdsCheckBox, ekj, fr0, bool, 37);
        C0f9.A0A(-1699334388, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-544403616);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_text_with_link_checkbox);
        viewGroup2.setTag(new C34562FKw(viewGroup2));
        C0f9.A0A(-500243659, A03);
        return viewGroup2;
    }
}
