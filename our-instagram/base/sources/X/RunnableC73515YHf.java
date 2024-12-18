package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* renamed from: X.YHf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73515YHf implements Runnable {
    public final /* synthetic */ CachingVideoSaver A00;
    public final /* synthetic */ String A01;

    public RunnableC73515YHf(CachingVideoSaver cachingVideoSaver, String str) {
        this.A00 = cachingVideoSaver;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25207BDf interfaceC25207BDf = (InterfaceC25207BDf) this.A00.A02.get(this.A01);
        if (interfaceC25207BDf != null) {
            interfaceC25207BDf.onStart();
        }
    }
}
