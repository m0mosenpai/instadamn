package X;

import android.os.Handler;
import android.util.LruCache;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121985fq implements InterfaceC91964Ac {
    public final C4AP A00;
    public final int A01;
    public final Handler A02;
    public final InterfaceC460229m A03;
    public final VpsEventCallback A04;
    public final C46302As A05;
    public final HeroPlayerSetting A06;
    public final Map A07;
    public final boolean A08;

    @Override // X.InterfaceC91964Ac
    public final void AE9() {
    }

    private void A00(String str) {
        String str2;
        if (this.A08) {
            VpsEventCallback vpsEventCallback = this.A04;
            C4AP c4ap = this.A00;
            C4AN c4an = c4ap.A0D;
            if (c4an != null && (str2 = c4an.A0G) != null) {
                vpsEventCallback.callback(new C138306Om(str2, String.valueOf(c4ap.A0L), str, true));
            }
        }
    }

    @Override // X.InterfaceC91964Ac
    public final void AGG(String str) {
        A00("CANCELED_ONGOING_PREFETCH");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent, com.facebook.exoplayer.ipc.VideoPlayerServiceEvent, java.lang.Object] */
    @Override // X.InterfaceC91964Ac
    public final void AQ5() {
        int parseInt;
        if (this.A08) {
            this.A04.callback(new C4CF(this.A00));
        }
        C46302As c46302As = this.A05;
        C4AP c4ap = this.A00;
        C4AN c4an = c4ap.A0D;
        android.net.Uri uri = c4an.A05;
        Handler handler = this.A02;
        C92304Bk c92304Bk = new C92304Bk(c4ap.A0B, c4an.A06, c4an.A0G, c4an.A0A, c4an.A0B, c4ap.A0W);
        Map map = this.A07;
        HeroPlayerSetting heroPlayerSetting = this.A06;
        VpsEventCallback vpsEventCallback = this.A04;
        String str = c4an.A09;
        int i = this.A01;
        InterfaceC460229m interfaceC460229m = this.A03;
        synchronized (c46302As) {
            c46302As.A00(heroPlayerSetting, map);
            AtomicReference atomicReference = c46302As.A03;
            LruCache lruCache = (LruCache) atomicReference.get();
            String str2 = c92304Bk.A07;
            AbstractC123255i0 abstractC123255i0 = (AbstractC123255i0) lruCache.get(str2);
            if (abstractC123255i0 != null) {
                if (abstractC123255i0.A0K == C05F.A00 || abstractC123255i0.A0K == C05F.A01 || abstractC123255i0.A0K == C05F.A0Y) {
                    AbstractC459729h.A01("DashLiveChunkSourceCache", "Video has been prefetched or currently prefetching %s", str2);
                }
            } else {
                try {
                    abstractC123255i0 = new C123245hz(c46302As.A00, uri, handler, c46302As.A01, interfaceC460229m, vpsEventCallback, c92304Bk, c46302As.A02, heroPlayerSetting, AbstractC92114Ar.A02(uri, new C92074An(null, heroPlayerSetting, null, true), str), "DashLivePrefetchTask", map, new AtomicBoolean(false), new AtomicBoolean(false), i, 0L, true, true);
                    ((LruCache) atomicReference.get()).put(str2, abstractC123255i0);
                } catch (C40L e) {
                    EnumC61171RgX enumC61171RgX = EnumC61171RgX.MANIFEST_PARSE_ERROR;
                    ?? obj = new Object();
                    obj.A01 = str;
                    obj.A00 = e;
                    vpsEventCallback.callback(enumC61171RgX, obj);
                }
            }
            AbstractC459729h.A01("DashLiveChunkSourceCache", "Start loading dash live manifest: %s", str2);
            if (map.containsKey("dash.live_prefetch_max_retries") && (parseInt = Integer.parseInt((String) map.get("dash.live_prefetch_max_retries"))) > 0) {
                abstractC123255i0.A0G.set(parseInt);
            }
            abstractC123255i0.A02(true);
        }
    }

    @Override // X.InterfaceC91964Ac
    public final C4AZ BgV() {
        return C4AZ.HIGH;
    }

    @Override // X.InterfaceC91964Ac
    public final void DFf() {
        if (this.A06.A2n) {
            this.A04.callback(new C4CG(this.A00, "FAIL", "", "", -1.0f, -1, -1, -1, -1));
        }
    }

    @Override // X.InterfaceC91964Ac
    public final boolean equals(Object obj) {
        if ((obj instanceof C121985fq) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC91964Ac
    public final void onComplete() {
        if (this.A06.A2n) {
            this.A04.callback(new C4CG(this.A00, "SUCCESS", "", "", -1.0f, -1, -1, -1, -1));
        }
    }

    @Override // X.InterfaceC91964Ac
    public final String toString() {
        android.net.Uri uri = this.A00.A0D.A05;
        if (uri == null) {
            return "";
        }
        return uri.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r8.A2p != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C121985fq(android.os.Handler r3, X.InterfaceC460229m r4, com.facebook.exoplayer.monitor.VpsEventCallback r5, X.C46302As r6, X.C4AP r7, com.facebook.video.heroplayer.setting.HeroPlayerSetting r8, java.util.Map r9, int r10) {
        /*
            r2 = this;
            r2.<init>()
            r2.A05 = r6
            r2.A07 = r9
            r2.A06 = r8
            r2.A02 = r3
            r2.A01 = r10
            r2.A04 = r5
            r2.A00 = r7
            r2.A03 = r4
            boolean r0 = r8.A2n
            if (r0 != 0) goto L1c
            boolean r1 = r8.A2p
            r0 = 0
            if (r1 == 0) goto L1d
        L1c:
            r0 = 1
        L1d:
            r2.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121985fq.<init>(android.os.Handler, X.29m, com.facebook.exoplayer.monitor.VpsEventCallback, X.2As, X.4AP, com.facebook.video.heroplayer.setting.HeroPlayerSetting, java.util.Map, int):void");
    }

    @Override // X.InterfaceC91964Ac
    public final int hashCode() {
        return toString().hashCode();
    }

    @Override // X.InterfaceC91964Ac
    public final void DfD(String str) {
        A00(str);
    }
}
