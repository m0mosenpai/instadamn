package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.30h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC669030h extends Handler {
    public WeakReference A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C55982hj c55982hj;
        ViewOnTouchListenerC668930g viewOnTouchListenerC668930g = (ViewOnTouchListenerC668930g) this.A00.get();
        if (viewOnTouchListenerC668930g != null) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    int i2 = ViewOnTouchListenerC668930g.A0I;
                    if (viewOnTouchListenerC668930g.A08.A07(viewOnTouchListenerC668930g.A03)) {
                        viewOnTouchListenerC668930g.A0B = true;
                        c55982hj = viewOnTouchListenerC668930g.A04;
                        c55982hj.A08(0.0d, true);
                    } else {
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown message ");
                    sb.append(message);
                    throw new RuntimeException(sb.toString());
                }
            } else {
                int i3 = ViewOnTouchListenerC668930g.A0I;
                if (!viewOnTouchListenerC668930g.A08.A0A(viewOnTouchListenerC668930g.A02)) {
                    return;
                } else {
                    c55982hj = viewOnTouchListenerC668930g.A05;
                }
            }
            c55982hj.A06(1.0d);
        }
    }
}
