package X;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.58S, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C58S extends C03E implements InterfaceC16660sJ {
    public C58S(Object obj) {
        super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Rect rect;
        View findNextFocusFromRect;
        int i = ((BJY) obj).A00;
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        boolean z = false;
        if (i == 7) {
            z = true;
        }
        boolean z2 = false;
        if (!z && i != 8) {
            Integer A01 = AbstractC25332BJb.A01(i);
            if (A01 != null) {
                int intValue = A01.intValue();
                C114205Dh A04 = AndroidComposeView.A04(androidComposeView);
                if (A04 != null) {
                    rect = AbstractC28289Cdb.A00(A04);
                } else {
                    rect = null;
                }
                FocusFinder focusFinder = FocusFinder.getInstance();
                if (rect == null) {
                    findNextFocusFromRect = focusFinder.findNextFocus(androidComposeView, androidComposeView.findFocus(), intValue);
                } else {
                    findNextFocusFromRect = focusFinder.findNextFocusFromRect(androidComposeView, rect, intValue);
                }
                if (findNextFocusFromRect != null) {
                    z2 = AbstractC25332BJb.A02(rect, findNextFocusFromRect, A01);
                }
            } else {
                throw new IllegalStateException("Invalid focus direction");
            }
        }
        return Boolean.valueOf(z2);
    }
}
