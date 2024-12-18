package com.facebook.ui.emoji.model;

import X.AbstractC166987dD;
import X.AbstractC37304Gc5;
import X.C05F;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class EmojiSet implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(71);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Metadata A03;

    /* loaded from: classes10.dex */
    public class Metadata implements Parcelable {
        public static final Parcelable.Creator CREATOR = C63473SlE.A01(72);
        public final Integer A00;
        public final List A01;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            switch (this.A00.intValue()) {
                case 1:
                    str = "POPULAR";
                    break;
                case 2:
                    str = "SMILEYS_AND_PEOPLE";
                    break;
                case 3:
                    str = "ANIMALS_AND_NATURE";
                    break;
                case 4:
                    str = "FOOD_AND_DRINK";
                    break;
                case 5:
                    str = "TRAVEL_AND_PLACES";
                    break;
                case 6:
                    str = "ACTIVITIES";
                    break;
                case 7:
                    str = "OBJECTS";
                    break;
                case 8:
                    str = "SYMBOLS";
                    break;
                case 9:
                    str = "FLAGS";
                    break;
                case 10:
                    str = "OTHER";
                    break;
                default:
                    str = "RECENTS";
                    break;
            }
            parcel.writeString(str);
            parcel.writeList(this.A01);
        }

        public Metadata(Parcel parcel) {
            Integer num;
            String readString = parcel.readString();
            if (readString != null) {
                if (readString.equals("RECENTS")) {
                    num = C05F.A00;
                } else if (readString.equals("POPULAR")) {
                    num = C05F.A01;
                } else if (readString.equals("SMILEYS_AND_PEOPLE")) {
                    num = C05F.A0C;
                } else if (readString.equals("ANIMALS_AND_NATURE")) {
                    num = C05F.A0N;
                } else if (readString.equals("FOOD_AND_DRINK")) {
                    num = C05F.A0Y;
                } else if (readString.equals("TRAVEL_AND_PLACES")) {
                    num = C05F.A0j;
                } else if (readString.equals("ACTIVITIES")) {
                    num = C05F.A0u;
                } else if (readString.equals("OBJECTS")) {
                    num = C05F.A15;
                } else if (readString.equals("SYMBOLS")) {
                    num = C05F.A1F;
                } else if (readString.equals("FLAGS")) {
                    num = C05F.A1I;
                } else if (!readString.equals("OTHER")) {
                    throw AbstractC166987dD.A12(readString);
                }
                this.A00 = num;
                ArrayList A1E = AbstractC166987dD.A1E();
                this.A01 = A1E;
                parcel.readList(A1E, Emoji.class.getClassLoader());
            }
            num = C05F.A02;
            this.A00 = num;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            this.A01 = A1E2;
            parcel.readList(A1E2, Emoji.class.getClassLoader());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }

    public EmojiSet(Parcel parcel) {
        Parcelable A04 = AbstractC37304Gc5.A04(parcel, Metadata.class);
        A04.getClass();
        this.A03 = (Metadata) A04;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
    }
}
