package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.1xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42711xz implements InterfaceC42731y1 {
    public long A00;
    public InterfaceC42801y8 A01;
    public final Context A03;
    public final UserSession A04;
    public final InterfaceC42591xn A05;
    public final C42701xy A06;
    public final C42521xg A08;
    public volatile boolean A09;
    public final Map A07 = new HashMap();
    public C42771y5 A02 = C42771y5.A00;

    @Override // X.InterfaceC42731y1
    public final void A8e(C75363a3 c75363a3, C4AF c4af, String str) {
    }

    @Override // X.InterfaceC42731y1
    public final void A9w(C43121yf c43121yf, String str) {
    }

    @Override // X.InterfaceC42731y1
    public final void EDb(String str, int i) {
        this.A07.put(str, -1);
    }

    @Override // X.InterfaceC42731y1
    public final void EGC(String str) {
    }

    public static void A00(final C42711xz c42711xz) {
        String str;
        InterfaceC42591xn interfaceC42591xn;
        C3AX BkA;
        C3AR BUk;
        C9BO c9bo;
        InterfaceC42801y8 interfaceC42801y8 = c42711xz.A01;
        if (!interfaceC42801y8.CQy() && (str = C26771Rh.A00().A00) != null && (BkA = (interfaceC42591xn = c42711xz.A05).BkA(str)) != null && (BUk = interfaceC42591xn.BUk(str)) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - c42711xz.A00 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                Context context = c42711xz.A03;
                UserSession userSession = c42711xz.A04;
                C14360o3.A0B(context, 0);
                C14360o3.A0B(userSession, 1);
                c42711xz.A09 = AbstractC97064Xr.A00(context, userSession, true);
                c42711xz.A00 = elapsedRealtime;
            }
            if (c42711xz.A09) {
                C93144Fq A02 = AbstractC42951yN.A00(BUk.A00).A02(BkA.A00, BUk.A01, new InterfaceC16660sJ() { // from class: X.4Xs
                    @Override // X.InterfaceC16660sJ
                    public final Object invoke(Object obj) {
                        boolean z;
                        C140906Ys c140906Ys;
                        C42711xz c42711xz2 = C42711xz.this;
                        C43121yf c43121yf = (C43121yf) obj;
                        C3ZM c3zm = c43121yf.A01;
                        C75363a3 c75363a3 = c3zm.A01;
                        if (c75363a3 != null && c75363a3.A0U) {
                            C89483yo BfU = c42711xz2.A05.BfU(c3zm.A02);
                            if (BfU != null) {
                                WeakReference weakReference = c43121yf.A00;
                                if (weakReference != null) {
                                    c140906Ys = (C140906Ys) weakReference.get();
                                } else {
                                    c140906Ys = null;
                                }
                                if (BfU.A01 > 2) {
                                    if (c140906Ys != null) {
                                        c140906Ys.A00(true);
                                        c43121yf.A00 = null;
                                    }
                                } else if (BfU.A02 >= 512) {
                                    if (c140906Ys != null) {
                                        c140906Ys.A00(true);
                                        c43121yf.A00 = null;
                                    }
                                } else if (BfU.A03 > 0) {
                                    if (c140906Ys != null) {
                                        c140906Ys.A00(false);
                                        c43121yf.A00 = null;
                                    }
                                }
                            }
                            z = true;
                            return Boolean.valueOf(z);
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    }
                });
                if (A02 == null) {
                    A02 = null;
                }
                int i = 0;
                while (true) {
                    C42521xg c42521xg = c42711xz.A08;
                    if (i < c42521xg.A03) {
                        if (A02 != null && A02.hasNext()) {
                            C9BW A00 = C93144Fq.A00(A02, true);
                            if (c42521xg.A0B) {
                                HashSet hashSet = c42521xg.A07;
                                if ((hashSet.isEmpty() || hashSet.contains(str)) && (c9bo = (C9BO) A00.A01) != null && c9bo.A00 > c42521xg.A02) {
                                    return;
                                }
                            }
                            C43121yf c43121yf = (C43121yf) A00.A00;
                            C9BO c9bo2 = (C9BO) A00.A01;
                            c9bo2.getClass();
                            int i2 = c9bo2.A00;
                            Map map = c42711xz.A07;
                            Number number = (Number) map.get(str);
                            if (c43121yf != null && number != null && (number.equals(C42411xV.A0F) || number.intValue() > 0)) {
                                int intValue = number.intValue();
                                if (intValue > 0) {
                                    map.put(str, Integer.valueOf(intValue - 1));
                                }
                                C3ZM c3zm = c43121yf.A01;
                                final String str2 = c3zm.A02;
                                final WeakReference weakReference = c43121yf.A00;
                                final InterfaceC41211vV interfaceC41211vV = c43121yf.A02;
                                C75363a3 c75363a3 = c3zm.A01;
                                C18C.A07(c75363a3, "videoSource should not be null for item in VideoQueue");
                                C42771y5 c42771y5 = C42771y5.A00;
                                UserSession userSession2 = c42711xz.A04;
                                final C5OD c5od = new C5OD(userSession2, c75363a3, C26771Rh.A00().A00, -1, c42771y5.A00(userSession2, c43121yf), C5OC.A00(userSession2, c75363a3.A09, C26771Rh.A00().A00, i2));
                                interfaceC42801y8.E5E(new C5OF() { // from class: X.5OE
                                    @Override // X.C5OF
                                    public final void DHK(boolean z) {
                                        C140906Ys c140906Ys;
                                        String str3 = str2;
                                        C42711xz c42711xz2 = c42711xz;
                                        final C42701xy c42701xy = c42711xz2.A06;
                                        c42701xy.A00.A09.A00(str3, z, -1);
                                        C11T.A02(new Runnable() { // from class: X.5fp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                            }
                                        });
                                        WeakReference weakReference2 = weakReference;
                                        if (weakReference2 != null && (c140906Ys = (C140906Ys) weakReference2.get()) != null) {
                                            c140906Ys.A00(z);
                                        }
                                        C42711xz.A00(c42711xz2);
                                    }
                                }, c5od);
                            }
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC42731y1
    public final void DyD() {
        this.A01.AGN(false);
    }

    public C42711xz(Context context, UserSession userSession, InterfaceC42591xn interfaceC42591xn, C42701xy c42701xy, C42521xg c42521xg) {
        this.A03 = context;
        this.A04 = userSession;
        this.A08 = c42521xg;
        this.A05 = interfaceC42591xn;
        this.A06 = c42701xy;
        this.A01 = new C42791y7(userSession, 26374082, c42521xg.A04);
    }

    @Override // X.InterfaceC42731y1
    public final void Enk(Integer num) {
        if (C11T.A08()) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.3ZY
                @Override // java.lang.Runnable
                public final void run() {
                    C42711xz c42711xz = C42711xz.this;
                    SystemClock.elapsedRealtime();
                    C42711xz.A00(c42711xz);
                    SystemClock.elapsedRealtime();
                }

                {
                    super(26374082);
                }
            });
            return;
        }
        SystemClock.elapsedRealtime();
        A00(this);
        SystemClock.elapsedRealtime();
    }
}
