package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.EnumC39621HeV;
import X.EnumC61218RhI;
import android.os.Parcel;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.privacy.zone.api.ZonedValue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public class IABLaunchEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final IabCommonTrait A02;
    public final IABViewModeLaunchConfig A03;
    public final ZonedValue A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public IABLaunchEvent(IabCommonTrait iabCommonTrait, IABViewModeLaunchConfig iABViewModeLaunchConfig, ZonedValue zonedValue, String str, String str2, String str3, List list, long j, long j2, long j3, long j4) {
        super(EnumC61218RhI.IAB_LAUNCH, str, j, j2);
        this.A04 = zonedValue;
        this.A01 = j3;
        this.A05 = str2;
        this.A00 = j4;
        this.A07 = list;
        this.A03 = iABViewModeLaunchConfig;
        this.A02 = iabCommonTrait;
        this.A06 = str3;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABLaunchEvent{");
        A0s.append("userClickTs=");
        A0s.append(this.A01);
        A0s.append(", clickSource='");
        char A00 = AbstractC58319PtB.A00(this.A05, A0s);
        A0s.append(", flags=");
        A0s.append(this.A00);
        AbstractC58321PtD.A1J(this, A0s, A00);
        AbstractC58318PtA.A1L(this, A0s);
        A0s.append(", eligibleExperiences=");
        List list = this.A07;
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((EnumC39621HeV) list.get(i)).A00;
        }
        A0s.append(Arrays.toString(strArr));
        A0s.append(", iabViewModeLaunchConfig=");
        A0s.append(this.A03);
        A0s.append(", iabContext=");
        A0s.append(this.A02);
        A0s.append(", extraInfo=");
        A0s.append(this.A06);
        return AbstractC167027dH.A0R(A0s);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A00);
        List list = this.A07;
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = ((EnumC39621HeV) list.get(i2)).A00;
        }
        parcel.writeStringArray(strArr);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A06);
    }
}
