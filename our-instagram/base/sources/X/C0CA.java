package X;

import java.util.ArrayList;

/* renamed from: X.0CA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CA extends AbstractC04050Jw {
    public int A00;
    public final ArrayList A01 = new ArrayList(32);

    @Override // X.AbstractC04050Jw
    public final void A09() {
        for (int i = 0; i < this.A00; i++) {
            Object A0C = A0C(i);
            if (A0C instanceof AbstractC04050Jw) {
                ((AbstractC04050Jw) A0C).A04();
            }
        }
    }

    private void A01(String str) {
        if (this.A03) {
            if (str != null && !str.isEmpty()) {
                return;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0R("key=", str));
            }
        }
        throw new IllegalStateException("Expected object to be mutable");
    }

    @Override // X.AbstractC04050Jw
    public final void A07() {
        this.A01.clear();
        this.A00 = 0;
    }

    @Override // X.AbstractC04050Jw
    public final void A08() {
        super.A01.A01.EE6(this);
    }

    @Override // X.AbstractC04050Jw
    public final void A0A(int i) {
        int i2 = this.A00 - 32;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                ArrayList arrayList = this.A01;
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                i2 = i3;
            } else {
                this.A01.trimToSize();
                return;
            }
        }
    }

    public final C0CA A0B(String str) {
        C0CA A02 = super.A01.A02();
        A0E(A02, str);
        return A02;
    }

    public final Object A0C(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A01.get((i * 2) + 1);
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final String A0D(int i) {
        if (i >= 0 && i < this.A00) {
            return (String) this.A01.get(i * 2);
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public static void A00(C0CA c0ca, Object obj, String str) {
        c0ca.A01(str);
        ArrayList arrayList = c0ca.A01;
        arrayList.add(str);
        arrayList.add(obj);
        c0ca.A00++;
    }

    public final void A0E(AbstractC04050Jw abstractC04050Jw, String str) {
        AbstractC05810Sj.A01(abstractC04050Jw, "subParams cannot be null!");
        A01(str);
        abstractC04050Jw.A03();
        A00(this, abstractC04050Jw, str);
        abstractC04050Jw.A03();
        abstractC04050Jw.A00 = this;
    }
}
