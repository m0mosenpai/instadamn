package X;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class ULX extends AbstractC66278U6y {
    public static final ArrayList A0C;
    public static final String[] A0D;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C69718VuD A08;
    public final WDS A09;
    public final C2TB A0A;
    public final int[] A0B;

    public abstract C70174WEw A0H(int i, int i2, int i3);

    public final void A0J(int i, int i2, int i3, int i4) {
        String str;
        int i5 = super.A0B;
        C70174WEw c70174WEw = new C70174WEw(i5, i5);
        c70174WEw.A02 = i;
        c70174WEw.A03 = i2;
        c70174WEw.A04 = i3;
        c70174WEw.A0B = 1;
        this.A09.A03(c70174WEw);
        C66534ULo c66534ULo = new C66534ULo(this, c70174WEw, i, i2, i3, i4);
        if (i3 >= 0) {
            String[] strArr = A0D;
            if (i3 < 22) {
                str = strArr[i3];
                C70184WFm.A02(c66534ULo, str);
            }
        }
        str = "INVALID_ZOOM_LEVEL";
        C70184WFm.A02(c66534ULo, str);
    }

    static {
        String[] strArr = new String[22];
        A0D = strArr;
        int i = 0;
        do {
            strArr[i] = String.valueOf(i);
            i++;
        } while (i <= 21);
        A0C = new ArrayList(5);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01b7  */
    @Override // X.AbstractC66278U6y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0D(android.graphics.Canvas r33) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ULX.A0D(android.graphics.Canvas):void");
    }

    public void A0I() {
        WDS wds = this.A09;
        C70174WEw c70174WEw = wds.A04;
        while (c70174WEw != null) {
            C70174WEw c70174WEw2 = c70174WEw.A07;
            c70174WEw.A03();
            c70174WEw = c70174WEw2;
        }
        C70174WEw c70174WEw3 = new C70174WEw(-1, -1);
        wds.A06 = c70174WEw3;
        c70174WEw3.A02 = 0;
        c70174WEw3.A03 = 0;
        c70174WEw3.A04 = 0;
        wds.A04 = c70174WEw3;
        wds.A05 = c70174WEw3;
        wds.A00 = 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2TB, java.lang.Object] */
    public ULX(C70394WTw c70394WTw, WDS wds) {
        super(c70394WTw);
        this.A08 = new C69718VuD();
        this.A0A = new Object();
        this.A0B = new int[2];
        this.A09 = wds;
        ActivityManager activityManager = (ActivityManager) c70394WTw.A0G.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory && memoryInfo.availMem >= 500000000 && memoryInfo.totalMem >= 3000000000L) {
                return;
            }
        }
        C70174WEw.A0D = Bitmap.Config.RGB_565;
    }

    @Override // X.AbstractC66278U6y
    public final void A09(boolean z) {
        super.A09(z);
    }
}
