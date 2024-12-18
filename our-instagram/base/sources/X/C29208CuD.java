package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates;

/* renamed from: X.CuD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29208CuD implements XEL {
    public float A00;
    public float A01;
    public int A02;
    public ContentNotesCoordinates A03;
    public Float A04;
    public Integer A05;
    public final float A06;
    public final UserSession A07;
    public final ContentNotesCoordinates A08;
    public final CTu A09;
    public final CT8 A0A;
    public final C27984CVh A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C29208CuD(UserSession userSession, ContentNotesCoordinates contentNotesCoordinates, CTu cTu, CT8 ct8, C27984CVh c27984CVh, boolean z) {
        AbstractC167007dF.A1G(userSession, 1, cTu);
        this.A07 = userSession;
        this.A0A = ct8;
        this.A08 = contentNotesCoordinates;
        this.A0B = c27984CVh;
        this.A09 = cTu;
        this.A0C = z;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0D = C18U.A06(c06090Tz, userSession, 36323096768883674L);
        this.A06 = (C18U.A06(c06090Tz, userSession, 36326635821217799L) ? 32.0f : 48.0f) / 96.0f;
    }

    @Override // X.XEL
    public final void ABS(C04U c04u) {
        C14360o3.A0B(c04u, 0);
        A00(c04u.A00.A05());
        this.A04 = Float.valueOf(c04u.A00.A05());
    }

    private final void A00(float f) {
        ContentNotesCoordinates contentNotesCoordinates;
        float f2 = 1.0f - f;
        float f3 = (this.A01 - this.A00) * f2;
        CT8 ct8 = this.A0A;
        View view = ct8.A06;
        view.setTranslationY(f3);
        ct8.A01.setTranslationY(f3);
        ct8.A03.setTranslationY(f3);
        if (this.A0D) {
            int i = (int) (255.0f * f);
            View view2 = ct8.A05;
            if (view2 == null) {
                view2 = ct8.A02;
            }
            view2.getBackground().setAlpha(i);
            view.setVisibility(0);
            view.setAlpha(f);
            this.A0B.A02(f);
        }
        if (this.A03 != null && (contentNotesCoordinates = this.A08) != null) {
            View view3 = ct8.A07;
            view3.setPivotX(0.0f);
            view3.setPivotY(0.0f);
            view3.setTranslationX((contentNotesCoordinates.A00 - r4.A00) * f2);
            view3.setTranslationY((contentNotesCoordinates.A01 - (r4.A01 - this.A02)) * f2);
            float f4 = this.A06;
            float f5 = f4 + ((1.0f - f4) * f);
            view3.setScaleX(f5);
            view3.setScaleY(f5);
            return;
        }
        ct8.A07.setAlpha(f);
    }

    @Override // X.XEL
    public final void ABR() {
        CT8 ct8 = this.A0A;
        View view = ct8.A06;
        view.setTranslationY(0.0f);
        ct8.A01.setTranslationY(0.0f);
        ct8.A03.setTranslationY(0.0f);
        if (this.A0D) {
            View view2 = ct8.A05;
            if (view2 == null) {
                view2 = ct8.A02;
            }
            view2.getBackground().setAlpha(255);
            view.setAlpha(1.0f);
            this.A0B.A00();
        }
        if (this.A03 != null && this.A08 != null) {
            View view3 = ct8.A07;
            view3.setTranslationX(0.0f);
            view3.setTranslationY(0.0f);
            view3.setScaleX(1.0f);
            view3.setScaleY(1.0f);
        } else {
            ct8.A07.setAlpha(1.0f);
        }
        View view4 = ct8.A02;
        CTu cTu = this.A09;
        AbstractC62809SSd.A00(view4, cTu);
        cTu.A00();
    }

    @Override // X.XEL
    public final void CO8() {
        CT8 ct8 = this.A0A;
        View view = ct8.A06;
        this.A01 = view.getBottom();
        if (this.A0D) {
            View view2 = ct8.A05;
            if (view2 == null) {
                view2 = ct8.A02;
            }
            ColorDrawable A0G = AbstractC25225BEi.A0G(AbstractC167007dF.A09(view2.getContext(), R.attr.igds_color_dimmer));
            A0G.setAlpha(0);
            view2.setBackground(A0G);
            view.setAlpha(0.0f);
            view.setVisibility(4);
            this.A0B.A01();
        }
    }

    @Override // X.XEL
    public final void COk() {
        CT8 ct8 = this.A0A;
        this.A00 = ct8.A06.getBottom();
        if (this.A08 != null) {
            View view = ct8.A07;
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.A03 = new ContentNotesCoordinates(iArr[0], iArr[1]);
        }
    }

    @Override // X.XEL
    public final void E5x(int i) {
        CT8 ct8 = this.A0A;
        AbstractC13880nE.A0U(ct8.A06, i);
        this.A05 = Integer.valueOf(i);
        if (!this.A0C) {
            ct8.A07.setVisibility(0);
        }
    }

    @Override // X.XEL
    public final void FAO(int i) {
        int intValue;
        Integer num = this.A05;
        if (num != null && (intValue = i - num.intValue()) > 0) {
            AbstractC13880nE.A0U(this.A0A.A06, i);
            this.A00 = r0.getBottom();
            this.A02 = intValue;
            Float f = this.A04;
            if (f != null) {
                A00(f.floatValue());
            }
            AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0O("ImmersiveCreationAnimationEffectHandler: Unexpected additional keyboard height change of ", intValue), 817892647);
        }
    }
}
