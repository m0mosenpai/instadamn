package X;

import android.os.Handler;

/* renamed from: X.Ayi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24822Ayi implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C175887s2 A01;
    public final /* synthetic */ C176087sR A02;
    public final /* synthetic */ InterfaceC176157sY A03;

    public RunnableC24822Ayi(Handler handler, C175887s2 c175887s2, C176087sR c176087sR, InterfaceC176157sY interfaceC176157sY) {
        this.A01 = c175887s2;
        this.A02 = c176087sR;
        this.A03 = interfaceC176157sY;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C175887s2 c175887s2 = this.A01;
        C176087sR c176087sR = this.A02;
        InterfaceC176157sY interfaceC176157sY = this.A03;
        Handler handler = this.A00;
        c175887s2.A0I.A05.A01("aAS");
        if (c175887s2.A03 == null) {
            C175887s2.A01(handler, new C212399b8("Audio pipeline should not be null"), interfaceC176157sY, "addOutput");
            return;
        }
        c175887s2.A0L.CiR(AbstractC166987dD.A0M(c175887s2), "audio_pipeline_adding_output", "AudioPipelineController", null);
        c175887s2.A0G.A00 = c176087sR;
        c175887s2.A03.startInput(new C23396AYv(handler, c175887s2, interfaceC176157sY, 1), c175887s2.A0B);
    }
}
