package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.MIk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50281MIk extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        if (this.A00 != 0) {
            InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) obj;
            List list = (List) this.A02;
            String str2 = this.A08;
            C14360o3.A0A(interfaceC83713oG);
            C14360o3.A0B(list, 0);
            DirectShareTarget directShareTarget = new DirectShareTarget(interfaceC83713oG, str2, list, AbstractC167007dF.A1V(interfaceC83713oG));
            C147046jg c147046jg = (C147046jg) this.A05;
            String str3 = this.A07;
            C147046jg.A00(directShareTarget, (C41181vS) this.A03, (C41551w4) this.A01, (LG8) this.A04, c147046jg, str3);
        } else {
            K3X k3x = (K3X) obj;
            C14360o3.A0B(k3x, 0);
            String str4 = this.A08;
            Long BTC = ((User) this.A04).BTC();
            if (BTC != null) {
                long longValue = BTC.longValue();
                List list2 = (List) this.A05;
                List list3 = (List) this.A03;
                String str5 = this.A06;
                if (((C14510oO) this.A02).A00) {
                    str = null;
                } else {
                    str = this.A07;
                }
                JVL jvl = new JVL(35, (InterfaceC16660sJ) this.A01);
                InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3x);
                MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, jvl);
                AbstractC25231BEo.A1C(A0H, new C48193LUr(k3x, A0I, str4, str5, str, list2, list3, longValue), A0I);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50281MIk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, int i) {
        super(1);
        this.A00 = i;
        this.A08 = str;
        this.A04 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A06 = str2;
        this.A02 = obj4;
        this.A07 = str3;
        this.A01 = obj5;
    }
}
