package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.6rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151536rz implements C19N {
    public final C37494GfC A00;

    @Override // X.C19N
    public final void ATi(C1QW c1qw) {
    }

    @Override // X.C19N
    public final boolean CYv(C1QW c1qw) {
        java.net.URI uri = c1qw.A09;
        if (uri.getPath() == null) {
            return false;
        }
        String path = uri.getPath();
        C14360o3.A07(path);
        if (!AbstractC001900j.A0a(path, "feed/user", false)) {
            return false;
        }
        return true;
    }

    @Override // X.C19O
    public final void onFailed(C1QW c1qw, IOException iOException) {
    }

    @Override // X.C19O
    public final void onFirstByteFlushed(C1QW c1qw, long j) {
    }

    @Override // X.C19O
    public final void onHeaderBytesReceived(C1QW c1qw, long j, long j2) {
    }

    @Override // X.C19O
    public final void onLastByteAcked(C1QW c1qw, long j, long j2) {
    }

    @Override // X.C19O
    public final void onSucceeded(C1QW c1qw) {
    }

    @Override // X.C19O
    public final void onUploadProgress(C1QW c1qw, long j, long j2) {
    }

    @Override // X.C19O
    public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
        this.A00.A0E("profile_network_end");
    }

    @Override // X.C19O
    public final void onRequestCallbackDone(C1QW c1qw, C1QY c1qy) {
        C19P.A01.remove(this);
    }

    @Override // X.C19O
    public final void onRequestUploadAttemptStart(C1QW c1qw) {
        this.A00.A0E("profile_network_start");
    }

    @Override // X.C19O
    public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        this.A00.A0E("profile_network_response_start");
    }

    public C151536rz(C37494GfC c37494GfC) {
        this.A00 = c37494GfC;
        c37494GfC.A0E("profile_request_start");
    }
}
