package com.google.ar.core.dependencies;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AnonymousClass001;
import X.C0f9;
import X.EnumC61066Ref;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.ar.core.p;

/* loaded from: classes10.dex */
public abstract class d extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(2107740493, C0f9.A03(1107149806));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        int i3;
        boolean z;
        int i4;
        int i5;
        int A032 = C0f9.A03(-736586471);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i4 = -1272518448;
                C0f9.A0A(i4, A032);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        if (this instanceof p) {
            p pVar = (p) this;
            A03 = C0f9.A03(1431115017);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        i3 = 417900606;
                    }
                } else {
                    BaseBundle baseBundle = (BaseBundle) AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail <= 0) {
                        int A033 = C0f9.A03(-190924828);
                        int i6 = baseBundle.getInt("error.code", -100);
                        if (i6 != -5) {
                            if (i6 != -3) {
                                if (i6 != 0) {
                                    Log.e("ARCore-InstallService", AnonymousClass001.A0O("requestInfo returned: ", i6));
                                    pVar.A00.A01.A00(EnumC61066Ref.A05);
                                    i5 = -383192804;
                                } else {
                                    pVar.A00.A01.A00(EnumC61066Ref.A03);
                                    i5 = 949657793;
                                }
                            } else {
                                Log.e("ARCore-InstallService", "The Google Play application must be updated.");
                                pVar.A00.A01.A00(EnumC61066Ref.A05);
                                i5 = 1454721154;
                            }
                        } else {
                            Log.e("ARCore-InstallService", "The device is not supported.");
                            pVar.A00.A01.A00(EnumC61066Ref.A06);
                            i5 = 1193096800;
                        }
                        C0f9.A0A(i5, A033);
                        C0f9.A0A(-1518218442, A03);
                        z = true;
                        i4 = -1300946122;
                        C0f9.A0A(i4, A032);
                        return z;
                    }
                    throw AbstractC58320PtC.A0E(dataAvail);
                }
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                creator.createFromParcel(parcel);
            }
            int dataAvail2 = parcel.dataAvail();
            if (dataAvail2 > 0) {
                throw AbstractC58320PtC.A0E(dataAvail2);
            }
            C0f9.A0A(-1518218442, A03);
            z = true;
            i4 = -1300946122;
            C0f9.A0A(i4, A032);
            return z;
        }
        A03 = C0f9.A03(-2127237398);
        i3 = -927599597;
        C0f9.A0A(i3, A03);
        z = false;
        i4 = -1300946122;
        C0f9.A0A(i4, A032);
        return z;
    }
}
