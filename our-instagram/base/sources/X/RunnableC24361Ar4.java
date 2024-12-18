package X;

/* renamed from: X.Ar4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24361Ar4 implements Runnable {
    public final /* synthetic */ ViewOnFocusChangeListenerC23258ASt A00;

    public RunnableC24361Ar4(ViewOnFocusChangeListenerC23258ASt viewOnFocusChangeListenerC23258ASt) {
        this.A00 = viewOnFocusChangeListenerC23258ASt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnFocusChangeListenerC23258ASt viewOnFocusChangeListenerC23258ASt = this.A00;
        viewOnFocusChangeListenerC23258ASt.A0A.getClass();
        viewOnFocusChangeListenerC23258ASt.A02 = viewOnFocusChangeListenerC23258ASt.A0A.getLineCount() * Math.round(r0.getLineHeight() / AbstractC167007dF.A0K(viewOnFocusChangeListenerC23258ASt.A0K).density);
    }
}
