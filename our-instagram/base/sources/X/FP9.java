package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public final class FP9 {
    public final /* synthetic */ G2S A00;

    public FP9(G2S g2s) {
        this.A00 = g2s;
    }

    public final void A00(List list) {
        Integer num;
        G2S g2s = this.A00;
        Integer num2 = g2s.A01;
        Integer num3 = C05F.A01;
        if (num2 == num3) {
            if (list == null || list.isEmpty()) {
                g2s.A01 = C05F.A00;
                g2s.Cha();
                return;
            }
        } else if (list == null) {
            return;
        }
        FFV ffv = g2s.A03;
        if (ffv == null) {
            return;
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        if (g2s.A01 == num3) {
            num = ((G2R) g2s.A04).A02;
            Integer num4 = C05F.A0Y;
            if (num != num4) {
                g2s.A01 = C05F.A00;
                C14360o3.A0B(num4, 0);
                C14360o3.A0A(copyOf);
                C32372ENy c32372ENy = ffv.A00;
                c32372ENy.A0K.post(new RunnableC36898GNt(copyOf, c32372ENy));
            }
        } else {
            num = ((G2R) g2s.A00).A02;
        }
        C14360o3.A0B(num, 0);
        C14360o3.A0A(copyOf);
        C32372ENy c32372ENy2 = ffv.A00;
        c32372ENy2.A0K.post(new RunnableC36898GNt(copyOf, c32372ENy2));
    }
}
