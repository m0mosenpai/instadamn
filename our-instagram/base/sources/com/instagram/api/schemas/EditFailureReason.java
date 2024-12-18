package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EditFailureReason implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EditFailureReason[] A03;
    public static final EditFailureReason A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        EditFailureReason editFailureReason = new EditFailureReason("UNRECOGNIZED", 0, "EditFailureReason_unspecified");
        A04 = editFailureReason;
        EditFailureReason[] editFailureReasonArr = {editFailureReason, new EditFailureReason("MEDIA_EXCEEDS_EXPECTED_AGE", 1, "media_exceeds_expected_age")};
        A03 = editFailureReasonArr;
        A02 = AbstractC12190kN.A00(editFailureReasonArr);
        EditFailureReason[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EditFailureReason editFailureReason2 : values) {
            A18.put(editFailureReason2.A00, editFailureReason2);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(68);
    }

    public static EditFailureReason valueOf(String str) {
        return (EditFailureReason) Enum.valueOf(EditFailureReason.class, str);
    }

    public static EditFailureReason[] values() {
        return (EditFailureReason[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EditFailureReason(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
