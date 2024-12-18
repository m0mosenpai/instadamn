package com.instagram.inappbrowser.helper;

import X.AE2;
import X.AbstractC018607g;
import X.C1GJ;
import X.C1ON;
import X.C1P1;
import X.C200148tJ;
import X.C200448tn;
import X.C214389ec;
import X.C25621Ms;
import X.InterfaceC13000lm;
import X.InterfaceC200458to;
import X.InterfaceC25198BCv;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class BrowserLinkshimUrlCache implements InterfaceC13000lm {
    public final InterfaceC200458to A00;
    public final UserSession A01;

    public static C1ON A00(BrowserLinkshimUrlCache browserLinkshimUrlCache, String str, String str2) {
        C25621Ms c25621Ms = new C25621Ms(browserLinkshimUrlCache.A01);
        c25621Ms.A05();
        c25621Ms.A0B("linkshim/fetch_lynx_url/");
        c25621Ms.A9s("url", str);
        c25621Ms.A9s("callsite", str2);
        c25621Ms.A0S(C214389ec.class, AE2.class);
        return c25621Ms.A0N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 46
            boolean r0 = X.MAK.A01(r9, r3)
            if (r0 == 0) goto Lbf
            r5 = r9
            X.MAK r5 = (X.MAK) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbf
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L90
            if (r0 != r2) goto Ld5
            java.lang.Object r7 = r5.A02
            java.lang.Object r2 = r5.A01
            com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache r2 = (com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache) r2
            X.AbstractC09560e7.A00(r4)
        L2a:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L87
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.9ec r0 = (X.C214389ec) r0
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto Ld0
            X.8to r0 = r2.A00
            X.8tn r0 = (X.C200448tn) r0
            X.8tN r0 = r0.A00
            r0.put(r7, r1)
            X.3NX r4 = new X.3NX
            r4.<init>(r1)
        L48:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L74
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lcb
            X.8jk r4 = (X.C194848jk) r4
            java.lang.Object r2 = r4.A00
            X.5If r2 = (X.AbstractC115105If) r2
            boolean r0 = r2 instanceof X.C115115Ig
            if (r0 == 0) goto L75
            java.lang.String r1 = "error: "
            X.5Ig r2 = (X.C115115Ig) r2
            java.lang.Object r0 = r2.A00
            X.1un r0 = (X.InterfaceC40801un) r0
            int r0 = r0.getStatusCode()
            java.lang.String r1 = X.AnonymousClass001.A0O(r1, r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
        L6f:
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L74:
            return r4
        L75:
            boolean r0 = r2 instanceof X.C115095Ie
            if (r0 == 0) goto Lc6
            X.5Ie r2 = (X.C115095Ie) r2
            java.lang.Throwable r0 = r2.A00
            java.lang.String r1 = r0.getLocalizedMessage()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            goto L6f
        L87:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L48
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L90:
            X.AbstractC09560e7.A00(r4)
            X.8to r0 = r6.A00
            java.lang.Object r1 = r0.BFG(r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto La9
            int r0 = r1.length()
            if (r0 == 0) goto La9
            X.3NX r3 = new X.3NX
            r3.<init>(r1)
        La8:
            return r3
        La9:
            X.1ON r1 = A00(r6, r7, r8)
            r5.A01 = r6
            r5.A02 = r7
            r5.A00 = r2
            r0 = 523127964(0x1f2e4c9c, float:3.6909303E-20)
            java.lang.Object r4 = r1.A00(r0, r5)
            if (r4 == r3) goto La8
            r2 = r6
            goto L2a
        Lbf:
            X.MAK r5 = new X.MAK
            r5.<init>(r6, r9, r3)
            goto L16
        Lc6:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lcb:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld0:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        Ld5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache.A01(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final void A02(Context context, AbstractC018607g abstractC018607g, final InterfaceC25198BCv interfaceC25198BCv, final String str) {
        String str2 = (String) this.A00.BFG(str);
        if (str2 != null && str2.length() != 0) {
            interfaceC25198BCv.DqC(str2);
            return;
        }
        C1ON A00 = A00(this, str, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A00.A00 = new C1P1() { // from class: X.9gG
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(1704172669);
                InterfaceC25198BCv.this.DFf();
                C0f9.A0A(1499253539, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(-1548444519);
                C214389ec c214389ec = (C214389ec) obj;
                int A0N = AbstractC167017dG.A0N(c214389ec, -707338019);
                String str3 = c214389ec.A00;
                if (str3 != null) {
                    if (str3.length() == 0) {
                        InterfaceC25198BCv.this.DFf();
                    } else {
                        InterfaceC200458to interfaceC200458to = this.A00;
                        ((C200448tn) interfaceC200458to).A00.put(str, str3);
                        InterfaceC25198BCv.this.DqC(str3);
                    }
                    C0f9.A0A(-1045861217, A0N);
                    C0f9.A0A(-800088265, A03);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(-307258116, A0N);
                throw A0g;
            }
        };
        C1GJ.A00(context, abstractC018607g, A00);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        ((C200448tn) this.A00).A00.clear();
    }

    public BrowserLinkshimUrlCache(UserSession userSession) {
        this.A01 = userSession;
        C200148tJ c200148tJ = new C200148tJ();
        c200148tJ.A02(10L, TimeUnit.MINUTES);
        this.A00 = c200148tJ.A00();
    }
}
