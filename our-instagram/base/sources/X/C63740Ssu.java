package X;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* renamed from: X.Ssu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63740Ssu implements InterfaceC65470Tkn {
    public final C63749St4 A00 = new C63749St4();

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        return this.A00.ANo(ImageDecoder.createSource((ByteBuffer) obj), c63729Ssj, i, i2);
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        return true;
    }
}
