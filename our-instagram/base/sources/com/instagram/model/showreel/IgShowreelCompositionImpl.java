package com.instagram.model.showreel;

import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import X.I4N;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class IgShowreelCompositionImpl extends C0T6 implements IgShowreelComposition, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(39);
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public IgShowreelCompositionImpl(String str, String str2, String str3, List list) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        this.A03 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final IgShowreelCompositionImpl F6Y() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgShowreelCompositionImpl) {
                IgShowreelCompositionImpl igShowreelCompositionImpl = (IgShowreelCompositionImpl) obj;
                if (!C14360o3.A0K(this.A03, igShowreelCompositionImpl.A03) || !C14360o3.A0K(this.A00, igShowreelCompositionImpl.A00) || !C14360o3.A0K(this.A01, igShowreelCompositionImpl.A01) || !C14360o3.A0K(this.A02, igShowreelCompositionImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IgShowreelCompositionAssetInfo) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final List Acz() {
        return this.A03;
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final String Anz() {
        return this.A00;
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final String Aqq() {
        return this.A01;
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final String C5i() {
        return this.A02;
    }

    @Override // com.instagram.model.showreel.IgShowreelComposition
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShowreelComposition", I4N.A00(this));
    }
}
