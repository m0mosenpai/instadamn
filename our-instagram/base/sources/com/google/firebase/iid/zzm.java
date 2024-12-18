package com.google.firebase.iid;

import X.AbstractC166987dD;
import X.C63469Sl9;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class zzm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(18);
    public Messenger A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.A00;
            if (messenger != null) {
                IBinder binder = messenger.getBinder();
                Messenger messenger2 = ((zzm) obj).A00;
                if (messenger2 != null) {
                    return binder.equals(messenger2.getBinder());
                }
                throw AbstractC166987dD.A15("asBinder");
            }
            throw AbstractC166987dD.A15("asBinder");
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.A00;
        if (messenger != null) {
            return messenger.getBinder().hashCode();
        }
        throw AbstractC166987dD.A15("asBinder");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.A00;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
            return;
        }
        throw AbstractC166987dD.A15("asBinder");
    }
}
