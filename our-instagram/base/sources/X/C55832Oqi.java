package X;

import android.graphics.Rect;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Oqi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55832Oqi implements InterfaceC58022Po8 {
    public final /* synthetic */ OVW A00;
    public final /* synthetic */ InterfaceC58022Po8 A01;

    public C55832Oqi(OVW ovw, InterfaceC58022Po8 interfaceC58022Po8) {
        this.A00 = ovw;
        this.A01 = interfaceC58022Po8;
    }

    @Override // X.InterfaceC58022Po8
    public final void D8y(Rect rect, ImageUrl imageUrl, String str) {
        this.A00.A00 = null;
        this.A01.D8y(rect, imageUrl, str);
    }

    @Override // X.InterfaceC58022Po8
    public final void onFinish() {
        this.A01.onFinish();
    }
}
