package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.81Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81Y {
    public final C81Z A00;

    public final void A04(C26086BgF c26086BgF, List list, int i, boolean z, boolean z2) {
        C81Z c81z = this.A00;
        C188798Xv c188798Xv = c81z.A1M;
        if (c188798Xv.A01) {
            C187198Rm c187198Rm = c81z.A0a;
            c187198Rm.A02 = c26086BgF;
            c187198Rm.A07 = z;
            c81z.A1Z.A00().CMS();
            c188798Xv.A00().A08();
            C8YY A00 = c188798Xv.A00();
            C193838i4 c193838i4 = c188798Xv.A00().A02;
            c193838i4.getClass();
            A00.A0J(c193838i4, list, i, false, z, z2);
        }
    }

    public final void A00() {
        C81Z c81z = this.A00;
        c81z.A0u.A0M = null;
        c81z.A1Y.A07.A00();
    }

    public final void A01() {
        this.A00.A0w.onResume();
    }

    public final void A02(Context context) {
        C188708Xk c188708Xk = (C188708Xk) this.A00.A15;
        if (context != null) {
            C188708Xk.A00(new RectF(0.0f, AbstractC13880nE.A09(context), AbstractC13880nE.A0A(context), r4 * 2), c188708Xk.A0B, c188708Xk, "button", true, true);
        }
    }

    public final void A03(C4PX c4px) {
        float f;
        C22M c22m;
        EnumC174597pt enumC174597pt;
        boolean z;
        View view;
        C81Z c81z = this.A00;
        if (c81z.A0u.A18 == null) {
            C82K c82k = c81z.A0H.A00;
            if (((C8ZD) c82k.A00()).A07()) {
                UserSession userSession = c81z.A0Q;
                C14360o3.A0B(userSession, 0);
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C1AD.A06(c06090Tz, 18301152001002900L) || C18U.A06(c06090Tz, userSession, 36315713719242234L)) {
                    ((C8ZD) c82k.A00()).A03();
                }
            }
            c81z.A18.A00().DHi(c4px);
            C8HI c8hi = c81z.A0k;
            c8hi.A0R(c4px);
            C8JU c8ju = c81z.A1i;
            if (c8ju != null) {
                c8ju.DHi(c4px);
            }
            C8A3 A01 = C4PY.A01(c4px);
            c81z.A1L.A04.Egh(A01);
            C184628Hd c184628Hd = c8hi.A16;
            c184628Hd.A01 = A01;
            Guideline guideline = c184628Hd.A00;
            if (guideline != null) {
                float f2 = 1.0f;
                if (A01 == C8A3.A04) {
                    f2 = 0.5f;
                }
                guideline.setGuidelinePercent(f2);
            }
            Integer A012 = AbstractC94954Pb.A01(c81z.A09);
            C4PZ A00 = C4PY.A00(c4px);
            C8A3 c8a3 = C8A3.A04;
            if (A01 == c8a3 && (view = c81z.A0J.mView) != null) {
                f = AbstractC94954Pb.A00(view, c4px);
            } else {
                f = 0.55f;
            }
            c81z.A00 = f;
            UserSession userSession2 = c81z.A0Q;
            C22C A013 = AnonymousClass229.A01(userSession2);
            C8A3 c8a32 = C8A3.A03;
            if (A01 == c8a32) {
                c22m = ((C22F) A013).A04;
                enumC174597pt = EnumC174597pt.FLAT;
            } else if (A01 == c8a3) {
                c22m = ((C22F) A013).A04;
                enumC174597pt = EnumC174597pt.TABLETOP;
            } else {
                C8A3 c8a33 = C8A3.A02;
                c22m = ((C22F) A013).A04;
                if (A01 == c8a33) {
                    enumC174597pt = EnumC174597pt.BOOK;
                } else {
                    enumC174597pt = null;
                }
            }
            c22m.A06 = enumC174597pt;
            if (A01 == c8a32 || A01 == c8a3 ? !(A012 != C05F.A0C || A00 == null || A00.BZe() != C23099AGl.A01) : !(A01 != null || A012 != C05F.A0C)) {
                z = true;
            } else {
                z = false;
            }
            C8GH A002 = c81z.A0p.A00();
            C14360o3.A0B(A012, 1);
            C8GJ c8gj = A002.A00;
            if (c8gj != null) {
                c8gj.A07(c4px, A01, A012);
            }
            if (z) {
                TargetViewSizeProvider targetViewSizeProvider = c81z.A03;
                if (targetViewSizeProvider == null) {
                    Context requireContext = c81z.A0J.requireContext();
                    C14360o3.A0B(userSession2, 2);
                    targetViewSizeProvider = new NineSixteenLayoutConfigImpl(requireContext, C18U.A06(C06090Tz.A05, userSession2, 36324960783839852L));
                    c81z.A03 = targetViewSizeProvider;
                }
                C1812982h.A01(c81z.A0T, c81z.A1X.A00, targetViewSizeProvider, c81z.A1W);
                C172227lr c172227lr = (C172227lr) c81z.A2E.getValue();
                TargetViewSizeProvider targetViewSizeProvider2 = c81z.A03;
                C14360o3.A0B(targetViewSizeProvider2, 0);
                c172227lr.A00 = targetViewSizeProvider2;
            }
        }
    }

    public final void A05(String str, boolean z) {
        this.A00.A15.DEv(null, str, z);
    }

    public final boolean A06() {
        C81Z c81z = this.A00;
        C1821786b c1821786b = c81z.A0m;
        if (c1821786b.A09) {
            c1821786b.A0C();
            return true;
        }
        return c81z.A0l.onBackPressed();
    }

    public C81Y(C81J c81j) {
        UserSession userSession = c81j.A0S;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36324935014363745L)) {
            C55782hJ A00 = C55772hI.A00(c81j.A0S);
            c81j.A0M.getClass();
            A00.DIC(c81j.A0M, true);
        }
        AbstractC13090lv.A02("igcam_qcc_constr");
        try {
            C207549Gh c207549Gh = c81j.A0n;
            if (c207549Gh != null) {
                C208279Jm c208279Jm = c207549Gh.A04;
                if (c208279Jm == null) {
                    C14360o3.A0F("navigationPerfLogger");
                    throw C00O.createAndThrow();
                }
                c208279Jm.A0E("partially_visible_begin");
            }
            C81Z c81z = new C81Z(c81j);
            AbstractC13090lv.A01();
            this.A00 = c81z;
        } catch (Throwable th) {
            AbstractC13090lv.A01();
            throw th;
        }
    }
}
