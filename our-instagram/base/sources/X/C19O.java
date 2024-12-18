package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.19O, reason: invalid class name */
/* loaded from: classes.dex */
public interface C19O {
    void onFailed(C1QW c1qw, IOException iOException);

    void onFirstByteFlushed(C1QW c1qw, long j);

    void onHeaderBytesReceived(C1QW c1qw, long j, long j2);

    void onLastByteAcked(C1QW c1qw, long j, long j2);

    void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer);

    void onRequestCallbackDone(C1QW c1qw, C1QY c1qy);

    void onRequestUploadAttemptStart(C1QW c1qw);

    void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq);

    void onSucceeded(C1QW c1qw);

    void onUploadProgress(C1QW c1qw, long j, long j2);
}
