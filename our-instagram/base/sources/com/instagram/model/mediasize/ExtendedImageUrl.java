package com.instagram.model.mediasize;

import X.AbstractC06930Yk;
import X.AnonymousClass001;
import X.C09530e4;
import X.C0w9;
import X.C14360o3;
import X.C36G;
import X.C36H;
import X.C36J;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ExpirableImageUrl;
import com.instagram.common.typedurl.ImageLoggingData;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ExtendedImageUrl extends ExpirableImageUrl {
    public static final Parcelable.Creator CREATOR = new C9Ay(15);
    public ImageLoggingData A00;
    public ExtendedImageUrl A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public List A08;
    public List A09;
    public final String A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtendedImageUrl(X.C37926GmO r10) {
        /*
            r9 = this;
            r0 = 1
            X.C14360o3.A0B(r10, r0)
            java.lang.String r0 = "url"
            java.lang.String r5 = r10.getStringValue(r0)
            if (r5 == 0) goto L52
            java.lang.String r0 = "url_expiration_timestamp_us"
            java.lang.Long r4 = r10.getOptionalTimeValue(r0)
            java.lang.Class<X.GmO> r1 = X.C37926GmO.class
            java.lang.String r0 = "fallback"
            com.facebook.pando.TreeJNI r0 = r10.getTreeValue(r0, r1)
            X.GmO r0 = (X.C37926GmO) r0
            if (r0 == 0) goto L50
            com.instagram.model.mediasize.ExtendedImageUrl r1 = new com.instagram.model.mediasize.ExtendedImageUrl
            r1.<init>(r0)
        L26:
            java.lang.String r0 = "width"
            java.lang.Integer r2 = r10.getOptionalIntValue(r0)
            java.lang.String r0 = "height"
            java.lang.Integer r3 = r10.getOptionalIntValue(r0)
            java.lang.String r0 = "scans_profile"
            java.lang.String r6 = r10.getStringValue(r0)
            java.lang.String r0 = "estimated_scans_sizes"
            com.google.common.collect.ImmutableList r8 = r10.getIntList(r0)
            java.lang.String r0 = "color_preview_hex"
            java.lang.String r7 = r10.getStringValue(r0)
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.A01()
            return
        L50:
            r1 = 0
            goto L26
        L52:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.mediasize.ExtendedImageUrl.<init>(X.GmO):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) obj;
            if (!C14360o3.A0K(this.A0A, extendedImageUrl.A0A) || !C14360o3.A0K(B39(), extendedImageUrl.B39()) || !C14360o3.A0K(this.A01, extendedImageUrl.A01) || getWidth() != extendedImageUrl.getWidth() || getHeight() != extendedImageUrl.getHeight() || !C14360o3.A0K(this.A07, extendedImageUrl.A07) || !C14360o3.A0K(this.A08, extendedImageUrl.A08)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j;
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(0);
        parcel.writeString(this.A0A);
        Long l = this.A05;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        parcel.writeLong(j);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        parcel.writeString(this.A07);
        int i2 = 1;
        int i3 = 0;
        if (this.A08 != null) {
            i3 = 1;
        }
        parcel.writeInt(i3);
        List list = this.A08;
        if (list != null) {
            parcel.writeList(list);
        }
        parcel.writeString(this.A06);
        parcel.writeValue(this.A02);
        parcel.writeParcelable(this.A00, i);
        if (this.A09 == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        List list2 = this.A09;
        if (list2 != null) {
            parcel.writeList(list2);
        }
    }

    public final TreeUpdaterJNI A00() {
        TreeUpdaterJNI treeUpdaterJNI;
        C09530e4 c09530e4 = new C09530e4("url", this.A0A);
        C09530e4 c09530e42 = new C09530e4("url_expiration_timestamp_us", this.A05);
        ExtendedImageUrl extendedImageUrl = this.A01;
        if (extendedImageUrl != null) {
            treeUpdaterJNI = extendedImageUrl.A00();
        } else {
            treeUpdaterJNI = null;
        }
        LinkedHashMap A06 = AbstractC06930Yk.A06(c09530e4, c09530e42, new C09530e4("fallback", treeUpdaterJNI), new C09530e4(IgReactMediaPickerNativeModule.WIDTH, this.A04), new C09530e4(IgReactMediaPickerNativeModule.HEIGHT, this.A03), new C09530e4("scans_profile", this.A07), new C09530e4("estimated_scans_sizes", this.A08), new C09530e4("color_preview_hex", this.A06));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : A06.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new TreeUpdaterJNI("XDTImageCandidate", linkedHashMap);
    }

    public final void A01() {
        int width;
        int height;
        String str = this.A0A;
        Integer num = this.A04;
        Integer num2 = this.A03;
        if (str == null) {
            String simpleName = getClass().getSimpleName();
            C14360o3.A07(simpleName);
            C0w9.A03(simpleName, "ExtendedImageUrl url can't be null");
        }
        if (num == null || num2 == null) {
            C0w9.A04("bad_image_url", AnonymousClass001.A0R(getClass().getSimpleName(), " - null width/height"), 10000);
        }
        if (this.A04 == null) {
            this.A04 = -1;
        }
        if (this.A03 == null) {
            this.A03 = -1;
        }
        ExtendedImageUrl extendedImageUrl = this.A01;
        if (extendedImageUrl != null) {
            Integer num3 = extendedImageUrl.A04;
            if (num3 == null || (width = num3.intValue()) == -1) {
                width = getWidth();
            }
            extendedImageUrl.A04 = Integer.valueOf(width);
            Integer num4 = extendedImageUrl.A03;
            if (num4 == null || (height = num4.intValue()) == -1) {
                height = getHeight();
            }
            extendedImageUrl.A03 = Integer.valueOf(height);
            Boolean bool = extendedImageUrl.A02;
            if (bool == null) {
                bool = this.A02;
            }
            extendedImageUrl.A02 = bool;
            String str2 = extendedImageUrl.A07;
            if (str2 == null) {
                str2 = this.A07;
            }
            extendedImageUrl.A07 = str2;
            List list = extendedImageUrl.A08;
            if (list == null) {
                list = this.A08;
            }
            extendedImageUrl.A08 = list;
            ImageLoggingData imageLoggingData = extendedImageUrl.A00;
            if (imageLoggingData == null) {
                imageLoggingData = this.A00;
            }
            extendedImageUrl.A00 = imageLoggingData;
        }
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final List B2e() {
        return this.A08;
    }

    @Override // X.InterfaceC224217b
    public final Long B39() {
        Long l = this.A05;
        if (l != null) {
            return Long.valueOf(C36J.A03(C36H.A04(C36G.A05, l.longValue())));
        }
        return null;
    }

    @Override // X.InterfaceC224217b
    public final /* bridge */ /* synthetic */ Object B4F() {
        return this.A01;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final Boolean BJa() {
        return this.A02;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final ImageLoggingData BOm() {
        return this.A00;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final List BxS() {
        return this.A09;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final int getHeight() {
        Integer num = this.A03;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final String getScansProfile() {
        return this.A07;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final String getUrl() {
        return this.A0A;
    }

    @Override // com.instagram.common.typedurl.ImageUrl
    public final int getWidth() {
        Integer num = this.A04;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final int hashCode() {
        int hashCode = this.A0A.hashCode();
        B39();
        ExtendedImageUrl extendedImageUrl = this.A01;
        if (extendedImageUrl != null) {
            extendedImageUrl.hashCode();
        }
        List list = this.A08;
        if (list != null) {
            list.hashCode();
        }
        return hashCode;
    }

    public ExtendedImageUrl(ExtendedImageUrl extendedImageUrl, Integer num, Integer num2, Long l, String str, String str2, String str3, List list) {
        C14360o3.A0B(str, 1);
        this.A0A = str;
        this.A05 = l;
        this.A01 = extendedImageUrl;
        this.A04 = num;
        this.A03 = num2;
        this.A07 = str2;
        this.A08 = list;
        this.A06 = str3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtendedImageUrl(String str, int i, int i2) {
        this(null, Integer.valueOf(i), Integer.valueOf(i2), null, str, null, null, null);
        C14360o3.A0B(str, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtendedImageUrl(com.instagram.common.typedurl.ImageUrl r4) {
        /*
            r3 = this;
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            java.lang.String r2 = r4.getUrl()
            X.C14360o3.A07(r2)
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            r3.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.mediasize.ExtendedImageUrl.<init>(com.instagram.common.typedurl.ImageUrl):void");
    }
}
