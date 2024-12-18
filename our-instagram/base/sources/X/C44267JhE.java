package X;

import android.animation.ArgbEvaluator;
import android.view.View;
import android.widget.TextView;
import com.instagram.creation.base.ui.mediatabbar.MediaTabBar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JhE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44267JhE extends C668630d {
    public final /* synthetic */ GestureDetectorOnGestureListenerC44266JhD A00;

    public C44267JhE(GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD) {
        this.A00 = gestureDetectorOnGestureListenerC44266JhD;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD = this.A00;
        com.instagram.creation.base.ui.mediatabbar.Tab currentTab = gestureDetectorOnGestureListenerC44266JhD.getCurrentTab();
        if (gestureDetectorOnGestureListenerC44266JhD.A04 != currentTab) {
            com.instagram.creation.base.ui.mediatabbar.Tab currentTab2 = gestureDetectorOnGestureListenerC44266JhD.getCurrentTab();
            Iterator it = gestureDetectorOnGestureListenerC44266JhD.A0L.iterator();
            while (it.hasNext()) {
                ((MQQ) it.next()).Drl(currentTab2);
            }
            gestureDetectorOnGestureListenerC44266JhD.A04 = currentTab;
        }
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float currentProgress;
        float clampedSpringValue;
        float currentProgress2;
        float currentProgress3;
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD = this.A00;
        MediaTabBar mediaTabBar = gestureDetectorOnGestureListenerC44266JhD.A0I;
        currentProgress = gestureDetectorOnGestureListenerC44266JhD.getCurrentProgress();
        mediaTabBar.A00 = currentProgress;
        if (mediaTabBar.A04) {
            currentProgress = AbstractC31172DnG.A03(mediaTabBar.A07, 1) - currentProgress;
        }
        int ceil = (int) Math.ceil(currentProgress);
        int i = mediaTabBar.A03;
        if (i != -1 && i != ceil) {
            List list = mediaTabBar.A07;
            AbstractC58452m4.A00((View) list.get(i), mediaTabBar.A03 + 1, list.size(), false);
        }
        List list2 = mediaTabBar.A07;
        AbstractC58452m4.A00((View) list2.get(ceil), ceil + 1, list2.size(), true);
        mediaTabBar.A03 = ceil;
        ArgbEvaluator argbEvaluator = mediaTabBar.A05;
        float f = ceil - currentProgress;
        int i2 = mediaTabBar.A02;
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(mediaTabBar.A01);
        int A0D = AbstractC25230BEn.A0D(argbEvaluator.evaluate(f, valueOf, valueOf2), "null cannot be cast to non-null type kotlin.Int");
        int A0D2 = AbstractC25230BEn.A0D(argbEvaluator.evaluate(f, valueOf2, valueOf), "null cannot be cast to non-null type kotlin.Int");
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (ceil == i3) {
                ((TextView) list2.get(i3)).setTextColor(A0D2);
            } else {
                int i4 = ceil - i3;
                if (i4 <= 1 && i4 >= 0) {
                    ((TextView) list2.get(i3)).setTextColor(A0D);
                } else {
                    ((TextView) list2.get(i3)).setTextColor(i2);
                }
            }
        }
        mediaTabBar.invalidate();
        com.instagram.creation.base.ui.mediatabbar.Tab currentTab = gestureDetectorOnGestureListenerC44266JhD.getCurrentTab();
        boolean A1a = AbstractC25229BEm.A1a(currentTab, gestureDetectorOnGestureListenerC44266JhD.A03);
        clampedSpringValue = gestureDetectorOnGestureListenerC44266JhD.getClampedSpringValue();
        for (MQQ mqq : gestureDetectorOnGestureListenerC44266JhD.A0L) {
            if (!gestureDetectorOnGestureListenerC44266JhD.A0M) {
                currentProgress2 = gestureDetectorOnGestureListenerC44266JhD.getCurrentProgress();
            } else {
                float childCount = mediaTabBar.getChildCount() - 1;
                currentProgress3 = gestureDetectorOnGestureListenerC44266JhD.getCurrentProgress();
                currentProgress2 = childCount - currentProgress3;
            }
            mqq.Drj(currentProgress2 + gestureDetectorOnGestureListenerC44266JhD.A01, clampedSpringValue);
            if (A1a) {
                mqq.Drk(gestureDetectorOnGestureListenerC44266JhD.A03, currentTab);
            }
        }
        gestureDetectorOnGestureListenerC44266JhD.A03 = currentTab;
    }
}
