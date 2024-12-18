package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.U7a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66280U7a implements InterfaceC71993XEh {
    public int A00;
    public long A01;
    public long A02;
    public MediaFormat A03;
    public MediaFormat A04;
    public Map A05;
    public boolean A06;
    public int A07;
    public long A08;
    public VCK A09;
    public C70129W5q A0A;
    public EnumC1125356h A0B;
    public InterfaceC71993XEh A0C;
    public InterfaceC71972XDf A0D;
    public C68696VaW A0E = new C68696VaW();
    public U7W A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final X9U A0M;
    public final C69200VjT A0N;
    public final String A0O;
    public final String A0P;

    @Override // X.InterfaceC71993XEh
    public final void AJA(String str) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC71993XEh
    public final void stop() {
        try {
            A02(this, false);
            long j = this.A0L;
            long j2 = this.A02;
            if (j2 != -1) {
                j = j2;
            }
            long j3 = this.A08;
            if (j3 != -1) {
                j = Math.min(j, j3);
            }
            A01(this.A0C, j - j, true);
        } finally {
            this.A06 = false;
        }
    }

    public C66280U7a(MYB myb, C70129W5q c70129W5q, X9U x9u, EnumC1125356h enumC1125356h, InterfaceC71972XDf interfaceC71972XDf, C69200VjT c69200VjT, U7W u7w, String str, String str2, Map map, long j, long j2, long j3, boolean z, boolean z2) {
        Map map2 = map;
        this.A0N = c69200VjT;
        this.A0M = x9u;
        this.A0D = interfaceC71972XDf;
        this.A0L = j;
        this.A0K = j2;
        this.A0J = j3;
        this.A0B = enumC1125356h;
        this.A0I = z;
        this.A0H = z2;
        this.A0A = c70129W5q;
        this.A0P = str2;
        this.A0F = u7w;
        if (z && !z2) {
            throw new IllegalArgumentException("Streaming mode can be used only with fragmented files");
        }
        this.A0G = AbstractC167007dF.A1O((j > j2 ? 1 : (j == j2 ? 0 : -1)));
        map2 = map == null ? new HashMap() : map2;
        this.A05 = map2;
        this.A0O = str;
        if (!map2.containsKey("copyright")) {
            String str3 = myb.A0E;
            if (str3 == null) {
                HashMap hashMap = myb.A0J;
                if (hashMap != null) {
                    Iterator A0k = AbstractC167007dF.A0k(hashMap);
                    while (A0k.hasNext()) {
                        Iterator A0k2 = AbstractC167007dF.A0k((AbstractMap) A0k.next());
                        while (A0k2.hasNext()) {
                            Iterator it = ((List) A0k2.next()).iterator();
                            while (it.hasNext()) {
                                str3 = ((MYB) it.next()).A0E;
                                if (str3 != null) {
                                }
                            }
                        }
                    }
                }
            }
            if (!AbstractC225379x0.A00(str3).equals(C05F.A0C)) {
                map2.put("copyright", str3);
            }
        }
        Map map3 = this.A05;
        if (!map3.containsKey("composer")) {
            String str4 = myb.A0D;
            if (str4 == null) {
                HashMap hashMap2 = myb.A0J;
                if (hashMap2 != null) {
                    Iterator A0k3 = AbstractC167007dF.A0k(hashMap2);
                    while (A0k3.hasNext()) {
                        Iterator A0k4 = AbstractC167007dF.A0k((AbstractMap) A0k3.next());
                        while (A0k4.hasNext()) {
                            Iterator it2 = ((List) A0k4.next()).iterator();
                            while (it2.hasNext()) {
                                str4 = ((MYB) it2.next()).A0D;
                                if (str4 != null) {
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (!AbstractC225379x0.A00(str4).equals(C05F.A0C)) {
                map3.put("composer", str4);
            }
        }
    }

    private void A00(long j) {
        String path;
        long j2;
        if (this.A0G || (path = this.A0O) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.A0P);
            sb.append("segmentingMuxer_");
            sb.append(this.A07);
            sb.append("_");
            sb.append(System.currentTimeMillis());
            sb.append("_");
            sb.append(this.A0B.name());
            File createTempFile = this.A0M.createTempFile(sb.toString(), ".mp4");
            createTempFile.getClass();
            path = createTempFile.getPath();
        }
        boolean z = this.A0I;
        VCK vck = new VCK(path, z);
        this.A09 = vck;
        boolean z2 = this.A0H;
        U7W u7w = this.A0F;
        Map map = this.A05;
        String str = null;
        boolean z3 = false;
        int i = -1;
        Map map2 = null;
        if (u7w != null) {
            i = u7w.A0e();
        }
        if (z2) {
            if (u7w != null) {
                str = u7w.A0l();
            } else {
                str = "1000000";
            }
            z3 = true;
        }
        if (map != null) {
            map2 = map;
        }
        InterfaceC71993XEh AMZ = this.A0D.AMZ(new C69199VjS(i, str, map2, z3));
        this.A0C = AMZ;
        if (z) {
            WZ8 wz8 = new WZ8(vck, AMZ, u7w.A1H());
            this.A0C = wz8;
            AMZ = wz8;
        }
        AMZ.AJA(vck.getPath());
        MediaFormat mediaFormat = this.A03;
        if (mediaFormat != null) {
            this.A0C.EQ1(mediaFormat);
            this.A08 = j;
        }
        MediaFormat mediaFormat2 = this.A04;
        if (mediaFormat2 != null) {
            this.A0C.Egv(mediaFormat2);
            this.A0C.EaE(this.A00);
            this.A02 = j;
        }
        this.A0C.start();
        this.A07++;
        this.A01 = 0L;
        C69200VjT c69200VjT = this.A0N;
        VCK vck2 = this.A09;
        EnumC1125356h enumC1125356h = this.A0B;
        XES xes = c69200VjT.A03.A0G.A07;
        if (xes != null) {
            if (enumC1125356h == EnumC1125356h.VIDEO) {
                j2 = c69200VjT.A01 / r1.A04;
            } else {
                EnumC1125356h enumC1125356h2 = EnumC1125356h.AUDIO;
                j2 = c69200VjT.A00;
                if (enumC1125356h != enumC1125356h2) {
                    j2 += c69200VjT.A01;
                }
            }
            xes.Dk4(vck2, j2);
        }
    }

    private void A01(InterfaceC71993XEh interfaceC71993XEh, long j, boolean z) {
        if (interfaceC71993XEh != null) {
            C69200VjT c69200VjT = this.A0N;
            VCK vck = this.A09;
            vck.getClass();
            EnumC1125356h enumC1125356h = this.A0B;
            MediaFormat mediaFormat = this.A04;
            U7X u7x = c69200VjT.A03;
            u7x.A03 = z;
            C69489VoC c69489VoC = u7x.A0G;
            XES xes = c69489VoC.A07;
            if (xes != null) {
                MYB myb = c69200VjT.A02;
                long j2 = myb.A08;
                long length = vck.length();
                int i = myb.A05;
                int i2 = myb.A03;
                long j3 = myb.A06;
                WDI wdi = c69489VoC.A06;
                C70129W5q c70129W5q = u7x.A0C;
                C54837OLw c54837OLw = null;
                if (enumC1125356h == EnumC1125356h.AUDIO) {
                    InterfaceC72006XEu interfaceC72006XEu = u7x.A0E;
                    if (interfaceC72006XEu != null) {
                        c54837OLw = interfaceC72006XEu.BQe();
                    }
                } else {
                    InterfaceC71998XEm interfaceC71998XEm = u7x.A0I;
                    if (interfaceC71998XEm != null) {
                        c54837OLw = interfaceC71998XEm.BQe();
                    }
                }
                C55176Odf c55176Odf = new C55176Odf(mediaFormat, c54837OLw, c70129W5q, wdi, enumC1125356h, vck, i, i2, j2, length, j3, j, z);
                u7x.A0J.add(c55176Odf);
                xes.Dk6(c55176Odf);
            }
        }
    }

    public static void A02(C66280U7a c66280U7a, boolean z) {
        InterfaceC71993XEh interfaceC71993XEh = c66280U7a.A0C;
        VCK vck = c66280U7a.A09;
        if (interfaceC71993XEh != null && interfaceC71993XEh.isStarted()) {
            try {
                interfaceC71993XEh.stop();
                if (z && vck != null) {
                    vck.delete();
                }
            } catch (RuntimeException e) {
                if (vck != null && vck.exists()) {
                    vck.A01 = true;
                    synchronized (vck) {
                        synchronized (vck) {
                        }
                    }
                }
                throw new RuntimeException("Cannot stop the muxer", e);
            }
        }
    }

    @Override // X.InterfaceC71993XEh
    public final String BVz() {
        InterfaceC71993XEh interfaceC71993XEh = this.A0C;
        if (interfaceC71993XEh != null) {
            return interfaceC71993XEh.BVz();
        }
        return null;
    }

    @Override // X.InterfaceC71993XEh
    public final boolean isStarted() {
        return this.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r3.A04 != null) goto L6;
     */
    @Override // X.InterfaceC71993XEh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r3 = this;
            android.media.MediaFormat r0 = r3.A03
            r2 = 1
            if (r0 != 0) goto La
            android.media.MediaFormat r0 = r3.A04
            r1 = 0
            if (r0 == 0) goto Lb
        La:
            r1 = 1
        Lb:
            r0 = 0
            X.AbstractC1126356r.A07(r1, r0)
            r0 = -1
            r3.A00(r0)
            r3.A06 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66280U7a.start():void");
    }

    @Override // X.InterfaceC71993XEh
    public final void EQ1(MediaFormat mediaFormat) {
        this.A03 = mediaFormat;
    }

    @Override // X.InterfaceC71993XEh
    public final void EaE(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC71993XEh
    public final void Egv(MediaFormat mediaFormat) {
        this.A04 = mediaFormat;
    }

    @Override // X.InterfaceC71993XEh
    public final void FEO(XD8 xd8) {
        MediaCodec.BufferInfo Aie = xd8.Aie();
        if (this.A08 == -1) {
            this.A08 = Aie.presentationTimeUs;
        }
        InterfaceC71993XEh interfaceC71993XEh = this.A0C;
        interfaceC71993XEh.getClass();
        interfaceC71993XEh.FEO(xd8);
        long j = this.A01 + xd8.Aie().size;
        this.A01 = j;
        this.A0A.A02 = j;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [X.WZ0, java.lang.Object] */
    @Override // X.InterfaceC71993XEh
    public final void FEt(XD8 xd8) {
        MediaCodec.BufferInfo Aie = xd8.Aie();
        if (this.A02 == -1) {
            this.A02 = Aie.presentationTimeUs;
        }
        if ((Aie.flags & 2) != 0) {
            List list = this.A0E.A00;
            ?? obj = new Object();
            ByteBuffer AjR = xd8.AjR();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(AjR.limit());
            allocateDirect.put(AjR.asReadOnlyBuffer());
            obj.A01 = allocateDirect;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            obj.A00 = bufferInfo;
            MediaCodec.BufferInfo Aie2 = xd8.Aie();
            bufferInfo.set(Aie2.offset, Aie2.size, Aie2.presentationTimeUs, Aie2.flags);
            list.add(obj);
        }
        boolean z = true;
        if ((Aie.flags & 1) != 0) {
            long j = Aie.presentationTimeUs;
            if (j - this.A02 < this.A0K) {
                z = false;
            }
            if (this.A0L - j >= this.A0J && z) {
                A02(this, false);
                A01(this.A0C, Aie.presentationTimeUs - this.A02, false);
                A00(Aie.presentationTimeUs);
                C68696VaW c68696VaW = this.A0E;
                InterfaceC71993XEh interfaceC71993XEh = this.A0C;
                interfaceC71993XEh.getClass();
                Iterator it = c68696VaW.A00.iterator();
                while (it.hasNext()) {
                    interfaceC71993XEh.FEt((XD8) it.next());
                }
            }
        }
        Aie.presentationTimeUs -= this.A02;
        InterfaceC71993XEh interfaceC71993XEh2 = this.A0C;
        interfaceC71993XEh2.getClass();
        interfaceC71993XEh2.FEt(xd8);
        long j2 = this.A01 + Aie.size;
        this.A01 = j2;
        this.A0A.A02 = j2;
    }
}
