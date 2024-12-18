package com.instagram.repository.storyhighlights;

import X.AbstractC23641Du;
import X.AbstractC59962oe;
import X.AnonymousClass191;
import X.C05F;
import X.C06090Tz;
import X.C07Y;
import X.C14360o3;
import X.C156166zk;
import X.C156186zn;
import X.C18U;
import X.C19L;
import X.C206649Cv;
import X.C4A7;
import X.C57312k6;
import X.InterfaceC149556o7;
import X.InterfaceC61272qp;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class StoryHighlightsTrayManager$Instance implements InterfaceC61272qp {
    public Context A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C156186zn A05;
    public final Set A06;
    public final boolean A07;
    public final String A08;
    public final /* synthetic */ C156166zk A09;

    public StoryHighlightsTrayManager$Instance(C156166zk c156166zk, String str) {
        this.A09 = c156166zk;
        this.A08 = str;
        UserSession userSession = c156166zk.A00;
        this.A07 = str.equals(userSession.userId);
        this.A05 = new C156186zn(2, C18U.A06(C06090Tz.A05, userSession, 36329247161336033L));
        this.A06 = new LinkedHashSet();
    }

    public final void A01(InterfaceC149556o7 interfaceC149556o7, AbstractC59962oe abstractC59962oe) {
        C14360o3.A0B(abstractC59962oe, 0);
        C14360o3.A0B(interfaceC149556o7, 1);
        this.A00 = abstractC59962oe.requireContext();
        this.A06.add(interfaceC149556o7);
        C57312k6 A00 = C07Y.A00(abstractC59962oe.getViewLifecycleOwner());
        C206649Cv c206649Cv = new C206649Cv(this, null, 32);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, A00);
    }

    @Override // X.InterfaceC61272qp
    public final void Co4() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1JX A00(final com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 35
            boolean r0 = X.C9CX.A00(r6, r3)
            if (r0 == 0) goto L29
            r4 = r6
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 == r2) goto L46
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L29:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r5, r6, r3, r0)
            goto L16
        L31:
            X.AbstractC09560e7.A00(r1)
            X.6zn r0 = r5.A05
            X.0pN r1 = r0.A01
            X.71J r0 = new X.71J
            r0.<init>()
            r4.A00 = r2
            java.lang.Object r0 = r1.collect(r0, r4)
            if (r0 != r3) goto L49
            return r3
        L46:
            X.AbstractC09560e7.A00(r1)
        L49:
            X.PW2 r0 = new X.PW2
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance.A00(com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance, X.1Ds):X.1JX");
    }

    @Override // X.InterfaceC61272qp
    public final void AVA() {
        String str;
        String str2 = this.A08;
        Context context = this.A00;
        if (context != null && (str = this.A01) != null) {
            C156166zk c156166zk = this.A09;
            UserSession userSession = c156166zk.A00;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36319978622754691L) && !this.A03 && !this.A04) {
                this.A04 = true;
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    ((InterfaceC149556o7) it.next()).DKt(false);
                }
                C156186zn c156186zn = this.A05;
                Integer A00 = C156166zk.A00(c156166zk);
                C19L c19l = ((C4A7) c156186zn).A01;
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new StoryHighlightsRepository$fetchMoreStoryHighlights$1(context, userSession, c156186zn, null, null, A00, str2, null, str, null, true), c19l);
            }
        }
    }

    @Override // X.InterfaceC61272qp
    public final boolean CKt() {
        return this.A02;
    }

    @Override // X.InterfaceC61272qp
    public final /* synthetic */ boolean CLg() {
        return false;
    }

    @Override // X.InterfaceC61272qp
    public final boolean CLh() {
        UserSession userSession = this.A09.A00;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36319978622754691L) && this.A01 != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC61272qp
    public final boolean Eib(Integer num, int i, int i2) {
        if (CLh()) {
            int i3 = i2 - i;
            UserSession userSession = this.A09.A00;
            C14360o3.A0B(userSession, 0);
            if (i3 <= ((int) C18U.A01(C06090Tz.A05, userSession, 36601453599264987L))) {
                return true;
            }
        }
        return false;
    }
}
