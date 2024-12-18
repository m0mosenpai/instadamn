package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Osn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55955Osn implements MPZ {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ String[] A01;

    @Override // X.MPZ
    public final /* synthetic */ void DEI(String str, int i, String str2) {
        C14360o3.A0B(str, 1);
        C0K8.A0O("MediaSaver", "Failed to fetch media from media store", str);
        this.A00.countDown();
    }

    public C55955Osn(CountDownLatch countDownLatch, String[] strArr) {
        this.A00 = countDownLatch;
        this.A01 = strArr;
    }

    @Override // X.MPZ
    public final void DqE(String str, boolean z) {
        this.A01[0] = str;
        this.A00.countDown();
    }
}
