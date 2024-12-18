package X;

import android.media.MediaPlayer;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* loaded from: classes8.dex */
public final class LN0 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C44419JkE A01;

    public LN0(C44419JkE c44419JkE, int i) {
        this.A01 = c44419JkE;
        this.A00 = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        C47321KvW c47321KvW = this.A01.A02;
        int i = this.A00;
        C45492KCh c45492KCh = c47321KvW.A00;
        if (c45492KCh.A05) {
            int i2 = c45492KCh.A00 - 1;
            if (i < i2) {
                ReboundViewPager reboundViewPager = c45492KCh.A03;
                if (reboundViewPager != null) {
                    reboundViewPager.A0B(1.0f);
                    return;
                }
            } else {
                c45492KCh.A05 = false;
                ReboundViewPager reboundViewPager2 = c45492KCh.A03;
                if (reboundViewPager2 != null) {
                    reboundViewPager2.A0C(1.0f, i2);
                    return;
                }
            }
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
    }
}
