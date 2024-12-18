package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.38E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38E {
    public int A00;
    public C53S A01;
    public InterfaceC11380iw A02;
    public ReelViewerConfig A03;
    public AbstractC149546o6 A04;
    public AbstractC140596Xn A05;
    public InterfaceC58058Poj A06;
    public C140626Xq A07;
    public SearchContext A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final InterfaceC11380iw A0J;
    public final UserSession A0K;
    public final C38D A0L;
    public final AbsListView.OnScrollListener A0M;
    public final C1I4 A0N;

    public static Integer A00(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C41181vS c41181vS = (C41181vS) list.get(i);
            if (c41181vS.CY4() && c41181vS.A0b != null) {
                String id = c41181vS.A0b.getId();
                id.getClass();
                if (id.startsWith(str)) {
                    return Integer.valueOf(i);
                }
            }
        }
        return null;
    }

    public final void A04(Reel reel, C3G2 c3g2, C3Ow c3Ow) {
        A06(reel, c3g2, c3Ow, Collections.singletonList(reel), Collections.singletonList(reel), Collections.singletonList(reel));
    }

    public final void A06(Reel reel, C3G2 c3g2, C3Ow c3Ow, List list, List list2, List list3) {
        A05(reel, c3g2, c3Ow, null, list, list2, list3);
    }

    public final void A09(Reel reel, C3G2 c3g2, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        A0A(reel, c3g2, gradientSpinnerAvatarView, null, Collections.singletonList(reel), Collections.singletonList(reel));
    }

    public final void A0A(Reel reel, C3G2 c3g2, GradientSpinnerAvatarView gradientSpinnerAvatarView, List list, List list2, List list3) {
        C140626Xq c140626Xq = this.A07;
        if (c140626Xq == null || !c140626Xq.A07) {
            Context context = this.A0L.getContext();
            context.getClass();
            UserSession userSession = this.A0K;
            C140626Xq A03 = C1OU.A03(context, userSession, reel, new P8T(new P8P(reel, c3g2, this, gradientSpinnerAvatarView, list, list2, list3), gradientSpinnerAvatarView), AbstractC82003lM.A00(userSession), this.A0J.getModuleName(), -1);
            A03.A04();
            this.A07 = A03;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.6ab] */
    public static void A01(Reel reel, C3G2 c3g2, C38E c38e, C50557MTo c50557MTo, String str, List list, List list2, List list3, long j, boolean z) {
        RectF rectF;
        C38D c38d = c38e.A0L;
        if (c38d.getContext() != null && (c38d.getContext() instanceof Activity) && c38d.isResumed()) {
            AbstractC13880nE.A0O(c38d.getRootView());
            InterfaceC58058Poj interfaceC58058Poj = c38e.A06;
            if (interfaceC58058Poj != null) {
                interfaceC58058Poj.Ddx();
            }
            Fragment B8M = c38d.B8M();
            if (B8M instanceof AbstractC60672pq) {
                ((AbstractC60672pq) B8M).mShouldRestoreDefaultTheme = true;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Reel) it.next()).getId());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Reel) it2.next()).getId());
            }
            boolean z2 = c38e.A0G;
            c38e.A0G = false;
            boolean z3 = c38e.A0I;
            c38e.A0I = false;
            boolean z4 = c38e.A0H;
            c38e.A0H = false;
            Integer num = null;
            if (c38e.A0A != null) {
                Integer A00 = A00(c38e.A0A, reel.A0O(c38e.A0K));
                c38e.A0A = null;
                num = A00;
            }
            c38e.A00 = -1;
            if (c38e.A04 == null) {
                UserSession userSession = c38e.A0K;
                C1OU c1ou = C1OU.$redex_init_class;
                C14360o3.A0B(userSession, 0);
                c38e.A04 = new C143536ds(userSession);
            }
            C1OU c1ou2 = C1OU.$redex_init_class;
            ?? obj = new Object();
            String id = reel.getId();
            UserSession userSession2 = c38e.A0K;
            obj.A02(userSession2, id, list2);
            obj.A09(arrayList2);
            obj.A0A(arrayList);
            obj.A03(c3g2);
            obj.A00 = list2.indexOf(reel);
            obj.A01 = j;
            obj.A0d = z;
            obj.A0Z = z2;
            obj.A0b = z3;
            obj.A0a = z4;
            obj.A0X = c38e.A0F;
            obj.A06(c38e.A04.A02);
            obj.A03 = c38e.A03;
            obj.A0K = c38e.A0B;
            obj.A06 = c38e.A08;
            if (str != null) {
                obj.A0G = str;
            }
            if (num != null) {
                obj.A04(num);
            }
            String str2 = c38e.A0C;
            if (str2 != null) {
                obj.A0N = str2;
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView = c50557MTo.A02;
            if (gradientSpinnerAvatarView != null) {
                rectF = gradientSpinnerAvatarView.getAvatarBounds();
            } else {
                C3Ow c3Ow = c50557MTo.A01;
                if (c3Ow == null || (rectF = c3Ow.Ahl()) == null) {
                    if (c50557MTo.A00 != null) {
                        rectF = new RectF(AbstractC13880nE.A0A(r10) / 2, AbstractC13880nE.A09(r10) / 2, AbstractC13880nE.A0A(r10) / 2, AbstractC13880nE.A09(r10) / 2);
                    } else {
                        rectF = new RectF();
                    }
                }
            }
            RectF rectF2 = new RectF(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = c50557MTo.A02;
            if (gradientSpinnerAvatarView2 != null) {
                gradientSpinnerAvatarView2.A0K.setVisibility(4);
                if (gradientSpinnerAvatarView2.A04 == 2) {
                    CircularImageView circularImageView = gradientSpinnerAvatarView2.A0L;
                    if (circularImageView != null) {
                        circularImageView.setVisibility(4);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                C3Ow c3Ow2 = c50557MTo.A01;
                if (c3Ow2 != null) {
                    c3Ow2.CMM();
                }
            }
            Activity activity = c38d.getActivity();
            activity.getClass();
            C14360o3.A0B(userSession2, 2);
            Map map = C3M4.A13;
            while (activity.getParent() != null) {
                activity = activity.getParent();
            }
            View findViewById = activity.findViewById(R.id.content);
            findViewById.getClass();
            C3M4 A06 = C3M4.A06(activity, (ViewGroup) findViewById, userSession2);
            A06.A0U = c38e.A0F;
            ReelViewerConfig reelViewerConfig = c38e.A03;
            if (reelViewerConfig != null) {
                A06.A0F = reelViewerConfig;
            }
            if (!AbstractC145026gN.A00(userSession2, c3g2) && !reel.A0g()) {
                int i = c38e.A00;
                String str3 = c38e.A0A;
                C3Ow c3Ow3 = c50557MTo.A01;
                if ((c3Ow3 == null || !c3Ow3.Ejh()) && c50557MTo.A02 == null) {
                    rectF = null;
                }
                C50566MTx c50566MTx = new C50566MTx(reel, c3g2, c38e, A06, c50557MTo, obj);
                Collections.emptySet();
                A06.A0V(rectF, rectF2, c38e.A0J, reel, c3g2, c50566MTx, str3, list, i, false);
                return;
            }
            A02(c3g2, c38e, A06, c50557MTo, obj);
        }
    }

    public static void A02(C3G2 c3g2, C38E c38e, C3M4 c3m4, C50557MTo c50557MTo, C141586ab c141586ab) {
        Fragment B8M;
        AbstractC140596Xn abstractC140596Xn = c38e.A05;
        if (abstractC140596Xn != null) {
            c141586ab.A07(abstractC140596Xn.A03);
        } else {
            C0w9.A03("ReelViewerLauncher", "Cannot launch with modal animation without a hide animation coordinator");
        }
        c50557MTo.A00(c38e.A0J);
        c141586ab.A05(c3m4.A0x);
        c141586ab.A03(c3g2);
        Bundle A00 = c141586ab.A00();
        C38D c38d = c38e.A0L;
        FragmentActivity activity = c38d.getActivity();
        C6XJ A01 = C6XJ.A01(activity, A00, c38e.A0K);
        int Bo2 = c38d.Bo2();
        if (Bo2 != -1 && (B8M = c38d.B8M()) != null) {
            A01.A0D(B8M, Bo2);
        } else {
            A01.A0C(activity);
        }
    }

    public final void A03() {
        C140626Xq c140626Xq = this.A07;
        if (c140626Xq != null) {
            c140626Xq.A05(C05F.A15);
        }
    }

    public final void A05(Reel reel, C3G2 c3g2, C3Ow c3Ow, String str, List list, List list2, List list3) {
        GradientSpinner gradientSpinner;
        C140626Xq c140626Xq = this.A07;
        if (c140626Xq == null || !c140626Xq.A07) {
            C2ZI.A00.A0D("stories_viewer", "reelViewerLauncher", true);
            if (c3Ow != null) {
                gradientSpinner = c3Ow.Blo();
            } else {
                Context context = this.A0L.getContext();
                context.getClass();
                gradientSpinner = new GradientSpinner(context);
            }
            Context context2 = this.A0L.getContext();
            context2.getClass();
            UserSession userSession = this.A0K;
            C140626Xq A03 = C1OU.A03(context2, userSession, reel, new C6X7(new C50554MTl(reel, c3g2, this, c3Ow, str, list, list2, list3), gradientSpinner, reel.A1P), AbstractC82003lM.A00(userSession), this.A0J.getModuleName(), -1);
            A03.A04();
            this.A07 = A03;
        }
    }

    public final void A07(Reel reel, C3G2 c3g2, InterfaceC58290Psi interfaceC58290Psi, List list, List list2, int i) {
        Fragment B8M;
        C140626Xq c140626Xq = this.A07;
        if (c140626Xq == null || !c140626Xq.A07) {
            if (interfaceC58290Psi == null) {
                C0w9.A03("ReelViewerLauncher", "Tried to launch reel with a null holder");
                return;
            }
            C38D c38d = this.A0L;
            FragmentActivity activity = c38d.getActivity();
            if (activity == null || (B8M = c38d.B8M()) == null || !B8M.isAdded()) {
                return;
            }
            AbstractC13880nE.A0O(c38d.getRootView());
            InterfaceC58058Poj interfaceC58058Poj = this.A06;
            if (interfaceC58058Poj != null) {
                interfaceC58058Poj.Ddx();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Reel) it.next()).getId());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Reel) it2.next()).getId());
            }
            interfaceC58290Psi.CMt();
            C3M4 A06 = C1OU.A06(activity, this.A0K);
            A06.A0U = this.A0F;
            ReelViewerConfig reelViewerConfig = this.A03;
            if (reelViewerConfig != null) {
                A06.A0F = reelViewerConfig;
            }
            A06.A0U(null, interfaceC58290Psi.Ahl(), this.A0J, reel, c3g2, new C56529P8b(activity, reel, c3g2, this, A06, interfaceC58290Psi, arrayList2, arrayList, list, i), i);
        }
    }

    public final void A08(Reel reel, C3G2 c3g2, InterfaceC58290Psi interfaceC58290Psi, List list, List list2, int i) {
        Context context = this.A0L.getContext();
        context.getClass();
        UserSession userSession = this.A0K;
        C140626Xq A03 = C1OU.A03(context, userSession, reel, new P8U(reel, c3g2, this, interfaceC58290Psi, list, list2, i), AbstractC82003lM.A00(userSession), this.A0J.getModuleName(), -1);
        A03.A04();
        this.A07 = A03;
    }

    public C38E(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38D c38d) {
        AbsListView.OnScrollListener onScrollListener = new AbsListView.OnScrollListener() { // from class: X.38F
            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                C140626Xq c140626Xq;
                int A03 = C0f9.A03(-2078461615);
                C38E c38e = C38E.this;
                if (!c38e.A0E && (c140626Xq = c38e.A07) != null) {
                    c140626Xq.A05(C05F.A00);
                }
                C0f9.A0A(1344469803, A03);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public final void onScrollStateChanged(AbsListView absListView, int i) {
                int A03 = C0f9.A03(1423176695);
                C38E c38e = C38E.this;
                boolean z = false;
                if (i == 0) {
                    z = true;
                }
                c38e.A0E = z;
                C0f9.A0A(-876814013, A03);
            }
        };
        this.A0M = onScrollListener;
        C1I4 c1i4 = new C1I4() { // from class: X.38G
            @Override // X.C1I4
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                int A03 = C0f9.A03(761265834);
                C38E c38e = C38E.this;
                boolean z = false;
                if (i == 0) {
                    z = true;
                }
                c38e.A0E = z;
                C0f9.A0A(499128963, A03);
            }

            @Override // X.C1I4
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                C140626Xq c140626Xq;
                int A03 = C0f9.A03(1450396673);
                C38E c38e = C38E.this;
                if (!c38e.A0E && (c140626Xq = c38e.A07) != null) {
                    c140626Xq.A05(C05F.A00);
                }
                C0f9.A0A(-1276494199, A03);
            }
        };
        this.A0N = c1i4;
        this.A0K = userSession;
        this.A0L = c38d;
        this.A0J = interfaceC11380iw;
        this.A0E = true;
        this.A03 = new ReelViewerConfig(new C38H());
        this.A00 = -1;
        C38J Br4 = c38d.Br4();
        if (Br4 != null) {
            Br4.A0c.A01(onScrollListener);
        }
        C38P BlJ = c38d.BlJ();
        if (BlJ != null) {
            C65823Tug c65823Tug = BlJ.A06;
            if (c65823Tug == null) {
                C14360o3.A0F("grid");
                throw C00O.createAndThrow();
            }
            c65823Tug.A09(c1i4);
        }
    }
}
