package X;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OaQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55070OaQ {
    public final C8NS A00;
    public final OR5 A01;
    public final C54759OHo A02;
    public final OLV A03;
    public final C55097Ob8 A04;
    public final C69439VnO A05;
    public final U7W A06;
    public final C66036TyY A07;
    public final String A08;
    public final ExecutorService A09;
    public final boolean A0A;

    public static final void A00(Bitmap bitmap, C55070OaQ c55070OaQ, Integer num, Map map, long j) {
        Object A1D;
        try {
            try {
                A01(bitmap, c55070OaQ, c55070OaQ.A08, map, j, c55070OaQ.A0A);
                bitmap.recycle();
                A1D = C0eB.A00;
            } catch (Throwable th) {
                bitmap.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            A1D = MSW.A1D(th2);
        }
        Throwable A00 = C09550e6.A00(A1D);
        if (A00 != null) {
            c55070OaQ.A03.A02(C05F.A0N, num, Long.valueOf(j), null, A00, null);
        }
    }

    public /* synthetic */ C55070OaQ(C8NS c8ns, OR5 or5, OLV olv, C55097Ob8 c55097Ob8, C69439VnO c69439VnO, U7W u7w, C66036TyY c66036TyY, String str, java.util.Set set, ExecutorService executorService) {
        long micros = TimeUnit.SECONDS.toMicros(1L);
        AbstractC43594JPz.A1P(set, or5);
        this.A04 = c55097Ob8;
        this.A00 = c8ns;
        this.A01 = or5;
        this.A05 = c69439VnO;
        this.A03 = olv;
        this.A07 = c66036TyY;
        this.A08 = str;
        this.A09 = executorService;
        this.A06 = u7w;
        this.A0A = AbstractC25229BEm.A1Z(c8ns);
        this.A02 = new C54759OHo(set, micros);
        try {
            Iterator A15 = AbstractC166997dE.A15(C55097Ob8.A06);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Map map = c55097Ob8.A04;
                if (map != null && AbstractC31177DnL.A1b(map.get(A1K.getKey()))) {
                    c55097Ob8.A05.add(AbstractC167027dH.A0Q(A1K.getValue()));
                }
            }
        } catch (Throwable th) {
            new C09540e5(th);
        }
        if (c66036TyY != null) {
            C55782Opr c55782Opr = new C55782Opr(this);
            InterfaceC72002XEq interfaceC72002XEq = c66036TyY.A00;
            interfaceC72002XEq.getClass();
            interfaceC72002XEq.EZt(c55782Opr);
        }
    }

    public static final void A01(Bitmap bitmap, C55070OaQ c55070OaQ, String str, Map map, long j, boolean z) {
        String str2;
        C55097Ob8 c55097Ob8 = c55070OaQ.A04;
        C14360o3.A0B(str, 1);
        if (z) {
            str2 = "_ready.png";
        } else {
            str2 = "_snapshot.png";
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(c55097Ob8.A02);
        A1C.append(j);
        A1C.append('_');
        FileOutputStream A0x = MSW.A0x(C55097Ob8.A00(c55097Ob8, MSZ.A0u(str, str2, A1C)));
        try {
            C0fK.A02(Bitmap.CompressFormat.PNG, bitmap, A0x, 100);
            A0x.close();
            OLV olv = c55070OaQ.A03;
            if (z) {
                olv.A02(C05F.A0C, null, Long.valueOf(j), str, null, map);
                try {
                    c55097Ob8.A04(c55070OaQ.A08);
                    return;
                } catch (Throwable th) {
                    new C09540e5(th);
                    return;
                }
            }
            olv.A02(C05F.A01, null, Long.valueOf(j), str, null, map);
        } finally {
        }
    }

    public final void A02(long j) {
        C54759OHo c54759OHo = this.A02;
        HashMap hashMap = c54759OHo.A01;
        long j2 = j / c54759OHo.A00;
        long j3 = j2;
        if (j < 0) {
            j2--;
        }
        Number A0W = AbstractC31171DnF.A0W(Long.valueOf(j2), hashMap);
        if (A0W != null) {
            long longValue = A0W.longValue() - 1;
            Long valueOf = Long.valueOf(longValue);
            long j4 = j3;
            if (j < 0) {
                j4 = j3 - 1;
            }
            hashMap.put(Long.valueOf(j4), valueOf);
            if (valueOf != null && longValue >= 0) {
                if (j == 0 || (j > 0 && this.A06.A0G())) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        C66036TyY c66036TyY = this.A07;
                        if (c66036TyY != null) {
                            InterfaceC72002XEq interfaceC72002XEq = c66036TyY.A00;
                            interfaceC72002XEq.getClass();
                            Bitmap ELb = interfaceC72002XEq.ELb();
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            if (ELb.hasAlpha()) {
                                if ((AbstractC167007dF.A1N(ELb.getPixel(50, 50)) ? 1 : 0) + (AbstractC167007dF.A1N(ELb.getPixel(ELb.getWidth() - 50, 50)) ? 1 : 0) + (AbstractC167007dF.A1N(ELb.getPixel(50, ELb.getHeight() - 50)) ? 1 : 0) + (AbstractC167007dF.A1N(ELb.getPixel(ELb.getWidth() - 50, ELb.getHeight() - 50)) ? 1 : 0) >= 2) {
                                    this.A03.A02(C05F.A01, null, Long.valueOf(j), this.A08, null, AbstractC06930Yk.A06(AbstractC166987dD.A1L(AbstractC58354Ptu.A01(19, 12, 40), "true"), AbstractC166987dD.A1L("capture_latency_ms", String.valueOf(currentTimeMillis2)), AbstractC166987dD.A1L("snapshot_type", "image"), AbstractC166987dD.A1L("timestamp_us", String.valueOf(j))));
                                }
                            }
                            this.A09.submit(new PTU(ELb, this, C05F.A01, j, currentTimeMillis2));
                            if (j < 0) {
                                j3--;
                            }
                            hashMap.remove(Long.valueOf(j3));
                        }
                    } catch (Throwable th) {
                        this.A03.A02(C05F.A0N, C05F.A01, Long.valueOf(j), null, th, null);
                    }
                }
            }
        }
    }
}
