package com.instagram.reels.questionv2.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import X.I5T;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class QuestionMediaResponseModel extends C0T6 implements QuestionMediaResponseModelIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(35);
    public final ImageInfo A00;
    public final SpritesheetInfo A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final QuestionMediaResponseModel F74() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QuestionMediaResponseModel) {
                QuestionMediaResponseModel questionMediaResponseModel = (QuestionMediaResponseModel) obj;
                if (!C14360o3.A0K(this.A02, questionMediaResponseModel.A02) || !C14360o3.A0K(this.A07, questionMediaResponseModel.A07) || !C14360o3.A0K(this.A00, questionMediaResponseModel.A00) || !C14360o3.A0K(this.A03, questionMediaResponseModel.A03) || !C14360o3.A0K(this.A04, questionMediaResponseModel.A04) || !C14360o3.A0K(this.A05, questionMediaResponseModel.A05) || !C14360o3.A0K(this.A06, questionMediaResponseModel.A06) || !C14360o3.A0K(this.A01, questionMediaResponseModel.A01) || !C14360o3.A0K(this.A08, questionMediaResponseModel.A08) || !C14360o3.A0K(this.A09, questionMediaResponseModel.A09) || !C14360o3.A0K(this.A0A, questionMediaResponseModel.A0A) || !C14360o3.A0K(this.A0B, questionMediaResponseModel.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC31179DnN.A0p(parcel, this.A02);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A00, i);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A05, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A06, 0, 1);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        List list = this.A0B;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
        while (A0l.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0l, i);
        }
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Boolean BB7() {
        return this.A02;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final ImageInfo BGx() {
        return this.A00;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Integer BRq() {
        return this.A04;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Integer BZo() {
        return this.A05;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Integer Ba2() {
        return this.A06;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final SpritesheetInfo C8E() {
        return this.A01;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final String CFK() {
        return this.A0A;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final List CFe() {
        return this.A0B;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final Integer CSN() {
        return this.A03;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryQuestionMediaResponseDict", I5T.A00(this));
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final String getId() {
        return this.A07;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final String getVideoCodec() {
        return this.A08;
    }

    @Override // com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf
    public final String getVideoDashManifest() {
        return this.A09;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC166997dE.A0I(this.A0B);
    }

    public QuestionMediaResponseModel(ImageInfo imageInfo, SpritesheetInfo spritesheetInfo, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, List list) {
        this.A02 = bool;
        this.A07 = str;
        this.A00 = imageInfo;
        this.A03 = num;
        this.A04 = num2;
        this.A05 = num3;
        this.A06 = num4;
        this.A01 = spritesheetInfo;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = list;
    }
}
