package X;

/* renamed from: X.Wyz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71693Wyz implements InterfaceC19960yQ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71693Wyz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r31 != (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r30 = r0.getValue();
        r29 = X.AbstractC001800i.A0U((java.util.Collection) r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if ((r8 instanceof X.V2U) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r13 = (X.V2U) r8;
        r3 = null;
        r1 = r13.A02.AKo();
        r1.A05 = r4;
        r0 = null;
        r0 = null;
        new X.C1DY((X.C1DV) new X.C37761pD(null), 6, false);
        r14 = r1.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if ((r14 instanceof com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        r27 = new X.C09530e4("allow_media_creation_with_music", r1.A03);
        r26 = new X.C09530e4("audio_asset_start_time_in_ms", r1.A09);
        r2 = r1.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r6 = new java.util.ArrayList();
        r5 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (r5.hasNext() == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r2 = (com.instagram.api.schemas.AudioFilterInfoIntf) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r2 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        r6.add(r2.F7o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        r25 = new X.C09530e4("audio_filter_infos", r6);
        r2 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        r6 = r2.F7o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        r24 = new X.C09530e4("audio_muting_info", r6);
        r23 = new X.C09530e4("contains_lyrics", r1.A04);
        r22 = new X.C09530e4("derived_content_id", r1.A0D);
        r2 = r1.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        if (r2 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        r6 = X.AbstractC167007dF.A0i(r2);
        r5 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
    
        if (r5.hasNext() == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
    
        r2 = (com.instagram.api.schemas.AudioMetadataLabels) r5.next();
        X.C14360o3.A0B(r2, 0);
        r6.add(r2.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x062f, code lost:
    
        r21 = new X.C09530e4("display_labels", r6);
        r20 = new X.C09530e4("formatted_clips_media_count", r1.A0E);
        r2 = r1.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0645, code lost:
    
        if (r2 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0647, code lost:
    
        r3 = r2.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x064b, code lost:
    
        r19 = new X.C09530e4("ig_artist", r3);
        r18 = new X.C09530e4("is_bookmarked", r1.A05);
        r17 = new X.C09530e4("is_trending_in_clips", r1.A06);
        r16 = new X.C09530e4("overlap_duration_in_ms", r1.A0A);
        r15 = new X.C09530e4("placeholder_profile_pic_url", r1.A0F);
        r11 = new X.C09530e4("previous_trend_rank", r1.A0B);
        r10 = new X.C09530e4("should_allow_music_editing", r1.A07);
        r7 = new X.C09530e4("should_mute_audio", java.lang.Boolean.valueOf(r1.A0J));
        r6 = new X.C09530e4("should_mute_audio_reason", r1.A0G);
        r2 = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x06a8, code lost:
    
        if (r2 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x06aa, code lost:
    
        r0 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x06ac, code lost:
    
        r10 = X.AbstractC37303Gc4.A06(r14, new X.C09530e4[]{r27, r26, r25, r24, r23, r22, r21, r20, r19, r18, r17, r16, r15, r11, r10, r7, r6, new X.C09530e4("should_mute_audio_reason_type", r0), new X.C09530e4("should_render_soundwave", r1.A08), new X.C09530e4("trend_rank", r1.A0C)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x06f5, code lost:
    
        r10 = (com.instagram.music.common.model.MusicConsumptionModel) r10;
        r14 = r13.A06;
        r11 = r13.A07;
        r6 = r13.A08;
        r5 = r13.A00;
        r3 = r13.A03;
        r2 = r13.A05;
        r1 = r13.A04;
        r0 = r13.A01;
        r15 = r13.A0A;
        r13 = r13.A0B;
        X.C14360o3.A0B(r14, 0);
        X.AbstractC167027dH.A13(r11, r6, r5);
        X.C14360o3.A0B(r3, 5);
        X.C14360o3.A0B(r2, 6);
        X.AbstractC167007dF.A1I(r1, 7, r0);
        X.C14360o3.A0B(r10, 11);
        r7 = new X.V2U(r5, r0, r10, r14, r11, r6, r3, r2, r1, r53, r15, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0740, code lost:
    
        r29.set(r31, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0751, code lost:
    
        if (r0.AIi(r30, r29) == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x062e, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        r33 = null;
        X.AbstractC31180DnO.A0w(6);
        r2 = r1.A03;
        r2 = r1.A09;
        r2 = r1.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011a, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:
    
        r0 = X.AbstractC167017dG.A0q(r2);
        r3 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        if (r3.hasNext() == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
    
        r0.add(((com.instagram.api.schemas.AudioFilterInfoIntf) r3.next()).Er1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        r2 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013a, code lost:
    
        if (r2 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013c, code lost:
    
        r33 = r2.Er4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
    
        r2 = r1.A04;
        r2 = r1.A0D;
        r2 = r1.A0I;
        r2 = r1.A0E;
        r2 = r1.A02;
        r2 = r1.A05;
        r2 = r1.A06;
        r15 = r1.A0A;
        r14 = r1.A0F;
        r10 = new com.instagram.music.common.model.MusicConsumptionModelImpl(r33, r1.A01, r2, r2, r2, r2, r2, r1.A07, r1.A08, r2, r15, r1.A0B, r1.A0C, r2, r2, r14, r1.A0G, r0, r2, r1.A0J);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019f, code lost:
    
        if ((r8 instanceof X.V2V) == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a1, code lost:
    
        r0 = (X.V2V) r8;
        r14 = r0.A06;
        r13 = r0.A07;
        r12 = r0.A08;
        r11 = r0.A00;
        r10 = r0.A03;
        r6 = r0.A05;
        r5 = r0.A04;
        r3 = r0.A01;
        r15 = r0.A0A;
        r2 = r0.A0C;
        r1 = r0.A0B;
        r0 = r0.A02;
        X.C14360o3.A0B(r14, 0);
        X.AbstractC167027dH.A13(r13, r12, r11);
        X.C14360o3.A0B(r10, 5);
        X.AbstractC167017dG.A1U(r6, r5);
        X.C14360o3.A0B(r3, 8);
        r7 = new X.V2V(r11, r3, r0, r14, r13, r12, r10, r6, r5, r53, r15, r2, r1);
        r2 = r7.A02;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f0, code lost:
    
        if (r2 == null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f2, code lost:
    
        r1 = r2.A00;
        X.C14360o3.A0B(r1, 1);
        r51 = r1.AyY();
        r1.isBookmarked();
        r2.A00 = new com.instagram.api.schemas.OriginalSoundConsumptionInfo(r1.BvC(), r51, r1.getShouldMuteAudioReason(), r53, r1.isTrendingInClips());
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0768, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append(X.AbstractC58317Pt9.A00(642));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x077e, code lost:
    
        throw X.AbstractC58320PtC.A0n(X.AbstractC25229BEm.A0r(r8), r1);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0323 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0246  */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.widget.LinearLayout, android.view.View, X.UCH, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v24, types: [X.V2U] */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r59, X.InterfaceC23621Ds r60) {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71693Wyz.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }
}
