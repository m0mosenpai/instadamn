package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* loaded from: classes8.dex */
public final class LS7 implements InterfaceC50417MNt {
    public final /* synthetic */ String A00;

    public LS7(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        Number number = (Number) obj;
        if (number != null && number.intValue() == 1) {
            C1336761w c1336761w = LockBoxStorageManager.backupManager;
            if (c1336761w == null) {
                C14360o3.A0F("backupManager");
                throw C00O.createAndThrow();
            }
            String str = this.A00;
            EnumC46305Keb enumC46305Keb = EnumC46305Keb.A05;
            C14360o3.A0B(str, 0);
            c1336761w.A00.A00(enumC46305Keb, str);
        }
    }
}
