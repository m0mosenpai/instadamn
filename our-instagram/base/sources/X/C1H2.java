package X;

import java.io.File;

/* renamed from: X.1H2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1H2 {
    public C107954te A00;
    public boolean A01;
    public long A02;
    public AbstractC71443Ii A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final File A07;

    public C1H2(File file, String str) {
        C14360o3.A0B(file, 1);
        C14360o3.A0B(str, 2);
        this.A07 = file;
        this.A06 = str;
    }

    public final synchronized long A00() {
        return this.A02;
    }

    public final synchronized AbstractC71443Ii A01() {
        return this.A03;
    }

    public final synchronized void A05(long j, boolean z) {
        this.A02 = j;
        this.A03 = null;
        this.A05 = true;
        this.A04 = z;
    }

    public final synchronized void A06(AbstractC71443Ii abstractC71443Ii) {
        this.A03 = abstractC71443Ii;
    }

    public final synchronized void A07(C107954te c107954te, boolean z) {
        this.A00 = c107954te;
        this.A01 = z;
    }

    public final synchronized boolean A08() {
        return this.A04;
    }

    public final synchronized boolean A09() {
        return this.A05;
    }

    public final File A02() {
        return new File(this.A07, AnonymousClass001.A0R(this.A06, ".clean"));
    }

    public final File A03() {
        return new File(this.A07, AnonymousClass001.A0R(this.A06, ".tmp"));
    }

    public final File A04() {
        return new File(this.A07, AnonymousClass001.A0R(this.A06, ".metadata"));
    }
}
