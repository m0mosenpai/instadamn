package X;

/* renamed from: X.Wrb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71307Wrb implements Runnable {
    public final /* synthetic */ ChoreographerFrameCallbackC66314U8n A00;

    public RunnableC71307Wrb(ChoreographerFrameCallbackC66314U8n choreographerFrameCallbackC66314U8n) {
        this.A00 = choreographerFrameCallbackC66314U8n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChoreographerFrameCallbackC66314U8n choreographerFrameCallbackC66314U8n = this.A00;
        choreographerFrameCallbackC66314U8n.A02 = true;
        choreographerFrameCallbackC66314U8n.invalidateSelf();
    }
}
