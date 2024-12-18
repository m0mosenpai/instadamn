package com.instagram.creation.capture.gallery.ui;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC31172DnG;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class GalleryPickerView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = LNM.A00(43);
    public int A00;
    public String A01;
    public String A02;
    public Map A03;
    public boolean A04;
    public boolean A05;
    public float[] A06;
    public String[] A07;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeFloatArray(this.A06);
        parcel.writeStringArray(this.A07);
        parcel.writeInt(this.A05 ? 1 : 0);
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A03);
        while (A0s.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A0s);
            String A17 = AbstractC31172DnG.A17(A1K);
            GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) A1K.getValue();
            parcel.writeString(A17);
            parcel.writeParcelable(galleryPreviewInfo, i);
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GalleryPickerView.SavedState{");
        A1C.append(Integer.toHexString(System.identityHashCode(this)));
        A1C.append(" folderId=");
        A1C.append(this.A00);
        A1C.append(" folderName=");
        A1C.append(this.A01);
        A1C.append(" mediumId=");
        A1C.append(this.A02);
        return AbstractC167027dH.A0R(A1C);
    }
}
