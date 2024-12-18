package com.instagram.ui.bottomsheet.mixed.model;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AnonymousClass001;
import X.C14360o3;
import X.C55344OhA;
import X.InterfaceC66482zP;
import X.MSZ;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.enums.EnumEntries;

/* loaded from: classes9.dex */
public class MixedAttributionModel implements InterfaceC66482zP, Parcelable {
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(6);
    public Drawable A00;
    public Object A01;
    public final ImageUrl A02;
    public final MixedAttributionType A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes9.dex */
    public final class MixedAttributionType implements Parcelable {
        public static final /* synthetic */ EnumEntries A00;
        public static final /* synthetic */ MixedAttributionType[] A01;
        public static final MixedAttributionType A02;
        public static final MixedAttributionType A03;
        public static final MixedAttributionType A04;
        public static final MixedAttributionType A05;
        public static final Parcelable.Creator CREATOR;

        public static MixedAttributionType valueOf(String str) {
            return (MixedAttributionType) Enum.valueOf(MixedAttributionType.class, str);
        }

        public static MixedAttributionType[] values() {
            return (MixedAttributionType[]) A01.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        static {
            MixedAttributionType mixedAttributionType = new MixedAttributionType("MUSIC_ATTRIBUTION", 0);
            A05 = mixedAttributionType;
            MixedAttributionType mixedAttributionType2 = new MixedAttributionType("EFFECT_ATTRIBUTION", 1);
            A04 = mixedAttributionType2;
            MixedAttributionType mixedAttributionType3 = new MixedAttributionType("CAMERA_FORMAT_ATTRIBUTION", 2);
            A03 = mixedAttributionType3;
            MixedAttributionType mixedAttributionType4 = new MixedAttributionType("AVATAR_ATTRIBUTION", 3);
            A02 = mixedAttributionType4;
            MixedAttributionType[] mixedAttributionTypeArr = {mixedAttributionType, mixedAttributionType2, mixedAttributionType3, mixedAttributionType4};
            A01 = mixedAttributionTypeArr;
            A00 = AbstractC12190kN.A00(mixedAttributionTypeArr);
            CREATOR = C55344OhA.A00(7);
        }

        public MixedAttributionType(String str, int i) {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            MSZ.A12(parcel, this);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A03.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
    }

    public final void A00(Drawable drawable, Object obj) {
        this.A01 = obj;
        if (drawable != null) {
            this.A00 = drawable;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC66492zQ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public boolean isContentSame(MixedAttributionModel mixedAttributionModel) {
        String str;
        if (mixedAttributionModel != null) {
            str = AnonymousClass001.A0R(mixedAttributionModel.A04, mixedAttributionModel.A05);
        } else {
            str = null;
        }
        return C14360o3.A0K(str, AnonymousClass001.A0R(this.A04, this.A05));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0R(this.A04, this.A05);
    }

    public MixedAttributionModel(ImageUrl imageUrl, MixedAttributionType mixedAttributionType, String str, String str2) {
        AbstractC167027dH.A13(mixedAttributionType, str, str2);
        this.A03 = mixedAttributionType;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = imageUrl;
    }
}
