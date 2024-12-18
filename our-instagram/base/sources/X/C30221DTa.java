package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.DTa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30221DTa extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float f;
        if (this.A00 != 0) {
            SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj2;
            C14360o3.A0B(simpleZoomableViewContainer, 1);
            XVb xVb = (XVb) this.A04;
            C79743hP A04 = XVb.A04(simpleZoomableViewContainer, xVb);
            MediaFrameLayout A01 = A04.A01();
            IgProgressImageView A00 = A04.A00();
            if (xVb.A07) {
                f = xVb.A03.A00;
            } else {
                AbstractC13880nE.A0W(A01, -1);
                f = -1.0f;
            }
            A01.A00 = f;
            InterfaceC60442pS interfaceC60442pS = xVb.A02;
            C79723hN c79723hN = xVb.A03;
            AbstractC80203i9.A0A(interfaceC60442pS, (C80143i3) this.A01, c79723hN, xVb.A04, A00, (InterfaceC16820sZ) this.A03, this.A05);
            A01.setVideoSource((C38321qM) this.A02, interfaceC60442pS);
            if (Systrace.A0E(1L)) {
                C0fO.A01("setMediaGestureDetector", -966588286);
            }
            try {
                A04.A01().setOnTouchListener(new Y8L(1, (InterfaceC81103jf) c79723hN.A0A.A0J.invoke(A04), xVb));
                if (Systrace.A0E(1L)) {
                    C0fO.A00(77491660);
                }
                return AbstractC25225BEi.A0q(new ME1(8, A00, A01));
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(142945559);
                }
                throw th;
            }
        }
        C3YD c3yd = (C3YD) obj;
        InterfaceC86303t2 interfaceC86303t2 = (InterfaceC86303t2) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, c3yd, interfaceC86303t2);
        if (this.A05) {
            C38321qM c38321qM = (C38321qM) this.A01;
            C75113Zb c75113Zb = (C75113Zb) this.A02;
            InterfaceC60442pS interfaceC60442pS2 = (InterfaceC60442pS) this.A03;
            UserSession userSession = ((CUD) this.A04).A00;
            C14360o3.A0B(c38321qM, 0);
            AbstractC167007dF.A1F(c75113Zb, A1R ? 1 : 0, interfaceC60442pS2);
            return AbstractC86333t5.A00(userSession, c38321qM, c38321qM, interfaceC60442pS2, c75113Zb, interfaceC86303t2, c3yd, false);
        }
        return ViewOnClickListenerC28663ClB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30221DTa(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(2);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A05 = z;
        this.A03 = obj3;
        this.A02 = obj4;
    }
}
