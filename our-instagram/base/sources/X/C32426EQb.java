package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.EQb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32426EQb extends AbstractC65632xz {
    public final EKJ A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32426EQb(EKJ ekj) {
        this.A00 = ekj;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-711131155);
        FJO fjo = (FJO) AbstractC31172DnG.A0x(view);
        Boolean bool = (Boolean) obj2;
        EKJ ekj = this.A00;
        fjo.A00.setText((String) obj);
        IgdsCheckBox igdsCheckBox = fjo.A01;
        igdsCheckBox.setChecked(bool.booleanValue());
        ViewOnClickListenerC31591DuJ.A00(igdsCheckBox, 65, bool, ekj);
        C0f9.A0A(-783457709, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1140171822);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_text_with_checkbox);
        viewGroup2.setTag(new FJO(viewGroup2));
        C0f9.A0A(-2016491290, A03);
        return viewGroup2;
    }
}
