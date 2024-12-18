package X;

import com.facebook.analytics.dsp.point.IgPointContextProvider;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.7ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172087ld {
    public final C3N2 A00;
    public final C172097le A01;
    public final IgPointContextProvider A02;
    public final C172117lg A03;
    public final C0JO A04;
    public final InterfaceC08830cm A05;
    public final InterfaceC08830cm A06;

    public C172087ld(AbstractC12990ll abstractC12990ll) {
        C3N5 c3n5;
        C14360o3.A0B(abstractC12990ll, 1);
        this.A05 = new InterfaceC08830cm() { // from class: X.9HQ
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                String str = C26771Rh.A00().A00;
                C14360o3.A07(str);
                return str;
            }
        };
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.A04 = awakeTimeSinceBootClock;
        C3K9 c3k9 = C3K9.A01;
        this.A01 = new C172097le(c3k9);
        this.A02 = new IgPointContextProvider(c3k9);
        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.9Ho
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                String str = C1QM.A00.A02.A00;
                if (str == null) {
                    return "";
                }
                return str;
            }
        };
        this.A06 = interfaceC08830cm;
        C3N2 A00 = C3N0.A00(abstractC12990ll);
        this.A00 = A00;
        C172107lf c172107lf = new C172107lf(abstractC12990ll);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, abstractC12990ll, 36317186893091675L)) {
            c3n5 = AbstractC72593Ng.A00(abstractC12990ll);
        } else {
            c3n5 = null;
        }
        this.A03 = new C172117lg(C18U.A06(c06090Tz, abstractC12990ll, 36315580575780264L) ? A00 : null, c172107lf, awakeTimeSinceBootClock, c3n5, interfaceC08830cm, C18U.A06(c06090Tz, abstractC12990ll, 36311633505223356L));
    }
}
