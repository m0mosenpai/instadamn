package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.387, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass387 implements AnonymousClass388 {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C1Y1 A04;
    public final C1M1 A05;
    public final String A06;
    public final boolean A07;
    public final C25671My A08;
    public final InterfaceC684136e A09;
    public final SearchContext A0A;
    public final Long A0B;
    public final String A0C;

    @Override // X.AnonymousClass388
    public final void Di5(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        A03(c38321qM, c75113Zb, null, i);
    }

    private void A00(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        FragmentActivity fragmentActivity = this.A01;
        if (fragmentActivity.getCurrentFocus() != null) {
            AbstractC13880nE.A0O(fragmentActivity.getCurrentFocus());
        }
        UserSession userSession = this.A02;
        boolean A09 = SaveApiUtil.A09(userSession, c38321qM);
        if (!SaveApiUtil.A09(userSession, c38321qM)) {
            A01(c38321qM, c75113Zb, i);
        }
        String A00 = AbstractC43591JPw.A00(471);
        AbstractC35184Ffb.A00(fragmentActivity, userSession, c38321qM, this.A03, c75113Zb, this.A05, null, A00, i, A09);
    }

    private void A01(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        UserSession userSession = this.A02;
        if (!SaveApiUtil.A09(userSession, c38321qM)) {
            A02(c38321qM, c75113Zb, i);
            if (this.A03.getModuleName().equals("feed_contextual_chain")) {
                F7K.A00(userSession).A02 = true;
            }
            C1VN c1vn = C1VN.A00;
            if (c1vn != null) {
                c1vn.A02(userSession, this.A01, AbstractC111324zv.A00(1477));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.ICf, java.lang.Object] */
    private void A02(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        EnumC77213d7 enumC77213d7;
        int i2 = c75113Zb.A03;
        UserSession userSession = this.A02;
        if (SaveApiUtil.A09(userSession, c38321qM)) {
            enumC77213d7 = EnumC77213d7.A03;
        } else {
            enumC77213d7 = EnumC77213d7.A04;
        }
        C172077lc A00 = C172077lc.A00(userSession);
        Integer num = C05F.A01;
        boolean z = !SaveApiUtil.A09(userSession, c38321qM);
        InterfaceC60442pS interfaceC60442pS = this.A03;
        A00.A01(AbstractC123975jB.A02(interfaceC60442pS, c38321qM, num, "button", z));
        FragmentActivity fragmentActivity = this.A01;
        SaveApiUtil.A04(fragmentActivity, fragmentActivity, userSession, c38321qM, interfaceC60442pS, new C42807Iwj(c38321qM, c75113Zb, this), enumC77213d7, this.A0A, this.A05, this.A06, String.valueOf(this.A0B), this.A0C, i, i2, c75113Zb.A0W);
        C25671My c25671My = this.A08;
        ?? obj = new Object();
        obj.A00 = c38321qM;
        c25671My.E4s(AbstractC40790I5s.A00(obj));
        if (c38321qM.A53()) {
            if (enumC77213d7 == EnumC77213d7.A04) {
                C42347Ip9 A002 = I92.A00(userSession, false);
                C14360o3.A0B(A002, 2);
                if (!c38321qM.A3J().isEmpty()) {
                    A002.A0E(c38321qM, EnumC39623HeX.A07);
                    return;
                }
                return;
            }
            if (enumC77213d7 != EnumC77213d7.A03) {
                return;
            }
            C42347Ip9 A003 = I92.A00(userSession, false);
            C14360o3.A0B(A003, 2);
            A003.A0F(c38321qM, EnumC39623HeX.A07);
        }
    }

    public final void A03(C38321qM c38321qM, C75113Zb c75113Zb, String str, int i) {
        UserSession userSession = this.A02;
        if (AbstractC35184Ffb.A03(userSession)) {
            A00(c38321qM, c75113Zb, i);
            return;
        }
        if (c38321qM.A0C.BAo() != null) {
            return;
        }
        FragmentActivity fragmentActivity = this.A01;
        if (fragmentActivity.getCurrentFocus() != null) {
            AbstractC13880nE.A0O(fragmentActivity.getCurrentFocus());
        }
        boolean A09 = SaveApiUtil.A09(userSession, c38321qM);
        AbstractC35184Ffb.A00(fragmentActivity, userSession, c38321qM, this.A03, c75113Zb, this.A05, str, "long_press", i, A09);
    }

    @Override // X.AnonymousClass375
    public final InterfaceC37202GaD CCt() {
        return new C42818Iwu(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass388
    public final void Di3(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC37202GaD interfaceC37202GaD, int i) {
        FragmentActivity fragmentActivity = this.A01;
        if (fragmentActivity.getCurrentFocus() != null) {
            AbstractC13880nE.A0O(fragmentActivity.getCurrentFocus());
        }
        c75113Zb.A08();
        int i2 = c75113Zb.A03;
        UserSession userSession = this.A02;
        if (AbstractC35184Ffb.A03(userSession)) {
            A00(c38321qM, c75113Zb, i);
            return;
        }
        if (SaveApiUtil.A09(userSession, c38321qM)) {
            if ((AbstractC35273Fh8.A08(userSession) && c38321qM.A53() && AbstractC35273Fh8.A0A(userSession, c38321qM, i2)) || this.A07 || !AbstractC83893oY.A00(c38321qM.BqL())) {
                new FQ5(fragmentActivity, userSession, interfaceC37202GaD).A00(null, c38321qM, c75113Zb, i2, i);
                return;
            }
            if (!SaveApiUtil.A09(userSession, c38321qM)) {
                return;
            }
            A02(c38321qM, c75113Zb, i);
            if (!c38321qM.A53()) {
                return;
            }
            int i3 = c75113Zb.A03;
            Context context = this.A00.getContext();
            if (!AbstractC35273Fh8.A08(userSession) || context == null) {
                return;
            }
            AbstractC35273Fh8.A02(context, new C32478ESe(c38321qM, this, i3), userSession, c38321qM, this.A03, EnumC77213d7.A03, this.A06, i3);
            return;
        }
        int i4 = -1;
        if (fragmentActivity instanceof InterfaceC53722dB) {
            i4 = ((InterfaceC53722dB) fragmentActivity).BHR(C1QO.A0E);
        }
        InterfaceC684136e interfaceC684136e = this.A09;
        if (interfaceC684136e != null) {
            interfaceC684136e.Env(fragmentActivity, c38321qM, i4);
        }
        A01(c38321qM, c75113Zb, i);
        if (c38321qM.A0C.BAo() != null) {
            return;
        }
        C75113Zb.A00(c75113Zb, 9);
    }

    public AnonymousClass387(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1Y1 c1y1, InterfaceC684136e interfaceC684136e, SearchContext searchContext, C1M1 c1m1, Long l, String str, boolean z) {
        this.A01 = fragment.requireActivity();
        this.A00 = fragment;
        this.A05 = c1m1;
        this.A03 = interfaceC60442pS;
        this.A02 = userSession;
        this.A08 = AbstractC25651Mw.A00(userSession);
        this.A09 = interfaceC684136e;
        this.A04 = c1y1;
        this.A07 = z;
        this.A06 = AbstractC61112qZ.A00(fragment.mArguments);
        this.A0A = searchContext;
        this.A0B = l;
        this.A0C = str;
    }
}
