package com.instagram.filterkit.filtergroup.model.impl;

import X.AE6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.filterkit.filtergroup.model.intf.FilterModelProvider;

/* loaded from: classes4.dex */
public final class FilterGroupModelImpl implements FilterGroupModel {
    public static final Parcelable.Creator CREATOR = new C206139Av(98);
    public int A00;
    public PhotoFilter A01;
    public final FilterChain A02;
    public final Integer A03;
    public final boolean A04;

    public FilterGroupModelImpl(FilterChain filterChain, PhotoFilter photoFilter, Integer num, int i, boolean z) {
        FilterModel filterModel;
        C14360o3.A0B(filterChain, 1);
        this.A02 = filterChain;
        this.A03 = num;
        this.A01 = photoFilter;
        this.A00 = i;
        this.A04 = z;
        if (i != -1 && (filterModel = (FilterModel) filterChain.A01.get(i)) != null && photoFilter != null) {
            photoFilter.A03 = (ColorFilter) filterModel;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) obj;
            if (!C14360o3.A0K(this.A02, filterGroupModelImpl.A02) || this.A03 != filterGroupModelImpl.A03 || this.A04 != filterGroupModelImpl.A04) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(AE6.A01(this.A03));
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    @Override // com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel
    public final boolean CUm(int i) {
        FilterModel filterModel = (FilterModel) this.A02.A01.get(i);
        if (filterModel != null && filterModel.isEnabled()) {
            return true;
        }
        return false;
    }

    @Override // com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel
    public final /* bridge */ /* synthetic */ FilterGroupModelImpl E3K() {
        FilterChain deepCopy = this.A02.deepCopy();
        Integer num = this.A03;
        PhotoFilter photoFilter = this.A01;
        PhotoFilter photoFilter2 = null;
        if (photoFilter != null) {
            Parcel obtain = Parcel.obtain();
            photoFilter.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            photoFilter2 = new PhotoFilter(obtain);
        }
        return new FilterGroupModelImpl(deepCopy, photoFilter2, num, this.A00, true);
    }

    @Override // com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel
    public final void EUT(FilterModel filterModel, int i) {
        this.A02.A01(filterModel, i);
    }

    @Override // com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel
    public final void EUU(FilterModelProvider filterModelProvider, int i) {
        if (filterModelProvider instanceof PhotoFilter) {
            this.A01 = (PhotoFilter) filterModelProvider;
            this.A00 = i;
        }
        this.A02.A01(filterModelProvider.B6R(), i);
    }

    @Override // com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel
    public final void EUV(int i, boolean z) {
        FilterModel filterModel = (FilterModel) this.A02.A01.get(i);
        if (filterModel != null) {
            filterModel.setEnabled(z);
        }
    }
}
