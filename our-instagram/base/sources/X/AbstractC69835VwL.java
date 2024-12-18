package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.VwL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69835VwL {
    public static long A00(Context context, InterfaceC58019Po5 interfaceC58019Po5, EnumC1125356h enumC1125356h, C69489VoC c69489VoC) {
        MediaComposition mediaComposition = c69489VoC.A08;
        if (mediaComposition != null) {
            return AbstractC66047Tyk.A00(interfaceC58019Po5, enumC1125356h, mediaComposition);
        }
        File file = c69489VoC.A0D;
        if (file != null) {
            long j = c69489VoC.A04;
            if (j < 0) {
                j = 0;
            }
            long j2 = c69489VoC.A00;
            if (j2 < 0) {
                android.net.Uri fromFile = android.net.Uri.fromFile(file);
                C14360o3.A0B(fromFile, 0);
                MYB A01 = AbstractC55147OdA.A01(context, fromFile, false);
                if (A01 == null) {
                    return -1L;
                }
                j2 = A01.A07;
            }
            return TimeUnit.MILLISECONDS.toMicros(j2 - j);
        }
        throw new Exception("No input data source provided");
    }

    public static void A01(InterfaceC72006XEu interfaceC72006XEu, C69489VoC c69489VoC) {
        MediaComposition mediaComposition = c69489VoC.A08;
        if (mediaComposition != null) {
            interfaceC72006XEu.ESt(mediaComposition);
            return;
        }
        File file = c69489VoC.A0D;
        if (file != null) {
            interfaceC72006XEu.ESv(file);
            interfaceC72006XEu.EgH(new C1125456i(TimeUnit.MILLISECONDS, c69489VoC.A04, c69489VoC.A00));
            return;
        }
        throw new Exception("No valid data source provided");
    }
}
