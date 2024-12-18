package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.TFf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64469TFf implements MPZ {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ C15370ps A01;
    public final /* synthetic */ C15370ps A02;

    @Override // X.MPZ
    public final /* synthetic */ void DEI(String str, int i, String str2) {
        C14360o3.A0B(str, 1);
        this.A01.A00 = str;
        this.A00.countDown();
    }

    @Override // X.MPZ
    public final void DqE(String str, boolean z) {
        C14360o3.A0B(str, 0);
        this.A02.A00 = str;
        this.A00.countDown();
    }

    public C64469TFf(CountDownLatch countDownLatch, C15370ps c15370ps, C15370ps c15370ps2) {
        this.A02 = c15370ps;
        this.A00 = countDownLatch;
        this.A01 = c15370ps2;
    }
}
