package com.instagram.direct.integrity.banner.fullscreen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.AbstractC31181DnP;
import X.AbstractC43591JPw;
import X.C0T6;
import X.C14360o3;
import X.C16930sl;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FullscreenBannerViewModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(12);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    /* loaded from: classes6.dex */
    public final class SectionBulletPoint extends C0T6 implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LNL(13);
        public final Integer A00;
        public final String A01;
        public final String A02;
        public final String A03;

        public SectionBulletPoint(Integer num, String str, String str2, String str3) {
            C14360o3.A0B(str2, 2);
            this.A01 = str;
            this.A03 = str2;
            this.A02 = str3;
            this.A00 = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SectionBulletPoint) {
                    SectionBulletPoint sectionBulletPoint = (SectionBulletPoint) obj;
                    if (!C14360o3.A0K(this.A01, sectionBulletPoint.A01) || !C14360o3.A0K(this.A03, sectionBulletPoint.A03) || !C14360o3.A0K(this.A02, sectionBulletPoint.A02) || !C14360o3.A0K(this.A00, sectionBulletPoint.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A03);
            parcel.writeString(this.A02);
            parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
        }

        public final int hashCode() {
            return ((AbstractC166997dE.A0K(this.A03, AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("SectionBulletPoint(iconURL=");
            A1C.append(this.A01);
            A1C.append(", text=");
            A1C.append(this.A03);
            A1C.append(", subtext=");
            A1C.append(this.A02);
            A1C.append(", iconImageDrawable=");
            return AbstractC167017dG.A0o(this.A00, A1C);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FullscreenBannerViewModel) {
                FullscreenBannerViewModel fullscreenBannerViewModel = (FullscreenBannerViewModel) obj;
                if (!C14360o3.A0K(this.A01, fullscreenBannerViewModel.A01) || !C14360o3.A0K(this.A03, fullscreenBannerViewModel.A03) || !C14360o3.A0K(this.A02, fullscreenBannerViewModel.A02) || !C14360o3.A0K(this.A04, fullscreenBannerViewModel.A04) || !C14360o3.A0K(this.A00, fullscreenBannerViewModel.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A04);
        while (A0u.hasNext()) {
            ((SectionBulletPoint) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A04, ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public FullscreenBannerViewModel(Integer num, String str, String str2, String str3, List list) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = list;
        this.A00 = num;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FullscreenBannerViewModel(headlineImageURL=");
        A1C.append(this.A01);
        A1C.append(AbstractC43591JPw.A00(512));
        A1C.append(this.A03);
        A1C.append(", headlineSubtitle=");
        A1C.append(this.A02);
        A1C.append(", descriptionSection=");
        A1C.append(this.A04);
        A1C.append(", headlineImageDrawable=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public FullscreenBannerViewModel() {
        this(null, null, null, null, C16930sl.A00);
    }
}
