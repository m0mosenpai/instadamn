package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.msys.mci.TraceLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.7TG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TG implements C7TH {
    public boolean A00;
    public Integer A01;
    public final Context A02;
    public final UserSession A03;
    public final C120005by A04;
    public final boolean A05;
    public final C7TI A06;

    public C7TG(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = new C7TI(userSession);
        C120005by A00 = C120005by.A00(userSession);
        C14360o3.A07(A00);
        this.A04 = A00;
        this.A01 = C05F.A00;
        this.A05 = C18U.A06(C06090Tz.A06, userSession, 36325669454558465L);
    }

    public static final String A03(C7TG c7tg, boolean z) {
        int i = z ? 15 : 4;
        C120005by c120005by = c7tg.A04;
        String createTraceIdForType = TraceLogger.createTraceIdForType(i);
        if (createTraceIdForType != null) {
            c120005by.A04(null, i, createTraceIdForType);
        }
        return createTraceIdForType;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A09(X.C7TG r12, java.lang.Integer r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, int r18, long r19, long r21, long r23, boolean r25, boolean r26) {
        /*
            r6 = r14
            if (r14 == 0) goto L60
            r5 = 4
            r9 = 4
            r11 = r26
            if (r26 == 0) goto Lb
            r9 = 15
        Lb:
            r4 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = r18
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            r0 = 8
            r1 = r17
            if (r1 == r0) goto L72
            r0 = 9
            if (r1 == r0) goto L73
            r5 = r1
            r2 = 0
        L27:
            long r0 = (long) r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            r0 = 53
            X.C120005by.A03(r14, r3, r9, r0, r4)
            if (r2 == 0) goto L3e
            r2 = 1003(0x3eb, float:1.406E-42)
            if (r13 != 0) goto L61
            r0 = 0
        L3b:
            X.C120005by.A03(r14, r0, r9, r2, r4)
        L3e:
            r3 = 7032(0x1b78, float:9.854E-42)
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            java.lang.Long[] r0 = new java.lang.Long[]{r2, r1, r0}
            java.util.List r0 = X.AbstractC16960so.A1Q(r0)
            X.C120005by.A03(r14, r0, r9, r3, r4)
            r5 = r12
            r10 = r25
            r7 = r15
            r8 = r16
            A0A(r5, r6, r7, r8, r9, r10, r11)
        L60:
            return
        L61:
            int r0 = r13.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r0)
            goto L3b
        L72:
            r5 = 2
        L73:
            r2 = 1
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.A09(X.7TG, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int, long, long, long, boolean, boolean):void");
    }

    public static final void A0B(C7TG c7tg, String str, String str2, String str3, int i, boolean z, boolean z2) {
        A09(c7tg, null, str, str2, str3, i, 1, 0L, 0L, 0L, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173  */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.1ae, X.1ea, X.1OW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair A0C(com.instagram.model.direct.DirectThreadKey r35, X.C211689Zc r36, X.C47Z r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.A0C(com.instagram.model.direct.DirectThreadKey, X.9Zc, X.47Z, java.lang.String, java.lang.String, java.lang.String, boolean):android.util.Pair");
    }

    @Deprecated(message = "Use [DirectSendMessageManager#sendTextMessageRx] instead.")
    public final String A0D(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        C14360o3.A0B(c3o9, 0);
        C7X3 A00 = C7X2.A00(this.A03);
        String str7 = str5;
        if (str5 == null) {
            str7 = str;
        }
        A00.A05(str7, true);
        return A02(c50679MYx, l7g, anonymousClass442, null, c47588Kzy, null, JRE.A01(c3o9), num, num2, num3, l, str, str2, str3, str4, str5, null, str6, null, null, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.1ae, X.1OW, X.1ip] */
    public final void A0E(UQL uql, C3o9 c3o9, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        int i3;
        int i4;
        C14360o3.A0B(str, 2);
        DirectThreadKey A01 = JRE.A01(c3o9);
        String A03 = A03(this, false);
        DirectThreadKey A012 = JRE.A01(A01);
        UserSession userSession = this.A03;
        C81663kb B3U = AbstractC28761aE.A00(userSession).B3U(A012);
        JTa A06 = AbstractC31277Doz.A06(userSession, LCT.A00(userSession, A012), C33891ip.class, str3, false, this.A00);
        Long A013 = LCT.A01(userSession, A01);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        if (B3U != null) {
            i3 = B3U.C7g();
            i4 = B3U.AdZ();
        } else {
            i3 = 0;
            i4 = 0;
        }
        C14360o3.A0B(A012, 2);
        ?? abstractC29011ae = new AbstractC29011ae(A06, A012, A013, currentTimeMillis);
        abstractC29011ae.A05 = A012;
        abstractC29011ae.A00 = i;
        abstractC29011ae.A09 = str;
        abstractC29011ae.A07 = str2;
        abstractC29011ae.A01 = i2;
        abstractC29011ae.A08 = str4;
        abstractC29011ae.A06 = l;
        abstractC29011ae.A0A = str5;
        abstractC29011ae.A03 = i3;
        abstractC29011ae.A02 = i4;
        abstractC29011ae.A0B = str6;
        abstractC29011ae.A04 = uql;
        A0B(this, A03, abstractC29011ae.A06(), A01.A00, 7, abstractC29011ae.A02.A07, false);
        A08(this, A01, abstractC29011ae.A06(), A03, null, 7, 1, abstractC29011ae.A02.A07, false);
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
        C142846ck A00 = AbstractC147806l5.A00(userSession);
        String str7 = A01.A00;
        C2EY c2ey = C2EY.A0z;
        A00.A0H(c2ey, this.A01, str7, false);
        C162337Ov.A0g(userSession, A01, c2ey, abstractC29011ae.A06(), abstractC29011ae.A02.A09);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, X.L7F] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1ei, X.1OW] */
    public final void A0G(EnumC159397Cz enumC159397Cz, C45059Jwo c45059Jwo, L1W l1w, DirectThreadKey directThreadKey, C2EY c2ey, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        L7F l7f;
        String A00;
        C14360o3.A0B(directThreadKey, 0);
        C14360o3.A0B(str, 1);
        UserSession userSession = this.A03;
        C7X3 A002 = C7X2.A00(userSession);
        if (str7 != null) {
            A002.A03(str7, false);
            IGFOAMessagingLocalSendSpeedLogger A003 = C7R5.A00(userSession, Integer.valueOf(str7.hashCode()));
            if (A003 != null) {
                A003.onLogTransportMessageEnd();
                A003.onLogSendServiceStart();
            }
        }
        String str8 = null;
        if (c45059Jwo != null && str3 != null && z) {
            String str9 = c45059Jwo.A06;
            String str10 = c45059Jwo.A07;
            String str11 = c45059Jwo.A03;
            ?? obj = new Object();
            obj.A00 = str9;
            obj.A01 = str10;
            obj.A02 = str11;
            l7f = obj;
        } else {
            l7f = null;
        }
        JTa A04 = AbstractC31277Doz.A04(userSession, l1w, C31391ei.class, str6, str7, z2);
        if (z) {
            A00 = "created";
        } else {
            A00 = AbstractC43591JPw.A00(142);
        }
        C47948LGd c47948LGd = new C47948LGd(l7f, c2ey, str, str2, str7, A00, str3, str4, str5);
        ?? c1ow = new C1OW(A04);
        c1ow.A02 = directThreadKey;
        c1ow.A03 = str;
        c1ow.A06 = z2;
        c1ow.A00 = enumC159397Cz;
        c1ow.A01 = c47948LGd;
        if (str7 != null) {
            A002.A05(str7, true);
        }
        String str12 = c1ow.A05;
        if (enumC159397Cz.A01()) {
            C120005by c120005by = this.A04;
            String createTraceIdForType = TraceLogger.createTraceIdForType(13);
            if (createTraceIdForType != null) {
                c120005by.A04(null, 13, createTraceIdForType);
            }
            str8 = createTraceIdForType;
            if (createTraceIdForType != null) {
                A0A(this, createTraceIdForType, str12, directThreadKey.A00, 13, z2, true);
            }
        }
        LIG lig = AbstractC47197KtW.A01;
        LIG.A00(userSession, c1ow.A05.hashCode(), LIG.A01(userSession, c1ow), true);
        lig.A02(userSession, c1ow, str8);
        C26141Ov.A01(userSession).A0B(c1ow);
        C162337Ov.A0g(userSession, directThreadKey, C2EY.A0m, str12, c1ow.A02.A09);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [X.1iz, X.1ae, X.1iv] */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.1ae, X.1iv, X.1iu] */
    public final void A0H(DirectShareTarget directShareTarget, C47Z c47z, String str) {
        Integer num;
        C7Q4 c7q4;
        C1OW c1ow;
        UserSession userSession = this.A03;
        C81663kb BZQ = AbstractC28761aE.A00(userSession).BZQ(directShareTarget);
        DirectThreadKey A03 = C4GQ.A03(BZQ);
        String str2 = directShareTarget.A0G;
        int i = directShareTarget.A00;
        if (i != Integer.MIN_VALUE) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            DirectPromptTypes A00 = C7D2.A00(intValue);
            F5F f5f = F5F.$redex_init_class;
            int ordinal = A00.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 6) {
                        if (c47z != null) {
                            c7q4 = AbstractC47064KrL.A00(c47z);
                            AbstractC54099Nvx.A00(c47z);
                            c47z.A0V = O12.A00;
                            if (str2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (c47z != null) {
                        c7q4 = LLY.A03(userSession, A03, c47z, C40121td.A0G.A01(this.A02, userSession));
                        AbstractC54099Nvx.A00(c47z);
                        c47z.A0V = O12.A00;
                    } else if (str == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (BZQ.C7g() == 29 && BZQ.C7g() != 28 && BZQ.C7g() != 61) {
                        JTa A02 = AbstractC31277Doz.A02(userSession, LCT.A00(userSession, A03), C33941iu.class);
                        Context context = this.A02;
                        String string = context.getString(2131959188);
                        C14360o3.A07(string);
                        Long A01 = LCT.A01(userSession, A03);
                        long currentTimeMillis = System.currentTimeMillis() * 1000;
                        String str3 = directShareTarget.A0M;
                        String string2 = context.getString(2131973168);
                        C14360o3.A07(string2);
                        ?? abstractC29011ae = new AbstractC29011ae(A02, A03, A01, currentTimeMillis);
                        abstractC29011ae.A03 = str2;
                        abstractC29011ae.A00 = intValue;
                        abstractC29011ae.A01 = c7q4;
                        C14360o3.A0B(A03, 0);
                        abstractC29011ae.A02 = A03;
                        abstractC29011ae.A04 = str;
                        abstractC29011ae.A02 = "";
                        if (c7q4 != null && c7q4.A06 == null) {
                            throw new IllegalStateException("Invalid DirectPendingVisualMedia object with null PendingMediaKey");
                        }
                        abstractC29011ae.A03 = string;
                        abstractC29011ae.A01 = null;
                        abstractC29011ae.A04 = str3;
                        abstractC29011ae.A02 = string2;
                        abstractC29011ae.A00 = 0;
                        c1ow = abstractC29011ae;
                    } else {
                        JTa A022 = AbstractC31277Doz.A02(userSession, LCT.A00(userSession, A03), C33991iz.class);
                        int C7g = BZQ.C7g();
                        int AdZ = BZQ.AdZ();
                        ?? abstractC29011ae2 = new AbstractC29011ae(A022, A03, LCT.A01(userSession, A03), System.currentTimeMillis() * 1000);
                        abstractC29011ae2.A03 = str2;
                        abstractC29011ae2.A00 = intValue;
                        abstractC29011ae2.A01 = c7q4;
                        C14360o3.A0B(A03, 0);
                        abstractC29011ae2.A02 = A03;
                        abstractC29011ae2.A04 = str;
                        abstractC29011ae2.A01 = C7g;
                        abstractC29011ae2.A00 = AdZ;
                        c1ow = abstractC29011ae2;
                    }
                    C26141Ov.A01(userSession).A0B(c1ow);
                    return;
                }
                if (str2 != null) {
                    if (str == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
                c7q4 = null;
                if (BZQ.C7g() == 29) {
                }
                JTa A0222 = AbstractC31277Doz.A02(userSession, LCT.A00(userSession, A03), C33991iz.class);
                int C7g2 = BZQ.C7g();
                int AdZ2 = BZQ.AdZ();
                ?? abstractC29011ae22 = new AbstractC29011ae(A0222, A03, LCT.A01(userSession, A03), System.currentTimeMillis() * 1000);
                abstractC29011ae22.A03 = str2;
                abstractC29011ae22.A00 = intValue;
                abstractC29011ae22.A01 = c7q4;
                C14360o3.A0B(A03, 0);
                abstractC29011ae22.A02 = A03;
                abstractC29011ae22.A04 = str;
                abstractC29011ae22.A01 = C7g2;
                abstractC29011ae22.A00 = AdZ2;
                c1ow = abstractC29011ae22;
                C26141Ov.A01(userSession).A0B(c1ow);
                return;
            }
            throw new IllegalArgumentException("Share target has unknown prompt type");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r0.A06 != true) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1lF, X.1OW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(X.InterfaceC83713oG r16, java.lang.String r17, java.lang.String r18, int r19) {
        /*
            r15 = this;
            r0 = 0
            r1 = r16
            X.C14360o3.A0B(r1, r0)
            r2 = 1
            r7 = r17
            X.C14360o3.A0B(r7, r2)
            r0 = 2
            r6 = r18
            X.C14360o3.A0B(r6, r0)
            X.3oF r0 = X.AbstractC140946Yw.A01(r1)
            com.instagram.model.direct.DirectThreadKey r5 = X.AbstractC140956Yx.A01(r0)
            com.instagram.common.session.UserSession r9 = r15.A03
            X.2DS r0 = X.AbstractC28761aE.A00(r9)
            X.3nh r1 = r0.BSh(r5, r7)
            if (r1 == 0) goto L73
            X.Jxp r0 = r1.A0D
            if (r0 == 0) goto L2f
            boolean r0 = r0.A06
            r4 = 1
            if (r0 == r2) goto L30
        L2f:
            r4 = 0
        L30:
            java.lang.Class<X.1kQ> r11 = X.C34851kQ.class
            boolean r14 = r1.A2P
            r12 = 0
            X.L1W r10 = r1.A0M()
            r13 = r12
            X.JTa r8 = X.AbstractC31277Doz.A04(r9, r10, r11, r12, r13, r14)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r1.A0V()
            java.lang.String r0 = r0.A00
            java.lang.String r3 = java.lang.String.valueOf(r0)
            boolean r2 = r1.A1S()
            r0 = 4
            X.C14360o3.A0B(r3, r0)
            X.1lF r1 = new X.1lF
            r1.<init>(r8)
            r0 = -1
            r1.A00 = r0
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r1.A01 = r5
            r1.A04 = r7
            r1.A02 = r3
            r1.A03 = r6
            r0 = r19
            r1.A00 = r0
            r1.A06 = r2
            r1.A05 = r4
            X.1Ov r0 = X.C26141Ov.A01(r9)
            r0.A0B(r1)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.A0J(X.3oG, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1kM, X.1OW] */
    public final void A0L(C3o9 c3o9, String str, List list, List list2, boolean z) {
        EnumC46267Kdz enumC46267Kdz;
        C14360o3.A0B(c3o9, 0);
        C14360o3.A0B(list, 2);
        C14360o3.A0B(list2, 3);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A03;
        JTa A04 = AbstractC31277Doz.A04(userSession, LCT.A00(userSession, A01), C34811kM.class, null, null, false);
        C14360o3.A0B(A01, 2);
        ?? c1ow = new C1OW(A04);
        c1ow.A00 = A01;
        c1ow.A02 = list;
        c1ow.A01 = list2;
        C26141Ov.A01(userSession).A0B(c1ow);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "direct_thread";
        C18920wW A00 = c12210kP.A00();
        InterfaceC02590Ai A002 = A00.A00(A00.A00, "direct_delete_message");
        if (A002.isSampled()) {
            A002.AAP("action", "done");
            A002.A7v("is_e2ee", Boolean.valueOf(JRE.A09(A01)));
            if (z) {
                enumC46267Kdz = EnumC46267Kdz.DIALOG;
            } else {
                enumC46267Kdz = EnumC46267Kdz.BULK_SELECTION;
            }
            A002.A8R(enumC46267Kdz, "menu_ui");
            A002.AAP("open_thread_id", AbstractC43827JZq.A01(A01));
            A002.A9K("occamadillo_thread_id", AbstractC43827JZq.A00(A01));
            A002.AAP("message_id", str);
            A002.AAk("message_ids", list);
            A002.Cht();
        }
    }

    @Override // X.C7TH
    public final void AGT(InterfaceC11380iw interfaceC11380iw, C83403nh c83403nh, DirectThreadKey directThreadKey) {
        Pair A01;
        String str;
        C14360o3.A0B(directThreadKey, 0);
        UserSession userSession = this.A03;
        C2DS A00 = AbstractC28761aE.A00(userSession);
        String str2 = c83403nh.A1f;
        C2EY c2ey = c83403nh.A10;
        if (str2 != null) {
            C14360o3.A07(c2ey);
            C162337Ov.A0m(userSession, C162337Ov.A04(c2ey, c83403nh.A1T, c83403nh.A2F), c83403nh.A0g());
            if (!c83403nh.A2F) {
                C2EY c2ey2 = c83403nh.A10;
                F5F f5f = F5F.$redex_init_class;
                int ordinal = c2ey2.ordinal();
                if (ordinal != 4) {
                    if (ordinal == 3) {
                        C7Q4 c7q4 = c83403nh.A0v;
                        if (c7q4 != null) {
                            str = c7q4.A06;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    C7Q5 c7q5 = c83403nh.A0w;
                    if (c7q5 != null) {
                        str = c7q5.A03;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (str != null) {
                    C40121td.A0G.A01(this.A02, userSession).A0J(str);
                }
            }
            C26141Ov A012 = C26141Ov.A01(userSession);
            synchronized (A012) {
                try {
                    C120185cH c120185cH = A012.A0A;
                    synchronized (c120185cH) {
                        A01 = c120185cH.A01(str2);
                    }
                    if (A01 != null) {
                        C26141Ov.A05(A012, (C1OW) A01.first, (MNP) A01.second);
                    } else {
                        A07(c83403nh, this, directThreadKey, "DirectSendMessageManager_cancel_mutation_not_found");
                    }
                } finally {
                }
            }
            return;
        }
        if (c2ey == C2EY.A1C) {
            C7Q4 c7q42 = c83403nh.A0v;
            if (c7q42 != null) {
                String str3 = c7q42.A06;
                if (str3 != null) {
                    C40121td.A0G.A01(this.A02, userSession).A0J(str3);
                    A00.EFl(directThreadKey, c83403nh.A0h(), c83403nh.A0g());
                    C2EY c2ey3 = c83403nh.A10;
                    C14360o3.A07(c2ey3);
                    C162337Ov.A0m(userSession, C162337Ov.A04(c2ey3, c83403nh.A1T, c83403nh.A2F), c83403nh.A0g());
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        C14360o3.A07(c2ey);
        C162337Ov.A0m(userSession, C162337Ov.A04(c2ey, c83403nh.A1T, c83403nh.A2F), c83403nh.A0g());
        A07(c83403nh, this, directThreadKey, "DirectSendMessageManager_cancel");
    }

    @Override // X.C7TH
    public final synchronized boolean BJs() {
        return this.A00;
    }

    @Override // X.C7TH
    public final synchronized Integer CIY() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (r0 != null) goto L14;
     */
    @Override // X.C7TH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EKv(android.content.Context r10, X.InterfaceC11380iw r11, X.C83403nh r12, com.instagram.model.direct.DirectThreadKey r13) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r13, r0)
            r6 = 4
            r5 = 3
            r2 = 57
            java.lang.Integer r1 = r12.A1F
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L7c
            com.instagram.common.session.UserSession r4 = r9.A03
            X.2DS r3 = X.AbstractC28761aE.A00(r4)
            long r7 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r12.A1B(r0)
            com.instagram.model.direct.DirectThreadKey r0 = X.JRE.A01(r13)
            r1 = 0
            java.lang.Long r0 = X.LCT.A01(r4, r0)
            r12.A1A(r0)
            java.lang.Integer r0 = X.C05F.A01
            r3.A9m(r12, r1, r13, r0)
            java.lang.String r3 = r12.A1f
            X.2EY r7 = r12.A10
            X.C14360o3.A07(r7)
            java.lang.Object r1 = r12.A1T
            boolean r0 = r12.A2F
            java.lang.String r1 = X.C162337Ov.A04(r7, r1, r0)
            java.lang.String r0 = r12.A0g()
            if (r3 == 0) goto L8e
            X.C162337Ov.A0h(r4, r13, r1, r0)
            boolean r0 = r12.A2F
            if (r0 != 0) goto L9c
            X.2EY r1 = r12.A10
            X.F5F r0 = X.F5F.$redex_init_class
            int r0 = r1.ordinal()
            java.lang.String r1 = "Required value was null."
            if (r0 == r6) goto L87
            if (r0 == r5) goto L7d
            if (r0 != r2) goto L9c
            X.7Q4 r0 = r12.A0v
            if (r0 == 0) goto L9c
        L63:
            java.lang.String r2 = r0.A06
        L65:
            if (r2 == 0) goto L9c
            X.1tg r1 = X.C40121td.A0G
            android.content.Context r0 = r9.A02
            X.1td r0 = r1.A01(r0, r4)
            boolean r0 = r0.A0L(r2)
            if (r0 != 0) goto La6
            X.5Fx r1 = X.AbstractC47202Ktb.A02
            java.lang.String r0 = "DirectSendMessageManager_retry_media_not_found"
        L79:
            A06(r12, r9, r1, r13, r0)
        L7c:
            return
        L7d:
            X.7Q4 r0 = r12.A0v
            if (r0 != 0) goto L63
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L87:
            X.7Q5 r0 = r12.A0w
            if (r0 == 0) goto L96
            java.lang.String r2 = r0.A03
            goto L65
        L8e:
            X.C162337Ov.A0h(r4, r13, r1, r0)
            X.5Fx r1 = X.C114675Fx.A0c
            java.lang.String r0 = "DirectSendMessageManager_retry"
            goto L79
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L9c:
            X.1Ov r1 = X.C26141Ov.A01(r4)
            X.Lpn r0 = new X.Lpn
            r0.<init>(r12, r9, r13)
            goto Laf
        La6:
            X.1Ov r1 = X.C26141Ov.A01(r4)
            X.Lpm r0 = new X.Lpm
            r0.<init>(r12, r9, r13)
        Laf:
            X.GXb r0 = (X.InterfaceC37116GXb) r0
            r1.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.EKv(android.content.Context, X.0iw, X.3nh, com.instagram.model.direct.DirectThreadKey):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1hh, X.1OW] */
    @Override // X.C7TH
    public final void EN1(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, boolean z) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c148286ly, 3);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession2 = this.A03;
        JTa A06 = AbstractC31277Doz.A06(userSession2, LCT.A00(userSession2, A01), C33191hh.class, str, z, this.A00);
        Long A012 = LCT.A01(userSession2, c3o9);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        C14360o3.A0B(A01, 2);
        ?? abstractC29011ae = new AbstractC29011ae(A06, A01, A012, currentTimeMillis);
        abstractC29011ae.A03 = A01;
        abstractC29011ae.A00 = userSession2;
        String str2 = c148286ly.A0U;
        if (str2 == null) {
            str2 = "";
        }
        abstractC29011ae.A04 = str2;
        String str3 = c148286ly.A0S;
        boolean z2 = false;
        C14360o3.A0B(str3, 0);
        abstractC29011ae.A05 = str3;
        ImageUrl imageUrl = c148286ly.A0H;
        C14360o3.A0B(imageUrl, 0);
        abstractC29011ae.A01 = imageUrl;
        abstractC29011ae.A02 = anonymousClass442;
        C26141Ov.A01(userSession2).A0B(abstractC29011ae);
        C142846ck A00 = AbstractC147806l5.A00(userSession2);
        String str4 = A01.A00;
        C2EY c2ey = C2EY.A0I;
        if (anonymousClass442 != null) {
            z2 = true;
        }
        A00.A0H(c2ey, this.A01, str4, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.1ae, X.1eB, X.1OW] */
    @Override // X.C7TH
    public final void EN3(Context context, UserSession userSession, AnonymousClass442 anonymousClass442, DirectAnimatedMedia directAnimatedMedia, InterfaceC83713oG interfaceC83713oG, String str, String str2, List list, boolean z) {
        Boolean bool;
        C14360o3.A0B(directAnimatedMedia, 2);
        C14360o3.A0B(userSession, 6);
        DirectThreadKey A01 = AbstractC140956Yx.A01(AbstractC140946Yw.A01(interfaceC83713oG));
        L1W A00 = LCT.A00(userSession, A01);
        if (A00 != null) {
            bool = Boolean.valueOf(AbstractC46831KnQ.A00(A00));
        } else {
            bool = null;
        }
        boolean A012 = AbstractC159387Cy.A02(userSession, A01, bool, C05F.A06, z).A01();
        String A03 = A03(this, A012);
        UserSession userSession2 = this.A03;
        C7X3 A002 = C7X2.A00(userSession2);
        if (str2 != null) {
            A002.A03(str2, false);
            IGFOAMessagingLocalSendSpeedLogger logger = C7N0.A00(userSession).getLogger(Integer.valueOf(str2.hashCode()));
            if (logger != null) {
                logger.onLogTransportMessageEnd();
                logger.onLogSendServiceStart();
            }
        }
        JTa A032 = AbstractC31277Doz.A03(userSession, A00, C31071eB.class, null, str, str2, z, this.A00);
        A08(this, A01, A032.A03, A03, null, 3, 1, z, A012);
        ?? abstractC29011ae = new AbstractC29011ae(A032, A01, LCT.A01(userSession, A01), System.currentTimeMillis() * 1000);
        abstractC29011ae.A03 = directAnimatedMedia;
        abstractC29011ae.A01 = anonymousClass442;
        if (str2 != null) {
            A002.A05(str2, true);
        }
        A0B(this, A03, abstractC29011ae.A06(), A01.A00, 3, z, A012);
        C26141Ov.A01(userSession2).A0B(abstractC29011ae);
        C142846ck A003 = AbstractC147806l5.A00(userSession2);
        String str3 = A01.A00;
        C2EY c2ey = C2EY.A0K;
        boolean z2 = false;
        if (anonymousClass442 != null) {
            z2 = true;
        }
        A003.A0H(c2ey, this.A01, str3, z2);
        C162337Ov.A0g(userSession2, A01, c2ey, abstractC29011ae.A06(), abstractC29011ae.A02.A09);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r37.A05() != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7TH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EN8(android.content.Context r34, com.instagram.common.session.UserSession r35, X.C148286ly r36, X.AnonymousClass442 r37, X.C3o9 r38, java.lang.String r39, java.util.List r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.EN8(android.content.Context, com.instagram.common.session.UserSession, X.6ly, X.442, X.3o9, java.lang.String, java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.1ae, X.1hl, X.1OW] */
    @Override // X.C7TH
    public final void ENI(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, boolean z) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c148286ly, 3);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession2 = this.A03;
        JTa A06 = AbstractC31277Doz.A06(userSession2, LCT.A00(userSession2, A01), C33231hl.class, str, z, this.A00);
        Long A012 = LCT.A01(userSession2, c3o9);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        C14360o3.A0B(A01, 2);
        ?? abstractC29011ae = new AbstractC29011ae(A06, A01, A012, currentTimeMillis);
        abstractC29011ae.A02 = A01;
        abstractC29011ae.A00 = userSession2;
        String str2 = c148286ly.A0S;
        C14360o3.A0B(str2, 0);
        abstractC29011ae.A04 = str2;
        String url = c148286ly.A0H.getUrl();
        C14360o3.A07(url);
        abstractC29011ae.A03 = new ExtendedImageUrl(url, (int) c148286ly.A01, (int) c148286ly.A00);
        abstractC29011ae.A01 = anonymousClass442;
        C26141Ov.A01(userSession2).A0B(abstractC29011ae);
        C142846ck A00 = AbstractC147806l5.A00(userSession2);
        String str3 = A01.A00;
        C2EY c2ey = C2EY.A0e;
        boolean z2 = false;
        if (anonymousClass442 != null) {
            z2 = true;
        }
        A00.A0H(c2ey, this.A01, str3, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.1kQ, X.1OW] */
    @Override // X.C7TH
    public final void ENK(InterfaceC83713oG interfaceC83713oG, String str, String str2, String str3) {
        String A0g;
        C14360o3.A0B(interfaceC83713oG, 0);
        DirectThreadKey A01 = AbstractC140956Yx.A01(AbstractC140946Yw.A01(interfaceC83713oG));
        UserSession userSession = this.A03;
        C83403nh BSh = AbstractC28761aE.A00(userSession).BSh(A01, str);
        if (BSh != null && (A0g = BSh.A0g()) != null) {
            boolean z = BSh.A2P;
            L1W A0M = BSh.A0M();
            String str4 = A0g;
            if (BSh.A1S()) {
                str4 = null;
            }
            JTa A04 = AbstractC31277Doz.A04(userSession, A0M, C34851kQ.class, str3, str4, z);
            int i = BSh.A01 + 1;
            EnumC159397Cz A00 = AbstractC1586079v.A00(BSh);
            C14360o3.A0B(A0g, 4);
            ?? c1ow = new C1OW(A04);
            C14360o3.A0B(A01, 0);
            c1ow.A02 = A01;
            c1ow.A05 = str;
            c1ow.A03 = A0g;
            c1ow.A04 = str2;
            c1ow.A00 = i;
            c1ow.A01 = A00;
            LIG lig = AbstractC47197KtW.A01;
            LIG.A00(userSession, c1ow.A05.hashCode(), BSh.A1S(), true);
            lig.A02(userSession, c1ow, null);
            if (BSh.A1S()) {
                C120005by c120005by = this.A04;
                String createTraceIdForType = TraceLogger.createTraceIdForType(13);
                if (createTraceIdForType != null) {
                    c120005by.A04(null, 13, createTraceIdForType);
                    A0A(this, createTraceIdForType, c1ow.A05, A01.A00, 13, BSh.A2P, true);
                }
            }
            C26141Ov.A01(userSession).A0B(c1ow);
            return;
        }
        C18950wb.A01.AEp("Failed to send edit message. Error: mutation creation failed", 20134884);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1lJ, X.1OW] */
    @Override // X.C7TH
    public final void ENS(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        UserSession userSession = this.A03;
        DirectThreadKey BKb = AbstractC28761aE.A00(userSession).BZQ(directShareTarget).BKb();
        ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A04(userSession, LCT.A00(userSession, BKb), C35371lJ.class, str3, null, z), BKb, LCT.A01(userSession, BKb), System.currentTimeMillis() * 1000);
        abstractC29011ae.A01 = "";
        abstractC29011ae.A00 = str;
        abstractC29011ae.A01 = str2;
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
    }

    @Override // X.C7TH
    public final void ENb(EnumC159397Cz enumC159397Cz, C45059Jwo c45059Jwo, L1W l1w, C2EY c2ey, C3o9 c3o9, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        C14360o3.A0B(c3o9, 0);
        C14360o3.A0B(str, 1);
        A0G(enumC159397Cz, c45059Jwo, l1w, JRE.A01(c3o9), c2ey, str, str2, str3, str4, str5, str6, str7, z, z2);
    }

    @Override // X.C7TH
    public final C42221xC ENn(C26086BgF c26086BgF, C47588Kzy c47588Kzy, C3o9 c3o9, String str, String str2, String str3, List list, boolean z) {
        C14360o3.A0B(str2, 5);
        return C42221xC.A06(new C48474LcR(c26086BgF, this, c47588Kzy, c3o9, str, str2, str3, list, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.1ae, X.1m3, X.1OW] */
    @Override // X.C7TH
    public final void ENo(Context context, UserSession userSession, C3o9 c3o9, JIN jin, String str, boolean z) {
        String displayArtist;
        C14360o3.A0B(jin, 3);
        C14360o3.A0B(str, 5);
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession2 = this.A03;
        JTa A06 = AbstractC31277Doz.A06(userSession2, LCT.A00(userSession2, A01), C35831m3.class, str, z, this.A00);
        Long A012 = LCT.A01(userSession2, c3o9);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        C14360o3.A0B(A01, 2);
        ?? abstractC29011ae = new AbstractC29011ae(A06, A01, A012, currentTimeMillis);
        abstractC29011ae.A00 = A01;
        abstractC29011ae.A02 = jin.getAudioClusterId();
        String title = jin.getTitle();
        C14360o3.A0B(title, 0);
        abstractC29011ae.A04 = title;
        String formattedClipsMediaCount = jin.getFormattedClipsMediaCount();
        if (formattedClipsMediaCount != null && formattedClipsMediaCount.length() != 0) {
            String lowerCase = jin.getDisplayArtist().toLowerCase(C1Q2.A02());
            C14360o3.A07(lowerCase);
            displayArtist = AnonymousClass001.A0T(lowerCase, jin.getFormattedClipsMediaCount(), (char) 183);
        } else {
            displayArtist = jin.getDisplayArtist();
        }
        C14360o3.A0B(displayArtist, 0);
        abstractC29011ae.A03 = displayArtist;
        String CAL = jin.CAL();
        C14360o3.A0B(CAL, 0);
        abstractC29011ae.A05 = CAL;
        String url = jin.AsT().getUrl();
        C14360o3.A07(url);
        abstractC29011ae.A01 = new ExtendedImageUrl(url, jin.AsT().getWidth(), jin.AsT().getHeight());
        C26141Ov.A01(userSession2).A0B(abstractC29011ae);
        C142846ck A00 = AbstractC147806l5.A00(userSession2);
        String str2 = A01.A00;
        C2EY c2ey = C2EY.A0j;
        A00.A0H(c2ey, this.A01, str2, false);
        C162337Ov.A0g(userSession2, A01, c2ey, abstractC29011ae.A06(), abstractC29011ae.A02.A09);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.L4q] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.1ae, X.1ih, X.1OW] */
    @Override // X.C7TH
    public final void ENs(DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, InterfaceC83713oG interfaceC83713oG, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        boolean z;
        C14360o3.A0B(directAnimatedMedia, 3);
        UserSession userSession = this.A03;
        JTa A08 = AbstractC31277Doz.A08(userSession, C33811ih.class);
        Long A01 = LCT.A01(userSession, directThreadKey);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        C14360o3.A0B(A08, 1);
        ?? abstractC29011ae = new AbstractC29011ae(A08, directThreadKey, A01, currentTimeMillis);
        String str4 = directAnimatedMedia.A05;
        Boolean bool = directAnimatedMedia.A04;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        boolean z2 = directAnimatedMedia.A06;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        C14360o3.A0B(str4, 2);
        ?? obj = new Object();
        obj.A00 = j;
        obj.A05 = str4;
        obj.A06 = z;
        obj.A07 = z2;
        obj.A03 = str;
        obj.A04 = str2;
        obj.A01 = extendedImageUrl;
        obj.A02 = gifUrlImpl;
        abstractC29011ae.A00 = obj;
        abstractC29011ae.A01 = str3;
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
    }

    @Override // X.C7TH
    public final void ENt(C148286ly c148286ly, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        C14360o3.A0B(c148286ly, 2);
        UserSession userSession = this.A03;
        C26141Ov.A01(userSession).A0B(new C33851il(c148286ly, AbstractC31277Doz.A08(userSession, C33851il.class), directThreadKey, extendedImageUrl, LCT.A01(userSession, directThreadKey), str, str2, str3, System.currentTimeMillis() * 1000, j));
    }

    @Override // X.C7TH
    public final ListenableFuture ENz(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, String str4, List list, boolean z) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        String str5 = A01.A00;
        C2EY c2ey = C2EY.A1C;
        boolean z2 = false;
        if (anonymousClass442 != null) {
            z2 = true;
        }
        ListenableFuture submit = MoreExecutors.listeningDecorator(new C14140ne(20641710, 3, false, false)).submit(new M8A(c9ck, c26086BgF, anonymousClass442, this, c47588Kzy, A01, c47z, c183978Ee, A00(this, c2ey, str5, z2), str, str3, str4, z));
        C14360o3.A07(submit);
        return submit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1l9, X.1OW] */
    @Override // X.C7TH
    public final void EO2(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        UserSession userSession = this.A03;
        DirectThreadKey BKb = AbstractC28761aE.A00(userSession).BZQ(directShareTarget).BKb();
        ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A04(userSession, LCT.A00(userSession, BKb), C35271l9.class, str3, null, z), BKb, LCT.A01(userSession, BKb), System.currentTimeMillis() * 1000);
        abstractC29011ae.A01 = "";
        abstractC29011ae.A00 = str;
        abstractC29011ae.A01 = str2;
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.1ae, X.1dW, X.1OW] */
    @Override // X.C7TH
    public final void EO6(AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, String str2, String str3, String str4, String str5) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A03;
        JTa A06 = AbstractC31277Doz.A06(userSession, LCT.A00(userSession, A01), C30671dW.class, null, false, this.A00);
        Long A012 = LCT.A01(userSession, c3o9);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        C14360o3.A0B(A01, 6);
        ?? abstractC29011ae = new AbstractC29011ae(A06, A01, A012, currentTimeMillis);
        abstractC29011ae.A02 = str;
        abstractC29011ae.A03 = str2;
        abstractC29011ae.A04 = str3;
        abstractC29011ae.A01 = A01;
        abstractC29011ae.A05 = str4;
        abstractC29011ae.A00 = anonymousClass442;
        String A013 = LJP.A01(userSession, abstractC29011ae, null, str4, A01.A00, null);
        LIG lig = AbstractC47197KtW.A01;
        LIG.A00(userSession, abstractC29011ae.A05.hashCode(), LIG.A01(userSession, abstractC29011ae), true);
        lig.A02(userSession, abstractC29011ae, A013);
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
        C162337Ov.A0g(userSession, A01, C2EY.A0z, abstractC29011ae.A06(), abstractC29011ae.A02.A09);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1l5, X.1OW] */
    @Override // X.C7TH
    public final void EO9(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        UserSession userSession = this.A03;
        DirectThreadKey BKb = AbstractC28761aE.A00(userSession).BZQ(directShareTarget).BKb();
        ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A04(userSession, LCT.A00(userSession, BKb), C1l5.class, str3, null, z), BKb, LCT.A01(userSession, BKb), System.currentTimeMillis() * 1000);
        abstractC29011ae.A01 = "";
        abstractC29011ae.A00 = str;
        abstractC29011ae.A01 = str2;
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1m7, X.1OW] */
    @Override // X.C7TH
    public final void EOL(InterfaceC83713oG interfaceC83713oG, String str, String str2, long j) {
        C14360o3.A0B(interfaceC83713oG, 0);
        DirectThreadKey A01 = AbstractC140956Yx.A01(AbstractC140946Yw.A01(interfaceC83713oG));
        UserSession userSession = this.A03;
        if (LCT.A00(userSession, A01) == null) {
            ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A06(userSession, null, C35871m7.class, str2, false, this.A00), A01, LCT.A01(userSession, A01), System.currentTimeMillis() * 1000);
            abstractC29011ae.A01 = str;
            abstractC29011ae.A00 = j;
            C26141Ov.A01(userSession).A0B(abstractC29011ae);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.1ae, X.1hp, X.1OW] */
    @Override // X.C7TH
    public final void EOT(AnonymousClass442 anonymousClass442, DirectStoreSticker directStoreSticker, InterfaceC83713oG interfaceC83713oG, String str) {
        C14360o3.A0B(directStoreSticker, 1);
        DirectThreadKey A01 = AbstractC140956Yx.A01(AbstractC140946Yw.A01(interfaceC83713oG));
        UserSession userSession = this.A03;
        ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A06(userSession, LCT.A00(userSession, A01), C33271hp.class, str, false, this.A00), A01, LCT.A01(userSession, A01), System.currentTimeMillis() * 1000);
        C14360o3.A0B(A01, 0);
        abstractC29011ae.A02 = A01;
        abstractC29011ae.A00 = userSession;
        String str2 = directStoreSticker.A04;
        C14360o3.A0B(str2, 0);
        abstractC29011ae.A04 = str2;
        abstractC29011ae.A03 = directStoreSticker;
        abstractC29011ae.A01 = anonymousClass442;
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
    }

    @Override // X.C7TH
    @Deprecated(message = "Use [DirectSendMessageManager#sendTextMessageRx] instead.")
    public final String EOY(Context context, L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(c3o9, 1);
        C14360o3.A0B(str, 2);
        C7X2.A00(this.A03).A05(str, true);
        return A0D(null, null, anonymousClass442, c47588Kzy, JRE.A01(c3o9), null, null, num, null, str, str2, str3, null, null, null, z, false);
    }

    @Override // X.C7TH
    public final C42221xC EOb(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, DirectShareTarget directShareTarget, C2EY c2ey, InterfaceC83713oG interfaceC83713oG, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC83713oG, 0);
        C14360o3.A0B(str, 2);
        return EOa(null, null, anonymousClass442, null, directShareTarget, c2ey, interfaceC83713oG, null, null, null, null, null, null, str, str2, str3, null, null, null, null, list, z, false, z2, false);
    }

    @Override // X.C7TH
    public final ListenableFuture EOh(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        C14360o3.A0B(c3o9, 0);
        C14360o3.A0B(clipInfo, 2);
        DirectThreadKey A01 = JRE.A01(c3o9);
        String str6 = A01.A00;
        C2EY c2ey = C2EY.A1C;
        boolean z2 = false;
        if (anonymousClass442 != null) {
            z2 = true;
        }
        ListenableFuture submit = MoreExecutors.listeningDecorator(new C14140ne(311177733, 3, false, false)).submit(new M8B(c9ck, c26086BgF, anonymousClass442, this, c47588Kzy, A01, clipInfo, c47z, A00(this, c2ey, str6, z2), str2, str4, str5, str, z));
        C14360o3.A07(submit);
        return submit;
    }

    @Override // X.C7TH
    public final void EOj(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        C14360o3.A0B(clipInfo, 2);
        DirectThreadKey A01 = JRE.A01(c3o9);
        String str6 = A01.A00;
        C2EY c2ey = C2EY.A1C;
        boolean z2 = false;
        if (anonymousClass442 != null) {
            z2 = true;
        }
        A01(c26086BgF, anonymousClass442, this, c47588Kzy, A01, str2, str4, str5, new MEL(c26086BgF, anonymousClass442, this, c47588Kzy, A01, clipInfo, c47z, A00(this, c2ey, str6, z2), str, str2, str4, str5, z), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1l1, X.1OW] */
    @Override // X.C7TH
    public final void EOq(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        UserSession userSession = this.A03;
        DirectThreadKey BKb = AbstractC28761aE.A00(userSession).BZQ(directShareTarget).BKb();
        ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A04(userSession, LCT.A00(userSession, BKb), C1l1.class, str3, null, z), BKb, LCT.A01(userSession, BKb), System.currentTimeMillis() * 1000);
        abstractC29011ae.A00 = "";
        abstractC29011ae.A01 = str;
        abstractC29011ae.A00 = str2;
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
    }

    @Override // X.C7TH
    public final synchronized void EWd(boolean z) {
        this.A00 = z;
    }

    @Override // X.C7TH
    public final synchronized void EhS(Integer num) {
        C14360o3.A0B(num, 0);
        this.A01 = num;
    }

    @Override // X.C7TH
    public final ListenableFuture F9r(AbstractC46511KiA abstractC46511KiA, C3o9 c3o9, String str) {
        ListenableFuture c25191Kx;
        String str2;
        C14360o3.A0B(c3o9, 0);
        if (abstractC46511KiA instanceof KWh) {
            KWh kWh = (KWh) abstractC46511KiA;
            C83403nh c83403nh = kWh.A00;
            String A0h = c83403nh.A0h();
            if (A0h != null) {
                boolean A1S = c83403nh.A1S();
                if (A1S) {
                    C120005by c120005by = this.A04;
                    str2 = TraceLogger.createTraceIdForType(13);
                    if (str2 != null) {
                        c120005by.A04(null, 13, str2);
                    }
                } else {
                    str2 = null;
                }
                c25191Kx = MoreExecutors.listeningDecorator(new C14140ne(1237370584, 3, false, false)).submit(new M88(c83403nh, this, kWh, c3o9, A0h, str2, A1S));
            } else {
                C0w9.A04("DirectSendMessageManager_message_id_not_found", "Cannot unsend message without id", 1);
                c25191Kx = new C25191Kx(true);
            }
            C14360o3.A0A(c25191Kx);
            return c25191Kx;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r5 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean A00(X.C7TG r2, X.C2EY r3, java.lang.String r4, boolean r5) {
        /*
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L8
            r0 = 0
            return r0
        L8:
            com.instagram.common.session.UserSession r0 = r2.A03
            X.6ck r0 = X.AbstractC147806l5.A00(r0)
            r0.A0H(r3, r1, r4, r5)
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L18
            r0 = 1
            if (r5 == 0) goto L19
        L18:
            r0 = 0
        L19:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.A00(X.7TG, X.2EY, java.lang.String, boolean):java.lang.Boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r49.A05() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C9CK r48, X.AnonymousClass442 r49, X.C7TG r50, X.C47588Kzy r51, com.instagram.model.direct.DirectThreadKey r52, X.C47Z r53, X.C183978Ee r54, java.lang.Boolean r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, boolean r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.A05(X.9CK, X.442, X.7TG, X.Kzy, com.instagram.model.direct.DirectThreadKey, X.47Z, X.8Ee, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public static final void A06(C83403nh c83403nh, C7TG c7tg, C114675Fx c114675Fx, DirectThreadKey directThreadKey, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to retry message: type=");
        sb.append(c83403nh.A10);
        sb.append(" sendError=");
        sb.append(c114675Fx);
        C0w9.A04(str, sb.toString(), 1);
        UserSession userSession = c7tg.A03;
        C14360o3.A0B(c114675Fx, 3);
        C2DU c2du = (C2DU) AbstractC28761aE.A00(userSession);
        synchronized (c2du) {
            if (!AbstractC50102Ry.A00(c83403nh.A0r, c114675Fx)) {
                C114675Fx c114675Fx2 = c83403nh.A0r;
                C114675Fx c114675Fx3 = C114675Fx.A0W;
                if (c114675Fx2 != null || c114675Fx != c114675Fx3) {
                    c83403nh.A2C = true;
                    c83403nh.A0r = c114675Fx;
                }
            }
            Integer num = C05F.A0Y;
            Integer num2 = C05F.A0C;
            if (c83403nh.A1m(num)) {
                C25671My c25671My = c2du.A06;
                List singletonList = Collections.singletonList(c83403nh);
                C14360o3.A07(singletonList);
                c25671My.E4s(new C2Io(directThreadKey, num2, null, null, singletonList, false));
                C2DU.A0F(c2du, c2du.A0P(directThreadKey));
            }
        }
    }

    public static final void A07(C83403nh c83403nh, C7TG c7tg, DirectThreadKey directThreadKey, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to cancel message: type=");
        sb.append(c83403nh.A10);
        C0w9.A04(str, sb.toString(), 1);
        AbstractC28761aE.A00(c7tg.A03).EFl(directThreadKey, c83403nh.A0h(), c83403nh.A0g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r2.A0M() != true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r2 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.C7TG r18, com.instagram.model.direct.DirectThreadKey r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24, boolean r25, boolean r26) {
        /*
            r0 = r18
            com.instagram.common.session.UserSession r3 = r0.A03
            r5 = r26
            boolean r0 = X.LCU.A01(r3, r5)
            if (r0 == 0) goto L7a
            r2 = r19
            java.lang.String r11 = r2.A00
            r7 = r20
            int r8 = r7.hashCode()
            java.lang.Integer r0 = X.C05F.A0C
            r13 = 0
            r1 = 1
            X.Kb5 r4 = X.C163307Sp.A01(r3, r0, r8, r5, r1)
            if (r4 == 0) goto L7a
            r4.onStartFlow()
            r9 = r21
            if (r21 == 0) goto L2d
            r4.onLogFlowConnectId()
            r4.onLogArmadilloTlcControlOpenThread()
        L2d:
            X.2DS r0 = X.AbstractC28761aE.A00(r3)
            X.2DU r0 = (X.C2DU) r0
            X.3kb r2 = X.C2DU.A03(r0, r2)
            r6 = 4
            if (r26 == 0) goto L3c
            r6 = 15
        L3c:
            r10 = 3
            if (r2 == 0) goto L7e
            X.L1W r0 = r2.B2W()
            if (r0 == 0) goto L7e
            boolean r12 = X.AbstractC46831KnQ.A00(r0)
        L49:
            java.lang.Long r13 = X.AbstractC160897Ix.A01(r2)
            X.7Iy r0 = X.C160907Iy.A00
            java.lang.Long r14 = r0.A01(r3, r2)
            boolean r0 = r2.CVQ()
            if (r0 != r1) goto L83
            java.lang.String r16 = "group"
        L5b:
            if (r26 == 0) goto L7b
            java.lang.String r17 = "ig_advanced_crypto_transport"
        L5f:
            if (r2 == 0) goto L69
            boolean r0 = r2.A0M()
            r19 = 1
            if (r0 == r1) goto L6b
        L69:
            r19 = 0
        L6b:
            java.lang.Integer r20 = java.lang.Integer.valueOf(r23)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r24)
            r15 = r25
            r18 = r5
            r4.logTraceAnnotations(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L7a:
            return
        L7b:
            java.lang.String r17 = "ig_django"
            goto L5f
        L7e:
            r12 = 0
            r14 = 0
            if (r2 == 0) goto L83
            goto L49
        L83:
            java.lang.String r16 = "one_to_one"
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.A08(X.7TG, com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean):void");
    }

    public final void A0F(ImageUrl imageUrl, C47Z c47z, String str, String str2, String str3, String str4, long j) {
        L1W l1w;
        Integer num;
        PendingRecipient pendingRecipient = new PendingRecipient(imageUrl, str2, str3);
        DirectShareTarget directShareTarget = new DirectShareTarget(pendingRecipient);
        UserSession userSession = this.A03;
        C2DS A00 = AbstractC28761aE.A00(userSession);
        DirectThreadKey BKb = A00.BZQ(directShareTarget).BKb();
        C81663kb A03 = C2DU.A03((C2DU) A00, BKb);
        Boolean bool = null;
        if (A03 != null) {
            l1w = A03.B2W();
        } else {
            l1w = null;
        }
        if (c47z.A11()) {
            num = C05F.A0Y;
        } else {
            num = C05F.A0N;
        }
        if (l1w != null) {
            bool = Boolean.valueOf(AbstractC46831KnQ.A00(l1w));
        }
        c47z.A5D = AbstractC159387Cy.A02(userSession, BKb, bool, num, false).A01();
        C26141Ov.A01(userSession).A0B(new C33731iZ(AbstractC31277Doz.A02(userSession, l1w, C33731iZ.class), AbstractC47064KrL.A00(c47z), BKb, new ExtendedImageUrl(pendingRecipient.A03), LCT.A01(userSession, BKb), pendingRecipient.A0C, str, str4, j, System.currentTimeMillis() * 1000));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006f, code lost:
    
        if (r6.length() == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.1ae, X.1bv, X.1OW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(com.instagram.model.direct.DirectThreadKey r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r23 = this;
            r5 = r26
            r6 = r25
            r8 = 0
            r0 = 6
            r4 = r28
            X.C14360o3.A0B(r4, r0)
            r0 = 9
            r3 = r31
            X.C14360o3.A0B(r3, r0)
            r0 = 10
            r2 = r32
            X.C14360o3.A0B(r2, r0)
            r11 = r23
            java.lang.String r14 = A03(r11, r8)
            com.instagram.common.session.UserSession r1 = r11.A03
            java.lang.Class<X.1dj> r7 = X.C30801dj.class
            r12 = r24
            X.L1W r0 = X.LCT.A00(r1, r12)
            r15 = 0
            X.JTa r0 = X.AbstractC31277Doz.A02(r1, r0, r7)
            java.lang.String r13 = r0.A03
            r16 = 7
            r17 = 1
            r19 = r8
            r18 = r8
            A08(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Long r20 = X.LCT.A01(r1, r12)
            long r21 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r9
            X.1bv r7 = new X.1bv
            r17 = r7
            r18 = r0
            r19 = r12
            r17.<init>(r18, r19, r20, r21)
            r9 = r27
            r7.A04 = r9
            r7.A03 = r4
            r0 = r29
            r7.A02 = r0
            r7.A01 = r3
            r3 = r30
            r7.A00 = r3
            r7.A06 = r2
            r2 = r33
            r7.A05 = r2
            if (r25 == 0) goto L71
            int r3 = r6.length()
            r2 = 0
            if (r3 != 0) goto L72
        L71:
            r2 = 1
        L72:
            java.lang.String r3 = ""
            if (r2 == 0) goto L77
            r6 = r3
        L77:
            if (r26 == 0) goto L7f
            int r2 = r5.length()
            if (r2 != 0) goto L80
        L7f:
            r5 = r3
        L80:
            int r2 = r4.length()
            if (r2 == 0) goto Ldb
            if (r29 == 0) goto Ldb
            int r2 = r0.length()
            if (r2 == 0) goto Ldb
            if (r27 == 0) goto Ldb
            int r2 = r9.length()
            if (r2 == 0) goto Ldb
            java.util.Locale r3 = java.util.Locale.US
            r2 = 3
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r9}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "https://www.instagram.com/_n/business_order?merchant_id=%s&consumer_id=%s&order_id=%s"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            X.C14360o3.A07(r0)
        Laa:
            X.43t r0 = X.AbstractC47996LLi.A0I(r6, r5, r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r7.A07 = r0
            java.lang.String r15 = r7.A06()
            java.lang.String r0 = r12.A00
            r13 = r11
            r17 = r16
            r18 = r8
            r19 = r8
            r16 = r0
            A0B(r13, r14, r15, r16, r17, r18, r19)
            X.1Ov r0 = X.C26141Ov.A01(r1)
            r0.A0B(r7)
            X.2EY r3 = X.C2EY.A1K
            java.lang.String r2 = r7.A06()
            X.JTa r0 = r7.A02
            boolean r0 = r0.A09
            X.C162337Ov.A0g(r1, r12, r3, r2, r0)
            return
        Ldb:
            r0 = 0
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.A0I(com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.C7TH
    public final C42221xC AGU(C3o9 c3o9, String str) {
        throw new IllegalStateException("Stub");
    }

    @Override // X.C7TH
    public final C42221xC EKw(C3o9 c3o9, String str) {
        throw new IllegalStateException("stub");
    }

    @Override // X.C7TH
    public final void ENO(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        A02(null, l7g, anonymousClass442, null, c47588Kzy, null, JRE.A01(c3o9), num, num2, null, l, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, null, null, null, str4, null, list, z, false);
    }

    @Override // X.C7TH
    public final void ENY(Capabilities capabilities, C3o9 c3o9, String str, String str2, String str3, String str4, String str5) {
        String str6;
        C2EY c2ey;
        boolean z;
        L1W l1w;
        EnumC159397Cz enumC159397Cz;
        String str7 = str;
        String A00 = AbstractC43591JPw.A00(1264);
        if (c3o9 instanceof DirectThreadKey) {
            UserSession userSession = this.A03;
            DirectThreadKey directThreadKey = (DirectThreadKey) c3o9;
            C83403nh BSh = AbstractC28761aE.A00(userSession).BSh(directThreadKey, str7);
            if (BSh == null && str2 != null) {
                BSh = AbstractC28761aE.A00(userSession).BSg(directThreadKey, str2);
            }
            if (capabilities.A00(EnumC2054697t.A0u)) {
                ImmutableList immutableList = C83863oV.A07;
                str6 = "❤";
            } else {
                str6 = null;
            }
            if (str == null && (BSh == null || (str7 = BSh.A0h()) == null)) {
                return;
            }
            if (BSh != null) {
                c2ey = BSh.A10;
                z = BSh.A2P;
                l1w = BSh.A0M();
                enumC159397Cz = AbstractC1586079v.A00(BSh);
            } else {
                c2ey = null;
                z = false;
                l1w = null;
                enumC159397Cz = EnumC159397Cz.A06;
            }
            A0G(enumC159397Cz, null, l1w, directThreadKey, c2ey, str7, str2, str6, NetInfoModule.CONNECTION_TYPE_NONE, "push_notif", A00, null, true, z);
            return;
        }
        throw new IllegalArgumentException("ThreadKey must be of type DirectThreadKey");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.1ae, X.1be, X.1OW] */
    @Override // X.C7TH
    public final void ENa(C47588Kzy c47588Kzy, C3o9 c3o9, String str, boolean z) {
        long j;
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A03;
        Long A012 = LCT.A01(userSession, c3o9);
        JTa A06 = AbstractC31277Doz.A06(userSession, LCT.A00(userSession, A01), C29631be.class, str, z, this.A00);
        if (A012 != null) {
            j = A012.longValue();
        } else {
            j = 0;
        }
        ?? abstractC29011ae = new AbstractC29011ae(A06, A01, Long.valueOf(j), System.currentTimeMillis() * 1000);
        abstractC29011ae.A00 = c47588Kzy;
        String str2 = A01.A00;
        C2EY c2ey = C2EY.A18;
        String A013 = LJP.A01(userSession, abstractC29011ae, c2ey, "❤", str2, str);
        LIG lig = AbstractC47197KtW.A01;
        LIG.A00(userSession, abstractC29011ae.A05.hashCode(), LIG.A01(userSession, abstractC29011ae), true);
        lig.A02(userSession, abstractC29011ae, A013);
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
        C162337Ov.A0g(userSession, A01, c2ey, abstractC29011ae.A06(), abstractC29011ae.A02.A09);
    }

    @Override // X.C7TH
    public final C42221xC ENg(C47588Kzy c47588Kzy, MessageIdentifier messageIdentifier, C3o9 c3o9, String str, List list, boolean z) {
        return C42221xC.A06(new C48472LcP(this, c47588Kzy, messageIdentifier, c3o9, str, list, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.L9v] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.1ae, X.1iN, X.1OW] */
    @Override // X.C7TH
    public final void ENu(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
        UserSession userSession = this.A03;
        DirectThreadKey BKb = AbstractC28761aE.A00(userSession).BZQ(directShareTarget).BKb();
        JTa A07 = AbstractC31277Doz.A07(userSession, C33611iN.class);
        Long A01 = LCT.A01(userSession, BKb);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        C14360o3.A0B(A07, 1);
        ?? abstractC29011ae = new AbstractC29011ae(A07, BKb, A01, currentTimeMillis);
        ?? obj = new Object();
        obj.A00 = j;
        obj.A05 = "";
        obj.A07 = str2;
        obj.A06 = str3;
        obj.A02 = extendedImageUrl;
        obj.A03 = user;
        obj.A04 = null;
        obj.A01 = null;
        abstractC29011ae.A00 = obj;
        C26141Ov.A01(userSession).A0B(abstractC29011ae);
    }

    @Override // X.C7TH
    public final void ENv(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, boolean z) {
        C1OW c33571iJ;
        UserSession userSession = this.A03;
        DirectThreadKey BKb = AbstractC28761aE.A00(userSession).BZQ(directShareTarget).BKb();
        L1W A00 = LCT.A00(userSession, BKb);
        if (str6 != null) {
            c33571iJ = new C33651iR(imageUrl, AbstractC31277Doz.A04(userSession, A00, C31231eS.class, null, null, z), BKb, extendedImageUrl, user, LCT.A01(userSession, BKb), str, str2, str3, str6, str7, str4, j, System.currentTimeMillis() * 1000);
        } else {
            c33571iJ = new C33571iJ(imageUrl, AbstractC31277Doz.A04(userSession, A00, C31231eS.class, null, null, z), BKb, extendedImageUrl, user, LCT.A01(userSession, BKb), str, str2, str3, str7, str4, str8, j, System.currentTimeMillis() * 1000);
        }
        C26141Ov.A01(userSession).A0B(c33571iJ);
    }

    @Override // X.C7TH
    public final void EOR(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        String str5 = A01.A00;
        C2EY c2ey = C2EY.A1i;
        boolean z2 = false;
        if (anonymousClass442 != null) {
            z2 = true;
        }
        Boolean A00 = A00(this, c2ey, str5, z2);
        UserSession userSession = this.A03;
        LCT.A00(userSession, A01);
        LJP.A00(null, userSession, l7g, anonymousClass442, null, c47588Kzy, null, A01, null, A00, num, num2, null, l, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, null, null, null, null, str4, null, list, z, true, false);
    }

    @Override // X.C7TH
    @Deprecated(message = "Use [DirectSendMessageManager#sendTextMessageRx] instead.")
    public final String EOZ(AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        return A0D(null, null, anonymousClass442, null, c3o9, null, null, null, null, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, null, null, null, z, false);
    }

    @Override // X.C7TH
    public final void EOc(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        A02(null, l7g, anonymousClass442, null, c47588Kzy, null, JRE.A01(c3o9), num, num2, null, null, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, null, str4, null, str5, null, list, z, false);
    }

    @Override // X.C7TH
    public final void EOd(L7G l7g, AnonymousClass442 anonymousClass442, SendMentionData$MentionData sendMentionData$MentionData, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        A02(null, l7g, anonymousClass442, sendMentionData$MentionData, c47588Kzy, null, JRE.A01(c3o9), num, num2, null, l, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, null, null, null, str4, list, list2, z, false);
    }

    @Override // X.C7TH
    public final C42221xC EOk(InterfaceC83713oG interfaceC83713oG, ClipInfo clipInfo, Long l, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendVisualMessageRx not supported for Direct threads. ThreadTarget: ");
        sb.append(interfaceC83713oG);
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // X.C7TH
    public final C42221xC EOl(InterfaceC83713oG interfaceC83713oG, C183978Ee c183978Ee, Long l, String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("sendVisualMessageRx not supported for Direct threads. ThreadTarget: ");
        sb.append(interfaceC83713oG);
        throw new UnsupportedOperationException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r27.A05() != false) goto L9;
     */
    @Override // X.C7TH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture EOm(X.AnonymousClass442 r27, X.C3o9 r28, X.L33 r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.List r33, boolean r34) {
        /*
            r26 = this;
            r14 = r31
            r0 = 0
            r12 = r28
            X.C14360o3.A0B(r12, r0)
            com.instagram.model.direct.DirectThreadKey r11 = X.JRE.A01(r12)
            r10 = r26
            com.instagram.common.session.UserSession r1 = r10.A03
            X.L1W r18 = X.LCT.A00(r1, r11)
            if (r18 == 0) goto Lbb
            boolean r2 = X.AbstractC46831KnQ.A00(r18)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r2)
        L1e:
            java.lang.Integer r22 = X.C05F.A1F
            r7 = r27
            if (r27 == 0) goto L2c
            boolean r2 = r7.A05()
            r24 = 1
            if (r2 == 0) goto L2e
        L2c:
            r24 = 0
        L2e:
            r16 = r34
            r19 = r1
            r20 = r11
            r23 = r16
            r25 = r0
            X.7Cz r6 = X.AbstractC159387Cy.A03(r19, r20, r21, r22, r23, r24, r25)
            boolean r2 = r6.A01()
            if (r31 != 0) goto L46
            java.lang.String r14 = A03(r10, r2)
        L46:
            java.lang.String r5 = r11.A00
            X.2EY r4 = X.C2EY.A1m
            r3 = 0
            if (r27 == 0) goto L4e
            r3 = 1
        L4e:
            java.lang.Boolean r19 = A00(r10, r4, r5, r3)
            X.7X3 r9 = X.C7X2.A00(r1)
            r13 = r29
            r15 = r32
            if (r32 == 0) goto L78
            r9.A03(r15, r0)
            int r3 = r15.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger r4 = X.C7R5.A00(r1, r3)
            if (r4 == 0) goto L78
            r4.onLogTransportMessageEnd()
            r4.onLogSendServiceStart()
            int r3 = r13.A00
            r4.annotateMediaDurationMs(r3)
        L78:
            java.lang.Class<X.1ee> r20 = X.C31351ee.class
            r21 = 0
            boolean r3 = r10.A00
            r22 = r30
            r23 = r15
            r24 = r16
            r25 = r3
            r17 = r1
            X.JTa r8 = X.AbstractC31277Doz.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r1 = r8.A03
            r22 = 5
            r23 = 1
            r17 = r10
            r18 = r11
            r19 = r1
            r20 = r14
            r25 = r2
            A08(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 1615100382(0x604479de, float:5.6630364E19)
            r3 = 3
            X.0ne r1 = new X.0ne
            r1.<init>(r4, r3, r0, r0)
            X.3Qq r0 = com.google.common.util.concurrent.MoreExecutors.listeningDecorator(r1)
            X.M89 r5 = new X.M89
            r17 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.submit(r5)
            X.C14360o3.A07(r0)
            return r0
        Lbb:
            r21 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.EOm(X.442, X.3o9, X.L33, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r36.A05() != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.1ae, X.1ee, X.1OW] */
    @Override // X.C7TH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EOn(X.AnonymousClass442 r36, X.C3o9 r37, X.L33 r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.util.List r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.EOn(X.442, X.3o9, X.L33, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):void");
    }

    public static final Object A01(C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C7TG c7tg, C47588Kzy c47588Kzy, DirectThreadKey directThreadKey, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        Object invoke = interfaceC16820sZ.invoke();
        if (c26086BgF != null) {
            String str4 = c26086BgF.A04;
            String str5 = c26086BgF.A03;
            c7tg.A02((C50679MYx) c26086BgF.A01, null, anonymousClass442, (SendMentionData$MentionData) c26086BgF.A02, c47588Kzy, EnumC46200Kcc.A06, directThreadKey, null, null, null, null, str4, NetInfoModule.CONNECTION_TYPE_NONE, str, null, str5, str2, str3, null, (List) c26086BgF.A00, z, false);
        }
        return invoke;
    }

    private final String A02(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, SendMentionData$MentionData sendMentionData$MentionData, C47588Kzy c47588Kzy, EnumC46200Kcc enumC46200Kcc, C3o9 c3o9, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, boolean z, boolean z2) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        String str8 = A01.A00;
        C2EY c2ey = C2EY.A1i;
        boolean z3 = false;
        if (anonymousClass442 != null) {
            z3 = true;
        }
        Boolean A00 = A00(this, c2ey, str8, z3);
        UserSession userSession = this.A03;
        LCT.A00(userSession, A01);
        return LJP.A00(c50679MYx, userSession, l7g, anonymousClass442, sendMentionData$MentionData, c47588Kzy, enumC46200Kcc, A01, null, A00, num, num2, num3, l, str, str2, str3, str4, str5, null, str6, str7, list, list2, z, this.A00, z2);
    }

    public static final void A0A(C7TG c7tg, String str, String str2, String str3, int i, boolean z, boolean z2) {
        int length;
        if (AbstractC74053Tw.A04(str2)) {
            C120005by.A02(i, str, str2);
            List singletonList = Collections.singletonList(Long.valueOf(Long.parseLong(str2)));
            C14360o3.A07(singletonList);
            C120005by.A03(str, singletonList, i, 1305, 0);
        }
        if (C18U.A06(C06090Tz.A05, c7tg.A03, 36320609982358217L) && str3 != null && (length = str3.length()) > 0 && AbstractC74053Tw.A04(str3)) {
            int i2 = length / 3;
            int i3 = i2 * 2;
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add(131L);
            }
            if (z2) {
                arrayList.add(1252L);
            }
            String substring = str3.substring(0, i2);
            C14360o3.A07(substring);
            arrayList.add(Long.valueOf(Long.parseLong(substring)));
            String substring2 = str3.substring(i2, i3);
            C14360o3.A07(substring2);
            arrayList.add(Long.valueOf(Long.parseLong(substring2)));
            String substring3 = str3.substring(i3);
            C14360o3.A07(substring3);
            arrayList.add(Long.valueOf(Long.parseLong(substring3)));
            TraceLogger.logCrucialCheckpoint(null, i, null, 2220, str, 0, arrayList);
        }
        if (z2) {
            C120005by.A03(str, null, i, 1252, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1j5, X.1OW] */
    public final void A0K(C3o9 c3o9, String str, String str2, String str3, String str4, String str5) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A03;
        JTa A02 = AbstractC31277Doz.A02(userSession, LCT.A00(userSession, A01), C34051j5.class);
        C14360o3.A0B(A01, 2);
        ?? c1ow = new C1OW(A02);
        c1ow.A00 = A01;
        c1ow.A02 = str;
        c1ow.A05 = str2;
        c1ow.A01 = str3;
        c1ow.A04 = str4;
        c1ow.A03 = str5;
        C26141Ov.A01(userSession).A0B(c1ow);
        C162337Ov.A0g(userSession, A01, C2EY.A0m, c1ow.A05, c1ow.A02.A09);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1ka, X.1OW] */
    @Override // X.C7TH
    public final void ELt(C3o9 c3o9, String str) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A03;
        JTa A02 = AbstractC31277Doz.A02(userSession, LCT.A00(userSession, A01), C34951ka.class);
        C14360o3.A0B(A01, 2);
        ?? c1ow = new C1OW(A02);
        c1ow.A01 = A01;
        c1ow.A00 = userSession;
        c1ow.A02 = str;
        C26141Ov.A01(userSession).A0B(c1ow);
    }

    @Override // X.C7TH
    public final void EO1(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, String str4, List list, boolean z) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        String str5 = A01.A00;
        C2EY c2ey = C2EY.A1C;
        boolean z2 = false;
        if (anonymousClass442 != null) {
            z2 = true;
        }
        A01(c26086BgF, anonymousClass442, this, c47588Kzy, A01, str, str3, str4, new MEK(c26086BgF, anonymousClass442, this, c47588Kzy, A01, c47z, c183978Ee, A00(this, c2ey, str5, z2), str, str3, str4, z), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1ke, X.1OW] */
    @Override // X.C7TH
    public final void F9o(C3o9 c3o9, String str) {
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = this.A03;
        JTa A02 = AbstractC31277Doz.A02(userSession, LCT.A00(userSession, A01), C34991ke.class);
        C14360o3.A0B(A01, 2);
        ?? c1ow = new C1OW(A02);
        c1ow.A01 = A01;
        c1ow.A00 = userSession;
        c1ow.A02 = str;
        C26141Ov.A01(userSession).A0B(c1ow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r52.A05() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C9CK r51, X.AnonymousClass442 r52, X.C7TG r53, X.C47588Kzy r54, X.EnumC46200Kcc r55, com.instagram.model.direct.DirectThreadKey r56, com.instagram.pendingmedia.model.ClipInfo r57, X.C47Z r58, java.lang.Boolean r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, boolean r64, boolean r65) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TG.A04(X.9CK, X.442, X.7TG, X.Kzy, X.Kcc, com.instagram.model.direct.DirectThreadKey, com.instagram.pendingmedia.model.ClipInfo, X.47Z, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override // X.C7TH
    public final C42221xC EOa(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, DirectShareTarget directShareTarget, C2EY c2ey, InterfaceC83713oG interfaceC83713oG, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        int hashCode;
        C14360o3.A0B(interfaceC83713oG, 0);
        UserSession userSession = this.A03;
        C7X3 A00 = C7X2.A00(userSession);
        String str8 = str6;
        if (str6 == null) {
            str8 = str;
        }
        A00.A03(str8, false);
        if (str6 != null) {
            hashCode = str6.hashCode();
        } else {
            hashCode = str.hashCode();
        }
        IGFOAMessagingLocalSendSpeedLogger A002 = C7R5.A00(userSession, Integer.valueOf(hashCode));
        if (A002 != null) {
            A002.onLogTransportMessageEnd();
            A002.onLogSendServiceStart();
        }
        C2DS A003 = AbstractC28761aE.A00(userSession);
        DirectThreadKey A01 = AbstractC140956Yx.A01(AbstractC140946Yw.A01(interfaceC83713oG));
        if (A01.A00 == null && A01.A01 == null && directShareTarget != null) {
            if (A002 != null) {
                A002.onLogCreateLocalThreadStart();
            }
            A01 = A003.BZQ(directShareTarget).BKb();
            if (A002 != null) {
                A002.onLogCreateLocalThreadEnd();
                InterfaceC83713oG interfaceC83713oG2 = directShareTarget.A09;
                interfaceC83713oG2.getClass();
                A002.annotateOpenThreadId(AbstractC92784Dr.A02(interfaceC83713oG2));
            }
        }
        return C42221xC.A06(new C36262FzF(c50679MYx, l7g, anonymousClass442, this, c47588Kzy, A01, num3, num4, num5, l, str, str2, str3, str4, str6, str7, z, z4));
    }
}
