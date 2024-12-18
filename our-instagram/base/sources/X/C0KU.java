package X;

import android.content.Context;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0KU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KU extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KU(InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A00.appContext;
        return new AbstractC211911v(context) { // from class: X.13U
            public final Context A00;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "BloksInitializer";
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.1Lb] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.1Lh] */
            /* JADX WARN: Type inference failed for: r1v1, types: [X.1LL, java.lang.Object] */
            @Override // X.AbstractC211911v
            public final void A07() {
                C18720vz c18720vz = AbstractC12960li.A00;
                C226418s A01 = C226218q.A01(c18720vz);
                A01.A0P(A01.A02, "BLOKS_INIT_START");
                final Context context2 = this.A00;
                final C1LG c1lg = C1LG.A00;
                final C1LJ c1lj = C1LJ.A00;
                C14360o3.A0B(context2, 0);
                C14360o3.A0B(c1lg, 1);
                C14360o3.A0B(c1lj, 2);
                ?? obj = new Object();
                if (!C1LN.A02) {
                    C1LN.A01 = obj;
                }
                C1LV.A00 = C1LS.A00;
                C1LY c1ly = new C1LY() { // from class: X.1LX
                    /* JADX WARN: Type inference failed for: r0v2, types: [X.4ky, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r26v0, types: [X.4lA] */
                    @Override // X.C1LY
                    public final /* bridge */ /* synthetic */ Object get() {
                        final Context context3 = context2;
                        C1LG c1lg2 = c1lg;
                        C103064kh c103064kh = new C103064kh();
                        C103104kl c103104kl = AbstractC103094kk.A01;
                        C103204kv c103204kv = new C103204kv(context3, C103144kp.A00, c1lg2, C103174ks.A00, C103194ku.A00, c103104kl, C103164kr.A00, c103064kh);
                        c103204kv.A05 = C103224kx.A00;
                        c103204kv.A03 = new Object();
                        c103204kv.A06 = new C1LY() { // from class: X.4kz
                            @Override // X.C1LY
                            public final /* bridge */ /* synthetic */ Object get() {
                                return new C63W(context3, C1TU.A01());
                            }
                        };
                        c103204kv.A09 = AbstractC103094kk.A02;
                        c103204kv.A04 = AbstractC103094kk.A00;
                        c103204kv.A07 = C103254l0.A00;
                        final C006802i c006802i = C006802i.A0p;
                        c103204kv.A01 = new InterfaceC103274l2(c006802i) { // from class: X.4l1
                            public final QuickPerformanceLogger A03;
                            public final C103284l3 A02 = C103284l3.A05.A00();
                            public final InterfaceC103314l6 A01 = new InterfaceC103314l6() { // from class: X.4l5
                                public final Map A00 = new C005001p(0);

                                @Override // X.InterfaceC103314l6
                                public final void EHA(String str, String str2, Throwable th) {
                                    C14360o3.A0B(str, 0);
                                    C14360o3.A0B(str2, 1);
                                    Map map = this.A00;
                                    if (map.size() > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("message:");
                                        sb.append(str2);
                                        sb.append("\n");
                                        for (Map.Entry entry : map.entrySet()) {
                                            String str3 = (String) entry.getKey();
                                            String str4 = (String) entry.getValue();
                                            sb.append(str3);
                                            sb.append(":");
                                            sb.append(str4);
                                            sb.append("\n");
                                        }
                                        AbstractC25241Le.A00(null, str, sb.toString(), th);
                                        map.clear();
                                        return;
                                    }
                                    AbstractC25241Le.A00(null, str, str2, th);
                                }

                                @Override // X.InterfaceC103314l6
                                public final void E79(String str, String str2) {
                                    this.A00.put(str, str2);
                                }
                            };
                            public final InterfaceC103334l8 A00 = C103324l7.A00;

                            public final U3t A00(int i, int i2, long j) {
                                boolean z;
                                boolean z2;
                                InterfaceC103334l8 interfaceC103334l8 = this.A00;
                                long now = interfaceC103334l8.now();
                                C2FA c2fa = C2FA.A04;
                                AtomicLong atomicLong = c2fa.A03;
                                long A00 = AbstractC46551Kiq.A00(now, atomicLong.get(), atomicLong.get());
                                if (A00 == -1) {
                                    if (now - j > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                                        A00 = now - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                                        z = true;
                                        z2 = true;
                                        QuickPerformanceLogger quickPerformanceLogger = this.A03;
                                        C14360o3.A0A(quickPerformanceLogger);
                                        C103284l3 c103284l3 = this.A02;
                                        U3t u3t = new U3t(interfaceC103334l8, this.A01, c103284l3, quickPerformanceLogger, c2fa.A00, i, i2, now, A00, true, true);
                                        u3t.CnU("using_backup_start_time", z);
                                        u3t.CnU("using_capped_backup_start_time", z2);
                                        c103284l3.A00(u3t);
                                        return u3t;
                                    }
                                    A00 = j;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 = false;
                                QuickPerformanceLogger quickPerformanceLogger2 = this.A03;
                                C14360o3.A0A(quickPerformanceLogger2);
                                C103284l3 c103284l32 = this.A02;
                                U3t u3t2 = new U3t(interfaceC103334l8, this.A01, c103284l32, quickPerformanceLogger2, c2fa.A00, i, i2, now, A00, true, true);
                                u3t2.CnU("using_backup_start_time", z);
                                u3t2.CnU("using_capped_backup_start_time", z2);
                                c103284l32.A00(u3t2);
                                return u3t2;
                            }

                            @Override // X.InterfaceC103274l2
                            public final InterfaceC103334l8 C4l() {
                                return this.A00;
                            }

                            {
                                this.A03 = c006802i;
                            }

                            @Override // X.InterfaceC103274l2
                            public final InterfaceC72008XEw Eo0(String str, int i, int i2, long j) {
                                U3t A00 = A00(i, i2, j);
                                if (str != null) {
                                    A00.CnT("app_id", str);
                                }
                                return A00;
                            }

                            @Override // X.InterfaceC103274l2
                            public final InterfaceC72008XEw Eo1(int i, int i2, long j) {
                                return A00(i, i2, j);
                            }
                        };
                        c1lj.invoke(c103204kv);
                        Context context4 = c103204kv.A00;
                        InterfaceC103074ki interfaceC103074ki = c103204kv.A0A;
                        C103234ky c103234ky = c103204kv.A03;
                        ?? r26 = new Object() { // from class: X.4lA
                        };
                        C103134ko c103134ko = c103204kv.A04;
                        InterfaceC103124kn interfaceC103124kn = c103204kv.A09;
                        C103104kl c103104kl2 = c103204kv.A08;
                        AbstractC103154kq abstractC103154kq = c103204kv.A0B;
                        C103164kr c103164kr = c103204kv.A0F;
                        AbstractC103184kt abstractC103184kt = c103204kv.A0D;
                        C1LG c1lg3 = c103204kv.A0C;
                        C103194ku c103194ku = c103204kv.A0E;
                        InterfaceC103274l2 interfaceC103274l2 = c103204kv.A01;
                        if (interfaceC103274l2 == null) {
                            interfaceC103274l2 = C63720Ssa.A01;
                        }
                        return new C1LZ(context4, interfaceC103274l2, abstractC103154kq, c103204kv.A02, c103234ky, c103134ko, c1lg3, abstractC103184kt, c103194ku, r26, c103204kv.A05, c103204kv.A07, c103204kv.A06, c103104kl2, c103164kr, interfaceC103124kn, interfaceC103074ki);
                    }
                };
                synchronized (C1LZ.class) {
                    C1LZ.A0I = c1ly;
                }
                AbstractC25241Le.A00 = new Object();
                AbstractC25291Lj.A00 = new Object();
                C226418s A012 = C226218q.A01(c18720vz);
                A012.A0P(A012.A02, "BLOKS_INIT_END");
            }
        };
    }
}
