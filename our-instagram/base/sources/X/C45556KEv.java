package X;

import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.KEv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45556KEv extends C19Q {
    public int A00;
    public long A01;
    public final C1QW A02;
    public final C1QY A03;

    @Override // X.C19Q, X.C19O
    public final void onFailed(C1QW c1qw, IOException iOException) {
        AbstractC167017dG.A1N(c1qw, iOException);
        long uptimeMillis = SystemClock.uptimeMillis();
        iOException.getMessage();
        AbstractC166987dD.A1Z(new C25585BSy(iOException, c1qw, this, null, 6, uptimeMillis), AbstractC26621Qr.A02);
    }

    @Override // X.C19Q, X.C19O
    public final void onSucceeded(C1QW c1qw) {
        C14360o3.A0B(c1qw, 0);
        long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC166987dD.A1Z(new C50121MBv(c1qw, this, null, 14, uptimeMillis), AbstractC26621Qr.A02);
    }

    public C45556KEv(C1QW c1qw, C1QY c1qy) {
        this.A02 = c1qw;
        this.A03 = c1qy;
    }

    @Override // X.C19Q, X.C19O
    public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
        AbstractC167027dH.A12(c1qw, c1qy, byteBuffer);
        this.A01 += byteBuffer.remaining() - byteBuffer.arrayOffset();
    }

    @Override // X.C19Q, X.C19O
    public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        AbstractC167027dH.A12(c1qw, c1qy, c3jq);
        this.A00 = c3jq.A01;
    }
}
