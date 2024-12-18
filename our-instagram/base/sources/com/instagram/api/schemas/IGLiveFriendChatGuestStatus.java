package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class IGLiveFriendChatGuestStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGLiveFriendChatGuestStatus[] A03;
    public static final IGLiveFriendChatGuestStatus A04;
    public static final IGLiveFriendChatGuestStatus A05;
    public static final IGLiveFriendChatGuestStatus A06;
    public static final IGLiveFriendChatGuestStatus A07;
    public static final IGLiveFriendChatGuestStatus A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus = new IGLiveFriendChatGuestStatus("UNRECOGNIZED", 0, "IGLiveFriendChatGuestStatus_unspecified");
        A08 = iGLiveFriendChatGuestStatus;
        IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus2 = new IGLiveFriendChatGuestStatus("INVITED", 1, "invited");
        A04 = iGLiveFriendChatGuestStatus2;
        IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus3 = new IGLiveFriendChatGuestStatus("JOINED", 2, "joined");
        A05 = iGLiveFriendChatGuestStatus3;
        IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus4 = new IGLiveFriendChatGuestStatus("LEFT", 3, "left");
        A06 = iGLiveFriendChatGuestStatus4;
        IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus5 = new IGLiveFriendChatGuestStatus("REMOVED", 4, "removed");
        A07 = iGLiveFriendChatGuestStatus5;
        IGLiveFriendChatGuestStatus[] iGLiveFriendChatGuestStatusArr = {iGLiveFriendChatGuestStatus, iGLiveFriendChatGuestStatus2, iGLiveFriendChatGuestStatus3, iGLiveFriendChatGuestStatus4, iGLiveFriendChatGuestStatus5, new IGLiveFriendChatGuestStatus("ADMINE", 5, "admin")};
        A03 = iGLiveFriendChatGuestStatusArr;
        A02 = AbstractC12190kN.A00(iGLiveFriendChatGuestStatusArr);
        IGLiveFriendChatGuestStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus6 : values) {
            A18.put(iGLiveFriendChatGuestStatus6.A00, iGLiveFriendChatGuestStatus6);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(35);
    }

    public static IGLiveFriendChatGuestStatus valueOf(String str) {
        return (IGLiveFriendChatGuestStatus) Enum.valueOf(IGLiveFriendChatGuestStatus.class, str);
    }

    public static IGLiveFriendChatGuestStatus[] values() {
        return (IGLiveFriendChatGuestStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGLiveFriendChatGuestStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
