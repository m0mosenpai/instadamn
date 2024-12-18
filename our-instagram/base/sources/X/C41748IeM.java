package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.Iterator;

/* renamed from: X.IeM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41748IeM {
    public static final C41748IeM A00 = new Object();

    public static final void A01(AbstractC23721Ec abstractC23721Ec, MusicPageTabType musicPageTabType, AudioPageAssetModel audioPageAssetModel, String str) {
        Iterator A14 = AbstractC166997dE.A14(A00(musicPageTabType, audioPageAssetModel, str, false, false));
        while (A14.hasNext()) {
            AbstractC37303Gc4.A16(abstractC23721Ec, A14);
        }
    }

    public final C1ON A04(AudioPageAssetModel audioPageAssetModel, UserSession userSession, String str, boolean z) {
        C14360o3.A0B(audioPageAssetModel, 1);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        AbstractC37302Gc3.A1M(A0q, userSession, C37410Gdq.class);
        A0q.A0B("clips/music/");
        A0q.A05();
        if (z) {
            String A0n = AbstractC167017dG.A0n(MusicPageTabType.A04, audioPageAssetModel.A02, AbstractC166987dD.A1C());
            if (str != null) {
                A0n = AnonymousClass001.A0R(A0n, str);
            }
            A0q.A0A = A0n;
            A0q.A08(C05F.A0N);
            ((AbstractC23721Ec) A0q).A01 = 900000L;
        }
        A01(A0q, null, audioPageAssetModel, str);
        return A0q.A0N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r23 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C24531Hw A05(com.instagram.api.schemas.MusicPageTabType r18, com.instagram.clips.audio.model.AudioPageAssetModel r19, com.instagram.common.session.UserSession r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r15 = 1
            r2 = 0
            r1 = 27647154(0x1a5dcb2, float:6.092811E-38)
            r0 = 0
            X.1Eb r5 = new X.1Eb
            r3 = r20
            r5.<init>(r3, r1, r15, r0)
            java.lang.String r0 = "clips/stream_clips_pivot_page/"
            r5.A0B(r0)
            r5.A05()
            java.lang.String r1 = "pivot_page_type"
            java.lang.String r0 = "audio"
            r5.A9s(r1, r0)
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            r10 = r23
            if (r25 != 0) goto L28
            r0 = 0
            if (r23 == 0) goto L29
        L28:
            r0 = 1
        L29:
            r6 = r18
            r7 = r19
            r8 = r21
            r4 = r24
            java.util.HashMap r0 = A00(r6, r7, r8, r4, r0)
            java.lang.String r1 = r1.A0B(r0)
            java.lang.String r0 = "music_page"
            r5.A9s(r0, r1)
            java.lang.Class<X.IPm> r14 = X.C41297IPm.class
            X.0aQ r12 = new X.0aQ
            r12.<init>(r3)
            X.1Mr r13 = new X.1Mr
            r13.<init>(r2)
            X.1Eh r11 = new X.1Eh
            r16 = r15
            r11.<init>(r12, r13, r14, r15, r16)
            r5.A01 = r11
            r4 = r17
            r9 = r22
            r4.A02(r5, r6, r7, r8, r9, r10)
            X.1Hw r0 = r5.A0N()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41748IeM.A05(com.instagram.api.schemas.MusicPageTabType, com.instagram.clips.audio.model.AudioPageAssetModel, com.instagram.common.session.UserSession, java.lang.String, boolean, boolean, boolean, boolean):X.1Hw");
    }

    private final void A02(AbstractC23721Ec abstractC23721Ec, MusicPageTabType musicPageTabType, AudioPageAssetModel audioPageAssetModel, String str, boolean z, boolean z2) {
        long j;
        String str2 = audioPageAssetModel.A02;
        if (musicPageTabType != null) {
            str2 = AbstractC167017dG.A0n(musicPageTabType, str2, AbstractC166987dD.A1C());
        }
        if (str != null) {
            str2 = AnonymousClass001.A0R(str2, str);
        }
        if (!z && !z2) {
            if (musicPageTabType == MusicPageTabType.A05) {
                j = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
            } else {
                j = 900000;
            }
            abstractC23721Ec.A08(C05F.A0N);
            abstractC23721Ec.A01 = j;
        } else {
            abstractC23721Ec.A08(C05F.A01);
        }
        abstractC23721Ec.A0A = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r6.A00 == com.instagram.music.common.model.AudioType.A03) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r2.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap A00(com.instagram.api.schemas.MusicPageTabType r5, com.instagram.clips.audio.model.AudioPageAssetModel r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            java.util.HashMap r3 = X.AbstractC166987dD.A1G()
            java.lang.String r2 = r6.A04
            if (r2 == 0) goto Lf
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L10
        Lf:
            r0 = 1
        L10:
            java.lang.String r4 = "referrer_media_id"
            if (r0 != 0) goto L5c
            if (r2 == 0) goto L1b
            java.lang.String r0 = "music_canonical_id"
            r3.put(r0, r2)
        L1b:
            java.lang.String r1 = r6.A05
            if (r1 == 0) goto L24
            java.lang.String r0 = "music_canonical_segment_id"
            r3.put(r0, r1)
        L24:
            com.instagram.music.common.model.AudioType r1 = r6.A00
            com.instagram.music.common.model.AudioType r0 = com.instagram.music.common.model.AudioType.A03
            if (r1 != r0) goto L35
        L2a:
            X.0do r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L35
            r3.put(r4, r0)
        L35:
            if (r9 == 0) goto L3e
            java.lang.String r1 = "6"
            java.lang.String r0 = "num_clips"
            r3.put(r0, r1)
        L3e:
            if (r7 == 0) goto L45
            java.lang.String r0 = "max_id"
            r3.put(r0, r7)
        L45:
            if (r5 == 0) goto L50
            java.lang.String r1 = r5.A00
            if (r1 == 0) goto L50
            java.lang.String r0 = "tab_type"
            r3.put(r0, r1)
        L50:
            if (r8 == 0) goto L5b
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "enable_chunk_streaming"
            r3.put(r0, r1)
        L5b:
            return r3
        L5c:
            java.lang.String r2 = r6.A01
            com.instagram.music.common.model.AudioType r1 = r6.A00
            com.instagram.music.common.model.AudioType r0 = com.instagram.music.common.model.AudioType.A03
            if (r1 != r0) goto L6f
            java.lang.String r0 = "audio_asset_id"
            r3.put(r0, r2)
            java.lang.String r0 = "audio_cluster_id"
            r3.put(r0, r2)
            goto L2a
        L6f:
            com.instagram.music.common.model.AudioType r0 = com.instagram.music.common.model.AudioType.A04
            if (r1 != r0) goto L35
            r0 = 1231(0x4cf, float:1.725E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r3.put(r0, r2)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41748IeM.A00(com.instagram.api.schemas.MusicPageTabType, com.instagram.clips.audio.model.AudioPageAssetModel, java.lang.String, boolean, boolean):java.util.HashMap");
    }

    public final C1ON A03(MusicPageTabType musicPageTabType, AudioPageAssetModel audioPageAssetModel, UserSession userSession, String str, boolean z, boolean z2) {
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A0B("clips/music/");
        A0q.A05();
        AbstractC37302Gc3.A1M(A0q, userSession, C41297IPm.class);
        A02(A0q, musicPageTabType, audioPageAssetModel, str, z, z2);
        A01(A0q, musicPageTabType, audioPageAssetModel, str);
        return A0q.A0N();
    }
}
