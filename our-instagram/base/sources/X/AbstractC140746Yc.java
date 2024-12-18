package X;

import java.util.List;

/* renamed from: X.6Yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140746Yc extends AbstractC672431p {
    @Override // X.AbstractC672431p
    public final C1PZ A07(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC672431p
    public C1PZ A08(List list) {
        C1PZ A08 = super.A08(list);
        A08.A01 = this.A0D.size();
        A08.A04 = this.A0E.size();
        return A08;
    }

    @Override // X.AbstractC672431p
    public final void A0D(int i, Object obj, Object obj2) {
        super.A0D(i, obj, obj2);
        this.A05.BuQ().A03(this.A0D.size() + this.A03, this.A0E.size(), i);
    }

    @Override // X.AbstractC672431p
    public void A0G(C1PZ c1pz, int i, int i2, int i3, int i4) {
        super.A0G(c1pz, i, i2, i3, i4);
        c1pz.A01 = this.A0D.size();
        c1pz.A04 = this.A0E.size();
    }
}
