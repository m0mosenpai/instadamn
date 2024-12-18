package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import java.util.Iterator;

/* renamed from: X.Oc3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55135Oc3 {
    public C51759Mti A00;
    public RtcCallKey A01;
    public C51677Ms8 A02;
    public C51678Ms9 A03;
    public C51679MsA A04;
    public C19L A05;
    public boolean A06;
    public boolean A07;
    public final UserSession A08;
    public final C54446O4a A09;
    public final C05A A0A;
    public final C12N A0B = C12L.A00;
    public final InterfaceC16820sZ A0C;

    private final void A00() {
        this.A07 = false;
        this.A01 = null;
        C19L c19l = this.A05;
        if (c19l != null) {
            AnonymousClass194.A04("Call has ended!", c19l);
            Iterator it = this.A09.A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC58155PqK) it.next()).D1I();
            }
            return;
        }
        C14360o3.A0F("callScope");
        throw C00O.createAndThrow();
    }

    private final void A01() {
        this.A07 = true;
        C19K A0e = AbstractC25236BEt.A0e(((C12M) this.A0B).A04);
        this.A05 = A0e;
        Iterator it = this.A09.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC58155PqK) it.next()).D1J(A0e);
        }
    }

    public final void A03() {
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
        this.A06 = false;
        C51881MwP c51881MwP = (C51881MwP) this.A00.A00;
        Integer num = c51881MwP.A01;
        Integer num2 = C05F.A0N;
        if (num != num2) {
            RtcCallKey rtcCallKey = c51881MwP.A00;
            A02(new C51759Mti(new C51881MwP(rtcCallKey, num2, C05F.A01), C05F.A00), this);
        }
        Integer num3 = C05F.A0Y;
        A02(new C51759Mti(new C51881MwP(null, num3, C05F.A01), C05F.A00), this);
    }

    public static final void A02(C51759Mti c51759Mti, C55135Oc3 c55135Oc3) {
        C51881MwP c51881MwP = (C51881MwP) c51759Mti.A00;
        if (!C14360o3.A0K(c51881MwP, c55135Oc3.A00.A00)) {
            C51759Mti c51759Mti2 = c55135Oc3.A00;
            Object obj = c51759Mti2.A01;
            Integer num = C05F.A00;
            if (obj == num && c51759Mti.A01 == C05F.A01) {
                C51881MwP c51881MwP2 = (C51881MwP) c51759Mti.A00;
                Integer num2 = c51881MwP2.A01;
                if (num2 != C05F.A0Y) {
                    if (num2 == C05F.A0N && !C14360o3.A0K(((C51881MwP) c51759Mti2.A00).A00, c51881MwP2.A00)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C51759Mti c51759Mti3 = c55135Oc3.A00;
            c55135Oc3.A00 = c51759Mti;
            C05A c05a = c55135Oc3.A0A;
            Object obj2 = c51759Mti.A00;
            C14360o3.A0B(c05a, 0);
            c05a.F8m(obj2);
            c55135Oc3.A0C.invoke();
            int intValue = c51881MwP.A01.intValue();
            if (intValue != 0 && intValue != 2) {
                if (intValue != 3 && intValue != 4) {
                    if (intValue == 1) {
                        return;
                    } else {
                        throw B4Z.A00();
                    }
                }
                Integer num3 = ((C51881MwP) c51759Mti3.A00).A01;
                if (num3 != num && num3 != C05F.A0C) {
                    return;
                }
                c55135Oc3.A00();
                return;
            }
            RtcCallKey rtcCallKey = c51881MwP.A00;
            if (c55135Oc3.A01 == null && !c55135Oc3.A07) {
                c55135Oc3.A01();
            }
            if (rtcCallKey == null) {
                return;
            }
            RtcCallKey rtcCallKey2 = c55135Oc3.A01;
            if (rtcCallKey2 != null && C14360o3.A0K(rtcCallKey.A00, rtcCallKey2.A00)) {
                return;
            }
            if (c55135Oc3.A01 != null) {
                c55135Oc3.A00();
                c55135Oc3.A01();
            }
            c55135Oc3.A01 = rtcCallKey;
            Iterator it = c55135Oc3.A09.A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC58155PqK) it.next()).D1H(rtcCallKey);
            }
        }
    }

    public C55135Oc3(UserSession userSession, C54446O4a c54446O4a, InterfaceC16820sZ interfaceC16820sZ) {
        this.A08 = userSession;
        this.A09 = c54446O4a;
        this.A0C = interfaceC16820sZ;
        C51759Mti c51759Mti = new C51759Mti(new C51881MwP(null, C05F.A0Y, C05F.A01), C05F.A0C);
        this.A00 = c51759Mti;
        this.A0A = C10E.A00(c51759Mti.A00);
    }
}
