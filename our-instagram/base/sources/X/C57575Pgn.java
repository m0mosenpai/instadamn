package X;

import android.content.Context;
import com.facebookpay.logging.LoggingContext;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Pgn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57575Pgn extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        LoggingContext loggingContext;
        C25531Mh A0A;
        InterfaceC16660sJ di0;
        switch (this.A00) {
            case 1:
                C14360o3.A0B(obj, 0);
                EnumC61204Rh4 enumC61204Rh4 = (EnumC61204Rh4) this.A02;
                RiH riH = null;
                if (enumC61204Rh4 != EnumC61204Rh4.UNSET_OR_UNRECOGNIZED_ENUM_VALUE && enumC61204Rh4 != null) {
                    String name = enumC61204Rh4.name();
                    Locale locale = Locale.US;
                    C14360o3.A08(locale);
                    riH = RiH.valueOf(AbstractC166997dE.A10(locale, name));
                }
                String str = this.A05;
                int hashCode = str.hashCode();
                if (hashCode != -1785516855) {
                    if (hashCode != 1996002556) {
                        if (hashCode == 2012838315 && str.equals("DELETE")) {
                            Wap A0H = AbstractC43592JPx.A0H();
                            LoggingContext loggingContext2 = (LoggingContext) this.A03;
                            boolean z = this.A07;
                            Object obj2 = this.A01;
                            C70073W1q c70073W1q = (C70073W1q) this.A04;
                            LinkedHashMap A1I = AbstractC166987dD.A1I();
                            if (c70073W1q != null) {
                                C70199WGm.A08(c70073W1q, A1I);
                            }
                            A1I.put("error_message", obj);
                            AbstractC167007dF.A1D(loggingContext2, 0, obj2);
                            Wap.A03(AbstractC31171DnF.A0A(MSY.A0H(A0H.A00, "client_remove_fbpayaccountmutation_fail"), 109), loggingContext2, new DI0(1, loggingContext2, obj2, A1I, riH, z));
                        }
                    } else if (str.equals("CREATE")) {
                        Wap A0H2 = AbstractC43592JPx.A0H();
                        loggingContext = (LoggingContext) this.A03;
                        boolean z2 = this.A07;
                        Object obj3 = this.A01;
                        String str2 = this.A06;
                        if (str2 != null) {
                            C70073W1q c70073W1q2 = (C70073W1q) this.A04;
                            LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                            if (c70073W1q2 != null) {
                                C70199WGm.A08(c70073W1q2, A1I2);
                            }
                            A1I2.put("error_message", obj);
                            AbstractC167007dF.A1D(loggingContext, 0, obj3);
                            A0A = AbstractC31171DnF.A0A(MSY.A0H(A0H2.A00, "client_add_fbpayaccountmutation_fail"), 21);
                            di0 = new DIA(loggingContext, obj3, riH, A1I2, str2, 0, z2);
                            Wap.A03(A0A, loggingContext, di0);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    throw AbstractC167007dF.A0c("Invalid mutation type: ", str);
                }
                if (str.equals("UPDATE")) {
                    Wap A0H3 = AbstractC43592JPx.A0H();
                    loggingContext = (LoggingContext) this.A03;
                    boolean z3 = this.A07;
                    Object obj4 = this.A01;
                    C70073W1q c70073W1q3 = (C70073W1q) this.A04;
                    LinkedHashMap A1I3 = AbstractC166987dD.A1I();
                    if (c70073W1q3 != null) {
                        C70199WGm.A08(c70073W1q3, A1I3);
                    }
                    A1I3.put("error_message", obj);
                    AbstractC167007dF.A1D(loggingContext, 0, obj4);
                    A0A = AbstractC31171DnF.A0A(MSY.A0H(A0H3.A00, "client_edit_fbpayaccountmutation_fail"), 30);
                    di0 = new DI0(0, loggingContext, obj4, A1I3, riH, z3);
                    Wap.A03(A0A, loggingContext, di0);
                }
                throw AbstractC167007dF.A0c("Invalid mutation type: ", str);
                return C0eB.A00;
            case 2:
                C114205Dh c114205Dh = (C114205Dh) obj;
                C14360o3.A0B(c114205Dh, 0);
                if (!this.A07) {
                    InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A04;
                    Object value = interfaceC74953Yl.getValue();
                    if (value != null) {
                        ((InterfaceC16600sD) this.A03).invoke(this.A06, value, AbstractC28289Cdb.A01(c114205Dh), new C50253MHi(this.A01, interfaceC74953Yl, this.A05, 35));
                    } else {
                        ((InterfaceC16660sJ) this.A02).invoke(this.A06);
                    }
                }
                return C0eB.A00;
            case 3:
                if (AbstractC166987dD.A1a(obj)) {
                    C195918ld c195918ld = ((C214959fX) this.A04).A05;
                    if (c195918ld == null) {
                        C14360o3.A0F("shareToFBController");
                        throw C00O.createAndThrow();
                    }
                    c195918ld.A04(true);
                }
                C214959fX c214959fX = (C214959fX) this.A04;
                C214959fX.A02((Context) this.A01, c214959fX, (C51690MsL) this.A02, (UserStoryTarget) this.A03, this.A06, this.A05, this.A07);
                return C0eB.A00;
            default:
                InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) obj;
                C14360o3.A0B(interfaceC83713oG, 0);
                OUT out = (OUT) this.A04;
                List list = (List) this.A01;
                String str3 = this.A06;
                OUT.A00(new DirectShareTarget(interfaceC83713oG, str3, list, AbstractC167007dF.A1R(0, list, str3)), (C41181vS) this.A02, out, (User) this.A03, this.A05, this.A07);
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57575Pgn(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A05 = str;
        this.A03 = obj2;
        this.A07 = z;
        this.A01 = obj3;
        this.A06 = str2;
        this.A04 = obj4;
    }
}
