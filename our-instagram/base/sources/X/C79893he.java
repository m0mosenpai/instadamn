package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.Trigger;

/* renamed from: X.3he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79893he implements InterfaceC79903hf {
    public final Fragment A00;
    public final C25671My A01;
    public final UserSession A02;
    public final C79853ha A03;
    public final C57112jm A04;
    public final C684736k A05;

    public C79893he(Fragment fragment, C25671My c25671My, UserSession userSession, C57112jm c57112jm, C79853ha c79853ha, C684736k c684736k) {
        C14360o3.A0B(c79853ha, 3);
        C14360o3.A0B(c25671My, 4);
        this.A00 = fragment;
        this.A02 = userSession;
        this.A03 = c79853ha;
        this.A01 = c25671My;
        this.A05 = c684736k;
        this.A04 = c57112jm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        if (r1 == X.AnonymousClass341.A03) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0, 36311543305994833L) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (r1 != X.AnonymousClass341.A0W) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r40.A58() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        r26 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        if (r4 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        r3 = r40.A2x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r3.length() != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        r24 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        r3 = r40.A2x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
    
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        if (r3.length() != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        r25 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        r3 = r40.A0C.Atz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
    
        if (r3 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        if (X.C14360o3.A0K(r3.BvY(), true) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        r29 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0, 36321567759672946L) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
    
        r16 = X.AbstractC41573IaM.A00(r0, r40, X.EnumC37745GjK.A07);
        r15 = null;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        if (r1 != X.AnonymousClass341.A03) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011f, code lost:
    
        if (X.AbstractC61652rS.A0B(r0, X.AbstractC23021Ah.A00(r0)) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0121, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0, 36317393051456631L) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:
    
        if (r7 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
    
        r4 = X.AbstractC61652rS.A07(r0, X.AbstractC23021Ah.A00(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0140, code lost:
    
        if (r40.A5v() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
    
        if (r4 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        r3 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (X.C18U.A06(r3, r0, 36319360146545867L) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015a, code lost:
    
        if (X.C18U.A06(r3, r0, 36319360146480330L) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015c, code lost:
    
        r28 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r1 != X.AnonymousClass341.A0I) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0162, code lost:
    
        if (r10 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016c, code lost:
    
        if (X.AbstractC41071vF.A0H(r0, r40.getId()) == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        r3 = X.C18U.A06(X.C06090Tz.A05, r0, 36315808212258398L);
        r1 = X.AbstractC41561w6.A00(r0).A00(r40);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0181, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        if (r1.A10 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0187, code lost:
    
        r1 = 2131970070;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018a, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        r1 = 2131970071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018f, code lost:
    
        r14 = r11.getString(r1, r13);
        X.C14360o3.A07(r14);
        r15 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e6, code lost:
    
        r1 = 2131970068;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e9, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01eb, code lost:
    
        r1 = 2131970069;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
    
        r3 = new X.C5SE(r0, r40, r41.A06());
        r13 = new X.C41173IKm(r14, r15, r16, r17, r18, r19, r20, false, r19, r23, r24, r25, r26, false, r28, r29, false);
        r41.getPosition();
        r31.A0M(r3, r40, r41, null, r13, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ef, code lost:
    
        r28 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0130, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0109, code lost:
    
        r29 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d8, code lost:
    
        if (r4 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00da, code lost:
    
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e0, code lost:
    
        if (X.C2TN.A02(r0, r40) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c0, code lost:
    
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c2, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c8, code lost:
    
        if (X.C2TN.A03(r0, r40) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b2, code lost:
    
        r26 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x008f, code lost:
    
        if (r19 != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC79903hf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D48(X.C38321qM r40, X.C75113Zb r41, int r42) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79893he.D48(X.1qM, X.3Zb, int):void");
    }

    @Override // X.InterfaceC79903hf
    public final void DS6(View view, final C38321qM c38321qM) {
        UserSession userSession = this.A02;
        if (C79923hh.A09(userSession, c38321qM)) {
            EnumC31334Dpz A01 = C79923hh.A01(c38321qM);
            if ((AbstractC50573MUe.A00(c38321qM) instanceof C52740NVi) && (!A01.A00()) && !AbstractC23021Ah.A00(userSession).A1q()) {
                if (C197838ou.A03(C82G.A0a, C82H.A0z, userSession)) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36318209095309336L) && C18U.A06(c06090Tz, userSession, 36318209095571483L) && C18U.A06(c06090Tz, userSession, 36328967988330399L)) {
                        Fragment fragment = this.A00;
                        FragmentActivity requireActivity = fragment.requireActivity();
                        String string = fragment.requireActivity().getString(2131973167);
                        C14360o3.A07(string);
                        C5SU c5su = new C5SU(requireActivity, new C149686oL(string));
                        c5su.A03(view);
                        c5su.A01();
                        c5su.A00 = 3000;
                        c5su.A04 = new C33H() { // from class: X.9oU
                            /* JADX WARN: Type inference failed for: r2v0, types: [X.82I, X.0Zx] */
                            @Override // X.C33H, X.C33I
                            public final void Dtt(C5SW c5sw) {
                                UserSession userSession2 = C79893he.this.A02;
                                AbstractC23021Ah.A00(userSession2).A1Y(true);
                                boolean A03 = C196068lw.A03(C196068lw.A00(userSession2).A00(CallerContext.A01("DefaultMediaUFIOptionsDelegateImpl")));
                                C82G c82g = C82G.A0a;
                                C82H c82h = C82H.A0z;
                                EnumC201098ur enumC201098ur = EnumC201098ur.VIEW;
                                ?? c0Zx = new C0Zx();
                                c0Zx.A06("ig_media_id", c38321qM.getId());
                                c0Zx.A09(Boolean.valueOf(A03));
                                c0Zx.A05("impression_count", 1L);
                                AbstractC201108us.A00(c82g, enumC201098ur, c82h, c0Zx, userSession2);
                            }
                        };
                        view.postDelayed(new RunnableC24467Asm(c5su.A00()), 500L);
                    }
                }
            }
        }
        C684736k c684736k = this.A05;
        if (c684736k != null) {
            c684736k.A00(view, this.A04, c38321qM, QPTooltipAnchor.A0p, Trigger.A0S);
        }
        if (C14360o3.A0K(C17060sy.A01.A01(userSession), c38321qM.A2E(userSession)) && AbstractC76783cQ.A06(userSession, c38321qM, C05F.A01, false) && c684736k != null) {
            c684736k.A00(view, this.A04, c38321qM, QPTooltipAnchor.A0p, Trigger.A1A);
        }
    }
}
