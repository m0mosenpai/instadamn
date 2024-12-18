package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.Fft, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35201Fft {
    public static final C35201Fft A00 = new Object();

    public static final void A00(UserSession userSession, InterfaceC37261GbE interfaceC37261GbE, C47Z c47z, String str, String str2, String str3, int i) {
        if (str != null) {
            ETM etm = new ETM(userSession, str, str3, str2, i);
            String valueOf = String.valueOf(c47z.A2I);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            AbstractC31173DnH.A1P(A0c, "direct_v2/threads/broadcast/update_prompt_response/add/", str);
            A0c.A9s("client_context", str2);
            A0c.A9s("prompt_id", str3);
            A0c.A0D("prompt_type", i);
            A0c.A0R(EBP.class, FUl.class);
            if (valueOf != null) {
                A0c.A9s("response_id", valueOf);
            }
            C1ON A0N = A0c.A0N();
            A0N.A00 = new C32226EDz(etm, userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            return;
        }
        interfaceC37261GbE.DUq(null, null);
    }

    public final void A02(C19260xA c19260xA, UserSession userSession, InterfaceC37261GbE interfaceC37261GbE, C34513FIz c34513FIz, InterfaceC31091eE interfaceC31091eE, AbstractC33951iv abstractC33951iv, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2) {
        String str;
        C14360o3.A0B(interfaceC09390do, 4);
        C14360o3.A0B(interfaceC09390do2, 5);
        if (C7D2.A00(abstractC33951iv.A00).ordinal() == 0) {
            interfaceC37261GbE.DUq(C114675Fx.A0c, null);
            return;
        }
        if (abstractC33951iv.A04 != null) {
            String str2 = abstractC33951iv.A07().A00;
            String str3 = abstractC33951iv.A05;
            String str4 = abstractC33951iv.A03;
            int i = abstractC33951iv.A00;
            String str5 = abstractC33951iv.A04;
            if (str2 != null && str4 != null) {
                C32531EUh c32531EUh = new C32531EUh(c34513FIz, interfaceC37261GbE, str4, 5);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                AbstractC31173DnH.A1P(A0c, "direct_v2/threads/broadcast/update_prompt_response/add/", str2);
                A0c.A9s("client_context", str3);
                A0c.A9s("prompt_id", str4);
                A0c.A0D("prompt_type", i);
                A0c.A0R(EBP.class, FUl.class);
                if (str5 != null) {
                    A0c.A9s("question_response_text", str5);
                }
                AbstractC31175DnJ.A1K(A0c, c32531EUh);
                return;
            }
            interfaceC37261GbE.DUq(null, null);
            return;
        }
        C7Q4 c7q4 = abstractC33951iv.A01;
        if (c7q4 == null || (str = c7q4.A06) == null) {
            return;
        }
        LHD.A00(c19260xA, userSession, interfaceC37261GbE, abstractC33951iv, interfaceC31091eE, abstractC33951iv.A07(), (PendingMediaStore) interfaceC09390do.getValue(), (PendingMediaStoreSerializer) interfaceC09390do2.getValue(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r3.A03 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(X.AbstractC33951iv r3, X.C33891ip r4) {
        /*
            int r0 = r3.A00
            com.instagram.direct.prompts.DirectPromptTypes r0 = X.C7D2.A00(r0)
            int r2 = r0.ordinal()
            r1 = 0
            if (r2 == r1) goto L22
            r0 = 2
            if (r2 == r0) goto L23
            r0 = 6
            if (r2 == r0) goto L26
            X.7Q4 r0 = r3.A01
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L22
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L21
        L1f:
            if (r4 == 0) goto L22
        L21:
            r1 = 1
        L22:
            return r1
        L23:
            java.lang.String r0 = r3.A04
            goto L2c
        L26:
            java.lang.String r0 = r3.A04
            if (r0 != 0) goto L2e
            X.7Q4 r0 = r3.A01
        L2c:
            if (r0 == 0) goto L22
        L2e:
            java.lang.String r4 = r3.A03
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35201Fft.A01(X.1iv, X.1ip):boolean");
    }
}
