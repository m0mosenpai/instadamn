package X;

/* renamed from: X.0Rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05620Rm implements C0SJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final C05840Sm A06;
    public final InterfaceC07910bB A07;
    public final InterfaceC08250bn A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C05620Rm c05620Rm = (C05620Rm) obj;
            return this.A04 == c05620Rm.A04 && this.A00 == c05620Rm.A00;
        }
        return false;
    }

    @Override // X.C0SJ
    public final Object BYU(int i, int i2) {
        return this.A08.BYT(i);
    }

    @Override // X.C0SJ
    public final boolean CLk(C0SJ c0sj) {
        if (!(c0sj instanceof C05620Rm)) {
            return false;
        }
        C05620Rm c05620Rm = (C05620Rm) c0sj;
        if (!this.A07.equals(c05620Rm.A07) || !this.A08.equals(c05620Rm.A08)) {
            return false;
        }
        return true;
    }

    @Override // X.C0SJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        ThreadLocal threadLocal = this.A06.A00;
        C0XT c0xt = (C0XT) threadLocal.get();
        if (c0xt != null && (i = c0xt.A00) != 0) {
            Object[] objArr = c0xt.A01;
            int i2 = i - 1;
            if (objArr[i2] == this) {
                objArr[i2] = null;
                c0xt.A00 = i2;
                if (i2 == 0 && objArr.length > 64) {
                    threadLocal.set(null);
                }
                InterfaceC06270Us interfaceC06270Us = C06600Wq.A02;
                if (interfaceC06270Us != null) {
                    interfaceC06270Us.D9M(this);
                }
            }
        }
    }

    @Override // X.C0SJ
    public final String getTag() {
        return this.A09;
    }

    @Override // X.C0SJ
    public final int getType() {
        return this.A03;
    }

    public final int hashCode() {
        long j = this.A04;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A00;
    }

    public C05620Rm(C05840Sm c05840Sm, InterfaceC07910bB interfaceC07910bB, InterfaceC08250bn interfaceC08250bn, String str, int i, int i2, int i3, int i4, long j, long j2) {
        this.A09 = str;
        this.A05 = j;
        this.A02 = i;
        this.A04 = j2;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = interfaceC07910bB;
        this.A08 = interfaceC08250bn;
        this.A03 = i4;
        this.A06 = c05840Sm;
    }

    @Override // X.C0SJ
    public final long BP6(long j, int i, int i2) {
        return this.A08.BP1(131073, 79L);
    }
}
