package com.instagram.direct.avatar.stickers.intf;

import X.AbstractC43594JPz;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class DirectAvatarTrayFragmentConfig implements Parcelable {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public DirectAvatarTrayFragmentConfig(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = z;
        this.A05 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A01 = i;
        this.A00 = i2;
    }

    /* loaded from: classes8.dex */
    public final class NestedTray extends DirectAvatarTrayFragmentConfig {
        public static final NestedTray A00 = new NestedTray();
        public static final Parcelable.Creator CREATOR = LNM.A00(91);

        public NestedTray() {
            super(2131953542, -1, true, false, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes8.dex */
    public final class StandaloneNonDraggableTray extends DirectAvatarTrayFragmentConfig {
        public static final StandaloneNonDraggableTray A00 = new StandaloneNonDraggableTray();
        public static final Parcelable.Creator CREATOR = LNM.A00(92);

        public StandaloneNonDraggableTray() {
            super(2131953542, -1, false, false, true, true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes8.dex */
    public final class StandaloneTray extends DirectAvatarTrayFragmentConfig {
        public static final StandaloneTray A00 = new StandaloneTray();
        public static final Parcelable.Creator CREATOR = LNM.A00(93);

        public StandaloneTray() {
            super(2131953542, -1, false, true, true, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes8.dex */
    public final class Tab extends DirectAvatarTrayFragmentConfig {
        public static final Tab A00 = new Tab();
        public static final Parcelable.Creator CREATOR = LNM.A00(94);

        public Tab() {
            super(2131960404, R.dimen.asset_picker_redesign_sticker_height, false, false, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }
}
