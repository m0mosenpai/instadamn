package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class DS5 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C26360Bl5 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DS5(C26360Bl5 c26360Bl5, float f, float f2) {
        super(2);
        this.A02 = c26360Bl5;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C29488Cz2 c29488Cz2 = (C29488Cz2) obj2;
        C14360o3.A0B(c29488Cz2, 1);
        String str = c29488Cz2.A02;
        String str2 = c29488Cz2.A03;
        String str3 = c29488Cz2.A00;
        String str4 = c29488Cz2.A01;
        if (str3 != null && str4 != null) {
            float[] fArr = C26570BoT.A0L;
            C26360Bl5 c26360Bl5 = this.A02;
            InterfaceC16660sJ interfaceC16660sJ = c26360Bl5.A02;
            List list = c26360Bl5.A01;
            return new C26570BoT(str, str2, str3, str4, interfaceC16660sJ, this.A00, this.A01, list.size(), list.indexOf(c29488Cz2));
        }
        return null;
    }
}
