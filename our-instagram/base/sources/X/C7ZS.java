package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7ZS, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7ZS implements InterfaceC14180ni, C7ZT {
    public final /* synthetic */ C7W4 A00;

    public C7ZS(C7W4 c7w4) {
        this.A00 = c7w4;
    }

    @Override // X.C7ZT
    public final void AFl(String str, String str2, String str3, String str4, boolean z) {
        C14360o3.A0B(str2, 1);
        C7W4 c7w4 = this.A00;
        java.util.Set set = c7w4.A0I;
        if (!set.contains(new C09530e4(str, str2))) {
            set.add(new C09530e4(str, str2));
            UserSession userSession = c7w4.A0d;
            InterfaceC11380iw interfaceC11380iw = c7w4.A0V;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(interfaceC11380iw, 4);
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "direct_message_impression");
            A00.AAP("send_type", str2);
            A00.AAP("client_context", str4);
            A00.AAP("message_id", str);
            A00.Cht();
            if (z) {
                C7U0 c7u0 = c7w4.A08;
                if (c7u0 == null) {
                    C14360o3.A0F("clientInfra");
                    throw C00O.createAndThrow();
                }
                String A002 = AbstractC1577276g.A00(c7u0);
                C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
                InterfaceC02590Ai A003 = A012.A00(A012.A00, "direct_message_generic_xma_impression");
                A003.AAP("send_type", str2);
                A003.AAP("xma_content_type", str3);
                A003.AAP("client_context", str4);
                A003.AAP("message_id", str);
                A003.AAP("open_thread_id", A002);
                if (A003.isSampled()) {
                    A003.Cht();
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C7ZT) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(5, this.A00, C7W4.class, "shouldLogMessageImpressions", "shouldLogMessageImpressions(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
