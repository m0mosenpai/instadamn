package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0WA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0WA extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ InterfaceC19390xP A03;
    public final /* synthetic */ InterfaceC06180Ui A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WA(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC19390xP interfaceC19390xP, InterfaceC06180Ui interfaceC06180Ui) {
        super(2, interfaceC23621Ds);
        this.A03 = interfaceC19390xP;
        this.A04 = interfaceC06180Ui;
        this.A02 = obj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C0WA c0wa = new C0WA(this.A02, interfaceC23621Ds, this.A03, this.A04);
        c0wa.A01 = obj;
        return c0wa;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0WA) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            int ordinal = ((C10L) this.A01).ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    Object obj2 = this.A02;
                    C20730zt c20730zt = C10M.A00;
                    InterfaceC06180Ui interfaceC06180Ui = this.A04;
                    if (obj2 == c20730zt) {
                        interfaceC06180Ui.EJt();
                    } else {
                        interfaceC06180Ui.F8m(obj2);
                    }
                }
            } else {
                InterfaceC19390xP interfaceC19390xP = this.A03;
                InterfaceC06180Ui interfaceC06180Ui2 = this.A04;
                this.A00 = 1;
                if (interfaceC19390xP.collect(interfaceC06180Ui2, this) == c1jx) {
                    return c1jx;
                }
            }
        }
        return C0eB.A00;
    }
}
