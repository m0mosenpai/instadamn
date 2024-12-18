package X;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* renamed from: X.Ssw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63742Ssw implements InterfaceC65470Tkn {
    public final C63360SiJ A00;

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        C63360SiJ c63360SiJ = this.A00;
        return C63360SiJ.A01(c63729Ssj, C63360SiJ.A0A, c63360SiJ, new C63855Sun((ParcelFileDescriptor) obj, c63360SiJ.A02, c63360SiJ.A04), i, i2);
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        String str = Build.MANUFACTURER;
        if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
            C62997SaL c62997SaL = C63360SiJ.A05;
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                return true;
            }
        }
        return false;
    }

    public C63742Ssw(C63360SiJ c63360SiJ) {
        this.A00 = c63360SiJ;
    }
}
