package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.MTs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50561MTs {
    public C41181vS A00;
    public C41551w4 A01;
    public String A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final C55982hj A07;
    public final UserSession A08;
    public final C50562MTt A09;
    public final InterfaceC1118953b A0A;
    public final C50563MTu A0B;
    public final C50560MTr A0C;
    public final String A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final float A0G;
    public final View A0H;
    public final InterfaceC55932he A0I;

    public static final void A00(C50561MTs c50561MTs) {
        if (c50561MTs.A03) {
            ReboundViewPager reboundViewPager = (ReboundViewPager) c50561MTs.A0B.A03.getValue();
            int measuredWidth = c50561MTs.A0H.getMeasuredWidth();
            int measuredHeight = (int) (c50561MTs.A0G * AbstractC166987dD.A0d(r1.A02).getMeasuredHeight());
            InterfaceC09390do interfaceC09390do = c50561MTs.A0E;
            if (measuredHeight != ((C50564MTv) interfaceC09390do.getValue()).A00) {
                ((C50564MTv) interfaceC09390do.getValue()).A00 = measuredHeight;
                reboundViewPager.A0C = measuredHeight;
                float f = measuredWidth;
                float f2 = c50561MTs.A05;
                reboundViewPager.A0M(((int) (f / (measuredHeight + (2.0f * f2)))) + 1, false);
                reboundViewPager.A0J = new C42E(measuredHeight, (int) f2, 0.8f);
            }
            int A00 = ((C50564MTv) interfaceC09390do.getValue()).A00(c50561MTs.A00);
            reboundViewPager.A0H(A00);
            C50559MTq c50559MTq = (C50559MTq) AbstractC001800i.A0O(((C50564MTv) interfaceC09390do.getValue()).A01, A00);
            if (c50559MTq != null) {
                c50561MTs.A09.A00(c50559MTq.A01, A00);
            }
        }
    }

    public C50561MTs(View view, UserSession userSession, InterfaceC1118953b interfaceC1118953b, C50560MTr c50560MTr, String str, String str2, float f) {
        boolean A1V = AbstractC167007dF.A1V(str);
        C14360o3.A0B(str2, 3);
        this.A08 = userSession;
        this.A0D = str;
        this.A0H = view;
        this.A04 = f;
        this.A0A = interfaceC1118953b;
        this.A0C = c50560MTr;
        Context context = view.getContext();
        this.A06 = context;
        C51978MyM c51978MyM = new C51978MyM(this, 3);
        this.A0I = c51978MyM;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = A1V;
        A0R.A0A(c51978MyM);
        this.A07 = A0R;
        this.A0E = AbstractC09440dt.A01(new C57527Pg1(this, 0));
        this.A0F = AbstractC09440dt.A01(new C57527Pg1(this, A1V ? 1 : 0));
        this.A0B = new C50563MTu(AbstractC37301Gc2.A0D(view, R.id.story_viewer_scrubber_view_stub), this);
        Resources resources = view.getResources();
        this.A0G = resources.getDisplayMetrics().widthPixels / resources.getDisplayMetrics().heightPixels;
        C14360o3.A07(context);
        this.A05 = AbstractC13880nE.A04(context, 6);
        this.A09 = new C50562MTt(userSession, str);
        this.A02 = "unknown";
    }
}
