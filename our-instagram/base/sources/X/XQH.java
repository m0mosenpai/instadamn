package X;

import androidx.media3.common.Timeline;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class XQH extends XQ9 {
    public final int A00;
    public final int A01;
    public final HashMap A02;
    public final int[] A03;
    public final int[] A04;
    public final Timeline[] A05;
    public final Object[] A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQH(YMO ymo, Timeline[] timelineArr, Object[] objArr) {
        super(ymo);
        int i = 0;
        int length = timelineArr.length;
        this.A05 = timelineArr;
        this.A03 = new int[length];
        this.A04 = new int[length];
        this.A06 = objArr;
        this.A02 = AbstractC166987dD.A1G();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            Timeline timeline = timelineArr[i];
            Timeline[] timelineArr2 = this.A05;
            timelineArr2[i4] = timeline;
            this.A04[i4] = i2;
            this.A03[i4] = i3;
            i2 += timeline.A02();
            i3 += timelineArr2[i4].A01();
            this.A02.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.A01 = i2;
        this.A00 = i3;
    }
}
