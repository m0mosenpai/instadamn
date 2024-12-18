package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.Cyn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29473Cyn implements InterfaceC31156Dn0 {
    public final C88 A00;
    public final Integer A01;

    @Override // X.InterfaceC30959DjG
    public final /* bridge */ /* synthetic */ Object EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        boolean A1R = AbstractC167007dF.A1R(0, context, interfaceC30923Dia);
        InterfaceC31128DmB A00 = C28351CfB.A00(interfaceC30923Dia);
        int EKE = A00.EKE(this.A00, interfaceC30923Dia.CSM());
        CSN EKP = A00.EKP(this.A01);
        String value = ((InterfaceC30922DiZ) EKP.A04).getValue();
        int A002 = CCC.A00(EKP.A03);
        Typeface A003 = C6BI.A00(context, value);
        C003701c c003701c = AbstractC05160Pl.A00;
        C02R.A01(A002, A1R ? 1 : 0, "weight", 1000);
        Typeface create = Typeface.create(A003, A002, false);
        C14360o3.A07(create);
        return new CW6(create, EKP.A02, EKP.A00, EKP.A01, EKE);
    }

    public C29473Cyn(C88 c88, Integer num) {
        AbstractC167017dG.A1P(num, c88);
        this.A01 = num;
        this.A00 = c88;
    }
}
