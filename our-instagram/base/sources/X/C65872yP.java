package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65872yP extends AbstractC65632xz {
    public C3A0 A00;
    public C693439u A01;
    public final FragmentActivity A02;
    public final C07X A03;
    public final UserSession A04;
    public final C63762ux A05;
    public final InterfaceC09390do A06;
    public final boolean A07;
    public final boolean A08;
    public final InterfaceC11380iw A09;
    public final boolean A0A;

    public C65872yP(FragmentActivity fragmentActivity, C07X c07x, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C63762ux c63762ux, boolean z) {
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(c63762ux, 3);
        C14360o3.A0B(c07x, 4);
        this.A02 = fragmentActivity;
        this.A04 = userSession;
        this.A05 = c63762ux;
        this.A03 = c07x;
        this.A09 = interfaceC11380iw;
        this.A0A = z;
        this.A08 = AbstractC65492xl.A00(userSession).A0U;
        this.A07 = C18U.A06(C06090Tz.A05, userSession, 36326266454357796L);
        this.A06 = AbstractC09440dt.A00(EnumC09460dv.A02, new C207019Eg(this, 29));
    }

    public final void A00(AnonymousClass386 anonymousClass386, InterfaceC692739n interfaceC692739n) {
        C14360o3.A0B(anonymousClass386, 0);
        C14360o3.A0B(interfaceC692739n, 1);
        this.A01 = new C693439u(interfaceC692739n, true);
        this.A00 = new C3A0(this.A02, this.A09, this.A04, anonymousClass386, this.A0A);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "TifuNetego";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        String str = ((C4dV) obj).A03.A09;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        String str = ((C4dV) obj).A03.A09;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C4dV c4dV = (C4dV) obj;
        C119835bh c119835bh = (C119835bh) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c4dV, 1);
        C14360o3.A0B(c119835bh, 2);
        if (c119835bh.Ceb()) {
            anonymousClass306.A7a(1);
        } else if (this.A08) {
            anonymousClass306.A7a(2);
        } else {
            anonymousClass306.A7a(0);
        }
        this.A05.A9W(c4dV, c119835bh);
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        IllegalStateException illegalStateException;
        int i2;
        int A03 = C0f9.A03(354450609);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        C4dV c4dV = (C4dV) obj;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC65902yS abstractC65902yS = (AbstractC65902yS) this.A06.getValue();
                    if (abstractC65902yS != null) {
                        LithoView lithoView = (LithoView) view;
                        String str = c4dV.A03.A09;
                        if (str == null) {
                            str = "";
                        }
                        abstractC65902yS.A05(lithoView, str, B7S.A00, new J7S(c4dV, 34), B7T.A00);
                    }
                } else {
                    illegalStateException = new IllegalStateException(AnonymousClass001.A0O(MSV.A00(78), i));
                    i2 = 965278981;
                    C0f9.A0A(i2, A03);
                    throw illegalStateException;
                }
            } else {
                C693439u c693439u = this.A01;
                if (c693439u != null) {
                    c693439u.A01(view, this.A04, c4dV, obj2);
                }
            }
            this.A05.EDV(view, c4dV);
            C0f9.A0A(-709786581, A03);
        }
        C3A0 c3a0 = this.A00;
        if (c3a0 != null) {
            c3a0.A02(view, c4dV.A06, new C9BW(c4dV, (C119835bh) obj2), new C207019Eg(c4dV, 28));
            this.A05.EDV(view, c4dV);
            C0f9.A0A(-709786581, A03);
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i2 = -550443643;
            C0f9.A0A(i2, A03);
            throw illegalStateException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, X.57i, X.57h] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        IllegalStateException th;
        int i2;
        boolean A0E;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        int A03 = C0f9.A03(12352804);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC65902yS abstractC65902yS = (AbstractC65902yS) this.A06.getValue();
                    if (abstractC65902yS != null) {
                        viewGroup3 = abstractC65902yS.A03();
                    } else {
                        th = new IllegalStateException("Litho binder is null");
                        i2 = 156804146;
                    }
                } else {
                    th = new IllegalStateException(AnonymousClass001.A0O(MSV.A00(78), i));
                    i2 = -1671763874;
                }
                C0f9.A0A(i2, A03);
                throw th;
            }
            viewGroup3 = C693539v.A00(this.A02, viewGroup, "v1", 2);
            C0f9.A0A(1090380564, A03);
            return viewGroup3;
        }
        C3A0 c3a0 = this.A00;
        if (c3a0 != null) {
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 1);
            if (Systrace.A0E(1L)) {
                C0fO.A01("TifuNetegoComposeBinder.newView", 472590740);
            }
            try {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36326266454095648L)) {
                    LayoutInflater from = LayoutInflater.from(c3a0.A00);
                    C14360o3.A07(from);
                    viewGroup2 = C50802Vb.A01(from, viewGroup, R.layout.tifu_unit);
                } else if (C18U.A06(c06090Tz, userSession, 36326266455537455L)) {
                    FragmentActivity fragmentActivity = c3a0.A00;
                    ?? c57h = new C57h(fragmentActivity);
                    boolean isAttachedToWindow = c57h.isAttachedToWindow();
                    viewGroup2 = c57h;
                    if (!isAttachedToWindow) {
                        View childAt = ((ViewGroup) fragmentActivity.findViewById(android.R.id.content)).getChildAt(0);
                        C14360o3.A0A(childAt);
                        C57I A00 = AnonymousClass571.A00(childAt);
                        if (A00 == null) {
                            A00 = AnonymousClass571.A02(childAt);
                        }
                        c57h.setParentCompositionContext(A00);
                        c57h.A07(AbstractC1127657i.A01(c57h));
                        viewGroup2 = c57h;
                    }
                } else {
                    viewGroup2 = new ComposeView(c3a0.A00, null, 0);
                }
                viewGroup2.setTag(new C123385iD(viewGroup2));
                viewGroup3 = viewGroup2;
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1017870819);
                    viewGroup3 = viewGroup2;
                }
                C0f9.A0A(1090380564, A03);
                return viewGroup3;
            } finally {
                th = th;
                if (A0E) {
                }
            }
        } else {
            th = new IllegalStateException("Required value was null.");
            i2 = 2113266376;
            C0f9.A0A(i2, A03);
            throw th;
        }
    }
}
