package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class MediaTrialStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaTrialStatus[] A03;
    public static final MediaTrialStatus A04;
    public static final MediaTrialStatus A05;
    public static final MediaTrialStatus A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaTrialStatus mediaTrialStatus = new MediaTrialStatus("UNRECOGNIZED", 0, "MediaTrialStatus_unspecified");
        A06 = mediaTrialStatus;
        MediaTrialStatus mediaTrialStatus2 = new MediaTrialStatus("ACTIVE", 1, AppStateModule.APP_STATE_ACTIVE);
        A04 = mediaTrialStatus2;
        MediaTrialStatus mediaTrialStatus3 = new MediaTrialStatus("GRADUATED", 2, "graduated");
        A05 = mediaTrialStatus3;
        MediaTrialStatus[] mediaTrialStatusArr = {mediaTrialStatus, mediaTrialStatus2, mediaTrialStatus3};
        A03 = mediaTrialStatusArr;
        A02 = AbstractC12190kN.A00(mediaTrialStatusArr);
        MediaTrialStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaTrialStatus mediaTrialStatus4 : values) {
            A18.put(mediaTrialStatus4.A00, mediaTrialStatus4);
        }
        A01 = A18;
        CREATOR = new C41858IgC(90);
    }

    public static MediaTrialStatus valueOf(String str) {
        return (MediaTrialStatus) Enum.valueOf(MediaTrialStatus.class, str);
    }

    public static MediaTrialStatus[] values() {
        return (MediaTrialStatus[]) A03.clone();
    }

    public MediaTrialStatus(String str, int i, String str2) {
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
