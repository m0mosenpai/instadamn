package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Metadata;
import androidx.media3.common.Timeline;

/* loaded from: classes12.dex */
public final class XQO extends AbstractC73334Y8p implements Handler.Callback {
    public final Handler A00;
    public final YQD A01;
    public final YMN A02;
    public final XQF A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.XQF, X.UFi] */
    public XQO(Looper looper, YMN ymn) {
        super(5);
        Handler handler;
        YQD yqd = YQD.A00;
        this.A02 = ymn;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A00 = handler;
        yqd.getClass();
        this.A01 = yqd;
        this.A03 = new C66397UFi(1);
    }

    private void A00(Metadata metadata) {
        Y8E y8e = (Y8E) this.A02;
        Y8T y8t = y8e.A00;
        Y8T y8t2 = Y8T.$redex_init_class;
        Y15 y15 = new Y15(y8t.A06);
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.A01;
            if (i >= entryArr.length) {
                break;
            }
            entryArr[i].E4j(y15);
            i++;
        }
        y8t.A06 = new Y1V(y15);
        Timeline A04 = AbstractC72048XLo.A04(y8t);
        if (AbstractC167007dF.A1N(A04.A02())) {
            Y1V y1v = y8t.A06;
            if (!y1v.equals(y8t.A05)) {
                y8t.A05 = y1v;
                C73311Y1r.A00(y8t.A0T, y8e, 13, 14);
            }
            C73311Y1r c73311Y1r = y8t.A0T;
            C73311Y1r.A00(c73311Y1r, metadata, 14, 28);
            c73311Y1r.A01();
            return;
        }
        A04.A0A(y8t.A0R, y8t.Aub());
        throw C00O.createAndThrow();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            A00((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
