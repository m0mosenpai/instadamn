package com.facebook.pushlite.model;

import X.AbstractC73763Sg;
import X.C0K8;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import X.C3R9;
import X.C5KX;
import X.C65715Tso;
import X.C91C;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.RemoteMessage;
import kotlinx.serialization.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

@Serializable
/* loaded from: classes4.dex */
public final class PushInfraMetaData extends C0T6 implements Parcelable {
    public final Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = new C206149Aw(21);
    public static final AbstractC73763Sg A0A = C5KX.A00(C91C.A00, AbstractC73763Sg.A03);

    /* loaded from: classes4.dex */
    public final class Companion {
        public static final PushInfraMetaData A00(String str) {
            if (str != null) {
                try {
                    return (PushInfraMetaData) PushInfraMetaData.A0A.A00(str, C65715Tso.A00);
                } catch (Exception e) {
                    C0K8.A0F("PushInfraMetaData", "Error parsing PIM from json string", e);
                }
            }
            return new PushInfraMetaData(null, null, null, null, null, null, null, null, null, null);
        }

        public final PushInfraMetaData A01(Intent intent) {
            String stringExtra;
            if (intent.hasExtra("pim")) {
                String stringExtra2 = intent.getStringExtra("pim");
                if (stringExtra2 != null && stringExtra2.length() != 0) {
                    return A00(stringExtra2);
                }
            } else if (intent.hasExtra("data") && (stringExtra = intent.getStringExtra("data")) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    if (jSONObject.has("pim")) {
                        AbstractC73763Sg abstractC73763Sg = PushInfraMetaData.A0A;
                        return A00(jSONObject.getString("pim"));
                    }
                } catch (JSONException e) {
                    C0K8.A0F("PushInfraMetaData", "Could not extract PIM, error parsing json \"data\" field on intent", e);
                }
            }
            return new PushInfraMetaData(null, null, null, null, null, null, null, null, null, null);
        }

        public final C3R9 serializer() {
            return C65715Tso.A00;
        }

        public final PushInfraMetaData A02(RemoteMessage remoteMessage) {
            if (remoteMessage.A02().containsKey("pim")) {
                return A00((String) remoteMessage.A02().get("pim"));
            }
            return new PushInfraMetaData(null, null, null, null, null, null, null, null, null, null);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PushInfraMetaData) {
                PushInfraMetaData pushInfraMetaData = (PushInfraMetaData) obj;
                if (!C14360o3.A0K(this.A06, pushInfraMetaData.A06) || !C14360o3.A0K(this.A01, pushInfraMetaData.A01) || !C14360o3.A0K(this.A08, pushInfraMetaData.A08) || !C14360o3.A0K(this.A03, pushInfraMetaData.A03) || !C14360o3.A0K(this.A04, pushInfraMetaData.A04) || !C14360o3.A0K(this.A05, pushInfraMetaData.A05) || !C14360o3.A0K(this.A09, pushInfraMetaData.A09) || !C14360o3.A0K(this.A07, pushInfraMetaData.A07) || !C14360o3.A0K(this.A02, pushInfraMetaData.A02) || !C14360o3.A0K(this.A00, pushInfraMetaData.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A06;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.A01;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A05;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A09;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A07;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A02;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l2 = this.A00;
        return hashCode9 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        Long l = this.A01;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        Long l2 = this.A00;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public /* synthetic */ PushInfraMetaData(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        if ((i & 1) == 0) {
            this.A06 = null;
        } else {
            this.A06 = str;
        }
        if ((i & 2) == 0) {
            this.A01 = null;
        } else {
            this.A01 = l;
        }
        if ((i & 4) == 0) {
            this.A08 = null;
        } else {
            this.A08 = str2;
        }
        if ((i & 8) == 0) {
            this.A03 = null;
        } else {
            this.A03 = str3;
        }
        if ((i & 16) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str4;
        }
        if ((i & 32) == 0) {
            this.A05 = null;
        } else {
            this.A05 = str5;
        }
        if ((i & 64) == 0) {
            this.A09 = null;
        } else {
            this.A09 = str6;
        }
        if ((i & 128) == 0) {
            this.A07 = null;
        } else {
            this.A07 = str7;
        }
        if ((i & 256) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str8;
        }
        if ((i & 512) == 0) {
            this.A00 = null;
        } else {
            this.A00 = l2;
        }
    }

    public PushInfraMetaData(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A06 = str;
        this.A01 = l;
        this.A08 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A09 = str6;
        this.A07 = str7;
        this.A02 = str8;
        this.A00 = l2;
    }

    public PushInfraMetaData() {
        this(null, null, null, null, null, null, null, null, null, null);
    }
}
