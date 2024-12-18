package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.android.exoplayer2.util.Util;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4Ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C91954Ab implements InterfaceC91964Ac {
    public boolean A00 = true;
    public C4AZ A01;
    public final C4AP A02;
    public final String A03;
    public final C5QS A04;
    public final String A05;
    public final boolean A06;

    @Override // X.InterfaceC91964Ac
    public final void AE9() {
        String str;
        android.net.Uri uri;
        if (this instanceof C92274Bh) {
            C92274Bh c92274Bh = (C92274Bh) this;
            C4AP c4ap = ((C91954Ab) c92274Bh).A02;
            if (c4ap != null) {
                C2BZ c2bz = c92274Bh.A01;
                C4AN c4an = c4ap.A0D;
                if (c4an != null && (str = c4an.A0G) != null && (uri = c4an.A05) != null) {
                    String A00 = AbstractC459729h.A00(uri, c4ap.A0G, str, c4ap.A0W, c2bz.A09.A3G);
                    InterfaceC92374Bs interfaceC92374Bs = null;
                    Map map = c2bz.A0B;
                    synchronized (map) {
                        InterfaceC92354Bq interfaceC92354Bq = (InterfaceC92354Bq) map.get(A00);
                        if (interfaceC92354Bq instanceof InterfaceC92374Bs) {
                            interfaceC92374Bs = (InterfaceC92374Bs) interfaceC92354Bq;
                        }
                    }
                    if (interfaceC92374Bs != null) {
                        C4C4 c4c4 = C4C3.A02.A00;
                        interfaceC92374Bs.changeHttpPriority(c4c4.A00, c4c4.A01);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC91964Ac
    public final void AGG(String str) {
        InterfaceC92374Bs interfaceC92374Bs;
        String A00 = AbstractC111324zv.A00(3517);
        if (this instanceof C92274Bh) {
            C92274Bh c92274Bh = (C92274Bh) this;
            C2BZ c2bz = c92274Bh.A01;
            C4AP c4ap = ((C91954Ab) c92274Bh).A02;
            String str2 = c4ap.A0G;
            C4AN c4an = c4ap.A0D;
            String str3 = c4an.A0G;
            String A002 = AbstractC459729h.A00(c4an.A05, str2, str3, c4ap.A0W, c2bz.A09.A3G);
            Map map = c2bz.A0B;
            synchronized (map) {
                InterfaceC92354Bq interfaceC92354Bq = (InterfaceC92354Bq) map.get(A002);
                if (interfaceC92354Bq instanceof InterfaceC92374Bs) {
                    interfaceC92374Bs = (InterfaceC92374Bs) interfaceC92354Bq;
                } else {
                    interfaceC92374Bs = null;
                }
            }
            if (interfaceC92374Bs != null) {
                interfaceC92374Bs.cancel();
            }
            C92274Bh.A01(c92274Bh, A00);
        }
    }

    @Override // X.InterfaceC91964Ac
    public void AQ5() {
        if (this instanceof C91944Aa) {
            ((C91944Aa) this).A00.run();
            return;
        }
        throw new UnsupportedOperationException("VodPrefetchTask is a base class. Please use more specific prefetch task");
    }

    @Override // X.InterfaceC91964Ac
    public final C4AZ BgV() {
        return this.A01;
    }

    @Override // X.InterfaceC91964Ac
    public final void DFf() {
        VpsEventCallback vpsEventCallback;
        if (this instanceof C92274Bh) {
            C92274Bh c92274Bh = (C92274Bh) this;
            if (c92274Bh.A02 && (vpsEventCallback = c92274Bh.A00) != null && ((C91954Ab) c92274Bh).A02 != null) {
                vpsEventCallback.callback(C92274Bh.A00(c92274Bh, "FAIL"));
            }
        }
    }

    @Override // X.InterfaceC91964Ac
    public final void DfD(String str) {
        if (this instanceof C92274Bh) {
            C92274Bh.A01((C92274Bh) this, str);
        }
    }

    @Override // X.InterfaceC91964Ac
    public final boolean equals(Object obj) {
        if ((obj instanceof C91954Ab) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC91964Ac
    public void onComplete() {
        AtomicReference atomicReference;
        int A04;
        long[] jArr;
        long j;
        int i;
        Integer num;
        C2A4 c2a4;
        C4BT c4bt;
        C5QS c5qs = this.A04;
        if (c5qs != null) {
            int i2 = c5qs.A01;
            if (i2 == 2) {
                atomicReference = c5qs.A0A;
            } else {
                atomicReference = c5qs.A09;
            }
            if (atomicReference != null && atomicReference.get() != null && ((C98224b1) atomicReference.get()).A02 != null) {
                InterfaceC98454bO interfaceC98454bO = ((C4XE) ((C98224b1) atomicReference.get()).A02).A00;
                if ((interfaceC98454bO instanceof C98444bN) && interfaceC98454bO != null && 1 != 0) {
                    C98444bN A03 = C46442Bh.A03(c5qs.A09);
                    C98444bN A032 = C46442Bh.A03(c5qs.A0A);
                    if (i2 == 2) {
                        A03 = A032;
                    }
                    if (A03 != null) {
                        C4AP c4ap = c5qs.A06;
                        long j2 = c4ap.A08;
                        if (j2 == -1) {
                            jArr = A03.A04;
                            j = c5qs.A00;
                            A04 = Util.A04(jArr, j, true);
                        } else {
                            A04 = Util.A04(A03.A05, j2 * 1000, true);
                            jArr = A03.A04;
                            j = jArr[A04];
                        }
                        long j3 = c4ap.A06;
                        int i3 = 0;
                        if (j3 == -1) {
                            int i4 = c4ap.A04;
                            HeroPlayerSetting heroPlayerSetting = c5qs.A07.A0A;
                            if (i4 == 1) {
                                i = heroPlayerSetting.A0Z;
                            } else {
                                i = heroPlayerSetting.A0Y;
                            }
                        } else {
                            long j4 = j3 * 1000;
                            long[] jArr2 = A03.A05;
                            long j5 = jArr2[A04];
                            int i5 = A04;
                            while (i5 < A03.A00 && (jArr2[i5] + A03.A03[i5]) - j5 < j4) {
                                i5++;
                            }
                            i = (i5 + 1) - A04;
                        }
                        C46442Bh c46442Bh = c5qs.A07;
                        synchronized (C2A6.A00()) {
                        }
                        C461429y c461429y = c46442Bh.A09;
                        if (c461429y != null && C461429y.A00(c461429y, 18) == 1 && ((c2a4 = c46442Bh.A06) == null || !c2a4.A01())) {
                            int i6 = c5qs.A00;
                            C4BB c4bb = c5qs.A08;
                            int[] iArr = A03.A02;
                            if (iArr != null && jArr != null) {
                                int i7 = (int) jArr[0];
                                for (int i8 : iArr) {
                                    i7 += i8;
                                }
                                if (i7 != 0 && i6 < i7) {
                                    int i9 = (int) (((c4bb.A02.A05 / 8.0d) * 0.0d) / 1000.0d);
                                    if (i6 + i9 > i7) {
                                        c4bt = new C4BT(i7 - i6, C05F.A0C);
                                    } else {
                                        c4bt = new C4BT(i9, C05F.A0C);
                                    }
                                    i3 = c4bt.A00;
                                    num = c4bt.A01;
                                }
                            }
                            c4bt = new C4BT(0, C05F.A00);
                            i3 = c4bt.A00;
                            num = c4bt.A01;
                        } else {
                            long j6 = c5qs.A00;
                            long j7 = jArr[A04];
                            if (j6 > j7) {
                                i3 = (int) (-(j6 - j7));
                            }
                            for (int i10 = A04; i10 < A03.A00 && i10 - A04 < i; i10++) {
                                i3 += A03.A02[i10];
                            }
                            num = C05F.A03;
                        }
                        if (i3 > 0) {
                            C2B4 c2b4 = c5qs.A03;
                            C2BB c2bb = c5qs.A05;
                            VpsEventCallback vpsEventCallback = c5qs.A04;
                            String str = c4ap.A0D.A0G;
                            int i11 = c4ap.A04;
                            C4BB c4bb2 = c5qs.A08;
                            boolean z = c5qs.A0D;
                            boolean z2 = c5qs.A0B;
                            boolean z3 = c5qs.A0C;
                            long j8 = c5qs.A02;
                            C4AP c4ap2 = new C4AP(c4ap);
                            c4ap2.A0L = true;
                            c4ap2.A07 = j;
                            c4ap2.A02 = i3;
                            c4ap2.A0E = num;
                            c4ap2.A0F = C05F.A0C;
                            C4AZ c4az = C4AZ.HIGH;
                            HeroPlayerSetting heroPlayerSetting2 = c46442Bh.A0A;
                            if (heroPlayerSetting2.A2p) {
                                WEM.A02(c4ap2, heroPlayerSetting2);
                            }
                            String str2 = c4bb2.A02.A0T;
                            boolean z4 = false;
                            if (i11 == 2) {
                                z4 = true;
                            }
                            C92274Bh A02 = C46442Bh.A02(c2b4, c4az, vpsEventCallback, c2bb, c4ap2, null, c46442Bh, null, str, str2, null, j8, z4, z, z2, z3);
                            AbstractC459729h.A01("UnifiedPrefetchManager", "Follow up prefetch for video: %s", str);
                            C46442Bh.A05(c46442Bh, A02, c4ap2.A0F);
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC91964Ac
    public final String toString() {
        StringBuilder sb;
        long j;
        String str = this.A05;
        C4AP c4ap = this.A02;
        if (c4ap != null && c4ap.A0W) {
            str = AnonymousClass001.A0R(str, "_t");
        }
        if (this.A06) {
            if (c4ap != null) {
                j = c4ap.A07;
                if (j != 0) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("_");
                } else {
                    return str;
                }
            } else {
                return str;
            }
        } else {
            if (c4ap == null) {
                android.util.Log.w("VodPrefetchTask", "Trying to lookup prefetch task with insufficient information");
                sb = new StringBuilder();
                sb.append(str);
                sb.append("_track_-1");
            } else {
                android.net.Uri uri = c4ap.A0D.A05;
                if (uri == null) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("_track_");
                    sb.append(c4ap.A04);
                } else if (c4ap.A07 != 0) {
                    sb = new StringBuilder();
                    sb.append(uri.toString());
                    sb.append("_");
                    j = c4ap.A07;
                } else {
                    return uri.toString();
                }
            }
            return sb.toString();
        }
        sb.append(j);
        return sb.toString();
    }

    public C91954Ab(C4AZ c4az, C4AP c4ap, C5QS c5qs, String str, String str2, boolean z) {
        this.A02 = c4ap;
        this.A05 = str;
        this.A03 = str2;
        this.A06 = z;
        this.A01 = c4az;
        this.A04 = c5qs;
    }

    @Override // X.InterfaceC91964Ac
    public final int hashCode() {
        return toString().hashCode();
    }
}
