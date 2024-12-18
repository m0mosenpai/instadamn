package com.instagram.model.barcelonashare;

import X.C00O;
import X.EnumC53319Nhv;
import android.graphics.PointF;
import android.os.Parcel;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;

/* loaded from: classes7.dex */
public final class BarcelonaTag extends Tag {
    public BarcelonaTagModel A00;

    /* loaded from: classes7.dex */
    public final class BarcelonaTagModel implements TaggableModel {
        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
        }

        @Override // com.instagram.tagging.model.TaggableModel
        public final String getId() {
            return "";
        }
    }

    @Override // com.instagram.tagging.model.Tag
    public final String A03() {
        return "";
    }

    @Override // com.instagram.tagging.model.Tag
    public final String A04() {
        return "";
    }

    @Override // com.instagram.tagging.model.Tag
    public final PointF A00() {
        return super.A00;
    }

    @Override // com.instagram.tagging.model.Tag
    public final EnumC53319Nhv A01() {
        return EnumC53319Nhv.A04;
    }

    @Override // com.instagram.tagging.model.Tag
    public final /* bridge */ /* synthetic */ TaggableModel A02() {
        return this.A00;
    }

    @Override // com.instagram.tagging.model.Tag
    public final /* bridge */ /* synthetic */ void A06(TaggableModel taggableModel) {
        throw C00O.createAndThrow();
    }
}
