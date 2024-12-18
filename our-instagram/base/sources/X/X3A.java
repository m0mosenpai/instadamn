package X;

import android.content.Context;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class X3A extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3A(Object obj, Object obj2, String str, String str2, String str3, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
        this.A05 = str2;
        this.A04 = str3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        if (this.A00 != 0) {
            C69641Vsi c69641Vsi = (C69641Vsi) this.A02;
            ECPHandler eCPHandler = c69641Vsi.A00;
            Integer num = C05F.A0j;
            String str2 = this.A05;
            String str3 = this.A04;
            String str4 = this.A03;
            PaymentReceiverInfo paymentReceiverInfo = (PaymentReceiverInfo) this.A01;
            if (paymentReceiverInfo != null) {
                str = paymentReceiverInfo.A02;
            } else {
                str = null;
            }
            eCPHandler.CJa(new SIL(null, str2, str3, str4, str), null, num);
            try {
                C67729Uwv c67729Uwv = c69641Vsi.A06.A00;
                if (c67729Uwv != null) {
                    c67729Uwv.A0L(num);
                }
            } catch (Exception unused) {
            }
        } else {
            Context context = (Context) this.A01;
            android.net.Uri A03 = AbstractC08820cl.A03(this.A03);
            C14360o3.A07(A03);
            C12260kU.A0G(context, A03);
            UserSession userSession = (UserSession) this.A02;
            String str5 = this.A05;
            String str6 = this.A04;
            LinkedHashMap A0i = AbstractC37302Gc3.A0i(userSession);
            A0i.put("opened_in", AbstractC111324zv.A00(4404));
            AbstractC68360VNu.A00(userSession, AbstractC111324zv.A00(5119), userSession.userId, str5, str6, A0i);
        }
        return C0eB.A00;
    }
}
