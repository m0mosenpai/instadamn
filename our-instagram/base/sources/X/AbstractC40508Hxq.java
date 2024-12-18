package X;

import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Hxq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40508Hxq {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        AbstractC25225BEi.A1S(A01);
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
        Object A03 = c6fw.A03(3);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) A03;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("highlight:%s", A01);
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        C14360o3.A0C(A0A, AbstractC111324zv.A00(6));
        UserSession userSession = (UserSession) A0A;
        Fragment A012 = C6BQ.A01(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C6BQ.A04(c6fq);
        Reel A0M = C1OU.A04(userSession).A0M(formatStrLocaleSafe);
        if (A0M != null) {
            C6BQ.A0K(c6fq, new C64475TFl(3, interfaceC103384lE, A0M, c6fq));
            C38C c38c = new C38C(A012, 1005);
            if (c38c.getContext() != null) {
                RectF rectF = new RectF(AbstractC13880nE.A0A(r4) / 2, AbstractC13880nE.A09(r4) / 2, AbstractC13880nE.A0A(r4) / 2, AbstractC13880nE.A09(r4) / 2);
                C38E c38e = new C38E(C6BQ.A07(c6fg), userSession, c38c);
                C31559Dtj c31559Dtj = new C31559Dtj(A04, rectF, (InterfaceC63982vJ) null, C05F.A01);
                c38e.A0C = AbstractC166997dE.A0n();
                c38e.A05 = c31559Dtj;
                c38e.A04(A0M, C3G2.A0J, null);
                return null;
            }
            throw AbstractC166997dE.A0g();
        }
        return null;
    }
}
