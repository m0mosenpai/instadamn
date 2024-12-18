package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.4cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99154cc extends AbstractC77583di {
    public static final C79933hi A08 = new Object();
    public final C51722Yv A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C79723hN A03;
    public final InterfaceC79883hd A04;
    public final C39D A05;
    public final CharSequence A06;
    public final C79743hP A07;

    public C99154cc(C51722Yv c51722Yv, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C79723hN c79723hN, InterfaceC79883hd interfaceC79883hd, C79743hP c79743hP, C39D c39d, CharSequence charSequence) {
        C14360o3.A0B(interfaceC79883hd, 3);
        C14360o3.A0B(c39d, 4);
        C14360o3.A0B(interfaceC60442pS, 5);
        C14360o3.A0B(userSession, 6);
        C14360o3.A0B(charSequence, 7);
        this.A07 = c79743hP;
        this.A03 = c79723hN;
        this.A04 = interfaceC79883hd;
        this.A05 = c39d;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A06 = charSequence;
        this.A00 = c51722Yv;
    }

    public static final C99194cg A03(SimpleZoomableViewContainer simpleZoomableViewContainer, C99154cc c99154cc) {
        C99194cg c99194cg;
        if (Systrace.A0E(1L)) {
            C0fO.A01("createOrGetPrimitiveHolder", -660600388);
        }
        try {
            Object tag = simpleZoomableViewContainer.getTag(R.id.litho_image_media_primitive);
            if (!(tag instanceof C99194cg) || (c99194cg = (C99194cg) tag) == null) {
                Context context = simpleZoomableViewContainer.getContext();
                if (context != null) {
                    c99194cg = new C99194cg(context, c99154cc.A01, simpleZoomableViewContainer);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            simpleZoomableViewContainer.setTag(R.id.litho_image_media_primitive, c99194cg);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-38631131);
            }
            return c99194cg;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1804236225);
            }
            throw th;
        }
    }

    public static final C79743hP A04(SimpleZoomableViewContainer simpleZoomableViewContainer, C99154cc c99154cc) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("getBoundedLithoMediaViewHolder", 2025632417);
        }
        try {
            C99194cg A03 = A03(simpleZoomableViewContainer, c99154cc);
            C79743hP c79743hP = c99154cc.A07;
            c79743hP.A00 = simpleZoomableViewContainer.getContext();
            c79743hP.A06 = A03.A01;
            c79743hP.A02(A03.A03);
            c79743hP.A0A.A01 = A03.A02;
            C3Y1 c3y1 = A03.A00;
            C14360o3.A0B(c3y1, 0);
            c79743hP.A05 = c3y1;
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1733307709);
            }
            return c79743hP;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-89929792);
            }
            throw th;
        }
    }
}
