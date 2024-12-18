package X;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.internal.gtm.zzce;
import com.google.android.gms.internal.gtm.zzcf;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.RMh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60689RMh extends AbstractC60694RMm {
    public zzce A00;
    public final ServiceConnectionC63442SkL A01;
    public final AbstractC62939SYh A02;
    public final SYI A03;

    public static final void A00(C60689RMh c60689RMh) {
        c60689RMh.A03.A00 = SystemClock.elapsedRealtime();
        c60689RMh.A02.A01(AbstractC166987dD.A0N(SVM.A06.A00));
    }

    public C60689RMh(C63335Shm c63335Shm) {
        super(c63335Shm);
        this.A03 = new SYI(c63335Shm.A04);
        this.A01 = new ServiceConnectionC63442SkL(this);
        this.A02 = new C60695RMn(c63335Shm, this);
    }

    public final void A0J() {
        SX6.A00();
        A0I();
        try {
            C1341263x.A00().A02(((AbstractC63371Sic) this).A00.A00, this.A01);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.A00 != null) {
            this.A00 = null;
            C60683RMb c60683RMb = ((AbstractC63371Sic) this).A00.A06;
            C63335Shm.A02(c60683RMb);
            c60683RMb.A0I();
            SX6.A00();
            C60692RMk c60692RMk = c60683RMb.A00;
            SX6.A00();
            c60692RMk.A0I();
            AbstractC63371Sic.A09(c60692RMk, "Service disconnected", 2);
        }
    }

    public final boolean A0K(SZ8 sz8) {
        C63138Sdj c63138Sdj;
        C3U5.A02(sz8);
        SX6.A00();
        A0I();
        zzce zzceVar = this.A00;
        if (zzceVar == null) {
            return false;
        }
        if (sz8.A05) {
            c63138Sdj = SVM.A0N;
        } else {
            c63138Sdj = SVM.A0M;
        }
        String str = (String) c63138Sdj.A00;
        List emptyList = Collections.emptyList();
        try {
            Map map = sz8.A04;
            long j = sz8.A02;
            zzcf zzcfVar = (zzcf) zzceVar;
            int A03 = C0f9.A03(-1871983851);
            int A032 = C0f9.A03(-2115548688);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
            C0f9.A0A(-1648238637, A032);
            obtain.writeMap(map);
            obtain.writeLong(j);
            obtain.writeString(str);
            obtain.writeTypedList(emptyList);
            int A033 = C0f9.A03(2049074816);
            Parcel obtain2 = Parcel.obtain();
            try {
                zzcfVar.A00.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                C0f9.A0A(687312579, A033);
                C0f9.A0A(1728345890, A03);
                A00(this);
                return true;
            } catch (Throwable th) {
                obtain.recycle();
                obtain2.recycle();
                C0f9.A0A(790498842, A033);
                throw th;
            }
        } catch (RemoteException unused) {
            AbstractC63371Sic.A09(this, "Failed to send hits to AnalyticsService", 2);
            return false;
        }
    }
}
