package X;

/* renamed from: X.RBt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60602RBt extends AbstractC1122454w {
    public final Object A00;

    @Override // X.AbstractC911344p
    public final int A03(int i) {
        Object obj = this.A00;
        if (obj instanceof Number) {
            return AbstractC166987dD.A0H(obj);
        }
        return 0;
    }

    @Override // X.AbstractC911344p
    public final String A07() {
        Object obj = this.A00;
        if (obj == null) {
            return "null";
        }
        return obj.toString();
    }

    @Override // X.AbstractC1122454w
    public final C16R A0C() {
        return C16R.A0E;
    }

    @Override // X.C54u, X.InterfaceC911544r
    public final void EOr(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m) {
        Object obj = this.A00;
        if (obj == null) {
            abstractC913345m.A0T(anonymousClass182);
        } else if (obj instanceof InterfaceC911544r) {
            ((InterfaceC911544r) obj).EOr(anonymousClass182, abstractC913345m);
        } else {
            abstractC913345m.A0J(null, obj.getClass(), true).A0A(anonymousClass182, abstractC913345m, obj);
        }
    }

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C60602RBt)) {
            return false;
        }
        Object obj2 = this.A00;
        Object obj3 = ((C60602RBt) obj).A00;
        if (obj2 == null) {
            return AbstractC25229BEm.A1Z(obj3);
        }
        return obj2.equals(obj3);
    }

    @Override // X.C54u
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C60602RBt(Object obj) {
        this.A00 = obj;
    }
}
