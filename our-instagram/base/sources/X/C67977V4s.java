package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.V4s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67977V4s extends AbstractC60592pi implements C36Z {
    public C68983VfL A00;
    public C68983VfL A01;
    public boolean A02;
    public final C25671My A03;
    public final InterfaceC60682pr A04;
    public final InterfaceC65292xR A05;

    public C67977V4s(UserSession userSession, InterfaceC65292xR interfaceC65292xR, InterfaceC60682pr interfaceC60682pr) {
        C14360o3.A0B(userSession, 1);
        this.A03 = AbstractC25651Mw.A00(userSession);
        this.A04 = interfaceC60682pr;
        this.A05 = interfaceC65292xR;
        this.A02 = true;
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtI(Object obj, int i) {
        C14360o3.A0B(obj, 0);
        A00(this.A03, null, C05F.A00);
        this.A00 = new C68983VfL(this, System.currentTimeMillis());
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtJ(Object obj, int i) {
        C14360o3.A0B(obj, 0);
        this.A01 = new C68983VfL(this, System.currentTimeMillis());
    }

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        View view;
        C14360o3.A0B(c3ab, 0);
        InterfaceC65292xR interfaceC65292xR = this.A05;
        Object item = interfaceC65292xR.getItem(i);
        C14360o3.A0C(item, AbstractC111324zv.A00(2783));
        C47K c47k = (C47K) item;
        C114385Ef C3v = interfaceC65292xR.C3v(c47k);
        c3ab.FDo(c47k.getId(), c47k, C3v.getPosition());
        View AnW = this.A04.getScrollingViewProxy().AnW(i);
        if (AnW != null) {
            Object tag = AnW.getTag();
            if (tag instanceof C92824Dy) {
                view = ((C92824Dy) tag).A0A;
            } else if (tag instanceof C69115Vi5) {
                view = ((C69115Vi5) tag).A02;
            } else if (!(tag instanceof C47713L4u)) {
                return;
            } else {
                view = ((C47713L4u) tag).A07;
            }
            if (view != null) {
                if (VTJ.A00(view, 0.75d)) {
                    c3ab.FDn(c47k.getId(), c47k, C3v.getPosition());
                }
                if (this.A02 && VTJ.A00(view, 1.0d)) {
                    A00(this.A03, null, C05F.A15);
                    this.A02 = false;
                }
            }
        }
    }

    public static void A00(C25671My c25671My, C47K c47k, Integer num) {
        c25671My.E4s(new C70712Wfb(c47k, num));
    }

    @Override // X.C36Z
    public final Class CAO() {
        return C47K.class;
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtG(Object obj) {
        A00(this.A03, null, C05F.A01);
        this.A00 = null;
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtH(Object obj) {
        C47K c47k = (C47K) obj;
        C14360o3.A0B(c47k, 0);
        if (this.A01 != null) {
            System.currentTimeMillis();
            this.A01 = null;
        }
        C3FQ scrollingViewProxy = this.A04.getScrollingViewProxy();
        if (scrollingViewProxy != null && scrollingViewProxy.CV1()) {
            A00(this.A03, c47k, C05F.A1F);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        A00(this.A03, null, C05F.A0Y);
        this.A00 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        A00(this.A03, null, C05F.A0j);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        A00(this.A03, null, C05F.A0C);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        A00(this.A03, null, C05F.A0N);
        C68983VfL c68983VfL = this.A00;
        if (c68983VfL != null) {
            c68983VfL.A00 = System.currentTimeMillis();
        }
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtL(View view, Object obj, double d) {
    }
}
