package X;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* renamed from: X.Ssv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63741Ssv implements InterfaceC65470Tkn {
    public final C63749St4 A00 = new C63749St4();

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        return this.A00.ANo(ImageDecoder.createSource(AbstractC63086Sc9.A00((InputStream) obj)), c63729Ssj, i, i2);
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        return true;
    }
}
