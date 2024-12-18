package X;

/* renamed from: X.D3o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29633D3o extends AbstractC105084oO {
    public int A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ InterfaceC16620sF A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29633D3o(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        super(interfaceC23621Ds);
        this.A02 = interfaceC16620sF;
        this.A01 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A00;
        if (i != 0) {
            if (i == 1) {
                this.A00 = 2;
                AbstractC09560e7.A00(obj);
                return obj;
            }
            throw AbstractC166987dD.A14("This coroutine had already completed");
        }
        this.A00 = 1;
        AbstractC09560e7.A00(obj);
        InterfaceC16620sF interfaceC16620sF = this.A02;
        C14360o3.A0C(interfaceC16620sF, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        C15500q5.A06(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(this.A01, this);
    }
}
