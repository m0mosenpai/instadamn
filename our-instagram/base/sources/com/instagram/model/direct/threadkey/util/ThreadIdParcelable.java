package com.instagram.model.direct.threadkey.util;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C55343Oh9;
import X.C83693oE;
import X.EgH;
import X.InterfaceC83733oI;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes6.dex */
public final class ThreadIdParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(78);
    public final InterfaceC83733oI A00;

    public ThreadIdParcelable(InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 1);
        this.A00 = interfaceC83733oI;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C83693oE c83693oE;
        C14360o3.A0B(parcel, 0);
        InterfaceC83733oI interfaceC83733oI = this.A00;
        if (interfaceC83733oI instanceof C83693oE) {
            parcel.writeInt(0);
            c83693oE = (C83693oE) interfaceC83733oI;
        } else if (interfaceC83733oI instanceof MsysThreadId) {
            parcel.writeInt(1);
            parcel.writeParcelable((MsysThreadId) interfaceC83733oI, i);
            return;
        } else if (interfaceC83733oI instanceof EgH) {
            parcel.writeInt(2);
            EgH egH = (EgH) interfaceC83733oI;
            if (egH == null) {
                return;
            }
            parcel.writeParcelable(egH.A01, i);
            c83693oE = egH.A00;
        } else {
            throw AbstractC166987dD.A14(AbstractC167017dG.A0n(interfaceC83733oI, "Unexpected ThreadId: ", AbstractC166987dD.A1C()));
        }
        C14360o3.A0B(c83693oE, 1);
        parcel.writeString(c83693oE.A00);
    }
}
