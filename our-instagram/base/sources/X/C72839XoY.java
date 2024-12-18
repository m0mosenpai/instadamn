package X;

import androidx.media3.common.Timeline;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.XoY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72839XoY {
    public YM6 A00;
    public boolean A02;
    public final YM5 A03;
    public final YMD A04;
    public final YRD A05;
    public final C73316Y4i A0B;
    public YMO A01 = new Y95(new Random(), new int[0]);
    public final IdentityHashMap A07 = new IdentityHashMap();
    public final Map A09 = AbstractC166987dD.A1G();
    public final List A08 = AbstractC166987dD.A1E();
    public final HashMap A06 = AbstractC166987dD.A1G();
    public final java.util.Set A0A = AbstractC166987dD.A1H();

    public final Timeline A00() {
        List list = this.A08;
        if (list.isEmpty()) {
            return Timeline.A00;
        }
        if (0 < list.size()) {
            list.get(0);
            throw AbstractC166987dD.A15("firstWindowIndexInChild");
        }
        YMO ymo = this.A01;
        Timeline timeline = Timeline.A00;
        Timeline[] timelineArr = new Timeline[list.size()];
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("getTimeline");
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw AbstractC166987dD.A15("getUid");
        }
        return new XQH(ymo, timelineArr, objArr);
    }

    public C72839XoY(YM5 ym5, YMD ymd, YRD yrd, C73316Y4i c73316Y4i) {
        this.A0B = c73316Y4i;
        this.A04 = ymd;
        this.A05 = yrd;
        this.A03 = ym5;
    }
}
