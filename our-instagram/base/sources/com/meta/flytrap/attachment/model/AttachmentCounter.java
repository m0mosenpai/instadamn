package com.meta.flytrap.attachment.model;

import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C55344OhA;
import X.C73833Sq;
import X.PVn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Serializable
/* loaded from: classes9.dex */
public final class AttachmentCounter implements Parcelable {
    public static final SerialDescriptor A01;
    public final ArrayList A00;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = C55344OhA.A00(49);

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer(C3R9 c3r9) {
            C14360o3.A0B(c3r9, 0);
            return new PVn(c3r9);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.meta.flytrap.attachment.model.AttachmentCounter$Companion] */
    static {
        C73833Sq c73833Sq = new C73833Sq("com.meta.flytrap.attachment.model.AttachmentCounter", null, 1);
        c73833Sq.A00("stack");
        A01 = c73833Sq;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        ArrayList arrayList = this.A00;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC25229BEm.A15(parcel, it, i);
        }
    }

    public final String toString() {
        return AbstractC25235BEs.A0q("AttachmentCounter(count=", this.A00.size());
    }

    public AttachmentCounter(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public /* synthetic */ AttachmentCounter(ArrayList arrayList, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = arrayList;
    }
}
