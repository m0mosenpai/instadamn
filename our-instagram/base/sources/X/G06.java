package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G06 implements InterfaceC13050lr, InterfaceC13000lm {
    public C18920wW A00;
    public final AbstractC12990ll A06;
    public final InterfaceC12850lX A07;
    public boolean A02 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A03 = true;
    public String A01 = AbstractC166997dE.A0n();

    public final synchronized void A01() {
        this.A04 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.1vN] */
    public final synchronized void A02(Context context, FNM fnm) {
        String str;
        UserSession userSession;
        if (!this.A02 && !this.A04) {
            AbstractC12990ll abstractC12990ll = this.A06;
            if ((abstractC12990ll instanceof UserSession) && (userSession = (UserSession) abstractC12990ll) != null) {
                AbstractC25651Mw.A00(userSession).E4s(new Object());
            }
            this.A02 = true;
            C32540EUq c32540EUq = new C32540EUq(2, this, fnm, context);
            FEX.A02 = fnm.A01;
            String str2 = fnm.A00;
            if (str2 != null) {
                FEX.A03 = AbstractC08820cl.A03(str2).getQueryParameter("challenge_node_id");
                String str3 = fnm.A00;
                int indexOf = str3.indexOf("challenge/");
                if (indexOf >= 0) {
                    String[] split = str3.substring(indexOf).split("/");
                    if (split.length >= 3) {
                        FEX.A01 = split[1];
                        str = split[2];
                    } else {
                        str = null;
                        FEX.A01 = null;
                    }
                    FEX.A00 = str;
                }
            }
            FEX.A00(context, c32540EUq, abstractC12990ll, C05F.A0N, "challenge/", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.content.Context r7, X.FNM r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            r6 = this;
            r0 = 1
            r6.A02 = r0
            java.util.HashMap r2 = X.AbstractC166987dD.A1G()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L12
            java.lang.String r0 = "user_id"
            r2.put(r0, r10)
        L12:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L1d
            java.lang.String r0 = "nonce_code"
            r2.put(r0, r11)
        L1d:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L28
            java.lang.String r0 = "cni"
            r2.put(r0, r12)
        L28:
            if (r14 == 0) goto L7b
            X.Fv5 r0 = X.C36007Fv5.A00()
            X.0ll r5 = r6.A06
            java.lang.String r4 = "igwb_identity_safety_FX_access_safety_security_integrity"
            java.lang.String r3 = "CheckpointManagerImpl"
            java.lang.String r0 = r0.A02(r5, r4, r3)
            boolean r0 = X.AbstractC31171DnF.A1X(r0)
            if (r0 == 0) goto L7b
            java.lang.String r1 = "choice"
            java.lang.String r0 = "3"
            r2.put(r1, r0)
            X.Fv5 r0 = X.C36007Fv5.A00()
            java.lang.String r1 = r0.A02(r5, r4, r3)
            java.lang.String r0 = "big_blue_token"
            r2.put(r0, r1)
        L52:
            if (r13 == 0) goto L59
            java.lang.String r0 = "challenge_context"
            r2.put(r0, r13)
        L59:
            X.0ll r3 = r6.A06
            X.0jh r1 = X.AbstractC31172DnG.A0P(r3)
            X.19T r0 = X.C19T.A1T
            java.lang.String r1 = r1.A02(r0)
            java.lang.String r0 = "fb_family_device_id"
            r2.put(r0, r1)
            r0 = 3
            X.EOu r1 = new X.EOu
            r1.<init>(r0, r6, r8, r7)
            X.8gL r0 = X.C192108fB.A04(r3, r9, r2)
            r0.A00(r1)
            X.C1GJ.A03(r0)
            return
        L7b:
            java.lang.String r1 = "get_challenge"
            java.lang.String r0 = "true"
            r2.put(r1, r0)
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G06.A03(android.content.Context, X.FNM, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final synchronized void A04(Context context, String str, String str2, Map map) {
        Integer A00 = AbstractC34034F0n.A00(str);
        if (this.A03) {
            Bundle A0b = AbstractC166987dD.A0b();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                AbstractC31179DnN.A0o(A0b, A15);
            }
            this.A04 = true;
            this.A05 = false;
            if (A00 != C05F.A1F) {
                if (str2 != null) {
                    FEX.A02 = str2;
                }
                C14360o3.A0B(A00, 0);
                String token = this.A06.getToken();
                C14360o3.A0B(token, 0);
                C14360o3.A0B(context, 0);
                Intent intent = new Intent(context, (Class<?>) ChallengeActivity.class);
                intent.addFlags(805306368);
                AbstractC31179DnN.A0k(intent, AbstractC166987dD.A0b(), A0b, AbstractC34035F0o.A00(A00), token);
                try {
                    C12260kU.A0C(context, intent);
                } catch (IllegalStateException e) {
                    C0w9.A07(AbstractC111324zv.A00(296), e);
                }
            } else {
                this.A04 = false;
                AbstractC31173DnH.A1Z("Challenge Type Invalid: ", str, "Challenge");
            }
        }
    }

    public static void A00(Context context, G06 g06, FNM fnm) {
        if (g06.A03 && !g06.A04 && !TextUtils.isEmpty(fnm.A02)) {
            g06.A04 = true;
            Intent A00 = C35133Fea.A00(context, g06.A06, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, fnm.A03, true, false, false, !fnm.A05, true, false, false, (String) null, AbstractC63260SgI.A02(context, fnm.A02)));
            A00.addFlags(335544320);
            C12260kU.A0C(context, A00);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC12860lY.A08(this.A07);
        this.A00 = null;
        this.A01 = null;
        A01();
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        AbstractC12860lY.A08(this.A07);
    }

    public G06(AbstractC12990ll abstractC12990ll) {
        this.A06 = abstractC12990ll;
        this.A00 = AbstractC12220kQ.A02(abstractC12990ll);
        C32551EVb c32551EVb = new C32551EVb(this);
        this.A07 = c32551EVb;
        AbstractC12860lY.A07(c32551EVb);
    }
}
