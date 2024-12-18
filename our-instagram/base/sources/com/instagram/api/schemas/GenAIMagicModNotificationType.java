package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class GenAIMagicModNotificationType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ GenAIMagicModNotificationType[] A03;
    public static final GenAIMagicModNotificationType A04;
    public static final GenAIMagicModNotificationType A05;
    public static final GenAIMagicModNotificationType A06;
    public static final GenAIMagicModNotificationType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        GenAIMagicModNotificationType genAIMagicModNotificationType = new GenAIMagicModNotificationType("UNRECOGNIZED", 0, "GenAIMagicModNotificationType_unspecified");
        A06 = genAIMagicModNotificationType;
        GenAIMagicModNotificationType genAIMagicModNotificationType2 = new GenAIMagicModNotificationType("RESTYLE", 1, "restyle");
        A05 = genAIMagicModNotificationType2;
        GenAIMagicModNotificationType genAIMagicModNotificationType3 = new GenAIMagicModNotificationType("BACKDROP", 2, "backdrop");
        A04 = genAIMagicModNotificationType3;
        GenAIMagicModNotificationType genAIMagicModNotificationType4 = new GenAIMagicModNotificationType("WAND", 3, "wand");
        A07 = genAIMagicModNotificationType4;
        GenAIMagicModNotificationType[] genAIMagicModNotificationTypeArr = {genAIMagicModNotificationType, genAIMagicModNotificationType2, genAIMagicModNotificationType3, genAIMagicModNotificationType4, new GenAIMagicModNotificationType("DEFAULT", 4, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)};
        A03 = genAIMagicModNotificationTypeArr;
        A02 = AbstractC12190kN.A00(genAIMagicModNotificationTypeArr);
        GenAIMagicModNotificationType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (GenAIMagicModNotificationType genAIMagicModNotificationType5 : values) {
            A18.put(genAIMagicModNotificationType5.A00, genAIMagicModNotificationType5);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(91);
    }

    public static GenAIMagicModNotificationType valueOf(String str) {
        return (GenAIMagicModNotificationType) Enum.valueOf(GenAIMagicModNotificationType.class, str);
    }

    public static GenAIMagicModNotificationType[] values() {
        return (GenAIMagicModNotificationType[]) A03.clone();
    }

    public GenAIMagicModNotificationType(String str, int i, String str2) {
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
