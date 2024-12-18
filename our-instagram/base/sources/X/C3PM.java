package X;

import android.graphics.ColorFilter;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.emitter.PulseEmitter;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.3PM, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3PM {
    public static final void A00(C72933Ot c72933Ot) {
        C14360o3.A0B(c72933Ot, 0);
        C3P2 c3p2 = (C3P2) c72933Ot.A03.getValue();
        C14360o3.A0B(c3p2, 0);
        CircularImageView circularImageView = c3p2.A0L;
        circularImageView.A09();
        circularImageView.setVisibility(8);
        circularImageView.setColorFilter((ColorFilter) null);
        circularImageView.setPadding(0, 0, 0, 0);
        circularImageView.setBackgroundColor(circularImageView.getContext().getColor(R.color.fds_transparent));
        PulseEmitter pulseEmitter = c3p2.A0A;
        if (pulseEmitter != null) {
            pulseEmitter.A02();
            pulseEmitter.setVisibility(8);
            PulsingMultiImageView pulsingMultiImageView = c3p2.A0B;
            if (pulsingMultiImageView != null) {
                pulsingMultiImageView.A0I();
                pulsingMultiImageView.setVisibility(8);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view = c3p2.A03;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = c3p2.A02;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        c3p2.A0O.setVisibility(8);
        PulsingMultiImageView pulsingMultiImageView2 = c3p2.A0B;
        if (pulsingMultiImageView2 != null) {
            pulsingMultiImageView2.setVisibility(8);
        }
        c3p2.A0C.setVisibility(8);
        c3p2.A0J.setVisibility(8);
        InterfaceC09390do interfaceC09390do = c72933Ot.A09;
        if (((InterfaceC56392iX) interfaceC09390do.getValue()).CWW()) {
            ((InterfaceC56392iX) interfaceC09390do.getValue()).setVisibility(4);
            ((InterfaceC56392iX) interfaceC09390do.getValue()).getView().setOnTouchListener(null);
        }
        InterfaceC09390do interfaceC09390do2 = c72933Ot.A01;
        if (((InterfaceC56392iX) interfaceC09390do2.getValue()).CWW()) {
            ((InterfaceC56392iX) interfaceC09390do2.getValue()).setVisibility(4);
        }
        InterfaceC09390do interfaceC09390do3 = c72933Ot.A0A;
        if (((InterfaceC56392iX) interfaceC09390do3.getValue()).CWW()) {
            ((InterfaceC56392iX) interfaceC09390do3.getValue()).setVisibility(4);
        }
    }

    public static final void A01(C72933Ot c72933Ot, boolean z) {
        if (!z || ((C3PX) ((C3PV) c72933Ot.A02.getValue()).A01.getValue()).A00 != null) {
            ((View) ((C3PV) c72933Ot.A02.getValue()).A00.getValue()).setVisibility(8);
        }
    }

    public static final void A02(C72933Ot c72933Ot, boolean z) {
        if (!z || ((C3PX) ((C72993Pa) c72933Ot.A04.getValue()).A05.getValue()).A00 != null) {
            ((View) ((C72993Pa) c72933Ot.A04.getValue()).A04.getValue()).setVisibility(8);
        }
    }
}
