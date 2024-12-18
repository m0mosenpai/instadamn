package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class WZZ implements InterfaceC71998XEm {
    public Context A02;
    public C1VO A03;
    public XC9 A04;
    public InterfaceC71997XEl A05;
    public C69489VoC A06;
    public XCA A07;
    public boolean A08;
    public boolean A0A;
    public long A01 = 0;
    public final CallerContext A0B = CallerContext.A01("PhotoDemuxDecodeWrapper");
    public int A00 = -1;
    public long A09 = AbstractC54364O0w.A00;

    @Override // X.InterfaceC71998XEm
    public final C54837OLw BQe() {
        return null;
    }

    @Override // X.InterfaceC71998XEm
    public final boolean CSP() {
        return false;
    }

    @Override // X.InterfaceC71998XEm
    public final void FCj(C1125456i c1125456i) {
    }

    @Override // X.InterfaceC71998XEm
    public final void FDy() {
    }

    @Override // X.InterfaceC71998XEm
    public final void cancel() {
    }

    private void A00() {
        if (!this.A08) {
            try {
                C1VO c1vo = this.A03;
                c1vo.getClass();
                Bitmap bitmap = (Bitmap) c1vo.A04();
                InterfaceC71997XEl interfaceC71997XEl = this.A05;
                interfaceC71997XEl.getClass();
                interfaceC71997XEl.FAM(this.A00, bitmap);
                this.A08 = true;
            } finally {
                C1VO c1vo2 = this.A03;
                if (c1vo2 != null) {
                    c1vo2.close();
                    this.A03 = null;
                }
            }
        }
    }

    @Override // X.InterfaceC71998XEm
    public final void AJ6(int i) {
        this.A00 = i;
        C69489VoC c69489VoC = this.A06;
        MediaComposition mediaComposition = c69489VoC.A08;
        mediaComposition.getClass();
        C1125956n A04 = mediaComposition.A04(EnumC1125356h.VIDEO, this.A00);
        if (A04 != null) {
            List list = A04.A04;
            if (!new ArrayList(list).isEmpty()) {
                int i2 = ((C1125756l) new ArrayList(list).get(0)).A00;
                new ArrayList(list).get(0);
                this.A0A = c69489VoC.A0B.A1B();
                long j = AbstractC54364O0w.A00;
                if (i2 > 0) {
                    j = (long) (Math.pow(10.0d, 6.0d) / i2);
                }
                this.A09 = j;
            }
        }
        this.A05 = this.A07.AM0();
    }

    @Override // X.InterfaceC71998XEm
    public final long Aw1() {
        return this.A01;
    }

    @Override // X.InterfaceC71998XEm
    public final void release() {
        InterfaceC71997XEl interfaceC71997XEl = this.A05;
        if (interfaceC71997XEl != null) {
            interfaceC71997XEl.AVe();
        }
        C1VO c1vo = this.A03;
        if (c1vo != null) {
            c1vo.close();
        }
    }

    @Override // X.InterfaceC71998XEm
    public final void start() {
        MediaComposition mediaComposition = this.A06.A08;
        mediaComposition.getClass();
        C1125956n A04 = mediaComposition.A04(EnumC1125356h.VIDEO, this.A00);
        A04.getClass();
        File file = ((C1125756l) new ArrayList(A04.A04).get(0)).A04;
        AbstractC1126356r.A06(file);
        android.net.Uri fromFile = android.net.Uri.fromFile(file);
        XC9 xc9 = this.A04;
        AbstractC1126356r.A06(xc9);
        C1VO ChU = xc9.ChU(this.A02, fromFile, this.A0B);
        this.A03 = ChU;
        if (ChU != null) {
        } else {
            throw new IOException("Bitmap cannot be loaded");
        }
    }

    public WZZ(Context context, XC9 xc9, C69489VoC c69489VoC, XCA xca) {
        this.A02 = context;
        this.A04 = xc9;
        this.A06 = c69489VoC;
        this.A07 = xca;
    }

    @Override // X.InterfaceC71998XEm
    public final long AO3() {
        A00();
        long j = this.A01;
        this.A01 = this.A09 + j;
        return j;
    }

    @Override // X.InterfaceC71998XEm
    public final void AO4(long j) {
        A00();
        if (!this.A0A) {
            this.A01 = j;
        } else {
            while (this.A01 <= j) {
                AO3();
            }
        }
    }

    @Override // X.InterfaceC71998XEm
    public final void EMh(long j) {
        A00();
        this.A01 = j;
    }
}
