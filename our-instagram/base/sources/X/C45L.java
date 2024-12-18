package X;

import java.io.Serializable;

/* renamed from: X.45L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45L implements C45M, Serializable {
    public static final C45L A05;
    public static final C45L A06;
    public final C45N A00;
    public final C45N A01;
    public final C45N A02;
    public final C45N A03;
    public final C45N A04;

    static {
        C45N c45n = C45N.PUBLIC_ONLY;
        C45N c45n2 = C45N.ANY;
        A06 = new C45L(c45n, c45n, c45n2, c45n2, c45n);
        A05 = new C45L(c45n, c45n, c45n, c45n, c45n);
    }

    public final String toString() {
        return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this.A02, this.A03, this.A04, this.A00, this.A01);
    }

    public C45L(C45N c45n) {
        this.A02 = c45n;
        this.A03 = c45n;
        this.A04 = c45n;
        this.A00 = c45n;
        this.A01 = c45n;
    }

    public C45L(C45N c45n, C45N c45n2, C45N c45n3, C45N c45n4, C45N c45n5) {
        this.A02 = c45n;
        this.A03 = c45n2;
        this.A04 = c45n3;
        this.A00 = c45n4;
        this.A01 = c45n5;
    }
}
