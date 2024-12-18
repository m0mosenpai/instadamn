package X;

import android.os.Build;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.themes.domain.AiThemesViewModel$onExamplePromptClicked$1;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.Iterator;

/* renamed from: X.BcR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25870BcR extends AbstractC52922bZ {
    public int A00;
    public C51737MtK A01;
    public C49496Lu9 A02;
    public CQQ A03;
    public String A04;
    public Iterator A05;
    public AnonymousClass195 A06;
    public boolean A07;
    public AnonymousClass195 A08;
    public final InterfaceC74953Yl A09;
    public final C92694De A0A;
    public final C68079V9k A0B;
    public final C28162Cb9 A0C;
    public final C28457Ch7 A0D;
    public final C28183CbV A0E;
    public final C23031Ai A0F;
    public final InterfaceC19390xP A0G;
    public final InterfaceC19390xP A0H;
    public final C05A A0I;
    public final C0UO A0J;
    public final boolean A0K;
    public final UserSession A0L;

    public C25870BcR(UserSession userSession, C68079V9k c68079V9k, C28162Cb9 c28162Cb9, C28457Ch7 c28457Ch7, C23031Ai c23031Ai, boolean z) {
        Iterator it;
        int A08 = AbstractC25230BEn.A08(3, c23031Ai, c28457Ch7);
        C14360o3.A0B(c28162Cb9, 5);
        this.A0B = c68079V9k;
        this.A0K = z;
        this.A0F = c23031Ai;
        this.A0D = c28457Ch7;
        this.A0C = c28162Cb9;
        this.A0L = userSession;
        EnumC27394C6x enumC27394C6x = EnumC27394C6x.A04;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C26071Bg0(enumC27394C6x, null, c16930sl, 0.0f, true));
        this.A0I = A1H;
        UserSession userSession2 = c28162Cb9.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        double A00 = C18U.A00(c06090Tz, userSession2, 37170227527746055L);
        C28183CbV c28183CbV = new C28183CbV(C18U.A06(c06090Tz, userSession, 36326610052003833L), C18U.A06(c06090Tz, userSession, 36326610052069370L));
        this.A0E = c28183CbV;
        this.A0J = AbstractC208910l.A02(A1H);
        this.A09 = AbstractC25230BEn.A0U(AbstractC25227BEk.A0S(""));
        this.A07 = c23031Ai.A01.getBoolean(MSV.A00(1222), false);
        this.A04 = "";
        C36G c36g = C36G.A09;
        this.A0H = new MWG(18, this, new AnonymousClass058(new C50123MBx(null, C29759DBd.A00, 0L, C36H.A03(c36g, 5))));
        this.A05 = c16930sl.iterator();
        this.A0G = new MWG(19, this, new AnonymousClass058(new C50123MBx(null, new C57242PbQ(this, 3), 0L, C36H.A02(c36g, A00))));
        this.A00 = AbstractC50712Us.A01.A05(A08);
        this.A0A = AbstractC166177bl.A00(MZG.A00);
        if (c28183CbV.A00.hasNext()) {
            it = c28183CbV.A00;
        } else {
            it = c28183CbV.A01.iterator();
            c28183CbV.A00 = it;
        }
        this.A01 = (C51737MtK) it.next();
    }

    public static final String A00(C25870BcR c25870BcR) {
        return new C11L("\\s+").A00(AbstractC25228BEl.A1A(AbstractC25230BEn.A0p(c25870BcR.A09)), " ");
    }

    public final String A01() {
        DirectThreadThemeInfo directThreadThemeInfo;
        C0UO c0uo = this.A0J;
        Integer num = ((C26071Bg0) c0uo.getValue()).A02;
        if (num != null && (directThreadThemeInfo = (DirectThreadThemeInfo) C26071Bg0.A00(num, c0uo).A01) != null) {
            return directThreadThemeInfo.A0o;
        }
        return null;
    }

    public final void A02(View view, C51737MtK c51737MtK) {
        boolean A1a = AbstractC167017dG.A1a(c51737MtK, view);
        if (Build.VERSION.SDK_INT >= 30) {
            if (C18U.A06(C06090Tz.A05, this.A0C.A00, 36326610051610612L)) {
                view.performHapticFeedback(A1a ? 1 : 0);
            }
        }
        String A0p = AbstractC166997dE.A0p(view.getContext(), c51737MtK.A01);
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A08);
        this.A08 = AbstractC25226BEj.A1L(new AiThemesViewModel$onExamplePromptClicked$1(this, A0p, A0s), AbstractC141776au.A00(this));
    }
}
