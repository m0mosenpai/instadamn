package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEO extends C7E1 implements InterfaceC65242xM, InterfaceC65252xN, InterfaceC152956uP {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C44459JlR A03;
    public final C155946zO A04;
    public final HFL A05;
    public final C153006uU A06;
    public final C152996uT A07;
    public final InterfaceC62602sz A08;
    public final C65842yM A09;
    public final C63622uj A0A;
    public final C155376yQ A0B;
    public final Map A0C;

    public HEO(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C44459JlR c44459JlR, C155376yQ c155376yQ, C38U c38u, InterfaceC62602sz interfaceC62602sz) {
        C14360o3.A0B(interfaceC62602sz, 4);
        AbstractC167017dG.A1T(userSession, c38u);
        C14360o3.A0B(c44459JlR, 8);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A0B = c155376yQ;
        this.A08 = interfaceC62602sz;
        this.A02 = userSession;
        this.A03 = c44459JlR;
        this.A0C = AbstractC166987dD.A1G();
        C65842yM c65842yM = new C65842yM(context);
        this.A09 = c65842yM;
        C153006uU c153006uU = new C153006uU(context);
        this.A06 = c153006uU;
        HFL hfl = new HFL(context, interfaceC11380iw, userSession, new C42608ItR(this), new C42610ItT(this), false, false, false);
        this.A05 = hfl;
        C152996uT c152996uT = new C152996uT(context);
        this.A07 = c152996uT;
        this.A04 = new C155946zO(null, c38u, C05F.A01);
        this.A0A = new C63622uj();
        A0B(c153006uU, hfl, c65842yM, c152996uT);
    }

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A0C;
        C153336v2 c153336v2 = (C153336v2) map.get(str);
        if (c153336v2 == null) {
            C153336v2 c153336v22 = new C153336v2();
            c153336v22.A03 = true;
            map.put(str, c153336v22);
            return c153336v22;
        }
        return c153336v2;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.IC8, java.lang.Object] */
    public final void A0C() {
        EnumC153216up enumC153216up;
        A06();
        this.A0A.A00.clear();
        C155946zO c155946zO = this.A04;
        c155946zO.A08(this.A0B);
        ?? obj = new Object();
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131962120);
        SpannableStringBuilder append = AbstractC31175DnJ.A05(context, 2131962130).append((CharSequence) " ").append((CharSequence) A0p);
        C14360o3.A07(append);
        AnonymousClass773.A03(append, new C27280C2f(this, AbstractC31174DnI.A02(context), 1), A0p);
        obj.A00 = append;
        A08(this.A06, obj);
        if (AbstractC166987dD.A1b(((AbstractC65332xV) c155946zO).A01)) {
            int A02 = c155946zO.A02();
            for (int i = 0; i < A02; i++) {
                C153126ug A0F = c155946zO.A0F(i);
                C153336v2 BQs = BQs(AbstractC166997dE.A0u(A0F));
                boolean z = true;
                if (this.A08.CLJ() || i != c155946zO.A02() - 1) {
                    z = false;
                }
                BQs.A00(i, z);
                A09(this.A05, A0F, BQs);
            }
            InterfaceC62602sz interfaceC62602sz = this.A08;
            if (interfaceC62602sz.CLJ()) {
                A08(this.A09, interfaceC62602sz);
            }
        } else {
            C1571273r A0J = AbstractC37300Gc1.A0J();
            if (this.A08.CUG()) {
                enumC153216up = EnumC153216up.A04;
                A0J.A02 = R.drawable.loadmore_icon_refresh_compound;
                A0J.A05 = ViewOnClickListenerC42032Ik1.A00(this, 19);
            } else {
                enumC153216up = EnumC153216up.A02;
                A0J.A02 = R.drawable.ig_illustrations_illo_exclusive_posts_refresh;
                A0J.A0D = context.getResources().getString(2131962129);
                A0J.A07 = context.getResources().getString(2131962128);
                String A0q = AbstractC166997dE.A0q(context.getResources(), 2131962127);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0q);
                AnonymousClass773.A05(A0H, new C27280C2f(this, AbstractC31173DnH.A01(context), 2), A0q);
                A0H.setSpan(new StyleSpan(1), 0, A0q.length(), 18);
                A0J.A08 = A0H;
            }
            A09(this.A07, A0J, enumC153216up);
        }
        A07();
    }
}
