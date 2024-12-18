package X;

import java.util.List;

/* renamed from: X.Axp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24767Axp implements Runnable {
    public final /* synthetic */ C8YY A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;

    public RunnableC24767Axp(C8YY c8yy, List list, boolean z) {
        this.A00 = c8yy;
        this.A01 = list;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0b.A02(C05F.A01, this.A01, this.A02, false, false);
    }
}
