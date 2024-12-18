package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.1lT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35471lT implements InterfaceC29301b7 {
    public static final C0KV A01 = C35481lU.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C35451lR c35451lR = (C35451lR) c1ow;
        C14360o3.A0B(c35451lR, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str2 = c35451lR.A03;
        if (str2 != null) {
            String str3 = c35451lR.A02;
            if (str3 != null) {
                int i = c35451lR.A00;
                String str4 = c35451lR.A01;
                if (str4 != null) {
                    String str5 = c35451lR.A04;
                    C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                    c25621Ms.A05();
                    c25621Ms.A0B("direct_v2/threads/broadcast/edit_prompt/");
                    c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                    c25621Ms.A9s("prompt_id", str3);
                    c25621Ms.A0D("prompt_type", i);
                    c25621Ms.A9s("new_prompt_text", str4);
                    c25621Ms.A9s("trending_prompt_id", str5);
                    c25621Ms.A0R(C40781ul.class, C55702hA.class);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                    C1GJ.A06(A0N, -5, 3, true, true);
                    return;
                }
                str = "newPromptText";
            } else {
                str = "promptId";
            }
        } else {
            str = "threadId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C35471lT(UserSession userSession) {
        this.A00 = userSession;
    }
}
