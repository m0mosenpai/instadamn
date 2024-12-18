package X;

/* loaded from: classes6.dex */
public final class E9B extends C0T6 implements InterfaceC37093GWc {
    public final AbstractC33547EsL A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E9B) && C14360o3.A0K(this.A00, ((E9B) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final E70 A00() {
        AbstractC33547EsL abstractC33547EsL = this.A00;
        if (abstractC33547EsL instanceof C32883EdQ) {
            return ((C32883EdQ) abstractC33547EsL).A00;
        }
        return null;
    }

    public final boolean A01() {
        AbstractC33547EsL abstractC33547EsL = this.A00;
        if (!(abstractC33547EsL instanceof C32883EdQ) && !(abstractC33547EsL instanceof C32882EdP)) {
            return false;
        }
        return true;
    }

    public E9B(AbstractC33547EsL abstractC33547EsL) {
        this.A00 = abstractC33547EsL;
    }
}
