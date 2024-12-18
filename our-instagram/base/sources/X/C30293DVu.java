package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DVu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30293DVu extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30293DVu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A07 = obj;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A08 = str;
        this.A03 = obj5;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28495Cho.A02((CWS) this.A04, (CWT) this.A05, (C136606Go) this.A07, A0S, (Modifier) this.A06, this.A08, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A06;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A07;
                List list = (List) this.A04;
                AbstractC28292Cde.A01(A0S2, (C28370CfW) this.A03, (AbstractC59962oe) this.A05, this.A08, list, interfaceC16660sJ, interfaceC16660sJ2, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 2:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                String str = this.A08;
                C72 c72 = (C72) this.A05;
                C6O c6o = (C6O) this.A07;
                AbstractC28388Cfr.A00((C136606Go) this.A03, A0S3, (Modifier) this.A04, c72, (C28874Coi) this.A06, c6o, str, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 3:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                String str2 = this.A08;
                C6O c6o2 = (C6O) this.A07;
                AbstractC28388Cfr.A01((C136606Go) this.A03, A0S4, (Modifier) this.A04, (C72) this.A05, (C28874Coi) this.A06, c6o2, str2, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            default:
                C5Tl A0S5 = AbstractC25226BEj.A0S(obj, obj2);
                Modifier modifier = (Modifier) this.A05;
                UserSession userSession = (UserSession) this.A07;
                List list2 = (List) this.A03;
                AbstractC27647CHs.A00(A0S5, modifier, userSession, (InterfaceC30804Dgf) this.A04, this.A08, list2, (InterfaceC16660sJ) this.A06, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
        }
        return C0eB.A00;
    }
}
