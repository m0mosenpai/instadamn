package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.WIb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70218WIb implements Handler.Callback, InterfaceC123265i1 {
    public final Handler A00;
    public final /* synthetic */ C117385Sx A01;

    public C70218WIb(InterfaceC53292cD interfaceC53292cD, C117385Sx c117385Sx) {
        this.A01 = c117385Sx;
        Looper myLooper = Looper.myLooper();
        C4B8.A01(myLooper);
        Handler handler = new Handler(myLooper, this);
        this.A00 = handler;
        interfaceC53292cD.setOnFrameRenderedListener(this, handler);
    }

    private void A00(long j) {
        C117385Sx c117385Sx = this.A01;
        if (this == c117385Sx.A0C && ((AbstractC97194Ye) c117385Sx).A0H != null) {
            if (j == Long.MAX_VALUE) {
                ((AbstractC97194Ye) c117385Sx).A0a = true;
                return;
            }
            try {
                c117385Sx.A0u(j);
            } catch (C4Y3 e) {
                ((AbstractC97194Ye) c117385Sx).A0A = e;
            }
        }
    }

    @Override // X.InterfaceC123265i1
    public final void DIP(InterfaceC53292cD interfaceC53292cD, long j, long j2) {
        if (Util.A00 < 30) {
            Handler handler = this.A00;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
        } else {
            A00(j);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        A00((message.arg2 & 4294967295L) | ((message.arg1 & 4294967295L) << 32));
        return true;
    }
}
