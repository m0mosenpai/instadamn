package com.instagram.creation.base;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class CropInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(64);
    public final int A00;
    public final int A01;
    public final Rect A02;
    public final boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r3.height() != r5) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CropInfo(android.graphics.Rect r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = 3
            X.C14360o3.A0B(r3, r0)
            r2.<init>()
            r2.A01 = r4
            r2.A00 = r5
            r2.A02 = r3
            int r0 = r3.width()
            if (r0 != r4) goto L1a
            int r1 = r3.height()
            r0 = 0
            if (r1 == r5) goto L1b
        L1a:
            r0 = 1
        L1b:
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.CropInfo.<init>(android.graphics.Rect, int, int):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CropInfo: Original dims: ");
        sb.append(this.A01);
        sb.append(" x ");
        sb.append(this.A00);
        sb.append(" cropRect: ");
        sb.append(this.A02);
        return sb.toString();
    }
}
