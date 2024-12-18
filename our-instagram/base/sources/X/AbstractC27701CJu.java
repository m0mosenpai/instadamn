package X;

import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.CJu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27701CJu {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C38321qM c38321qM2, C27938CSx c27938CSx, String str, InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC11380iw, 4);
        C28186CbZ c28186CbZ = new C28186CbZ(interfaceC11380iw, (IgImageView) c27938CSx.A03.getValue(), c38321qM, (Integer) null, "post_view", 192, false, true);
        InterfaceC16660sJ interfaceC16660sJ = c27938CSx.A05;
        interfaceC16660sJ.invoke(c28186CbZ);
        interfaceC16660sJ.invoke(new C28186CbZ(interfaceC11380iw, (IgImageView) c27938CSx.A01.getValue(), c38321qM2, (Integer) null, "post_view", 240, false, false));
        ((TextView) c27938CSx.A02.getValue()).setText(str);
        AbstractC166987dD.A0d(c27938CSx.A04).setOnTouchListener(new ViewOnTouchListenerC70251WNw(12, interfaceC16610sE, c38321qM));
        c27938CSx.A00.setVisibility(0);
    }
}
