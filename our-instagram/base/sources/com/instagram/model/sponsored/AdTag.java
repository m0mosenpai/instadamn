package com.instagram.model.sponsored;

import X.C00O;
import X.C14360o3;
import X.C9Ay;
import X.EnumC53319Nhv;
import X.InterfaceC87713vf;
import android.graphics.PointF;
import android.os.Parcel;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;

/* loaded from: classes3.dex */
public final class AdTag extends Tag {
    public AdTagModel A00;
    public final Integer A01;

    /* loaded from: classes3.dex */
    public final class AdTagModel implements TaggableModel {
        public static final C9Ay CREATOR = new C9Ay(42);
        public InterfaceC87713vf A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            InterfaceC87713vf interfaceC87713vf = this.A00;
            parcel.writeValue(interfaceC87713vf.AZE());
            parcel.writeString(interfaceC87713vf.getTitle());
            parcel.writeString(interfaceC87713vf.getSubtitle());
        }

        @Override // com.instagram.tagging.model.TaggableModel
        public final String getId() {
            return String.valueOf(this.A00.AZE());
        }
    }

    @Override // com.instagram.tagging.model.Tag
    public final String A03() {
        return "ad_id";
    }

    @Override // com.instagram.tagging.model.Tag
    public final PointF A00() {
        return super.A00;
    }

    @Override // com.instagram.tagging.model.Tag
    public final EnumC53319Nhv A01() {
        return EnumC53319Nhv.A03;
    }

    @Override // com.instagram.tagging.model.Tag
    public final /* bridge */ /* synthetic */ TaggableModel A02() {
        return this.A00;
    }

    @Override // com.instagram.tagging.model.Tag
    public final String A04() {
        String title = this.A00.A00.getTitle();
        if (title != null) {
            return title;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AdTag(PointF pointF, AdTagModel adTagModel, Integer num) {
        this.A00 = adTagModel;
        this.A01 = num;
        super.A00 = pointF;
    }

    @Override // com.instagram.tagging.model.Tag
    public final /* bridge */ /* synthetic */ void A06(TaggableModel taggableModel) {
        throw C00O.createAndThrow();
    }
}
