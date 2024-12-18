package X;

import android.os.Handler;

/* renamed from: X.Ax3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24722Ax3 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C175887s2 A01;
    public final /* synthetic */ InterfaceC176157sY A02;

    public RunnableC24722Ax3(Handler handler, C175887s2 c175887s2, InterfaceC176157sY interfaceC176157sY) {
        this.A01 = c175887s2;
        this.A02 = interfaceC176157sY;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C175887s2 c175887s2 = this.A01;
        InterfaceC176157sY interfaceC176157sY = this.A02;
        Handler handler = this.A00;
        c175887s2.A0I.A05.A01("rOAS");
        if (c175887s2.A03 == null) {
            C175887s2.A01(handler, new C212399b8("Audio pipeline should not be null"), interfaceC176157sY, "removeOutput");
            return;
        }
        c175887s2.A0L.CiR(AbstractC166987dD.A0M(c175887s2), "audio_pipeline_removing_output", "AudioPipelineController", null);
        c175887s2.A0G.A00 = null;
        c175887s2.A03.stopInput(new C23396AYv(handler, c175887s2, interfaceC176157sY, 2), c175887s2.A0B);
    }
}
