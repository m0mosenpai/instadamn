package X;

import android.os.SystemClock;

/* renamed from: X.3yG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89143yG {
    public final long A00;
    public final C89133yF A01;
    public final C26511Qg A02;
    public final C1QW A03;
    public final C1QY A04;

    public C89143yG(C89133yF c89133yF, C26511Qg c26511Qg, C1QW c1qw, C1QY c1qy) {
        this.A03 = c1qw;
        this.A04 = c1qy;
        this.A02 = c26511Qg;
        this.A01 = c89133yF;
        this.A00 = SystemClock.elapsedRealtime();
    }

    public C89143yG(C89143yG c89143yG) {
        this.A03 = c89143yG.A03;
        this.A04 = c89143yG.A04;
        this.A02 = c89143yG.A02;
        this.A01 = c89143yG.A01;
        this.A00 = c89143yG.A00;
    }
}
