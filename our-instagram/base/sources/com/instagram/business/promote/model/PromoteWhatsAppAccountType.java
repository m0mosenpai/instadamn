package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C14360o3;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PromoteWhatsAppAccountType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PromoteWhatsAppAccountType[] A01;
    public static final PromoteWhatsAppAccountType A02;
    public static final PromoteWhatsAppAccountType A03;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PromoteWhatsAppAccountType promoteWhatsAppAccountType = new PromoteWhatsAppAccountType("CONSUMER", 0);
        A02 = promoteWhatsAppAccountType;
        PromoteWhatsAppAccountType promoteWhatsAppAccountType2 = new PromoteWhatsAppAccountType("SMB", 1);
        A03 = promoteWhatsAppAccountType2;
        PromoteWhatsAppAccountType[] promoteWhatsAppAccountTypeArr = {promoteWhatsAppAccountType, promoteWhatsAppAccountType2};
        A01 = promoteWhatsAppAccountTypeArr;
        A00 = AbstractC12190kN.A00(promoteWhatsAppAccountTypeArr);
        CREATOR = new C70220WId(81);
    }

    public static PromoteWhatsAppAccountType valueOf(String str) {
        return (PromoteWhatsAppAccountType) Enum.valueOf(PromoteWhatsAppAccountType.class, str);
    }

    public static PromoteWhatsAppAccountType[] values() {
        return (PromoteWhatsAppAccountType[]) A01.clone();
    }

    public PromoteWhatsAppAccountType(String str, int i) {
    }

    @Override // java.lang.Enum
    public final String toString() {
        String name = name();
        Locale locale = Locale.ROOT;
        C14360o3.A08(locale);
        String lowerCase = name.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        return lowerCase;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
