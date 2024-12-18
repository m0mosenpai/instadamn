package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class St1 implements InterfaceC65470Tkn {
    public final InterfaceC65571Tn4 A00;
    public final C63751St6 A01;

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        QBU A00 = this.A01.A00((android.net.Uri) obj, c63729Ssj);
        if (A00 == null) {
            return null;
        }
        return STB.A00((Drawable) A00.get(), this.A00, i, i2);
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        return "android.resource".equals(((android.net.Uri) obj).getScheme());
    }

    public St1(InterfaceC65571Tn4 interfaceC65571Tn4, C63751St6 c63751St6) {
        this.A01 = c63751St6;
        this.A00 = interfaceC65571Tn4;
    }
}
