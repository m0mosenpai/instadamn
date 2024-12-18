package X;

/* loaded from: classes4.dex */
public final class B65 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C6MQ A00;
    public final /* synthetic */ InterfaceC117845Uu A01;
    public final /* synthetic */ C5C7 A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Object[] A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B65(C6MQ c6mq, InterfaceC117845Uu interfaceC117845Uu, C5C7 c5c7, Object obj, String str, Object[] objArr) {
        super(0);
        this.A00 = c6mq;
        this.A02 = c5c7;
        this.A01 = interfaceC117845Uu;
        this.A04 = str;
        this.A03 = obj;
        this.A05 = objArr;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        C6MQ c6mq = this.A00;
        C5C7 c5c7 = this.A02;
        InterfaceC117845Uu interfaceC117845Uu = this.A01;
        String str = this.A04;
        Object obj = this.A03;
        Object[] objArr = this.A05;
        boolean z2 = true;
        if (c6mq.A01 != interfaceC117845Uu) {
            c6mq.A01 = interfaceC117845Uu;
            z = true;
        } else {
            z = false;
        }
        if (!C14360o3.A0K(c6mq.A04, str)) {
            c6mq.A04 = str;
        } else {
            z2 = z;
        }
        c6mq.A02 = c5c7;
        c6mq.A03 = obj;
        c6mq.A05 = objArr;
        InterfaceC138116Np interfaceC138116Np = c6mq.A00;
        if (interfaceC138116Np != null && z2) {
            interfaceC138116Np.F9T();
            c6mq.A00 = null;
            C6MQ.A00(c6mq);
        }
        return C0eB.A00;
    }
}
