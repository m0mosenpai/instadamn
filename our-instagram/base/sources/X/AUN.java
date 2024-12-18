package X;

import android.R;
import android.transition.TransitionManager;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public final class AUN implements InterfaceC58362lv {
    public final /* synthetic */ C194648jP A00;
    public final /* synthetic */ Runnable A01;

    public AUN(C194648jP c194648jP, Runnable runnable) {
        this.A00 = c194648jP;
        this.A01 = runnable;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        if (AbstractC166987dD.A1a(obj)) {
            C194648jP c194648jP = this.A00;
            c194648jP.A01(false);
            InterfaceC58362lv interfaceC58362lv = c194648jP.A02;
            if (interfaceC58362lv != null) {
                this.A01.run();
                ViewGroup viewGroup = c194648jP.A0B;
                viewGroup.setBackgroundColor(viewGroup.getContext().getColor(R.color.transparent));
                if (c194648jP.A06.getParent() != null) {
                    TransitionManager.endTransitions(viewGroup);
                }
                TransitionManager.go(c194648jP.A04, null);
                c194648jP.A0F.A02.A08(interfaceC58362lv);
            }
        }
    }
}
