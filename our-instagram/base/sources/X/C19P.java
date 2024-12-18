package X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.19P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19P extends C19Q {
    public static final C19P A00 = new Object();
    public static final CopyOnWriteArraySet A01 = new CopyOnWriteArraySet();

    @Override // X.C19Q, X.C19O
    public final void onFailed(C1QW c1qw, IOException iOException) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(iOException, 1);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onFailed(c1qw, iOException);
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onFirstByteFlushed(C1QW c1qw, long j) {
        C14360o3.A0B(c1qw, 0);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onFirstByteFlushed(c1qw, j);
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onHeaderBytesReceived(C1QW c1qw, long j, long j2) {
        C14360o3.A0B(c1qw, 0);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onHeaderBytesReceived(c1qw, j, j2);
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onLastByteAcked(C1QW c1qw, long j, long j2) {
        C14360o3.A0B(c1qw, 0);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onLastByteAcked(c1qw, j, j2);
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(byteBuffer, 2);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onNewData(c1qw, c1qy, byteBuffer);
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onRequestCallbackDone(C1QW c1qw, C1QY c1qy) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onRequestCallbackDone(c1qw, c1qy);
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onRequestUploadAttemptStart(C1QW c1qw) {
        C14360o3.A0B(c1qw, 0);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onRequestUploadAttemptStart(c1qw);
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c3jq, 2);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onResponseStarted(c1qw, c1qy, c3jq);
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onSucceeded(C1QW c1qw) {
        C14360o3.A0B(c1qw, 0);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onSucceeded(c1qw);
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onUploadProgress(C1QW c1qw, long j, long j2) {
        C14360o3.A0B(c1qw, 0);
        Iterator it = A01.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C19N c19n = (C19N) it.next();
            if (c19n.CYv(c1qw)) {
                c19n.onUploadProgress(c1qw, j, j2);
            }
        }
    }
}
