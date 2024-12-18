package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184658Hg {
    public int A00;
    public int A01;
    public C177447ue A02;
    public C174757qB A03;
    public AnonymousClass835 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final View A0A;
    public final C07X A0B;
    public final AbstractC184688Hj A0C;
    public final C1815383g A0D;
    public final UserSession A0E;
    public final C1810981l A0F;
    public final C184668Hh A0G;
    public final AnonymousClass825 A0H;
    public final ArrayList A0I;
    public final Resources A0J;
    public final C12T A0K;
    public final C19L A0L;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.8Hh] */
    public C184658Hg(Context context, View view, C07X c07x, C1815383g c1815383g, UserSession userSession, C1810981l c1810981l, AnonymousClass835 anonymousClass835, AnonymousClass825 anonymousClass825) {
        C14360o3.A0B(view, 2);
        C14360o3.A0B(c1815383g, 3);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(context, 5);
        C14360o3.A0B(anonymousClass825, 7);
        C14360o3.A0B(c07x, 8);
        this.A04 = anonymousClass835;
        this.A0A = view;
        this.A0D = c1815383g;
        this.A0E = userSession;
        this.A09 = context;
        this.A0F = c1810981l;
        this.A0H = anonymousClass825;
        this.A0B = c07x;
        this.A0G = new Object();
        this.A0I = new ArrayList();
        this.A0K = C12L.A00.A04;
        this.A0J = context.getResources();
        this.A0C = new C184678Hi(this);
        AnonymousClass835 anonymousClass8352 = this.A04;
        this.A04 = anonymousClass8352;
        C184708Hl Csh = anonymousClass8352.Csh();
        Csh.A00 = new C184718Hm(this);
        Csh.A00();
        this.A0L = AbstractC57302k5.A00(c07x.getLifecycle());
    }

    public static final boolean A03(C184658Hg c184658Hg) {
        int i;
        List A1Q = AbstractC16960so.A1Q(0, -1);
        View view = ((AnonymousClass834) c184658Hg.A04).getView();
        if (view instanceof ImageView) {
            C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                i = drawable.getLevel();
                return !A1Q.contains(Integer.valueOf(i));
            }
        }
        i = 0;
        return !A1Q.contains(Integer.valueOf(i));
    }

    public final boolean A0B(Runnable runnable) {
        int i;
        if (A03(this) && A02(this) && this.A06) {
            this.A05 = true;
            C184668Hh c184668Hh = this.A0G;
            View view = this.A0A;
            RunnableC24623AvJ runnableC24623AvJ = new RunnableC24623AvJ(this, runnable);
            if (this.A0F.A0S()) {
                i = Color.parseColor("#FBE9D2");
            } else {
                i = -1;
            }
            view.setBackgroundColor(i);
            c184668Hh.A01(view);
            Window A00 = C184668Hh.A00(view);
            if (A00 != null) {
                WindowManager.LayoutParams attributes = A00.getAttributes();
                attributes.screenBrightness = 1.0f;
                A00.setAttributes(attributes);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.95f);
            c184668Hh.A00 = ofFloat;
            ofFloat.setDuration(1000L);
            c184668Hh.A00.setRepeatCount(0);
            c184668Hh.A00.addListener(new ANC(view, c184668Hh, runnableC24623AvJ, -1.0f));
            c184668Hh.A00.start();
            return true;
        }
        runnable.run();
        return false;
    }

    public static final boolean A01(C184658Hg c184658Hg) {
        if (c184658Hg.A08) {
            C174757qB c174757qB = c184658Hg.A03;
            if (c174757qB == null) {
                C14360o3.A0F("cameraController");
                throw C00O.createAndThrow();
            }
            if (c174757qB.CWZ()) {
                C177447ue c177447ue = c184658Hg.A02;
                if (c177447ue != null && c177447ue.A00 != null) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A02(C184658Hg c184658Hg) {
        C177447ue c177447ue = c184658Hg.A02;
        if (c177447ue != null && c177447ue.A00 == null && c177447ue.A01 == 1 && !c184658Hg.A0I.contains(1)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(C184658Hg c184658Hg) {
        C177447ue c177447ue = c184658Hg.A02;
        boolean z = true;
        if (c177447ue == null || c177447ue.A01 != 1) {
            z = false;
        }
        if (!z) {
            C1810981l c1810981l = c184658Hg.A0F;
            if (!c1810981l.A0W(C81W.A0B, C81W.A0M, C81W.A0T, C81W.A0z)) {
                C1811981v c1811981v = c1810981l.A08;
                if ((!C14360o3.A0K(c1811981v.A00, C208509Kk.A00) || !c1810981l.A03) && !(c1811981v.A00 instanceof C81V)) {
                }
            }
            return true;
        }
        return false;
    }

    public final Integer A05() {
        C177447ue c177447ue;
        AbstractC176797tb abstractC176797tb;
        if (!this.A08 || (c177447ue = this.A02) == null || (abstractC176797tb = c177447ue.A03) == null) {
            return null;
        }
        return (Integer) abstractC176797tb.A02(AbstractC176797tb.A0B);
    }

    public static final void A00(C184658Hg c184658Hg) {
        int A08;
        Resources resources;
        int i;
        if (A01(c184658Hg)) {
            if (A02(c184658Hg)) {
                A08 = 0;
                if (c184658Hg.A06) {
                    A08 = 1;
                }
            } else {
                C174757qB c174757qB = c184658Hg.A03;
                if (c174757qB == null) {
                    C14360o3.A0F("cameraController");
                    throw C00O.createAndThrow();
                }
                A08 = c174757qB.A08();
            }
            boolean A0A = c184658Hg.A0A();
            c184658Hg.A04.setEnabled(A0A);
            View view = ((AnonymousClass834) c184658Hg.A04).getView();
            if (view instanceof ImageView) {
                C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) view).setImageLevel(A08);
            } else {
                String A0R = AnonymousClass001.A0R(AbstractC43591JPw.A00(1320), view.getClass().getSimpleName());
                C14360o3.A0B(A0R, 1);
                AbstractC12120kG.A04("CameraButtonImpl", A0R, 817903175, null);
            }
            c184658Hg.A01 = c184658Hg.A00;
            c184658Hg.A00 = A08;
            boolean z = c184658Hg.A07;
            AnonymousClass835 anonymousClass835 = c184658Hg.A04;
            float f = 1.0f;
            if (z) {
                f = 0.5f;
            }
            anonymousClass835.EPa(f);
            if (!A0A) {
                resources = c184658Hg.A0J;
                i = 2131962661;
            } else if (A08 != -1 && A08 != 0) {
                if (A08 != 1) {
                    if (A08 != 2) {
                        if (A08 != 3) {
                            return;
                        }
                    } else {
                        resources = c184658Hg.A0J;
                        i = 2131962660;
                    }
                }
                resources = c184658Hg.A0J;
                i = 2131962664;
            } else {
                resources = c184658Hg.A0J;
                i = 2131962663;
            }
            String string = resources.getString(i);
            if (string != null) {
                ((AnonymousClass834) c184658Hg.A04).getView().setContentDescription(string);
            }
        }
    }

    public final void A06() {
        if (A02(this) && this.A06) {
            AbstractC23641Du.A05(this.A0K, new PYX(this, null, 8), this.A0L);
        }
    }

    public final void A07() {
        if (A02(this) && this.A06) {
            AbstractC23641Du.A05(this.A0K, new PYX(this, null, 9), this.A0L);
        }
    }

    public final void A08(int i) {
        if (A01(this)) {
            C174757qB c174757qB = this.A03;
            if (c174757qB == null) {
                C14360o3.A0F("cameraController");
                throw C00O.createAndThrow();
            }
            c174757qB.A0J(new C177857vK(this, i), 0);
        }
    }

    public final void A09(int i) {
        if (A01(this)) {
            C174757qB c174757qB = this.A03;
            if (c174757qB != null) {
                if (i != c174757qB.A08()) {
                    C174757qB c174757qB2 = this.A03;
                    if (c174757qB2 != null) {
                        c174757qB2.A0J(this.A0C, i);
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("cameraController");
            throw C00O.createAndThrow();
        }
    }

    public final boolean A0A() {
        if (A04(this)) {
            return this.A0I.contains(3);
        }
        C1810981l c1810981l = this.A0F;
        C1811981v c1811981v = c1810981l.A08;
        if (C14360o3.A0K(c1811981v.A00, C81S.A00) || c1810981l.A0W(C81W.A0C) || c1810981l.A0W(C81W.A0D) || C14360o3.A0K(c1811981v.A00, C81R.A00)) {
            return false;
        }
        if (!this.A0I.contains(1) && !A02(this)) {
            return false;
        }
        return true;
    }
}
