package X;

import android.view.ViewStub;
import kotlin.Deprecated;

@Deprecated(message = "")
/* loaded from: classes4.dex */
public final class ABS {
    public AbstractC210669Tj A00;
    public InterfaceC172727mi A01;
    public final ViewStub A02;
    public final InterfaceC172717mh A03;

    public final void A00(String str) {
        AbstractC210669Tj abstractC210669Tj;
        QF6 C9a = this.A03.C9a();
        if ((C9a != null && C9a.A0b) || (abstractC210669Tj = this.A00) == null) {
            return;
        }
        abstractC210669Tj.setTitle(str);
    }

    public ABS(ViewStub viewStub, InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi) {
        this.A01 = interfaceC172727mi;
        this.A03 = interfaceC172717mh;
        this.A02 = viewStub;
    }
}
