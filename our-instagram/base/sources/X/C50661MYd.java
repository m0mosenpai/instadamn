package X;

import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MYd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50661MYd implements InterfaceC72006XEu {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public C54837OLw A04;
    public InterfaceC58019Po5 A05;
    public C1125456i A06;
    public InterfaceC58105PpU A07;
    public InterfaceC58194Pr0 A08;
    public U7W A09;
    public java.net.URL A0A;
    public HashMap A0B;
    public long A0C;
    public long A0D;
    public MYB A0E;
    public EnumC1125356h A0F;
    public File A0G;
    public boolean A0H;
    public boolean A0I;

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00a0 -> B:20:0x00a4). Please report as a decompilation issue!!! */
    private void A01() {
        String obj;
        C50671MYp c50671MYp;
        C50671MYp c50671MYp2;
        AbstractC66043Tyf.A00("BaseMediaDemuxer", "checkAndInitialize", new Object[0]);
        if (!this.A0H) {
            try {
                File file = this.A0G;
                if ((file == null || !file.exists()) && this.A0A == null) {
                    throw new FileNotFoundException();
                }
                A02();
                InterfaceC58194Pr0 ALI = this.A07.ALI();
                this.A08 = ALI;
                java.net.URL url = this.A0A;
                if (url != null) {
                    ALI.ESw(url.toString());
                } else {
                    File file2 = this.A0G;
                    file2.getClass();
                    ALI.ESw(file2.getAbsolutePath());
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                C50671MYp c50671MYp3 = null;
                try {
                    this.A08.getClass();
                    U7W u7w = this.A09;
                    if (u7w.A1K()) {
                        InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
                        boolean A1I = u7w.A1I();
                        ArrayList A03 = AbstractC50670MYo.A03(interfaceC58194Pr0, "audio/");
                        if (A03.isEmpty()) {
                            c50671MYp = null;
                        } else {
                            if (A1I) {
                                Iterator it = A03.iterator();
                                while (it.hasNext()) {
                                    c50671MYp = (C50671MYp) it.next();
                                    if (new MediaCodecList(1).findDecoderForFormat(c50671MYp.A01) != null) {
                                        break;
                                    }
                                }
                            }
                            c50671MYp = (C50671MYp) A03.get(0);
                        }
                    } else {
                        c50671MYp = AbstractC50670MYo.A01(this.A08, u7w.A0q());
                    }
                } catch (C52036N0k e) {
                    AbstractC166997dE.A1S(e, A1E);
                    c50671MYp = null;
                }
                try {
                    U7W u7w2 = this.A09;
                    if (u7w2.A1K()) {
                        InterfaceC58194Pr0 interfaceC58194Pr02 = this.A08;
                        boolean A1J = u7w2.A1J();
                        ArrayList A032 = AbstractC50670MYo.A03(interfaceC58194Pr02, "video/");
                        if (!A032.isEmpty()) {
                            if (A1J) {
                                Iterator it2 = A032.iterator();
                                while (it2.hasNext()) {
                                    c50671MYp2 = (C50671MYp) it2.next();
                                    if (new MediaCodecList(1).findDecoderForFormat(c50671MYp2.A01) != null) {
                                        break;
                                    }
                                }
                            }
                            c50671MYp2 = (C50671MYp) A032.get(0);
                            c50671MYp3 = c50671MYp2;
                        } else {
                            throw new Exception(AnonymousClass001.A0R("No video track exception. Track Info List: ", AbstractC50670MYo.A02(AbstractC50670MYo.A03(interfaceC58194Pr02, ""))));
                        }
                    } else {
                        c50671MYp3 = AbstractC50670MYo.A00(this.A08);
                    }
                } catch (C52036N0k | C52040N0o e2) {
                    AbstractC166997dE.A1S(e2, A1E);
                }
                if (c50671MYp != null) {
                    HashMap hashMap = this.A0B;
                    hashMap.getClass();
                    AbstractC166997dE.A1U(EnumC1125356h.AUDIO, hashMap, c50671MYp.A00);
                }
                if (c50671MYp3 != null) {
                    HashMap hashMap2 = this.A0B;
                    hashMap2.getClass();
                    AbstractC166997dE.A1U(EnumC1125356h.VIDEO, hashMap2, c50671MYp3.A00);
                }
                C54837OLw c54837OLw = this.A04;
                c54837OLw.A04 = A1E.toString();
                HashMap hashMap3 = this.A0B;
                hashMap3.getClass();
                c54837OLw.A05 = hashMap3.toString();
                this.A0H = true;
            } catch (IOException e3) {
                AbstractC66043Tyf.A00("BaseMediaDemuxer", "checkAndInitialize MediaDemuxerException=%s", e3);
                java.net.URL url2 = this.A0A;
                if (url2 == null) {
                    File file3 = this.A0G;
                    if (file3 != null) {
                        obj = file3.getAbsolutePath();
                    } else {
                        obj = "";
                    }
                } else {
                    obj = url2.toString();
                }
                throw new Exception(AnonymousClass001.A0R("Failed to initialize. path = ", obj), e3);
            }
        }
    }

    @Override // X.InterfaceC72006XEu
    public final boolean AAz() {
        InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
        if (interfaceC58194Pr0 == null || !interfaceC58194Pr0.AAz()) {
            return false;
        }
        C1125456i c1125456i = this.A06;
        long Bq8 = this.A08.Bq8();
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        boolean A1P = this.A09.A1P();
        if (Bq8 != -1) {
            long A02 = c1125456i.A02(timeUnit);
            if (A02 < 0 || (!A1P ? Bq8 <= A02 : Bq8 < A02)) {
                return true;
            }
        }
        this.A00++;
        return false;
    }

    @Override // X.InterfaceC72006XEu
    public final void release() {
        AbstractC66043Tyf.A00("BaseMediaDemuxer", "release: mMediaExtractor=%s", this.A08);
        InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
        if (interfaceC58194Pr0 != null) {
            this.A0I = true;
            interfaceC58194Pr0.release();
            this.A08 = null;
        }
    }

    private void A00() {
        this.A08.getClass();
        InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
        long j = this.A0D;
        int i = 0;
        if (j == 0) {
            i = 2;
        }
        interfaceC58194Pr0.EMi(j, i);
        if (A03(this.A08.Bq8())) {
            this.A03 = 0L;
            return;
        }
        do {
            long Bq8 = this.A08.Bq8();
            if (this.A06.A06(TimeUnit.MICROSECONDS, Bq8, this.A09.A1P())) {
                this.A03 = Math.min(this.A08.Bq8() - this.A0D, this.A03);
                this.A02 = this.A08.Bq8();
            }
            if (this.A03 != Long.MAX_VALUE) {
                return;
            }
        } while (AAz());
    }

    private void A02() {
        C1125456i c1125456i = this.A06;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        this.A0D = c1125456i.A03(timeUnit);
        long A02 = this.A06.A02(timeUnit);
        this.A0C = A02;
        long j = this.A0D;
        if (j < 0) {
            j = 0;
        }
        this.A0D = j;
        if (A02 <= 0) {
            A02 = TimeUnit.MILLISECONDS.toMicros(BRG().A07);
            this.A0C = A02;
        }
        long j2 = this.A0D;
        if (A02 > j2) {
            return;
        }
        AbstractC66043Tyf.A00("BaseMediaDemuxer", "setStartAndEndTime: MediaDemuxerException mEndTimeUs=%s, mStartTimeUs=%s", Long.valueOf(A02), Long.valueOf(j2));
        throw new Exception(AnonymousClass001.A0f("End time is lesser than the start time. StartTimeUs : ", ", EndTimeUs = ", this.A0D, this.A0C));
    }

    private boolean A03(long j) {
        if (this.A09.A0z() && j == this.A01 && this.A06.A02(TimeUnit.MICROSECONDS) <= this.A01) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC72006XEu
    public final C54837OLw BQe() {
        return this.A04;
    }

    @Override // X.InterfaceC72006XEu
    public final MYB BRG() {
        MYB myb = this.A0E;
        if (myb == null) {
            try {
                java.net.URL url = this.A0A;
                if (url != null) {
                    myb = this.A05.AUJ(url);
                    this.A0E = myb;
                } else {
                    InterfaceC58019Po5 interfaceC58019Po5 = this.A05;
                    File file = this.A0G;
                    file.getClass();
                    myb = interfaceC58019Po5.AUI(android.net.Uri.fromFile(file));
                    this.A0E = myb;
                }
                if (myb == null) {
                    AbstractC66043Tyf.A00("BaseMediaDemuxer", "getMediaMetadata: Media metadata is null", new Object[0]);
                    throw new Exception("Media metadata is null");
                }
            } catch (IOException e) {
                AbstractC66043Tyf.A00("BaseMediaDemuxer", "getMediaMetadata: IOException=%s", e);
                throw new Exception("Cannot extract metadata", e);
            }
        }
        return myb;
    }

    @Override // X.InterfaceC72006XEu
    public final long Bkr() {
        return this.A02;
    }

    @Override // X.InterfaceC72006XEu
    public final int Bq6() {
        InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
        if (interfaceC58194Pr0 != null) {
            return interfaceC58194Pr0.Bq6();
        }
        return -1;
    }

    @Override // X.InterfaceC72006XEu
    public final MediaFormat Bq7() {
        HashMap hashMap;
        EnumC1125356h enumC1125356h;
        if (this.A08 == null) {
            return null;
        }
        try {
            if (this.A09.A1F() && (hashMap = this.A0B) != null && (enumC1125356h = this.A0F) != null) {
                Integer num = (Integer) hashMap.get(enumC1125356h);
                num.getClass();
                return this.A08.CAD(num.intValue());
            }
            InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
            return interfaceC58194Pr0.CAD(interfaceC58194Pr0.Bq9());
        } catch (Exception e) {
            AbstractC66043Tyf.A00("BaseMediaDemuxer", "getSampleMediaFormat: IllegalStateException=%s, getTrackInfos=%s", e, AbstractC50670MYo.A04(this.A08).toString());
            throw new IllegalStateException(String.format(Locale.ROOT, "getSampleMediaFormat failed: %s, MediaDemuxerStats: %s", AbstractC50670MYo.A04(this.A08), this.A04), e);
        }
    }

    @Override // X.InterfaceC72006XEu
    public final long Bq8() {
        InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
        if (interfaceC58194Pr0 != null) {
            long Bq8 = interfaceC58194Pr0.Bq8();
            if (A03(Bq8)) {
                return 0L;
            }
            if (this.A06.A06(TimeUnit.MICROSECONDS, Bq8, this.A09.A1P())) {
                return (Bq8 - this.A0D) - this.A03;
            }
            if (Bq8 >= 0) {
                return -2L;
            }
            return Bq8;
        }
        return -1L;
    }

    @Override // X.InterfaceC72006XEu
    public final int E8N(ByteBuffer byteBuffer) {
        InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
        if (interfaceC58194Pr0 != null) {
            long Bq8 = interfaceC58194Pr0.Bq8();
            C1125456i c1125456i = this.A06;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            U7W u7w = this.A09;
            boolean A1P = u7w.A1P();
            boolean z = false;
            if (Bq8 != -1) {
                long A02 = c1125456i.A02(timeUnit);
                if (A02 < 0 || (!A1P ? Bq8 <= A02 : Bq8 < A02)) {
                    z = true;
                }
            }
            if (!z && !A03(Bq8)) {
                C54837OLw c54837OLw = this.A04;
                if (c54837OLw.A01 == -1) {
                    c54837OLw.A01 = Bq8;
                    return -1;
                }
                return -1;
            }
            if (!this.A06.A06(timeUnit, Bq8, this.A09.A1P()) && !A03(Bq8)) {
                if (Bq8 < this.A06.A03(timeUnit)) {
                    this.A04.A02 = Bq8;
                }
            } else {
                C54837OLw c54837OLw2 = this.A04;
                if (c54837OLw2.A03 == -1) {
                    c54837OLw2.A03 = Bq8;
                }
                c54837OLw2.A00 = Bq8;
            }
            if (u7w.A0S()) {
                C0K8.A0P("BaseMediaDemuxer", "readSampleData mIsReleased: %s", Boolean.valueOf(this.A0I));
            }
            return this.A08.E8O(byteBuffer, 0);
        }
        return -1;
    }

    @Override // X.InterfaceC72006XEu
    public final void EMh(long j) {
        long j2 = j + this.A0D + this.A03;
        if (this.A08 != null) {
            if (this.A06.A06(TimeUnit.MICROSECONDS, j2, this.A09.A1P())) {
                InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
                int i = 0;
                if (j2 == 0) {
                    i = 2;
                }
                interfaceC58194Pr0.EMi(j2, i);
            }
        }
    }

    @Override // X.InterfaceC72006XEu
    public final void ESt(MediaComposition mediaComposition) {
        C1125956n A04 = mediaComposition.A04(EnumC1125356h.AUDIO, 0);
        AbstractC1126356r.A07(AbstractC167007dF.A1W(A04), "get null audio track when setting data source from MediaComposition");
        A04.getClass();
        List list = A04.A04;
        this.A0G = ((C1125756l) AbstractC166987dD.A1F(list).get(0)).A04;
        this.A0A = ((C1125756l) AbstractC166987dD.A1F(list).get(0)).A05;
        this.A06 = ((C1125756l) AbstractC166987dD.A1F(list).get(0)).A03;
    }

    @Override // X.InterfaceC72006XEu
    public final void FCl(C1125456i c1125456i) {
        this.A06 = c1125456i;
        A02();
        this.A03 = Long.MAX_VALUE;
        A00();
    }

    @Override // X.InterfaceC72006XEu
    public final long Azt() {
        A01();
        return this.A0C - this.A0D;
    }

    @Override // X.InterfaceC72006XEu
    public final boolean CYJ(EnumC1125356h enumC1125356h) {
        A01();
        HashMap hashMap = this.A0B;
        hashMap.getClass();
        return hashMap.containsKey(enumC1125356h);
    }

    @Override // X.InterfaceC72006XEu
    public final void EMw(EnumC1125356h enumC1125356h, int i) {
        A01();
        HashMap hashMap = this.A0B;
        hashMap.getClass();
        if (hashMap.containsKey(enumC1125356h)) {
            this.A0F = enumC1125356h;
            int A0H = AbstractC166987dD.A0H(hashMap.get(enumC1125356h));
            this.A08.getClass();
            this.A08.EMv(A0H);
            if (this.A09.A0z()) {
                this.A01 = this.A08.Bq8();
            }
            A00();
            int i2 = 0;
            this.A00 = 0;
            InterfaceC58194Pr0 interfaceC58194Pr0 = this.A08;
            long j = this.A0D;
            if (j == 0) {
                i2 = 2;
            }
            interfaceC58194Pr0.EMi(j, i2);
        }
    }

    @Override // X.InterfaceC72006XEu
    public final void ESv(File file) {
        AbstractC1126356r.A07(AbstractC167007dF.A1W(file), null);
        this.A0G = file;
    }

    @Override // X.InterfaceC72006XEu
    public final void EgH(C1125456i c1125456i) {
        this.A06 = c1125456i;
    }
}
