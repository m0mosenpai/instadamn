package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TwK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65913TwK implements Runnable {
    public final /* synthetic */ C70623Ez A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC65913TwK(C70623Ez c70623Ez, ArrayList arrayList) {
        this.A00 = c70623Ez;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            VK0 vk0 = (VK0) it.next();
            C70623Ez c70623Ez = this.A00;
            C3OO c3oo = vk0.A05;
            View view2 = null;
            if (c3oo == null) {
                view = null;
            } else {
                view = c3oo.itemView;
            }
            C3OO c3oo2 = vk0.A04;
            if (c3oo2 != null) {
                view2 = c3oo2.itemView;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c70623Ez.A07());
                c70623Ez.A02.add(vk0.A05);
                duration.translationX(vk0.A02 - vk0.A00);
                duration.translationY(vk0.A03 - vk0.A01);
                duration.alpha(0.0f).setListener(new C65910TwH(view, duration, vk0, c70623Ez, 0)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                c70623Ez.A02.add(vk0.A04);
                animate.translationX(0.0f).translationY(0.0f).setDuration(c70623Ez.A07()).alpha(1.0f).setListener(new C65910TwH(view2, animate, vk0, c70623Ez, 1)).start();
            }
        }
        arrayList.clear();
        this.A00.A03.remove(arrayList);
    }
}
