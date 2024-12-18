package X;

import java.util.Map;

/* renamed from: X.HdS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39556HdS {
    FIXED_AMOUNT("fixed_amount"),
    UPDATE_CHECKOUT_API("update_checkout_api");

    public static final Map A01 = AbstractC166987dD.A1G();
    public final String A00;

    static {
        for (EnumC39556HdS enumC39556HdS : values()) {
            A01.put(enumC39556HdS.A00, enumC39556HdS);
        }
    }

    EnumC39556HdS(String str) {
        this.A00 = str;
    }
}
