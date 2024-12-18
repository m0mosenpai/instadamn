package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1rA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38781rA extends C0T6 implements InterfaceC38791rB {
    public final Integer A00;
    public final Integer A01;

    @Override // X.InterfaceC38791rB
    public final C38781rA ErW() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38781rA) {
                C38781rA c38781rA = (C38781rA) obj;
                if (!C14360o3.A0K(this.A00, c38781rA.A00) || !C14360o3.A0K(this.A01, c38781rA.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A01;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.InterfaceC38791rB
    public final Integer BZI() {
        return this.A00;
    }

    @Override // X.InterfaceC38791rB
    public final Integer BZK() {
        return this.A01;
    }

    @Override // X.InterfaceC38791rB
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCOPRenderingOutput", AbstractC39792Hl2.A00(this));
    }

    public C38781rA(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
