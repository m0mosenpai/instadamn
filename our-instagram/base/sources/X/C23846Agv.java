package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Agv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23846Agv implements BC1 {
    public final /* synthetic */ C208619Kv A00;
    public final /* synthetic */ ShutterButton A01;

    public C23846Agv(C208619Kv c208619Kv, ShutterButton shutterButton) {
        this.A00 = c208619Kv;
        this.A01 = shutterButton;
    }

    @Override // X.BC1
    public final void Cwc() {
        C208619Kv c208619Kv = this.A00;
        c208619Kv.A04.set(false);
        this.A01.Dp4("hand_gesture_stop");
        c208619Kv.A01 = true;
    }
}
