package com.instagram.common.gallery.model;

import X.AbstractC111324zv;
import X.AbstractC43591JPw;
import X.AbstractC81033jX;
import X.C05F;
import X.C14360o3;
import X.C183978Ee;
import X.C195858lV;
import X.C195868lW;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes4.dex */
public class GalleryItem implements Parcelable {
    public static int A0B;
    public Medium A00;
    public final int A01;
    public final Draft A02;
    public final GeneratedMediaMetadata A03;
    public final RemoteMedia A04;
    public final C195858lV A05;
    public final ImageUrl A06;
    public final C183978Ee A07;
    public final C195868lW A08;
    public final Integer A09;
    public final String A0A;

    /* loaded from: classes4.dex */
    public final class LocalGalleryMedium extends GalleryItem {
        public final Medium A00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalGalleryMedium(Medium medium, String str) {
            super(null, null, medium, null, null, null, null, null, C05F.A00, str, -1);
            C14360o3.A0B(str, 2);
            this.A00 = medium;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryItem(RemoteMedia remoteMedia) {
        this(null, null, null, remoteMedia, null, remoteMedia.A03, null, null, C05F.A0C, remoteMedia.A06, -1);
        C14360o3.A0B(remoteMedia, 1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Object obj2;
        Object obj3;
        C195858lV c195858lV;
        if (this != obj) {
            if (!(obj instanceof GalleryItem)) {
                return false;
            }
            GalleryItem galleryItem = (GalleryItem) obj;
            if (!C14360o3.A0K(this.A0A, galleryItem.A0A) || (num = this.A09) != galleryItem.A09) {
                return false;
            }
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3 && intValue == 4 && ((c195858lV = this.A05) == null || !c195858lV.equals(galleryItem.A05))) {
                            return false;
                        }
                    } else {
                        obj2 = this.A04;
                        obj3 = galleryItem.A04;
                    }
                } else {
                    obj2 = this.A02;
                    obj3 = galleryItem.A02;
                }
            } else {
                obj2 = this.A00;
                obj3 = galleryItem.A00;
            }
            return C14360o3.A0K(obj2, obj3);
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        switch (this.A09.intValue()) {
            case 1:
                str = "DRAFT";
                break;
            case 2:
                i2 = 683;
                str = AbstractC43591JPw.A00(i2);
                break;
            case 3:
                i2 = 551;
                str = AbstractC43591JPw.A00(i2);
                break;
            case 4:
                str = AbstractC111324zv.A00(683);
                break;
            case 5:
                i2 = 549;
                str = AbstractC43591JPw.A00(i2);
                break;
            case 6:
                i2 = 550;
                str = AbstractC43591JPw.A00(i2);
                break;
            case 7:
                str = "URL";
                break;
            case 8:
                i2 = 614;
                str = AbstractC43591JPw.A00(i2);
                break;
            default:
                i2 = 653;
                str = AbstractC43591JPw.A00(i2);
                break;
        }
        parcel.writeString(str);
    }

    public final boolean A01() {
        switch (this.A09.intValue()) {
            case 0:
                if (this.A00 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return false;
            case 1:
                Draft draft = this.A02;
                if (draft != null) {
                    return draft.A05;
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
                if (this.A04 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return false;
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 4:
                C195858lV c195858lV = this.A05;
                if (c195858lV != null && c195858lV.A03) {
                    return true;
                }
                return false;
            default:
                throw new RuntimeException();
        }
    }

    public final boolean A02() {
        if (this.A09 != C05F.A00) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        switch (this.A09.intValue()) {
            case 0:
                Medium medium = this.A00;
                if (medium != null) {
                    return medium.A05();
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                return false;
            case 2:
                RemoteMedia remoteMedia = this.A04;
                if (remoteMedia != null) {
                    if (remoteMedia.A09) {
                        return false;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 5:
                return true;
            default:
                throw new RuntimeException();
        }
    }

    public final boolean A04() {
        if (this.A09 != C05F.A0C) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        switch (this.A09.intValue()) {
            case 0:
                Medium medium = this.A00;
                if (medium != null) {
                    return medium.isValid();
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
                Draft draft = this.A02;
                if (draft != null) {
                    return draft.isValid();
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
                if (this.A04 != null) {
                    return !AbstractC81033jX.A03(r0.A04);
                }
                throw new IllegalStateException("Required value was null.");
            case 4:
                C195858lV c195858lV = this.A05;
                if (c195858lV == null || c195858lV.A01 == null) {
                    return false;
                }
                break;
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                throw new RuntimeException();
        }
    }

    public final boolean A06() {
        switch (this.A09.intValue()) {
            case 0:
                Medium medium = this.A00;
                if (medium != null) {
                    return medium.Cff();
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
                Draft draft = this.A02;
                if (draft != null) {
                    return draft.A06;
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
                RemoteMedia remoteMedia = this.A04;
                if (remoteMedia != null) {
                    return remoteMedia.A09;
                }
                throw new IllegalStateException("Required value was null.");
            case 3:
            case 5:
            case 7:
            case 8:
                return false;
            case 4:
                C195858lV c195858lV = this.A05;
                if (c195858lV == null || !c195858lV.A04) {
                    return false;
                }
                break;
            case 6:
                return true;
            default:
                throw new RuntimeException();
        }
    }

    public final int hashCode() {
        return this.A0A.hashCode();
    }

    public final String A00() {
        if (A02()) {
            Medium medium = this.A00;
            if (medium != null) {
                return medium.A0a;
            }
            throw new IllegalStateException("Required value was null.");
        }
        Draft draft = this.A02;
        if (draft != null) {
            return draft.A03;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryItem(C183978Ee c183978Ee, String str) {
        this(null, null, null, null, null, null, c183978Ee, null, C05F.A0j, str, -1);
        C14360o3.A0B(str, 2);
    }

    public GalleryItem(Draft draft, GeneratedMediaMetadata generatedMediaMetadata, Medium medium, RemoteMedia remoteMedia, C195858lV c195858lV, ImageUrl imageUrl, C183978Ee c183978Ee, C195868lW c195868lW, Integer num, String str, int i) {
        this.A09 = num;
        this.A0A = str;
        this.A02 = draft;
        this.A04 = remoteMedia;
        this.A05 = c195858lV;
        this.A07 = c183978Ee;
        this.A08 = c195868lW;
        this.A06 = imageUrl;
        this.A01 = i;
        this.A00 = medium;
        this.A03 = generatedMediaMetadata;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GalleryItem(com.instagram.common.typedurl.ImageUrl r13) {
        /*
            r12 = this;
            java.lang.Integer r9 = X.C05F.A15
            r6 = r13
            java.lang.String r10 = r13.getUrl()
            X.C14360o3.A07(r10)
            r1 = 0
            r11 = -1
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.model.GalleryItem.<init>(com.instagram.common.typedurl.ImageUrl):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GalleryItem(X.C195868lW r13) {
        /*
            r12 = this;
            r8 = r13
            java.lang.String r10 = r13.A07()
            r0 = 2
            X.C14360o3.A0B(r10, r0)
            java.lang.Integer r9 = X.C05F.A0u
            r1 = 0
            r11 = -1
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.model.GalleryItem.<init>(X.8lW):void");
    }
}
