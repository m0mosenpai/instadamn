package X;

import android.media.MediaCodecInfo;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VpT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69498VpT {
    public final ArrayList A00(MYB myb, MediaComposition mediaComposition, C69492VoF c69492VoF, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        W94 w94;
        C70125W5g c70125W5g;
        long j;
        long j2;
        int i5 = i;
        ArrayList A12 = AbstractC166997dE.A12(c69492VoF, 1);
        MediaCodecInfo.CodecCapabilities A00 = WFb.A00();
        if (A00 != null && A00.getVideoCapabilities() != null) {
            i4 = Math.max(AbstractC65702TsY.A05(A00.getVideoCapabilities().getSupportedHeights()), AbstractC65702TsY.A05(A00.getVideoCapabilities().getSupportedWidths()));
        } else {
            i4 = Integer.MAX_VALUE;
        }
        W3H w3h = c69492VoF.A0A;
        if (i2 > 0 && myb != null) {
            if (z2) {
                w94 = new W94(z, i5, -1, i2, i3);
            } else {
                if (i4 < i5 && c69492VoF.A01.A00()) {
                    i5 = i4;
                }
                w94 = new W94(z, -1, i5, i2, i3);
            }
            C69799Vvj c69799Vvj = c69492VoF.A01;
            WDI A02 = WFb.A02(myb, c69492VoF.A0H, w94, mediaComposition, c69799Vvj.A07(), c69799Vvj.A08(), c69799Vvj.A09(), c69799Vvj.A00(), c69799Vvj.A05());
            if (c69492VoF.A0T) {
                c70125W5g = new C70125W5g(A02, EnumC68130VCo.A02, -1L, 2500000L, false, false);
            } else {
                boolean z3 = true;
                boolean z4 = false;
                if (c69799Vvj.A04()) {
                    List AwC = c69492VoF.A00.AwC(myb, mediaComposition, c69492VoF);
                    if (!AwC.isEmpty()) {
                        j = ((C70125W5g) AwC.get(0)).A01;
                    } else {
                        j = -1;
                    }
                    if (!AwC.isEmpty()) {
                        j2 = ((C70125W5g) AwC.get(0)).A00;
                    } else {
                        j2 = -1;
                    }
                    if (j != -1) {
                        c70125W5g = new C70125W5g(A02, EnumC68130VCo.A04, j, j2, false, true);
                    }
                }
                long j3 = c69492VoF.A04;
                if (j3 < 0) {
                    j3 = 0;
                }
                long j4 = c69492VoF.A03;
                if (j4 < 0) {
                    j4 = myb.A07;
                }
                long j5 = j4 - j3;
                if (j5 <= 0) {
                    j5 = -1;
                }
                if (w3h.A09.AG7()) {
                    z4 = AbstractC31175DnJ.A1S((j5 > 30000L ? 1 : (j5 == 30000L ? 0 : -1)));
                    if (j5 <= 30000) {
                        z3 = false;
                    }
                }
                c70125W5g = new C70125W5g(A02, EnumC68130VCo.A04, -1L, 2500000L, z4, z3);
            }
            A12.add(c70125W5g);
        }
        ArrayList arrayList = new ArrayList();
        if (WGX.A05(mediaComposition, c69492VoF)) {
            arrayList.add(new C70125W5g(null, EnumC68130VCo.A03, -1L, 2500000L, false, false));
        }
        A12.addAll(arrayList);
        return A12;
    }
}
