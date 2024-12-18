package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.64m, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64m extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C14360o3.A0B(message, 0);
        int i = message.what;
        if (i == 1) {
            Object obj = message.obj;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.ui.touch.TouchAnimator");
            C1342364l.A01((C1342364l) obj);
        } else {
            if (i != 2) {
                return;
            }
            Object obj2 = message.obj;
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.common.ui.touch.TouchAnimator");
            C1342364l.A00((C1342364l) obj2);
        }
    }
}
