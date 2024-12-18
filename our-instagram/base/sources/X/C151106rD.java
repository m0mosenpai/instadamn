package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.6rD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151106rD implements C19N {
    public int A00;
    public final int A01;
    public final C006802i A02;

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
        if (!AbstractC001900j.A0a(path, "users/", false)) {
            return false;
        }
        String path2 = uri.getPath();
        C14360o3.A07(path2);
        if (!AbstractC001900j.A0a(path2, "/usernameinfo", false)) {
            String path3 = uri.getPath();
            C14360o3.A07(path3);
            if (!AbstractC001900j.A0a(path3, "/info", false)) {
                return false;
            }
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
        String A0c;
        int i = this.A00;
        if (i == 0) {
            A0c = "fetch_user_network_end";
        } else {
            A0c = AnonymousClass001.A0c("fetch_user_network_flush", "_end", i);
        }
        this.A02.markerPoint(31784979, this.A01, A0c);
        this.A00++;
    }

    @Override // X.C19O
    public final void onRequestCallbackDone(C1QW c1qw, C1QY c1qy) {
        C19P.A01.remove(this);
    }

    @Override // X.C19O
    public final void onRequestUploadAttemptStart(C1QW c1qw) {
        this.A02.markerPoint(31784979, this.A01, "fetch_user_network_start");
    }

    @Override // X.C19O
    public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        this.A02.markerPoint(31784979, this.A01, "fetch_user_network_response_start");
    }

    public C151106rD(int i) {
        this.A01 = i;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A02 = c006802i;
        c006802i.markerPoint(31784979, this.A01, "fetch_user_request_start");
    }
}
