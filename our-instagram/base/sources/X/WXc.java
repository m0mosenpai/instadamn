package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WXc implements InterfaceC55932he, XBN {
    public static final C55942hf A0L = C55942hf.A02(12.0d);
    public ViewGroup A00;
    public ViewGroup A01;
    public VJQ A02;
    public C69338Vlk A03;
    public CircularImageView A04;
    public CircularImageView A05;
    public NametagResultCardView A06;
    public User A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final Activity A0C;
    public final C68710Vam A0D;
    public final InterfaceC11380iw A0E;
    public final InterfaceC41501vz A0F = new C70717Wfi(this, 5);
    public final UserSession A0G;
    public final int A0H;
    public final ViewGroup A0I;
    public final C55982hj A0J;
    public final C85G A0K;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    private void A00() {
        if (this.A01 == null) {
            ViewStub viewStub = (ViewStub) this.A0I.requireViewById(R.id.nametag_result_view_stub);
            viewStub.setLayoutResource(R.layout.nametag_result_card_no_bg);
            ViewGroup viewGroup = (ViewGroup) viewStub.inflate();
            this.A01 = viewGroup;
            viewGroup.setVisibility(8);
            WNS.A00(this.A01, 21, this);
            NametagResultCardView nametagResultCardView = (NametagResultCardView) this.A01.requireViewById(R.id.result_card_view);
            this.A06 = nametagResultCardView;
            nametagResultCardView.setDelegate(this);
            WO5.A00(this.A06, 17, this);
        }
    }

    public final void A02(User user) {
        this.A07 = user;
        A00();
        NametagResultCardView nametagResultCardView = this.A06;
        nametagResultCardView.getClass();
        InterfaceC11380iw interfaceC11380iw = this.A0E;
        String fullName = user.getFullName();
        AbstractC31173DnH.A1T(interfaceC11380iw, nametagResultCardView.A06, user);
        nametagResultCardView.A07.setName(user.getUsername(), fullName);
        boolean isEmpty = TextUtils.isEmpty(fullName);
        TextView textView = nametagResultCardView.A04;
        if (!isEmpty) {
            textView.setText(fullName);
            nametagResultCardView.A04.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (nametagResultCardView.A00 > 0) {
            NametagResultCardView.A01(nametagResultCardView);
        } else {
            nametagResultCardView.A02.setVisibility(8);
        }
        C55982hj c55982hj = this.A0J;
        c55982hj.A06 = false;
        c55982hj.A03();
        this.A0I.setImportantForAccessibility(4);
        this.A0A = false;
    }

    public final boolean A03() {
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.XBN
    public final void DUv(int i, int i2, boolean z) {
        float f;
        Activity activity = this.A0C;
        int A0A = AbstractC13880nE.A0A(activity);
        int i3 = (int) (i * 0.35f);
        ViewGroup viewGroup = this.A01;
        viewGroup.getClass();
        int height = ((viewGroup.getHeight() - i2) / 2) + ((i - i3) / 2);
        if (z) {
            int i4 = (height * 2) + i3;
            if (this.A00 == null) {
                this.A00 = new FrameLayout(activity);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(A0A, i4);
                ViewGroup viewGroup2 = this.A01;
                viewGroup2.getClass();
                viewGroup2.addView(this.A00, layoutParams);
                this.A00.layout(0, 0, A0A, i4);
            }
        }
        if (this.A04 == null) {
            this.A04 = new CircularImageView(activity);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i3, i3);
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = height;
            ViewGroup viewGroup3 = this.A01;
            viewGroup3.getClass();
            viewGroup3.addView(this.A04, layoutParams2);
            this.A04.layout(0, height, i3, height + i3);
            AbstractC166997dE.A19(activity, this.A04, R.drawable.profile_anonymous_user);
        }
        int i5 = this.A0H;
        int i6 = (A0A - i5) / 2;
        CircularImageView circularImageView = this.A04;
        circularImageView.getClass();
        float f2 = i6;
        if (z) {
            f2 = A0A;
        }
        circularImageView.setTranslationX(f2);
        circularImageView.setVisibility(0);
        User user = this.A07;
        user.getClass();
        ImageUrl Bhu = user.Bhu();
        InterfaceC11380iw interfaceC11380iw = this.A0E;
        circularImageView.setUrl(Bhu, interfaceC11380iw);
        CircularImageView circularImageView2 = this.A05;
        if (circularImageView2 == null) {
            this.A05 = new CircularImageView(activity);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = height;
            ViewGroup viewGroup4 = this.A01;
            viewGroup4.getClass();
            viewGroup4.addView(this.A05, layoutParams3);
            CircularImageView circularImageView3 = this.A05;
            int i7 = this.A0B;
            circularImageView3.layout(0, height - i7, (i7 * 2) + i3, height + i3 + i7);
            AbstractC166997dE.A19(activity, this.A05, R.drawable.profile_anonymous_user);
            this.A05.A0H(i7, -1);
            circularImageView2 = this.A05;
            circularImageView2.A02 = true;
        }
        int i8 = ((i5 + A0A) / 2) - i3;
        circularImageView2.getClass();
        if (z) {
            f = (-i3) - this.A0B;
        } else {
            f = i8;
        }
        circularImageView2.setTranslationX(f);
        circularImageView2.setVisibility(0);
        AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView2, C17060sy.A01.A01(this.A0G));
        if (z) {
            ViewGroup viewGroup5 = this.A01;
            viewGroup5.getClass();
            viewGroup5.post(new RunnableC71632Wxe(circularImageView2, circularImageView, this, i3, i8, A0A, i6));
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        ValueAnimator valueAnimator;
        if (c55982hj.A01 == 1.0d) {
            if (this.A02 == null) {
                NametagResultCardView nametagResultCardView = this.A06;
                nametagResultCardView.getClass();
                UserSession userSession = this.A0G;
                InterfaceC11380iw interfaceC11380iw = this.A0E;
                User user = this.A07;
                user.getClass();
                nametagResultCardView.A02(interfaceC11380iw, userSession, user);
                return;
            }
            return;
        }
        CircularImageView circularImageView = this.A05;
        if (circularImageView != null) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le.A00(circularImageView).A0G();
            circularImageView.setTranslationX((-circularImageView.getWidth()) - this.A0B);
            circularImageView.setImageAlpha(255);
        }
        CircularImageView circularImageView2 = this.A04;
        if (circularImageView2 != null) {
            C55942hf c55942hf2 = C150956qv.A02;
            AbstractC125325le.A00(circularImageView2).A0G();
            circularImageView2.setTranslationX(AbstractC13880nE.A0A(this.A0C));
            circularImageView2.setImageAlpha(255);
        }
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
        }
        C69338Vlk c69338Vlk = this.A03;
        if (c69338Vlk != null && (valueAnimator = c69338Vlk.A00) != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        if (this.A08) {
            this.A08 = false;
            C85G c85g = this.A0K;
            User user2 = this.A07;
            user2.getClass();
            String username = user2.getUsername();
            VJQ vjq = this.A02;
            vjq.getClass();
            int i = vjq.A00;
            C68935VeZ c68935VeZ = this.A02.A01;
            c68935VeZ.getClass();
            c85g.Dlz(username, i, c68935VeZ.A00);
        } else {
            this.A0K.Dh6(this.A0A);
        }
        this.A07 = null;
        this.A02 = null;
        NametagResultCardView nametagResultCardView2 = this.A06;
        if (nametagResultCardView2 == null) {
            return;
        }
        nametagResultCardView2.A0B = false;
        nametagResultCardView2.A0D = false;
        nametagResultCardView2.A0C = false;
        nametagResultCardView2.A05.setOnClickListener(null);
        View view = nametagResultCardView2.A02;
        C55942hf c55942hf3 = C150956qv.A02;
        AbstractC125325le.A01(view, 0).A0G();
        nametagResultCardView2.A02.setAlpha(1.0f);
        nametagResultCardView2.A02.setVisibility(0);
        nametagResultCardView2.A09.setVisibility(8);
        nametagResultCardView2.A0A.setVisibility(8);
        nametagResultCardView2.A03.setVisibility(8);
        nametagResultCardView2.A01.setVisibility(8);
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C55992hk c55992hk = c55982hj.A09;
        float min = (float) Math.min(Math.max(c55992hk.A00, 0.0d), 1.0d);
        double d = min;
        float A01 = (float) AbstractC70163Da.A01(d, 1.0d);
        NametagResultCardView nametagResultCardView = this.A06;
        nametagResultCardView.getClass();
        nametagResultCardView.setAlpha(A01);
        NametagResultCardView nametagResultCardView2 = this.A06;
        int i = 0;
        int i2 = 8;
        if (A01 > 0.0f) {
            i2 = 0;
        }
        nametagResultCardView2.setVisibility(i2);
        float A03 = (float) AbstractC70163Da.A03(c55992hk.A00, 0.800000011920929d, 1.0d);
        this.A06.setScaleX(A03);
        this.A06.setScaleY(A03);
        ViewGroup viewGroup = this.A01;
        viewGroup.getClass();
        int i3 = 8;
        if (min > 0.0f) {
            i3 = 0;
        }
        viewGroup.setVisibility(i3);
        if (this.A06.A0D) {
            int A00 = (int) AbstractC70163Da.A00(d);
            CircularImageView circularImageView = this.A05;
            if (circularImageView != null) {
                circularImageView.setImageAlpha(A00);
                int i4 = 8;
                if (A00 > 0) {
                    i4 = 0;
                }
                circularImageView.setVisibility(i4);
                circularImageView.setStrokeAlpha(A00);
            }
            CircularImageView circularImageView2 = this.A04;
            if (circularImageView2 != null) {
                circularImageView2.setImageAlpha(A00);
                int i5 = 8;
                if (A00 > 0) {
                    i5 = 0;
                }
                circularImageView2.setVisibility(i5);
            }
            ViewGroup viewGroup2 = this.A00;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(A01);
                if (A00 <= 0) {
                    i = 8;
                }
                viewGroup2.setVisibility(i);
            }
        }
        this.A0K.Dh7(min);
    }

    public WXc(Activity activity, ViewGroup viewGroup, C68710Vam c68710Vam, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C85G c85g) {
        this.A0C = activity;
        this.A0I = viewGroup;
        this.A0G = userSession;
        this.A0K = c85g;
        this.A0D = c68710Vam;
        this.A0E = interfaceC11380iw;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(A0L);
        A0R.A0A(this);
        this.A0J = A0R;
        this.A0B = AbstractC167017dG.A0D(activity);
        this.A0H = AbstractC167017dG.A0A(activity);
    }

    public final void A01() {
        if (A03()) {
            C55982hj c55982hj = this.A0J;
            c55982hj.A06 = true;
            c55982hj.A04();
            this.A0I.setImportantForAccessibility(1);
        }
    }
}
