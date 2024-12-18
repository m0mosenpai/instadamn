package X;

import android.graphics.Rect;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Oqj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55833Oqj implements InterfaceC58022Po8 {
    public final /* synthetic */ C55197Oe4 A00;
    public final /* synthetic */ Runnable A01;

    public C55833Oqj(C55197Oe4 c55197Oe4, Runnable runnable) {
        this.A00 = c55197Oe4;
        this.A01 = runnable;
    }

    @Override // X.InterfaceC58022Po8
    public final void D8y(Rect rect, ImageUrl imageUrl, String str) {
        this.A00.A00 = new C54662OCo(rect, imageUrl, null, str);
    }

    @Override // X.InterfaceC58022Po8
    public final void onFinish() {
        this.A01.run();
    }
}
