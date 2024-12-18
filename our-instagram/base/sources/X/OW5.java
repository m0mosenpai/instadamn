package X;

import android.content.Context;
import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class OW5 {
    public static final OOT A0E = new Object();
    public long A00;
    public C51051Mh5 A01;
    public File A02;
    public java.util.Set A03;
    public final Context A04;
    public final C55777Opm A05;
    public final C55775Opk A06;
    public final WZ2 A07;
    public final WZ3 A08;
    public final WZB A09;
    public final File A0A;
    public final ExecutorService A0B;
    public final C55777Opm A0C;
    public final UserSession A0D;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.MaF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.X9V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.OW6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.PpU, X.WZ3, java.lang.Object] */
    public final void A00() {
        C50671MYp c50671MYp;
        Context context = this.A04;
        File file = this.A0A;
        ExecutorService executorService = this.A0B;
        C14360o3.A06(executorService);
        C55777Opm c55777Opm = this.A0C;
        AbstractC167007dF.A1E(file, 1, c55777Opm);
        C66014TyA c66014TyA = VYI.A00;
        ?? obj = new Object();
        obj.A00 = c66014TyA;
        WZB wzb = new WZB(c66014TyA);
        C55775Opk c55775Opk = new C55775Opk();
        InterfaceC58194Pr0 ALI = new Object().ALI();
        ALI.ESw(file.getAbsolutePath());
        ArrayList A03 = AbstractC50670MYo.A03(ALI, "audio/");
        if (A03.isEmpty()) {
            c50671MYp = null;
        } else {
            c50671MYp = (C50671MYp) A03.get(0);
        }
        if (c50671MYp != null) {
            MediaFormat mediaFormat = c50671MYp.A01;
            boolean containsKey = mediaFormat.containsKey("sample-rate");
            boolean containsKey2 = mediaFormat.containsKey(TraceFieldType.Bitrate);
            boolean containsKey3 = mediaFormat.containsKey("channel-count");
            if (containsKey && containsKey2 && containsKey3) {
                W3N w3n = new W3N();
                w3n.A0D = OOT.A00(context, File.createTempFile("karaoke_bleep", null));
                C69201VjU c69201VjU = new C69201VjU();
                c69201VjU.A02 = mediaFormat.getInteger("sample-rate");
                c69201VjU.A00 = mediaFormat.getInteger(TraceFieldType.Bitrate);
                c69201VjU.A01 = mediaFormat.getInteger("channel-count");
                w3n.A0C = new C70087W2j(c69201VjU);
                w3n.A07 = c55777Opm;
                w3n.A0I = true;
                ?? obj2 = new Object();
                obj2.A0C = new C69489VoC(w3n);
                obj2.A00 = context;
                obj2.A05 = new WG9();
                obj2.A07 = c55775Opk;
                obj2.A0E = executorService;
                obj2.A0A = wzb;
                obj2.A08 = new Object();
                obj2.A09 = obj;
                AbstractC55147OdA.A00(obj2.A01());
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("mediaFormatInvalid - hasSampleRate: ");
            A1C.append(containsKey);
            A1C.append(", hasBitrate: ");
            A1C.append(containsKey2);
            A1C.append(", hasChannelCount: ");
            A1C.append(containsKey3);
            AbstractC12120kG.A05("KaraokeBleepAudioConcatInteractor_transcodeBleepAudio", A1C.toString(), null);
            return;
        }
        AbstractC12120kG.A05("{KaraokeBleepAudioConcatInteractor}_transcodeBleepAudio", "mediaFormatIsNull", null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.WZ3, java.lang.Object] */
    public OW5(Context context, UserSession userSession, File file, SortedSet sortedSet) {
        this.A04 = context;
        this.A0A = file;
        this.A0D = userSession;
        this.A03 = sortedSet == null ? C16910sj.A00 : sortedSet;
        this.A0B = Executors.newCachedThreadPool();
        this.A07 = new WZ2();
        C66014TyA c66014TyA = VYI.A00;
        ?? obj = new Object();
        obj.A00 = c66014TyA;
        this.A08 = obj;
        this.A09 = new WZB(c66014TyA);
        this.A06 = new C55775Opk();
        this.A05 = new C55777Opm(this, 1);
        this.A0C = new C55777Opm(this, 2);
    }
}
