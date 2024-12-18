package com.google.android.gms.common.data;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AnonymousClass001;
import X.C63474SlF;
import X.SGO;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;

@KeepName
/* loaded from: classes10.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public Bundle A00;
    public boolean A01 = false;
    public int[] A02;
    public final int A03;
    public final int A04;
    public final Bundle A05;
    public final CursorWindow[] A06;
    public final String[] A07;
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(34);
    public static final SGO A08 = new SGO(new String[0]);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A06;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        if (this.A06.length > 0) {
            synchronized (this) {
                z = this.A01;
            }
            if (!z) {
                close();
                Log.e("DataBuffer", AnonymousClass001.A0g("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", toString(), ")"));
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.A07;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0H(parcel, strArr, 1);
        AbstractC128825rw.A0G(parcel, this.A06, 2, i);
        AbstractC128825rw.A07(parcel, 3, this.A04);
        AbstractC128825rw.A02(this.A05, parcel, 4);
        AbstractC58319PtB.A1C(parcel, this.A03, A04);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(Bundle bundle, CursorWindow[] cursorWindowArr, String[] strArr, int i, int i2) {
        this.A03 = i;
        this.A07 = strArr;
        this.A06 = cursorWindowArr;
        this.A04 = i2;
        this.A05 = bundle;
    }
}
