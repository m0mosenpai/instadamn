package X;

import android.os.Handler;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class AZS implements InterfaceC203488z7 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Handler A02;
    public final /* synthetic */ C1810981l A03;
    public final /* synthetic */ C184628Hd A04;
    public final /* synthetic */ C208619Kv A05;
    public final /* synthetic */ ShutterButton A06;

    public AZS(Handler handler, C1810981l c1810981l, C184628Hd c184628Hd, C208619Kv c208619Kv, ShutterButton shutterButton, int i, int i2) {
        this.A05 = c208619Kv;
        this.A03 = c1810981l;
        this.A02 = handler;
        this.A06 = shutterButton;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c184628Hd;
    }

    @Override // X.InterfaceC203488z7
    public final /* bridge */ /* synthetic */ void DaC(Object obj) {
        Object obj2;
        List list = (List) obj;
        C14360o3.A0B(list, 0);
        C208619Kv c208619Kv = this.A05;
        if (!c208619Kv.A04.get() && c208619Kv.A00) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (C14360o3.A0K(((ACW) obj2).A01, "open_hand")) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            ACW acw = (ACW) obj2;
            if (C1810981l.A05(C81W.A0J, this.A03) && acw != null) {
                this.A02.post(new RunnableC24882Azh(acw, this.A04, c208619Kv, this.A06, this.A01, this.A00));
            }
        }
    }
}
