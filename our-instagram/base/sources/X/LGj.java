package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class LGj {
    public final C18920wW A00;

    public LGj(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public static final void A00(LGj lGj, InterfaceC82343lw interfaceC82343lw, String str, String str2, HashMap hashMap) {
        if (interfaceC82343lw != null) {
            hashMap.put(CacheBehaviorLogger.SOURCE, ((EnumC82333lv) interfaceC82343lw).A01);
        }
        if (str2 != null) {
            hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(lGj.A00, "direct_suggested_replies_events");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str);
            A0f.A9M("event_data", hashMap);
            A0f.Cht();
        }
    }

    public final void A01(InterfaceC82343lw interfaceC82343lw, String str) {
        HashMap A11 = AbstractC31174DnI.A11(interfaceC82343lw, 0);
        A11.put(CacheBehaviorLogger.SOURCE, ((EnumC82333lv) interfaceC82343lw).A01);
        A00(this, interfaceC82343lw, "suggested_replies_tray_blocked", str, A11);
    }

    public final void A02(InterfaceC82343lw interfaceC82343lw, String str, int i) {
        HashMap A11 = AbstractC31174DnI.A11(str, 3);
        A11.put(CacheBehaviorLogger.SOURCE, ((EnumC82333lv) interfaceC82343lw).A01);
        A11.put("match_length", String.valueOf(i));
        A11.put(AbstractC31688Dvt.A00(), str);
        A00(this, interfaceC82343lw, "suggested_replies_sayt_match", "sayt", A11);
    }

    public final void A03(InterfaceC82343lw interfaceC82343lw, String str, String str2, int i) {
        AbstractC167007dF.A1E(interfaceC82343lw, 0, str2);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(CacheBehaviorLogger.SOURCE, ((EnumC82333lv) interfaceC82343lw).A01);
        A1G.put(AbstractC111324zv.A00(2808), String.valueOf(i));
        A1G.put(AbstractC31688Dvt.A00(), str2);
        A00(this, interfaceC82343lw, "suggested_replies_tray_impression", str, A1G);
    }
}
