package X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1GX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GX extends C19Q {
    public List A00;

    @Override // X.C19Q, X.C19O
    public final synchronized void onFailed(C1QW c1qw, IOException iOException) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onFailed(c1qw, iOException);
        }
    }

    @Override // X.C19Q, X.C19O
    public final synchronized void onFirstByteFlushed(C1QW c1qw, long j) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onFirstByteFlushed(c1qw, j);
        }
    }

    @Override // X.C19Q, X.C19O
    public final synchronized void onLastByteAcked(C1QW c1qw, long j, long j2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onLastByteAcked(c1qw, j, j2);
        }
    }

    @Override // X.C19Q, X.C19O
    public final synchronized void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onNewData(c1qw, c1qy, byteBuffer);
        }
    }

    @Override // X.C19Q, X.C19O
    public final synchronized void onRequestCallbackDone(C1QW c1qw, C1QY c1qy) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onRequestCallbackDone(c1qw, c1qy);
        }
    }

    @Override // X.C19Q, X.C19O
    public final synchronized void onRequestUploadAttemptStart(C1QW c1qw) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onRequestUploadAttemptStart(c1qw);
        }
    }

    @Override // X.C19Q, X.C19O
    public final synchronized void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onResponseStarted(c1qw, c1qy, c3jq);
        }
    }

    @Override // X.C19Q, X.C19O
    public final synchronized void onSucceeded(C1QW c1qw) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onSucceeded(c1qw);
        }
    }

    @Override // X.C19Q, X.C19O
    public final synchronized void onUploadProgress(C1QW c1qw, long j, long j2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onUploadProgress(c1qw, j, j2);
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onHeaderBytesReceived(C1QW c1qw, long j, long j2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C19Q) it.next()).onHeaderBytesReceived(c1qw, j, j2);
        }
    }
}
