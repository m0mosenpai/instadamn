package X;

import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.TyW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66034TyW implements InterfaceC72006XEu {
    public long A02;
    public InterfaceC58019Po5 A04;
    public C1125456i A05;
    public MediaComposition A07;
    public C1125956n A08;
    public C55780Opp A09;
    public InterfaceC72006XEu A0A;
    public InterfaceC58105PpU A0B;
    public boolean A0E;
    public final U7W A0F;
    public long A0D = -1;
    public long A03 = -1;
    public int A01 = -1;
    public int A0C = 0;
    public EnumC1125356h A06 = null;
    public int A00 = -1;

    private void A00() {
        AbstractC66043Tyf.A00("MediaCompositionDemuxer", "checkAndInitialize", new Object[0]);
        if (!this.A0E) {
            this.A02 = 0L;
            try {
                AbstractC1126356r.A07(AbstractC167007dF.A1W(this.A06), "No tracks selected");
                int i = this.A0C;
                if (i != -1) {
                    this.A00 = i;
                }
                if (A01()) {
                    this.A0E = true;
                    return;
                }
                throw new Exception();
            } catch (C52039N0n | IllegalArgumentException e) {
                AbstractC66043Tyf.A00("MediaCompositionDemuxer", "checkAndInitialize Exception=%s", e);
                throw new Exception("Cannot checkAndInitialize", e);
            }
        }
    }

    private boolean A01() {
        this.A01 = -1;
        if (this.A0C == -1) {
            this.A00++;
        }
        this.A06.getClass();
        MediaComposition mediaComposition = this.A07;
        mediaComposition.getClass();
        C1125956n A04 = mediaComposition.A04(this.A06, this.A00);
        this.A08 = A04;
        if (A04 != null) {
            if (A02()) {
                return true;
            }
            throw new Exception("No segments are provided in one of the tracks");
        }
        return false;
    }

    @Override // X.InterfaceC72006XEu
    public final void EMw(EnumC1125356h enumC1125356h, int i) {
        int i2 = i;
        if (i == -1) {
            i2 = 0;
        }
        MediaComposition mediaComposition = this.A07;
        mediaComposition.getClass();
        if (mediaComposition.A04(enumC1125356h, i2) != null) {
            this.A06 = enumC1125356h;
            this.A0C = i;
            A00();
        }
    }

    @Override // X.InterfaceC72006XEu
    public final void EgH(C1125456i c1125456i) {
        AbstractC1126356r.A07(false, "Not supported");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72006XEu
    public final synchronized void release() {
        AbstractC66043Tyf.A00("MediaCompositionDemuxer", "release mAndroidMediaDemuxer=%s", this.A0A);
        InterfaceC72006XEu interfaceC72006XEu = this.A0A;
        if (interfaceC72006XEu != null) {
            interfaceC72006XEu.release();
            this.A0A = null;
        }
    }

    private boolean A02() {
        C1125756l c1125756l;
        AbstractC1126356r.A07(AbstractC167007dF.A1W(this.A08), "Cannot move to next Segment without a valid Track");
        InterfaceC72006XEu interfaceC72006XEu = this.A0A;
        if (interfaceC72006XEu != null) {
            this.A02 += interfaceC72006XEu.Azt();
            release();
        }
        this.A01++;
        C1125956n c1125956n = this.A08;
        c1125956n.getClass();
        MediaComposition mediaComposition = this.A07;
        mediaComposition.getClass();
        List A08 = mediaComposition.A08(c1125956n.A01, this.A00);
        if (A08 == null || this.A01 == A08.size()) {
            return false;
        }
        C1125956n c1125956n2 = this.A08;
        AbstractC1126356r.A07(AbstractC167007dF.A1W(c1125956n2), "Not a valid Track");
        c1125956n2.getClass();
        C1125956n c1125956n3 = this.A08;
        AbstractC1126356r.A07(AbstractC167007dF.A1W(c1125956n3), "No track is selected");
        c1125956n3.getClass();
        MediaComposition mediaComposition2 = this.A07;
        mediaComposition2.getClass();
        List A082 = mediaComposition2.A08(c1125956n3.A01, this.A00);
        if (A082 == null) {
            c1125756l = null;
        } else {
            c1125756l = (C1125756l) A082.get(this.A01);
        }
        c1125756l.getClass();
        InterfaceC72006XEu ALH = this.A09.ALH(this.A04, this.A0B, this.A0F);
        java.net.URL url = c1125756l.A05;
        if (url != null) {
            ((C50661MYd) ALH).A0A = url;
        } else {
            File file = c1125756l.A04;
            file.getClass();
            ALH.ESv(file);
        }
        C1125456i c1125456i = this.A05;
        if (c1125456i == null) {
            c1125456i = c1125756l.A03;
        }
        ALH.EgH(c1125456i);
        this.A0A = ALH;
        if (ALH.CYJ(this.A08.A01)) {
            this.A0A.EMw(this.A08.A01, this.A00);
            this.A03 = this.A0A.Bkr();
            return true;
        }
        AbstractC66043Tyf.A00("MediaCompositionDemuxer", "initAndSetupMediaExtractor: MediaDemuxerException", new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("Track not available in the provided source file.\n Track Type: ");
        sb.append(this.A08.A01);
        sb.append(" \nMedia Demuxer Stats : ");
        throw new Exception(AbstractC166997dE.A0v(BQe(), sb));
    }

    @Override // X.InterfaceC72006XEu
    public final boolean AAz() {
        boolean z = false;
        if (this.A08 != null) {
            z = true;
        }
        if (z) {
            InterfaceC72006XEu interfaceC72006XEu = this.A0A;
            interfaceC72006XEu.getClass();
            if (!interfaceC72006XEu.AAz()) {
                if (A02()) {
                    this.A02++;
                } else {
                    if (this.A0C == -1 && A01()) {
                        return true;
                    }
                    this.A08 = null;
                    this.A00 = -1;
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC72006XEu
    public final C54837OLw BQe() {
        InterfaceC72006XEu interfaceC72006XEu = this.A0A;
        if (interfaceC72006XEu != null) {
            return interfaceC72006XEu.BQe();
        }
        return new C54837OLw();
    }

    @Override // X.InterfaceC72006XEu
    public final long Bkr() {
        return this.A03;
    }

    @Override // X.InterfaceC72006XEu
    public final int Bq6() {
        if (this.A08 != null) {
            InterfaceC72006XEu interfaceC72006XEu = this.A0A;
            interfaceC72006XEu.getClass();
            return interfaceC72006XEu.Bq6();
        }
        return -1;
    }

    @Override // X.InterfaceC72006XEu
    public final MediaFormat Bq7() {
        if (this.A08 != null) {
            InterfaceC72006XEu interfaceC72006XEu = this.A0A;
            interfaceC72006XEu.getClass();
            return interfaceC72006XEu.Bq7();
        }
        return null;
    }

    @Override // X.InterfaceC72006XEu
    public final long Bq8() {
        if (this.A08 != null) {
            try {
                InterfaceC72006XEu interfaceC72006XEu = this.A0A;
                interfaceC72006XEu.getClass();
                long Bq8 = interfaceC72006XEu.Bq8();
                if (Bq8 >= 0) {
                    return Bq8 + this.A02;
                }
                return Bq8;
            } catch (NullPointerException e) {
                AbstractC66043Tyf.A00("MediaCompositionDemuxer", "getSampleTime Exception=%s, mCurrentSegmentIndex=%s, mSelectedTrackIndex=%s, mSelectedTrackType=%s, mCurrentMediaTrack=%s, mCurrentMediaTrackIndex=%s", e, Integer.valueOf(this.A01), Integer.valueOf(this.A0C), this.A06, this.A08, Integer.valueOf(this.A00));
                StringBuilder sb = new StringBuilder();
                sb.append(e);
                sb.append(" mCurrentSegmentIndex: ");
                sb.append(this.A01);
                sb.append(" mSelectedTrackIndex: ");
                sb.append(this.A0C);
                sb.append(" mSelectedTrackType: ");
                sb.append(this.A06);
                sb.append(" mCurrentMediaTrack: ");
                sb.append(this.A08);
                sb.append(" mCurrentMediaTrackIndex: ");
                sb.append(this.A00);
                throw new NullPointerException(sb.toString());
            }
        }
        return -1L;
    }

    @Override // X.InterfaceC72006XEu
    public final boolean CYJ(EnumC1125356h enumC1125356h) {
        MediaComposition mediaComposition = this.A07;
        mediaComposition.getClass();
        int i = this.A0C;
        if (i != -1) {
            if (mediaComposition.A04(enumC1125356h, i) != null) {
                return true;
            }
            return false;
        }
        mediaComposition.A07(enumC1125356h).getClass();
        return !r0.isEmpty();
    }

    @Override // X.InterfaceC72006XEu
    public final int E8N(ByteBuffer byteBuffer) {
        if (this.A08 != null) {
            try {
                InterfaceC72006XEu interfaceC72006XEu = this.A0A;
                interfaceC72006XEu.getClass();
                return interfaceC72006XEu.E8N(byteBuffer);
            } catch (NullPointerException e) {
                AbstractC66043Tyf.A00("MediaCompositionDemuxer", "readSampleData Exception=%s, mCurrentSegmentIndex=%s, mSelectedTrackIndex=%s, mSelectedTrackType=%s, mCurrentMediaTrack=%s, mCurrentMediaTrackIndex=%s", e, Integer.valueOf(this.A01), Integer.valueOf(this.A0C), this.A06, this.A08, Integer.valueOf(this.A00));
                StringBuilder sb = new StringBuilder();
                sb.append(e);
                sb.append(" mCurrentSegmentIndex: ");
                sb.append(this.A01);
                sb.append(" mSelectedTrackIndex: ");
                sb.append(this.A0C);
                sb.append(" mSelectedTrackType: ");
                sb.append(this.A06);
                sb.append(" mCurrentMediaTrack: ");
                sb.append(this.A08);
                sb.append(" mCurrentMediaTrackIndex: ");
                sb.append(this.A00);
                throw new NullPointerException(sb.toString());
            }
        }
        return -1;
    }

    @Override // X.InterfaceC72006XEu
    public final void EMh(long j) {
        if (this.A08 == null) {
            this.A01 = -1;
            this.A0E = false;
            A00();
        }
        InterfaceC72006XEu interfaceC72006XEu = this.A0A;
        if (interfaceC72006XEu != null) {
            interfaceC72006XEu.EMh(j);
        }
    }

    @Override // X.InterfaceC72006XEu
    public final void FCl(C1125456i c1125456i) {
        this.A05 = c1125456i;
        InterfaceC72006XEu interfaceC72006XEu = this.A0A;
        if (interfaceC72006XEu != null) {
            interfaceC72006XEu.EgH(c1125456i);
            interfaceC72006XEu.FCl(c1125456i);
        }
    }

    public C66034TyW(InterfaceC58019Po5 interfaceC58019Po5, C55780Opp c55780Opp, InterfaceC58105PpU interfaceC58105PpU, U7W u7w) {
        this.A04 = interfaceC58019Po5;
        this.A09 = c55780Opp;
        this.A0B = interfaceC58105PpU;
        this.A0F = u7w;
    }

    @Override // X.InterfaceC72006XEu
    public final long Azt() {
        A00();
        long j = this.A0D;
        if (j == -1) {
            try {
                MediaComposition mediaComposition = this.A07;
                mediaComposition.getClass();
                EnumC1125356h enumC1125356h = this.A06;
                enumC1125356h.getClass();
                long A00 = AbstractC66047Tyk.A00(this.A04, enumC1125356h, mediaComposition);
                this.A0D = A00;
                return A00;
            } catch (IOException e) {
                AbstractC66043Tyf.A00("MediaCompositionDemuxer", "getDurationUs IOException=%s", e);
                throw new Exception("Cannot calculate duration");
            }
        }
        return j;
    }

    @Override // X.InterfaceC72006XEu
    public final MYB BRG() {
        A00();
        InterfaceC72006XEu interfaceC72006XEu = this.A0A;
        interfaceC72006XEu.getClass();
        return interfaceC72006XEu.BRG();
    }

    @Override // X.InterfaceC72006XEu
    public final void ESt(MediaComposition mediaComposition) {
        this.A07 = mediaComposition;
    }

    @Override // X.InterfaceC72006XEu
    public final void ESv(File file) {
        AbstractC1126356r.A07(AbstractC167007dF.A1W(file), null);
        try {
            C1125756l A00 = new C1125656k(file).A00();
            C1125856m c1125856m = new C1125856m(EnumC1125356h.VIDEO);
            c1125856m.A02(A00);
            C1125956n c1125956n = new C1125956n(c1125856m);
            MYB AUI = this.A04.AUI(android.net.Uri.fromFile(file));
            C1126256q c1126256q = new C1126256q();
            c1126256q.A04(c1125956n);
            if (AUI.A0K) {
                C1125856m c1125856m2 = new C1125856m(EnumC1125356h.AUDIO);
                c1125856m2.A02(A00);
                c1126256q.A04(new C1125956n(c1125856m2));
            }
            this.A07 = new MediaComposition(c1126256q);
        } catch (IOException e) {
            AbstractC66043Tyf.A00("MediaCompositionDemuxer", "setDataSource: create media composition from file failed %s", e);
            throw new Exception("create media composition from file failed", e);
        }
    }
}
