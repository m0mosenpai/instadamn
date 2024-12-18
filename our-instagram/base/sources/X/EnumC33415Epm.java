package X;

import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Map;

/* renamed from: X.Epm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33415Epm {
    A05("DEFAULT", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    A09("GIFT_CARDS", SMBPartnerType.A09.toString()),
    A0A("ORDER_FOOD", SMBPartnerType.A06.toString()),
    A06("DONATE", SMBPartnerType.A05.toString()),
    A04("BOOK_NOW", "book_now"),
    A08("GET_TICKETS", "get_tickets"),
    A0B("RESERVE", "reserve"),
    A07("GET_QUOTE", "get_quote");

    public static final Map A02 = AbstractC166987dD.A1G();
    public int A00;
    public String A01;

    static {
        for (EnumC33415Epm enumC33415Epm : values()) {
            A02.put(enumC33415Epm.A01, enumC33415Epm);
        }
    }

    EnumC33415Epm(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }
}
