package X;

import android.content.Context;
import android.widget.SeekBar;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.4sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107384sj extends AbstractC77583di {
    public static final C79933hi A0E = new Object();
    public final SeekBar.OnSeekBarChangeListener A00;
    public final C51722Yv A01;
    public final UserSession A02;
    public final InterfaceC80063hv A03;
    public final InterfaceC60442pS A04;
    public final C79723hN A05;
    public final InterfaceC79883hd A06;
    public final C39D A07;
    public final C30E A08;
    public final InterfaceC76053bA A09;
    public final CharSequence A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final C79743hP A0D;

    public C107384sj(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, C51722Yv c51722Yv, UserSession userSession, InterfaceC80063hv interfaceC80063hv, InterfaceC60442pS interfaceC60442pS, C79723hN c79723hN, InterfaceC79883hd interfaceC79883hd, C79743hP c79743hP, C39D c39d, C30E c30e, InterfaceC76053bA interfaceC76053bA, CharSequence charSequence, boolean z, boolean z2) {
        C14360o3.A0B(c30e, 2);
        C14360o3.A0B(interfaceC79883hd, 4);
        C14360o3.A0B(interfaceC80063hv, 5);
        C14360o3.A0B(c39d, 6);
        C14360o3.A0B(onSeekBarChangeListener, 8);
        C14360o3.A0B(interfaceC60442pS, 9);
        C14360o3.A0B(userSession, 10);
        C14360o3.A0B(charSequence, 11);
        this.A0D = c79743hP;
        this.A08 = c30e;
        this.A05 = c79723hN;
        this.A06 = interfaceC79883hd;
        this.A03 = interfaceC80063hv;
        this.A07 = c39d;
        this.A09 = interfaceC76053bA;
        this.A00 = onSeekBarChangeListener;
        this.A04 = interfaceC60442pS;
        this.A02 = userSession;
        this.A0A = charSequence;
        this.A0B = z;
        this.A0C = z2;
        this.A01 = c51722Yv;
    }

    public static final C107684tD A03(SimpleZoomableViewContainer simpleZoomableViewContainer, C107384sj c107384sj) {
        C107684tD c107684tD;
        if (Systrace.A0E(1L)) {
            C0fO.A01("createOrGetPrimitiveHolder", -1501218562);
        }
        try {
            Object tag = simpleZoomableViewContainer.getTag(R.id.litho_playable_media_primitive);
            if (!(tag instanceof C107684tD) || (c107684tD = (C107684tD) tag) == null) {
                Context context = simpleZoomableViewContainer.getContext();
                if (context != null) {
                    c107684tD = new C107684tD(context, c107384sj.A02, simpleZoomableViewContainer);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            simpleZoomableViewContainer.setTag(R.id.litho_playable_media_primitive, c107684tD);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-832850134);
            }
            return c107684tD;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1430036219);
            }
            throw th;
        }
    }

    public static final C79743hP A04(SimpleZoomableViewContainer simpleZoomableViewContainer, C107384sj c107384sj) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("getBoundedLithoMediaViewHolder", -741347909);
        }
        try {
            C107684tD A03 = A03(simpleZoomableViewContainer, c107384sj);
            C79743hP c79743hP = c107384sj.A0D;
            c79743hP.A00 = simpleZoomableViewContainer.getContext();
            c79743hP.A06 = A03.A05;
            c79743hP.A02(A03.A09);
            c79743hP.A08 = A03.A08;
            c79743hP.A01 = A03.A00;
            c79743hP.A02 = A03.A01;
            c79743hP.A03 = A03.A02;
            c79743hP.A04 = A03.A03;
            c79743hP.A0A.A01 = A03.A07;
            c79743hP.A07 = A03.A06;
            C3Y1 c3y1 = A03.A04;
            C14360o3.A0B(c3y1, 0);
            c79743hP.A05 = c3y1;
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1793899115);
            }
            return c79743hP;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-82358111);
            }
            throw th;
        }
    }
}
