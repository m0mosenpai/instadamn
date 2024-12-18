package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123255i0 {
    public XC7 A00;
    public Collection A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final android.net.Uri A06;
    public final Handler A07;
    public final C46322Au A08;
    public final C92414Bw A09;
    public final VpsEventCallback A0A;
    public final C92304Bk A0B;
    public final WcE A0C;
    public final C46332Av A0D;
    public final String A0F;
    public final InterfaceC460229m A0H;
    public final boolean A0I;
    public final boolean A0J;
    public volatile boolean A0M;
    public volatile Integer A0K = C05F.A0j;
    public final Object A0E = new Object();
    public final AtomicInteger A0G = new AtomicInteger(0);
    public volatile boolean A0L = true;

    public final void A00() {
        boolean z;
        boolean z2;
        Collection collection;
        if (this.A0J) {
            synchronized (this) {
                z = false;
                if (!this.A0M) {
                    Integer num = this.A0K;
                    Integer num2 = C05F.A01;
                    boolean z3 = false;
                    if (num == num2 && (collection = this.A01) != null) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C69639Vsg) it.next()).A01 != num2) {
                                    break;
                                }
                            } else {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (z3) {
                        this.A0M = true;
                        z = true;
                    } else {
                        Integer num3 = this.A0K;
                        Integer num4 = C05F.A0C;
                        if (num3 != num4 && this.A0K != C05F.A0Y) {
                            Collection collection2 = this.A01;
                            if (collection2 != null) {
                                Iterator it2 = collection2.iterator();
                                while (it2.hasNext()) {
                                    if (((C69639Vsg) it2.next()).A01 == num4) {
                                    }
                                }
                            }
                        }
                        this.A0M = true;
                        break;
                    }
                    z2 = z;
                    z = this.A0M;
                } else {
                    z2 = false;
                }
            }
            if (z) {
                this.A0A.callback(new C4CD(this.A0B.A07, z2));
            }
        }
    }

    public final void A01(Integer num) {
        synchronized (this.A0E) {
            this.A0K = num;
        }
        A00();
    }

    public final void A02(boolean z) {
        C123245hz c123245hz = (C123245hz) this;
        synchronized (c123245hz.A0E) {
            Integer num = c123245hz.A0K;
            Integer num2 = C05F.A00;
            if (num != num2 && c123245hz.A0K != C05F.A01) {
                c123245hz.A0K = num2;
                android.net.Uri uri = c123245hz.A06;
                AbstractC459729h.A01("Exo2DashLiveManifestFetcher", "Manifest single load requested, uri=%s", uri);
                C92304Bk c92304Bk = c123245hz.A0B;
                C4C2 c4c2 = new C4C2(c92304Bk.A03, z, c92304Bk.A04);
                C4C7 c4c7 = C4C7.A0B;
                C4C7 c4c72 = new C4C7(uri, new C4C6(C4C4.A02, c4c2, "", null, null, null, "", "", null, null, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, false, false, false, false), null, Collections.emptyMap(), null, 1, 0, 0L, 0L, -1L);
                c123245hz.A04.A01(c123245hz.A05.getMainLooper(), c123245hz, new WcC(c123245hz.A03.ALy(), new C4C7(uri, 1, 0), c123245hz.A02, 4), 1);
                c123245hz.A0C.A00(c4c72);
            }
        }
    }

    public AbstractC123255i0(Context context, android.net.Uri uri, Handler handler, C46322Au c46322Au, InterfaceC460229m interfaceC460229m, VpsEventCallback vpsEventCallback, C92304Bk c92304Bk, C46332Av c46332Av, HeroPlayerSetting heroPlayerSetting, String str, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int i2;
        int i3;
        int i4 = i;
        this.A0J = z2;
        C92414Bw c92414Bw = new C92414Bw(null, vpsEventCallback, EnumC91984Ae.LIVE_MANIFEST, new C92394Bu(), c92304Bk, null, null, str, C2Ai.A00.A01(), null, null, atomicBoolean, atomicBoolean2, j, false, false, false, z3, z4, z5, false, heroPlayerSetting.A2U, z6);
        this.A09 = c92414Bw;
        c92414Bw.A16 = heroPlayerSetting.A3B;
        this.A0C = new WcE(c92414Bw);
        this.A05 = context;
        this.A0B = c92304Bk;
        this.A0F = str;
        this.A06 = uri;
        this.A0I = z;
        this.A02 = i <= 0 ? heroPlayerSetting.A0J : i4;
        if (map.containsKey("dash.live_num_segments_prefetch")) {
            i2 = Integer.parseInt((String) map.get("dash.live_num_segments_prefetch"));
        } else {
            i2 = 3;
        }
        this.A04 = i2;
        this.A0D = c46332Av;
        this.A01 = null;
        this.A0A = vpsEventCallback;
        this.A07 = handler;
        if (map.containsKey("dash.live_prefetch_max_retries")) {
            i3 = Integer.parseInt((String) map.get("dash.live_prefetch_max_retries"));
        } else {
            i3 = 0;
        }
        this.A03 = i3;
        this.A08 = c46322Au;
        this.A0H = interfaceC460229m;
    }
}
