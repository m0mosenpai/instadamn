package com.facebook.iabadscontext;

import X.AbstractC12190kN;
import X.C63473SlE;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class MessagingExtensionType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MessagingExtensionType[] A01;
    public static final MessagingExtensionType A02;
    public static final MessagingExtensionType A03;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MessagingExtensionType messagingExtensionType = new MessagingExtensionType("WHATSAPP", 0);
        A03 = messagingExtensionType;
        MessagingExtensionType messagingExtensionType2 = new MessagingExtensionType("MESSENGER", 1);
        A02 = messagingExtensionType2;
        MessagingExtensionType[] messagingExtensionTypeArr = {messagingExtensionType, messagingExtensionType2, new MessagingExtensionType("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 2)};
        A01 = messagingExtensionTypeArr;
        A00 = AbstractC12190kN.A00(messagingExtensionTypeArr);
        CREATOR = C63473SlE.A01(15);
    }

    public static MessagingExtensionType valueOf(String str) {
        return (MessagingExtensionType) Enum.valueOf(MessagingExtensionType.class, str);
    }

    public static MessagingExtensionType[] values() {
        return (MessagingExtensionType[]) A01.clone();
    }

    public MessagingExtensionType(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
