package X;

import android.graphics.drawable.Drawable;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Bnf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26520Bnf extends AbstractC51572Yf {
    public final float A00;
    public final int A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final UserSession A04;
    public final C38321qM A05;
    public final InterfaceC31137Dmc A06;
    public final float A07;
    public final C51722Yv A08;
    public final InterfaceC60442pS A09;
    public final C5E A0A;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        C51722Yv A00;
        InterfaceC51732Yw A0n;
        String str2;
        C14360o3.A0B(c76223bS, 0);
        C38321qM c38321qM = this.A05;
        ExtendedImageUrl A1q = c38321qM.A1q(AbstractC77363dM.A00(c76223bS));
        if (A1q == null) {
            return null;
        }
        C0eB c0eB = C0eB.A00;
        Object A002 = AbstractC77183d4.A00(c76223bS, new C29893DGh(19, c76223bS, this), new Object[]{c0eB});
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C75933ay c75933ay = C51722Yv.A02;
        long A09 = AbstractC25225BEi.A09(this.A07);
        Integer num = C05F.A01;
        C51722Yv A003 = C9CU.A00(null, num, 0, A09);
        long A092 = AbstractC25225BEi.A09(this.A00);
        Integer num2 = C05F.A00;
        C51722Yv A004 = C9CV.A00(C9CU.A00(A003, num2, 0, A092), C05F.A05, A002, 4);
        Integer num3 = C05F.A0N;
        C51722Yv A005 = C9CV.A00(AbstractC25233BEq.A0c(A004, num3, true), num2, C29904DGs.A00(c76223bS, this, new Object[]{c0eB}, 3), 4);
        Integer num4 = C05F.A0j;
        C51722Yv A006 = C9CV.A00(A005, num4, 2, 0);
        C120985dq c120985dq = this.A02;
        UserSession userSession = this.A04;
        InterfaceC60442pS interfaceC60442pS = this.A09;
        C51722Yv A007 = AbstractC25396BLn.A03(null, AbstractC25396BLn.A00(EnumC71343Hv.A0H, A006, null, c120985dq, userSession, interfaceC60442pS, Integer.valueOf(this.A01), false, false), userSession, interfaceC60442pS, DRT.A00(this, 30)).A00(this.A08);
        C2XE c2xe = A12.A00;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        C51722Yv A008 = C9CV.A00(null, num2, EnumC77683ds.CENTER, 3);
        C84923qg A1W = c38321qM.A1W();
        if (A1W != null && (str2 = A1W.A0e) != null) {
            A008 = C9CV.A00(A008, num3, str2, 0);
        }
        C51722Yv A009 = C9CV.A00(A008, num, AbstractC111324zv.A00(346), 0);
        float A0m = c38321qM.A0m();
        DynamicProductAdDisplayOption dynamicProductAdDisplayOption = c120985dq.A06().A07;
        if (dynamicProductAdDisplayOption != null) {
            str = dynamicProductAdDisplayOption.A00;
        } else {
            str = null;
        }
        boolean A1a = AbstractC25225BEi.A1a(str, DynamicProductAdDisplayOption.A04.toString());
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        if ((C18U.A06(A0j, userSession, 36321713789413083L) || A1a) && A0m == 1.0f) {
            A00 = C9CU.A00(null, num, 0, A092);
            A0n = AbstractC25225BEi.A0n(num2, 0, A092);
        } else {
            A00 = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
            A0n = AbstractC25225BEi.A0m(num2, 100.0f, 0);
        }
        A0P.A00(new C25622BUk(ImageView.ScaleType.FIT_CENTER, A009.A00(AbstractC25225BEi.A0h(A00, A0n)), interfaceC60442pS, A1q, null, null, null, null, this.A0A.A03(), true, true));
        A12.A00(AbstractC76963ci.A04(A0P, A12, A007));
        if (C18U.A06(A0j, userSession, 36321713790002911L)) {
            C51722Yv A0010 = C9CU.A00(AbstractC25233BEq.A0Y(AbstractC25233BEq.A0Y(AbstractC25233BEq.A0Z(C9CV.A00(null, C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), num4, 0.0d, 1), A12, num2, R.dimen.album_preview_add_item_margin, 0), A12, num, R.dimen.album_preview_add_item_margin, 0), C05F.A06, 0, AbstractC77623dm.A0B(A12));
            C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
            C51722Yv A0J = AbstractC25234BEr.A0J(C9CV.A00(null, num2, EnumC77683ds.FLEX_START, 3), A0P2, num2, num);
            long A0G = AbstractC25229BEm.A0G();
            ViewOutlineProvider viewOutlineProvider = ViewOutlineProvider.PADDED_BOUNDS;
            C14360o3.A08(viewOutlineProvider);
            C51722Yv A0h = AbstractC25225BEi.A0h(A0J, new C28945Cpt(viewOutlineProvider, A0G));
            Drawable A0N = AbstractC25228BEl.A0N(A0P2, R.drawable.instagram_link_pano_filled_24);
            AbstractC25233BEq.A10(A0N, A0P2, R.color.audio_bar_action_color_enabled);
            Drawable mutate = A0N.mutate();
            C14360o3.A07(mutate);
            AbstractC25228BEl.A1I(mutate, null, A0P2, A0h);
            A12.A00(AbstractC76963ci.A02(A0P2, A12, A0010));
        }
        return new C2WF(null, null, null, A12.A01, false);
    }

    public C26520Bnf(C51722Yv c51722Yv, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC31137Dmc interfaceC31137Dmc, C5E c5e, float f, float f2, int i) {
        AbstractC167027dH.A13(userSession, c120985dq, c37644Ghd);
        C14360o3.A0B(c5e, 5);
        AbstractC167007dF.A1I(interfaceC31137Dmc, 7, interfaceC60442pS);
        AbstractC25232BEp.A1P(c38321qM, c51722Yv);
        this.A04 = userSession;
        this.A02 = c120985dq;
        this.A03 = c37644Ghd;
        this.A07 = f;
        this.A0A = c5e;
        this.A00 = f2;
        this.A06 = interfaceC31137Dmc;
        this.A09 = interfaceC60442pS;
        this.A01 = i;
        this.A05 = c38321qM;
        this.A08 = c51722Yv;
    }
}
