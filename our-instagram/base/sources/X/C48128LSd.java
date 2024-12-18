package X;

import android.view.View;

/* renamed from: X.LSd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48128LSd implements InterfaceC50418MNu {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48128LSd(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC50418MNu
    public final /* bridge */ /* synthetic */ void DGw(Object obj) {
        switch (this.A00) {
            case 0:
                C161167Kb c161167Kb = (C161167Kb) this.A02;
                String str = C161167Kb.A09;
                c161167Kb.A04.execute(new RunnableC49979M4u((AbstractC56582ir) obj, (EnumC53112NeP) this.A01, c161167Kb));
                return;
            case 1:
                KBP kbp = (KBP) this.A02;
                KBP.A00((View) this.A01, (C51755Mte) obj, kbp);
                return;
            default:
                Object obj2 = this.A02;
                InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                AbstractC47902LDw.A01.put(obj2, obj);
                interfaceC23621Ds.resumeWith(obj);
                return;
        }
    }
}
