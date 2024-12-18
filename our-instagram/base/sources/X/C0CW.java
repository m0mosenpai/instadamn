package X;

import java.util.ArrayList;

/* renamed from: X.0CW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CW extends AbstractC04050Jw {
    public final ArrayList A00 = new ArrayList(16);

    public static void A00(C0CW c0cw, Object obj) {
        if (c0cw.A03) {
            c0cw.A00.add(obj);
            return;
        }
        throw new IllegalStateException("Expected object to be mutable");
    }

    @Override // X.AbstractC04050Jw
    public final void A07() {
        this.A00.clear();
    }

    @Override // X.AbstractC04050Jw
    public final void A08() {
        this.A01.A00.EE6(this);
    }

    @Override // X.AbstractC04050Jw
    public final void A09() {
        ArrayList arrayList = this.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof AbstractC04050Jw) {
                ((AbstractC04050Jw) obj).A04();
            }
        }
    }

    @Override // X.AbstractC04050Jw
    public final void A0A(int i) {
        ArrayList arrayList = this.A00;
        int size = arrayList.size() - 32;
        while (true) {
            int i2 = size - 1;
            if (size > 0) {
                arrayList.remove(arrayList.size() - 1);
                size = i2;
            } else {
                arrayList.trimToSize();
                return;
            }
        }
    }

    public final void A0B(AbstractC04050Jw abstractC04050Jw) {
        AbstractC05810Sj.A01(abstractC04050Jw, "subParams cannot be null!");
        if (this.A03) {
            abstractC04050Jw.A03();
            A00(this, abstractC04050Jw);
            abstractC04050Jw.A03();
            abstractC04050Jw.A00 = this;
            return;
        }
        throw new IllegalStateException("Expected object to be mutable");
    }
}
