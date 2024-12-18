package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.LJq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47988LJq {
    public float A00;
    public float A01;
    public int A02;
    public AnimatorSet A03;
    public View A04;
    public ViewGroup A05;
    public IgTextView A06;
    public MR4 A07;
    public LKK A08;
    public C189478aR A09;
    public Float A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final PointF A0J;
    public final Vibrator A0K;
    public final View A0L;
    public final FrameLayout A0M;
    public final FrameLayout A0N;
    public final InterfaceC11380iw A0O;
    public final C18920wW A0P;
    public final UserSession A0Q;
    public final InterfaceC56392iX A0R;
    public final L6M A0S;
    public final C3o9 A0T;
    public final C3DN A0U;
    public final List A0V;
    public final InterfaceC09390do A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final PointF A0e;
    public final List A0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private final List A00(int i) {
        ?? A01;
        boolean z = this.A0Z;
        if (i == 29) {
            if (!z) {
                A01 = AbstractC166987dD.A1E();
                C1LC A0I = AbstractC43592JPx.A0I(C83863oV.A03);
                while (A0I.hasNext()) {
                    A01.add(((C83863oV) AbstractC166997dE.A0l(A0I)).A02);
                }
            }
            ImmutableList immutableList = C83863oV.A03;
            A01 = AbstractC166987dD.A1J("❤");
        } else {
            if (!z) {
                A01 = AbstractC47991LKc.A01();
            }
            ImmutableList immutableList2 = C83863oV.A03;
            A01 = AbstractC166987dD.A1J("❤");
        }
        if (A01.size() > 6) {
            return A01.subList(0, 6);
        }
        return A01;
    }

    public static final void A01(View view, C47988LJq c47988LJq, int i) {
        view.setOutlineProvider(new C50795McC(c47988LJq.A0I.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size), 1));
        view.setElevation(i);
    }

    public static final void A02(C47988LJq c47988LJq, String str) {
        IgTextView igTextView = c47988LJq.A06;
        if (igTextView != null) {
            AbstractC31177DnL.A0r(c47988LJq.A0I, igTextView, str, 2131959286);
        }
    }

    public final void A03() {
        float f;
        FrameLayout frameLayout = this.A0N;
        AbstractC125325le A0A = AbstractC43592JPx.A0n(frameLayout).A0A();
        Float f2 = this.A0A;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            PointF pointF = this.A0J;
            if (pointF != null) {
                f = pointF.x;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        A0A.A0U(1.0f, 0.0f, f);
        A0A.A0V(1.0f, 0.0f, AbstractC166987dD.A08(frameLayout));
        A0A.A0M(1.0f, 0.0f);
        A0A.A0H();
    }

    public final void A04(Float f, float f2) {
        FrameLayout frameLayout = this.A0N;
        float f3 = 0.0f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        frameLayout.setTranslationY(f2);
        if (f != null) {
            f3 = f.floatValue();
        }
        frameLayout.setTranslationX(f3);
    }

    public C47988LJq(Context context, PointF pointF, FrameLayout frameLayout, FrameLayout frameLayout2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, L6M l6m, C3o9 c3o9, C3DN c3dn, List list, List list2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        List A00;
        AbstractC167007dF.A1G(context, 2, l6m);
        C14360o3.A0B(frameLayout2, 7);
        this.A0Q = userSession;
        this.A0I = context;
        this.A0H = i;
        this.A0E = i2;
        this.A0S = l6m;
        this.A0M = frameLayout;
        this.A0N = frameLayout2;
        this.A0e = pointF;
        this.A0f = list;
        this.A0G = i3;
        this.A0O = interfaceC11380iw;
        this.A0a = z;
        this.A0b = z2;
        this.A0c = z3;
        this.A0d = z4;
        this.A0X = z5;
        this.A0T = c3o9;
        this.A0Z = z6;
        this.A0Y = z7;
        this.A0V = list2;
        this.A0U = c3dn;
        this.A0P = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        Object systemService = context.getSystemService("vibrator");
        if (systemService != null) {
            this.A0K = (Vibrator) systemService;
            this.A0W = C1XM.A00(new C37056GUm(this, 24));
            this.A0L = AbstractC166997dE.A0S(frameLayout, R.id.reactions_background_dimmer);
            this.A0J = pointF;
            this.A0D = true;
            this.A0F = 1000;
            this.A02 = -1;
            this.A0R = AbstractC56372iV.A01(frameLayout.requireViewById(R.id.customize_reactions_header), false, false);
            List A002 = A00(i);
            boolean z8 = this.A0X;
            if (z8 && !this.A0Z) {
                A00 = AbstractC47991LKc.A02(this.A0Q);
            } else {
                A00 = A00(this.A0H);
            }
            A00 = A00.size() > 6 ? A00.subList(0, 6) : A00;
            if (i == 29) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (Object obj : A00) {
                    ImmutableList immutableList = C83863oV.A03;
                    if (C14360o3.A0K(obj, "❤")) {
                        obj = "❤";
                    }
                    builder.add(obj);
                }
                A00 = builder.build();
            }
            L54 l54 = new L54(A00, A002, list, this.A0a, this.A0b, this.A0c, this.A0d, z8, this.A0Y);
            C49266LqM c49266LqM = new C49266LqM(this);
            this.A07 = c49266LqM;
            UserSession userSession2 = this.A0Q;
            this.A08 = new LKK(this.A0I, this.A0N, this.A0O, userSession2, c49266LqM, l54, C18U.A06(C06090Tz.A05, userSession2, 36326579986642920L));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
