package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.CuC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29207CuC implements XEL {
    public float A00;
    public float A01;
    public Float A02;
    public Integer A03;
    public final L5D A04;
    public final UserSession A05;
    public final C27984CVh A06;
    public final InterfaceC16820sZ A07;
    public final boolean A08;

    @Override // X.XEL
    public final void ABS(C04U c04u) {
        C14360o3.A0B(c04u, 0);
        A00(c04u.A00.A05());
        this.A02 = Float.valueOf(c04u.A00.A05());
    }

    private final void A00(float f) {
        float f2 = 1.0f - f;
        float f3 = (this.A01 - this.A00) * f2;
        L5D l5d = this.A04;
        View view = l5d.A04;
        if (view == null) {
            view = l5d.A09;
        }
        view.setTranslationY(f3);
        l5d.A00.setTranslationY(f3);
        l5d.A01.setAlpha(1.0f - f2);
        if (this.A08) {
            int i = (int) (255.0f * f);
            View view2 = l5d.A05;
            if (view2 == null) {
                view2 = l5d.A03;
            }
            view2.getBackground().setAlpha(i);
            this.A06.A02(f);
        }
    }

    @Override // X.XEL
    public final void ABR() {
        L5D l5d = this.A04;
        View view = l5d.A04;
        if (view == null) {
            view = l5d.A09;
        }
        view.setTranslationY(0.0f);
        l5d.A00.setTranslationY(0.0f);
        l5d.A01.setAlpha(1.0f);
        if (this.A08) {
            View view2 = l5d.A05;
            if (view2 == null) {
                view2 = l5d.A03;
            }
            view2.getBackground().setAlpha(255);
            this.A06.A00();
        }
        this.A07.invoke();
    }

    @Override // X.XEL
    public final void CO8() {
        L5D l5d = this.A04;
        View view = l5d.A04;
        if (view == null) {
            view = l5d.A09;
        }
        this.A01 = view.getBottom();
        if (this.A08) {
            View view2 = l5d.A05;
            if (view2 == null) {
                view2 = l5d.A03;
            }
            ColorDrawable A0G = AbstractC25225BEi.A0G(AbstractC167007dF.A09(view2.getContext(), R.attr.igds_color_dimmer));
            A0G.setAlpha(0);
            view2.setBackground(A0G);
            this.A06.A01();
        }
    }

    @Override // X.XEL
    public final void COk() {
        L5D l5d = this.A04;
        View view = l5d.A04;
        if (view == null) {
            view = l5d.A09;
        }
        this.A00 = view.getBottom();
    }

    @Override // X.XEL
    public final void E5x(int i) {
        L5D l5d = this.A04;
        LBL.A01(l5d.A02, i);
        this.A03 = Integer.valueOf(i);
        View view = l5d.A01;
        view.setVisibility(0);
        view.setAlpha(0.0f);
    }

    @Override // X.XEL
    public final void FAO(int i) {
        int intValue;
        Integer num = this.A03;
        if (num != null && (intValue = i - num.intValue()) > 0) {
            L5D l5d = this.A04;
            View view = l5d.A04;
            if (view == null) {
                view = l5d.A09;
            }
            LBL.A01(view, intValue);
            Float f = this.A02;
            if (f != null) {
                A00(f.floatValue());
            }
            this.A00 = view.getBottom();
            AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0O("ImmersiveCreationAnimationEffectHandler: Unexpected additional keyboard height change of ", intValue), 817892647);
        }
    }

    public C29207CuC(UserSession userSession, L5D l5d, C27984CVh c27984CVh, InterfaceC16820sZ interfaceC16820sZ) {
        this.A05 = userSession;
        this.A04 = l5d;
        this.A06 = c27984CVh;
        this.A07 = interfaceC16820sZ;
        this.A08 = C18U.A06(C06090Tz.A05, userSession, 36323096768883674L);
    }
}
