package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Bn6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26485Bn6 extends AbstractC51572Yf {
    public final UserSession A00;
    public final Jn5 A01;
    public final User A02;
    public final Long A03;
    public final String A04;
    public final float A05;
    public final String A06;
    public final String A07;

    public C26485Bn6(UserSession userSession, Jn5 jn5, User user, Long l, String str, String str2, String str3, float f) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = l;
        this.A02 = user;
        this.A07 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A05 = f;
        this.A01 = jn5;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        User user = this.A02;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) AbstractC77183d4.A00(c76223bS, new C50169MDw(39, this, c76223bS), new Object[]{user, this.A07, this.A00});
        String str = (String) AbstractC77183d4.A00(c76223bS, new C50169MDw(38, this, c76223bS), new Object[]{this.A03});
        C2XE c2xe = c76223bS.A05;
        int A09 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A09(c2xe.A0C));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (str != null) {
            SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) " ");
            C14360o3.A07(append);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(A09);
            int length = append.length();
            append.append((CharSequence) str);
            append.setSpan(foregroundColorSpan, length, append.length(), 17);
        }
        if (C14360o3.A0K(user.getId(), this.A06)) {
            SpannableStringBuilder append2 = spannableStringBuilder2.append((CharSequence) " ");
            C14360o3.A07(append2);
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(A09);
            int length2 = append2.length();
            append2.append((CharSequence) AbstractC77623dm.A0F(c76223bS, 2131953766));
            append2.setSpan(foregroundColorSpan2, length2, append2.length(), 17);
        }
        EnumC115945Mk enumC115945Mk = EnumC115945Mk.WRAP;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(null, C05F.A07, 0, AbstractC25230BEn.A0L());
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        long A092 = AbstractC77623dm.A09(A0P);
        Integer num = C05F.A0N;
        long A0M = AbstractC25230BEn.A0M();
        Integer num2 = C05F.A1I;
        C51722Yv A002 = C9CU.A00(null, num2, 0, A0M);
        if (spannableStringBuilder != null) {
            A002 = C9CV.A00(A002, num, spannableStringBuilder, 0);
        }
        C51722Yv A003 = AbstractC171007jr.A00(A002, this.A05);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num3 = C05F.A00;
        C2XE c2xe2 = A0P.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, spannableStringBuilder, 0);
        AbstractC25233BEq.A1B(A0P, A0a, -16777216, A092);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(typeface, A0P, A0a, A0D);
        AbstractC25234BEr.A1F(A0a, num, num3);
        A0a.A0E();
        A0a.A0c(true);
        A0a.A0Z(false);
        A0a.A0a(false);
        AbstractC25233BEq.A1A(A0P, A003, A0a);
        long A093 = AbstractC77623dm.A09(A0P);
        C51722Yv A0V = AbstractC25233BEq.A0V(null, AbstractC25225BEi.A0n(num2, 0, A0M), num, spannableStringBuilder2, 0);
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe2, null, spannableStringBuilder2, 0);
        AbstractC25233BEq.A1B(A0P, A0a2, -16777216, A093);
        A0a2.A0S(0);
        AbstractC25234BEr.A0o(typeface, A0P, A0a2, A0D);
        AbstractC25234BEr.A1I(A0a2, num3, false);
        A0a2.A0E();
        A0a2.A0c(true);
        A0a2.A0Z(false);
        A0a2.A0a(false);
        AbstractC25233BEq.A1A(A0P, A0V, A0a2);
        return AbstractC76963ci.A0J(A0P, c76223bS, A00, null, null, null, null, enumC115945Mk, false);
    }
}
