package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8KO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8KO {
    public boolean A00;
    public final int A01;
    public final UserSession A02;
    public final List A03;
    public final Context A04;
    public final C8KN A05;
    public final C8KP A06;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.8KP] */
    public C8KO(Context context, UserSession userSession, C8KN c8kn, int i) {
        C14360o3.A0B(userSession, 2);
        this.A04 = context;
        this.A02 = userSession;
        this.A05 = c8kn;
        this.A01 = i;
        this.A06 = new Object();
        this.A03 = new ArrayList();
    }

    public final void A02(Context context, UserSession userSession, JHD jhd, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 1);
        if (!this.A00) {
            this.A00 = true;
            C14120nc.A00().ATO(new HJY(context, userSession, jhd, this, str3, str, str2));
        }
    }

    public final void A03(AudioOverlayTrack audioOverlayTrack, JHD jhd, BCw bCw, int i, boolean z, boolean z2) {
        C14360o3.A0B(jhd, 2);
        C14360o3.A0B(bCw, 3);
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel != null && !z2) {
            audioOverlayTrack.A02 = Math.min(musicAssetModel.A00 - audioOverlayTrack.A03, i);
            String str = musicAssetModel.A0H;
            C14360o3.A07(str);
            A04(musicAssetModel, bCw, str, audioOverlayTrack.A03, audioOverlayTrack.A02, z);
            return;
        }
        this.A05.ACt();
        A02(this.A04, this.A02, jhd, audioOverlayTrack.A0A, audioOverlayTrack.A0B, audioOverlayTrack.A0E);
    }

    public final void A04(final MusicAssetModel musicAssetModel, final BCw bCw, final String str, final int i, final int i2, final boolean z) {
        AbstractC1808580n.A02("TrackDownloader.downloadTrack");
        if (!this.A00) {
            this.A00 = true;
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9Ng
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(92, 3, true, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C8KO c8ko = this;
                    C11T.A02(new RunnableC24799AyL(C8KO.A00(musicAssetModel, c8ko, str, i, i2, z), bCw, c8ko));
                }
            });
            return;
        }
        throw new IllegalStateException("downloading is already in progress");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0370 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, X.5cw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.music.common.model.DownloadedTrack A00(com.instagram.music.common.model.MusicAssetModel r28, X.C8KO r29, java.lang.String r30, int r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8KO.A00(com.instagram.music.common.model.MusicAssetModel, X.8KO, java.lang.String, int, int, boolean):com.instagram.music.common.model.DownloadedTrack");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r3.exists() == true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.instagram.music.common.model.DownloadedTrack A01(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            X.8KN r4 = r9.A05
            r4.AQH()
            com.instagram.common.session.UserSession r5 = r9.A02
            X.0Tz r6 = X.C06090Tz.A05
            r0 = 36327297246050786(0x810f7c000039e2, double:3.0368672844628594E-306)
            boolean r0 = X.C18U.A06(r6, r5, r0)
            r3 = 0
            if (r0 == 0) goto L51
            android.content.Context r0 = r9.A04     // Catch: java.lang.Throwable -> L96
            X.AbstractC167017dG.A1N(r0, r5)     // Catch: java.lang.Throwable -> L96
            X.2Pt r1 = X.C2Ps.A00(r0, r5)     // Catch: java.lang.Throwable -> L96
            boolean r0 = r1.A02()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L49
            java.io.File r2 = r1.A03     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = "audio-"
            java.lang.String r0 = "-audio.mp4"
            java.lang.String r0 = X.AnonymousClass001.A0g(r1, r11, r0)     // Catch: java.lang.Throwable -> L96
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L96
            r8.<init>(r2, r0)     // Catch: java.lang.Throwable -> L96
            r0 = 36327297246771693(0x810f7c000b39ed, double:3.036867284918764E-306)
            boolean r0 = X.C18U.A06(r6, r5, r0)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L95
            long r6 = r8.length()     // Catch: java.lang.Throwable -> L96
            r1 = 21
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L95
            goto L51
        L49:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L96
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        L51:
            X.16i r0 = X.C2n4.A09
            X.2n4 r6 = r0.E3L(r10)
            X.1QX r1 = new X.1QX
            r1.<init>()
            X.1Bw r0 = X.EnumC23341Bw.Other
            r1.A04 = r0
            X.1Ef r0 = X.C1Ef.OffScreen
            r1.A03 = r0
            X.1QY r2 = r1.A00()
            if (r3 != 0) goto L77
            java.lang.String r1 = "-audio"
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = X.AbstractC916948n.A0E(r1, r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
        L77:
            r4.AVC()
            X.14M r0 = X.C14M.A03()     // Catch: java.io.IOException -> Lb8
            X.4J7 r2 = r0.A08(r2, r6, r5)     // Catch: java.io.IOException -> Lb8
            X.1Qd r1 = r2.A02     // Catch: java.lang.Throwable -> Lb1
            java.io.InputStream r0 = r1.AjT()     // Catch: java.lang.Throwable -> Lb1
            X.AbstractC13530mf.A0B(r3, r0)     // Catch: java.lang.Throwable -> Lb1
            r4.CN5()     // Catch: java.lang.Throwable -> Lb1
            r1.AJp()     // Catch: java.lang.Throwable -> Lb1
            r2.close()     // Catch: java.io.IOException -> Lb8
            goto L9f
        L95:
            r3 = r8
        L96:
            r1 = 1
            if (r3 == 0) goto L51
            boolean r0 = r3.exists()
            if (r0 != r1) goto L51
        L9f:
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            java.lang.String r2 = r3.getPath()
            X.C14360o3.A07(r2)
            r1 = -1
            com.instagram.music.common.model.DownloadedTrack r0 = new com.instagram.music.common.model.DownloadedTrack
            r0.<init>(r2, r1, r1)
            return r0
        Lb1:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r0 = move-exception
            X.C20I.A00(r2, r1)     // Catch: java.io.IOException -> Lb8
            throw r0     // Catch: java.io.IOException -> Lb8
        Lb8:
            r2 = move-exception
            r0 = 685(0x2ad, float:9.6E-43)
            java.lang.String r1 = X.MSV.A00(r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8KO.A01(java.lang.String, java.lang.String):com.instagram.music.common.model.DownloadedTrack");
    }
}
