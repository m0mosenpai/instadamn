package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.GOk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36915GOk implements Runnable {
    public final /* synthetic */ IgdsBottomButtonLayout A00;
    public final /* synthetic */ C32330EMc A01;

    public RunnableC36915GOk(IgdsBottomButtonLayout igdsBottomButtonLayout, C32330EMc c32330EMc) {
        this.A01 = c32330EMc;
        this.A00 = igdsBottomButtonLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32330EMc c32330EMc = this.A01;
        c32330EMc.A00 = this.A00.getHeight();
        C32330EMc.A00(c32330EMc);
    }
}
