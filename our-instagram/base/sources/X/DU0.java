package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes5.dex */
public final class DU0 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C9BD A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C80143i3 A02;
    public final /* synthetic */ C107384sj A03;
    public final /* synthetic */ C65502xm A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU0(C9BD c9bd, C38321qM c38321qM, C80143i3 c80143i3, C107384sj c107384sj, C65502xm c65502xm, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        super(2);
        this.A03 = c107384sj;
        this.A02 = c80143i3;
        this.A06 = z;
        this.A05 = interfaceC16820sZ;
        this.A04 = c65502xm;
        this.A01 = c38321qM;
        this.A00 = c9bd;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float f;
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj2;
        C14360o3.A0B(simpleZoomableViewContainer, 1);
        C107384sj c107384sj = this.A03;
        C79743hP A04 = C107384sj.A04(simpleZoomableViewContainer, c107384sj);
        MediaFrameLayout A01 = A04.A01();
        IgProgressImageView A00 = A04.A00();
        if (c107384sj.A0C) {
            f = c107384sj.A05.A00;
        } else {
            AbstractC13880nE.A0W(A01, -1);
            f = -1.0f;
        }
        A01.A00 = f;
        InterfaceC60442pS interfaceC60442pS = c107384sj.A04;
        C79723hN c79723hN = c107384sj.A05;
        AbstractC80203i9.A0A(interfaceC60442pS, this.A02, c79723hN, c107384sj.A06, A00, this.A05, this.A06);
        C65502xm c65502xm = this.A04;
        AbstractC80203i9.A02(this.A00, this.A01, interfaceC60442pS, A04, c79723hN.A0E, c65502xm, c79723hN.A0G);
        if (c107384sj.A0B) {
            A00.setVisibility(0);
        }
        if (Systrace.A0E(1L)) {
            C0fO.A01("setMediaGestureDetector", 795699839);
        }
        try {
            A04.A01().setOnTouchListener(new Y8L(3, (InterfaceC81103jf) c79723hN.A0A.A0J.invoke(A04), c107384sj));
            if (Systrace.A0E(1L)) {
                C0fO.A00(335461377);
            }
            return new C79773hS(new ME1(14, A00, A01));
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1220285676);
            }
            throw th;
        }
    }
}
