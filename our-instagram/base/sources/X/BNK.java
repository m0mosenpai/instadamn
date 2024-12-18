package X;

import android.content.Context;
import com.facebook.litho.LithoView;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class BNK extends AbstractC77583di {
    public final ClipsViewerConfig A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final Integer A05;
    public final WeakReference A06;
    public final HashMap A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final C51722Yv A0D;
    public final C51532Yb A0E;
    public final HashMap A0F;
    public final boolean A0G;

    public BNK(C51722Yv c51722Yv, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, WeakReference weakReference, HashMap hashMap, HashMap hashMap2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC167027dH.A0a(1, c120985dq, hashMap, hashMap2, interfaceC11380iw);
        C14360o3.A0B(weakReference, 5);
        AbstractC167017dG.A1U(c37644Ghd, userSession);
        AbstractC25229BEm.A1P(c51722Yv, 10, clipsViewerConfig);
        this.A01 = c120985dq;
        this.A0F = hashMap;
        this.A07 = hashMap2;
        this.A03 = interfaceC11380iw;
        this.A06 = weakReference;
        this.A02 = c37644Ghd;
        this.A04 = userSession;
        this.A05 = num;
        this.A0B = z;
        this.A0D = c51722Yv;
        this.A0G = z2;
        this.A08 = z3;
        this.A0A = z4;
        this.A09 = z5;
        this.A0C = z6;
        this.A00 = clipsViewerConfig;
        this.A0E = AbstractC25227BEk.A0d(new BNL(this), 5, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r12 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    @Override // X.AbstractC77583di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78053eX A0Y(X.C77993eR r15) {
        /*
            r14 = this;
            r0 = 0
            r13 = r15
            X.C14360o3.A0B(r15, r0)
            r10 = r14
            java.lang.Integer r7 = r14.A05
            r4 = 0
            if (r7 == 0) goto L1b
            int r1 = r7.intValue()
            X.5dq r2 = r14.A01
            java.util.List r0 = r2.A0R
            if (r0 == 0) goto L1b
            X.1qM r12 = X.AbstractC25225BEi.A0x(r0, r1)
            if (r12 != 0) goto L84
        L1b:
            X.5dq r2 = r14.A01
            X.1qM r12 = r2.A02
            if (r12 != 0) goto L84
            r11 = r4
        L22:
            boolean r0 = r14.A0G
            if (r0 == 0) goto L3c
            if (r11 == 0) goto L3c
            X.1No r1 = X.C25821No.A00()
            X.0iw r0 = r14.A03
            java.lang.String r0 = r0.getModuleName()
            X.1OG r1 = r1.A0J(r11, r0)
            r0 = 1
            r1.A0J = r0
            r1.A01()
        L3c:
            X.BNW r3 = X.BNW.A00
            X.BNX r1 = X.BNX.A00
            X.2Yb r0 = r14.A0E
            r9 = 44
            X.DRh r8 = new X.DRh
            r8.<init>(r9, r10, r11, r12, r13)
            X.2YP r6 = X.AbstractC25229BEm.A0c(r15, r0, r1, r8)
            X.2Yv r5 = r14.A0D
            java.lang.String r1 = r2.getId()
            boolean r0 = X.AbstractC25397BLo.A00(r2)
            r2 = r4
            if (r0 == 0) goto L5b
            r2 = r7
        L5b:
            java.lang.String r0 = "clips_zoomable_container_"
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
            if (r2 == 0) goto L70
            java.lang.StringBuilder r1 = X.AbstractC166997dE.A11(r1)
            r0 = 95
            r1.append(r0)
            java.lang.String r1 = X.AbstractC166997dE.A0v(r2, r1)
        L70:
            java.lang.Integer r0 = X.C05F.A0D
            X.9CV r1 = X.AbstractC25228BEl.A0o(r0, r1)
            X.3ay r0 = X.C51722Yv.A02
            if (r5 == r0) goto L7b
            r4 = r5
        L7b:
            X.2Yv r0 = X.AbstractC25225BEi.A0h(r4, r1)
            X.3eX r0 = X.AbstractC25225BEi.A0g(r0, r3, r6)
            return r0
        L84:
            android.content.Context r0 = X.AbstractC25227BEk.A0A(r15)
            com.instagram.common.typedurl.ImageUrlBase r11 = X.BNM.A00(r0, r12)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BNK.A0Y(X.3eR):X.3eX");
    }

    public static final C25370BKn A03(Context context, C38321qM c38321qM, BNK bnk) {
        String id;
        HashMap hashMap = bnk.A0F;
        C120985dq c120985dq = bnk.A01;
        C25370BKn c25370BKn = (C25370BKn) hashMap.get(c120985dq.getId());
        HashMap hashMap2 = bnk.A07;
        AbstractMap abstractMap = (AbstractMap) hashMap2.get(c120985dq.getId());
        C25370BKn c25370BKn2 = null;
        String str = null;
        if (abstractMap != null) {
            if (c38321qM != null) {
                str = c38321qM.getId();
            }
            c25370BKn2 = (C25370BKn) abstractMap.get(str);
        }
        if (c120985dq.A0J == EnumC40111tc.A09 && bnk.A00.A1n) {
            if (c25370BKn == null) {
                return c25370BKn2;
            }
        } else {
            UserSession userSession = bnk.A04;
            if ((AbstractC37655Gho.A05(c120985dq, userSession) && C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36326927878863049L)) || (!AbstractC37655Gho.A05(c120985dq, userSession) && !bnk.A08 && AbstractC37655Gho.A02(c120985dq))) {
                if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36328521312452197L)) {
                    c25370BKn2 = new C25370BKn(new LithoView(context), bnk.A00, userSession, false);
                    AbstractMap abstractMap2 = (AbstractMap) hashMap2.get(c120985dq.getId());
                    if (abstractMap2 == null) {
                        abstractMap2 = AbstractC166987dD.A1G();
                    }
                    if (c38321qM != null && (id = c38321qM.getId()) != null) {
                        abstractMap2.put(id, c25370BKn2);
                    }
                }
                return c25370BKn2;
            }
        }
        return c25370BKn;
    }
}
