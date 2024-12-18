package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDs {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VDs[] A02;
    public static final VDs A03;
    public static final VDs A04;
    public static final VDs A05;
    public static final VDs A06;
    public static final VDs A07;
    public static final VDs A08;
    public final String A00;

    static {
        VDs vDs = new VDs(PaymentDetailChangeTypes$Companion.OFFERS, 0, "offers");
        A05 = vDs;
        VDs vDs2 = new VDs("CITY", 1, ServerW3CShippingAddressConstants.CITY);
        A03 = vDs2;
        VDs vDs3 = new VDs("COUNTRY", 2, "country");
        A04 = vDs3;
        VDs vDs4 = new VDs("REGION", 3, ServerW3CShippingAddressConstants.REGION);
        A08 = vDs4;
        VDs vDs5 = new VDs("RECIPIENT", 4, "recipient");
        A07 = vDs5;
        VDs vDs6 = new VDs("POSTALCODE", 5, "postalCode");
        A06 = vDs6;
        VDs[] vDsArr = {vDs, vDs2, vDs3, vDs4, vDs5, vDs6, new VDs("ADDRESSLINE", 6, "addressLine")};
        A02 = vDsArr;
        A01 = AbstractC12190kN.A00(vDsArr);
    }

    public static VDs valueOf(String str) {
        return (VDs) Enum.valueOf(VDs.class, str);
    }

    public static VDs[] values() {
        return (VDs[]) A02.clone();
    }

    public VDs(String str, int i, String str2) {
        this.A00 = str2;
    }
}
