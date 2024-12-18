package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.Dv7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31641Dv7 implements InterfaceC13000lm, YO9 {
    public String A00;
    public String A01;
    public String A02;
    public ScheduledFuture A03;
    public boolean A04;
    public final C18920wW A05;
    public final UserSession A06;
    public final ScheduledExecutorService A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final C2DS A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public static final int A00(int i, boolean z) {
        if (i == 6) {
            return z ? 1 : 3;
        }
        if (i == 38) {
            return 17;
        }
        if (i == 43) {
            return 18;
        }
        switch (i) {
            case 11:
            case Process.SIGTERM /* 15 */:
                return z ? 2 : 5;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case 16:
                return 4;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 17:
                return 6;
            default:
                switch (i) {
                    case 33:
                        return 11;
                    case 34:
                        return z ? 10 : 12;
                    case 35:
                        return 15;
                    case 36:
                        return 16;
                    default:
                        return 8;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r14.length() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:
    
        if (r4.A0B != null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.E9O r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31641Dv7.A0A(X.E9O, java.util.List):void");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02 = null;
        this.A04 = false;
        A08();
    }

    public static final int A01(E9O e9o) {
        DirectShareTarget directShareTarget;
        int i = e9o.A00;
        DirectSearchResult directSearchResult = e9o.A03;
        if ((directSearchResult instanceof DirectShareTarget) && (directShareTarget = (DirectShareTarget) directSearchResult) != null && directShareTarget.A0B != null && i == 6) {
            return 34;
        }
        return i;
    }

    private final String A04(InterfaceC83713oG interfaceC83713oG) {
        InterfaceC83713oG interfaceC83713oG2;
        if (interfaceC83713oG instanceof C83693oE) {
            return ((C83693oE) interfaceC83713oG).A00;
        }
        if (interfaceC83713oG instanceof C122145g6) {
            C81663kb B3W = this.A0B.B3W(((C122145g6) interfaceC83713oG).A00);
            if (B3W == null) {
                return null;
            }
            return B3W.C7I();
        }
        if (interfaceC83713oG instanceof EgH) {
            interfaceC83713oG2 = ((EgH) interfaceC83713oG).A00;
        } else if (interfaceC83713oG instanceof C163787Us) {
            interfaceC83713oG2 = ((C163787Us) interfaceC83713oG).A00;
        } else {
            if (!(interfaceC83713oG instanceof MsysThreadId)) {
                return null;
            }
            return String.valueOf(((MsysThreadId) interfaceC83713oG).A00);
        }
        return A04(interfaceC83713oG2);
    }

    public static final List A05(E9O e9o) {
        EnumC33472Er7 enumC33472Er7;
        DirectShareTarget directShareTarget;
        DirectShareTargetLoggingInfo directShareTargetLoggingInfo;
        DirectSearchResult directSearchResult = e9o.A03;
        Boolean bool = null;
        if ((directSearchResult instanceof DirectShareTarget) && (directShareTarget = (DirectShareTarget) directSearchResult) != null && (directShareTargetLoggingInfo = directShareTarget.A08) != null) {
            bool = directShareTargetLoggingInfo.A00;
        }
        if (AbstractC31177DnL.A1b(bool)) {
            enumC33472Er7 = EnumC33472Er7.SERVER;
        } else if (AbstractC166997dE.A1Z(bool, false)) {
            enumC33472Er7 = EnumC33472Er7.LOCAL;
        } else {
            if (bool == null) {
                return C16930sl.A00;
            }
            throw B4Z.A00();
        }
        return AbstractC166987dD.A1J(enumC33472Er7);
    }

    private final List A06(DirectShareTarget directShareTarget) {
        if (AbstractC31177DnL.A1b(directShareTarget.A0B)) {
            List list = directShareTarget.A0P;
            if (list == null) {
                return C16930sl.A00;
            }
            return list;
        }
        ArrayList A0B = directShareTarget.A0B();
        ArrayList A0q = AbstractC167017dG.A0q(A0B);
        Iterator it = A0B.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            C14360o3.A0A(A1B);
            A0q.add(Long.valueOf(A02(A1B)));
        }
        return A0q;
    }

    public final void A08() {
        ScheduledFuture scheduledFuture = this.A03;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A03 = null;
        this.A04 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0Ai] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.EnumC92794Ds r11, java.lang.Boolean r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.util.Set r17) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31641Dv7.A09(X.4Ds, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.util.Set):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r7.length() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0109, code lost:
    
        if (X.AbstractC166997dE.A1Z(r3.A0B, true) != false) goto L46;
     */
    @Override // X.YO9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ck7(X.C34961Fal r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31641Dv7.Ck7(X.Fal, boolean):void");
    }

    public C31641Dv7(UserSession userSession, boolean z) {
        this.A06 = userSession;
        this.A08 = z;
        this.A05 = AbstractC31176DnK.A0O(userSession, "direct_omnipicker_search");
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0G = C18U.A06(c06090Tz, userSession, 36313458861541399L);
        this.A0D = C18U.A06(c06090Tz, userSession, 36313458861606936L);
        this.A0A = C18U.A06(c06090Tz, userSession, 36320382349746599L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36314790302059320L);
        this.A0F = C18U.A06(c06090Tz, userSession, 36315937058000717L);
        this.A0E = C18U.A06(c06090Tz, userSession, 36323461840252183L);
        this.A0C = userSession.userId;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C14360o3.A07(scheduledThreadPoolExecutor);
        this.A07 = scheduledThreadPoolExecutor;
        this.A0B = C2JD.A00(userSession);
    }

    public static final long A02(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            C0K8.A0N("UnifiedSearchOmnipickerLogger", "Unable to convert item's id[%s] to long", e, str);
            return 0L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static final EnumC33521Eru A03(Integer num, String str) {
        switch (num.intValue()) {
            case 0:
            case 17:
                return EnumC33521Eru.A03;
            case 1:
                return EnumC33521Eru.A0G;
            case 4:
                return EnumC33521Eru.A0O;
            case 5:
                return EnumC33521Eru.A0Q;
            case 6:
                return EnumC33521Eru.A06;
            case 7:
                return EnumC33521Eru.A0P;
            case 18:
                if (C14360o3.A0K(str, "most_engaged_followers")) {
                    return EnumC33521Eru.A0E;
                }
                if (C14360o3.A0K(str, "most_recent_followers")) {
                    return EnumC33521Eru.A0F;
                }
                return EnumC33521Eru.A0H;
            case Process.SIGSTOP /* 19 */:
                return EnumC33521Eru.A02;
            case 21:
                return EnumC33521Eru.A04;
            default:
                return EnumC33521Eru.A0H;
        }
    }

    public static final List A07(List list) {
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            if (AbstractC31177DnL.A1b(A0m.A0B)) {
                List list2 = A0m.A0P;
                if (list2 != null) {
                    A0l.addAll(list2);
                }
            } else {
                A0l.add(Long.valueOf(A02(AbstractC31173DnH.A0o(A0m))));
            }
        }
        return AbstractC001800i.A0a(A0l);
    }
}
