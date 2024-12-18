package X;

import android.os.RemoteException;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteWorkManagerImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import java.util.List;

/* renamed from: X.TRl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64729TRl implements Runnable {
    public static final String A01 = C48442Kl.A01("ListenableCallbackRbl");
    public final SFM A00;

    @Override // java.lang.Runnable
    public final void run() {
        byte[] A012;
        try {
            SFM sfm = this.A00;
            Object obj = sfm.A01.get();
            IWorkManagerImplCallback iWorkManagerImplCallback = sfm.A00;
            if (7 - ((QAN) sfm).A00 != 0) {
                A012 = RemoteWorkManagerImpl.A01;
            } else {
                A012 = SQY.A01(new ParcelableWorkInfos((List) obj));
            }
            try {
                iWorkManagerImplCallback.DqM(A012);
            } catch (RemoteException e) {
                C48442Kl.A00();
                android.util.Log.e(A01, "Unable to notify successful operation", e);
            }
        } catch (Throwable th) {
            A00(this.A00.A00, th);
        }
    }

    public RunnableC64729TRl(SFM sfm) {
        this.A00 = sfm;
    }

    public static void A00(IWorkManagerImplCallback iWorkManagerImplCallback, Throwable th) {
        try {
            iWorkManagerImplCallback.DG4(th.getMessage());
        } catch (RemoteException e) {
            C48442Kl.A00();
            android.util.Log.e(A01, "Unable to notify failures in operation", e);
        }
    }
}
