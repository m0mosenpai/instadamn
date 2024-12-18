package X;

/* renamed from: X.Alv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24059Alv implements InterfaceC1810781j {
    public final /* synthetic */ C81Z A00;

    public C24059Alv(C81Z c81z) {
        this.A00 = c81z;
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        if (obj2 == EnumC1810181d.A11) {
            boolean z = obj3 instanceof C8WK;
            C81Z c81z = this.A00;
            if (z) {
                ((C1809981b) c81z.A1e).A01.A02.remove(this);
                c81z.A0l.A02();
            } else {
                c81z.A1e.E4u(C8WI.A00);
            }
        }
    }
}
