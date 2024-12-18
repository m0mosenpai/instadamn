package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.19M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19M implements C19N {
    public boolean A00;

    @Override // X.C19N
    public final boolean CYv(C1QW c1qw) {
        java.net.URI uri = c1qw.A09;
        if (uri.getPath() == null) {
            return false;
        }
        String path = uri.getPath();
        C14360o3.A07(path);
        if (!AbstractC001900j.A0a(path, "/feed/timeline", false)) {
            return false;
        }
        return true;
    }

    @Override // X.C19N
    public final void ATi(C1QW c1qw) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_EXIT_NETWORK_QUEUE");
    }

    @Override // X.C19O
    public final void onFailed(C1QW c1qw, IOException iOException) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_FAILED");
    }

    @Override // X.C19O
    public final void onFirstByteFlushed(C1QW c1qw, long j) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_FIRST_BYTE_FLUSHED");
    }

    @Override // X.C19O
    public final void onHeaderBytesReceived(C1QW c1qw, long j, long j2) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_HEADER_BYTES_RECEIVED");
    }

    @Override // X.C19O
    public final void onLastByteAcked(C1QW c1qw, long j, long j2) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_LAST_BYTE_ACKED");
    }

    @Override // X.C19O
    public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
        if (!this.A00) {
            this.A00 = true;
            C226418s A01 = C226218q.A01(AbstractC12960li.A00);
            A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_NEW_DATA");
        }
    }

    @Override // X.C19O
    public final void onRequestCallbackDone(C1QW c1qw, C1QY c1qy) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_REQUEST_CALLBACK_DONE");
        C19P.A01.remove(this);
    }

    @Override // X.C19O
    public final void onRequestUploadAttemptStart(C1QW c1qw) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_UPLOAD_ATTEMPT_START");
    }

    @Override // X.C19O
    public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_RESPONSE_STARTED");
    }

    @Override // X.C19O
    public final void onSucceeded(C1QW c1qw) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_SUCCEDED");
    }

    @Override // X.C19O
    public final void onUploadProgress(C1QW c1qw, long j, long j2) {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "FEED_REQUEST_MNS_ON_UPLOAD_PROGRESS");
    }
}
