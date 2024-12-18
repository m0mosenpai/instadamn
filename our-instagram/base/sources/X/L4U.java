package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class L4U {
    public C66362zD A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C48733Lh1 A03;
    public final EnumC46186KcO A04;
    public final DirectThreadKey A05;
    public final String A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.2zJ, java.lang.Object] */
    public L4U(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C48733Lh1 c48733Lh1, EnumC46186KcO enumC46186KcO, DirectThreadKey directThreadKey, String str) {
        String str2;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c48733Lh1;
        this.A04 = enumC46186KcO;
        this.A06 = str;
        this.A05 = directThreadKey;
        C66392zG A00 = C66362zD.A00(context);
        UserSession userSession2 = this.A02;
        A00.A01(new KIK(userSession2, new C47335Kvk(this)));
        A00.A01(new KHO(new C47338Kvn(this)));
        A00.A01(new KIN(userSession2, new C30190DRv(this, 29), new C30190DRv(this, 30), new C30715DfD(this, 18)));
        InterfaceC11380iw interfaceC11380iw2 = this.A01;
        C47339Kvo c47339Kvo = new C47339Kvo(this);
        String str3 = this.A06;
        A00.A01(new KIB(interfaceC11380iw2, userSession2, c47339Kvo, str3));
        A00.A01(new KI6(interfaceC11380iw2, userSession2, new C48708Lgc(this)));
        A00.A01(new Object());
        A00.A01(new KQD(interfaceC11380iw2, userSession2, new C47340Kvp(this)));
        DirectThreadKey directThreadKey2 = this.A05;
        C48703LgX c48703LgX = new C48703LgX(this);
        if (directThreadKey2 != null) {
            str2 = directThreadKey2.A00;
        } else {
            str2 = null;
        }
        A00.A01(new KJ7(new C48699LgT(userSession2, str2), c48703LgX));
        A00.A01(new C45675KJm(userSession2, new C47331Kvg(this)));
        A00.A01(new C45679KJq(EnumC46271Ke3.STICKER, interfaceC11380iw2, userSession2, new C48706Lga(this), this.A04, str3));
        A00.A01(new KIS(null, AbstractC06930Yk.A06(AbstractC166987dD.A1L(EnumC46170Kc8.A02, new C50153MDg(this, 40)), AbstractC166987dD.A1L(EnumC46170Kc8.A04, new C50153MDg(this, 41)), AbstractC166987dD.A1L(EnumC46170Kc8.A06, new C50153MDg(this, 42)), AbstractC166987dD.A1L(EnumC46170Kc8.A05, new C50153MDg(this, 43)), AbstractC166987dD.A1L(EnumC46170Kc8.A07, new C50153MDg(this, 44)))));
        A00.A01(new KHQ(new C47332Kvh(this)));
        A00.A01(new KHT(new C47333Kvi(this)));
        A00.A01(new KHR(new C47334Kvj(this)));
        A00.A01(new KHS(new C47336Kvl(this)));
        this.A00 = AbstractC31173DnH.A0R(A00, new KHP(new C47337Kvm(this)));
    }
}
