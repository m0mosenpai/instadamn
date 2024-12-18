package X;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PJP implements XOT {
    public int A00;
    public int A01;
    public final List A02;
    public final C47s A03;
    public final O9H A04;
    public final O9I A05;
    public final java.util.Set A06;

    public PJP(C47s c47s, java.util.Set set) {
        C14360o3.A0B(c47s, 2);
        this.A06 = set;
        this.A03 = c47s;
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        c47s.A06 = emptyList;
        this.A02 = AbstractC166987dD.A1E();
        this.A05 = new O9I();
        this.A04 = new O9H();
    }

    @Override // X.XOT
    public final void DfL() {
        List list = this.A02;
        list.size();
        C47s c47s = this.A03;
        c47s.A06 = list;
        int i = this.A01;
        int i2 = this.A00;
        c47s.A02 = i;
        c47s.A01 = i2;
        Iterator it = this.A05.A01.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += MSY.A07(it);
        }
        c47s.A03 = j;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.MqY, java.lang.Object] */
    @Override // X.XOT
    public final void DIR(YRL yrl, int i, long j) {
        if (AbstractC166987dD.A0y().A0a()) {
            O9I o9i = this.A05;
            List list = o9i.A01;
            Iterator it = list.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                j2 += MSY.A07(it);
            }
            if (j2 <= 500) {
                o9i.A00 = SystemClock.elapsedRealtime();
                if (this.A06.contains(Integer.valueOf(i))) {
                    int width = yrl.getWidth();
                    int height = yrl.getHeight();
                    File A0w = MSW.A0w(AbstractC916948n.A05(), AnonymousClass001.A0e("frame_capture_", ".png", System.currentTimeMillis()));
                    int i2 = i - 1;
                    O9H o9h = this.A04;
                    if (o9h.A01) {
                        if (j <= 0) {
                            o9h.A00 = -j;
                        }
                        o9h.A01 = false;
                    }
                    long j3 = j + o9h.A00;
                    try {
                        List list2 = this.A02;
                        String A0i = MSX.A0i(A0w);
                        ?? obj = new Object();
                        obj.A04 = 0L;
                        obj.A03 = 0L;
                        obj.A02 = -1;
                        obj.A01 = -1;
                        obj.A06 = null;
                        obj.A05 = null;
                        obj.A00 = -100.0f;
                        obj.A04 = j3;
                        obj.A06 = A0i;
                        obj.A02 = i2;
                        list2.add(obj);
                    } catch (IOException e) {
                        C0K8.A0F("VideoFrameSaver", "failed to retrieve reference file path", e);
                        C0w9.A07("reference_image_file_path_error", e);
                    }
                    this.A01 = width;
                    this.A00 = height;
                    AbstractC66019TyH.A02(new C52246NAk(A0w, i, width, height, j), width, height);
                    list.add(Long.valueOf(SystemClock.elapsedRealtime() - o9i.A00));
                }
            }
        }
    }
}
