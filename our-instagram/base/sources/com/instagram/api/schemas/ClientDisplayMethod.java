package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ClientDisplayMethod implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClientDisplayMethod[] A03;
    public static final ClientDisplayMethod A04;
    public static final ClientDisplayMethod A05;
    public static final ClientDisplayMethod A06;
    public static final ClientDisplayMethod A07;
    public static final ClientDisplayMethod A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        ClientDisplayMethod clientDisplayMethod = new ClientDisplayMethod("UNRECOGNIZED", 0, "ClientDisplayMethod_unspecified");
        A08 = clientDisplayMethod;
        ClientDisplayMethod clientDisplayMethod2 = new ClientDisplayMethod("ALWAYS", 1, "always");
        A04 = clientDisplayMethod2;
        ClientDisplayMethod clientDisplayMethod3 = new ClientDisplayMethod("EITHER_LIKE_OR_IMPRESSION_TRIGGER", 2, "either_like_or_impression_trigger");
        A05 = clientDisplayMethod3;
        ClientDisplayMethod clientDisplayMethod4 = new ClientDisplayMethod("IMPRESSION_TRIGGER", 3, "impression_trigger");
        A06 = clientDisplayMethod4;
        ClientDisplayMethod clientDisplayMethod5 = new ClientDisplayMethod("LIKE_TRIGGER", 4, "like_trigger");
        A07 = clientDisplayMethod5;
        ClientDisplayMethod[] clientDisplayMethodArr = {clientDisplayMethod, clientDisplayMethod2, clientDisplayMethod3, clientDisplayMethod4, clientDisplayMethod5, new ClientDisplayMethod("NEVER", 5, "never")};
        A03 = clientDisplayMethodArr;
        A02 = AbstractC12190kN.A00(clientDisplayMethodArr);
        ClientDisplayMethod[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClientDisplayMethod clientDisplayMethod6 : values) {
            linkedHashMap.put(clientDisplayMethod6.A00, clientDisplayMethod6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(61);
    }

    public static ClientDisplayMethod valueOf(String str) {
        return (ClientDisplayMethod) Enum.valueOf(ClientDisplayMethod.class, str);
    }

    public static ClientDisplayMethod[] values() {
        return (ClientDisplayMethod[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClientDisplayMethod(String str, int i, String str2) {
        this.A00 = str2;
    }
}
