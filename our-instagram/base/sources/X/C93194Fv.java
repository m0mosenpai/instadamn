package X;

import java.io.IOException;

/* renamed from: X.4Fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C93194Fv extends IOException {
    public int A00;
    public boolean A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Fv, java.io.IOException] */
    public static C93194Fv A00(String str, Throwable th) {
        ?? iOException = new IOException(str, th);
        iOException.A01 = true;
        iOException.A00 = 1;
        return iOException;
    }

    @Deprecated
    public C93194Fv() {
    }
}
