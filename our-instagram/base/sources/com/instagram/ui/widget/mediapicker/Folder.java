package com.instagram.ui.widget.mediapicker;

import X.AbstractC13230m9;
import X.AbstractC43591JPw;
import X.AnonymousClass001;
import X.C05F;
import X.C0YZ;
import X.C14360o3;
import X.C24164Ann;
import X.C8Z4;
import X.C8Z5;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class Folder implements C8Z4, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(66);
    public int A00;
    public List A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final Set A05;
    public final Set A06;
    public final boolean A07;

    @Override // X.C8Z4
    public final Folder ACa() {
        return this;
    }

    @Override // X.C8Z4
    public final C24164Ann ACh() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeTypedList(new ArrayList(this.A05));
    }

    public final String A00() {
        int i = this.A02;
        if (i != -10) {
            if (i != -9) {
                if (i != -6) {
                    if (i != -5) {
                        if (i != -3) {
                            if (i != -2) {
                                if (i != -1) {
                                    return "user_folder";
                                }
                                return "all";
                            }
                            return "photos";
                        }
                        return "videos";
                    }
                    return "external";
                }
                return "instagram";
            }
            return "favorites";
        }
        return "videos_over_60_sec";
    }

    public final List A01() {
        List list = this.A01;
        if (list == null) {
            ArrayList arrayList = new ArrayList(this.A05);
            this.A01 = arrayList;
            return arrayList;
        }
        return list;
    }

    @Override // X.C8Z4
    public final int BF3() {
        return this.A02;
    }

    @Override // X.C8Z4
    public final Integer CBv() {
        return C05F.A00;
    }

    @Override // X.C8Z4
    public final String getName() {
        String str = this.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.C8Z4
    public final int getSize() {
        return this.A00;
    }

    @Override // X.C8Z4
    public final String getSubtitle() {
        String str = this.A04;
        if (str == null) {
            return "";
        }
        return str;
    }

    public Folder(Parcel parcel) {
        Parcelable.Creator creator;
        TreeSet treeSet = new TreeSet(C8Z5.A00);
        this.A05 = treeSet;
        this.A06 = new HashSet();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A07 = parcel.readInt() != 0;
        Object obj = Medium.class.getDeclaredField("CREATOR").get(null);
        if ((obj instanceof Parcelable.Creator) && (creator = (Parcelable.Creator) obj) != null) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
            if (createTypedArrayList != null) {
                treeSet.addAll(createTypedArrayList);
                return;
            }
            return;
        }
        String A00 = AbstractC43591JPw.A00(61);
        Map map = C0YZ.A03;
        throw new IllegalArgumentException(AnonymousClass001.A0R(A00, AbstractC13230m9.A01(Medium.class)));
    }

    public Folder(String str, String str2, int i, boolean z) {
        this.A05 = new TreeSet(C8Z5.A00);
        this.A06 = new HashSet();
        this.A02 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A07 = z;
    }
}
