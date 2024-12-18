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
public final class IABScreenshotEffectOnUserAction implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IABScreenshotEffectOnUserAction[] A03;
    public static final IABScreenshotEffectOnUserAction A04;
    public static final IABScreenshotEffectOnUserAction A05;
    public static final IABScreenshotEffectOnUserAction A06;
    public static final IABScreenshotEffectOnUserAction A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction = new IABScreenshotEffectOnUserAction("UNRECOGNIZED", 0, "IABScreenshotEffectOnUserAction_unspecified");
        A07 = iABScreenshotEffectOnUserAction;
        IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction2 = new IABScreenshotEffectOnUserAction("BLUR", 1, "BLUR");
        A04 = iABScreenshotEffectOnUserAction2;
        IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction3 = new IABScreenshotEffectOnUserAction("BRIGHT", 2, "BRIGHT");
        A05 = iABScreenshotEffectOnUserAction3;
        IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction4 = new IABScreenshotEffectOnUserAction("REDIRECT_TO_IAB", 3, "REDIRECT_TO_IAB");
        A06 = iABScreenshotEffectOnUserAction4;
        IABScreenshotEffectOnUserAction[] iABScreenshotEffectOnUserActionArr = {iABScreenshotEffectOnUserAction, iABScreenshotEffectOnUserAction2, iABScreenshotEffectOnUserAction3, iABScreenshotEffectOnUserAction4, new IABScreenshotEffectOnUserAction("TOAST", 4, "TOAST")};
        A03 = iABScreenshotEffectOnUserActionArr;
        A02 = AbstractC12190kN.A00(iABScreenshotEffectOnUserActionArr);
        IABScreenshotEffectOnUserAction[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction5 : values) {
            A18.put(iABScreenshotEffectOnUserAction5.A00, iABScreenshotEffectOnUserAction5);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(12);
    }

    public static IABScreenshotEffectOnUserAction valueOf(String str) {
        return (IABScreenshotEffectOnUserAction) Enum.valueOf(IABScreenshotEffectOnUserAction.class, str);
    }

    public static IABScreenshotEffectOnUserAction[] values() {
        return (IABScreenshotEffectOnUserAction[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IABScreenshotEffectOnUserAction(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
