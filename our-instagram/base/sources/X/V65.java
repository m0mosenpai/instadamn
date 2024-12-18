package X;

import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public final class V65 extends AbstractRunnableC14200nk {
    public final /* synthetic */ ChoreographerFrameCallbackC66314U8n A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V65(ChoreographerFrameCallbackC66314U8n choreographerFrameCallbackC66314U8n) {
        super(21, 1, false, true);
        this.A00 = choreographerFrameCallbackC66314U8n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChoreographerFrameCallbackC66314U8n choreographerFrameCallbackC66314U8n = this.A00;
        XEC xec = choreographerFrameCallbackC66314U8n.A04;
        int i = choreographerFrameCallbackC66314U8n.A00;
        Bitmap bitmap = choreographerFrameCallbackC66314U8n.A01;
        C14360o3.A0A(bitmap);
        xec.EMm(i, bitmap);
        C11T.A02(choreographerFrameCallbackC66314U8n.A05);
    }
}
