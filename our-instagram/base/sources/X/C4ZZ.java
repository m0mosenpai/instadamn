package X;

import android.content.Context;

/* renamed from: X.4ZZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZZ extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C96464Vf A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ C75113Zb A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4ZZ(Context context, C96464Vf c96464Vf, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC60442pS interfaceC60442pS2, C75113Zb c75113Zb) {
        super(2);
        this.A01 = c96464Vf;
        this.A00 = context;
        this.A02 = c38321qM;
        this.A05 = c75113Zb;
        this.A03 = interfaceC60442pS;
        this.A04 = interfaceC60442pS2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C14360o3.A0B(context, 0);
        C96464Vf c96464Vf = this.A01;
        Context context2 = this.A00;
        C38321qM c38321qM = this.A02;
        C75113Zb c75113Zb = this.A05;
        C76293bZ A02 = c96464Vf.A02(context2, c38321qM, this.A03, c75113Zb, booleanValue);
        return ((C75563aN) c96464Vf.A04.getValue()).A04(context, c38321qM, this.A04, A02, c75113Zb, null);
    }
}
