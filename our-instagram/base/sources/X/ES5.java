package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class ES5 extends AbstractC65632xz {
    public final int A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "Header";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return i;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ES5(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, -948243707);
        this.A01.invoke(view);
        C0f9.A0A(1988235742, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -2118928333);
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (i == 0) {
            View A0A = AbstractC31172DnG.A0A(A0P, viewGroup, this.A00);
            C14360o3.A0A(A0A);
            C0f9.A0A(877700257, A0G);
            return A0A;
        }
        IllegalArgumentException A0n = AbstractC25230BEn.A0n(AbstractC111324zv.A00(645), i);
        C0f9.A0A(-1470697648, A0G);
        throw A0n;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
