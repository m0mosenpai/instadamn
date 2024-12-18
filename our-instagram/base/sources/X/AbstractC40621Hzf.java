package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Hzf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40621Hzf {
    public static void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47732L5t c47732L5t, C68758Vbb c68758Vbb, C68759Vbc c68759Vbc, IC0 ic0, int i) {
        C130505uv c130505uv;
        ViewGroup viewGroup = c68759Vbc.A00;
        AbstractC13880nE.A0Y(viewGroup, 0);
        int i2 = 0;
        do {
            C153126ug c153126ug = ic0.A00;
            if (i2 < c153126ug.A01()) {
                c130505uv = (C130505uv) c153126ug.A02(i2);
            } else {
                c130505uv = null;
            }
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof IgImageButton)) {
                if (childAt != null) {
                    viewGroup.removeView(childAt);
                }
                childAt = (IgImageButton) c68758Vbb.A00.poll();
                if (childAt == null) {
                    childAt = new IgImageButton(viewGroup.getContext());
                }
                viewGroup.addView(childAt, i2);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            if (i2 < 2) {
                layoutParams.setMargins(0, 0, AbstractC25228BEl.A0M(childAt).getDimensionPixelSize(R.dimen.photo_grid_spacing), 0);
            }
            childAt.setLayoutParams(layoutParams);
            if (c130505uv != null) {
                C127915qK A02 = AbstractC127905qJ.A02(1, 1);
                C5qT c5qT = new C5qT(i, i2);
                if (c130505uv.A00.ordinal() == 1) {
                    Object obj = c130505uv.A0F;
                    C14360o3.A0A(obj);
                    C38321qM c38321qM = (C38321qM) obj;
                    LPV lpv = new LPV(1, c5qT, interfaceC11380iw, c47732L5t, userSession, c38321qM, A02, c38321qM.Cff());
                    ViewOnTouchListenerC42056IkP viewOnTouchListenerC42056IkP = new ViewOnTouchListenerC42056IkP(5, c5qT, c47732L5t, c38321qM);
                    ViewOnClickListenerC42029Ijy viewOnClickListenerC42029Ijy = new ViewOnClickListenerC42029Ijy(11, c47732L5t, c5qT, c38321qM);
                    childAt.setTransitionName(c38321qM.getId());
                    IgImageButton igImageButton = (IgImageButton) childAt;
                    if (AbstractC37301Gc2.A1Y(userSession, c38321qM)) {
                        IZ9.A00(viewOnClickListenerC42029Ijy, interfaceC11380iw, c38321qM, igImageButton, i, i2, false, false);
                    } else {
                        C14360o3.A0B(userSession, 0);
                        C14360o3.A0B(igImageButton, 1);
                        C14360o3.A0B(interfaceC11380iw, 11);
                        AbstractC153386v7.A03(lpv, viewOnTouchListenerC42056IkP, interfaceC11380iw, userSession, c38321qM, igImageButton, 1.0f, i, i2, true, false);
                    }
                    i2++;
                }
            }
            AbstractC153386v7.A04((IgImageButton) childAt);
            i2++;
        } while (i2 < 3);
    }
}
