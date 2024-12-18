package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.R;
import java.util.List;

/* renamed from: X.VLx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68311VLx {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Runnable runnableC71406WtU;
        C6FQ c6fq2 = c6fq;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type android.os.Handler");
        Handler handler = (Handler) A01;
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
        if (!AbstractC79383gk.A03() && C14360o3.A0K(handler.getLooper(), Looper.getMainLooper())) {
            runnableC71406WtU = new RunnableC71405WtT(c6fq2, interfaceC103384lE);
        } else {
            if (AbstractC79383gk.A03() && !C14360o3.A0K(handler.getLooper(), Looper.getMainLooper())) {
                C6FG c6fg = c6fq2.A03;
                if (c6fg == null) {
                    c6fq2 = null;
                } else {
                    InterfaceC62872tQ interfaceC62872tQ = c6fg.A02;
                    List list = c6fq2.A0D;
                    AnonymousClass632 A05 = AnonymousClass634.A02(c6fg).A05();
                    InterfaceC103074ki A052 = AnonymousClass634.A05(c6fg);
                    c6fq2 = new C6FQ(null, null, c6fg, A05, null, interfaceC62872tQ.AgS().AgX(), interfaceC103384lE, A052, C05F.A01, (String) c6fg.A01.get(R.id.bk_context_key_logging_id), null, list, null, null);
                }
            }
            runnableC71406WtU = new RunnableC71406WtU(c6fq2, interfaceC103384lE);
        }
        handler.post(runnableC71406WtU);
        return null;
    }
}
