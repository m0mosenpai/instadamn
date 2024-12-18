package com.instagram.creation.capture.quickcapture.commentreply.model;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C05F;
import X.C14360o3;
import X.C148276lx;
import X.C5NG;
import X.C6RO;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class ReelsVisualRepliesModel extends C6RO implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(48);
    public MediaVCRTappableData A00;
    public final boolean A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReelsVisualRepliesModel) {
                ReelsVisualRepliesModel reelsVisualRepliesModel = (ReelsVisualRepliesModel) obj;
                if (!C14360o3.A0K(this.A00, reelsVisualRepliesModel.A00) || this.A01 != reelsVisualRepliesModel.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final ReelsVisualRepliesModel A00(String str, String str2) {
        MediaVCRTappableData mediaVCRTappableData = this.A00;
        MediaVCRTappableData mediaVCRTappableData2 = null;
        if (mediaVCRTappableData != null) {
            boolean z = mediaVCRTappableData.A0A;
            Float f = mediaVCRTappableData.A01;
            User user = mediaVCRTappableData.A00;
            String str3 = mediaVCRTappableData.A04;
            String str4 = mediaVCRTappableData.A05;
            String str5 = mediaVCRTappableData.A06;
            String str6 = mediaVCRTappableData.A07;
            Float f2 = mediaVCRTappableData.A02;
            String str7 = mediaVCRTappableData.A09;
            AbstractC167017dG.A0x();
            mediaVCRTappableData2 = new MediaVCRTappableData(user, f, f2, str2, str3, str4, str5, str6, str, str7, z);
        }
        return new ReelsVisualRepliesModel(mediaVCRTappableData2, false);
    }

    public final void A01(Float f) {
        MediaVCRTappableData mediaVCRTappableData;
        MediaVCRTappableData mediaVCRTappableData2 = this.A00;
        if (mediaVCRTappableData2 != null) {
            boolean z = mediaVCRTappableData2.A0A;
            String str = mediaVCRTappableData2.A03;
            User user = mediaVCRTappableData2.A00;
            String str2 = mediaVCRTappableData2.A04;
            String str3 = mediaVCRTappableData2.A05;
            String str4 = mediaVCRTappableData2.A06;
            String str5 = mediaVCRTappableData2.A07;
            String str6 = mediaVCRTappableData2.A08;
            Float f2 = mediaVCRTappableData2.A02;
            String str7 = mediaVCRTappableData2.A09;
            AbstractC167017dG.A0x();
            mediaVCRTappableData = new MediaVCRTappableData(user, f, f2, str, str2, str3, str4, str5, str6, str7, z);
        } else {
            mediaVCRTappableData = null;
        }
        this.A00 = mediaVCRTappableData;
    }

    public final void A02(Float f) {
        MediaVCRTappableData mediaVCRTappableData;
        MediaVCRTappableData mediaVCRTappableData2 = this.A00;
        if (mediaVCRTappableData2 != null) {
            boolean z = mediaVCRTappableData2.A0A;
            String str = mediaVCRTappableData2.A03;
            Float f2 = mediaVCRTappableData2.A01;
            User user = mediaVCRTappableData2.A00;
            String str2 = mediaVCRTappableData2.A04;
            String str3 = mediaVCRTappableData2.A05;
            String str4 = mediaVCRTappableData2.A06;
            String str5 = mediaVCRTappableData2.A07;
            String str6 = mediaVCRTappableData2.A08;
            String str7 = mediaVCRTappableData2.A09;
            AbstractC167017dG.A0x();
            mediaVCRTappableData = new MediaVCRTappableData(user, f2, f, str, str2, str3, str4, str5, str6, str7, z);
        } else {
            mediaVCRTappableData = null;
        }
        this.A00 = mediaVCRTappableData;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0f;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public ReelsVisualRepliesModel(MediaVCRTappableData mediaVCRTappableData, boolean z) {
        this.A00 = mediaVCRTappableData;
        this.A01 = z;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        AbstractC166987dD.A1V(C148276lx.A1M, A0V);
        return A0V;
    }

    public ReelsVisualRepliesModel() {
        this(null, false);
    }
}
