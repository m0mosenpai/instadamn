package X;

import java.io.IOException;

/* renamed from: X.Re1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C61032Re1 extends IOException {
    public AbstractC58532Px0 A00;
    public boolean A01;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.RVE, X.Re1, java.io.IOException] */
    public static RVE A00() {
        ?? iOException = new IOException("Protocol message tag had invalid wire type.");
        iOException.A00 = null;
        return iOException;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Re1, java.io.IOException] */
    public static C61032Re1 A01(String str) {
        ?? iOException = new IOException(str);
        iOException.A00 = null;
        return iOException;
    }
}
