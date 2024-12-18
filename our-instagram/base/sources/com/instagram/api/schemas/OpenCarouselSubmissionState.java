package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OpenCarouselSubmissionState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OpenCarouselSubmissionState[] A03;
    public static final OpenCarouselSubmissionState A04;
    public static final OpenCarouselSubmissionState A05;
    public static final OpenCarouselSubmissionState A06;
    public static final OpenCarouselSubmissionState A07;
    public static final OpenCarouselSubmissionState A08;
    public static final OpenCarouselSubmissionState A09;
    public static final OpenCarouselSubmissionState A0A;
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
        OpenCarouselSubmissionState openCarouselSubmissionState = new OpenCarouselSubmissionState("UNRECOGNIZED", 0, "OpenCarouselSubmissionState_unspecified");
        A0A = openCarouselSubmissionState;
        OpenCarouselSubmissionState openCarouselSubmissionState2 = new OpenCarouselSubmissionState("CLOSED", 1, "closed");
        A04 = openCarouselSubmissionState2;
        OpenCarouselSubmissionState openCarouselSubmissionState3 = new OpenCarouselSubmissionState("CLOSED_WITH_OPEN_ELIGIBLE", 2, "closed_with_open_eligible");
        A05 = openCarouselSubmissionState3;
        OpenCarouselSubmissionState openCarouselSubmissionState4 = new OpenCarouselSubmissionState("FORMER_OPENED", 3, "former_opened");
        A06 = openCarouselSubmissionState4;
        OpenCarouselSubmissionState openCarouselSubmissionState5 = new OpenCarouselSubmissionState("OPEN_WITH_SUBMISSION_ELIGIBLE", 4, "open_with_submission_eligible");
        A07 = openCarouselSubmissionState5;
        OpenCarouselSubmissionState openCarouselSubmissionState6 = new OpenCarouselSubmissionState("OPEN_WITH_SUBMISSION_ELIGIBLE_NO_APPROVAL_NEEDED", 5, "open_with_submission_eligible_no_approval_needed");
        A08 = openCarouselSubmissionState6;
        OpenCarouselSubmissionState openCarouselSubmissionState7 = new OpenCarouselSubmissionState("OPEN_WITH_SUBMISSION_INELIGIBLE", 6, "open_with_submission_ineligible");
        A09 = openCarouselSubmissionState7;
        OpenCarouselSubmissionState[] openCarouselSubmissionStateArr = {openCarouselSubmissionState, openCarouselSubmissionState2, openCarouselSubmissionState3, openCarouselSubmissionState4, openCarouselSubmissionState5, openCarouselSubmissionState6, openCarouselSubmissionState7};
        A03 = openCarouselSubmissionStateArr;
        A02 = AbstractC12190kN.A00(openCarouselSubmissionStateArr);
        OpenCarouselSubmissionState[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (OpenCarouselSubmissionState openCarouselSubmissionState8 : values) {
            linkedHashMap.put(openCarouselSubmissionState8.A00, openCarouselSubmissionState8);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(72);
    }

    public static OpenCarouselSubmissionState valueOf(String str) {
        return (OpenCarouselSubmissionState) Enum.valueOf(OpenCarouselSubmissionState.class, str);
    }

    public static OpenCarouselSubmissionState[] values() {
        return (OpenCarouselSubmissionState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OpenCarouselSubmissionState(String str, int i, String str2) {
        this.A00 = str2;
    }
}
