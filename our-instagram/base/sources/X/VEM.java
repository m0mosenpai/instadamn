package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEM {
    public static final Map A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ VEM[] A04;
    public static final VEM A05;
    public static final VEM A06;
    public static final VEM A07;
    public static final VEM A08;
    public static final VEM A09;
    public static final VEM A0A;
    public final String A00;
    public final String A01;

    static {
        VEM vem = new VEM("BASIC_CARD_V1", "BASIC_CARD_V1", "basic-card-v1", 0);
        A05 = vem;
        VEM vem2 = new VEM("FB_TOKEN_V1", "FB_TOKEN_V1", "fb-token-v1", 1);
        A07 = vem2;
        VEM vem3 = new VEM("ECOM_TOKEN_V1", "ECOM_TOKEN_V1", "ecom-token-v1", 2);
        A06 = vem3;
        VEM vem4 = new VEM("META_PAYMENT_V1", "META_PAYMENT_V1", "meta-payment-v1", 3);
        A09 = vem4;
        VEM vem5 = new VEM("PAYPAL_OTC_V1", "PAYPAL_OTC_V1", "paypal-otc-v1", 4);
        A0A = vem5;
        VEM vem6 = new VEM("FIRMLY_TOKEN_V1", "FIRMLY_TOKEN_V1", "firmly-token-v1", 5);
        A08 = vem6;
        VEM[] vemArr = {vem, vem2, vem3, vem4, vem5, vem6};
        A04 = vemArr;
        A03 = AbstractC12190kN.A00(vemArr);
        VEM[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VEM vem7 : values) {
            linkedHashMap.put(vem7.A00, vem7);
        }
        A02 = linkedHashMap;
    }

    public static VEM valueOf(String str) {
        return (VEM) Enum.valueOf(VEM.class, str);
    }

    public static VEM[] values() {
        return (VEM[]) A04.clone();
    }

    public VEM(String str, String str2, String str3, int i) {
        this.A01 = str2;
        this.A00 = str3;
    }
}
