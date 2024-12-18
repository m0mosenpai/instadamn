package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.facebook.R;

/* renamed from: X.Bn1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26480Bn1 extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final float A01;
    public final int A02;
    public final Drawable A03;
    public final EnumC77683ds A04;
    public final CharSequence A05;
    public final boolean A06;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C3e8 c3e8;
        C14360o3.A0B(c76223bS, 0);
        TypedValue typedValue = new TypedValue();
        C2XE c2xe = c76223bS.A05;
        c2xe.A0C.getResources().getValue(R.dimen.clips_viewer_social_context_shadow_radius, typedValue, true);
        C51722Yv c51722Yv = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0m(num, 0));
        float f = this.A01;
        Integer num2 = C05F.A00;
        C51722Yv A0Y = AbstractC25231BEo.A0Y(C9CV.A00(AbstractC25232BEp.A15(AbstractC25230BEn.A0d(A0h, num2, f, 0), num2, EnumC77683ds.FLEX_START), num, true, 4), DRP.A00(this, 23));
        boolean z = this.A06;
        if (z) {
            c3e8 = C3e8.FLEX_END;
        } else {
            c3e8 = C3e8.CENTER;
        }
        EnumC77683ds enumC77683ds = this.A04;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        if (z) {
            c51722Yv = C9CU.A00(null, C05F.A0A, 0, AbstractC77623dm.A0D(A0P, R.dimen.account_recs_header_image_margin));
        }
        C2Z0 A13 = AbstractC25232BEp.A13(A0P);
        Drawable drawable = this.A03;
        if (drawable != null) {
            C51722Yv A0J = AbstractC25234BEr.A0J(C9CU.A00(null, C05F.A0D, 0, AbstractC77623dm.A0B(A13)), A13, num2, num);
            Drawable mutate = drawable.mutate();
            C2XE ArD = A13.ArD();
            AbstractC25231BEo.A0x(ArD.A0C, mutate, R.color.audio_bar_action_color_enabled);
            AbstractC25234BEr.A0r(mutate, ArD, A13, A0J);
        }
        C2XE c2xe2 = A13.A00;
        int A06 = AbstractC25228BEl.A06(c2xe2.A0C, A13, R.attr.igds_color_shadow_on_media);
        long A0K = AbstractC25229BEm.A0K((int) typedValue.getFloat());
        Typeface create = Typeface.create("sans-serif-medium", 0);
        CharSequence charSequence = this.A05;
        long A09 = AbstractC77623dm.A09(A13);
        int A02 = A13.BoZ().A02(R.color.audio_bar_action_color_enabled);
        int i = this.A02;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, charSequence, 0);
        AbstractC25233BEq.A1B(A13, A0a, A02, A09);
        AbstractC25234BEr.A14(A13, A0a, C2Z3.A00(AbstractC25233BEq.A0i(create, A13, A0a, 0, A06), A0K), A0D);
        AbstractC25234BEr.A1G(A0a, num2, false);
        A0a.A0M(i);
        AbstractC25229BEm.A1E(A0a);
        A0a.A06(null);
        AbstractC25227BEk.A1J(A13, A0a);
        AbstractC25226BEj.A1R(A13, A0P, c51722Yv);
        return AbstractC76963ci.A07(A0P, c76223bS, A0Y, enumC77683ds, c3e8);
    }

    public C26480Bn1(Drawable drawable, EnumC77683ds enumC77683ds, CharSequence charSequence, InterfaceC16820sZ interfaceC16820sZ, float f, int i, boolean z) {
        this.A05 = charSequence;
        this.A03 = drawable;
        this.A04 = enumC77683ds;
        this.A06 = z;
        this.A01 = f;
        this.A02 = i;
        this.A00 = interfaceC16820sZ;
    }
}
