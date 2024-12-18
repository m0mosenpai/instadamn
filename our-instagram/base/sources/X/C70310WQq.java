package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;

/* renamed from: X.WQq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70310WQq implements InterfaceC58362lv {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C70150W8q A01;
    public final /* synthetic */ EcpUIConfiguration A02;
    public final /* synthetic */ PaymentReceiverInfo A03;
    public final /* synthetic */ TransactionInfo A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;

    public C70310WQq(FragmentActivity fragmentActivity, C70150W8q c70150W8q, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, TransactionInfo transactionInfo, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = c70150W8q;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = ecpUIConfiguration;
        this.A05 = str3;
        this.A03 = paymentReceiverInfo;
        this.A04 = transactionInfo;
        this.A00 = fragmentActivity;
        this.A08 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C63167SeR c63167SeR = (C63167SeR) obj;
        C14360o3.A0B(c63167SeR, 0);
        if (AbstractC31177DnL.A1b(c63167SeR.A02())) {
            C70150W8q c70150W8q = this.A01;
            C69641Vsi c69641Vsi = c70150W8q.A00;
            if (c69641Vsi == null) {
                C14360o3.A0F("ecpCheckoutHelper");
                throw C00O.createAndThrow();
            }
            String str = this.A07;
            String str2 = this.A06;
            EcpUIConfiguration ecpUIConfiguration = this.A02;
            String str3 = this.A05;
            C2GS A00 = c69641Vsi.A00(null, null, null, null, ecpUIConfiguration, this.A03, this.A04, null, str, str2, C0HM.A00().toString(), str3, "DEFAULT_VALUE", null, false, C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313415912785879L));
            FragmentActivity fragmentActivity = this.A00;
            AbstractC43593JPy.A1E(fragmentActivity, A00, new DHZ(39, this.A08, c70150W8q, fragmentActivity), 2);
        }
    }
}
