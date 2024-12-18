package X;

import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.Asq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24471Asq implements Runnable {
    public final /* synthetic */ BottomSheetFragment A00;

    public RunnableC24471Asq(BottomSheetFragment bottomSheetFragment) {
        this.A00 = bottomSheetFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3DN bottomSheetNavigator = this.A00.A04.getBottomSheetNavigator();
        if (bottomSheetNavigator != null) {
            ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) bottomSheetNavigator).A0D;
            if (viewOnTouchListenerC65896Tw0 != null) {
                int A0F = viewOnTouchListenerC65896Tw0.A0F();
                float min = (float) Math.min(Math.max(A0F, ViewOnTouchListenerC65896Tw0.A00(viewOnTouchListenerC65896Tw0)), ViewOnTouchListenerC65896Tw0.A02(viewOnTouchListenerC65896Tw0));
                if (A0F != min) {
                    viewOnTouchListenerC65896Tw0.A0V.A06(min);
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
