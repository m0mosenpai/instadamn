package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* loaded from: classes12.dex */
public final class YIQ implements Runnable {
    public final /* synthetic */ CachingVideoSaver A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public YIQ(CachingVideoSaver cachingVideoSaver, String str, String str2) {
        this.A00 = cachingVideoSaver;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC25207BDf interfaceC25207BDf = (InterfaceC25207BDf) this.A00.A02.get(this.A01);
        if (interfaceC25207BDf != null) {
            interfaceC25207BDf.DqC(this.A02);
        }
    }
}
