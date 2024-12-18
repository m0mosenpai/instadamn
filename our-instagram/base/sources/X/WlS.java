package X;

import android.content.Context;
import com.facebook.cvat.ctvoiceeffect.CTVoiceEffectProcessor;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WlS implements BCw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AudioFilterType A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ MusicAssetModel A04;
    public final /* synthetic */ C38335GtV A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: Type inference failed for: r11v4, types: [X.PpU, X.WZ3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.PzK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbI] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.XD9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.VK1, java.lang.Object] */
    @Override // X.BCw
    public final void DBi(DownloadedTrack downloadedTrack) {
        InterfaceC71995XEj c70481WYm;
        android.net.Uri fromFile;
        String str;
        AudioType audioType;
        C14360o3.A0B(downloadedTrack, 0);
        UserSession userSession = this.A03;
        Context context = this.A01;
        File file = new File(downloadedTrack.A02);
        AudioFilterType audioFilterType = this.A02;
        int i = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append('_');
        String name = audioFilterType.name();
        sb.append(name);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        sb.append(10000);
        String obj = sb.toString();
        Map map = VZ6.A00;
        String str2 = (String) map.get(obj);
        if (str2 != null) {
            fromFile = android.net.Uri.fromFile(new File(str2));
        } else {
            File A06 = AbstractC13530mf.A06(context, name);
            C14360o3.A07(A06);
            EnumC185288Jt A02 = AbstractC92574Cr.A02(audioFilterType);
            MediaEffect A00 = A02.A00(context);
            long j = i;
            float f = A02.A01;
            Float f2 = A02.A05;
            C1126256q c1126256q = new C1126256q();
            C1125856m c1125856m = new C1125856m(EnumC1125356h.AUDIO);
            C1125656k c1125656k = new C1125656k(file);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C1125456i c1125456i = new C1125456i(timeUnit, j, j + 10000);
            C1125456i c1125456i2 = new C1125456i(timeUnit, 0L, 10000L);
            c1125656k.A03 = c1125456i;
            c1125856m.A02(c1125656k.A00());
            if (A00 != null) {
                c1125856m.A03(new C69688VtY(c1125456i2, A00), null);
            }
            c1125856m.A00(f);
            if (f2 != null) {
                float floatValue = f2.floatValue();
                ?? obj2 = new Object();
                obj2.A00 = floatValue;
                c1125856m.A03(new C69688VtY(c1125456i2, obj2), null);
            }
            c1126256q.A04(new C1125956n(c1125856m));
            MediaComposition mediaComposition = new MediaComposition(c1126256q);
            File cacheDir = context.getCacheDir();
            C14360o3.A07(cacheDir);
            OBZ obz = new OBZ(userSession, cacheDir, true, false);
            InterfaceC71972XDf interfaceC71972XDf = obz.A03;
            X9V x9v = obz.A01;
            ?? obj3 = new Object();
            C18950wb c18950wb = C18950wb.A01;
            boolean z = A00 instanceof C23500AbG;
            AbstractC167007dF.A1F(interfaceC71972XDf, 3, x9v);
            C14360o3.A0B(c18950wb, 6);
            C67631Utm c67631Utm = new C67631Utm();
            W3N w3n = new W3N();
            w3n.A08 = mediaComposition;
            w3n.A06 = new WDI();
            w3n.A0F = A06.getPath();
            w3n.A0C = new C70087W2j(new C69201VjU());
            w3n.A0Q = true;
            C69489VoC c69489VoC = new C69489VoC(w3n);
            if (z) {
                c70481WYm = new CTVoiceEffectProcessor();
            } else {
                c70481WYm = new C70481WYm();
                C14360o3.A0A(c70481WYm);
            }
            C70087W2j c70087W2j = c69489VoC.A0C;
            int i2 = c70087W2j.A04;
            int i3 = c70087W2j.A01;
            Integer num = VYJ.A00;
            W25 w25 = new W25(i2, i3);
            c70481WYm.configure(new C69065VhG(w25, w25, 1));
            Integer num2 = C05F.A01;
            ThreadPoolExecutor A022 = obj3.A02(num2, null);
            C55771Opf c55771Opf = new C55771Opf(context);
            try {
                C70485WYq c70485WYq = new C70485WYq(context, w25, c55771Opf, new C70129W5q(), c67631Utm, interfaceC71972XDf, new C69199VjS(1, null, null, false), c69489VoC, A06.getPath(), A022);
                WZY wzy = new WZY(new U7T(), new Object());
                C66014TyA c66014TyA = AbstractC66016TyE.A00;
                ?? obj4 = new Object();
                obj4.A00 = c66014TyA;
                XC9 xc9 = VYA.A00;
                ?? obj5 = new Object();
                obj5.A00 = context;
                obj5.A05 = wzy;
                obj5.A03 = x9v;
                obj5.A02 = c55771Opf;
                obj5.A04 = obj4;
                obj5.A01 = xc9;
                AbstractC69934Vxz.A01(c18950wb, new WG8(obj3, null, new C69377VmN(c70481WYm, c70485WYq, null, null, c69489VoC), c55771Opf, null, c69489VoC, obj5, num2));
            } catch (Exception unused) {
                c18950wb.AEp("Failed to create AudioEncoderOutputBufferConsumer for applying audio filter", 245701013);
            }
            try {
                map.put(obj, A06.getCanonicalPath());
            } catch (IOException unused2) {
            }
            fromFile = android.net.Uri.fromFile(A06);
        }
        MusicDataSource musicDataSource = this.A04.A05;
        C38335GtV c38335GtV = this.A05;
        String obj6 = fromFile.toString();
        String str3 = null;
        if (musicDataSource != null) {
            str = musicDataSource.A04;
        } else {
            str = null;
        }
        String str4 = c38335GtV.A0D;
        if (musicDataSource != null) {
            str3 = musicDataSource.A02;
            audioType = musicDataSource.A01;
        } else {
            audioType = null;
        }
        C38335GtV.A01(new MusicDataSource(fromFile, audioType, obj6, str, str4, str3), c38335GtV, AbstractC92574Cr.A02(audioFilterType).A01, 0, this.A06);
        AbstractC166997dE.A1Y(c38335GtV.A0M, false);
    }

    public WlS(Context context, AudioFilterType audioFilterType, UserSession userSession, MusicAssetModel musicAssetModel, C38335GtV c38335GtV, int i, boolean z) {
        this.A05 = c38335GtV;
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = audioFilterType;
        this.A00 = i;
        this.A04 = musicAssetModel;
        this.A06 = z;
    }

    @Override // X.BCw
    public final void DBk() {
        AbstractC166997dE.A1Y(this.A05.A0M, false);
    }
}
