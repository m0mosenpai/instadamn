package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;
import java.util.Map;

/* renamed from: X.YEe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73461YEe implements InterfaceC25207BDf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CachingVideoSaver A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC25207BDf
    public final void DFi(Exception exc) {
        C14360o3.A0B(exc, 0);
        CachingVideoSaver cachingVideoSaver = this.A01;
        Map map = cachingVideoSaver.A01;
        String str = this.A02;
        Number A0Q = AbstractC37300Gc1.A0Q(str, map);
        int i = this.A00;
        if (A0Q != null && A0Q.intValue() == i) {
            C11T.A02(new YIP(cachingVideoSaver, exc, str));
            cachingVideoSaver.A02.remove(str);
        }
    }

    @Override // X.InterfaceC25207BDf
    public final void DqC(String str) {
        C14360o3.A0B(str, 0);
        CachingVideoSaver cachingVideoSaver = this.A01;
        Map map = cachingVideoSaver.A01;
        String str2 = this.A02;
        Number A0Q = AbstractC37300Gc1.A0Q(str2, map);
        int i = this.A00;
        if (A0Q != null && A0Q.intValue() == i) {
            cachingVideoSaver.A03.put(str2, str);
            C11T.A02(new YIQ(cachingVideoSaver, str2, str));
            cachingVideoSaver.A02.remove(str2);
        }
    }

    public C73461YEe(CachingVideoSaver cachingVideoSaver, String str, int i) {
        this.A01 = cachingVideoSaver;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // X.InterfaceC25207BDf
    public final void onFinish() {
        CachingVideoSaver cachingVideoSaver = this.A01;
        Map map = cachingVideoSaver.A01;
        String str = this.A02;
        Number A0Q = AbstractC37300Gc1.A0Q(str, map);
        int i = this.A00;
        if (A0Q != null && A0Q.intValue() == i) {
            cachingVideoSaver.A04.remove(str);
            C11T.A02(new RunnableC73514YHe(cachingVideoSaver, str));
        }
    }

    @Override // X.InterfaceC25207BDf
    public final void onStart() {
        CachingVideoSaver cachingVideoSaver = this.A01;
        Map map = cachingVideoSaver.A01;
        String str = this.A02;
        Number A0Q = AbstractC37300Gc1.A0Q(str, map);
        int i = this.A00;
        if (A0Q != null && A0Q.intValue() == i) {
            C11T.A02(new RunnableC73515YHf(cachingVideoSaver, str));
        }
    }
}
