package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public abstract class OXi {
    public static final File A01(Context context, C43888Jav c43888Jav, WDI wdi, X9U x9u, C70087W2j c70087W2j, File file, ExecutorService executorService, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167027dH.A12(context, executorService, file);
        C14360o3.A0B(x9u, 7);
        return A00(context, c43888Jav, wdi, x9u, null, c70087W2j, file, executorService, i, i2, i3, z, z2, z3, z4);
    }

    public static final File A02(Context context, X9U x9u, File file, String str, ExecutorService executorService, float f, int i, int i2, int i3, int i4, boolean z) {
        MediaComposition mediaComposition;
        C70087W2j c70087W2j;
        WDI A00;
        boolean A1V = AbstractC167007dF.A1V(file);
        if (f == 1.0f) {
            c70087W2j = null;
            mediaComposition = null;
            if (i3 <= 0) {
                A00 = null;
                return A00(context, null, A00, x9u, mediaComposition, c70087W2j, file, executorService, i3, i4, A1V ? 1 : 0, false, false, false, false);
            }
        } else {
            C1125756l A002 = new C1125656k(file).A00();
            C1125856m c1125856m = new C1125856m(EnumC1125356h.AUDIO);
            c1125856m.A02(A002);
            c1125856m.A00(f);
            C1125956n c1125956n = new C1125956n(c1125856m);
            C1125856m c1125856m2 = new C1125856m(EnumC1125356h.VIDEO);
            c1125856m2.A02(A002);
            c1125856m2.A00(f);
            C1125956n c1125956n2 = new C1125956n(c1125856m2);
            C1126256q c1126256q = new C1126256q();
            c1126256q.A04(c1125956n);
            c1126256q.A04(c1125956n2);
            mediaComposition = new MediaComposition(c1126256q);
            c70087W2j = new C70087W2j(new C69201VjU());
        }
        A00 = AbstractC53758NqA.A00(context, file, false);
        if (A00 == null) {
            A00 = null;
        } else {
            AbstractC55147OdA.A03(A00, str, null, i, i2, z);
        }
        return A00(context, null, A00, x9u, mediaComposition, c70087W2j, file, executorService, i3, i4, A1V ? 1 : 0, false, false, false, false);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.PpU, X.WZ3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.OW6, java.lang.Object] */
    public static final File A00(Context context, C43888Jav c43888Jav, WDI wdi, X9U x9u, MediaComposition mediaComposition, C70087W2j c70087W2j, File file, ExecutorService executorService, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        WG9 wg9;
        Object wz2;
        C15370ps A1F = AbstractC25225BEi.A1F();
        C15370ps A1F2 = AbstractC25225BEi.A1F();
        C52033N0h c52033N0h = new C52033N0h(c43888Jav, A1F, A1F2);
        W3N w3n = new W3N();
        w3n.A0D = file;
        w3n.A08 = mediaComposition;
        w3n.A06 = wdi;
        w3n.A0C = c70087W2j;
        w3n.A07 = c52033N0h;
        long j2 = -1;
        if (i > 0) {
            j = i;
        } else {
            j = -1;
        }
        w3n.A04 = j;
        if (i2 > 0) {
            j2 = i2;
        }
        w3n.A00 = j2;
        w3n.A0B = new N0t(z, i3, z3, z4, z2);
        C69489VoC c69489VoC = new C69489VoC(w3n);
        ?? obj = new Object();
        obj.A0C = c69489VoC;
        obj.A00 = context;
        if (c70087W2j == null) {
            wg9 = null;
        } else {
            wg9 = new WG9();
        }
        obj.A05 = wg9;
        obj.A07 = x9u;
        obj.A0E = executorService;
        C66014TyA c66014TyA = VYI.A00;
        obj.A0A = new WZB(c66014TyA);
        if (mediaComposition == null) {
            wz2 = new Object();
        } else {
            wz2 = new WZ2();
        }
        obj.A08 = (X9V) wz2;
        ?? obj2 = new Object();
        obj2.A00 = c66014TyA;
        obj.A09 = obj2;
        try {
            AbstractC55147OdA.A00(obj.A01()).FDu();
            Throwable th = (Throwable) A1F2.A00;
            if (th == null) {
                File file2 = (File) A1F.A00;
                if (file2 != null) {
                    return file2;
                }
                throw new Exception("Failed to generate file");
            }
            C14360o3.A0B("Failure when trimming video", 1);
            throw new Exception("Failure when trimming video", th);
        } catch (InterruptedException e) {
            C14360o3.A0B("Failure when trimming video", 1);
            throw new Exception("Failure when trimming video", e);
        } catch (ExecutionException e2) {
            C14360o3.A0B("Failure when trimming video", 1);
            throw new Exception("Failure when trimming video", e2);
        }
    }
}
