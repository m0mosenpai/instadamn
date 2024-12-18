package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* loaded from: classes12.dex */
public final class YIP implements Runnable {
    public final /* synthetic */ CachingVideoSaver A00;
    public final /* synthetic */ Exception A01;
    public final /* synthetic */ String A02;

    public YIP(CachingVideoSaver cachingVideoSaver, Exception exc, String str) {
        this.A00 = cachingVideoSaver;
        this.A02 = str;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25207BDf interfaceC25207BDf = (InterfaceC25207BDf) this.A00.A02.get(this.A02);
        if (interfaceC25207BDf != null) {
            interfaceC25207BDf.DFi(this.A01);
        }
    }
}
