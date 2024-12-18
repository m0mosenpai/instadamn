package com.instagram.model.fbusertag;

import X.C2I7;
import X.C55343Oh9;
import X.C9Ay;
import android.graphics.PointF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.api.schemas.FBTagType;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class FBUserTag extends Tag {
    public static final Parcelable.Creator CREATOR = new C9Ay(10);
    public PointF A00;
    public FBTagType A01;
    public FBUserInfo A02;
    public String A03;
    public boolean A04;

    /* loaded from: classes9.dex */
    public class FBUserInfo implements TaggableModel {
        public static final Parcelable.Creator CREATOR = C55343Oh9.A00(81);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                FBUserInfo fBUserInfo = (FBUserInfo) obj;
                if (!TextUtils.equals(this.A05, fBUserInfo.A05) || !TextUtils.equals(this.A01, fBUserInfo.A01)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.instagram.tagging.model.TaggableModel
        public final String getId() {
            return this.A05;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.A05, this.A00, this.A01, this.A02, this.A03, this.A04, this.A06});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A05);
            parcel.writeString(this.A00);
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeString(this.A03);
            parcel.writeString(this.A04);
            parcel.writeString(this.A06);
        }
    }

    @Override // com.instagram.tagging.model.Tag
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            FBUserTag fBUserTag = (FBUserTag) obj;
            if (this.A04 != fBUserTag.A04 || !C2I7.A00(this.A02, fBUserTag.A02) || !C2I7.A00(this.A03, fBUserTag.A03) || this.A01 != fBUserTag.A01) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.instagram.model.fbusertag.FBUserTag$FBUserInfo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FBUserTag(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.Class<com.instagram.model.fbusertag.FBUserTag$FBUserInfo> r3 = com.instagram.model.fbusertag.FBUserTag.FBUserInfo.class
            java.lang.ClassLoader r0 = r3.getClassLoader()
            r0.getClass()
            r4.<init>(r5, r0)
            r2 = 0
            r4.A04 = r2
            java.lang.ClassLoader r0 = r3.getClassLoader()
            android.os.Parcelable r0 = r5.readParcelable(r0)
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = (com.instagram.model.fbusertag.FBUserTag.FBUserInfo) r0
            java.lang.String r1 = ""
            if (r0 != 0) goto L26
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = new com.instagram.model.fbusertag.FBUserTag$FBUserInfo
            r0.<init>()
            r0.A05 = r1
            r0.A01 = r1
        L26:
            r4.A02 = r0
            java.lang.String r0 = r5.readString()
            if (r0 == 0) goto L60
            r4.A03 = r0
        L30:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L57
            boolean r2 = r5.readBoolean()
        L3a:
            r4.A04 = r2
            java.lang.ClassLoader r0 = r3.getClassLoader()
            android.os.Parcelable r0 = r5.readParcelable(r0)
            com.instagram.api.schemas.FBTagType r0 = (com.instagram.api.schemas.FBTagType) r0
            r4.A01 = r0
            java.lang.Class<android.graphics.PointF> r0 = android.graphics.PointF.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r5.readParcelable(r0)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            r4.A00 = r0
            return
        L57:
            int r1 = r5.readInt()
            r0 = 1
            if (r1 != r0) goto L3a
            r2 = 1
            goto L3a
        L60:
            r4.A03 = r1
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.fbusertag.FBUserTag.<init>(android.os.Parcel):void");
    }

    @Override // com.instagram.tagging.model.Tag
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.A02, this.A03, Boolean.valueOf(this.A04), this.A01, this.A00});
    }

    @Override // com.instagram.tagging.model.Tag, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = this.A04;
        if (i2 >= 29) {
            parcel.writeBoolean(z);
        } else {
            parcel.writeInt(z ? 1 : 0);
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }
}
