package com.facebook.iabeventlogging.model;

import X.AbstractC166997dE;
import X.C14360o3;
import X.EnumC61218RhI;
import X.VHg;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IABScreenshotImpressionEvent extends IABEvent {
    public final VHg A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABScreenshotImpressionEvent(VHg vHg, String str, String str2, String str3, long j) {
        super(EnumC61218RhI.IAB_SCREENSHOT_IMPRESSION, str, j, j);
        C14360o3.A0B(vHg, 4);
        this.A02 = str2;
        this.A00 = vHg;
        this.A01 = str3;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeString(this.A01);
    }
}
