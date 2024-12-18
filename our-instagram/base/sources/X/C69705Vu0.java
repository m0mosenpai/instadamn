package X;

import java.io.File;

/* renamed from: X.Vu0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69705Vu0 {
    public C69601Vs4 A00;
    public boolean A01;
    public final String A02;
    public final long[] A03;
    public final /* synthetic */ C71182WpU A04;

    public C69705Vu0(C71182WpU c71182WpU, String str) {
        this.A04 = c71182WpU;
        this.A02 = str;
        this.A03 = new long[c71182WpU.A06];
    }

    public final File A00() {
        return new File(this.A04.A07, AnonymousClass001.A0b(this.A02, ".", 0));
    }

    public final File A01() {
        return new File(this.A04.A07, AnonymousClass001.A06(0, this.A02, ".", ".tmp"));
    }
}
