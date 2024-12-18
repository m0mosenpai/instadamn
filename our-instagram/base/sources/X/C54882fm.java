package X;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.fragment.app.FragmentActivity;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Map;

/* renamed from: X.2fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54882fm {
    public static C4NJ A04;
    public static C4NJ A05;
    public static C55342gZ A06;
    public static WeakReference A07;
    public static java.util.Set A08;
    public final Context A00;
    public final UserSession A01;
    public final C14090nZ A02;
    public final C54892fn A03;

    public C54882fm(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = new C54892fn(userSession);
        this.A02 = C12L.A00.AOT(2020389652, 1);
    }

    public static final void A01(C54882fm c54882fm) {
        A08 = null;
        A05 = null;
        A04 = null;
        A07 = null;
        C54892fn c54892fn = c54882fm.A03;
        C54902fo c54902fo = c54892fn.A02;
        String A00 = c54902fo.A00("no_more_promotions", false, false);
        QuickPerformanceLogger quickPerformanceLogger = c54892fn.A01;
        quickPerformanceLogger.markerPoint(716775037, A00);
        if (c54892fn.A00) {
            quickPerformanceLogger.markerPoint(716775037, "QpLoginInterstitialQpl_clear_points_counter");
            synchronized (c54902fo) {
                c54902fo.A00.clear();
            }
            quickPerformanceLogger.markerEnd(716775037, (short) 2);
            c54892fn.A00 = false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.2gZ, X.2gb, X.2ga] */
    public final void A04(final FragmentActivity fragmentActivity, java.util.Set set) {
        C14360o3.A0B(fragmentActivity, 1);
        AbstractC54912fq.A00();
        ?? obj = new Object();
        obj.A03 = new InterfaceC54942ft() { // from class: X.2fs
            @Override // X.InterfaceC54942ft
            public final void DQO(C4NL c4nl) {
                C14360o3.A0B(c4nl, 0);
                C54882fm c54882fm = this;
                C4NJ c4nj = (C4NJ) c4nl;
                FragmentActivity fragmentActivity2 = fragmentActivity;
                if (c4nj != null) {
                    C54892fn c54892fn = c54882fm.A03;
                    String str = c4nj.A0D;
                    C54902fo c54902fo = c54892fn.A02;
                    String A00 = c54902fo.A00(AnonymousClass001.A0R("qp_", str), true, false);
                    QuickPerformanceLogger quickPerformanceLogger = c54892fn.A01;
                    quickPerformanceLogger.markerPoint(716775037, A00);
                    C34938FaO c34938FaO = new C34938FaO(null, c54882fm.A01);
                    C55342gZ c55342gZ = C54882fm.A06;
                    UserSession userSession = c34938FaO.A01;
                    C006802i.A0p.markerEnd(716779062, (short) 2);
                    AbstractC192798gL A02 = C192108fB.A02(null, userSession, "com.bloks.www.qp.async.bloks_action", C34938FaO.A00(c34938FaO, c4nj.A0D, c4nj.A06.A00));
                    A02.A00(new EOp(fragmentActivity2, c4nj, c55342gZ, c34938FaO));
                    C1GJ.A06(A02, 2020389652, 1, true, true);
                    C54882fm.A04 = c4nj;
                    quickPerformanceLogger.markerPoint(716775037, c54902fo.A00(AnonymousClass001.A0R("qp_", c4nj.A0D), false, true));
                }
            }
        };
        obj.A0B = false;
        obj.A08 = C54952fu.A00;
        obj.A07 = new InterfaceC54982fx() { // from class: X.2fw
            @Override // X.InterfaceC54982fx
            public final void DVu() {
                C54882fm.A01(C54882fm.this);
            }
        };
        C54992fy A00 = obj.A00();
        AbstractC54912fq.A00();
        Context context = this.A00;
        C19270xB c19270xB = new C19270xB("QPPrefetchLoginInterstitial");
        UserSession userSession = this.A01;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0l;
        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.2gJ
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return AnonymousClass194.A02(C54882fm.this.A02);
            }
        };
        C55192gK c55192gK = new C55192gK();
        SparseIntArray sparseIntArray = C55312gW.A02;
        ?? abstractC55352ga = new AbstractC55352ga(context, c19270xB, userSession, A00, new C55312gW(C1QS.A00(userSession)), quickPromotionSlot, c55192gK, AbstractC09440dt.A01(new C55332gY(interfaceC08830cm)));
        abstractC55352ga.FAZ();
        A06 = abstractC55352ga;
        abstractC55352ga.AVs(null, set);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.2gZ, X.2ga] */
    public static final void A00(AbstractC59962oe abstractC59962oe, final C54882fm c54882fm, final java.util.Set set) {
        final AbstractC59962oe abstractC59962oe2;
        final WeakReference weakReference;
        UserSession userSession = c54882fm.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36325944331613722L)) {
            abstractC59962oe2 = null;
            weakReference = new WeakReference(abstractC59962oe);
        } else {
            abstractC59962oe2 = abstractC59962oe;
            weakReference = null;
        }
        AbstractC54912fq.A00();
        ?? obj = new Object();
        obj.A03 = new InterfaceC54942ft() { // from class: X.2qQ
            @Override // X.InterfaceC54942ft
            public final void DQO(C4NL c4nl) {
                C14360o3.A0B(c4nl, 0);
                C54882fm c54882fm2 = c54882fm;
                C4NJ c4nj = (C4NJ) c4nl;
                java.util.Set set2 = set;
                AbstractC59962oe abstractC59962oe3 = abstractC59962oe2;
                WeakReference weakReference2 = weakReference;
                if ((abstractC59962oe3 == null && (weakReference2 == null || (abstractC59962oe3 = (AbstractC59962oe) weakReference2.get()) == null)) || c4nj == null) {
                    return;
                }
                C54892fn c54892fn = c54882fm2.A03;
                String str = c4nj.A0D;
                C54902fo c54902fo = c54892fn.A02;
                String A00 = c54902fo.A00(AnonymousClass001.A0R("qp_", str), true, false);
                QuickPerformanceLogger quickPerformanceLogger = c54892fn.A01;
                quickPerformanceLogger.markerPoint(716775037, A00);
                C54882fm.A08 = set2;
                C54882fm.A07 = new WeakReference(abstractC59962oe3);
                if (C14360o3.A0K(c4nj.A09.A00, "notification_permission_prompt")) {
                    Object A002 = AbstractC54852fj.A00();
                    C14360o3.A0C(A002, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    FragmentActivity fragmentActivity = (FragmentActivity) A002;
                    C55342gZ c55342gZ = C54882fm.A06;
                    if (c55342gZ != null) {
                        c55342gZ.Dcq(c4nj);
                    }
                    FAM.A00(c54882fm2.A00, fragmentActivity, abstractC59962oe3, c54882fm2.A01);
                } else {
                    C34938FaO c34938FaO = new C34938FaO(abstractC59962oe3, c54882fm2.A01);
                    C55342gZ c55342gZ2 = C54882fm.A06;
                    Map A003 = C34938FaO.A00(c34938FaO, c4nj.A0D, c4nj.A06.A00);
                    AbstractC59962oe abstractC59962oe4 = c34938FaO.A00;
                    if (abstractC59962oe4 != null) {
                        UserSession userSession2 = c34938FaO.A01;
                        C62862tP A03 = C62862tP.A03(abstractC59962oe4, userSession2, null);
                        AbstractC192798gL A02 = C192108fB.A02(null, userSession2, "com.bloks.www.qp.async.bloks_action", A003);
                        A02.A00(new C32387EOn(A03, c4nj, c55342gZ2));
                        C1GJ.A06(A02, 2020389652, 1, true, true);
                    }
                }
                C54882fm.A05 = c4nj;
                quickPerformanceLogger.markerPoint(716775037, c54902fo.A00(AnonymousClass001.A0R("qp_", c4nj.A0D), false, true));
            }
        };
        obj.A0B = false;
        obj.A08 = C61032qR.A00;
        obj.A07 = new InterfaceC54982fx() { // from class: X.2qS
            @Override // X.InterfaceC54982fx
            public final void DVu() {
                C54882fm.A01(C54882fm.this);
            }
        };
        C54992fy A00 = obj.A00();
        AbstractC54912fq.A00();
        Context context = c54882fm.A00;
        C19270xB c19270xB = new C19270xB("QPLoginInterstitial");
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0f;
        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.2qU
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return AnonymousClass194.A02(C54882fm.this.A02);
            }
        };
        C55192gK c55192gK = new C55192gK();
        SparseIntArray sparseIntArray = C55312gW.A02;
        A06 = new AbstractC55352ga(context, c19270xB, userSession, A00, new C55312gW(C1QS.A00(userSession)), quickPromotionSlot, c55192gK, AbstractC09440dt.A01(new C55332gY(interfaceC08830cm)));
        if (C18U.A06(c06090Tz, userSession, 36325695223444757L)) {
            C57312k6 A002 = AbstractC57302k5.A00(abstractC59962oe.getLifecycle());
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9D4(set, c54882fm, (InterfaceC23621Ds) null, 20), A002);
            return;
        }
        C55342gZ c55342gZ = A06;
        if (c55342gZ != null) {
            c55342gZ.FAZ();
        }
        C55342gZ c55342gZ2 = A06;
        if (c55342gZ2 == null) {
            return;
        }
        c55342gZ2.AVs(null, set);
    }

    public final void A02() {
        WeakReference weakReference;
        AbstractC59962oe abstractC59962oe;
        java.util.Set set = A08;
        if (set != null && (weakReference = A07) != null && (abstractC59962oe = (AbstractC59962oe) weakReference.get()) != null) {
            A00(abstractC59962oe, this, set);
        }
    }

    public final void A03() {
        EnumSet of = EnumSet.of(Trigger.A0g);
        C14360o3.A07(of);
        Object A00 = AbstractC54852fj.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        A04((FragmentActivity) A00, of);
    }
}
