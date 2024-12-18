package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40701ud implements InterfaceC40711ue {
    public final C40851us A00;
    public final C40851us A01;

    public final C1Df A01(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk) {
        C14360o3.A0B(c1Dk, 0);
        return A02(interfaceC48212Jk, interfaceC48192Ji, c1Dk, C1W2.A00());
    }

    public final C1Df A02(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, Executor executor) {
        InterfaceC09390do interfaceC09390do;
        PandoGraphQLRequest pandoGraphQLRequest;
        C14360o3.A0B(c1Dk, 0);
        C40851us A00 = A00(this, c1Dk.getSchema());
        C48232Jm c48232Jm = new C48232Jm(interfaceC48192Ji);
        if ((c1Dk instanceof PandoGraphQLRequest) && (pandoGraphQLRequest = (PandoGraphQLRequest) c1Dk) != null && pandoGraphQLRequest.isSubscription()) {
            interfaceC09390do = A00.A06;
        } else {
            interfaceC09390do = A00.A03;
        }
        return C40851us.A00(interfaceC48212Jk, c48232Jm, c1Dk, A00, executor, interfaceC09390do);
    }

    public final C008302x A05(C1Dk c1Dk) {
        C14360o3.A0B(c1Dk, 0);
        return C0JE.A00(new C9DH(c1Dk, (InterfaceC23621Ds) null, this, 48));
    }

    public final void A06(C1Dk c1Dk, C1P1 c1p1) {
        C14360o3.A0B(c1Dk, 0);
        C14360o3.A0B(c1p1, 1);
        c1p1.onStart();
        final C62492so c62492so = new C62492so(c1p1);
        C1M8 c1m8 = C1M8.A01;
        C40851us A00 = A00(this, c1Dk.getSchema());
        C40851us.A00(new InterfaceC48212Jk() { // from class: X.2sr
            @Override // X.InterfaceC48212Jk
            public final void invoke(Throwable th) {
                C62492so c62492so2 = C62492so.this;
                C14360o3.A0A(th);
                c62492so2.onFailure(th);
            }
        }, new InterfaceC48192Ji() { // from class: X.2sq
            @Override // X.InterfaceC48192Ji
            public final void invoke(AnonymousClass436 anonymousClass436) {
                C62492so.this.onSuccess(anonymousClass436);
            }
        }, c1Dk, A00, c1m8, A00.A04);
    }

    @Override // X.InterfaceC40711ue
    public final C1Df ATV(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk) {
        C14360o3.A0B(c1Dk, 0);
        return ATW(interfaceC48212Jk, interfaceC48192Ji, c1Dk, C1W2.A00());
    }

    @Override // X.InterfaceC40711ue
    public final C1Df ATW(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, Executor executor) {
        C14360o3.A0B(c1Dk, 0);
        A00(this, c1Dk.getSchema());
        C40851us A00 = A00(this, c1Dk.getSchema());
        C1Df A002 = C40851us.A00(interfaceC48212Jk, new C48232Jm(interfaceC48192Ji), c1Dk, A00, executor, A00.A04);
        if (!c1Dk.isMutation()) {
            AbstractC39781t2.A02(c1Dk.getSchema(), "IgGraphQLQueryExecutor", c1Dk.getCallName());
        }
        return A002;
    }

    public final C56O A03(C1Dk c1Dk) {
        return new C56O(new PUK(c1Dk, this), -2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.55Q] */
    public final Object A04(C1Dk c1Dk, InterfaceC23621Ds interfaceC23621Ds) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        final C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        final ?? r1 = new AbstractC62502sp() { // from class: X.55Q
            @Override // X.AbstractC62502sp
            public final void A00(AnonymousClass436 anonymousClass436) {
                Object c3nx;
                C4OZ c4oz = (C4OZ) anonymousClass436;
                AnonymousClass435 anonymousClass435 = new AnonymousClass435(c4oz.A00, c4oz.A01);
                boolean isOk = anonymousClass435.isOk();
                InterfaceC24901Jp interfaceC24901Jp = InterfaceC24901Jp.this;
                if (!isOk) {
                    c3nx = new C194848jk(new C115115Ig(anonymousClass435));
                } else {
                    c3nx = new C3NX(anonymousClass435);
                }
                interfaceC24901Jp.resumeWith(c3nx);
            }

            @Override // X.AbstractC62502sp
            public final void A02(Throwable th) {
                InterfaceC24901Jp.this.resumeWith(new C194848jk(new C115095Ie(th)));
            }
        };
        C1M8 c1m8 = C1M8.A01;
        C40851us A00 = A00(this, c1Dk.getSchema());
        c24891Jo.CPA(new C206969Eb(C40851us.A00(new InterfaceC48212Jk() { // from class: X.55S
            @Override // X.InterfaceC48212Jk
            public final void invoke(Throwable th) {
                C55Q c55q = C55Q.this;
                C14360o3.A0A(th);
                c55q.onFailure(th);
            }
        }, new InterfaceC48192Ji() { // from class: X.55R
            @Override // X.InterfaceC48192Ji
            public final void invoke(AnonymousClass436 anonymousClass436) {
                onSuccess(anonymousClass436);
            }
        }, c1Dk, A00, c1m8, A00.A04), 8));
        return c24891Jo.A0E();
    }

    public C40701ud(C40851us c40851us, C40851us c40851us2) {
        this.A01 = c40851us;
        this.A00 = c40851us2;
    }

    public static final C40851us A00(C40701ud c40701ud, String str) {
        if (C14360o3.A0K(str, "distillery")) {
            return c40701ud.A00;
        }
        C14360o3.A0K(str, "instagram");
        return c40701ud.A01;
    }
}
