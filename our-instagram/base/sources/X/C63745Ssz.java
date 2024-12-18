package X;

import android.graphics.Bitmap;

/* renamed from: X.Ssz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63745Ssz implements InterfaceC65470Tkn {
    public final InterfaceC65571Tn4 A00;

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        Bitmap A01 = ((SZL) obj).A01();
        InterfaceC65571Tn4 interfaceC65571Tn4 = this.A00;
        if (A01 == null) {
            return null;
        }
        return new C63791Stl(A01, interfaceC65571Tn4);
    }

    public C63745Ssz(InterfaceC65571Tn4 interfaceC65571Tn4) {
        this.A00 = interfaceC65571Tn4;
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        return true;
    }
}
