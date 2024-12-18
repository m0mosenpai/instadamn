package com.instagram.save.model;

import X.AbstractC166997dE;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C16930sl;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class CollaborativeCollectionMetadata extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(50);
    public String A00;
    public String A01;
    public List A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CollaborativeCollectionMetadata) {
                CollaborativeCollectionMetadata collaborativeCollectionMetadata = (CollaborativeCollectionMetadata) obj;
                if (!C14360o3.A0K(this.A02, collaborativeCollectionMetadata.A02) || !C14360o3.A0K(this.A01, collaborativeCollectionMetadata.A01) || !C14360o3.A0K(this.A00, collaborativeCollectionMetadata.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public CollaborativeCollectionMetadata() {
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 1);
        this.A02 = c16930sl;
        this.A01 = "";
        this.A00 = "";
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, this.A02.hashCode() * 31) + this.A00.hashCode();
    }
}
