package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.AbstractC72048XLo;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class PaymentCredentialTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PaymentCredentialTypeEnum[] A03;
    public static final PaymentCredentialTypeEnum A04;
    public static final PaymentCredentialTypeEnum A05;
    public static final PaymentCredentialTypeEnum A06;
    public static final PaymentCredentialTypeEnum A07;
    public static final PaymentCredentialTypeEnum A08;
    public static final PaymentCredentialTypeEnum A09;
    public static final PaymentCredentialTypeEnum A0A;
    public static final PaymentCredentialTypeEnum A0B;
    public static final PaymentCredentialTypeEnum A0C;
    public static final PaymentCredentialTypeEnum A0D;
    public static final PaymentCredentialTypeEnum A0E;
    public static final PaymentCredentialTypeEnum A0F;
    public static final PaymentCredentialTypeEnum A0G;
    public static final PaymentCredentialTypeEnum A0H;
    public static final PaymentCredentialTypeEnum A0I;
    public static final PaymentCredentialTypeEnum A0J;
    public static final PaymentCredentialTypeEnum A0K;
    public static final PaymentCredentialTypeEnum A0L;
    public static final PaymentCredentialTypeEnum A0M;
    public static final PaymentCredentialTypeEnum A0N;
    public static final PaymentCredentialTypeEnum A0O;
    public static final PaymentCredentialTypeEnum A0P;
    public static final PaymentCredentialTypeEnum A0Q;
    public static final PaymentCredentialTypeEnum A0R;
    public static final PaymentCredentialTypeEnum A0S;
    public static final PaymentCredentialTypeEnum A0T;
    public static final PaymentCredentialTypeEnum A0U;
    public static final PaymentCredentialTypeEnum A0V;
    public static final PaymentCredentialTypeEnum A0W;
    public static final PaymentCredentialTypeEnum A0X;
    public static final PaymentCredentialTypeEnum A0Y;
    public static final PaymentCredentialTypeEnum A0Z;
    public static final PaymentCredentialTypeEnum A0a;
    public static final PaymentCredentialTypeEnum A0b;
    public static final PaymentCredentialTypeEnum A0c;
    public static final PaymentCredentialTypeEnum A0d;
    public static final PaymentCredentialTypeEnum A0e;
    public static final PaymentCredentialTypeEnum A0f;
    public static final PaymentCredentialTypeEnum A0g;
    public static final PaymentCredentialTypeEnum A0h;
    public static final PaymentCredentialTypeEnum A0i;
    public static final PaymentCredentialTypeEnum A0j;
    public static final PaymentCredentialTypeEnum A0k;
    public static final PaymentCredentialTypeEnum A0l;
    public static final PaymentCredentialTypeEnum A0m;
    public static final PaymentCredentialTypeEnum A0n;
    public static final PaymentCredentialTypeEnum A0o;
    public static final PaymentCredentialTypeEnum A0p;
    public static final PaymentCredentialTypeEnum A0q;
    public static final PaymentCredentialTypeEnum A0r;
    public static final PaymentCredentialTypeEnum A0s;
    public static final PaymentCredentialTypeEnum A0t;
    public static final PaymentCredentialTypeEnum A0u;
    public static final PaymentCredentialTypeEnum A0v;
    public static final PaymentCredentialTypeEnum A0w;
    public static final PaymentCredentialTypeEnum A0x;
    public static final PaymentCredentialTypeEnum A0y;
    public static final PaymentCredentialTypeEnum A0z;
    public static final PaymentCredentialTypeEnum A10;
    public static final PaymentCredentialTypeEnum A11;
    public static final PaymentCredentialTypeEnum A12;
    public static final PaymentCredentialTypeEnum A13;
    public static final PaymentCredentialTypeEnum A14;
    public static final PaymentCredentialTypeEnum A15;
    public static final PaymentCredentialTypeEnum A16;
    public static final PaymentCredentialTypeEnum A17;
    public static final PaymentCredentialTypeEnum A18;
    public static final PaymentCredentialTypeEnum A19;
    public static final PaymentCredentialTypeEnum A1A;
    public static final PaymentCredentialTypeEnum A1B;
    public static final PaymentCredentialTypeEnum A1C;
    public static final PaymentCredentialTypeEnum A1D;
    public static final PaymentCredentialTypeEnum A1E;
    public static final PaymentCredentialTypeEnum A1F;
    public static final PaymentCredentialTypeEnum A1G;
    public static final PaymentCredentialTypeEnum A1H;
    public static final PaymentCredentialTypeEnum A1I;
    public static final PaymentCredentialTypeEnum A1J;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PaymentCredentialTypeEnum paymentCredentialTypeEnum = new PaymentCredentialTypeEnum("UNRECOGNIZED", 0, "PaymentCredentialTypeEnum_unspecified");
        A1G = paymentCredentialTypeEnum;
        PaymentCredentialTypeEnum A092 = AbstractC72048XLo.A09("ADS_STORED_BALANCE", 1);
        A04 = A092;
        PaymentCredentialTypeEnum A093 = AbstractC72048XLo.A09("AFFIRM", 2);
        A05 = A093;
        PaymentCredentialTypeEnum A094 = AbstractC72048XLo.A09("ALT_PAY", 3);
        A06 = A094;
        PaymentCredentialTypeEnum A095 = AbstractC72048XLo.A09("APPLE_IAP", 4);
        A07 = A095;
        PaymentCredentialTypeEnum A096 = AbstractC72048XLo.A09("APPLE_PAY", 5);
        A08 = A096;
        PaymentCredentialTypeEnum A097 = AbstractC72048XLo.A09("CREDIT_CARD", 6);
        A09 = A097;
        PaymentCredentialTypeEnum A098 = AbstractC72048XLo.A09("CREDIT_CARD_AMERICANEXPRESS", 7);
        A0A = A098;
        PaymentCredentialTypeEnum A099 = AbstractC72048XLo.A09("CREDIT_CARD_CUP", 8);
        A0B = A099;
        PaymentCredentialTypeEnum A0910 = AbstractC72048XLo.A09("CREDIT_CARD_DINERSCLUB", 9);
        A0C = A0910;
        PaymentCredentialTypeEnum A0911 = AbstractC72048XLo.A09("CREDIT_CARD_DISCOVER", 10);
        A0D = A0911;
        PaymentCredentialTypeEnum A0912 = AbstractC72048XLo.A09("CREDIT_CARD_ELO", 11);
        A0E = A0912;
        PaymentCredentialTypeEnum A0913 = AbstractC72048XLo.A09("CREDIT_CARD_INTERAC", 12);
        A0F = A0913;
        PaymentCredentialTypeEnum A0914 = AbstractC72048XLo.A09("CREDIT_CARD_JCB", 13);
        A0G = A0914;
        PaymentCredentialTypeEnum A0915 = AbstractC72048XLo.A09("CREDIT_CARD_MAESTRO", 14);
        A0H = A0915;
        PaymentCredentialTypeEnum A0916 = AbstractC72048XLo.A09("CREDIT_CARD_MASTERCARD", 15);
        A0I = A0916;
        PaymentCredentialTypeEnum A0917 = AbstractC72048XLo.A09("CREDIT_CARD_PIN_ONLY", 16);
        A0J = A0917;
        PaymentCredentialTypeEnum A0918 = AbstractC72048XLo.A09("CREDIT_CARD_RUPAY", 17);
        A0K = A0918;
        PaymentCredentialTypeEnum A0919 = AbstractC72048XLo.A09("CREDIT_CARD_VISA", 18);
        A0L = A0919;
        PaymentCredentialTypeEnum A0920 = AbstractC72048XLo.A09("DEBIT_CARD_PAYOUT", 19);
        A0M = A0920;
        PaymentCredentialTypeEnum A0921 = AbstractC72048XLo.A09("DIRECT_DEBIT", 20);
        A0N = A0921;
        PaymentCredentialTypeEnum A0922 = AbstractC72048XLo.A09("DUMMY", 21);
        A0O = A0922;
        PaymentCredentialTypeEnum A0923 = AbstractC72048XLo.A09("EARNINGS_PAYOUT", 22);
        A0P = A0923;
        PaymentCredentialTypeEnum A0924 = AbstractC72048XLo.A09("EXTENDED_CREDIT", 23);
        A0Q = A0924;
        PaymentCredentialTypeEnum A0925 = AbstractC72048XLo.A09("EXTERNAL_CREDENTIAL", 24);
        A0R = A0925;
        PaymentCredentialTypeEnum A0926 = AbstractC72048XLo.A09("EXTERNAL_UPI", 25);
        A0S = A0926;
        PaymentCredentialTypeEnum A0927 = AbstractC72048XLo.A09("EXTERNAL_WALLET", 26);
        A0T = A0927;
        PaymentCredentialTypeEnum A0928 = AbstractC72048XLo.A09("FACEBOOK_PAY", 27);
        A0U = A0928;
        PaymentCredentialTypeEnum A0929 = AbstractC72048XLo.A09("FB_TOKEN", 28);
        A0V = A0929;
        PaymentCredentialTypeEnum A0930 = AbstractC72048XLo.A09("GIFTCARD", 29);
        A0W = A0930;
        PaymentCredentialTypeEnum A0931 = AbstractC72048XLo.A09("GIFTCARD_BALANCE", 30);
        A0X = A0931;
        PaymentCredentialTypeEnum A0932 = AbstractC72048XLo.A09("GOOGLE_PAY", 31);
        A0Y = A0932;
        PaymentCredentialTypeEnum A0933 = AbstractC72048XLo.A09("HPP_PAYMENT_LINK", 32);
        A0Z = A0933;
        PaymentCredentialTypeEnum A0934 = AbstractC72048XLo.A09("INCENTIVE_FUNDING", 33);
        A0a = A0934;
        PaymentCredentialTypeEnum A0935 = AbstractC72048XLo.A09("INCENTIVE_MOR_OMNIPE_MIGRATION", 34);
        A0b = A0935;
        PaymentCredentialTypeEnum A0936 = AbstractC72048XLo.A09("INCENTIVE_NMOR_OMNIPE_MIGRATION", 35);
        A0c = A0936;
        PaymentCredentialTypeEnum A0937 = AbstractC72048XLo.A09("META_DUMMY", 36);
        A0d = A0937;
        PaymentCredentialTypeEnum A0938 = AbstractC72048XLo.A09("META_PAY", 37);
        A0e = A0938;
        PaymentCredentialTypeEnum A0939 = AbstractC72048XLo.A09("META_REWARD_DONATION", 38);
        A0f = A0939;
        PaymentCredentialTypeEnum A0940 = AbstractC72048XLo.A09("MOCK_OPAQUE_REDIRECT_LPM", 39);
        A0g = A0940;
        PaymentCredentialTypeEnum A0941 = AbstractC72048XLo.A09("MOMO", 40);
        A0h = A0941;
        PaymentCredentialTypeEnum A0942 = AbstractC72048XLo.A09("NETWORK_TOKEN", 41);
        A0i = A0942;
        PaymentCredentialTypeEnum A0943 = AbstractC72048XLo.A09("NET_BANKING", 42);
        A0j = A0943;
        PaymentCredentialTypeEnum A0944 = AbstractC72048XLo.A09("NET_BANKING_BUALUANG", 43);
        A0k = A0944;
        PaymentCredentialTypeEnum A0945 = AbstractC72048XLo.A09("NET_BANKING_KMA", 44);
        A0l = A0945;
        PaymentCredentialTypeEnum A0946 = AbstractC72048XLo.A09("NET_BANKING_KRUNGTHAI_NEXT", 45);
        A0m = A0946;
        PaymentCredentialTypeEnum A0947 = AbstractC72048XLo.A09("NET_BANKING_K_PLUS", 46);
        A0n = A0947;
        PaymentCredentialTypeEnum A0948 = AbstractC72048XLo.A09("NET_BANKING_SCB", 47);
        A0o = A0948;
        PaymentCredentialTypeEnum A0949 = AbstractC72048XLo.A09("NEW_BUSINESS_STORED_BALANCE", 48);
        A0p = A0949;
        PaymentCredentialTypeEnum A0950 = AbstractC72048XLo.A09("NEW_CREDENTIAL_NUX", 49);
        A0q = A0950;
        PaymentCredentialTypeEnum A0951 = AbstractC72048XLo.A09("NEW_CREDIT_CARD", 50);
        A0r = A0951;
        PaymentCredentialTypeEnum A0952 = AbstractC72048XLo.A09("NEW_EXTENDED_CREDIT", 51);
        A0s = A0952;
        PaymentCredentialTypeEnum A0953 = AbstractC72048XLo.A09("NEW_EXTERNAL_WALLET", 52);
        A0t = A0953;
        PaymentCredentialTypeEnum A0954 = AbstractC72048XLo.A09("NEW_PAYPAL_BA", 53);
        A0u = A0954;
        PaymentCredentialTypeEnum A0955 = AbstractC72048XLo.A09("NEW_PAYPAL_BNPL_CHECKOUT", 54);
        A0v = A0955;
        PaymentCredentialTypeEnum A0956 = AbstractC72048XLo.A09("NEW_PAYPAL_CHECKOUT", 55);
        A0w = A0956;
        PaymentCredentialTypeEnum A0957 = AbstractC72048XLo.A09("NEW_SHOP_PAY", 56);
        A0x = A0957;
        PaymentCredentialTypeEnum A0958 = AbstractC72048XLo.A09("NEW_WA_EXTERNAL_WALLET", 57);
        A0y = A0958;
        PaymentCredentialTypeEnum A0959 = AbstractC72048XLo.A09(PriceTableAnnotation$Companion.OFFER, 58);
        A0z = A0959;
        PaymentCredentialTypeEnum A0960 = AbstractC72048XLo.A09("PAYONEER", 59);
        A10 = A0960;
        PaymentCredentialTypeEnum A0961 = AbstractC72048XLo.A09("PAYOUT_CONSUMER_EARNING", 60);
        A11 = A0961;
        PaymentCredentialTypeEnum A0962 = AbstractC72048XLo.A09("PAYPAL_BA", 61);
        A12 = A0962;
        PaymentCredentialTypeEnum A0963 = AbstractC72048XLo.A09("PAYPAL_PAYOUT", 62);
        A13 = A0963;
        PaymentCredentialTypeEnum A0964 = AbstractC72048XLo.A09("PAYPAL_TOKEN", 63);
        A14 = A0964;
        PaymentCredentialTypeEnum A0965 = AbstractC72048XLo.A09("PAY_ON_DELIVERY", 64);
        A15 = A0965;
        PaymentCredentialTypeEnum A0966 = AbstractC72048XLo.A09("PIX", 65);
        A16 = A0966;
        PaymentCredentialTypeEnum A0967 = AbstractC72048XLo.A09("PIX_KEY", 66);
        A17 = A0967;
        PaymentCredentialTypeEnum A0968 = AbstractC72048XLo.A09("QR_CODE", 67);
        A18 = A0968;
        PaymentCredentialTypeEnum A0969 = AbstractC72048XLo.A09("REWARD", 68);
        A19 = A0969;
        PaymentCredentialTypeEnum A0970 = AbstractC72048XLo.A09("SHOPIFY_BNPL", 69);
        A1A = A0970;
        PaymentCredentialTypeEnum A0971 = AbstractC72048XLo.A09("SHOPIFY_OTC", 70);
        A1B = A0971;
        PaymentCredentialTypeEnum A0972 = AbstractC72048XLo.A09("SHOP_PAY", 71);
        A1C = A0972;
        PaymentCredentialTypeEnum A0973 = AbstractC72048XLo.A09("SOFORT", 72);
        A1D = A0973;
        PaymentCredentialTypeEnum A0974 = AbstractC72048XLo.A09("STORED_CREDIT", 73);
        A1E = A0974;
        PaymentCredentialTypeEnum A0975 = AbstractC72048XLo.A09("STORED_VALUE", 74);
        A1F = A0975;
        PaymentCredentialTypeEnum A0976 = AbstractC72048XLo.A09("UPI", 75);
        A1H = A0976;
        PaymentCredentialTypeEnum A0977 = AbstractC72048XLo.A09("VIRTUAL_CARD_KLARNA_BNPL", 76);
        A1I = A0977;
        PaymentCredentialTypeEnum A0978 = AbstractC72048XLo.A09("WA_EXTERNAL_WALLET", 77);
        A1J = A0978;
        PaymentCredentialTypeEnum[] paymentCredentialTypeEnumArr = new PaymentCredentialTypeEnum[78];
        System.arraycopy(new PaymentCredentialTypeEnum[]{paymentCredentialTypeEnum, A092, A093, A094, A095, A096, A097, A098, A099, A0910, A0911, A0912, A0913, A0914, A0915, A0916, A0917, A0918, A0919, A0920, A0921, A0922, A0923, A0924, A0925, A0926, A0927}, 0, paymentCredentialTypeEnumArr, 0, 27);
        System.arraycopy(new PaymentCredentialTypeEnum[]{A0928, A0929, A0930, A0931, A0932, A0933, A0934, A0935, A0936, A0937, A0938, A0939, A0940, A0941, A0942, A0943, A0944, A0945, A0946, A0947, A0948, A0949, A0950, A0951, A0952, A0953, A0954}, 0, paymentCredentialTypeEnumArr, 27, 27);
        System.arraycopy(new PaymentCredentialTypeEnum[]{A0955, A0956, A0957, A0958, A0959, A0960, A0961, A0962, A0963, A0964, A0965, A0966, A0967, A0968, A0969, A0970, A0971, A0972, A0973, A0974, A0975, A0976, A0977, A0978}, 0, paymentCredentialTypeEnumArr, 54, 24);
        A03 = paymentCredentialTypeEnumArr;
        A02 = AbstractC12190kN.A00(paymentCredentialTypeEnumArr);
        PaymentCredentialTypeEnum[] values = values();
        LinkedHashMap A182 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (PaymentCredentialTypeEnum paymentCredentialTypeEnum2 : values) {
            A182.put(paymentCredentialTypeEnum2.A00, paymentCredentialTypeEnum2);
        }
        A01 = A182;
        CREATOR = new C41855Ig9(30);
    }

    public static PaymentCredentialTypeEnum valueOf(String str) {
        return (PaymentCredentialTypeEnum) Enum.valueOf(PaymentCredentialTypeEnum.class, str);
    }

    public static PaymentCredentialTypeEnum[] values() {
        return (PaymentCredentialTypeEnum[]) A03.clone();
    }

    public PaymentCredentialTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
