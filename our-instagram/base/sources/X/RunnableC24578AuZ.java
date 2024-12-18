package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AuZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24578AuZ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9P2 A01;

    public RunnableC24578AuZ(C9P2 c9p2, int i) {
        this.A01 = c9p2;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9P2 c9p2 = this.A01;
        List list = (List) c9p2.A0X.A06(EnumC1125356h.VIDEO).get(-1);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaEffect mediaEffect = ((C69688VtY) it.next()).A01;
                if (mediaEffect instanceof C23504AbK) {
                    C23504AbK c23504AbK = (C23504AbK) mediaEffect;
                    InterfaceC179077xJ interfaceC179077xJ = c23504AbK.A01;
                    if ((interfaceC179077xJ instanceof C199748sQ) && ((C199748sQ) interfaceC179077xJ).A05.contains(Integer.valueOf(this.A00))) {
                        InterfaceC179077xJ BQr = c9p2.A0G.BQr();
                        if (BQr instanceof BER) {
                            ((BER) BQr).A8K(c23504AbK);
                        }
                    }
                }
            }
        }
    }
}
