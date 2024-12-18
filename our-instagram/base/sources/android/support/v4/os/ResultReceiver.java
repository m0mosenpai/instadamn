package android.support.v4.os;

import X.AbstractC58321PtD;
import X.C0f9;
import X.Py5;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(10);
    public IResultReceiver A00;

    /* loaded from: classes10.dex */
    public final class MyResultReceiver extends Binder implements IResultReceiver {
        public MyResultReceiver() {
            this();
            C0f9.A0A(-2120535402, C0f9.A03(1724869948));
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            C0f9.A0A(2117509100, C0f9.A03(897597318));
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C0f9.A03(-250147080);
            String str = IResultReceiver.A00;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(str);
                    if (i == 1) {
                        parcel.readInt();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        if (parcel.readInt() != 0) {
                            creator.createFromParcel(parcel);
                        }
                        C0f9.A0A(-923662967, C0f9.A03(-2071555893));
                        i3 = 151958997;
                        C0f9.A0A(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(str);
                    i3 = 1297152264;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C0f9.A0A(-798119436, A03);
            return onTransact;
        }

        public MyResultReceiver() {
            int A03 = C0f9.A03(44809228);
            attachInterface(this, IResultReceiver.A00);
            C0f9.A0A(-331523751, A03);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            IResultReceiver iResultReceiver = this.A00;
            if (iResultReceiver == null) {
                iResultReceiver = new MyResultReceiver();
                this.A00 = iResultReceiver;
            }
            AbstractC58321PtD.A19(iResultReceiver, parcel);
        }
    }
}
