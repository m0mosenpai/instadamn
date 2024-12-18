package X;

/* renamed from: X.Wq4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71213Wq4 implements Runnable {
    public final /* synthetic */ WPW A00;

    public RunnableC71213Wq4(WPW wpw) {
        this.A00 = wpw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WPW wpw = this.A00;
        C66360UCh c66360UCh = wpw.A0A;
        if (c66360UCh != null && c66360UCh.isAttachedToWindow() && wpw.A0A.getCount() > wpw.A0A.getChildCount()) {
            wpw.A0A.getChildCount();
            wpw.A09.setInputMethodMode(2);
            wpw.show();
        }
    }
}
