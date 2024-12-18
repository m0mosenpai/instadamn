package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* renamed from: X.Axu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24772Axu implements Runnable {
    public final /* synthetic */ CachingVideoSaver A00;
    public final /* synthetic */ InterfaceC25207BDf A01;
    public final /* synthetic */ String A02;

    public RunnableC24772Axu(CachingVideoSaver cachingVideoSaver, InterfaceC25207BDf interfaceC25207BDf, String str) {
        this.A01 = interfaceC25207BDf;
        this.A00 = cachingVideoSaver;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25207BDf interfaceC25207BDf = this.A01;
        if (interfaceC25207BDf != null) {
            interfaceC25207BDf.onStart();
            interfaceC25207BDf.onFinish();
            Object obj = this.A00.A03.get(this.A02);
            if (obj != null) {
                interfaceC25207BDf.DqC((String) obj);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
