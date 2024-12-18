package X;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: X.Suk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63852Suk implements InterfaceC65478Tkv {
    public final C61005RdY A00;
    public final C61043ReF A01;

    @Override // X.InterfaceC65478Tkv
    public final void D9R(Bitmap bitmap, InterfaceC65571Tn4 interfaceC65571Tn4) {
        IOException iOException = this.A01.A00;
        if (iOException != null) {
            if (bitmap != null) {
                interfaceC65571Tn4.E6v(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    @Override // X.InterfaceC65478Tkv
    public final void DWP() {
        C61005RdY c61005RdY = this.A00;
        synchronized (c61005RdY) {
            c61005RdY.A00 = c61005RdY.A05.length;
        }
    }

    public C63852Suk(C61005RdY c61005RdY, C61043ReF c61043ReF) {
        this.A00 = c61005RdY;
        this.A01 = c61043ReF;
    }
}
