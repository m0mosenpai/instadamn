package com.instagram.debug.devoptions.signalsplayground.repository;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC40691uc;
import X.AbstractC41763Iee;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.HYM;
import X.MUq;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class CreatorInspirationSignalsPlaygroundRepository {
    public final C05A _signalDetailsState;
    public final C05A _signalRecommendationsState;
    public final C05A _signalsState;
    public final CreatorInspirationSignalsPlaygroundDataSource dataSource;
    public final C0UO signalDetailsState;
    public final C0UO signalRecommendationsState;
    public final C0UO signalsState;
    public final UserSession userSession;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSignalDetails(java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository.fetchSignalDetails(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSignalRecommendations(java.lang.String r11, java.lang.String r12, X.InterfaceC23621Ds r13) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository.fetchSignalRecommendations(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSignals(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1
            if (r0 == 0) goto L87
            r3 = r6
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1 r3 = (com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r2 = r3.result
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.label
            r4 = 1
            if (r0 == 0) goto L76
            if (r0 != r4) goto L92
            java.lang.Object r3 = r3.L$0
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository r3 = (com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository) r3
            X.AbstractC09560e7.A00(r2)
        L24:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L6d
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse r0 = (com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse) r0
            if (r0 == 0) goto L68
            com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse$XdtGetCreatorsSignalPlayground r0 = r0.getXdtGetCreatorsSignalPlayground()
            if (r0 == 0) goto L68
            com.google.common.collect.ImmutableList r2 = r0.getSignals()
            if (r2 == 0) goto L68
        L42:
            X.05A r1 = r3._signalsState
            X.MU9 r0 = new X.MU9
            r0.<init>(r2, r4)
            r1.Egh(r0)
            X.3NX r2 = X.AbstractC25227BEk.A0i()
        L50:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L65
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L8d
            X.05A r3 = r3._signalsState
            java.lang.String r2 = "error fetching signals"
            r1 = 0
            X.MU9 r0 = new X.MU9
            r0.<init>(r2, r1)
            r3.Egh(r0)
        L65:
            X.0eB r1 = X.C0eB.A00
        L67:
            return r1
        L68:
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            goto L42
        L6d:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L50
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L76:
            X.AbstractC09560e7.A00(r2)
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundDataSource r0 = r5.dataSource
            r3.L$0 = r5
            r3.label = r4
            java.lang.Object r2 = r0.getSignals(r3)
            if (r2 == r1) goto L67
            r3 = r5
            goto L24
        L87:
            com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1 r3 = new com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1
            r3.<init>(r5, r6)
            goto L12
        L8d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L92:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository.fetchSignals(X.1Ds):java.lang.Object");
    }

    public final C0UO getSignalDetailsState() {
        return this.signalDetailsState;
    }

    public final C0UO getSignalRecommendationsState() {
        return this.signalRecommendationsState;
    }

    public final C0UO getSignalsState() {
        return this.signalsState;
    }

    public CreatorInspirationSignalsPlaygroundRepository(UserSession userSession, CreatorInspirationSignalsPlaygroundDataSource creatorInspirationSignalsPlaygroundDataSource) {
        AbstractC167017dG.A1P(userSession, creatorInspirationSignalsPlaygroundDataSource);
        this.userSession = userSession;
        this.dataSource = creatorInspirationSignalsPlaygroundDataSource;
        MUq mUq = MUq.A00;
        C008002u A00 = C10E.A00(mUq);
        this._signalsState = A00;
        this.signalsState = A00;
        C008002u A002 = C10E.A00(mUq);
        this._signalDetailsState = A002;
        this.signalDetailsState = A002;
        C008002u A003 = C10E.A00(mUq);
        this._signalRecommendationsState = A003;
        this.signalRecommendationsState = A003;
    }

    private final HYM createAudioTrackItem(TrackOrOriginalSoundSchemaIntf trackOrOriginalSoundSchemaIntf) {
        String str;
        boolean z;
        Integer num;
        Integer num2;
        Boolean Cer;
        if (trackOrOriginalSoundSchemaIntf.CA8() != null) {
            TrackData CA8 = trackOrOriginalSoundSchemaIntf.CA8();
            if (CA8 != null) {
                String audioClusterId = CA8.getAudioClusterId();
                if (audioClusterId != null) {
                    String title = CA8.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String displayArtist = CA8.getDisplayArtist();
                    if (displayArtist == null) {
                        displayArtist = "";
                    }
                    TrackMetadata BTR = trackOrOriginalSoundSchemaIntf.BTR();
                    if (BTR != null) {
                        str = BTR.getFormattedClipsMediaCount();
                    } else {
                        str = null;
                    }
                    ImageUrl AsF = CA8.AsF();
                    boolean isExplicit = CA8.isExplicit();
                    TrackMetadata BTR2 = trackOrOriginalSoundSchemaIntf.BTR();
                    if (BTR2 != null && (Cer = BTR2.Cer()) != null) {
                        z = Cer.booleanValue();
                    } else {
                        z = false;
                    }
                    MusicDataSource musicDataSource = new MusicDataSource(null, AudioType.A03, CA8.getProgressiveDownloadUrl(), CA8.getDashManifest(), CA8.getId(), CA8.getArtistId());
                    List BE6 = CA8.BE6();
                    AudioPageMetadata A03 = AbstractC41763Iee.A03(CA8, false);
                    TrackMetadata BTR3 = trackOrOriginalSoundSchemaIntf.BTR();
                    if (BTR3 != null) {
                        num = BTR3.CAx();
                    } else {
                        num = null;
                    }
                    TrackMetadata BTR4 = trackOrOriginalSoundSchemaIntf.BTR();
                    if (BTR4 != null) {
                        num2 = BTR4.Bg7();
                    } else {
                        num2 = null;
                    }
                    return new HYM(A03, AsF, musicDataSource, null, num, num2, audioClusterId, title, displayArtist, str, null, CA8.getAudioAssetId(), BE6, isExplicit, z, false, false);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (trackOrOriginalSoundSchemaIntf.BZv() != null) {
            OriginalSoundDataIntf BZv = trackOrOriginalSoundSchemaIntf.BZv();
            if (BZv != null) {
                return new HYM(AbstractC41763Iee.A01(null, BZv, false), BZv.BFU().Bhu(), new MusicDataSource(null, AudioType.A04, BZv.getProgressiveDownloadUrl(), BZv.getDashManifest(), BZv.getAudioAssetId(), BZv.BFU().getId()), null, BZv.CAx(), BZv.Bg7(), BZv.getAudioAssetId(), BZv.getOriginalAudioTitle(), BZv.BFU().getUsername(), BZv.getFormattedClipsMediaCount(), null, null, AbstractC166987dD.A1J(0), BZv.isExplicit(), BZv.AqX().isTrendingInClips(), false, true);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A12("TrackOrOriginalSoundSchema does not contain track or original sound");
    }

    public /* synthetic */ CreatorInspirationSignalsPlaygroundRepository(UserSession userSession, CreatorInspirationSignalsPlaygroundDataSource creatorInspirationSignalsPlaygroundDataSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession, (i & 2) != 0 ? new CreatorInspirationSignalsPlaygroundDataSource(userSession, AbstractC40691uc.A01(userSession)) : creatorInspirationSignalsPlaygroundDataSource);
    }
}
