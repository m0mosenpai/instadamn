package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.common.session.UserSession;

/* renamed from: X.6sW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151866sW {
    public static final C151866sW A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x001f, code lost:
    
        if (r20.A2q != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r18, 36324913539265113L) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009b, code lost:
    
        if (r19.A02 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a1, code lost:
    
        r3 = r19.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a3, code lost:
    
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a5, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a9, code lost:
    
        if (r3.A01 == true) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00af, code lost:
    
        r2 = r19.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:
    
        if (r2 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b5, code lost:
    
        if (r2 == com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bb, code lost:
    
        if (r2 != com.instagram.api.schemas.MediaGenAIDetectionMethod.A08) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c5, code lost:
    
        if (r19.A0O != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c7, code lost:
    
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d2, code lost:
    
        return new com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r20.A5O);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00bd, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00bf, code lost:
    
        if (r19 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ab, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ad, code lost:
    
        if (r19 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x009f, code lost:
    
        if (r19 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d6, code lost:
    
        if (r20.A0t != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures A00(com.instagram.common.session.UserSession r18, X.C128175qm r19, X.C47Z r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151866sW.A00(com.instagram.common.session.UserSession, X.5qm, X.47Z, boolean, boolean):com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures");
    }

    public static final C31569Dtv A01(Context context, String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C31569Dtv c31569Dtv = new C31569Dtv(str2);
        c31569Dtv.A06 = "SCHEDULED_CONTENT";
        c31569Dtv.A07 = context.getString(2131956775);
        c31569Dtv.A08 = str;
        c31569Dtv.A0A(AbstractC16960so.A1M(str));
        c31569Dtv.A05 = str3;
        c31569Dtv.A0D = true;
        return c31569Dtv;
    }

    public static final void A04(Context context, FragmentActivity fragmentActivity, EnumC60792q3 enumC60792q3, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        Integer BqX;
        String CEH;
        C14360o3.A0B(interfaceC11380iw, 4);
        boolean A63 = c38321qM.A63();
        JKD Ar6 = c38321qM.A0C.Ar6();
        if (Ar6 != null && (BqX = Ar6.BqX()) != null) {
            int intValue = BqX.intValue();
            int i = c38321qM.BRp().A00;
            JKD Ar62 = c38321qM.A0C.Ar6();
            if (Ar62 != null && (CEH = Ar62.CEH()) != null) {
                OXR oxr = new OXR(EnumC50628MWp.A0F, interfaceC11380iw, userSession);
                C50674MYs c50674MYs = new C50674MYs(context, userSession);
                int i2 = 2131956764;
                if (A63) {
                    i2 = 2131956765;
                }
                c50674MYs.A03(new ViewOnClickListenerC35586Fnd(fragmentActivity, userSession, c38321qM, i), i2);
                c50674MYs.A03(new ViewOnClickListenerC55427Ojc(fragmentActivity, oxr, userSession, c38321qM, CEH, intValue, A63), 2131956769);
                c50674MYs.A03(new ViewOnClickListenerC55410OjL(context, userSession, c38321qM, CEH), 2131956781);
                c50674MYs.A01(new ViewOnClickListenerC55419OjU(context, userSession, c38321qM, CEH, A63), 2131957640);
                c50674MYs.A02 = enumC60792q3;
                new C31727DwY(c50674MYs).A05(fragmentActivity);
            }
        }
    }

    public static final void A05(OXR oxr, NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        C14360o3.A0B(oxr, 0);
        if (nonSupportedContentSchedulingFeatures.A06) {
            oxr.A08(C05F.A0u, C05F.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A00) {
            oxr.A08(C05F.A15, C05F.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A07) {
            oxr.A08(C05F.A1F, C05F.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A0C) {
            oxr.A08(C05F.A1I, C05F.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A0F) {
            oxr.A08(C05F.A02, C05F.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A02) {
            oxr.A08(C05F.A03, C05F.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A04) {
            oxr.A08(C05F.A05, C05F.A0Y);
        }
        if (nonSupportedContentSchedulingFeatures.A0A) {
            oxr.A08(C05F.A06, C05F.A0Y);
        }
    }

    public static final boolean A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A02(userSession, false) != C05F.A0C) {
            return C18U.A06(C06090Tz.A05, userSession, 36315821093621349L);
        }
        return false;
    }

    public static final boolean A07(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A02(userSession, false) != C05F.A01 || !C18U.A06(C06090Tz.A05, userSession, 36325566374622384L)) {
            return false;
        }
        return true;
    }

    public final boolean A08(UserSession userSession) {
        int intValue = A02(userSession, true).intValue();
        if (intValue != 0) {
            if (intValue != 1 || A07(userSession)) {
                return false;
            }
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 2342168575588185262L);
            C14360o3.A0A(Boolean.valueOf(A06));
            return A06;
        }
        return true;
    }

    public final boolean A09(UserSession userSession) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 0);
        Integer A02 = A02(userSession, false);
        if (A02 == C05F.A00) {
            c06090Tz = C06090Tz.A05;
            j = 36323783962799723L;
        } else {
            if (A02 != C05F.A01) {
                return false;
            }
            c06090Tz = C06090Tz.A05;
            j = 36325566374425773L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static final void A03(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, OXR oxr, NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A04();
        c193328hC.A0A(2131956780);
        c193328hC.A09(2131956777);
        c193328hC.A0I(new DialogInterfaceOnClickListenerC55270Ofj(onClickListener2, oxr), 2131956779);
        c193328hC.A0C(new DialogInterfaceOnCancelListenerC55244OfI(oxr));
        c193328hC.A0J(new DialogInterfaceOnClickListenerC55283Ofy(onClickListener, oxr, nonSupportedContentSchedulingFeatures), 2131956778);
        C0fJ.A00(c193328hC.A02());
    }

    public static final Integer A02(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C06090Tz c06090Tz2;
        if (AbstractC151876sX.A07(userSession)) {
            if (z) {
                c06090Tz2 = C06090Tz.A05;
            } else {
                c06090Tz2 = C06090Tz.A06;
            }
            boolean A06 = C18U.A06(c06090Tz2, userSession, 36315821093424738L);
            C14360o3.A0A(Boolean.valueOf(A06));
            if (A06) {
                return C05F.A00;
            }
        } else {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            boolean A062 = C18U.A06(c06090Tz, userSession, 36325566374294699L);
            C14360o3.A0A(Boolean.valueOf(A062));
            if (A062) {
                return C05F.A01;
            }
        }
        return C05F.A0C;
    }
}
