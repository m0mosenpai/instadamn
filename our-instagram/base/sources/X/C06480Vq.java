package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0Vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06480Vq extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C73163Pr A02;
    public final /* synthetic */ InterfaceC19390xP A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06480Vq(InterfaceC23621Ds interfaceC23621Ds, C73163Pr c73163Pr, InterfaceC19390xP interfaceC19390xP) {
        super(2, interfaceC23621Ds);
        this.A03 = interfaceC19390xP;
        this.A02 = c73163Pr;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C06480Vq c06480Vq = new C06480Vq(interfaceC23621Ds, this.A02, this.A03);
        c06480Vq.A01 = obj;
        return c06480Vq;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C06480Vq) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        try {
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                final C19L c19l = (C19L) this.A01;
                final ?? obj2 = new Object();
                InterfaceC19390xP interfaceC19390xP = this.A03;
                final C73163Pr c73163Pr = this.A02;
                InterfaceC19960yQ interfaceC19960yQ = new InterfaceC19960yQ() { // from class: X.0qG
                    @Override // X.InterfaceC19960yQ
                    public final Object emit(Object obj3, InterfaceC23621Ds interfaceC23621Ds) {
                        C15370ps c15370ps = C15370ps.this;
                        C05A c05a = (C05A) c15370ps.A00;
                        if (c05a != null) {
                            c05a.Egh(obj3);
                        } else {
                            C19L c19l2 = c19l;
                            C73163Pr c73163Pr2 = c73163Pr;
                            C008002u A00 = C10E.A00(obj3);
                            c73163Pr2.A0L(new AnonymousClass059(C2QZ.A00(c19l2.Arv()), A00));
                            c15370ps.A00 = A00;
                        }
                        return C0eB.A00;
                    }
                };
                this.A00 = 1;
                if (interfaceC19390xP.collect(interfaceC19960yQ, this) == c1jx) {
                    return c1jx;
                }
            }
            return C0eB.A00;
        } catch (Throwable th) {
            this.A02.A0X(th);
            throw th;
        }
    }
}
