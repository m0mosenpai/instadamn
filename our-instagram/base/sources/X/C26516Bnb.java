package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bnb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26516Bnb extends AbstractC51572Yf {
    public final int A00;
    public final C51722Yv A01;
    public final UserSession A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final InterfaceC16620sF A07;
    public final InterfaceC16620sF A08;
    public final boolean A09;
    public final List A0A;

    public C26516Bnb(C51722Yv c51722Yv, UserSession userSession, Integer num, String str, String str2, String str3, List list, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, boolean z) {
        AbstractC25233BEq.A0x(3, c51722Yv, interfaceC16620sF, interfaceC16620sF2);
        C14360o3.A0B(str2, 6);
        this.A04 = str;
        this.A0A = list;
        this.A01 = c51722Yv;
        this.A07 = interfaceC16620sF;
        this.A08 = interfaceC16620sF2;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = num;
        this.A00 = i;
        this.A02 = userSession;
        this.A09 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.2Yv] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int A06;
        int i;
        ShapeDrawable shapeDrawable;
        Paint paint;
        int i2;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C29825DDr.A00);
        AbstractC89903zW.A00(c76223bS, new C51452Xs(AbstractC25233BEq.A0f(AbstractC51432Xq.A04, "end_scene_multiple_choice_cta_button"), C8S8.DEFAULT_SWIPE_ANIMATION_DURATION));
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 100.0f, 0));
        long A0B = AbstractC77623dm.A0B(c76223bS);
        C51722Yv A002 = C9CU.A00(A0h, C05F.A04, 0, AbstractC77623dm.A04(c76223bS));
        Integer num2 = C05F.A15;
        C51722Yv A003 = C9CU.A00(A002, num2, 0, A0B);
        DPA dpa = DPA.A00;
        Integer num3 = C05F.A1F;
        C51722Yv A15 = AbstractC25232BEp.A15(AbstractC25232BEp.A16(A003, num3, dpa), num, EnumC77683ds.STRETCH);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            Object obj = A00.A03;
            boolean A0K = C14360o3.A0K(obj, A1B);
            int i3 = R.drawable.sponsored_viewer_end_scene_multiple_choice_option_background;
            if (A0K) {
                i3 = R.drawable.sponsored_viewer_end_scene_multiple_choice_cta_background;
            }
            Drawable A0E = AbstractC77623dm.A0E(A12, i3);
            C2XE ArD = A12.ArD();
            C51722Yv A0T = AbstractC25233BEq.A0T(C9CV.A00(C9CU.A00(null, C05F.A0F, 0, AbstractC77623dm.A0B(A12)), num2, AbstractC77623dm.A0E(A12, AbstractC53242c7.A0H(ArD.A0C, android.R.attr.selectableItemBackground)), 4), AbstractC25225BEi.A0o(num, A0E, 4), num, 100.0f, 0);
            boolean A0K2 = C14360o3.A0K(obj, A1B);
            Integer num4 = C05F.A06;
            C51722Yv A004 = C9CV.A00(AbstractC25233BEq.A0c(A0T, num4, A0K2), num3, new MI7(this, A00, A1B, 39), 4);
            C2Z0 A0P = AbstractC167007dF.A0P(ArD);
            C51722Yv A005 = C9CU.A00(null, num4, 0, AbstractC77623dm.A07(A0P));
            boolean A0K3 = C14360o3.A0K(obj, A1B);
            C2XE c2xe = A0P.A00;
            Context context = c2xe.A0C;
            int i4 = R.attr.igds_color_primary_text_on_media;
            if (A0K3) {
                i4 = R.attr.igds_color_text_on_white;
            }
            int A062 = AbstractC25228BEl.A06(context, A0P, i4);
            long A0D = AbstractC77623dm.A0D(A0P, R.dimen.account_group_management_row_text_size);
            Integer num5 = this.A03;
            if (num5 != null) {
                i2 = num5.intValue();
            } else {
                i2 = Integer.MAX_VALUE;
            }
            Typeface typeface = Typeface.DEFAULT;
            long A0D2 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A1B, 0);
            AbstractC25233BEq.A1B(A0P, A0a, A062, A0D);
            A0a.A0S(1);
            AbstractC25234BEr.A0o(typeface, A0P, A0a, A0D2);
            AbstractC25234BEr.A1G(A0a, num, false);
            A0a.A0M(i2);
            AbstractC25233BEq.A1D(A005, A0a, false);
            AbstractC25227BEk.A1J(A0P, A0a);
            AbstractC25227BEk.A1I(A0P, A12, A004);
        }
        C2XE ArD2 = A12.ArD();
        Context context2 = ArD2.A0C;
        Drawable A0E2 = AbstractC77623dm.A0E(A12, AbstractC53242c7.A0H(context2, android.R.attr.selectableItemBackgroundBorderless));
        String str = this.A04;
        if (str != null) {
            A06 = Color.parseColor(str);
            i = R.attr.igds_color_primary_text_on_media;
        } else {
            A06 = AbstractC25228BEl.A06(context2, A12, R.attr.igds_color_primary_button_on_media);
            i = R.attr.igds_color_text_on_white;
        }
        Drawable A0E3 = AbstractC77623dm.A0E(A12, R.drawable.sponsored_viewer_end_scene_multiple_choice_cta_background);
        if (A0E3 instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) A0E3;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(A06);
            }
        } else if ((A0E3 instanceof ShapeDrawable) && (shapeDrawable = (ShapeDrawable) A0E3) != null && (paint = shapeDrawable.getPaint()) != null) {
            paint.setColor(A06);
        }
        C51722Yv A0W = AbstractC25231BEo.A0W(ArD2, null, EnumC76913cd.LOCAL, "end_scene_multiple_choice_cta_button");
        float f = 0.0f;
        if (((CharSequence) A00.A03).length() > 0) {
            f = 1.0f;
        }
        C51722Yv A006 = AbstractC171007jr.A00(A0W, f);
        C2Z0 A0P2 = AbstractC167007dF.A0P(ArD2);
        ?? r14 = this.A01;
        C75933ay c75933ay2 = r14;
        C9CU A0m = AbstractC25226BEj.A0m(0, AbstractC77623dm.A0B(A0P2));
        C51722Yv c51722Yv = r14;
        if (r14 == c75933ay) {
            c51722Yv = null;
        }
        C51722Yv A007 = C9CV.A00(AbstractC25233BEq.A0T(AbstractC25225BEi.A0h(c51722Yv, A0m), AbstractC25225BEi.A0n(C05F.A1I, 0, AbstractC25225BEi.A0A(this.A00)), num, 100.0f, 0), num3, new C57751Pje(13, A00, this), 4);
        C2XE c2xe2 = A0P2.A00;
        C2Z0 A0P3 = AbstractC167007dF.A0P(c2xe2);
        C9CV A0o = AbstractC25225BEi.A0o(num2, A0E2, 4);
        if (c75933ay2 == c75933ay) {
            c75933ay2 = null;
        }
        C51722Yv A008 = C9CV.A00(AbstractC25233BEq.A0T(AbstractC25225BEi.A0h(c75933ay2, A0o), AbstractC25225BEi.A0o(num, A0E3, 4), num, 100.0f, 0), num3, new C57751Pje(14, A00, this), 4);
        C2Z0 A13 = AbstractC25232BEp.A13(A0P3);
        C51722Yv A009 = C9CU.A00(null, C05F.A06, 0, AbstractC77623dm.A07(A13));
        String str2 = this.A05;
        C2XE c2xe3 = A13.A00;
        int A063 = AbstractC25228BEl.A06(c2xe3.A0C, A13, i);
        long A0D3 = AbstractC77623dm.A0D(A13, R.dimen.account_group_management_row_text_size);
        Typeface typeface2 = Typeface.DEFAULT;
        long A0D4 = AbstractC25229BEm.A0D();
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe3, null, str2, 0);
        AbstractC25233BEq.A1B(A13, A0a2, A063, A0D3);
        A0a2.A0S(1);
        AbstractC25234BEr.A0o(typeface2, A13, A0a2, A0D4);
        A0a2.A0B();
        AbstractC25234BEr.A1J(A0a2, num, false, true);
        AbstractC77743dy.A00(A0a2, A009);
        AbstractC25227BEk.A1J(A13, A0a2);
        AbstractC25231BEo.A1A(AbstractC76963ci.A0F(A13, A0P3, A008), A0P3, A0P2, A007);
        String str3 = this.A06;
        if (str3 != null) {
            UserSession userSession = this.A02;
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36320708766475075L)) {
                C51722Yv A0010 = C9CU.A00(null, C05F.A05, 0, AbstractC77623dm.A06(A0P2));
                int A0A = AbstractC25230BEn.A0A(c2xe2, A0P2);
                long A09 = AbstractC77623dm.A09(A0P2);
                C77723dw A0a3 = AbstractC25231BEo.A0a(c2xe2, null, str3, 0);
                AbstractC25233BEq.A1B(A0P2, A0a3, A0A, A09);
                A0a3.A0S(0);
                AbstractC25234BEr.A0o(typeface2, A0P2, A0a3, A0D4);
                A0a3.A0B();
                AbstractC25234BEr.A1B(A0a3, num);
                A0a3.A0E();
                AbstractC25233BEq.A1D(A0010, A0a3, false);
                AbstractC25227BEk.A1J(A0P2, A0a3);
            }
        }
        AbstractC25227BEk.A1H(A0P2, A12, A006);
        return AbstractC76963ci.A04(A12, c76223bS, A15);
    }
}
