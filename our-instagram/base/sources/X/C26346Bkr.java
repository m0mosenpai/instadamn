package X;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

/* renamed from: X.Bkr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26346Bkr extends AbstractC51572Yf {
    public final UserSession A00;
    public final ContentNoteMetadata A01;
    public final Integer A02;

    public C26346Bkr(UserSession userSession, ContentNoteMetadata contentNoteMetadata, Integer num) {
        C14360o3.A0B(num, 2);
        this.A00 = userSession;
        this.A02 = num;
        this.A01 = contentNoteMetadata;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C45122Jxr c45122Jxr;
        String A0G;
        Number number;
        C14360o3.A0B(c76223bS, 0);
        Integer num = this.A02;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                c45122Jxr = null;
            } else {
                c45122Jxr = new C45122Jxr(AbstractC25225BEi.A0p(AbstractC25230BEn.A0K()), Integer.valueOf(R.drawable.instagram_reply_pano_outline_24), Integer.valueOf(R.attr.igds_color_primary_text_on_media), (Object) null, 2131956703, 4);
            }
        } else {
            c45122Jxr = new C45122Jxr((C2Z3) null, (Integer) null, (Integer) null, "❤", 2131956702, 26);
        }
        if (c45122Jxr == null) {
            return null;
        }
        C89813zN A00 = AbstractC51432Xq.A00(AbstractC51432Xq.A04, "fade_in_transition_key");
        A00.A02(AbstractC25230BEn.A02(A00, AbstractC79463gt.A00));
        AbstractC25226BEj.A1S(A00, 200);
        AbstractC89903zW.A00(c76223bS, A00);
        C75933ay c75933ay = C51722Yv.A02;
        C2XE c2xe = c76223bS.A05;
        C51722Yv A0R = AbstractC25233BEq.A0R(AbstractC25231BEo.A0W(c2xe, null, EnumC76913cd.LOCAL, "fade_in_transition_key"), AbstractC25227BEk.A0Y(0, AbstractC25229BEm.A0J()), 0, AbstractC25229BEm.A0B());
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        Integer num2 = C05F.A00;
        C51722Yv A15 = AbstractC25232BEp.A15(A0R, num2, enumC77683ds);
        C50260MHp c50260MHp = new C50260MHp(this, 2);
        Integer num3 = C05F.A0C;
        C51722Yv A0e = AbstractC25230BEn.A0e(A15, num3, c50260MHp, null);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        TypedValue typedValue = new TypedValue();
        C2XE c2xe2 = A0P.A00;
        Context context = c2xe2.A0C;
        context.getResources().getValue(R.dimen.clips_viewer_social_context_shadow_radius, typedValue, true);
        C51722Yv c51722Yv = c75933ay;
        C2Z3 c2z3 = (C2Z3) c45122Jxr.A05;
        if (c2z3 != null) {
            c51722Yv = C9CU.A00(null, C05F.A1F, 0, c2z3.A00);
        }
        C9CU A0n = AbstractC25225BEi.A0n(C05F.A0N, 0, Double.doubleToRawLongBits(90.0d));
        if (c51722Yv == c75933ay) {
            c51722Yv = null;
        }
        C51722Yv A16 = AbstractC25232BEp.A16(AbstractC25225BEi.A0h(c51722Yv, A0n), num2, AbstractC25225BEi.A0i(AbstractC25228BEl.A06(context, A0P, R.attr.igds_color_transparent)));
        Object obj = c45122Jxr.A01;
        int i = c45122Jxr.A03;
        if (obj == null) {
            A0G = AbstractC77623dm.A0F(A0P, i);
        } else {
            A0G = AbstractC77623dm.A0G(A0P, obj, i);
        }
        int A04 = AbstractC25228BEl.A04(context, A0P);
        Integer num4 = C05F.A01;
        long A0r = AbstractC25232BEp.A0r(10.0f);
        Typeface A01 = AbstractC14710oj.A01(context);
        int A06 = AbstractC25228BEl.A06(context, A0P, R.attr.igds_color_shadow_on_media);
        long A0K = AbstractC25229BEm.A0K((int) typedValue.getFloat());
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, A0G, 0);
        AbstractC25233BEq.A1B(A0P, A0a, A04, A0r);
        AbstractC25234BEr.A14(A0P, A0a, C2Z3.A00(AbstractC25233BEq.A0i(A01, A0P, A0a, 0, A06), A0K), A0D);
        AbstractC25234BEr.A1F(A0a, num3, num4);
        A0a.A0E();
        A0a.A0c(false);
        A0a.A0Z(false);
        A0a.A0a(false);
        AbstractC25233BEq.A1A(A0P, A16, A0a);
        Number number2 = (Number) c45122Jxr.A04;
        if (number2 != null && (number = (Number) c45122Jxr.A00) != null) {
            A0P.A00(new C85463rb(ImageView.ScaleType.CENTER_INSIDE, AbstractC25234BEr.A0J(null, A0P, num2, num4), null, number2.intValue(), AbstractC25228BEl.A06(context, A0P, number.intValue())));
        }
        return AbstractC76963ci.A0H(A0P, c76223bS, A0e);
    }
}
