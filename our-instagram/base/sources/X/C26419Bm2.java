package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

/* renamed from: X.Bm2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26419Bm2 extends AbstractC51572Yf {
    public final int A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC11380iw A02;
    public final InterfaceC30888Di1 A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Drawable A00;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30888Di1 interfaceC30888Di1 = this.A03;
        if (interfaceC30888Di1 instanceof D0R) {
            return null;
        }
        if (interfaceC30888Di1 instanceof C26253BjM) {
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A002 = C9CU.A00(null, C05F.A0E, 0, AbstractC77623dm.A04(c76223bS));
            C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
            int A08 = AbstractC25228BEl.A08(A12, AbstractC77623dm.A07(A12));
            C26253BjM c26253BjM = (C26253BjM) interfaceC30888Di1;
            ImageUrl imageUrl = c26253BjM.A00;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            float f = A08;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            int A05 = AbstractC25233BEq.A05(A12);
            C2XE c2xe = A12.A00;
            C2WK c2wk = new C2WK();
            C2XH c2xh = c2xe.A0D;
            EnumC77763e0 enumC77763e0 = EnumC77763e0.ALL;
            if (c2xh != null) {
                c2wk.A01(enumC77763e0, c2xh.A00(0.5f));
                Arrays.fill(c2wk.A00, 0, 4, f);
                Context context = c2xe.A0C;
                c2wk.A00(enumC77763e0, AbstractC25228BEl.A06(context, A12, R.attr.igds_color_photo_border));
                Integer num = C05F.A01;
                C51722Yv A15 = AbstractC25232BEp.A15(null, num, c2wk);
                long A0D = AbstractC77623dm.A0D(A12, R.dimen.appreciation_reels_grid_item_width);
                Integer num2 = C05F.A00;
                C51722Yv A0Y = AbstractC25233BEq.A0Y(C9CU.A00(A15, num2, 0, A0D), A12, num, R.dimen.appreciation_reels_grid_item_width, 0);
                C30180DRl A003 = C30180DRl.A00(this, 27);
                Integer num3 = C05F.A1F;
                A12.A00(new C26645Bpg(scaleType, C9CV.A00(A0Y, num3, A003, 4), interfaceC11380iw, imageUrl, f, A05, 0, false, false));
                String str = c26253BjM.A02;
                boolean z = c26253BjM.A03;
                long A07 = AbstractC77623dm.A07(A12);
                Integer num4 = C05F.A08;
                C51722Yv A004 = C9CV.A00(C9CU.A00(null, num4, 0, A07), num3, C30180DRl.A00(this, 26), 4);
                C2Z0 A0K = AbstractC25233BEq.A0K(A12);
                C51722Yv A005 = C9CU.A00(C9CU.A00(null, C05F.A05, 0, AbstractC77623dm.A0D(A0K, R.dimen.accent_edge_thickness)), C05F.A03, 0, AbstractC77623dm.A06(A0K));
                C2Z0 A0K2 = AbstractC25233BEq.A0K(A0K);
                Context A006 = AbstractC77363dM.A00(A0K2);
                if (z) {
                    A00 = C92594Ct.A00(A006, num2, R.drawable.instagram_music_pano_filled_12);
                } else {
                    A00 = C92594Ct.A00(A006, num2, R.drawable.clips_trending_arrow);
                }
                AbstractC25231BEo.A1A(new BNU(A00, ImageView.ScaleType.CENTER_INSIDE, null, false), A0K2, A0K, A005);
                int i = this.A00;
                long A0D2 = AbstractC77623dm.A0D(A0K, i);
                C2XE c2xe2 = A0K.A00;
                int A0A = AbstractC25230BEn.A0A(c2xe2, A0K);
                Typeface typeface = Typeface.DEFAULT;
                long A0D3 = AbstractC25229BEm.A0D();
                C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, str, R.style.igds_emphasized_body_1);
                AbstractC25233BEq.A1B(A0K, A0a, A0A, A0D2);
                A0a.A0S(1);
                AbstractC25234BEr.A0o(typeface, A0K, A0a, A0D3);
                AbstractC25230BEn.A1L(A0a, num2);
                AbstractC25230BEn.A1J(A0a, 1.28f, false);
                A0a.A0E();
                AbstractC25234BEr.A15(A0K, A0a, false);
                A12.A00(AbstractC76963ci.A0D(A0K, A12, A004));
                String str2 = c26253BjM.A01;
                C51722Yv A007 = C9CV.A00(C9CU.A00(null, num4, 0, AbstractC77623dm.A08(A12)), num3, C30180DRl.A00(this, 28), 4);
                int A06 = AbstractC25228BEl.A06(context, A12, R.attr.igds_color_secondary_text_on_media);
                long A0D4 = AbstractC77623dm.A0D(A12, i);
                C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, str2, R.style.igds_body_1);
                AbstractC25233BEq.A1B(A12, A0a2, A06, A0D4);
                A0a2.A0S(0);
                AbstractC25234BEr.A0o(typeface, A12, A0a2, A0D3);
                A0a2.A0B();
                AbstractC25234BEr.A1D(A0a2, num2, 1.28f, false, true);
                AbstractC25233BEq.A1A(A12, A007, A0a2);
                return AbstractC76963ci.A05(A12, c76223bS, A002);
            }
            throw AbstractC166987dD.A14("This builder has already been disposed / built!");
        }
        throw B4Z.A00();
    }

    public C26419Bm2(InterfaceC11380iw interfaceC11380iw, InterfaceC30888Di1 interfaceC30888Di1, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A02 = interfaceC11380iw;
        this.A03 = interfaceC30888Di1;
        this.A00 = R.dimen.action_bar_item_spacing_right;
        this.A01 = interfaceC16820sZ;
    }
}
