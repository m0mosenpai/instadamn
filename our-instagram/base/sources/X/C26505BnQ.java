package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BnQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26505BnQ extends AbstractC51572Yf {
    public final InterfaceC30988Djn A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final InterfaceC31137Dmc A03;
    public final C675432t A04;
    public final UserSession A05;
    public final C38321qM A06;
    public final InterfaceC60442pS A07;
    public final C75113Zb A08;

    public C26505BnQ(InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC31137Dmc interfaceC31137Dmc) {
        AbstractC167007dF.A1H(c37644Ghd, 2, interfaceC31137Dmc);
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A05 = userSession;
        this.A06 = c38321qM;
        this.A07 = interfaceC60442pS;
        this.A08 = c75113Zb;
        this.A03 = interfaceC31137Dmc;
        this.A00 = interfaceC30988Djn;
        this.A04 = new C675432t(userSession, interfaceC60442pS, null);
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C84923qg c84923qg;
        User user;
        C85413rW c85413rW;
        C14360o3.A0B(c76223bS, 0);
        C38321qM c38321qM = this.A06;
        List A3n = c38321qM.A3n();
        if (A3n == null || (c84923qg = (C84923qg) AbstractC001800i.A0J(A3n)) == null || (user = c84923qg.A08) == null) {
            return null;
        }
        C57342k9 c57342k9 = C57332k8.A0m;
        Context A00 = AbstractC77363dM.A00(c76223bS);
        UserSession userSession = this.A05;
        C57332k8 A002 = c57342k9.A00(A00, userSession);
        C14360o3.A0B(userSession, 0);
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36329204211662992L);
        c84923qg.A01(c38321qM);
        this.A08.A2M = true;
        C2XE c2xe = c76223bS.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        C14360o3.A0B(c2xe, 1);
        C120985dq c120985dq = this.A01;
        C37644Ghd c37644Ghd = this.A02;
        DRY A003 = DRY.A00(this, c84923qg, 44);
        LruCache lruCache = A002.A0A;
        CharSequence charSequence = (CharSequence) lruCache.get(c38321qM);
        if (charSequence == null) {
            UserSession userSession2 = A002.A0J;
            C14360o3.A0B(userSession2, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            User user2 = c84923qg.A08;
            if (user2 != null) {
                spannableStringBuilder.append((CharSequence) AnonymousClass001.A0E(user2.getUsername(), '@', ' '));
            }
            spannableStringBuilder.append((CharSequence) c84923qg.A0e);
            C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession2);
            c85383rT.A0L = true;
            c85383rT.A01 = -1;
            c85383rT.A0Q = true;
            if (A06) {
                c85413rW = new C85413rW(userSession2, c38321qM, false);
            } else {
                c85413rW = null;
            }
            c85383rT.A02(c85413rW);
            c85383rT.A03(new C29297Cvs(c38321qM, A003, A06));
            charSequence = c85383rT.A00();
            C14360o3.A07(charSequence);
            lruCache.put(c38321qM, charSequence);
        }
        A1E.add(new BQI(A002.A0B(AbstractC25225BEi.A0E(c2xe), c38321qM, this.A07.getModuleName(), AbstractC166987dD.A1J(AbstractC101524hN.A00(user))), null, c120985dq, c37644Ghd, userSession, charSequence, null, "inline_comment_text", "inline_comment_profile_pictures", "clips_inline_comment_text_component", c38321qM.BqK(), new BQB(34, this, c84923qg, A06), 1, false, true, false));
        InterfaceC30988Djn interfaceC30988Djn = this.A00;
        if (interfaceC30988Djn != null) {
            C75933ay c75933ay = C51722Yv.A02;
            A1E.add(new C25636BUy(AbstractC25234BEr.A0K(AbstractC25230BEn.A0d(null, C05F.A00, 100.0f, 0), C05F.A01, 0), interfaceC30988Djn, c120985dq, c37644Ghd));
        }
        return new C2WH(null, null, null, null, null, A1E, false);
    }
}
