package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MessagingOffPlatformShareType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MessagingOffPlatformShareType[] A03;
    public static final MessagingOffPlatformShareType A04;
    public static final MessagingOffPlatformShareType A05;
    public static final MessagingOffPlatformShareType A06;
    public static final MessagingOffPlatformShareType A07;
    public static final MessagingOffPlatformShareType A08;
    public static final MessagingOffPlatformShareType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MessagingOffPlatformShareType messagingOffPlatformShareType = new MessagingOffPlatformShareType("UNRECOGNIZED", 0, "MessagingOffPlatformShareType_unspecified");
        A04 = messagingOffPlatformShareType;
        MessagingOffPlatformShareType messagingOffPlatformShareType2 = new MessagingOffPlatformShareType("igbc_challenge", 1, "igbc_challenge");
        A05 = messagingOffPlatformShareType2;
        MessagingOffPlatformShareType messagingOffPlatformShareType3 = new MessagingOffPlatformShareType("igbc_challenge_submission", 2, "igbc_challenge_submission");
        A06 = messagingOffPlatformShareType3;
        MessagingOffPlatformShareType messagingOffPlatformShareType4 = new MessagingOffPlatformShareType("igbc_challenge_winners", 3, "igbc_challenge_winners");
        A07 = messagingOffPlatformShareType4;
        MessagingOffPlatformShareType messagingOffPlatformShareType5 = new MessagingOffPlatformShareType("igbc_challenge_winning_submission", 4, "igbc_challenge_winning_submission");
        A08 = messagingOffPlatformShareType5;
        MessagingOffPlatformShareType messagingOffPlatformShareType6 = new MessagingOffPlatformShareType(DialogModule.KEY_MESSAGE, 5, DialogModule.KEY_MESSAGE);
        A09 = messagingOffPlatformShareType6;
        MessagingOffPlatformShareType[] messagingOffPlatformShareTypeArr = {messagingOffPlatformShareType, messagingOffPlatformShareType2, messagingOffPlatformShareType3, messagingOffPlatformShareType4, messagingOffPlatformShareType5, messagingOffPlatformShareType6, new MessagingOffPlatformShareType("thread", 6, "thread")};
        A03 = messagingOffPlatformShareTypeArr;
        A02 = AbstractC12190kN.A00(messagingOffPlatformShareTypeArr);
        MessagingOffPlatformShareType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MessagingOffPlatformShareType messagingOffPlatformShareType7 : values) {
            A18.put(messagingOffPlatformShareType7.A00, messagingOffPlatformShareType7);
        }
        A01 = A18;
        CREATOR = new C41858IgC(91);
    }

    public static MessagingOffPlatformShareType valueOf(String str) {
        return (MessagingOffPlatformShareType) Enum.valueOf(MessagingOffPlatformShareType.class, str);
    }

    public static MessagingOffPlatformShareType[] values() {
        return (MessagingOffPlatformShareType[]) A03.clone();
    }

    public MessagingOffPlatformShareType(String str, int i, String str2) {
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
