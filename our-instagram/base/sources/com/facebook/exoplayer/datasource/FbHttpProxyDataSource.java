package com.facebook.exoplayer.datasource;

import X.AbstractC459729h;
import X.C2BB;
import X.C2BC;
import X.C4B8;
import X.C4C2;
import X.C4C3;
import X.C4C4;
import X.C4C6;
import X.C4C7;
import X.C4J9;
import X.C92304Bk;
import X.EnumC92424Bx;
import X.InterfaceC92344Bp;
import X.InterfaceC92374Bs;
import X.OT3;
import X.WVA;
import android.net.Uri;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class FbHttpProxyDataSource implements InterfaceC92344Bp, InterfaceC92374Bs {
    public InterfaceC92344Bp A00;
    public int A01;
    public long A02 = 0;
    public C2BB A03;
    public final C92304Bk A04;
    public final HeroPlayerSetting A05;

    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
    public final synchronized void close() {
        this.A00.close();
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92364Br
    public final synchronized int read(byte[] bArr, int i, int i2) {
        long j = this.A02;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            i2 = (int) Math.min(i2, j);
        }
        int read = this.A00.read(bArr, i, i2);
        if (read != -1) {
            this.A02 -= read;
        }
        return read;
    }

    @Override // X.InterfaceC92354Bq
    public final void cancel() {
    }

    @Override // X.InterfaceC92344Bp
    public final void changeHttpPriority(byte b, boolean z) {
        this.A00.changeHttpPriority(b, z);
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
    public final Map getResponseHeaders() {
        return this.A00.getResponseHeaders();
    }

    @Override // X.InterfaceC92354Bq
    public final Uri getUri() {
        return this.A00.getUri();
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
    public final synchronized long open(C4C7 c4c7) {
        boolean z;
        String str;
        String str2;
        long max;
        Boolean valueOf;
        Uri uri = c4c7.A06;
        C4C6 c4c6 = c4c7.A07;
        C4C2 c4c2 = c4c6.A0I;
        if (c4c2 != null) {
            z = c4c2.A02;
            str = c4c2.A00;
            str2 = c4c2.A01;
        } else {
            z = false;
            str = "";
            str2 = "";
        }
        String str3 = this.A04.A07;
        C4C2 c4c22 = new C4C2(str, z, str2);
        C4C4 c4c4 = c4c6.A0H;
        if (c4c4 == null) {
            c4c4 = C4C3.A01.A00;
        }
        if (z) {
            c4c4 = C4C3.A03.A00;
        }
        String str4 = null;
        Map emptyMap = Collections.emptyMap();
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        byte[] bArr = c4c7.A0A;
        long j = c4c7.A02;
        long j2 = c4c7.A04;
        long j3 = j - j2;
        long j4 = c4c7.A03;
        if (j4 <= 0) {
            j4 = -1;
        }
        int i = c4c7.A00;
        C4C6 c4c62 = new C4C6(c4c4, c4c22, c4c6, null, this.A01, -1, false);
        String str5 = c4c7.A08;
        if (str5 != null) {
            str4 = str5;
        }
        C4B8.A02(uri);
        C4C7 c4c72 = new C4C7(uri, c4c62, str4, emptyMap, bArr, 1, i, j3, j2, j4);
        HeroPlayerSetting heroPlayerSetting = this.A05;
        if (heroPlayerSetting.A0z.enableSloHttpHeaderLogging) {
            if (str3 != null) {
                OT3 ot3 = OT3.A01;
                synchronized (ot3) {
                    try {
                        boolean z2 = false;
                        if (ot3.A00.get(str3) != null) {
                            z2 = true;
                        }
                        valueOf = Boolean.valueOf(z2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (valueOf.booleanValue()) {
                }
            }
            Map map = c4c6.A0Q;
            if (!map.containsKey("x-fb-qpl-ec")) {
                C4J9.A02(c4c7);
            }
            String str6 = (String) map.get("x-fb-qpl-ec");
            if (str6 != null) {
                c4c72.A01(map);
                OT3 ot32 = OT3.A01;
                synchronized (ot32) {
                    try {
                        ot32.A00.put(str3, str6);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        try {
            C2BB c2bb = this.A03;
            if (c2bb != null) {
                c2bb.DvF(EnumC92424Bx.NOT_CACHED, c4c72);
            }
            InterfaceC92344Bp interfaceC92344Bp = this.A00;
            long open = interfaceC92344Bp.open(c4c72);
            boolean z3 = false;
            if (heroPlayerSetting.A1p) {
                z3 = true;
            }
            Map responseHeaders = interfaceC92344Bp.getResponseHeaders();
            if (responseHeaders != null && this.A03 != null) {
                List A01 = C4J9.A01("X-FB-Connection-Quality", responseHeaders, z3);
                if (A01 != null) {
                    this.A03.DvD("X-FB-Connection-Quality", (String) A01.get(0));
                }
                List list = (List) responseHeaders.get("x-fb-cec-video-limit");
                if (list != null) {
                    this.A03.DvD("x-fb-cec-video-limit", (String) list.get(0));
                }
                List list2 = (List) responseHeaders.get("up-ttfb");
                if (list2 != null) {
                    this.A03.DvD("up-ttfb", list2.get(0));
                }
                List list3 = (List) responseHeaders.get("x-fb-session-id");
                if (list3 != null) {
                    this.A03.DvD("x-fb-session-id", list3.get(0));
                }
                List list4 = (List) responseHeaders.get("x-fb-response-time-ms");
                if (list4 != null) {
                    this.A03.DvD("x-fb-response-time-ms", list4.get(0));
                }
                List list5 = (List) responseHeaders.get("x-bwe-mean");
                if (list5 != null) {
                    this.A03.DvD("x-bwe-mean", list5.get(0));
                }
                List list6 = (List) responseHeaders.get("x-bwe-std-dev");
                if (list6 != null) {
                    this.A03.DvD("x-bwe-std-dev", list6.get(0));
                }
                List list7 = (List) responseHeaders.get("x-fb-dynamic-predictive-response-chunk-size");
                if (list7 != null) {
                    this.A03.DvD("x-fb-dynamic-predictive-response-chunk-size", list7.get(0));
                }
                for (Map.Entry entry : responseHeaders.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null && !((List) entry.getValue()).isEmpty() && ((String) entry.getKey()).startsWith("x-fb-ull-")) {
                        this.A03.DvD((String) entry.getKey(), ((List) entry.getValue()).get(0));
                    }
                }
            }
            long A00 = C4J9.A00(responseHeaders, z3);
            long j5 = c4c72.A04;
            max = Math.max(0L, A00 - j5);
            if (open != -1 && open <= max) {
                this.A02 = open;
            } else {
                this.A02 = max;
            }
            Long valueOf2 = Long.valueOf(j5);
            long j6 = c4c72.A03;
            AbstractC459729h.A01("com.facebook.exoplayer.datasource.FbHttpProxyDataSource", "Opening data spec Offset: %d, Length %d Open Length %d Videoid %s Key %s", valueOf2, Long.valueOf(j6), Long.valueOf(max), str3, c4c72.A08);
            if (j6 != -1) {
                max = Math.min(open, max);
            }
        } catch (IOException e) {
            throw e;
        }
        return max;
    }

    public FbHttpProxyDataSource(C2BB c2bb, C92304Bk c92304Bk, HeroPlayerSetting heroPlayerSetting, InterfaceC92344Bp interfaceC92344Bp, int i) {
        this.A04 = c92304Bk;
        this.A00 = interfaceC92344Bp;
        this.A01 = i;
        this.A03 = c2bb;
        this.A05 = heroPlayerSetting;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        C2BB wva;
        c2bc.getClass();
        if (c2bc instanceof C2BB) {
            wva = (C2BB) c2bc;
        } else {
            wva = new WVA(c2bc);
        }
        this.A03 = wva;
    }
}
