package com.instagram.reels.memories.model;

import X.A98;
import X.AEK;
import X.AbstractC221915u;
import X.C17z;
import X.C37324GcR;
import X.EnumC222889sT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public final class MemoryItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(27);
    public EnumC222889sT A00;
    public A98 A01 = new Object();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.A00);
        try {
            A98 a98 = this.A01;
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AEK.A00(A0A, a98);
            A0A.close();
            parcel.writeString(stringWriter.toString());
        } catch (IOException unused) {
        }
    }
}
