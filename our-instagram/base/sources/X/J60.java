package X;

import android.view.View;
import instagram.features.clips.audio.ui.SegmentsMusicPlayerView;
import java.util.List;

/* loaded from: classes7.dex */
public final class J60 implements Runnable {
    public final /* synthetic */ SegmentsMusicPlayerView A00;
    public final /* synthetic */ List A01;

    public J60(SegmentsMusicPlayerView segmentsMusicPlayerView, List list) {
        this.A00 = segmentsMusicPlayerView;
        this.A01 = list;
    }

    public static float A00(List list, int i) {
        return (((View) list.get(i - 1)).getX() + ((View) list.get(r2)).getWidth()) - ((View) list.get(i)).getX();
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A00.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                List list2 = this.A01;
                float A00 = A00(list2, i);
                if (A00 > 0.0f) {
                    ((View) list2.get(i)).setTranslationX(A00);
                }
            }
        }
        List list3 = this.A01;
        float x = (((View) list3.get(AbstractC25226BEj.A05(list))).getX() + ((View) list3.get(AbstractC25226BEj.A05(list))).getWidth()) - r7.A09.getRight();
        int A05 = AbstractC25226BEj.A05(list);
        if (A05 < 0) {
            return;
        }
        while (true) {
            int i2 = A05 - 1;
            if (x > 0.0f) {
                ((View) list3.get(A05)).setTranslationX(((View) list3.get(A05)).getTranslationX() - x);
                if (A05 != 0) {
                    x = A00(list3, A05);
                }
            }
            if (i2 >= 0) {
                A05 = i2;
            } else {
                return;
            }
        }
    }
}
