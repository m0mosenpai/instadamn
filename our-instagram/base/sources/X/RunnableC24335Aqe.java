package X;

import android.os.Bundle;

/* renamed from: X.Aqe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24335Aqe implements Runnable {
    public final /* synthetic */ C172017lW A00;

    public RunnableC24335Aqe(C172017lW c172017lW) {
        this.A00 = c172017lW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C172017lW c172017lW = this.A00;
        C189448aO c189448aO = new C189448aO(c172017lW.A01);
        c189448aO.A0k = false;
        c189448aO.A0a = true;
        c189448aO.A0q = false;
        c189448aO.A11 = false;
        c189448aO.A13 = true;
        c189448aO.A0y = false;
        C189478aR A00 = c189448aO.A00();
        String str = c172017lW.A03;
        EJS ejs = new EJS();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(44), str);
        ejs.setArguments(A0b);
        ejs.A01 = new ViewOnClickListenerC23248ASj(4, A00, c172017lW);
        ejs.A00 = new ViewOnClickListenerC23248ASj(5, A00, c172017lW);
        A00.A02(c172017lW.A00, ejs);
    }
}
