package com.google.android.play.integrity.internal;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import X.C58411Pup;
import X.C63186Sel;
import X.N21;
import X.N27;
import X.RPD;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.integrity.s;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public abstract class b extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1313686943, C0f9.A03(163954456));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int A03 = C0f9.A03(277221383);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i4 = 487345273;
                C0f9.A0A(i4, A03);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        s sVar = (s) this;
        int A032 = C0f9.A03(1735054892);
        if (i == 2) {
            BaseBundle baseBundle = (BaseBundle) AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                int A033 = C0f9.A03(-1001810849);
                C63186Sel c63186Sel = sVar.A02.A01;
                C58411Pup c58411Pup = sVar.A00;
                Object obj = c63186Sel.A07;
                synchronized (obj) {
                    c63186Sel.A0A.remove(c58411Pup);
                }
                synchronized (obj) {
                    AtomicInteger atomicInteger = c63186Sel.A0B;
                    if (atomicInteger.get() > 0 && atomicInteger.decrementAndGet() > 0) {
                        c63186Sel.A06.A01("Leaving the connection open for other ongoing calls.", AbstractC58318PtA.A1b());
                    } else {
                        c63186Sel.A01().post(new RPD(c63186Sel));
                    }
                }
                sVar.A01.A01("onRequestIntegrityToken", AbstractC58318PtA.A1b());
                int i6 = baseBundle.getInt("error");
                if (i6 != 0) {
                    c58411Pup.A02(new N21(i6, null));
                    i5 = -1670897561;
                } else {
                    String string = baseBundle.getString("token");
                    if (string == null) {
                        c58411Pup.A02(new N21(-100, null));
                        i5 = 360108791;
                    } else {
                        c58411Pup.A00.A0G(new N27(string));
                        i5 = 1453337108;
                    }
                }
                C0f9.A0A(i5, A033);
                z = true;
                i3 = -2013443003;
            } else {
                throw AbstractC58320PtC.A0E(dataAvail);
            }
        } else {
            z = false;
            i3 = -1004332104;
        }
        C0f9.A0A(i3, A032);
        i4 = 1606579641;
        C0f9.A0A(i4, A03);
        return z;
    }
}
