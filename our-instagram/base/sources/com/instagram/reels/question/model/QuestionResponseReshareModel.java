package com.instagram.reels.question.model;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C22932A9c;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class QuestionResponseReshareModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(33);
    public final int A00;
    public final MusicQuestionResponseModelIntf A01;
    public final C22932A9c A02;
    public final QuestionResponseType A03;
    public final QuestionMediaResponseModelIntf A04;
    public final User A05;
    public final User A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A06, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.A9c, java.lang.Object] */
    public QuestionResponseReshareModel(MusicQuestionResponseModelIntf musicQuestionResponseModelIntf, QuestionResponseType questionResponseType, QuestionMediaResponseModelIntf questionMediaResponseModelIntf, User user, User user2, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        AbstractC167017dG.A1R(str, str2);
        AbstractC167017dG.A1S(str3, questionResponseType);
        C14360o3.A0B(str5, 9);
        this.A00 = i;
        this.A0A = str;
        this.A0C = str2;
        this.A07 = str3;
        this.A03 = questionResponseType;
        this.A08 = str4;
        this.A01 = musicQuestionResponseModelIntf;
        this.A04 = questionMediaResponseModelIntf;
        this.A0B = str5;
        this.A09 = z;
        this.A05 = user;
        this.A06 = user2;
        Boolean valueOf = Boolean.valueOf(z);
        ?? obj = new Object();
        obj.A02 = str;
        obj.A04 = str2;
        obj.A03 = str5;
        obj.A01 = valueOf;
        obj.A00 = questionResponseType;
        this.A02 = obj;
    }
}
