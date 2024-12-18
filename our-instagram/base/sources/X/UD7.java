package X;

import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class UD7 extends VKK {
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Window.Callback A04;
    public final InterfaceC71830X6m A05;
    public final InterfaceC71936XBl A06;
    public final InterfaceC71833X6q A08;
    public ArrayList A00 = new ArrayList();
    public final Runnable A07 = new RunnableC71205Wpw(this);

    public static Menu A00(UD7 ud7) {
        if (!ud7.A03) {
            InterfaceC71936XBl interfaceC71936XBl = ud7.A06;
            ((WPa) interfaceC71936XBl).A09.setMenuCallbacks(new WPS(ud7), new WPL(ud7));
            ud7.A03 = true;
        }
        return ((WPa) ud7.A06).A09.getMenu();
    }

    public UD7(Window.Callback callback, Toolbar toolbar, CharSequence charSequence) {
        C70272WPc c70272WPc = new C70272WPc(this);
        this.A08 = c70272WPc;
        WPa wPa = new WPa(toolbar, false);
        this.A06 = wPa;
        callback.getClass();
        this.A04 = callback;
        wPa.A07 = callback;
        toolbar.A0H = c70272WPc;
        wPa.setWindowTitle(charSequence);
        this.A05 = new WPI(this);
    }
}
