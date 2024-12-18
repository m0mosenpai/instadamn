package X;

import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.util.concurrent.Executor;

/* renamed from: X.2FS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FS implements InterfaceC08830cm {
    public final InterfaceC40711ue A00;
    public final FBPayIGGraphQLQueryExecutor A01;
    public final Executor A02;
    public final Executor A03;

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        return new C58443PvM(this);
    }

    public C2FS(InterfaceC40711ue interfaceC40711ue, FBPayIGGraphQLQueryExecutor fBPayIGGraphQLQueryExecutor, Executor executor, Executor executor2) {
        this.A03 = executor;
        this.A02 = executor2;
        this.A01 = fBPayIGGraphQLQueryExecutor;
        this.A00 = interfaceC40711ue;
    }
}
