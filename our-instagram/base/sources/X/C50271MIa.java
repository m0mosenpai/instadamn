package X;

import android.content.Context;

/* renamed from: X.MIa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50271MIa extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C41761wQ A02;
    public final /* synthetic */ LEJ A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50271MIa(Context context, C41761wQ c41761wQ, LEJ lej, Integer num, Integer num2, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        super(1);
        this.A03 = lej;
        this.A00 = i;
        this.A05 = num;
        this.A04 = num2;
        this.A01 = context;
        this.A02 = c41761wQ;
        this.A07 = z;
        this.A06 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        LEJ lej = this.A03;
        lej.A00.add(obj);
        int i = this.A00 + 1;
        Integer num = this.A05;
        Integer num2 = this.A04;
        LEJ.A00(this.A01, this.A02, lej, num, num2, this.A06, i, this.A07);
        return C0eB.A00;
    }
}
