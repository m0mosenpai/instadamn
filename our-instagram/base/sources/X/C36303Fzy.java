package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.Fzy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36303Fzy implements InterfaceC13000lm, YO9 {
    public long A00;
    public C34721FRi A01;
    public FPY A02;
    public C2EC A03;
    public InterfaceC83713oG A04;
    public String A05;
    public String A06;
    public ScheduledFuture A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C18920wW A0C;
    public final UserSession A0D;
    public final boolean A0G;
    public final C2DS A0H;
    public final ScheduledExecutorService A0F = C14250np.A00().A00;
    public final FPI A0E = new FPI(this);

    public final void A07(EnumC33509Eri enumC33509Eri) {
        Integer num;
        String str;
        C34721FRi c34721FRi = this.A01;
        if (c34721FRi != null) {
            c34721FRi.A02(enumC33509Eri, null, null, false);
        }
        if (this.A06 != null) {
            FPY fpy = this.A02;
            if (fpy != null) {
                if (enumC33509Eri == EnumC33509Eri.ABANDON) {
                    num = C05F.A00;
                } else {
                    num = C05F.A01;
                }
                if (num.intValue() != 0) {
                    str = "onClick";
                } else {
                    str = "abandon";
                }
                Integer num2 = fpy.A00;
                if (num2 != null) {
                    fpy.A01.endFlow(num2.intValue(), str);
                }
            }
            A03();
        }
    }

    public static C36303Fzy A00(UserSession userSession) {
        return (C36303Fzy) C31651DvH.A00(userSession, C36303Fzy.class, 9);
    }

    public static String A01(C36303Fzy c36303Fzy) {
        C18C.A07(c36303Fzy.A03, "Event logging is only called when mThread != null");
        C18C.A07(c36303Fzy.A04, "threadTarget should not be null in select, send, and dwell");
        InterfaceC83713oG interfaceC83713oG = c36303Fzy.A04;
        C14360o3.A0B(interfaceC83713oG, 0);
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            return null;
        }
        return c36303Fzy.A03.C7I();
    }

    public static ArrayList A02(C36303Fzy c36303Fzy) {
        C18C.A07(c36303Fzy.A03, "private getLoggableRecipientIds() is only called when mThread != null");
        ArrayList BSE = c36303Fzy.A03.BSE();
        if (BSE.isEmpty()) {
            AbstractC31177DnL.A1R(c36303Fzy.A0D.userId, BSE);
        }
        return BSE;
    }

    private void A03() {
        ScheduledFuture scheduledFuture = this.A07;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        C2EC c2ec = this.A03;
        if (c2ec != null) {
            ((C81663kb) c2ec).A01.A0d = null;
        }
        this.A06 = null;
        this.A07 = null;
        this.A03 = null;
        this.A00 = 0L;
        this.A09 = false;
        this.A08 = false;
    }

    public static void A04(C36303Fzy c36303Fzy) {
        InterfaceC83713oG interfaceC83713oG;
        String str;
        C18C.A07(c36303Fzy.A03, "private logSendEvent() is only called when mThread != null");
        C18C.A07(c36303Fzy.A06, "private logSendEvent() is only called when mSearchSessionId != null");
        c36303Fzy.A09 = true;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c36303Fzy.A0C, "direct_inbox_search_send");
        if (A0f.isSampled()) {
            AbstractC31173DnH.A1L(A0f, c36303Fzy.A06);
            AbstractC31175DnJ.A13(A0f, c36303Fzy.A00);
            A0f.AAk("recipient_ids", A02(c36303Fzy));
            AbstractC31171DnF.A1F(A0f, A01(c36303Fzy));
            if (c36303Fzy.A0G && !c36303Fzy.A08 && !c36303Fzy.A0A && (interfaceC83713oG = c36303Fzy.A04) != null) {
                EnumC92794Ds A00 = AbstractC140946Yw.A00(interfaceC83713oG);
                if (A00 != null) {
                    str = A00.A00;
                } else {
                    str = null;
                }
                A0f.AAP(TraceFieldType.TransportType, str);
            }
            A0f.Cht();
        }
        ScheduledFuture scheduledFuture = c36303Fzy.A07;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void A05(int i) {
        String str;
        C34721FRi c34721FRi = this.A01;
        if (c34721FRi != null && (str = c34721FRi.A07) != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34721FRi.A0E, "universal_search_button_impression");
            AbstractC31173DnH.A1L(A0f, str);
            A0f.A8R(AbstractC35248Fgh.A00(i), "button_name");
            A0f.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r4.A0A != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(long r5) {
        /*
            r4 = this;
            X.FRi r3 = r4.A01
            if (r3 == 0) goto L1e
            boolean r0 = r4.A08
            if (r0 != 0) goto Ld
            boolean r0 = r4.A0A
            r1 = 0
            if (r0 == 0) goto Le
        Ld:
            r1 = 1
        Le:
            boolean r0 = r3.A0B
            if (r0 != 0) goto L1b
            r3.A0D = r1
            X.Eri r2 = X.EnumC33509Eri.ABANDON
            r1 = 0
            r0 = 0
            r3.A02(r2, r0, r0, r1)
        L1b:
            r3.A00()
        L1e:
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L51
            X.FPY r1 = r4.A02
            if (r1 == 0) goto L35
            java.lang.String r2 = "abandon"
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L35
            com.facebook.messaging.analytics.search.universal.qpllatency.QPLSearchLatencyLoggingJni r1 = r1.A01
            int r0 = r0.intValue()
            r1.endFlow(r0, r2)
        L35:
            X.0wW r1 = r4.A0C
            java.lang.String r0 = "direct_exit_search"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L4e
            java.lang.String r0 = r4.A06
            X.AbstractC31173DnH.A1L(r1, r0)
            X.AbstractC31175DnJ.A13(r1, r5)
            r1.Cht()
        L4e:
            r4.A03()
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36303Fzy.A06(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bd, code lost:
    
        if (r0 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bf, code lost:
    
        r1 = ((com.instagram.model.direct.DirectMessageSearchThread) r21).A03.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cc, code lost:
    
        if (r1.hasNext() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ce, code lost:
    
        X.AbstractC31177DnL.A1R(X.AbstractC31176DnK.A0s(r1), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00ce, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d6, code lost:
    
        r7 = X.AbstractC166987dD.A1J(X.EnumC33482ErH.SERVER_ENTITIES_NAMED_DSQ2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01de, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e1, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e4, code lost:
    
        r0 = java.lang.Long.valueOf(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0204, code lost:
    
        if (r19.A0A != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (((com.instagram.model.direct.DirectShareTarget) r21).A0E() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        X.C14360o3.A0B(r21, 0);
        r4.A01 = r2;
        r4.A04 = r11;
        r4.A03 = r1;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r27 >= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r4.A05 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r20 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r0 = r20.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r4.A0A = r0;
        r4.A0D = r10;
        r13 = r4.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r13 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r12 = X.AbstractC166987dD.A0f(r4.A0E, "universal_search_result_selected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r12.isSampled() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r20 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r1 = r20.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        r16 = X.AbstractC167007dF.A1X(r1, X.C05F.A0D);
        r14 = new X.C0Zx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r3 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r1 = (com.instagram.model.direct.DirectShareTarget) r21;
        r7 = X.AbstractC35248Fgh.A06(r1.A08);
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (r1.A0Y(r4.A0F.userId) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        r14.A06("query_string", r4.A06);
        r14.A01(X.AbstractC35248Fgh.A01(r11), "result_type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r23 < 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        X.AbstractC31176DnK.A1N(r14, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        r12.AAQ(r14, "search_result");
        r0 = r4.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        r1 = r0.length();
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (r1 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r12.A8R(X.AbstractC35248Fgh.A03(r22, !r0), "ui_section");
        X.AbstractC31173DnH.A1L(r12, r13);
        r12.AAk("data_sources", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
    
        if (r16 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        r12.A7v("is_interop_thread", java.lang.Boolean.valueOf(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        X.AbstractC31175DnJ.A12(r12, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        if (r3 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        r7 = ((com.instagram.model.direct.DirectShareTarget) r21).A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        r12.AAk("recipient_ids", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        if (r16 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0104, code lost:
    
        if (r20 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
    
        r0 = r20.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        r12.A7v("with_story_ring", java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0195, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        r12.A9K("ui_section_rank_index", r4.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
    
        if (r20 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        r0 = r20.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011c, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
    
        r12.AAQ(X.C32019E4v.A00(r0), "mnet_request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r3 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0129, code lost:
    
        r1 = (com.instagram.model.direct.DirectShareTarget) r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        if (r1.A0T() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        r1 = X.AbstractC140946Yw.A00(X.AbstractC31171DnF.A0O(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013c, code lost:
    
        if (r1 != X.EnumC92794Ds.A05) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013e, code lost:
    
        if (r2 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0140, code lost:
    
        r8 = r2.C7I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        X.AbstractC31171DnF.A1F(r12, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
    
        if (r16 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014b, code lost:
    
        if (r4.A0I != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014d, code lost:
    
        if (r10 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        r12.A8R(X.AbstractC35248Fgh.A02(r1), com.facebook.proxygen.TraceFieldType.TransportType);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015a, code lost:
    
        if (r4.A0H == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015c, code lost:
    
        if (r16 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015f, code lost:
    
        if (r10 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0162, code lost:
    
        X.AbstractC31175DnJ.A19(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0161, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0167, code lost:
    
        if ((r21 instanceof com.instagram.model.direct.DirectSearchPrompt) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0169, code lost:
    
        r5 = (com.instagram.model.direct.DirectSearchPrompt) r21;
        r0 = r5.A00;
        r4.A02 = r0;
        r2 = r5.A02;
        r4.A08 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0177, code lost:
    
        if (r0.ordinal() != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0179, code lost:
    
        r1 = X.EnumC33474Er9.IMAGE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
    
        r12.A8R(r1, "suggested_prompt_type");
        r12.AAP("suggested_prompt_id", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0189, code lost:
    
        r1 = X.EnumC33474Er9.TEXT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0185, code lost:
    
        r12.Cht();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0188, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018e, code lost:
    
        if ((r21 instanceof com.instagram.model.direct.DirectSearchPrompt) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0190, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0192, code lost:
    
        r1 = X.EnumC92794Ds.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        if ((r21 instanceof com.instagram.model.direct.DirectMessageSearchMessage) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019c, code lost:
    
        r7 = X.AbstractC166987dD.A1E();
        r1 = ((com.instagram.model.direct.DirectMessageSearchMessage) r21).A04.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ad, code lost:
    
        if (r1.hasNext() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01af, code lost:
    
        X.AbstractC31177DnL.A1R(X.AbstractC31176DnK.A0s(r1), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b7, code lost:
    
        r0 = r21 instanceof com.instagram.model.direct.DirectMessageSearchThread;
        r7 = X.AbstractC166987dD.A1E();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(X.C36443G5s r20, com.instagram.model.direct.DirectSearchResult r21, int r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36303Fzy.A08(X.G5s, com.instagram.model.direct.DirectSearchResult, int, long, long, long):void");
    }

    public final void A09(DirectSearchResult directSearchResult) {
        C34721FRi c34721FRi = this.A01;
        if (c34721FRi != null) {
            if (directSearchResult == null || !(directSearchResult instanceof DirectMessageSearchThread)) {
                c34721FRi.A09 = c34721FRi.A0G.schedule(new C32666EZq(c34721FRi, null, null, false), 2L, TimeUnit.SECONDS);
            }
        }
    }

    public final void A0A(DirectSearchResult directSearchResult, String str, int i, long j, long j2) {
        String A08;
        InterfaceC83713oG interfaceC83713oG;
        String str2;
        if (this.A06 != null && (directSearchResult instanceof DirectShareTarget)) {
            DirectShareTarget directShareTarget = (DirectShareTarget) directSearchResult;
            C2DS c2ds = this.A0H;
            if (AbstractC31171DnF.A0O(directShareTarget) instanceof MsysThreadId) {
                A08 = null;
            } else {
                A08 = directShareTarget.A08();
            }
            this.A03 = c2ds.BZR(directShareTarget.A04, A08, null, AbstractC31172DnG.A18(directShareTarget));
            Pattern pattern = AbstractC13670mt.A01;
            this.A00 = AbstractC167007dF.A0A(str);
            this.A04 = AbstractC31171DnF.A0O(directShareTarget);
            this.A08 = directShareTarget.A0E();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0C, AbstractC111324zv.A00(2251));
            if (A0f.isSampled()) {
                AbstractC31175DnJ.A0z(A0f, j);
                A0f.A9K("relative_position", Long.valueOf(j2));
                AbstractC31171DnF.A1G(A0f, "DIRECT");
                AbstractC31173DnH.A1L(A0f, this.A06);
                A0f.AAP("search_string", str);
                AbstractC31175DnJ.A13(A0f, this.A00);
                AbstractC31171DnF.A1F(A0f, A01(this));
                A0f.AAk("recipient_ids", A02(this));
                A0f.AAP("section_type", AbstractC34051F1e.A00(i));
                if (this.A0G && !this.A08 && !this.A0A && (interfaceC83713oG = this.A04) != null) {
                    EnumC92794Ds A00 = AbstractC140946Yw.A00(interfaceC83713oG);
                    if (A00 != null) {
                        str2 = A00.A00;
                    } else {
                        str2 = null;
                    }
                    A0f.AAP(TraceFieldType.TransportType, str2);
                }
                AbstractC31176DnK.A1I(A0f);
            }
            this.A07 = this.A0F.schedule(new EZW(this), 30L, TimeUnit.SECONDS);
        }
    }

    public final void A0B(Integer num, int i, long j) {
        C34721FRi c34721FRi = this.A01;
        if (c34721FRi != null) {
            c34721FRi.A03(num, i, j);
        }
    }

    public final void A0C(String str) {
        C34721FRi c34721FRi = this.A01;
        if (c34721FRi != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34721FRi.A0E, "messaging_ai_agent_feedback");
            if (A0f.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A01(EnumC33449Eqk.IGD_UNIVERSAL_SEARCH, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str);
                AbstractC166997dE.A1N(A0f, "action_type", 0);
                AbstractC166997dE.A1N(A0f, "view_name", 35);
                A0f.AAQ(c0Zx, "feedback");
                A0f.Cht();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r14.length() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r14.length() == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r24.A0A != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [X.0Zx, X.E4U] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Ai] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    @Override // X.YO9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ck7(X.C34961Fal r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36303Fzy.Ck7(X.Fal, boolean):void");
    }

    public C36303Fzy(UserSession userSession) {
        this.A0D = userSession;
        this.A0H = C2JD.A00(userSession);
        C18920wW A01 = AbstractC12220kQ.A01(new C35982Fug(this), userSession);
        this.A0C = A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0G = C18U.A06(c06090Tz, userSession, 36312728717296886L);
        if (C18U.A06(c06090Tz, userSession, 36313458861410325L)) {
            this.A01 = new C34721FRi(A01, userSession);
        }
        this.A0B = C18U.A06(c06090Tz, userSession, 36313931308075333L);
        this.A0A = C18U.A06(c06090Tz, userSession, 36313458861672473L);
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(c06090Tz, userSession, 36320382348894619L)) {
            this.A02 = C37058GUs.A00(userSession);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A03();
        C34721FRi c34721FRi = this.A01;
        if (c34721FRi != null) {
            c34721FRi.A00();
        }
    }
}
