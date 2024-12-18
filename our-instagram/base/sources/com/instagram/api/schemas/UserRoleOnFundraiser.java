package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class UserRoleOnFundraiser implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UserRoleOnFundraiser[] A03;
    public static final UserRoleOnFundraiser A04;
    public static final UserRoleOnFundraiser A05;
    public static final UserRoleOnFundraiser A06;
    public static final UserRoleOnFundraiser A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        UserRoleOnFundraiser userRoleOnFundraiser = new UserRoleOnFundraiser("UNRECOGNIZED", 0, "UserRoleOnFundraiser_unspecified");
        A07 = userRoleOnFundraiser;
        UserRoleOnFundraiser userRoleOnFundraiser2 = new UserRoleOnFundraiser("COHOST", 1, "COHOST");
        A04 = userRoleOnFundraiser2;
        UserRoleOnFundraiser userRoleOnFundraiser3 = new UserRoleOnFundraiser(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A05 = userRoleOnFundraiser3;
        UserRoleOnFundraiser userRoleOnFundraiser4 = new UserRoleOnFundraiser("OWNER", 3, "OWNER");
        A06 = userRoleOnFundraiser4;
        UserRoleOnFundraiser[] userRoleOnFundraiserArr = {userRoleOnFundraiser, userRoleOnFundraiser2, userRoleOnFundraiser3, userRoleOnFundraiser4, new UserRoleOnFundraiser("SUPPORTER", 4, "SUPPORTER")};
        A03 = userRoleOnFundraiserArr;
        A02 = AbstractC12190kN.A00(userRoleOnFundraiserArr);
        UserRoleOnFundraiser[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (UserRoleOnFundraiser userRoleOnFundraiser5 : values) {
            A18.put(userRoleOnFundraiser5.A00, userRoleOnFundraiser5);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(82);
    }

    public static UserRoleOnFundraiser valueOf(String str) {
        return (UserRoleOnFundraiser) Enum.valueOf(UserRoleOnFundraiser.class, str);
    }

    public static UserRoleOnFundraiser[] values() {
        return (UserRoleOnFundraiser[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public UserRoleOnFundraiser(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
