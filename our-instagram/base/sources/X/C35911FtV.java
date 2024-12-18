package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FtV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35911FtV implements GXC {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C35911FtV(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj3;
        this.A03 = obj;
    }

    @Override // X.GXC
    public final void DJM() {
        if (this.A00 != 0) {
            C31250DoY c31250DoY = (C31250DoY) this.A01;
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
            String str = this.A04;
            User user = (User) this.A03;
            UserSession userSession = c31250DoY.A0A;
            if (str == null) {
                str = "activity_feed_notification";
            }
            AbstractC151386rg.A05(interfaceC11380iw, userSession, str, user.getId(), AbstractC14490oL.A0A(c31250DoY.A05));
            return;
        }
        UserSession userSession2 = (UserSession) this.A01;
        String str2 = this.A04;
        User user2 = (User) this.A02;
        Context context = (Context) this.A03;
        InterfaceC11380iw interfaceC11380iw2 = new InterfaceC11380iw() { // from class: X.Fu7
            public static final String __redex_internal_original_name = "AppStartupUtil$$ExternalSyntheticLambda0";

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return "newsfeed_you";
            }
        };
        if (str2 == null) {
            str2 = "push_notification";
        }
        AbstractC151386rg.A05(interfaceC11380iw2, userSession2, str2, user2.getId(), AbstractC14490oL.A0A(context));
    }
}
