package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BlU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26385BlU extends AbstractC51572Yf {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC16820sZ A02;

    public C26385BlU(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51758Mth c51758Mth = (C51758Mth) this.A02.invoke();
        if (c51758Mth == null) {
            return null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 1.0f, 1);
        Integer num2 = C05F.A0C;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(A0d, num2, 1.0f, 1);
        String A0F = AbstractC77623dm.A0F(c76223bS, 2131957301);
        int A09 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A07(AbstractC77363dM.A00(c76223bS)));
        long A092 = AbstractC77623dm.A09(c76223bS);
        Context A00 = AbstractC77363dM.A00(c76223bS);
        Integer num3 = C05F.A00;
        Typeface create = Typeface.create("sans-serif-regular", 0);
        C14360o3.A07(create);
        Typeface A03 = AbstractC14710oj.A03(A00, create, num3);
        long A0D = AbstractC25229BEm.A0D();
        C2XE c2xe = c76223bS.A05;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0F, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A09, A092);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(A03, c76223bS, A0a, A0D);
        AbstractC25230BEn.A1M(A0a, num2, num3);
        AbstractC25230BEn.A1J(A0a, 1.33f, false);
        A0a.A0E();
        AbstractC25233BEq.A1D(A0d2, A0a, false);
        C51682Yq A0A = A0a.A0A();
        long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.account_group_management_clickable_width);
        long A07 = AbstractC77623dm.A07(c76223bS);
        Integer num4 = C05F.A0E;
        C2WH A0I = AbstractC76963ci.A0I(AbstractC25232BEp.A11(A0A, c2xe), c76223bS, AbstractC25234BEr.A0G(null, AbstractC25225BEi.A0n(num4, 0, A0D2), 0, A07));
        C2WH A0M = AbstractC76963ci.A0M(c76223bS, AbstractC25232BEp.A16(AbstractC25233BEq.A0b(AbstractC25233BEq.A0Y(null, c76223bS, num, R.dimen.ads_disclosure_footer_top_divider_height, 0), num2, 0), num3, AbstractC25225BEi.A0i(AbstractC25232BEp.A03(AbstractC77363dM.A00(c76223bS), c76223bS, R.attr.igds_color_elevated_separator))));
        Context A0E = AbstractC25225BEi.A0E(c2xe);
        String A0F2 = AbstractC77623dm.A0F(c76223bS, 2131957300);
        C27281C2g c27281C2g = new C27281C2g(c51758Mth, this, AbstractC167007dF.A09(A0E, R.attr.igds_color_primary_button));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0F2);
        AnonymousClass773.A05(A0H, c27281C2g, A0F2);
        C51722Yv A0N = AbstractC25234BEr.A0N(null, num, num2, 1.0f, 1);
        int A032 = AbstractC25232BEp.A03(A0E, c76223bS, R.attr.igds_color_primary_button);
        long A093 = AbstractC77623dm.A09(c76223bS);
        Typeface create2 = Typeface.create("sans-serif-medium", 0);
        C14360o3.A07(create2);
        Typeface A033 = AbstractC14710oj.A03(A0E, create2, num);
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, A0H, 0);
        AbstractC25233BEq.A19(c76223bS, A0a2, A032, A093);
        A0a2.A0S(0);
        AbstractC25234BEr.A0n(A033, c76223bS, A0a2, A0D);
        A0a2.A0X(num3);
        AbstractC25234BEr.A1D(A0a2, num3, 1.33f, false, true);
        C51682Yq A0g = AbstractC25230BEn.A0g(null, A0N, A0a2);
        long A0D3 = AbstractC77623dm.A0D(c76223bS, R.dimen.account_group_management_clickable_width);
        C2WH A0I2 = AbstractC76963ci.A0I(AbstractC25232BEp.A11(A0g, c2xe), c76223bS, AbstractC25234BEr.A0E(null, AbstractC25225BEi.A0n(num4, 0, A0D3), 0, AbstractC77623dm.A07(c76223bS)));
        C51722Yv A0b = AbstractC25233BEq.A0b(null, num3, 0);
        C2Z0 A0I3 = AbstractC25233BEq.A0I(A0M, A0I, c2xe);
        A0I3.A00(A0I2);
        A0I3.A00(A0M);
        return AbstractC76963ci.A01(A0I3, c76223bS, A0b);
    }
}
