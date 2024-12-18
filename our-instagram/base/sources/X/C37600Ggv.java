package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

/* renamed from: X.Ggv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37600Ggv implements AnonymousClass388 {
    public final FragmentActivity A00;
    public final AbstractC59962oe A01;
    public final C25671My A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C1M1 A05;
    public final ILW A06;
    public final SearchContext A07;
    public final String A08;
    public final String A09;

    public C37600Ggv(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, SearchContext searchContext, C1M1 c1m1, ILW ilw, String str, String str2) {
        AbstractC25234BEr.A0j(2, ilw, c1m1, interfaceC60442pS, userSession);
        this.A01 = abstractC59962oe;
        this.A06 = ilw;
        this.A05 = c1m1;
        this.A04 = interfaceC60442pS;
        this.A03 = userSession;
        this.A07 = searchContext;
        this.A08 = str;
        this.A09 = str2;
        this.A00 = abstractC59962oe.requireActivity();
        this.A02 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.AnonymousClass375
    public final InterfaceC37202GaD CCt() {
        return new C42819Iwv(this, 2);
    }

    @Override // X.AnonymousClass388
    public final void Di3(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC37202GaD interfaceC37202GaD, int i) {
        List B0S;
        EffectPreviewIntf effectPreviewIntf;
        C14360o3.A0B(c38321qM, 0);
        AbstractC167017dG.A1Q(c75113Zb, interfaceC37202GaD);
        UserSession userSession = this.A03;
        if (AbstractC35184Ffb.A03(userSession)) {
            A00(c38321qM, c75113Zb, i);
            return;
        }
        int i2 = c75113Zb.A03;
        c75113Zb.A08();
        if (!SaveApiUtil.A09(userSession, c38321qM)) {
            A01(c38321qM, this, i2, i);
            C36521G8t c36521G8t = new C36521G8t(i, 2, c75113Zb, c38321qM, this);
            FragmentActivity fragmentActivity = this.A00;
            ImageUrl A1S = c38321qM.A1S();
            int A00 = AbstractC31372Dqc.A00();
            C146106i8 A0K = AbstractC31171DnF.A0K();
            A0K.A0D = fragmentActivity.getResources().getString(2131972778);
            A0K.A0L = true;
            A0K.A0A = c36521G8t;
            A0K.A0G = AbstractC166997dE.A0q(fragmentActivity.getResources(), 2131972732);
            A0K.A01 = A00;
            if (A1S != null) {
                A0K.A09 = A1S;
                A0K.A03();
            }
            AbstractC31178DnM.A1S(A0K);
            MVO A002 = AbstractC54029Nuf.A00(userSession);
            AbstractC37302Gc3.A1W(A002, A002.A0N, 10);
            C37813GkT A003 = AbstractC37802GkH.A00(MusicPageTabType.A04, userSession);
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            AbstractC59962oe abstractC59962oe = this.A01;
            A003.A01(A0u, userSession, "save_reels", abstractC59962oe.getModuleName());
            CreativeConfigIntf Asm = c38321qM.A0C.Asm();
            if (Asm == null || (B0S = Asm.B0S()) == null || B0S.isEmpty() || (effectPreviewIntf = (EffectPreviewIntf) AbstractC001800i.A0O(B0S, 0)) == null) {
                return;
            }
            BME.A00(userSession).A00(userSession, "save_reels", effectPreviewIntf.getId(), abstractC59962oe.getModuleName());
            return;
        }
        int i3 = c75113Zb.A03;
        if (c38321qM.BqL().isEmpty()) {
            A01(c38321qM, this, i3, i);
        } else {
            new FQ5(this.A00, userSession, interfaceC37202GaD).A00(null, c38321qM, c75113Zb, i3, i);
        }
    }

    @Override // X.AnonymousClass388
    public final void Di5(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        UserSession userSession = this.A03;
        if (AbstractC35184Ffb.A03(userSession)) {
            A00(c38321qM, c75113Zb, i);
        } else {
            if (c38321qM.A0C.BAo() != null) {
                return;
            }
            AbstractC35184Ffb.A00(this.A00, userSession, c38321qM, this.A04, c75113Zb, this.A05, null, "long_press", i, SaveApiUtil.A09(userSession, c38321qM));
        }
    }

    private final void A00(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        FragmentActivity fragmentActivity = this.A00;
        AbstractC13880nE.A0K(fragmentActivity);
        UserSession userSession = this.A03;
        boolean A09 = SaveApiUtil.A09(userSession, c38321qM);
        if (!SaveApiUtil.A09(userSession, c38321qM)) {
            A01(c38321qM, this, c75113Zb.A03, i);
        }
        AbstractC35184Ffb.A00(fragmentActivity, userSession, c38321qM, this.A04, c75113Zb, this.A05, null, "single_tap", i, A09);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.ICf, java.lang.Object] */
    public static final void A01(C38321qM c38321qM, C37600Ggv c37600Ggv, int i, int i2) {
        EnumC77213d7 enumC77213d7;
        UserSession userSession = c37600Ggv.A03;
        C172077lc A00 = C172077lc.A00(userSession);
        Integer num = C05F.A01;
        String A002 = AbstractC111324zv.A00(3040);
        boolean z = !SaveApiUtil.A09(userSession, c38321qM);
        InterfaceC60442pS interfaceC60442pS = c37600Ggv.A04;
        A00.A01(AbstractC123975jB.A02(interfaceC60442pS, c38321qM, num, A002, z));
        if (SaveApiUtil.A09(userSession, c38321qM)) {
            enumC77213d7 = EnumC77213d7.A03;
        } else {
            enumC77213d7 = EnumC77213d7.A04;
        }
        FragmentActivity fragmentActivity = c37600Ggv.A00;
        SaveApiUtil.A04(fragmentActivity, fragmentActivity, userSession, c38321qM, interfaceC60442pS, new C42806Iwi(1, c37600Ggv, enumC77213d7), enumC77213d7, c37600Ggv.A07, c37600Ggv.A05, null, c37600Ggv.A08, c37600Ggv.A09, i2, i, -1);
        C25671My c25671My = c37600Ggv.A02;
        ?? obj = new Object();
        obj.A00 = c38321qM;
        c25671My.E4s(AbstractC40790I5s.A00(obj));
    }
}
