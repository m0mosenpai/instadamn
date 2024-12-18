package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.Cyo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29474Cyo implements InterfaceC31156Dn0 {
    public final EnumC72394Xcg A00;
    public final Integer A01;

    @Override // X.InterfaceC30959DjG
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final CW6 EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        Integer num;
        boolean A1R = AbstractC167007dF.A1R(0, context, interfaceC30923Dia);
        EnumC191908em A03 = AbstractC28379Cfi.A03(interfaceC30923Dia);
        switch (this.A01.intValue()) {
            case 0:
                num = C05F.A00;
                break;
            case 1:
                num = C05F.A01;
                break;
            case 2:
                num = C05F.A0C;
                break;
            case 3:
                num = C05F.A0N;
                break;
            case 4:
                num = C05F.A0Y;
                break;
            case 5:
                num = C05F.A0j;
                break;
            case 6:
                num = C05F.A0u;
                break;
            case 7:
                num = C05F.A15;
                break;
            case 8:
                num = C05F.A1F;
                break;
            case 9:
                num = C05F.A1I;
                break;
            default:
                throw B4Z.A00();
        }
        C14360o3.A0B(A03, 0);
        CSN F8x = XPC.A00(A03).F8x(num);
        int A01 = AbstractC28379Cfi.A01(this.A00, interfaceC30923Dia);
        String str = ((EnumC72437Xdh) F8x.A04).A00;
        int A00 = CCC.A00(F8x.A03);
        Typeface A002 = C6BI.A00(context, str);
        C003701c c003701c = AbstractC05160Pl.A00;
        C02R.A01(A00, A1R ? 1 : 0, "weight", 1000);
        Typeface create = Typeface.create(A002, A00, false);
        C14360o3.A07(create);
        return new CW6(create, F8x.A02, F8x.A00, F8x.A01, A01);
    }

    public C29474Cyo(EnumC72394Xcg enumC72394Xcg, Integer num) {
        AbstractC167017dG.A1P(num, enumC72394Xcg);
        this.A01 = num;
        this.A00 = enumC72394Xcg;
    }
}
