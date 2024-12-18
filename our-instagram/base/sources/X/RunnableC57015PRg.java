package X;

import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.PRg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57015PRg implements Runnable {
    public final /* synthetic */ IgdsSwitch A00;
    public final /* synthetic */ C50808McV A01;

    public RunnableC57015PRg(IgdsSwitch igdsSwitch, C50808McV c50808McV) {
        this.A01 = c50808McV;
        this.A00 = igdsSwitch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50808McV c50808McV = this.A01;
        c50808McV.A0L.A00(c50808McV.A0H, this.A00, c50808McV.A0J);
    }
}
