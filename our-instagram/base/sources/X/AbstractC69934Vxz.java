package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.cvat.ctvoiceeffect.CTVoiceEffectProcessor;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Vxz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69934Vxz {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.XD9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.VK1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbI] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.PpU, X.WZ3, java.lang.Object] */
    public static final WG8 A00(Context context, C0f6 c0f6, C58647PzK c58647PzK, MediaEffect mediaEffect, UserSession userSession, InterfaceC190038bM interfaceC190038bM, File file, File file2, Float f, float f2, long j, long j2) {
        InterfaceC71995XEj c70481WYm;
        C14360o3.A0B(c0f6, 10);
        C1126256q c1126256q = new C1126256q();
        C1125856m c1125856m = new C1125856m(EnumC1125356h.AUDIO);
        C1125656k c1125656k = new C1125656k(file);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C1125456i c1125456i = new C1125456i(timeUnit, j, j + j2);
        C1125456i c1125456i2 = new C1125456i(timeUnit, 0L, j2);
        c1125656k.A03 = c1125456i;
        c1125856m.A02(c1125656k.A00());
        if (mediaEffect != null) {
            c1125856m.A03(new C69688VtY(c1125456i2, mediaEffect), null);
        }
        c1125856m.A00(f2);
        if (f != null) {
            float floatValue = f.floatValue();
            ?? obj = new Object();
            obj.A00 = floatValue;
            c1125856m.A03(new C69688VtY(c1125456i2, obj), null);
        }
        c1126256q.A04(new C1125956n(c1125856m));
        MediaComposition mediaComposition = new MediaComposition(c1126256q);
        C67633Uto c67633Uto = new C67633Uto(interfaceC190038bM, 2);
        W3N w3n = new W3N();
        w3n.A08 = mediaComposition;
        w3n.A06 = new WDI();
        w3n.A0F = file2.getPath();
        w3n.A0C = new C70087W2j(new C69201VjU());
        w3n.A0Q = true;
        C69489VoC c69489VoC = new C69489VoC(w3n);
        if (mediaEffect instanceof C23500AbG) {
            c70481WYm = new CTVoiceEffectProcessor();
        } else {
            c70481WYm = new C70481WYm();
            C14360o3.A0A(c70481WYm);
        }
        C70087W2j c70087W2j = c69489VoC.A0C;
        int i = c70087W2j.A04;
        int i2 = c70087W2j.A01;
        Integer num = VYJ.A00;
        W25 w25 = new W25(i, i2);
        c70481WYm.configure(new C69065VhG(w25, w25, 1));
        Integer num2 = C05F.A01;
        ThreadPoolExecutor A02 = c58647PzK.A02(num2, null);
        C55771Opf c55771Opf = new C55771Opf(context);
        File cacheDir = context.getCacheDir();
        C14360o3.A07(cacheDir);
        OBZ obz = new OBZ(userSession, cacheDir, true, false);
        try {
            C70485WYq c70485WYq = new C70485WYq(context, w25, c55771Opf, new C70129W5q(), c67633Uto, obz.A03, new C69199VjS(1, null, null, false), c69489VoC, file2.getPath(), A02);
            WZY wzy = new WZY(new U7T(), new Object());
            X9V x9v = obz.A01;
            C66014TyA c66014TyA = AbstractC66016TyE.A00;
            ?? obj2 = new Object();
            obj2.A00 = c66014TyA;
            XC9 xc9 = VYA.A00;
            ?? obj3 = new Object();
            obj3.A00 = context;
            obj3.A05 = wzy;
            obj3.A03 = x9v;
            obj3.A02 = c55771Opf;
            obj3.A04 = obj2;
            obj3.A01 = xc9;
            return new WG8(c58647PzK, null, new C69377VmN(c70481WYm, c70485WYq, null, null, c69489VoC), c55771Opf, null, c69489VoC, obj3, num2);
        } catch (Exception unused) {
            c0f6.AEp("Failed to create AudioEncoderOutputBufferConsumer for applying audio filter", 245701013);
            return null;
        }
    }

    public static final void A01(C0f6 c0f6, WG8 wg8) {
        C14360o3.A0B(c0f6, 1);
        Handler handler = wg8.A0D;
        handler.obtainMessage(3).sendToTarget();
        handler.obtainMessage(1).sendToTarget();
        try {
            wg8.A0F.A02.FDt();
            wg8.A05();
        } catch (Exception unused) {
            c0f6.AEp("Audio filter failed to transcode", 245701013);
        }
    }
}
