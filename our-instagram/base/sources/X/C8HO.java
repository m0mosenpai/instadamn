package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8HO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HO implements Runnable {
    public final /* synthetic */ C8HI A00;

    public C8HO(C8HI c8hi) {
        this.A00 = c8hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        Bitmap bitmap;
        C8HI c8hi = this.A00;
        AtomicBoolean atomicBoolean = c8hi.A1L;
        atomicBoolean.set(false);
        InterfaceC25216BDo A00 = c8hi.A1B.A00();
        C1810981l c1810981l = c8hi.A0g;
        Handler handler = c8hi.A0Q;
        ShutterButton shutterButton = c8hi.A1I;
        C174757qB c174757qB = c8hi.A06;
        if (c174757qB != null) {
            view = c174757qB.A0H.A00();
        } else {
            view = c8hi.A0T;
        }
        int width = view.getWidth();
        C174757qB c174757qB2 = c8hi.A06;
        if (c174757qB2 != null) {
            view2 = c174757qB2.A0H.A00();
        } else {
            view2 = c8hi.A0T;
        }
        A00.Eht(handler, c1810981l, c8hi.A16, shutterButton, width, view2.getHeight());
        if (C18U.A06(C06090Tz.A05, c8hi.A0f, 36318548397660472L) || !c8hi.A0Y()) {
            C174757qB c174757qB3 = c8hi.A06;
            if (c174757qB3 != null) {
                C174747qA c174747qA = c174757qB3.A0H;
                if (c174747qA.A00 != null) {
                    c174757qB3.A0K(new C198068pH(this), 448, 448);
                } else {
                    TextureView textureView = c174747qA.A01;
                    if (textureView != null) {
                        bitmap = textureView.getBitmap(448, 448);
                        C14120nc.A00().ATO(new C216929in(bitmap, this));
                    }
                }
            }
            bitmap = null;
            C14120nc.A00().ATO(new C216929in(bitmap, this));
        }
        if (!atomicBoolean.get()) {
            handler.postDelayed(c8hi.A1J, 1000L);
            atomicBoolean.set(true);
        }
    }
}
