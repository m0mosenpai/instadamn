package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;

/* renamed from: X.1nX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36741nX {
    public static C36741nX A00;

    public final ContentFilterEngineImpl A00(InterfaceC2043492k interfaceC2043492k) {
        C14360o3.A0B(interfaceC2043492k, 0);
        UserSession CE4 = interfaceC2043492k.CE4();
        ContentFilterDictionaryRegistrar A002 = AbstractC2043592l.A00(CE4);
        C14360o3.A0B(A002, 1);
        return (ContentFilterEngineImpl) CE4.A01(ContentFilterEngineImpl.class, new C50171MDy(16, A002, CE4));
    }

    public final void A01(InterfaceC2043492k interfaceC2043492k) {
        C14360o3.A0B(interfaceC2043492k, 0);
        UserSession CE4 = interfaceC2043492k.CE4();
        ContentFilterDictionaryRegistrar A002 = AbstractC2043592l.A00(CE4);
        C14360o3.A0B(A002, 1);
        CE4.A01(ContentFilterEngineImpl.class, new C50171MDy(16, A002, CE4));
        A002.A07.put(interfaceC2043492k.Anx(), interfaceC2043492k);
    }

    public final void A02(InterfaceC2043492k interfaceC2043492k) {
        C14360o3.A0B(interfaceC2043492k, 0);
        ContentFilterDictionaryRegistrar A002 = AbstractC2043592l.A00(interfaceC2043492k.CE4());
        if (A002.A07.containsKey(interfaceC2043492k.Anx())) {
            C19L c19l = A002.A0F;
            C9DV c9dv = new C9DV(A002, interfaceC2043492k, null);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dv, c19l);
        }
    }
}
