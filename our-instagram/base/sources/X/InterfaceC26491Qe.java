package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.1Qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC26491Qe {
    void onComplete();

    void onFailed(IOException iOException);

    void onNewData(ByteBuffer byteBuffer);

    void onResponseStarted(C3JQ c3jq);
}
