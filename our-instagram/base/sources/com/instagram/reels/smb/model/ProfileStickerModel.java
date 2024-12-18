package com.instagram.reels.smb.model;

import X.A2A;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC201078up;
import X.AbstractC221915u;
import X.C05F;
import X.C0T6;
import X.C14360o3;
import X.C148276lx;
import X.C17z;
import X.C37324GcR;
import X.C38687GzS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.user.model.User;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public final class ProfileStickerModel extends C0T6 implements Parcelable {
    public C38687GzS[] A00;
    public final C148276lx A01;
    public final ProfileStickerAiAgentData A02;
    public final User A03;
    public final Integer A04;
    public final Integer A05;
    public final boolean A06;
    public static final Parcelable.Creator CREATOR = new C37324GcR(37);
    public static final Integer A08 = C05F.A01;
    public static final C148276lx A07 = C148276lx.A1Z;

    public ProfileStickerModel(C148276lx c148276lx, ProfileStickerAiAgentData profileStickerAiAgentData, User user, Integer num, Integer num2) {
        C14360o3.A0B(num, 3);
        this.A03 = user;
        this.A01 = c148276lx;
        this.A05 = num;
        this.A04 = num2;
        this.A02 = profileStickerAiAgentData;
        this.A06 = AbstractC167007dF.A1X(num2, C05F.A00);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileStickerModel) {
                ProfileStickerModel profileStickerModel = (ProfileStickerModel) obj;
                if (!C14360o3.A0K(this.A03, profileStickerModel.A03) || !C14360o3.A0K(this.A01, profileStickerModel.A01) || this.A05 != profileStickerModel.A05 || this.A04 != profileStickerModel.A04 || !C14360o3.A0K(this.A02, profileStickerModel.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        C148276lx c148276lx = this.A01;
        C14360o3.A0B(c148276lx, 0);
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        AbstractC201078up.A00(A0A, c148276lx);
        A0A.close();
        parcel.writeString(stringWriter.toString());
        parcel.writeString(A2A.A00(this.A05));
        switch (this.A04.intValue()) {
            case 1:
                str = "PERSONAL";
                break;
            case 2:
                str = "AI_AGENT";
                break;
            default:
                str = "BUSINESS";
                break;
        }
        parcel.writeString(str);
        ProfileStickerAiAgentData profileStickerAiAgentData = this.A02;
        if (profileStickerAiAgentData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profileStickerAiAgentData.writeToParcel(parcel, i);
        }
    }

    public final String A00() {
        int length;
        C38687GzS[] c38687GzSArr = this.A00;
        if (c38687GzSArr != null && (length = c38687GzSArr.length) >= 3 && c38687GzSArr[0] != null && c38687GzSArr[1] != null && c38687GzSArr[2] != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            int i = 0;
            do {
                C38687GzS c38687GzS = c38687GzSArr[i];
                if (A1C.length() > 0) {
                    A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                if (c38687GzS != null) {
                    A1C.append(c38687GzS.A01);
                }
                i++;
            } while (i < length);
            return A1C.toString();
        }
        return null;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0M(this.A03) * 31);
        Integer num = this.A05;
        int A0L = AbstractC167017dG.A0L(num, A2A.A00(num), A0J);
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "PERSONAL";
                break;
            case 2:
                str = "AI_AGENT";
                break;
            default:
                str = "BUSINESS";
                break;
        }
        return ((A0L + str.hashCode() + intValue) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
