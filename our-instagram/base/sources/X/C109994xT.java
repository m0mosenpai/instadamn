package X;

import android.os.Build;
import com.facebook.memorytimeline.renderthread.RenderThreadStatsMemoryTimelineMetricSource$NativeImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4xT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109994xT implements C0TR {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final InterfaceC49832Qt A0E;
    public final Pattern A0F;
    public final Pattern A0G;
    public final boolean A0H;

    @Override // X.C0TR
    public final boolean shouldCollectMetrics(int i) {
        return (i & 1048576) != 0;
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean shouldCollectMetrics(int i, C0TG c0tg) {
        return C0TQ.A00(c0tg, this, i);
    }

    @Override // X.C0TR
    public final Collection getDataPoints() {
        boolean z;
        C0TJ c0tj;
        String group;
        String group2;
        String nativeGetNativeRenderThreadStats = RenderThreadStatsMemoryTimelineMetricSource$NativeImpl.nativeGetNativeRenderThreadStats(Build.VERSION.SDK_INT);
        ArrayList arrayList = new ArrayList();
        if (nativeGetNativeRenderThreadStats != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new StringReader(nativeGetNativeRenderThreadStats));
                try {
                    this.A00 = bufferedReader.readLine();
                    while (true) {
                        String str = this.A00;
                        if (str == null) {
                            break;
                        }
                        if (str.equals("CPU Caches:")) {
                            String readLine = bufferedReader.readLine();
                            this.A00 = readLine;
                            boolean z2 = false;
                            long j = 0;
                            while (readLine != null && readLine.startsWith(" ")) {
                                Matcher matcher = this.A0G.matcher(readLine);
                                if (matcher.find()) {
                                    if (this.A00.contains("Glyph Cache:")) {
                                        arrayList.add(new C0TJ(C0TP.A0C, A00(matcher)));
                                        this.A03 = true;
                                        z2 = true;
                                    } else {
                                        j += A00(matcher);
                                    }
                                }
                                readLine = bufferedReader.readLine();
                                this.A00 = readLine;
                            }
                            if (j > 0 || this.A09) {
                                arrayList.add(new C0TJ(C0TP.A0D, j));
                                this.A09 = true;
                            }
                            if (this.A03 && !z2) {
                                arrayList.add(new C0TJ(C0TP.A0C, 0L));
                            }
                        } else if (str.equals("GPU Caches:")) {
                            String readLine2 = bufferedReader.readLine();
                            this.A00 = readLine2;
                            char c = 0;
                            long j2 = 0;
                            long j3 = 0;
                            long j4 = 0;
                            long j5 = 0;
                            while (readLine2 != null && readLine2.startsWith(" ")) {
                                if (readLine2.equals("  Other:")) {
                                    c = 1;
                                } else if (readLine2.equals("  SW Path Mask:")) {
                                    c = 2;
                                } else if (readLine2.equals("  Image:")) {
                                    c = 3;
                                } else if (readLine2.equals("  Scratch:")) {
                                    c = 4;
                                } else {
                                    Matcher matcher2 = this.A0G.matcher(readLine2);
                                    if (matcher2.find()) {
                                        if (c != 1) {
                                            if (c != 2) {
                                                if (c != 3) {
                                                    if (c == 4) {
                                                        j5 += A00(matcher2);
                                                    }
                                                } else {
                                                    j4 += A00(matcher2);
                                                }
                                            } else {
                                                j3 += A00(matcher2);
                                            }
                                        } else {
                                            j2 += A00(matcher2);
                                        }
                                    }
                                }
                                readLine2 = bufferedReader.readLine();
                                this.A00 = readLine2;
                            }
                            if (j2 > 0 || this.A0A) {
                                arrayList.add(new C0TJ(C0TP.A0L, j2));
                                this.A0A = true;
                            }
                            if (j3 > 0 || this.A05) {
                                arrayList.add(new C0TJ(C0TP.A0K, j3));
                                this.A05 = true;
                            }
                            if (j4 > 0 || this.A04) {
                                arrayList.add(new C0TJ(C0TP.A0J, j4));
                                this.A04 = true;
                            }
                            if (j5 > 0 || this.A0B) {
                                arrayList.add(new C0TJ(C0TP.A0M, j5));
                                this.A0B = true;
                            }
                        } else if (str.equals("Total CPU memory usage:")) {
                            String readLine3 = bufferedReader.readLine();
                            this.A00 = readLine3;
                            long j6 = 0;
                            long j7 = 0;
                            while (readLine3 != null && readLine3.startsWith(" ")) {
                                Matcher matcher3 = this.A0G.matcher(readLine3);
                                if (matcher3.find()) {
                                    j6 += A00(matcher3);
                                }
                                if (matcher3.find()) {
                                    j7 += A00(matcher3);
                                }
                                readLine3 = bufferedReader.readLine();
                                this.A00 = readLine3;
                            }
                            if (j6 > 0 || this.A0C) {
                                arrayList.add(new C0TJ(C0TP.A0E, j6));
                                this.A0C = true;
                            }
                            if (j7 > 0 || this.A02) {
                                arrayList.add(new C0TJ(C0TP.A0F, j6));
                                this.A02 = true;
                            }
                        } else if (str.equals("Total GPU memory usage:")) {
                            String readLine4 = bufferedReader.readLine();
                            this.A00 = readLine4;
                            long j8 = 0;
                            long j9 = 0;
                            while (readLine4 != null && readLine4.startsWith(" ")) {
                                Matcher matcher4 = this.A0G.matcher(readLine4);
                                if (matcher4.find()) {
                                    j8 += A00(matcher4);
                                }
                                if (matcher4.find()) {
                                    j9 += A00(matcher4);
                                }
                                readLine4 = bufferedReader.readLine();
                                this.A00 = readLine4;
                            }
                            if (j8 > 0 || this.A0D) {
                                arrayList.add(new C0TJ(C0TP.A0O, j8));
                                this.A0D = true;
                            }
                            if (j9 > 0 || this.A06) {
                                arrayList.add(new C0TJ(C0TP.A0N, j9));
                                this.A06 = true;
                            }
                        } else if (str.equals("Layer Info:")) {
                            String readLine5 = bufferedReader.readLine();
                            this.A00 = readLine5;
                            long j10 = 0;
                            boolean z3 = false;
                            int i = 0;
                            while (true) {
                                z = true;
                                if (readLine5 == null || !readLine5.startsWith(" ")) {
                                    break;
                                }
                                if (!z3) {
                                    Matcher matcher5 = this.A0G.matcher(readLine5);
                                    if (matcher5.find()) {
                                        j10 = A00(matcher5);
                                        Matcher matcher6 = this.A0F.matcher(this.A00);
                                        if (matcher6.find() && matcher6.groupCount() >= 1 && (group = matcher6.group(1)) != null) {
                                            try {
                                                i = Integer.parseInt(group);
                                            } catch (NumberFormatException unused) {
                                            }
                                            z3 = true;
                                        }
                                        i = 0;
                                        z3 = true;
                                    }
                                }
                                readLine5 = bufferedReader.readLine();
                                this.A00 = readLine5;
                            }
                            if (j10 > 0 || this.A08) {
                                arrayList.add(new C0TJ(C0TP.A0Y, j10));
                                this.A08 = true;
                            }
                            if (i > 0 || this.A07) {
                                c0tj = new C0TJ(C0TP.A0Z, i);
                                arrayList.add(c0tj);
                                this.A07 = z;
                            }
                        } else if (str.equals("Other Caches:")) {
                            String readLine6 = bufferedReader.readLine();
                            this.A00 = readLine6;
                            long j11 = 0;
                            boolean z4 = false;
                            int i2 = 0;
                            while (true) {
                                z = true;
                                if (readLine6 == null || !readLine6.startsWith(" ")) {
                                    break;
                                }
                                if (!z4 && readLine6.startsWith("  Layers Total")) {
                                    Matcher matcher7 = this.A0G.matcher(readLine6);
                                    if (matcher7.find()) {
                                        j11 = A00(matcher7);
                                        Matcher matcher8 = this.A0F.matcher(this.A00);
                                        if (matcher8.find() && matcher8.groupCount() >= 1 && (group2 = matcher8.group(1)) != null) {
                                            try {
                                                i2 = Integer.parseInt(group2);
                                            } catch (NumberFormatException unused2) {
                                            }
                                            z4 = true;
                                        }
                                        i2 = 0;
                                        z4 = true;
                                    }
                                }
                                readLine6 = bufferedReader.readLine();
                                this.A00 = readLine6;
                            }
                            if (j11 > 0 || this.A08) {
                                arrayList.add(new C0TJ(C0TP.A0Y, j11));
                                this.A08 = true;
                            }
                            if (i2 > 0 || this.A07) {
                                c0tj = new C0TJ(C0TP.A0Z, i2);
                                arrayList.add(c0tj);
                                this.A07 = z;
                            }
                        } else if (str.equals("Font Cache (CPU):")) {
                            String readLine7 = bufferedReader.readLine();
                            this.A00 = readLine7;
                            boolean z5 = false;
                            while (readLine7 != null && readLine7.startsWith(" ")) {
                                if (!z5) {
                                    Matcher matcher9 = this.A0G.matcher(readLine7);
                                    if (matcher9.find()) {
                                        arrayList.add(new C0TJ(C0TP.A0C, A00(matcher9)));
                                        z5 = true;
                                    }
                                }
                                readLine7 = bufferedReader.readLine();
                                this.A00 = readLine7;
                            }
                        } else {
                            this.A00 = bufferedReader.readLine();
                        }
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (IOException unused3) {
            }
        }
        if (this.A0H) {
            this.A01 = nativeGetNativeRenderThreadStats;
        }
        this.A00 = null;
        return arrayList;
    }

    @Override // X.C0TR
    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    public C109994xT(boolean z) {
        this.A0G = Pattern.compile("(\\d+\\.\\d+)\\s([KkMmGg]B|bytes)");
        this.A0F = Pattern.compile("numLayers\\s+=\\s+(\\d+)");
        this.A0E = new InterfaceC49832Qt() { // from class: X.4xU
            @Override // X.InterfaceC49832Qt
            public final String BKd() {
                return "raw_render_thread_stats";
            }

            @Override // X.InterfaceC49832Qt
            public final String getValue() {
                return C109994xT.this.A01;
            }
        };
        this.A0H = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A00(java.util.regex.Matcher r7) {
        /*
            int r1 = r7.groupCount()
            r0 = 2
            r5 = 0
            if (r1 < r0) goto L52
            java.lang.String r1 = r7.group(r0)
            if (r1 == 0) goto L52
            r0 = 0
            char r1 = r1.charAt(r0)
            r0 = 71
            r3 = 0
            if (r1 == r0) goto L45
            r0 = 75
            if (r1 == r0) goto L42
            r0 = 77
            if (r1 == r0) goto L3f
            r0 = 98
            if (r1 == r0) goto L3c
            r0 = 103(0x67, float:1.44E-43)
            if (r1 == r0) goto L45
            r0 = 107(0x6b, float:1.5E-43)
            if (r1 == r0) goto L42
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L3f
            r1 = 0
        L34:
            r0 = 1
            java.lang.String r0 = r7.group(r0)
            if (r0 == 0) goto L52
            goto L48
        L3c:
            r1 = 4562146422526312448(0x3f50000000000000, double:9.765625E-4)
            goto L34
        L3f:
            r1 = 4652218415073722368(0x4090000000000000, double:1024.0)
            goto L34
        L42:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L34
        L45:
            r1 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            goto L34
        L48:
            double r3 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L4c
        L4c:
            double r3 = r3 * r1
            long r0 = java.lang.Math.round(r3)
            return r0
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109994xT.A00(java.util.regex.Matcher):long");
    }

    public C109994xT() {
        this(false);
    }
}
