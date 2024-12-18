package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.HEw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38994HEw extends AbstractC65632xz {
    public final C62862tP A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C38994HEw(C62862tP c62862tP) {
        this.A00 = c62862tP;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1337068595);
        AbstractC167017dG.A1P(view, obj);
        IIB iib = (IIB) view.getTag();
        ISA.A01(this.A00, (C1338462s) obj, iib);
        C0f9.A0A(298257543, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 949605069);
        FrameLayout A00 = ISA.A00(AbstractC166997dE.A0L(viewGroup), viewGroup);
        C0f9.A0A(-100001234, A0G);
        return A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
