package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L48 {
    public C66362zD A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C47987LJp A03;
    public final EnumC46186KcO A04;
    public final String A05;

    public L48(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47987LJp c47987LJp, EnumC46186KcO enumC46186KcO, String str) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c47987LJp;
        this.A04 = enumC46186KcO;
        this.A05 = str;
        C66392zG A00 = C66362zD.A00(context);
        UserSession userSession2 = this.A02;
        A00.A01(new C45679KJq(EnumC46271Ke3.AI_STICKER, this.A01, userSession2, new C48705LgZ(this), this.A04, this.A05));
        A00.A01(new KJJ(new C50153MDg(this, 39)));
        this.A00 = AbstractC31173DnH.A0R(A00, new C45680KJr(true));
    }
}
