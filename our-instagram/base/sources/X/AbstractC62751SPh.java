package X;

/* renamed from: X.SPh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62751SPh {
    public int A00;
    public SGA A01;
    public SGA A02;
    public Object A03;

    public final Object A00() {
        SGA sga = this.A02;
        if (sga != null) {
            this.A03 = sga.A02;
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        Object obj = this.A03;
        if (obj == null) {
            return A01(12);
        }
        return obj;
    }

    public final Object A01(int i) {
        if (this instanceof RDJ) {
            return new short[i];
        }
        if (this instanceof RDI) {
            return new long[i];
        }
        if (this instanceof RDH) {
            return new int[i];
        }
        if (this instanceof RDG) {
            return new float[i];
        }
        if (this instanceof RDF) {
            return new double[i];
        }
        if (this instanceof RDE) {
            return new byte[i];
        }
        return new boolean[i];
    }

    public final Object A02(Object obj, int i) {
        SGA sga = new SGA(obj, i);
        if (this.A01 == null) {
            this.A02 = sga;
            this.A01 = sga;
        } else {
            SGA sga2 = this.A02;
            if (sga2.A00 == null) {
                sga2.A00 = sga;
                this.A02 = sga;
            } else {
                throw AbstractC58318PtA.A0Z();
            }
        }
        this.A00 += i;
        int i2 = i + i;
        if (i >= 16384) {
            i2 = (i >> 2) + i;
        }
        return A01(i2);
    }

    public final Object A03(Object obj, int i) {
        int i2 = this.A00 + i;
        Object A01 = A01(i2);
        int i3 = 0;
        for (SGA sga = this.A01; sga != null; sga = sga.A00) {
            Object obj2 = sga.A02;
            int i4 = sga.A01;
            System.arraycopy(obj2, 0, A01, i3, i4);
            i3 += i4;
        }
        System.arraycopy(obj, 0, A01, i3, i);
        int i5 = i3 + i;
        if (i5 == i2) {
            return A01;
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A02(i2, i5, "Should have gotten ", " entries, got "));
    }
}
