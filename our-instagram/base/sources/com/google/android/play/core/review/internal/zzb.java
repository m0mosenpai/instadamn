package com.google.android.play.core.review.internal;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import X.C58411Pup;
import X.C60734ROw;
import X.C63185Sek;
import android.app.PendingIntent;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzh;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-98202493, C0f9.A03(1002777552));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int A03 = C0f9.A03(-171269680);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i4 = 689531107;
                C0f9.A0A(i4, A03);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        zzg zzgVar = (zzg) this;
        int A032 = C0f9.A03(1049212340);
        if (i == 2) {
            BaseBundle baseBundle = (BaseBundle) AbstractC58320PtC.A0F(parcel, Bundle.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                zzh zzhVar = (zzh) zzgVar;
                int A033 = C0f9.A03(1177152271);
                int A034 = C0f9.A03(-976474058);
                C63185Sek c63185Sek = zzhVar.A02.A00;
                if (c63185Sek != null) {
                    C58411Pup c58411Pup = zzhVar.A00;
                    Object obj = c63185Sek.A07;
                    synchronized (obj) {
                        c63185Sek.A0A.remove(c58411Pup);
                    }
                    synchronized (obj) {
                        AtomicInteger atomicInteger = c63185Sek.A0B;
                        if (atomicInteger.get() > 0 && atomicInteger.decrementAndGet() > 0) {
                            c63185Sek.A06.A01("Leaving the connection open for other ongoing calls.", AbstractC58318PtA.A1b());
                        } else {
                            c63185Sek.A01().post(new C60734ROw(c63185Sek));
                        }
                    }
                }
                zzhVar.A01.A01("onGetLaunchReviewFlowInfo", AbstractC58318PtA.A1b());
                C0f9.A0A(-263498752, A034);
                PendingIntent pendingIntent = (PendingIntent) baseBundle.get("confirmation_intent");
                boolean z2 = baseBundle.getBoolean("is_review_no_op");
                C58411Pup c58411Pup2 = zzhVar.A00;
                c58411Pup2.A00.A0G(new zza(pendingIntent, z2));
                C0f9.A0A(39133478, A033);
                z = true;
                i3 = -23023183;
            } else {
                throw AbstractC58320PtC.A0E(dataAvail);
            }
        } else {
            z = false;
            i3 = 128280352;
        }
        C0f9.A0A(i3, A032);
        i4 = 1923544143;
        C0f9.A0A(i4, A03);
        return z;
    }
}
