package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.JSz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43667JSz {
    public final UserSession A00;
    public final InterfaceC14020nS A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final ListenableFuture A00(XP9 xp9, C43658JSq c43658JSq, String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        AbstractC167007dF.A1F(c43658JSq, 1, xp9);
        try {
            C1ON A00 = OR4.A00(c43658JSq, this.A00, str, str2, z, false);
            C14360o3.A0B(A00, 0);
            C45366K5z c45366K5z = new C45366K5z(new Object(), A00);
            C2OD.A03(new LWP(xp9, 1), c45366K5z, new ExecutorC14040nU(this.A01, 330, 3, false, true));
            return c45366K5z;
        } catch (IOException e) {
            Exception exc = new Exception("Invalid query parameters", e);
            xp9.DBB(exc);
            ?? obj = new Object();
            obj.setException(exc);
            return obj;
        } catch (IllegalArgumentException e2) {
            Exception exc2 = new Exception("Invalid query parameters", e2);
            xp9.DBB(exc2);
            ?? obj2 = new Object();
            obj2.setException(exc2);
            return obj2;
        }
    }

    public C43667JSz(UserSession userSession, InterfaceC14020nS interfaceC14020nS) {
        this.A00 = userSession;
        this.A01 = interfaceC14020nS;
    }
}
