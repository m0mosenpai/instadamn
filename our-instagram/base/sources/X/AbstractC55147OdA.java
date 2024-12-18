package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.OdA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55147OdA {
    /* JADX WARN: Type inference failed for: r0v11, types: [X.Ope, java.lang.Object] */
    public static final MYB A01(Context context, android.net.Uri uri, boolean z) {
        boolean z2 = true;
        if (uri.getPath() == null) {
            z2 = false;
        }
        AbstractC1126356r.A07(z2, AbstractC167017dG.A0n(uri, "Path cannot be null contentUri: ", AbstractC166987dD.A1C()));
        try {
            if (AbstractC002300n.A0h(AbstractC50672MYq.A00(AbstractC166987dD.A11(uri.getPath()).getPath(), "video/mp4", false), MediaStreamTrack.VIDEO_TRACK_KIND, false)) {
                return new C55773Oph(context, z).AUI(uri);
            }
            boolean z3 = true;
            if (uri.getPath() == null) {
                z3 = false;
            }
            AbstractC1126356r.A07(z3, AbstractC167017dG.A0n(uri, "Path cannot be null contentUri: ", AbstractC166987dD.A1C()));
            return new Object().AUI(uri);
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x008e: IGET (r0 I:X.VoC) = (r0 I:X.OFk) (LINE:142) X.OFk.A0C X.VoC, block:B:25:0x0084 */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.OFk] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.XD7] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, X.Po5] */
    public static final XD7 A00(C54733OFk c54733OFk) {
        ?? r0;
        MYB AUI;
        try {
            C69489VoC c69489VoC = c54733OFk.A0C;
            C14360o3.A07(c69489VoC);
            InterfaceC58019Po5 interfaceC58019Po5 = c54733OFk.A06;
            C14360o3.A07(interfaceC58019Po5);
            MediaComposition mediaComposition = c69489VoC.A08;
            if (mediaComposition != null) {
                AUI = ONH.A00(new Object(), interfaceC58019Po5, mediaComposition, true, false, false);
            } else {
                File file = c69489VoC.A0D;
                if (file != null) {
                    AUI = interfaceC58019Po5.AUI(android.net.Uri.fromFile(file));
                } else {
                    throw AbstractC166987dD.A12("unable to extract MediaMetadata without MediaComposition or input file");
                }
            }
            if (AUI != null) {
                Context context = c54733OFk.A00;
                InterfaceC71972XDf interfaceC71972XDf = c54733OFk.A0A;
                X9V x9v = c54733OFk.A08;
                InterfaceC58105PpU interfaceC58105PpU = c54733OFk.A09;
                C14360o3.A07(interfaceC58105PpU);
                InterfaceC58105PpU interfaceC58105PpU2 = interfaceC58105PpU;
                if (!c69489VoC.A0I) {
                    if (A04(c69489VoC)) {
                        AbstractC1126356r.A07(interfaceC58105PpU.AG6(), "Incompatible MediaExtractor for pass through");
                        interfaceC58105PpU2 = interfaceC58105PpU;
                    } else {
                        boolean AG8 = interfaceC58105PpU.AG8();
                        interfaceC58105PpU2 = interfaceC58105PpU;
                        if (!AG8) {
                            interfaceC58105PpU2 = new Object();
                        }
                    }
                }
                InterfaceC71895X9c interfaceC71895X9c = c54733OFk.A0D;
                X9T x9t = c54733OFk.A04;
                WG9 wg9 = c54733OFk.A05;
                X9U x9u = c54733OFk.A07;
                return new C69546VrA(null, c54733OFk.A0E).A00(new C66287U7i(context, c54733OFk.A02, c54733OFk.A03, x9t, wg9, AUI, interfaceC58019Po5, x9u, x9v, interfaceC58105PpU2, interfaceC71972XDf, c69489VoC, interfaceC71895X9c));
            }
            throw AbstractC166997dE.A0g();
        } catch (Throwable th) {
            C0K8.A0F("TranscodeUtil", "Throwable", th);
            th.getMessage();
            XES xes = r0.A0C.A07;
            if (xes != null) {
                xes.DEg(new C70129W5q(), new Exception(th));
            }
            return new Object();
        }
    }

    public static final MYB A02(Context context, String str, boolean z) {
        if (str != null) {
            try {
                return A01(context, AbstractC25227BEk.A0B(str), z);
            } catch (Exception e) {
                C0K8.A0L("TranscodeUtil", "Exception in extractVideoMetadata for filePath: %s", e, str);
                return null;
            }
        }
        return null;
    }

    public static final void A03(WDI wdi, String str, Map map, int i, int i2, boolean z) {
        if (z) {
            wdi.A0B = 0;
        }
        wdi.A0C = i;
        wdi.A0A = i2;
        wdi.A0O = true;
        wdi.A03 = 5;
        wdi.A01 = r0;
        wdi.A04 = r0;
        if (str != null) {
            wdi.A0G = C70124W5f.A00(str);
        }
        wdi.A0L = map;
    }

    public static final boolean A04(C69489VoC c69489VoC) {
        if (c69489VoC.A06 == null) {
            long j = c69489VoC.A04;
            if (j == 0 || j == -1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
