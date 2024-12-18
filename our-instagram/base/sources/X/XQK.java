package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.collect.ImmutableList;

/* loaded from: classes12.dex */
public final class XQK extends AbstractC73334Y8p implements Handler.Callback {
    public long A00;
    public long A01;
    public final Handler A02;
    public final C66397UFi A03;
    public final YQF A04;
    public final YMP A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQK(Looper looper, YMP ymp) {
        super(3);
        Handler handler;
        YQF yqf = YQF.A00;
        this.A05 = ymp;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A02 = handler;
        this.A04 = yqf;
        this.A03 = new C66397UFi(1);
        this.A01 = -9223372036854775807L;
        this.A00 = -9223372036854775807L;
    }

    private void A00(C73290Xzd c73290Xzd) {
        YMP ymp = this.A05;
        ImmutableList immutableList = c73290Xzd.A00;
        Y8T y8t = ((Y8E) ymp).A00;
        Y8T y8t2 = Y8T.$redex_init_class;
        C73311Y1r c73311Y1r = y8t.A0T;
        c73311Y1r.A02(new Y8d(immutableList, 12), 27);
        c73311Y1r.A01();
        y8t.A09 = c73290Xzd;
        C73311Y1r.A00(c73311Y1r, c73290Xzd, 15, 27);
        c73311Y1r.A01();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            A00((C73290Xzd) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
