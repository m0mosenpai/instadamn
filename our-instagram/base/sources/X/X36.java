package X;

import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class X36 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ LoggingContext A00;
    public final /* synthetic */ C70073W1q A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X36(LoggingContext loggingContext, C70073W1q c70073W1q, String str, String str2, List list, boolean z) {
        super(0);
        this.A02 = str;
        this.A00 = loggingContext;
        this.A05 = z;
        this.A04 = list;
        this.A03 = str2;
        this.A01 = c70073W1q;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        LoggingContext loggingContext;
        C25531Mh c25531Mh;
        InterfaceC16660sJ mif;
        String str = this.A02;
        int hashCode = str.hashCode();
        if (hashCode != -1785516855) {
            if (hashCode != 1996002556) {
                if (hashCode == 2012838315 && str.equals("DELETE")) {
                    Wap wap = C2FP.A01().A04;
                    LoggingContext loggingContext2 = this.A00;
                    boolean z = this.A05;
                    Wap.A03(new C25531Mh(MSY.A0H(wap.A00, "client_remove_fbpayaccountmutation_success"), 111), loggingContext2, new MIF(6, this.A04, AbstractC58320PtC.A1B(this.A01), loggingContext2, z));
                }
            } else if (str.equals("CREATE")) {
                Wap wap2 = C2FP.A01().A04;
                loggingContext = this.A00;
                boolean z2 = this.A05;
                List list = this.A04;
                String str2 = this.A03;
                if (str2 != null) {
                    LinkedHashMap A1B = AbstractC58320PtC.A1B(this.A01);
                    c25531Mh = new C25531Mh(MSY.A0H(wap2.A00, "client_add_fbpayaccountmutation_success"), 23);
                    mif = new C43650JSi(loggingContext, list, A1B, str2, 8, z2);
                    Wap.A03(c25531Mh, loggingContext, mif);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            throw AbstractC167007dF.A0c(MSV.A00(351), str);
        }
        if (str.equals("UPDATE")) {
            Wap wap3 = C2FP.A01().A04;
            loggingContext = this.A00;
            boolean z3 = this.A05;
            List list2 = this.A04;
            LinkedHashMap A1B2 = AbstractC58320PtC.A1B(this.A01);
            c25531Mh = new C25531Mh(MSY.A0H(wap3.A00, "client_edit_fbpayaccountmutation_success"), 32);
            mif = new MIF(4, list2, A1B2, loggingContext, z3);
            Wap.A03(c25531Mh, loggingContext, mif);
        }
        throw AbstractC167007dF.A0c(MSV.A00(351), str);
        return C0eB.A00;
    }
}
