package X;

import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.Bnq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26531Bnq extends AbstractC51572Yf {
    public final int A00;
    public final C51722Yv A01;
    public final MidCardClipsClickedAction A02;
    public final InterfaceC31122Dm5 A03;
    public final MidCardLayoutType A04;
    public final InterfaceC31055Dkv A05;
    public final String A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final boolean A09;
    public final int A0A;
    public final int A0B;
    public final InterfaceC11380iw A0C;
    public final ImageUrl A0D;
    public final String A0E;
    public final String A0F;
    public final HashMap A0G;
    public final C0UO A0H;

    public C26531Bnq(C51722Yv c51722Yv, MidCardClipsClickedAction midCardClipsClickedAction, InterfaceC31122Dm5 interfaceC31122Dm5, MidCardLayoutType midCardLayoutType, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, InterfaceC31055Dkv interfaceC31055Dkv, String str, String str2, String str3, HashMap hashMap, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, C0UO c0uo, int i, int i2, int i3, boolean z) {
        C14360o3.A0B(interfaceC11380iw, 1);
        AbstractC25229BEm.A1O(midCardLayoutType, 14, hashMap);
        C14360o3.A0B(str3, 17);
        this.A0C = interfaceC11380iw;
        this.A06 = str;
        this.A0H = c0uo;
        this.A0E = str2;
        this.A01 = c51722Yv;
        this.A00 = i;
        this.A0B = i2;
        this.A09 = z;
        this.A05 = interfaceC31055Dkv;
        this.A02 = midCardClipsClickedAction;
        this.A03 = interfaceC31122Dm5;
        this.A08 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A04 = midCardLayoutType;
        this.A0G = hashMap;
        this.A0A = i3;
        this.A0F = str3;
        this.A0D = imageUrl;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        MidCardLayoutType midCardLayoutType = this.A04;
        MidCardLayoutType midCardLayoutType2 = MidCardLayoutType.A04;
        int i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        if (midCardLayoutType == midCardLayoutType2) {
            i = R.dimen.account_discovery_bottom_gap;
        }
        C3e8 c3e8 = C3e8.FLEX_END;
        C51722Yv c51722Yv = this.A01;
        C75933ay c75933ay = C51722Yv.A02;
        C2XE c2xe = c76223bS.A05;
        C14360o3.A0B(c2xe, 0);
        C2WK c2wk = new C2WK();
        C2XH c2xh = c2xe.A0D;
        EnumC77763e0 enumC77763e0 = EnumC77763e0.ALL;
        if (c2xh != null) {
            c2wk.A01(enumC77763e0, 1);
            c2wk.A00(enumC77763e0, AbstractC25232BEp.A03(c2xe.A0C, c76223bS, R.attr.igds_color_photo_border));
            int i2 = this.A00;
            Arrays.fill(c2wk.A00, 0, 4, c2xh.A03(i2));
            C51722Yv A00 = c51722Yv.A00(C9CV.A00(null, C05F.A01, c2wk, 3));
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            HashMap hashMap = this.A0G;
            int i3 = this.A0A;
            String str = this.A0F;
            A0P.A00(new C26638BpZ(AbstractC25231BEo.A0Y(null, C30180DRl.A00(this, 29)).A00(c51722Yv), this.A0C, this.A0D, str, hashMap, i3, AbstractC25231BEo.A0F(A0P, i2)));
            C2XE ArD = A0P.ArD();
            C25560BRx A002 = AbstractC25559BRw.A00(ArD);
            A002.A00.A02 = c3e8;
            EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
            A002.A09(enumC77933eL);
            EnumC77763e0 enumC77763e02 = EnumC77763e0.BOTTOM;
            A002.A08(enumC77763e02, A002.A02.A00(0.0f));
            AbstractC77743dy.A00(A002, c51722Yv);
            C25560BRx A003 = AbstractC25559BRw.A00(ArD);
            A003.A09(enumC77933eL);
            A003.A08(enumC77763e02, A003.A02.A00(0.0f));
            A003.A04();
            ((AbstractC77733dx) A003).A00.A0a().A08(39.0f);
            A003.A0A(AbstractC25234BEr.A0V(c51722Yv, AbstractC25231BEo.A0F(A0P, i2)));
            A002.A0A(A003.A00);
            A0P.A00(A002.A00);
            Integer num = C05F.A00;
            C51722Yv A004 = C9CV.A00(AbstractC25230BEn.A0d(null, num, 100.0f, 0), C05F.A0Y, enumC77933eL, 3);
            C2Z0 A13 = AbstractC25232BEp.A13(A0P);
            C0UO c0uo = this.A0H;
            if (c0uo != null) {
                C51722Yv A0D = AbstractC25234BEr.A0D(null, AbstractC25227BEk.A0Y(0, AbstractC77623dm.A0D(A13, i)), 0, AbstractC77623dm.A04(A13));
                C2Z0 A132 = AbstractC25232BEp.A13(A13);
                AbstractC25231BEo.A19(new BVK(AbstractC25230BEn.A0d(null, num, 100.0f, 0), this.A07, c0uo, R.drawable.clips_viewer_multi_media_card_cta_background, AbstractC53242c7.A0E(A132.A00.A0C), this.A0B, 104), A132, A13, A0D);
            }
            String str2 = this.A0E;
            if (str2 != null) {
                EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
                C51722Yv A0D2 = AbstractC25234BEr.A0D(null, AbstractC25227BEk.A0Y(0, AbstractC77623dm.A0D(A13, i)), 0, AbstractC77623dm.A0D(A13, i));
                C2Z0 A133 = AbstractC25232BEp.A13(A13);
                C2XE c2xe2 = A133.A00;
                int A0A = AbstractC25230BEn.A0A(c2xe2, A133);
                long A07 = AbstractC77623dm.A07(A133);
                int A02 = A133.BoZ().A02(R.color.black_30_transparent);
                long A0D3 = AbstractC77623dm.A0D(A133, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                Typeface typeface = Typeface.DEFAULT;
                long A0D4 = AbstractC25229BEm.A0D();
                C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, str2, 0);
                AbstractC25233BEq.A1B(A133, A0a, A0A, A07);
                AbstractC25234BEr.A14(A133, A0a, C2Z3.A00(AbstractC25233BEq.A0i(typeface, A133, A0a, 0, A02), A0D3), A0D4);
                AbstractC25234BEr.A1I(A0a, num, false);
                A0a.A0M(1);
                AbstractC25234BEr.A15(A133, A0a, false);
                A13.A00(AbstractC76963ci.A07(A133, A13, A0D2, enumC77683ds, null));
            }
            AbstractC25227BEk.A1H(A13, A0P, A004);
            return AbstractC76963ci.A08(A0P, c76223bS, A00, c3e8);
        }
        throw AbstractC166987dD.A14("This builder has already been disposed / built!");
    }
}
