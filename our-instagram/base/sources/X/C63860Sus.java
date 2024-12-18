package X;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: X.Sus, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63860Sus implements InterfaceC65326Ti7 {
    public final Bitmap.CompressFormat A00 = Bitmap.CompressFormat.JPEG;

    @Override // X.InterfaceC65326Ti7
    public final InterfaceC65558Tme F8B(C63729Ssj c63729Ssj, InterfaceC65558Tme interfaceC65558Tme) {
        ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
        C0fK.A02(this.A00, (Bitmap) interfaceC65558Tme.get(), A0U, 100);
        interfaceC65558Tme.recycle();
        return new C63786Stg(A0U.toByteArray());
    }
}
