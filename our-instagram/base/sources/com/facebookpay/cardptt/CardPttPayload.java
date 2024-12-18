package com.facebookpay.cardptt;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.C14360o3;
import X.C3OO;
import com.fbpay.ptt.interfaces.Sensitive;
import com.fbpay.ptt.interfaces.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class CardPttPayload {

    @SerializedName("app_id")
    public final String appId;

    @SerializedName("auth_ticket_type")
    public final String authTicketType;

    @SerializedName("caps")
    public List caps;

    @SerializedName("credit_card")
    @Sensitive
    public final String cardNumber;

    @SerializedName("credential_id")
    public final String credId;

    @SerializedName("csc")
    @Sensitive
    public final String csc;

    @SerializedName("device_id")
    public final String deviceId;

    @SerializedName("expiry_month")
    public final String expiryMonth;

    @SerializedName("expiry_year")
    public final String expiryYear;

    @SerializedName("first_name")
    public final String firstName;

    @SerializedName("last_name")
    public final String lastName;

    @SerializedName("public_key")
    public final String publicKey;

    public static /* synthetic */ CardPttPayload copy$default(CardPttPayload cardPttPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardPttPayload.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = cardPttPayload.appId;
        }
        if ((i & 4) != 0) {
            str3 = cardPttPayload.firstName;
        }
        if ((i & 8) != 0) {
            str4 = cardPttPayload.lastName;
        }
        if ((i & 16) != 0) {
            str5 = cardPttPayload.cardNumber;
        }
        if ((i & 32) != 0) {
            str6 = cardPttPayload.csc;
        }
        if ((i & 64) != 0) {
            str7 = cardPttPayload.expiryMonth;
        }
        if ((i & 128) != 0) {
            str8 = cardPttPayload.expiryYear;
        }
        if ((i & 256) != 0) {
            str9 = cardPttPayload.publicKey;
        }
        if ((i & 512) != 0) {
            str10 = cardPttPayload.credId;
        }
        if ((i & 1024) != 0) {
            str11 = cardPttPayload.authTicketType;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            list = cardPttPayload.caps;
        }
        return cardPttPayload.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component10() {
        return this.credId;
    }

    public final String component11() {
        return this.authTicketType;
    }

    public final List component12() {
        return this.caps;
    }

    public final String component2() {
        return this.appId;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final String component5() {
        return this.cardNumber;
    }

    public final String component6() {
        return this.csc;
    }

    public final String component7() {
        return this.expiryMonth;
    }

    public final String component8() {
        return this.expiryYear;
    }

    public final String component9() {
        return this.publicKey;
    }

    public final CardPttPayload copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        C14360o3.A0B(str, 0);
        AbstractC25233BEq.A0x(1, str2, str5, str6);
        AbstractC167017dG.A1U(str7, str8);
        return new CardPttPayload(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CardPttPayload) {
                CardPttPayload cardPttPayload = (CardPttPayload) obj;
                if (!C14360o3.A0K(this.deviceId, cardPttPayload.deviceId) || !C14360o3.A0K(this.appId, cardPttPayload.appId) || !C14360o3.A0K(this.firstName, cardPttPayload.firstName) || !C14360o3.A0K(this.lastName, cardPttPayload.lastName) || !C14360o3.A0K(this.cardNumber, cardPttPayload.cardNumber) || !C14360o3.A0K(this.csc, cardPttPayload.csc) || !C14360o3.A0K(this.expiryMonth, cardPttPayload.expiryMonth) || !C14360o3.A0K(this.expiryYear, cardPttPayload.expiryYear) || !C14360o3.A0K(this.publicKey, cardPttPayload.publicKey) || !C14360o3.A0K(this.credId, cardPttPayload.credId) || !C14360o3.A0K(this.authTicketType, cardPttPayload.authTicketType) || !C14360o3.A0K(this.caps, cardPttPayload.caps)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAuthTicketType() {
        return this.authTicketType;
    }

    public final List getCaps() {
        return this.caps;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCredId() {
        return this.credId;
    }

    public final String getCsc() {
        return this.csc;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return ((((((AbstractC166997dE.A0K(this.expiryYear, AbstractC166997dE.A0K(this.expiryMonth, AbstractC166997dE.A0K(this.csc, AbstractC166997dE.A0K(this.cardNumber, (((AbstractC166997dE.A0K(this.appId, AbstractC166987dD.A0J(this.deviceId)) + AbstractC167017dG.A0O(this.firstName)) * 31) + AbstractC167017dG.A0O(this.lastName)) * 31)))) + AbstractC167017dG.A0O(this.publicKey)) * 31) + AbstractC167017dG.A0O(this.credId)) * 31) + AbstractC167017dG.A0O(this.authTicketType)) * 31) + AbstractC166997dE.A0I(this.caps);
    }

    public CardPttPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(str5, 5);
        AbstractC167017dG.A1U(str6, str7);
        C14360o3.A0B(str8, 8);
        this.deviceId = str;
        this.appId = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.cardNumber = str5;
        this.csc = str6;
        this.expiryMonth = str7;
        this.expiryYear = str8;
        this.publicKey = str9;
        this.credId = str10;
        this.authTicketType = str11;
        this.caps = list;
    }

    public final void setCaps(List list) {
        this.caps = list;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CardPttPayload(deviceId=");
        A1C.append(this.deviceId);
        A1C.append(", appId=");
        A1C.append(this.appId);
        A1C.append(", firstName=");
        A1C.append(this.firstName);
        A1C.append(", lastName=");
        A1C.append(this.lastName);
        A1C.append(", cardNumber=");
        A1C.append(this.cardNumber);
        A1C.append(", csc=");
        A1C.append(this.csc);
        A1C.append(", expiryMonth=");
        A1C.append(this.expiryMonth);
        A1C.append(", expiryYear=");
        A1C.append(this.expiryYear);
        A1C.append(", publicKey=");
        A1C.append(this.publicKey);
        A1C.append(", credId=");
        A1C.append(this.credId);
        A1C.append(", authTicketType=");
        A1C.append(this.authTicketType);
        A1C.append(", caps=");
        return AbstractC167017dG.A0o(this.caps, A1C);
    }

    public /* synthetic */ CardPttPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & C3OO.FLAG_MOVED) != 0 ? null : list);
    }
}
