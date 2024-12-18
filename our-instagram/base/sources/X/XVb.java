package X;

import android.content.Context;
import android.widget.SeekBar;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* loaded from: classes12.dex */
public final class XVb extends AbstractC77583di {
    public static final C79933hi A0B = new Object();
    public final SeekBar.OnSeekBarChangeListener A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C79723hN A03;
    public final InterfaceC79883hd A04;
    public final InterfaceC76053bA A05;
    public final CharSequence A06;
    public final boolean A07;
    public final C51722Yv A08;
    public final C79743hP A09;
    public final C39D A0A;

    public XVb(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, C51722Yv c51722Yv, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C79723hN c79723hN, InterfaceC79883hd interfaceC79883hd, C79743hP c79743hP, C39D c39d, InterfaceC76053bA interfaceC76053bA, CharSequence charSequence, boolean z) {
        C14360o3.A0B(interfaceC79883hd, 3);
        AbstractC25229BEm.A1I(c39d, 4, onSeekBarChangeListener);
        AbstractC25233BEq.A0y(7, interfaceC60442pS, userSession, charSequence);
        this.A09 = c79743hP;
        this.A03 = c79723hN;
        this.A04 = interfaceC79883hd;
        this.A0A = c39d;
        this.A05 = interfaceC76053bA;
        this.A00 = onSeekBarChangeListener;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A06 = charSequence;
        this.A07 = z;
        this.A08 = c51722Yv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x008b, code lost:
    
        if (X.AbstractC86643tc.A01(r13, r4) == false) goto L9;
     */
    @Override // X.AbstractC77583di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78053eX A0Y(X.C77993eR r36) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XVb.A0Y(X.3eR):X.3eX");
    }

    public static final C72809XnW A03(SimpleZoomableViewContainer simpleZoomableViewContainer, XVb xVb) {
        C72809XnW c72809XnW;
        if (Systrace.A0E(1L)) {
            C0fO.A01("createOrGetPrimitiveHolder", 844947392);
        }
        try {
            Object tag = simpleZoomableViewContainer.getTag(R.id.litho_playable_media_primitive);
            if (!(tag instanceof C72809XnW) || (c72809XnW = (C72809XnW) tag) == null) {
                Context context = simpleZoomableViewContainer.getContext();
                if (context != null) {
                    c72809XnW = new C72809XnW(context, xVb.A01, simpleZoomableViewContainer);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            simpleZoomableViewContainer.setTag(R.id.litho_playable_media_primitive, c72809XnW);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-3914168);
            }
            return c72809XnW;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(487231744);
            }
            throw th;
        }
    }

    public static final C79743hP A04(SimpleZoomableViewContainer simpleZoomableViewContainer, XVb xVb) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("getBoundedLithoMediaViewHolder", 1848140238);
        }
        try {
            C72809XnW A03 = A03(simpleZoomableViewContainer, xVb);
            C79743hP c79743hP = xVb.A09;
            c79743hP.A00 = simpleZoomableViewContainer.getContext();
            c79743hP.A06 = A03.A03;
            c79743hP.A02(A03.A06);
            c79743hP.A03 = A03.A00;
            c79743hP.A04 = A03.A01;
            c79743hP.A0A.A01 = A03.A05;
            c79743hP.A07 = A03.A04;
            C3Y1 c3y1 = A03.A02;
            C14360o3.A0B(c3y1, 0);
            c79743hP.A05 = c3y1;
            if (Systrace.A0E(1L)) {
                C0fO.A00(-420922876);
            }
            return c79743hP;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1199550309);
            }
            throw th;
        }
    }
}
