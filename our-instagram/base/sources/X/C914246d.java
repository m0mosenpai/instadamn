package X;

import java.io.Serializable;

/* renamed from: X.46d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C914246d implements Serializable {
    public static final C46e[] A03 = new C46e[0];
    public static final C46f[] A04 = new C46f[0];
    public final C46e[] A00;
    public final C46e[] A01;
    public final C46f[] A02;

    public C914246d(C46e[] c46eArr, C46e[] c46eArr2, C46f[] c46fArr) {
        this.A01 = c46eArr == null ? A03 : c46eArr;
        this.A00 = c46eArr2 == null ? A03 : c46eArr2;
        this.A02 = c46fArr == null ? A04 : c46fArr;
    }

    public C914246d() {
        this(null, null, null);
    }
}
