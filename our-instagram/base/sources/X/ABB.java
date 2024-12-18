package X;

import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.List;

/* loaded from: classes4.dex */
public final class ABB {
    public final /* synthetic */ AbstractC65902yS A00;

    public ABB(AbstractC65902yS abstractC65902yS) {
        this.A00 = abstractC65902yS;
    }

    public final void A00(AbstractC61283Rku abstractC61283Rku, String str) {
        C75673aY c75673aY;
        int i;
        LithoView lithoView;
        List A0m = AbstractC167007dF.A0m(str, "/", 0);
        if (A0m.size() == 2) {
            Object obj = A0m.get(0);
            Object obj2 = A0m.get(1);
            AbstractC65902yS abstractC65902yS = this.A00;
            if (C14360o3.A0K(obj, abstractC65902yS.A04()) && (c75673aY = (C75673aY) abstractC65902yS.A02.A02(obj2)) != null) {
                if (abstractC61283Rku instanceof QJZ) {
                    i = -65536;
                } else if (abstractC61283Rku instanceof QJa) {
                    i = -16776961;
                } else {
                    throw B4Z.A00();
                }
                ComponentTree componentTree = c75673aY.A01;
                if (componentTree != null && (lithoView = componentTree.A07) != null) {
                    lithoView.getViewTreeObserver().addOnPreDrawListener(new WOL(lithoView, i));
                }
            }
        }
    }
}
