package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class JW4 extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C7YI A03;
    public final AnonymousClass988 A04;
    public final C7IM A05;
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new MHH(this, 2));

    public JW4(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7YI c7yi, AnonymousClass988 anonymousClass988, C7IM c7im) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A05 = c7im;
        this.A04 = anonymousClass988;
        this.A03 = c7yi;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44697Jqg(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.thread_message_typing_indicator, false), this.A02);
    }

    public static final void A00(C44697Jqg c44697Jqg) {
        L50 l50 = (L50) c44697Jqg.A01.getValue();
        View findViewById = l50.A01.findViewById(R.id.ai_agent_layout);
        if (findViewById != null) {
            ((AbstractC58662mP) l50.A06.getValue()).pause();
            ViewPropertyAnimator viewPropertyAnimator = l50.A00;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            l50.A00 = null;
            ((ShimmerFrameLayout) l50.A05.getValue()).A03();
            findViewById.setVisibility(8);
        }
    }

    public static final void A01(C44697Jqg c44697Jqg) {
        C47710L4r c47710L4r = (C47710L4r) c44697Jqg.A02.getValue();
        View findViewById = c47710L4r.A01.findViewById(R.id.default_layout);
        if (findViewById != null) {
            AbstractC166987dD.A0d(c47710L4r.A03).setOnClickListener(null);
            AbstractC43593JPy.A1V(c47710L4r.A02);
            AbstractC47749L6t abstractC47749L6t = c47710L4r.A00;
            if (abstractC47749L6t != null) {
                if (abstractC47749L6t instanceof KVI) {
                    ((KVI) abstractC47749L6t).A00.stop();
                } else {
                    AnonymousClass693 anonymousClass693 = ((KVJ) abstractC47749L6t).A00;
                    if (anonymousClass693 != null) {
                        anonymousClass693.stop();
                    }
                }
            }
            findViewById.setVisibility(8);
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        InterfaceC09390do interfaceC09390do;
        C7M8 c7m8 = (C7M8) interfaceC66482zP;
        C44697Jqg c44697Jqg = (C44697Jqg) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c7m8, c44697Jqg);
        boolean z = c7m8.A06;
        c44697Jqg.A00 = z;
        Integer num = c7m8.A04;
        if (num == null) {
            A00(c44697Jqg);
            C47710L4r c47710L4r = (C47710L4r) c44697Jqg.A02.getValue();
            View view = c47710L4r.A01;
            ViewStub A07 = AbstractC31171DnF.A07(view, R.id.default_layout_stub);
            if (A07 != null) {
                A07.inflate();
            }
            boolean z2 = false;
            AbstractC166997dE.A0S(view, R.id.default_layout).setVisibility(0);
            boolean A1X = AbstractC167007dF.A1X(c7m8.A03.A01, IGAIAgentType.A04);
            InterfaceC09390do interfaceC09390do2 = this.A04.A0M;
            if (A1X && AbstractC167007dF.A1Z(interfaceC09390do2)) {
                interfaceC09390do = c47710L4r.A07;
            } else {
                interfaceC09390do = c47710L4r.A06;
            }
            AbstractC47749L6t abstractC47749L6t = (AbstractC47749L6t) interfaceC09390do.getValue();
            c47710L4r.A00 = abstractC47749L6t;
            if (abstractC47749L6t != null) {
                abstractC47749L6t.A00((ImageView) c47710L4r.A05.getValue());
            }
            int i2 = c7m8.A01;
            if (i2 == 0) {
                z2 = true;
            } else {
                InterfaceC09390do interfaceC09390do3 = c47710L4r.A04;
                if (((Animator) interfaceC09390do3.getValue()).isRunning()) {
                    AbstractC43593JPy.A1V(interfaceC09390do3);
                    InterfaceC09390do interfaceC09390do4 = c47710L4r.A03;
                    AbstractC166987dD.A0d(interfaceC09390do4).setScaleX(1.0f);
                    AbstractC166987dD.A0d(interfaceC09390do4).setScaleY(1.0f);
                }
            }
            InterfaceC09390do interfaceC09390do5 = c47710L4r.A03;
            View A0d = AbstractC166987dD.A0d(interfaceC09390do5);
            int i3 = 8;
            if (z2) {
                i3 = 0;
            }
            A0d.setVisibility(i3);
            InterfaceC09390do interfaceC09390do6 = c47710L4r.A05;
            View A0d2 = AbstractC166987dD.A0d(interfaceC09390do6);
            Context context = this.A00;
            C7IM c7im = this.A05;
            Drawable A0a = AbstractC166987dD.A0a(this.A06);
            AbstractC162737Qk.A05(context, A0a, c7im, z);
            A0d2.setBackground(A0a);
            if (AbstractC166987dD.A0d(interfaceC09390do5).getVisibility() == 0) {
                ((Animator) c47710L4r.A02.getValue()).start();
            }
            AbstractC47749L6t abstractC47749L6t2 = c47710L4r.A00;
            if (abstractC47749L6t2 != null) {
                if (abstractC47749L6t2 instanceof KVI) {
                    ((KVI) abstractC47749L6t2).A00.start();
                } else {
                    AnonymousClass693 anonymousClass693 = ((KVJ) abstractC47749L6t2).A00;
                    if (anonymousClass693 != null) {
                        anonymousClass693.EH1();
                        anonymousClass693.E4S();
                    }
                }
            }
            int dimensionPixelSize = AbstractC25228BEl.A0M(AbstractC166987dD.A0d(interfaceC09390do5)).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            if (i2 == 0) {
                ImageUrl imageUrl = c7m8.A02;
                if (imageUrl != null) {
                    AbstractC43592JPx.A0V(interfaceC09390do5).setUrl(imageUrl, this.A01);
                } else {
                    AbstractC43592JPx.A0V(interfaceC09390do5).A09();
                }
                LQ1.A00(AbstractC166987dD.A0d(interfaceC09390do5), 29, this, c7m8);
                AbstractC13880nE.A0e(AbstractC166987dD.A0d(interfaceC09390do5), dimensionPixelSize);
                dimensionPixelSize = AbstractC25235BEs.A04(AbstractC166987dD.A0d(interfaceC09390do6).getContext());
            }
            AbstractC13880nE.A0e(AbstractC166987dD.A0d(interfaceC09390do6), dimensionPixelSize);
            AbstractC43593JPy.A1W(interfaceC09390do5, i2);
            return;
        }
        A01(c44697Jqg);
        L50 l50 = (L50) c44697Jqg.A01.getValue();
        View view2 = l50.A01;
        ViewStub A072 = AbstractC31171DnF.A07(view2, R.id.ai_agent_layout_stub);
        if (A072 != null) {
            A072.inflate();
        }
        AbstractC166997dE.A0S(view2, R.id.ai_agent_layout).setVisibility(0);
        InterfaceC09390do interfaceC09390do7 = l50.A04;
        View A0d3 = AbstractC166987dD.A0d(interfaceC09390do7);
        Context context2 = this.A00;
        C7IM c7im2 = this.A05;
        Drawable A0a2 = AbstractC166987dD.A0a(this.A06);
        AbstractC162737Qk.A05(context2, A0a2, c7im2, z);
        A0d3.setBackground(A0a2);
        AbstractC13880nE.A0e(AbstractC166987dD.A0d(interfaceC09390do7), AbstractC25228BEl.A0M(AbstractC166987dD.A0d(interfaceC09390do7)).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
        int intValue = num.intValue();
        if (intValue != 2) {
            if (intValue != -100 && intValue != A1R && intValue != 3 && intValue != 4) {
                if (intValue == 5) {
                    i = 2131958661;
                } else if (intValue == 6) {
                    i = 2131958659;
                } else if (intValue == 7) {
                    i = 2131958658;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    InterfaceC09390do interfaceC09390do8 = l50.A05;
                    AbstractC43593JPy.A1W(interfaceC09390do8, 0);
                    InterfaceC09390do interfaceC09390do9 = l50.A07;
                    AbstractC166987dD.A1P(AbstractC166987dD.A0d(interfaceC09390do9).getContext(), (TextView) interfaceC09390do9.getValue(), valueOf.intValue());
                    ((ShimmerFrameLayout) interfaceC09390do8.getValue()).A02();
                }
            }
            InterfaceC09390do interfaceC09390do10 = l50.A05;
            ((ShimmerFrameLayout) interfaceC09390do10.getValue()).A03();
            AbstractC43593JPy.A1Q(interfaceC09390do10.getValue());
        }
        InterfaceC09390do interfaceC09390do11 = l50.A06;
        if (!((AbstractC58662mP) interfaceC09390do11.getValue()).isPlaying()) {
            InterfaceC09390do interfaceC09390do12 = l50.A08;
            AbstractC167007dF.A0L(interfaceC09390do12).setScaleX(0.0f);
            AbstractC167007dF.A0L(interfaceC09390do12).setScaleY(0.0f);
            ViewPropertyAnimator A0E = AbstractC43593JPy.A0E(AbstractC167007dF.A0L(interfaceC09390do12).animate().setStartDelay(100L).setDuration(200L), 1.0f);
            l50.A00 = A0E;
            if (A0E != null) {
                A0E.start();
            }
            ((AbstractC58662mP) interfaceC09390do11.getValue()).E4S();
        }
        C120115cA c120115cA = (C120115cA) l50.A03.getValue();
        Collection values = c120115cA.A02.values();
        ArrayList A0q = AbstractC167017dG.A0q(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1W(A0q, ((L42) it.next()).A02);
        }
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            c120115cA.A01.markerPoint(814299525, AbstractC167007dF.A0B(it2), "typing_status_updated", String.valueOf(intValue));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C7M8.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44697Jqg c44697Jqg = (C44697Jqg) c3oo;
        C14360o3.A0B(c44697Jqg, 0);
        A01(c44697Jqg);
        A00(c44697Jqg);
    }
}
