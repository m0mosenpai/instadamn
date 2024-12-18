package X;

import com.facebookpay.paymentmethod.model.APMCredential;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PayPalCredential;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDW {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDW[] A02;
    public static final VDW A03 = new VDW("CREDIT_CARD", new C0YZ(CreditCard.class), 0);
    public static final VDW A04 = new VDW("PAYPAL_CREDENTIAL", new C0YZ(PayPalCredential.class), 1);
    public static final VDW A05 = new VDW("TOKENIZED_CARD", new C0YZ(TokenizedCard.class), 2);
    public final InterfaceC16510rw A00;

    static {
        VDW[] vdwArr = {A03, A04, A05, new VDW("APM_CREDENTIAL", new C0YZ(APMCredential.class), 3)};
        A02 = vdwArr;
        A01 = AbstractC12190kN.A00(vdwArr);
    }

    public static VDW valueOf(String str) {
        return (VDW) Enum.valueOf(VDW.class, str);
    }

    public static VDW[] values() {
        return (VDW[]) A02.clone();
    }

    public VDW(String str, InterfaceC16510rw interfaceC16510rw, int i) {
        this.A00 = interfaceC16510rw;
    }
}
