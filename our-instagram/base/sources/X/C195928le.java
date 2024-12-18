package X;

import java.util.concurrent.Executor;

/* renamed from: X.8le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195928le implements InterfaceC40711ue {
    public AbstractC12990ll A00;

    @Override // X.InterfaceC40711ue
    public final C1Df ATV(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk) {
        return ATW(interfaceC48212Jk, interfaceC48192Ji, c1Dk, null);
    }

    @Override // X.InterfaceC40711ue
    public final C1Df ATW(final InterfaceC48212Jk interfaceC48212Jk, final InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, Executor executor) {
        C18C.A0E(executor == null);
        AbstractC12990ll abstractC12990ll = this.A00;
        C14360o3.A0B(abstractC12990ll, 0);
        C907542o c907542o = new C907542o(abstractC12990ll);
        c907542o.A08(c1Dk);
        final C1ON A06 = c907542o.A06();
        A06.A00 = new C1P1() { // from class: X.9Lg
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-74527438);
                Throwable A01 = abstractC115105If.A01();
                if (A01 == null || (A01 instanceof C7J3)) {
                    A01 = new Throwable(AbstractC43591JPw.A00(717));
                }
                interfaceC48212Jk.invoke(A01);
                C0f9.A0A(-929069476, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(670246121);
                int A032 = C0f9.A03(-2087513328);
                interfaceC48192Ji.invoke((AnonymousClass435) obj);
                C0f9.A0A(1754402928, A032);
                C0f9.A0A(-1179045004, A03);
            }
        };
        C1GJ.A03(A06);
        if (!c1Dk.isMutation()) {
            AbstractC39781t2.A02(c1Dk.getSchema(), "IGGraphQLWWWLegacyQueryExecutor", c1Dk.getCallName());
        }
        return new C1Df() { // from class: X.9Lh
            @Override // X.C1Df
            public final void cancel() {
                C1ON.this.cancel();
            }
        };
    }

    public static synchronized C195928le A00(final AbstractC12990ll abstractC12990ll) {
        C195928le c195928le;
        synchronized (C195928le.class) {
            c195928le = (C195928le) abstractC12990ll.A01(C195928le.class, new InterfaceC16820sZ() { // from class: X.8lf
                /* JADX WARN: Type inference failed for: r0v0, types: [X.8le, java.lang.Object] */
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    AbstractC12990ll abstractC12990ll2 = AbstractC12990ll.this;
                    ?? obj = new Object();
                    obj.A00 = abstractC12990ll2;
                    return obj;
                }
            });
        }
        return c195928le;
    }
}
