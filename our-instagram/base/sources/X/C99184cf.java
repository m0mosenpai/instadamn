package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;

/* renamed from: X.4cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99184cf extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C77993eR A00;
    public final /* synthetic */ C80143i3 A01;
    public final /* synthetic */ C99154cc A02;
    public final /* synthetic */ C80193i8 A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C99184cf(C77993eR c77993eR, C80143i3 c80143i3, C99154cc c99154cc, C80193i8 c80193i8, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        super(1);
        this.A03 = c80193i8;
        this.A02 = c99154cc;
        this.A00 = c77993eR;
        this.A05 = z;
        this.A01 = c80143i3;
        this.A06 = z2;
        this.A04 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C2YN c2yn = (C2YN) obj;
        C14360o3.A0B(c2yn, 0);
        C99154cc c99154cc = this.A02;
        C80143i3 c80143i3 = this.A01;
        boolean z = this.A06;
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        try {
            c2yn.A00 = C00Q.A03("image", StringTreeSet.MAX_SYMBOL_COUNT);
            UserSession userSession = c99154cc.A01;
            InterfaceC60442pS interfaceC60442pS = c99154cc.A02;
            C79723hN c79723hN = c99154cc.A03;
            c2yn.A02(new C9FV(1, c99154cc, c80143i3, interfaceC16820sZ, z), new Object[]{userSession, interfaceC60442pS, c80143i3, Float.valueOf(c79723hN.A00)});
            c2yn.A00 = null;
            AbstractC80203i9.A07(c2yn, this.A03, C99154cc.A08, c79723hN.A0E, new XM6(c99154cc));
            AbstractC80203i9.A00(AbstractC77363dM.A00(this.A00), c2yn, c79723hN, new XM5(c99154cc), this.A05);
            AbstractC80203i9.A08(c2yn, c99154cc.A06, new XM4(c99154cc));
            return C0eB.A00;
        } catch (Throwable th) {
            c2yn.A00 = null;
            throw th;
        }
    }
}
