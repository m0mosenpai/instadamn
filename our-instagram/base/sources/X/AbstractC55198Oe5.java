package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Oe5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55198Oe5 {
    public InterfaceC58164PqU A01;
    public Float A02;
    public Float A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;
    public boolean A0B;
    public boolean A0C;
    public Map A0A = new ConcurrentHashMap();
    public long A00 = -1;

    public final void A0C(int i) {
        N10 n10 = (N10) this;
        AbstractC55211OeV abstractC55211OeV = n10.A01;
        C14360o3.A0C(abstractC55211OeV, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPMediaStreamABRObserverImpl");
        C52047N0y c52047N0y = (C52047N0y) abstractC55211OeV;
        synchronized (c52047N0y) {
            c52047N0y.A00 = i;
        }
        C52048N0z c52048N0z = (C52048N0z) n10.A02;
        if (c52048N0z != null) {
            synchronized (c52048N0z) {
                c52048N0z.A00 = i;
            }
        }
        AbstractC46523KiO abstractC46523KiO = n10.A06;
        C14360o3.A0C(abstractC46523KiO, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPNetworkStateManagerImpl");
        ((N15) abstractC46523KiO).A00 = i;
        OKc oKc = n10.A03;
        C14360o3.A0C(oKc, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPMediaStreamLatencyManagerImpl");
        ((N12) oKc).A00 = i;
        InterfaceC58164PqU interfaceC58164PqU = ((AbstractC55198Oe5) n10).A01;
        if (interfaceC58164PqU != null) {
            interfaceC58164PqU.ETF(i);
        }
        n10.A00 = i;
    }

    public abstract void A0D(C45127Jxw c45127Jxw, AbstractC53624NnV abstractC53624NnV);

    public static void A09(C0Zx c0Zx) {
        EnumC53334Nik A00;
        String str = AbstractC53606NnD.A03;
        if (str != null && (A00 = N10.A00(str)) != null) {
            c0Zx.A01(A00, "device_build_type");
        }
    }

    public static void A0A(C0Zx c0Zx) {
        EnumC53335Nil A01;
        String str = AbstractC53606NnD.A01;
        if (str != null && (A01 = N10.A01(str)) != null) {
            c0Zx.A01(A01, "device_type");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B() {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55198Oe5.A0B():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0299, code lost:
    
        if (r15 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c9, code lost:
    
        if (r15 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f9, code lost:
    
        if (r1 == null) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0653 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(boolean r24) {
        /*
            Method dump skipped, instructions count: 1679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55198Oe5.A0E(boolean):void");
    }

    public static N15 A06(InterfaceC02590Ai interfaceC02590Ai, N10 n10, N13 n13, AbstractC53637Nni abstractC53637Nni, MXK mxk) {
        String A07 = mxk.A07();
        C14360o3.A0A(A07);
        interfaceC02590Ai.AAP("app_warm_start_session_id", A07);
        String A05 = mxk.A05();
        C14360o3.A0A(A05);
        interfaceC02590Ai.AAP("app_cold_start_session_id", A05);
        Long A02 = abstractC53637Nni.A02();
        C14360o3.A0A(A02);
        interfaceC02590Ai.A9K("battery_level_start_pct", A02);
        Long A01 = abstractC53637Nni.A01();
        C14360o3.A0A(A01);
        interfaceC02590Ai.A9K("battery_level_end_pct", A01);
        EnumC53367NjI A04 = n13.A04();
        C14360o3.A0A(A04);
        interfaceC02590Ai.A8R(A04, "thermal_throttling_start_state_type");
        EnumC53367NjI A03 = n13.A03();
        C14360o3.A0A(A03);
        interfaceC02590Ai.A8R(A03, "thermal_throttling_end_state_type");
        AbstractC46523KiO abstractC46523KiO = n10.A06;
        C14360o3.A0C(abstractC46523KiO, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPNetworkStateManagerImpl");
        return (N15) abstractC46523KiO;
    }

    public static void A07(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx) {
        C14360o3.A0A(interfaceC02530Ab);
        c0Zx.A01(interfaceC02530Ab, "device_build_type");
        String str = AbstractC53606NnD.A02;
        C14360o3.A0A(str);
        c0Zx.A06("soc_version", str);
        String str2 = AbstractC53606NnD.A00;
        C14360o3.A0A(str2);
        c0Zx.A06("build_flavor", str2);
        interfaceC02590Ai.AAQ(c0Zx, "__device");
    }

    public static void A08(InterfaceC02590Ai interfaceC02590Ai, MXK mxk) {
        Integer A02 = mxk.A02();
        if (A02 != null) {
            interfaceC02590Ai.AAP("streaming_protocol", N10.A05(A02));
        }
    }
}
