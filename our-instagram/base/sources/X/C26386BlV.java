package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.BlV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26386BlV extends AbstractC51572Yf {
    public final C167297di A00;
    public final C25814BbV A01;
    public final InterfaceC60442pS A02;
    public final User A03;

    public C26386BlV(C167297di c167297di, C25814BbV c25814BbV, InterfaceC60442pS interfaceC60442pS, User user) {
        AbstractC167007dF.A1F(c25814BbV, 3, interfaceC60442pS);
        this.A03 = user;
        this.A00 = c167297di;
        this.A01 = c25814BbV;
        this.A02 = interfaceC60442pS;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) AbstractC77183d4.A00(c76223bS, C29899DGn.A00(c76223bS, this, 1), new Object[]{this.A00});
        C75933ay c75933ay = C51722Yv.A02;
        long A07 = AbstractC77623dm.A07(c76223bS);
        long A072 = AbstractC77623dm.A07(c76223bS);
        long A073 = AbstractC77623dm.A07(c76223bS);
        C51722Yv A00 = C9CU.A00(null, C05F.A15, 0, A072);
        Integer num = C05F.A1F;
        C51722Yv A16 = AbstractC25232BEp.A16(AbstractC25234BEr.A0D(A00, AbstractC25225BEi.A0n(num, 0, A07), 0, A073), num, C30185DRq.A02(this, 3));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        long A0D = AbstractC77623dm.A0D(A12, R.dimen.add_account_icon_circle_radius);
        Integer num2 = C05F.A00;
        C51722Yv A0X = AbstractC25233BEq.A0X(C9CU.A00(null, num2, 0, A0D), A12, R.dimen.add_account_icon_circle_radius);
        String A0F = AbstractC77623dm.A0F(A12, 2131970234);
        Integer num3 = C05F.A0N;
        C51722Yv A002 = C9CU.A00(C9CV.A00(A0X, num3, A0F, 0), C05F.A09, 0, AbstractC77623dm.A0D(A12, R.dimen.abc_edit_text_inset_top_material));
        Integer num4 = C05F.A0C;
        C51722Yv A0d = AbstractC25230BEn.A0d(A002, num4, 0.0f, 1);
        ImageUrl Bhu = this.A03.Bhu();
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C2XE c2xe = A12.A00;
        Context context = c2xe.A0C;
        A12.A00(new C77973eP(A0d, interfaceC60442pS, Bhu, null, A12.BoZ().A02(AbstractC53242c7.A04(context)), 0, -16777216, false, true, false));
        int A074 = AbstractC25229BEm.A07(context, A12);
        long A05 = AbstractC77623dm.A05(A12);
        Typeface A0Q = AbstractC25226BEj.A0Q(context, num2);
        C51722Yv A0I = AbstractC25234BEr.A0I(null, AbstractC25225BEi.A0m(num4, 0.0f, 1), num2, 3);
        long A0D2 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, spannableStringBuilder, 0);
        AbstractC25233BEq.A1B(A12, A0a, A074, A05);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(A0Q, A12, A0a, A0D2);
        A0a.A0X(num3);
        AbstractC25234BEr.A1E(A0a, num2, 0, true);
        AbstractC25233BEq.A1D(A0I, A0a, false);
        AbstractC25227BEk.A1J(A12, A0a);
        return AbstractC76963ci.A0I(A12, c76223bS, A16);
    }
}
