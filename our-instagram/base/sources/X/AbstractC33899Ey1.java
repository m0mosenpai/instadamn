package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ey1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33899Ey1 {
    public static final Object A00(C6FQ c6fq) {
        AbstractC10360h2 A05 = C6BQ.A05(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        Fragment A01 = C6BQ.A01(c6fq);
        boolean A1X = AbstractC31177DnL.A1X(A0K);
        EnumC33353Eom enumC33353Eom = ((C36301Fzw) A0K.A01(C36301Fzw.class, new C50152MDf(A0K, 26))).A00;
        EnumC33353Eom enumC33353Eom2 = EnumC33353Eom.A05;
        if (enumC33353Eom == enumC33353Eom2) {
            U7K u7k = U7H.A04;
            EV5 ev5 = new EV5(AbstractC166987dD.A0O(A04), A01, A04, A05, A08, A0K, enumC33353Eom2, AbstractC166987dD.A1E(), A1X);
            AbstractC31174DnI.A1N(ev5);
            return ev5;
        }
        EnumC33353Eom enumC33353Eom3 = EnumC33353Eom.A03;
        C08790ch A00 = AbstractC018607g.A00(A01);
        if (enumC33353Eom == enumC33353Eom3) {
            new C35272Fh7(A01, A04, A05, A00, A08, A0K).A0B();
        } else {
            new C35272Fh7(A01, A04, A05, A00, A08, A0K).A0D(EnumC33353Eom.A02, A1X);
        }
        return C0eB.A00;
    }
}
