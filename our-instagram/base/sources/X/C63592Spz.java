package X;

/* renamed from: X.Spz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63592Spz implements C02Q {
    public int A00;
    public final Object[] A01 = new Object[1024];

    public final synchronized void A00() {
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            this.A01[i2] = null;
        }
        this.A00 = 0;
    }

    @Override // X.C02Q
    public final synchronized Object A7H() {
        int i = this.A00;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        this.A00 = i2;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        C14360o3.A0C(obj, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        objArr[i2] = null;
        return obj;
    }

    @Override // X.C02Q
    public final synchronized boolean EE6(Object obj) {
        boolean z;
        z = false;
        C14360o3.A0B(obj, 0);
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i != 1024) {
            objArr[i] = obj;
            z = true;
            this.A00 = i + 1;
        }
        return z;
    }
}
