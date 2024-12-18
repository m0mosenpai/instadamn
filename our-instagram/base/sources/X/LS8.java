package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;
import java.util.List;

/* loaded from: classes8.dex */
public final class LS8 implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ String A01;

    public LS8(LK0 lk0, String str) {
        this.A00 = lk0;
        this.A01 = str;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        AbstractC46360Kfi abstractC46360Kfi = (AbstractC46360Kfi) obj;
        if (abstractC46360Kfi instanceof K50) {
            byte[] bArr = ((K50) abstractC46360Kfi).A00;
            C14360o3.A0B(bArr, 0);
            List A0Q = AbstractC001900j.A0Q(new String(bArr, C15W.A05), new char[]{':'}, 0);
            if (A0Q.size() == 2) {
                String A1I = AbstractC25226BEj.A1I(A0Q, 1);
                C14360o3.A0B(A1I, 1);
                this.A00.A05(A1I);
                LockBoxStorageManager.INSTANCE.moveRecoveryCodeFromLegacyToLockBox(this.A01, A1I);
                return;
            }
        }
        this.A00.A03();
    }
}
