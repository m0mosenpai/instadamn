package X;

import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* renamed from: X.1D3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1D3 {
    public static final C1D4 A01 = new Object();
    public final InterfaceC09390do A00;

    public C1D3(C1D8 c1d8, UserSession userSession, Executor executor, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(userSession, 11);
        this.A00 = new C17050sx(new C1DA(c1d8, userSession, executor, i, i2, i3, z, z2, z3, z4));
    }

    public final PandoGraphQLConsistencyJNI A00() {
        return (PandoGraphQLConsistencyJNI) this.A00.getValue();
    }
}
