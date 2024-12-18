package X;

/* loaded from: classes10.dex */
public final class R9l extends R9q {
    @Override // X.AbstractC63035SbA
    public final Object A0E(AnonymousClass469 anonymousClass469, Object[] objArr) {
        C16D c16d;
        long A0N;
        long A0N2;
        int A0H;
        int A0H2;
        Object obj = objArr[0];
        if (obj instanceof C16D) {
            c16d = (C16D) obj;
        } else {
            c16d = new C16D(false, obj);
        }
        Object obj2 = objArr[1];
        if (obj2 == null) {
            A0N = 0;
        } else {
            A0N = AbstractC166987dD.A0N(obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 == null) {
            A0N2 = 0;
        } else {
            A0N2 = AbstractC166987dD.A0N(obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 == null) {
            A0H = 0;
        } else {
            A0H = AbstractC166987dD.A0H(obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 == null) {
            A0H2 = 0;
        } else {
            A0H2 = AbstractC166987dD.A0H(obj5);
        }
        return new TID(c16d, A0H, A0H2, A0N, A0N2);
    }

    public R9l() {
        super(TID.class);
    }

    public static R9k A00(AbstractC910944l abstractC910944l, String str, int i) {
        return new R9k(null, abstractC910944l, TIH.A08, C913945y.A00(str), null, null, null, i);
    }
}
