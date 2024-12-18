package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.ERq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32464ERq extends AbstractC65632xz {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final InterfaceC37204GaF A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-467235598);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        if (tag != null) {
            InterfaceC37204GaF interfaceC37204GaF = this.A02;
            boolean z = this.A04;
            boolean z2 = this.A03;
            boolean z3 = this.A00;
            FY8.A01(view.getContext(), this.A01, interfaceC37204GaF, (C31953E2h) tag, (FNI) obj, z, z2, z3);
            C0f9.A0A(-1015584410, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(210962906, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32464ERq(InterfaceC11380iw interfaceC11380iw, InterfaceC37204GaF interfaceC37204GaF, boolean z, boolean z2) {
        this.A02 = interfaceC37204GaF;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1533217654);
        View A00 = FY8.A00(viewGroup);
        C0f9.A0A(-2094308655, A0G);
        return A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
