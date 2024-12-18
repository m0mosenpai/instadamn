package X;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class OUF {
    public final C54505O6i A00;
    public final HashMap A01;
    public final ConcurrentHashMap A02;
    public final ExecutorService A03;
    public final OTZ A04;
    public final HashMap A05;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.PzK, java.lang.Object] */
    public OUF(OTZ otz) {
        String str;
        this.A04 = otz;
        this.A01 = AbstractC166987dD.A1G();
        this.A05 = AbstractC166987dD.A1G();
        this.A02 = new ConcurrentHashMap();
        this.A03 = new Object().A01(C05F.A06, 1);
        String str2 = otz.A02;
        switch (otz.A01.intValue()) {
            case 0:
                str = "NOT_SET";
                break;
            case 1:
                str = "FB_REELS";
                break;
            case 2:
                str = "FB_FEED";
                break;
            case 3:
                str = "InspirationVideo";
                break;
            case 4:
                str = "InspirationStories";
                break;
            case 5:
                str = "FB_SMART_THUMBNAIL";
                break;
            default:
                str = AbstractC111324zv.A00(1652);
                break;
        }
        this.A00 = new C54505O6i(otz.A00, str2, str);
    }

    public OUF() {
        this(new OTZ(null, C05F.A00, ""));
    }
}
