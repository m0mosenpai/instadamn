package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EQW extends AbstractC65632xz {
    public final EQ3 A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public EQW(EQ3 eq3) {
        this.A00 = eq3;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1438633347);
        FII fii = (FII) AbstractC31172DnG.A0x(view);
        FKE fke = (FKE) obj;
        EQ3 eq3 = this.A00;
        fii.A01.setText(fke.A01);
        ViewOnClickListenerC35683FpI.A00(fii.A00, 17, eq3, fke);
        C0f9.A0A(1760544426, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-692580878);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_service_partner);
        A0A.setTag(new FII(A0A));
        C0f9.A0A(2036491207, A03);
        return A0A;
    }
}
