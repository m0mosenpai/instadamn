package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

/* renamed from: X.Eez, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32968Eez extends AbstractC31433Drd {
    public Hashtag A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final FRD A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC63862v7 A06;
    public final C63822v3 A07;

    public C32968Eez(Context context, FragmentActivity fragmentActivity, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, FRD frd, Hashtag hashtag, String str) {
        super(interfaceC11380iw, c19260xA, userSession, str, "hashtag", "hashtag_page");
        this.A06 = new C36495G7t(this, 0);
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A07 = new C63822v3(context, abstractC018607g, interfaceC11380iw, userSession);
        this.A00 = hashtag;
        this.A03 = frd;
    }

    @Override // X.AbstractC31433Drd
    public final Hashtag A01(Hashtag hashtag, int i) {
        super.A01(hashtag, i);
        this.A07.A05(this.A05, this.A06, hashtag, "follow_chaining");
        return hashtag;
    }

    @Override // X.AbstractC31433Drd
    public final Hashtag A02(Hashtag hashtag, int i) {
        super.A02(hashtag, i);
        this.A07.A06(this.A05, this.A06, hashtag, "follow_chaining");
        return hashtag;
    }

    @Override // X.AbstractC31433Drd
    public final void A03() {
        super.A03();
        FRD frd = this.A03;
        frd.A00 = EnumC155676yw.A02;
        V1R.A03(frd.A04.A00);
    }

    @Override // X.AbstractC31433Drd
    public final void A08(Hashtag hashtag, int i) {
        super.A08(hashtag, i);
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A05;
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0E(WE2.A02(userSession, hashtag, this.A04.getModuleName(), "follow_chaining"));
        A0r.A0B = "follow_chaining";
        A0r.A04();
    }

    @Override // X.AbstractC31433Drd
    public final void A0A(User user, int i) {
        super.A0A(user, i);
        AbstractC31175DnJ.A0i(this.A02);
    }

    @Override // X.AbstractC31433Drd
    public final void A0G(boolean z, String str) {
        super.A0G(z, str);
        C140966Yy A0r = AbstractC25225BEi.A0r(this.A02, this.A05);
        Hashtag hashtag = this.A00;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("SimilarAccountsFragment.ARGUMENT_HASHTAG", hashtag);
        ENG eng = new ENG();
        eng.setArguments(A0b);
        A0r.A0E(eng);
        A0r.A0B = AbstractC111324zv.A00(3002);
        A0r.A04();
    }
}
