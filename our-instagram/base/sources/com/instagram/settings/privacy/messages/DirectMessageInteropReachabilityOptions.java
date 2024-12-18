package com.instagram.settings.privacy.messages;

import X.AbstractC12190kN;
import X.C37324GcR;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class DirectMessageInteropReachabilityOptions implements Parcelable {
    public static final DirectMessageInteropReachabilityOptions[] A04;
    public static final DirectMessageInteropReachabilityOptions[] A05;
    public static final DirectMessageInteropReachabilityOptions[] A06;
    public static final DirectMessageInteropReachabilityOptions[] A07;
    public static final /* synthetic */ EnumEntries A08;
    public static final /* synthetic */ DirectMessageInteropReachabilityOptions[] A09;
    public static final DirectMessageInteropReachabilityOptions A0A;
    public static final DirectMessageInteropReachabilityOptions A0B;
    public static final DirectMessageInteropReachabilityOptions A0C;
    public static final DirectMessageInteropReachabilityOptions A0D;
    public static final DirectMessageInteropReachabilityOptions A0E;
    public static final DirectMessageInteropReachabilityOptions A0F;
    public static final DirectMessageInteropReachabilityOptions A0G;
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static DirectMessageInteropReachabilityOptions valueOf(String str) {
        return (DirectMessageInteropReachabilityOptions) Enum.valueOf(DirectMessageInteropReachabilityOptions.class, str);
    }

    public static DirectMessageInteropReachabilityOptions[] values() {
        return (DirectMessageInteropReachabilityOptions[]) A09.clone();
    }

    static {
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = new DirectMessageInteropReachabilityOptions(null, "INBOX", "inbox", 0, 2131966419, 2131966419);
        A0D = directMessageInteropReachabilityOptions;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = new DirectMessageInteropReachabilityOptions(null, "REQUESTS", "message_requests", 1, 2131966427, 2131966428);
        A0G = directMessageInteropReachabilityOptions2;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = new DirectMessageInteropReachabilityOptions(null, "DO_NOT_RECEIVE", "do_not_receive", 2, 2131966412, 2131966413);
        A0A = directMessageInteropReachabilityOptions3;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = new DirectMessageInteropReachabilityOptions(null, "PRIMARY", "primary", 3, 2131966425, 2131966426);
        A0F = directMessageInteropReachabilityOptions4;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = new DirectMessageInteropReachabilityOptions(null, "GENERAL", "general", 4, 2131966417, 2131966418);
        A0C = directMessageInteropReachabilityOptions5;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = new DirectMessageInteropReachabilityOptions(2131966406, "PEOPLE_I_FOLLOW", "people_i_follow", 5, 2131966405, 2131966405);
        A0E = directMessageInteropReachabilityOptions6;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = new DirectMessageInteropReachabilityOptions(2131966403, "EVERYONE", "everyone", 6, 2131966402, 2131966402);
        A0B = directMessageInteropReachabilityOptions7;
        DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr = {directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3, directMessageInteropReachabilityOptions4, directMessageInteropReachabilityOptions5, directMessageInteropReachabilityOptions6, directMessageInteropReachabilityOptions7};
        A09 = directMessageInteropReachabilityOptionsArr;
        A08 = AbstractC12190kN.A00(directMessageInteropReachabilityOptionsArr);
        CREATOR = new C37324GcR(60);
        A05 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3};
        A06 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions4, directMessageInteropReachabilityOptions5, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3};
        A07 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3};
        A04 = new DirectMessageInteropReachabilityOptions[]{directMessageInteropReachabilityOptions7, directMessageInteropReachabilityOptions6};
    }

    public DirectMessageInteropReachabilityOptions(Integer num, String str, String str2, int i, int i2, int i3) {
        this.A03 = str2;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
