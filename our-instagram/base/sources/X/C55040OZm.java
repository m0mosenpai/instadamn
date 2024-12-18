package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.LinkedHashMap;

/* renamed from: X.OZm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55040OZm {
    public boolean A00;
    public final DialogInterface.OnDismissListener A01;
    public final C82G A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final OAE A05;
    public final InterfaceC146936jV A06;
    public final InterfaceC146916jT A07;
    public final AbstractC018607g A08;
    public final InterfaceC146876jP A09;

    public static final void A00(C55040OZm c55040OZm, C41181vS c41181vS, String str, boolean z) {
        String str2;
        LinkedHashMap linkedHashMap;
        AbstractC59962oe abstractC59962oe = c55040OZm.A03;
        Context context = abstractC59962oe.getContext();
        if (context != null) {
            UserSession userSession = c55040OZm.A04;
            String A0t = AbstractC166997dE.A0t(userSession);
            if (str == null) {
                str2 = AbstractC25231BEo.A0p();
            } else {
                str2 = str;
            }
            PromptStickerModel A0K = c41181vS.A0K();
            if (A0K != null) {
                linkedHashMap = A0K.A06();
            } else {
                linkedHashMap = null;
            }
            AbstractC54107Nw5.A00(userSession, "primary_click", "ig_story_viewers_dashboard", A0t, str2, linkedHashMap);
            C1GJ.A00(context, c55040OZm.A08, C55625OnA.A00(context, abstractC59962oe, userSession, c41181vS, c55040OZm.A09, AbstractC31172DnG.A0s(c55040OZm.A00), C05F.A0Y, str, z));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1.A13() == 19) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C55040OZm r14, X.C41181vS r15, boolean r16) {
        /*
            r2 = r14
            X.2oe r13 = r14.A03
            androidx.fragment.app.FragmentActivity r5 = r13.getActivity()
            if (r5 == 0) goto L1e
            r0 = 47
            X.MLq r4 = new X.MLq
            r10 = r15
            r4.<init>(r0, r15, r5, r14)
            boolean r0 = r14.A00
            if (r0 != 0) goto L1f
            java.lang.String r0 = X.AbstractC166997dE.A0o()
            r1 = r16
            A00(r14, r15, r0, r1)
        L1e:
            return
        L1f:
            com.instagram.common.session.UserSession r9 = r14.A04
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36326541332264911(0x810ecc000737cf, double:3.0363892415408515E-306)
            boolean r0 = X.C18U.A06(r3, r9, r0)
            if (r0 != 0) goto L1e
            X.82G r14 = X.C82G.A0x
            android.content.Context r12 = r13.getContext()
            X.PUz r0 = new X.PUz
            r0.<init>(r4)
            r11 = r5
            r15 = r9
            r16 = r0
            boolean r0 = X.AbstractC54211Nxp.A00(r11, r12, r13, r14, r15, r16)
            if (r0 != 0) goto L1e
            X.1qM r1 = r10.A0b
            r4 = 0
            if (r1 == 0) goto L6e
            boolean r0 = r1.A5W()
            if (r0 != 0) goto L57
            int r3 = r1.A13()
            r1 = 19
            r0 = 0
            if (r3 != r1) goto L58
        L57:
            r0 = 1
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L5c:
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r4)
            if (r0 == 0) goto L1e
            boolean r13 = r2.A00
            if (r13 != 0) goto L70
            java.lang.String r0 = X.AbstractC166997dE.A0o()
            A00(r2, r10, r0, r4)
            return
        L6e:
            r0 = 0
            goto L5c
        L70:
            X.82G r7 = r2.A02
            X.82H r8 = X.C82H.A02
            X.6jT r12 = r2.A07
            android.content.DialogInterface$OnDismissListener r6 = r2.A01
            X.6jV r11 = r2.A06
            X.C55165OdT.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55040OZm.A01(X.OZm, X.1vS, boolean):void");
    }

    public C55040OZm(C82G c82g, AbstractC59962oe abstractC59962oe, UserSession userSession, OAE oae) {
        AbstractC167017dG.A1P(userSession, abstractC59962oe);
        this.A04 = userSession;
        this.A03 = abstractC59962oe;
        this.A05 = oae;
        this.A02 = c82g;
        this.A08 = AbstractC018607g.A00(abstractC59962oe);
        this.A07 = new P85(this);
        this.A09 = new P92(this);
        this.A06 = new P82(this);
        this.A01 = new DialogInterfaceOnDismissListenerC55324Ogm(this, 11);
    }
}
