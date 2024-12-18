package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class TargetingRelaxationConstants implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TargetingRelaxationConstants[] A03;
    public static final TargetingRelaxationConstants A04;
    public static final TargetingRelaxationConstants A05;
    public static final TargetingRelaxationConstants A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TargetingRelaxationConstants targetingRelaxationConstants = new TargetingRelaxationConstants("UNRECOGNIZED", 0, "TargetingRelaxationConstants_unspecified");
        A06 = targetingRelaxationConstants;
        TargetingRelaxationConstants targetingRelaxationConstants2 = new TargetingRelaxationConstants("EXPANSION", 1, "EXPANSION");
        A04 = targetingRelaxationConstants2;
        TargetingRelaxationConstants targetingRelaxationConstants3 = new TargetingRelaxationConstants(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A05 = targetingRelaxationConstants3;
        TargetingRelaxationConstants[] targetingRelaxationConstantsArr = {targetingRelaxationConstants, targetingRelaxationConstants2, targetingRelaxationConstants3};
        A03 = targetingRelaxationConstantsArr;
        A02 = AbstractC12190kN.A00(targetingRelaxationConstantsArr);
        TargetingRelaxationConstants[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (TargetingRelaxationConstants targetingRelaxationConstants4 : values) {
            linkedHashMap.put(targetingRelaxationConstants4.A00, targetingRelaxationConstants4);
        }
        A01 = linkedHashMap;
        CREATOR = new C41857IgB(42);
    }

    public static TargetingRelaxationConstants valueOf(String str) {
        return (TargetingRelaxationConstants) Enum.valueOf(TargetingRelaxationConstants.class, str);
    }

    public static TargetingRelaxationConstants[] values() {
        return (TargetingRelaxationConstants[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TargetingRelaxationConstants(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
