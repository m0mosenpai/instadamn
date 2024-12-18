package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0U6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0U6 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ C12W A02;
    public final /* synthetic */ InterfaceC16610sE A03;
    public final /* synthetic */ AnonymousClass197 A04;
    public final /* synthetic */ InterfaceC24751Is A05;
    public final /* synthetic */ InterfaceC19390xP A06;
    public final /* synthetic */ InterfaceC19960yQ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U6(Object obj, InterfaceC23621Ds interfaceC23621Ds, C12W c12w, InterfaceC16610sE interfaceC16610sE, AnonymousClass197 anonymousClass197, InterfaceC24751Is interfaceC24751Is, InterfaceC19390xP interfaceC19390xP, InterfaceC19960yQ interfaceC19960yQ) {
        super(2, interfaceC23621Ds);
        this.A06 = interfaceC19390xP;
        this.A02 = c12w;
        this.A01 = obj;
        this.A05 = interfaceC24751Is;
        this.A07 = interfaceC19960yQ;
        this.A03 = interfaceC16610sE;
        this.A04 = anonymousClass197;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC19390xP interfaceC19390xP = this.A06;
        C12W c12w = this.A02;
        return new C0U6(this.A01, interfaceC23621Ds, c12w, this.A03, this.A04, this.A05, interfaceC19390xP, this.A07);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0U6) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19390xP interfaceC19390xP = this.A06;
            C12W c12w = this.A02;
            C14890p3 c14890p3 = new C14890p3(this.A01, c12w, this.A03, this.A04, this.A05, this.A07);
            this.A00 = 1;
            if (interfaceC19390xP.collect(c14890p3, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
