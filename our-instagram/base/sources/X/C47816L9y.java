package X;

import android.app.Application;
import android.os.Environment;
import android.os.StatFs;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.L9y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47816L9y {
    public boolean A00;
    public final UserSession A01;
    public final C6CF A02;
    public final KPS A03;
    public final LF0 A04;
    public final C47708L4p A05;
    public final L1G A06;
    public final L1H A07;
    public final L3K A08;
    public final L1I A09;
    public final L3L A0A;
    public final LF2 A0B;
    public final C44100JeP A0C;
    public final C47319KvU A0D;
    public final C44101JeQ A0E;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r29 != X.EnumC46166Kc4.A03) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(androidx.fragment.app.Fragment r26, X.MOZ r27, X.EnumC46166Kc4 r28, X.EnumC46166Kc4 r29, java.lang.Integer r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816L9y.A00(androidx.fragment.app.Fragment, X.MOZ, X.Kc4, X.Kc4, java.lang.Integer, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(androidx.fragment.app.Fragment r24, X.MOZ r25, X.EnumC46166Kc4 r26, X.EnumC46166Kc4 r27, java.lang.Integer r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47816L9y.A01(androidx.fragment.app.Fragment, X.MOZ, X.Kc4, X.Kc4, java.lang.Integer, boolean):void");
    }

    public /* synthetic */ C47816L9y(UserSession userSession) {
        LF2 lf2 = new LF2(userSession);
        C44100JeP c44100JeP = new C44100JeP(userSession);
        L1H l1h = new L1H(userSession);
        L3K l3k = new L3K(userSession);
        L1G l1g = new L1G(userSession);
        C44101JeQ c44101JeQ = new C44101JeQ(userSession);
        C47708L4p c47708L4p = new C47708L4p(userSession);
        L1I l1i = new L1I(userSession);
        L3L l3l = new L3L(userSession);
        LF0 lf0 = new LF0(userSession);
        C6CF A00 = C6CE.A00(userSession);
        C47319KvU c47319KvU = new C47319KvU(userSession);
        KPS A002 = AbstractC46736Klt.A00(userSession);
        AbstractC25229BEm.A1L(userSession, 1, A00);
        C14360o3.A0B(A002, 14);
        this.A01 = userSession;
        this.A0B = lf2;
        this.A0C = c44100JeP;
        this.A07 = l1h;
        this.A08 = l3k;
        this.A06 = l1g;
        this.A0E = c44101JeQ;
        this.A05 = c47708L4p;
        this.A09 = l1i;
        this.A0A = l3l;
        this.A04 = lf0;
        this.A02 = A00;
        this.A0D = c47319KvU;
        this.A03 = A002;
        this.A00 = true;
    }

    public final void A02(Fragment fragment, MOZ moz, Integer num, double d) {
        int i;
        int i2;
        double d2;
        int A0B;
        UserSession userSession;
        Application application;
        StringBuilder A1C;
        String str;
        AbstractC167027dH.A13(fragment, moz, num);
        FragmentActivity activity = fragment.getActivity();
        LF2 lf2 = this.A0B;
        Number number = (Number) AbstractC001800i.A0J(lf2.A04);
        if (number != null) {
            i = number.intValue();
        } else {
            i = 7;
        }
        Number number2 = (Number) AbstractC001800i.A0J(lf2.A05);
        if (number2 != null) {
            i2 = number2.intValue();
        } else {
            i2 = 2;
        }
        if (d >= i) {
            C44101JeQ c44101JeQ = this.A0E;
            if (C18U.A06(c44101JeQ.A00, c44101JeQ.A01, 36326382418081626L)) {
                L1G l1g = this.A06;
                if (num == C05F.A00) {
                    Iterator it = AbstractC001800i.A0Y(l1g.A01.A04).iterator();
                    while (it.hasNext()) {
                        A0B = AbstractC167007dF.A0B(it);
                        if (d >= A0B) {
                            if (Integer.valueOf(A0B) != null) {
                                C44100JeP c44100JeP = l1g.A02;
                                Integer num2 = C05F.A0u;
                                if (!c44100JeP.A0A(num2, A0B)) {
                                    c44100JeP.A07(A0B, num2);
                                    moz.Cob(EnumC46164Kc2.A03, A0B);
                                    userSession = l1g.A00;
                                    if (activity != null) {
                                        application = activity.getApplication();
                                    } else {
                                        application = null;
                                    }
                                    A1C = AbstractC166987dD.A1C();
                                    str = "show ebupsell banner for interval ";
                                    A1C.append(str);
                                    A1C.append(A0B);
                                    AbstractC46743Km0.A00(userSession, application, A1C.toString());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (d < i2) {
            return;
        }
        L3K l3k = this.A08;
        InterfaceC19630xq interfaceC19630xq = l3k.A03.A00;
        float f = interfaceC19630xq.getFloat("CUSTOM_DISK_SPACE_THRESHOLD", 0.0f);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long availableBlocksLong = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1073741824;
        C44101JeQ c44101JeQ2 = l3k.A04;
        UserSession userSession2 = c44101JeQ2.A01;
        C06090Tz c06090Tz = c44101JeQ2.A00;
        double A00 = C18U.A00(c06090Tz, userSession2, 37170807348331027L);
        boolean z = true;
        if (C18U.A06(c06090Tz, userSession2, 36326382418868062L)) {
            d2 = f;
        } else {
            d2 = availableBlocksLong;
        }
        if (0.0d > d2 || d2 > A00) {
            z = false;
        }
        if (!c44101JeQ2.A00() || !z || !AbstractC31172DnG.A1a(interfaceC19630xq, "MEX_EB_LOW_STORAGE_MODE_TOGGLE_SHOWN") || num != C05F.A00) {
            return;
        }
        Iterator it2 = AbstractC001800i.A0Y(l3k.A01.A05).iterator();
        while (it2.hasNext()) {
            A0B = AbstractC167007dF.A0B(it2);
            if (d >= A0B) {
                if (Integer.valueOf(A0B) == null) {
                    return;
                }
                C44100JeP c44100JeP2 = l3k.A02;
                Integer num3 = C05F.A15;
                if (c44100JeP2.A0A(num3, A0B)) {
                    return;
                }
                c44100JeP2.A07(A0B, num3);
                moz.Cob(EnumC46164Kc2.A02, A0B);
                userSession = l3k.A00;
                if (activity != null) {
                    application = activity.getApplication();
                } else {
                    application = null;
                }
                A1C = AbstractC166987dD.A1C();
                str = "show LowDiskSpace banner for interval ";
                A1C.append(str);
                A1C.append(A0B);
                AbstractC46743Km0.A00(userSession, application, A1C.toString());
                return;
            }
        }
    }
}
