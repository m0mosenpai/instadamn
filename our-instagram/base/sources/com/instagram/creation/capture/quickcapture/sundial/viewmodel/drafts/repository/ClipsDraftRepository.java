package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository;

import X.AbstractC001800i;
import X.AbstractC12120kG;
import X.AbstractC193598he;
import X.AbstractC209669Pc;
import X.AbstractC226959zr;
import X.AbstractC23641Du;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.BC2;
import X.C05F;
import X.C06090Tz;
import X.C0eB;
import X.C115475Kh;
import X.C128175qm;
import X.C12L;
import X.C14360o3;
import X.C18U;
import X.C193588hd;
import X.C193618hh;
import X.C193628hi;
import X.C193638hj;
import X.C193648hk;
import X.C193658hl;
import X.C19L;
import X.C1JX;
import X.C206649Cv;
import X.C23031Ai;
import X.C27S;
import X.C2GS;
import X.C2GT;
import X.C43893Jb2;
import X.C47Z;
import X.C49602Pt;
import X.C4A7;
import X.C4A8;
import X.C50650MXp;
import X.C5JK;
import X.C5Kv;
import X.C8ZT;
import X.C9JS;
import X.EnumC50651MXr;
import X.EnumC76383bi;
import X.InterfaceC23621Ds;
import X.MXY;
import X.MXZ;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource$getTempCoverImage$2$1;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class ClipsDraftRepository extends C4A7 {
    public AbstractC193598he A00;
    public C128175qm A01;
    public final C2GS A02;
    public final UserSession A03;
    public final C193658hl A04;
    public final ClipsDraftLocalDataSource A05;
    public final PendingMediaStore A06;
    public final C49602Pt A07;
    public final C23031Ai A08;
    public final Context A09;
    public final C193638hj A0A;
    public final C193628hi A0B;
    public final C193618hh A0C;
    public final boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2GT, X.2GS] */
    public ClipsDraftRepository(Context context, UserSession userSession, C193638hj c193638hj, C193628hi c193628hi, C193618hh c193618hh, ClipsDraftLocalDataSource clipsDraftLocalDataSource, PendingMediaStore pendingMediaStore, C49602Pt c49602Pt, C23031Ai c23031Ai, boolean z) {
        super("Reels", C4A8.A01(513339792, 3));
        C14360o3.A0B(c49602Pt, 3);
        C14360o3.A0B(pendingMediaStore, 4);
        C14360o3.A0B(clipsDraftLocalDataSource, 5);
        C14360o3.A0B(c193618hh, 6);
        C14360o3.A0B(c23031Ai, 10);
        this.A09 = context;
        this.A03 = userSession;
        this.A07 = c49602Pt;
        this.A06 = pendingMediaStore;
        this.A05 = clipsDraftLocalDataSource;
        this.A0C = c193618hh;
        this.A0B = c193628hi;
        this.A0A = c193638hj;
        this.A0D = z;
        this.A08 = c23031Ai;
        this.A02 = new C2GT(C193648hk.A00);
        this.A00 = C193588hd.A00;
        this.A04 = new C193658hl();
        C19L c19l = super.A01;
        C206649Cv c206649Cv = new C206649Cv(this, null, 4);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0oO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(X.BDI r9, X.C128175qm r10, X.InterfaceC23621Ds r11) {
        /*
            r8 = this;
            r4 = 0
            boolean r0 = r11 instanceof X.B55
            if (r0 == 0) goto L9a
            r3 = r11
            X.B55 r3 = (X.B55) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r3.A00 = r2
        L13:
            java.lang.Object r0 = r3.A05
            X.1JX r2 = X.C1JX.A02
            int r1 = r3.A00
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L27
            if (r1 == r6) goto L4d
            if (r1 != r5) goto La1
            X.AbstractC09560e7.A00(r0)
        L24:
            X.0eB r2 = X.C0eB.A00
        L26:
            return r2
        L27:
            X.AbstractC09560e7.A00(r0)
            X.0oO r7 = new X.0oO
            r7.<init>()
            r7.A00 = r6
            boolean r0 = r8.A0D
            if (r0 == 0) goto L4b
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r1 = r8.A05
            java.lang.String r0 = r10.A0T
            r3.A01 = r8
            r3.A02 = r10
            r3.A03 = r9
            r3.A04 = r7
            r3.A00 = r6
            java.lang.Object r0 = r1.A07(r0, r3)
            if (r0 == r2) goto L26
            r6 = r8
            goto L60
        L4b:
            r6 = r8
            goto L6a
        L4d:
            java.lang.Object r7 = r3.A04
            X.0oO r7 = (X.C14510oO) r7
            java.lang.Object r9 = r3.A03
            X.BDI r9 = (X.BDI) r9
            java.lang.Object r10 = r3.A02
            X.5qm r10 = (X.C128175qm) r10
            java.lang.Object r6 = r3.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.AbstractC09560e7.A00(r0)
        L60:
            X.5qm r0 = (X.C128175qm) r0
            if (r0 == 0) goto L6a
            boolean r0 = r6.A08(r0, r10)
            r7.A00 = r0
        L6a:
            boolean r0 = r7.A00
            if (r0 == 0) goto L24
            X.8hh r0 = r6.A0C
            X.C14360o3.A0B(r10, r4)
            java.util.Map r1 = r0.A01
            java.lang.String r0 = r10.A0T
            r1.put(r0, r10)
            X.MXr r1 = r10.A0G
            X.MXr r0 = X.EnumC50651MXr.A02
            if (r1 != r0) goto L24
            X.5JK r1 = r10.A0H
            X.5JK r0 = X.C5JK.A06
            if (r1 == r0) goto L24
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r1 = r6.A05
            r0 = 0
            r3.A01 = r0
            r3.A02 = r0
            r3.A03 = r0
            r3.A04 = r0
            r3.A00 = r5
            java.lang.Object r0 = r1.A01(r9, r10, r3, r4)
            if (r0 != r2) goto L24
            return r2
        L9a:
            X.B55 r3 = new X.B55
            r3.<init>(r8, r11)
            goto L13
        La1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0A(X.BDI, X.5qm, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0F(X.BC2 r12, X.InterfaceC25188BCl r13, X.InterfaceC23621Ds r14, X.InterfaceC16660sJ r15, boolean r16, boolean r17) {
        /*
            r11 = this;
            r5 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            r3 = 0
            boolean r0 = r14 instanceof X.C206519Ci
            if (r0 == 0) goto L79
            r7 = r14
            X.9Ci r7 = (X.C206519Ci) r7
            int r0 = r7.A07
            if (r0 != r3) goto L79
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r7.A00 = r2
        L1d:
            java.lang.Object r4 = r7.A04
            X.1JX r3 = X.C1JX.A02
            int r2 = r7.A00
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L51
            if (r2 == r0) goto L3d
            if (r2 != r1) goto L7f
            boolean r10 = r7.A05
            java.lang.Object r6 = r7.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.AbstractC09560e7.A00(r4)
        L34:
            if (r10 == 0) goto L3a
            X.8hd r0 = X.C193588hd.A00
            r6.A00 = r0
        L3a:
            X.0eB r3 = X.C0eB.A00
        L3c:
            return r3
        L3d:
            boolean r10 = r7.A06
            boolean r9 = r7.A05
            java.lang.Object r8 = r7.A03
            X.0sJ r8 = (X.InterfaceC16660sJ) r8
            java.lang.Object r5 = r7.A02
            X.BCl r5 = (X.InterfaceC25188BCl) r5
            java.lang.Object r6 = r7.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.AbstractC09560e7.A00(r4)
            goto L67
        L51:
            X.AbstractC09560e7.A00(r4)
            r7.A01 = r11
            r7.A02 = r13
            r7.A03 = r15
            r7.A05 = r9
            r7.A06 = r10
            r7.A00 = r0
            java.lang.Object r0 = r11.A0G(r12, r7, r10)
            if (r0 == r3) goto L3c
            r6 = r11
        L67:
            r7.A01 = r6
            r0 = 0
            r7.A02 = r0
            r7.A03 = r0
            r7.A05 = r10
            r7.A00 = r1
            java.lang.Object r0 = A03(r5, r6, r7, r8, r9, r10)
            if (r0 != r3) goto L34
            return r3
        L79:
            X.9Ci r7 = new X.9Ci
            r7.<init>(r11, r14, r3)
            goto L1d
        L7f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0F(X.BC2, X.BCl, X.1Ds, X.0sJ, boolean, boolean):java.lang.Object");
    }

    public final String A0I(C9JS c9js, C5JK c5jk, EnumC76383bi enumC76383bi, AudioOverlayTrack audioOverlayTrack, PendingRecipient pendingRecipient, List list) {
        List list2;
        boolean z;
        C14360o3.A0B(c5jk, 0);
        MXY mxy = new MXY();
        mxy.A05(EnumC50651MXr.A02);
        mxy.A06(new ArrayList());
        mxy.A02 = new MXZ(audioOverlayTrack);
        if (list == null) {
            list = new ArrayList();
        }
        mxy.A0b = new MXZ(list);
        mxy.A0j = new MXZ(c9js);
        if (pendingRecipient != null) {
            list2 = Collections.singletonList(pendingRecipient);
            C14360o3.A07(list2);
        } else {
            list2 = null;
        }
        mxy.A0o = new MXZ(list2);
        mxy.A00 = new MXZ(enumC76383bi);
        C27S.A00();
        UserSession userSession = this.A03;
        new C50650MXp(userSession);
        C43893Jb2 c43893Jb2 = new C43893Jb2(userSession);
        if (!C27S.A00().A03().A02(userSession)) {
            z = false;
        } else if (!C18U.A06(C06090Tz.A05, userSession, 36330527061459862L)) {
            z = true;
        } else {
            z = c43893Jb2.A00.getBoolean("media_level_settings_on", true);
        }
        mxy.A0R = new MXZ(Boolean.valueOf(z));
        C128175qm A02 = mxy.A02(c5jk, UUID.randomUUID().toString());
        this.A01 = null;
        this.A02.A0B(new C8ZT(A02));
        if (this.A01 == null) {
            this.A01 = A02;
        }
        return A02.A0T;
    }

    public final void A0N(C128175qm c128175qm) {
        C14360o3.A0B(c128175qm, 0);
        C128175qm A09 = A09();
        if (A09 != null) {
            A08(A09, c128175qm);
        }
        this.A02.A0B(new C8ZT(c128175qm));
        if (this.A01 == null) {
            this.A01 = c128175qm;
        }
    }

    public final void A0O(C128175qm c128175qm) {
        C14360o3.A0B(c128175qm, 0);
        C128175qm A09 = A09();
        if (A09 != null) {
            A08(A09, c128175qm);
        }
        this.A02.A0A(new C8ZT(c128175qm));
        if (this.A01 == null) {
            this.A01 = c128175qm;
        }
    }

    public final void A0P(C5JK c5jk, EnumC76383bi enumC76383bi) {
        A0I(null, c5jk, enumC76383bi, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0oO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C128175qm r6, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 15
            boolean r0 = X.C206459Cc.A00(r8, r3)
            if (r0 == 0) goto L71
            r5 = r8
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L52
            if (r0 != r2) goto L77
            java.lang.Object r3 = r5.A02
            X.0oO r3 = (X.C14510oO) r3
            java.lang.Object r6 = r5.A01
            X.5qm r6 = (X.C128175qm) r6
            X.AbstractC09560e7.A00(r1)
        L2c:
            X.5qm r1 = (X.C128175qm) r1
            if (r1 == 0) goto L3f
            X.MXr r1 = r1.A0G
            X.MXr r0 = X.EnumC50651MXr.A03
            if (r1 != r0) goto L3f
            X.MXr r1 = r6.A0G
            X.MXr r0 = X.EnumC50651MXr.A02
            if (r1 != r0) goto L3f
            r0 = 0
            r3.A00 = r0
        L3f:
            boolean r0 = r3.A00
            if (r0 != 0) goto L4b
            java.lang.String r2 = "ClipsDraftRepository"
            java.lang.String r1 = "ClipsDraft delete validation error"
            r0 = 0
            X.AbstractC12120kG.A07(r2, r1, r0)
        L4b:
            boolean r0 = r3.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L52:
            X.AbstractC09560e7.A00(r1)
            X.0oO r3 = new X.0oO
            r3.<init>()
            r3.A00 = r2
            boolean r0 = r7.A0D
            if (r0 == 0) goto L3f
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r1 = r7.A05
            java.lang.String r0 = r6.A0T
            r5.A01 = r6
            r5.A02 = r3
            r5.A00 = r2
            java.lang.Object r1 = r1.A07(r0, r5)
            if (r1 != r4) goto L2c
            return r4
        L71:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r7, r8, r3)
            goto L16
        L77:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A00(X.5qm, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.BC2 r8, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 18
            boolean r0 = X.C206459Cc.A00(r10, r3)
            if (r0 == 0) goto L9e
            r6 = r10
            X.9Cc r6 = (X.C206459Cc) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r4 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L4c
            if (r0 != r7) goto La5
            X.AbstractC09560e7.A00(r4)
        L27:
            X.0eB r5 = X.C0eB.A00
            return r5
        L2a:
            X.AbstractC09560e7.A00(r4)
            X.2GS r0 = r9.A02
            java.lang.Object r1 = r0.A02()
            X.8he r1 = (X.AbstractC193598he) r1
            boolean r0 = r1 instanceof X.C8ZT
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.A00()
            X.5qm r0 = (X.C128175qm) r0
            r6.A01 = r9
            r6.A02 = r1
            r6.A00 = r2
            java.lang.Object r4 = r8.Cq7(r0, r6)
            if (r4 != r5) goto L57
            return r5
        L4c:
            java.lang.Object r1 = r6.A02
            X.8he r1 = (X.AbstractC193598he) r1
            java.lang.Object r9 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r9 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r9
            X.AbstractC09560e7.A00(r4)
        L57:
            X.5qm r4 = (X.C128175qm) r4
            java.lang.Object r0 = r1.A00()
            X.5qm r0 = (X.C128175qm) r0
            r9.A08(r0, r4)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L85
            X.2GS r1 = r9.A02
            X.8ZT r0 = new X.8ZT
            r0.<init>(r4)
            r1.A0B(r0)
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.5qm r0 = r9.A01
            if (r0 != 0) goto L27
            r9.A01 = r4
            goto L27
        L85:
            X.12L r0 = X.C12L.A00
            X.12T r3 = r0.A04
            r2 = 0
            r1 = 46
            X.PZJ r0 = new X.PZJ
            r0.<init>(r9, r4, r2, r1)
            r6.A01 = r2
            r6.A02 = r2
            r6.A00 = r7
            java.lang.Object r0 = X.AbstractC23641Du.A00(r6, r3, r0)
            if (r0 != r5) goto L27
            return r5
        L9e:
            X.9Cc r6 = new X.9Cc
            r6.<init>(r9, r10, r3)
            goto L16
        La5:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A01(X.BC2, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.BC2 r8, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 44
            boolean r0 = X.MAO.A02(r10, r3)
            if (r0 == 0) goto L75
            r6 = r10
            X.MAO r6 = (X.MAO) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r4 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L46
            if (r0 != r7) goto L7b
            X.AbstractC09560e7.A00(r4)
        L27:
            X.0eB r5 = X.C0eB.A00
            return r5
        L2a:
            X.AbstractC09560e7.A00(r4)
            X.8he r1 = r9.A00
            boolean r0 = r1 instanceof X.C8ZT
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.A00()
            X.5qm r0 = (X.C128175qm) r0
            r6.A01 = r9
            r6.A02 = r1
            r6.A00 = r2
            java.lang.Object r4 = r8.Cq7(r0, r6)
            if (r4 != r5) goto L51
            return r5
        L46:
            java.lang.Object r1 = r6.A02
            X.8he r1 = (X.AbstractC193598he) r1
            java.lang.Object r9 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r9 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r9
            X.AbstractC09560e7.A00(r4)
        L51:
            X.5qm r4 = (X.C128175qm) r4
            java.lang.Object r0 = r1.A00()
            X.5qm r0 = (X.C128175qm) r0
            r9.A08(r0, r4)
            X.12L r0 = X.C12L.A00
            X.12T r3 = r0.A04
            r2 = 0
            r1 = 47
            X.PZJ r0 = new X.PZJ
            r0.<init>(r9, r4, r2, r1)
            r6.A01 = r2
            r6.A02 = r2
            r6.A00 = r7
            java.lang.Object r0 = X.AbstractC23641Du.A00(r6, r3, r0)
            if (r0 != r5) goto L27
            return r5
        L75:
            X.MAO r6 = new X.MAO
            r6.<init>(r9, r10, r3)
            goto L16
        L7b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A02(X.BC2, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.InterfaceC25188BCl r7, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r8, X.InterfaceC23621Ds r9, X.InterfaceC16660sJ r10, boolean r11, boolean r12) {
        /*
            r3 = 17
            boolean r0 = X.C206459Cc.A00(r9, r3)
            if (r0 == 0) goto L9c
            r4 = r9
            X.9Cc r4 = (X.C206459Cc) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L37
            if (r0 == r5) goto L33
            if (r0 != r6) goto La3
            java.lang.Object r2 = r4.A02
            java.lang.Object r10 = r4.A01
            X.0sJ r10 = (X.InterfaceC16660sJ) r10
            X.AbstractC09560e7.A00(r1)
        L2d:
            r10.invoke(r2)
        L30:
            X.0eB r3 = X.C0eB.A00
            return r3
        L33:
            X.AbstractC09560e7.A00(r1)
            goto L30
        L37:
            X.AbstractC09560e7.A00(r1)
            if (r12 == 0) goto L66
            X.8he r0 = r8.A00
            java.lang.Object r2 = r0.A00()
        L42:
            X.5qm r2 = (X.C128175qm) r2
            boolean r0 = r8.A0D
            if (r0 == 0) goto L77
            java.util.List r0 = r2.A0v
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L77
            com.instagram.common.session.UserSession r0 = r8.A03
            X.8Bh r0 = X.AbstractC183338Bg.A00(r0)
            java.lang.String r4 = "Saved draft cannot have empty video segments"
            X.24Q r3 = r0.A0K
            long r1 = r0.A03
            r0 = 221(0xdd, float:3.1E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r3.A09(r1, r0, r4)
            goto L30
        L66:
            X.2GS r0 = r8.A02
            java.lang.Object r1 = r0.A02()
            X.8he r1 = (X.AbstractC193598he) r1
            boolean r0 = r1 instanceof X.C8ZT
            if (r0 == 0) goto Lb1
            java.lang.Object r2 = r1.A00()
            goto L42
        L77:
            X.MXr r0 = r2.A0G
            int[] r1 = X.O03.A00
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L92
            if (r0 != r6) goto Lab
            r4.A01 = r10
            r4.A02 = r2
            r4.A00 = r6
            java.lang.Object r0 = r8.A0B(r2, r7, r4, r11)
            if (r0 != r3) goto L2d
            return r3
        L92:
            r0 = 0
            r4.A00 = r5
            java.lang.Object r0 = r8.A0A(r0, r2, r4)
            if (r0 != r3) goto L30
            return r3
        L9c:
            X.9Cc r4 = new X.9Cc
            r4.<init>(r8, r9, r3)
            goto L16
        La3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lab:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lb1:
            java.lang.String r1 = "Trying to update draft, but draft is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A03(X.BCl, com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.1Ds, X.0sJ, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r17, com.instagram.music.common.model.AudioOverlayTrack r18, java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            r5 = r18
            r3 = 13
            r4 = r20
            boolean r0 = X.MAP.A02(r4, r3)
            r7 = r17
            if (r0 == 0) goto Lb2
            r6 = r4
            X.MAP r6 = (X.MAP) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb2
            int r2 = r2 - r1
            r6.A00 = r2
        L1c:
            java.lang.Object r0 = r6.A05
            X.1JX r4 = X.C1JX.A02
            int r2 = r6.A00
            r3 = 0
            r1 = 1
            if (r2 == 0) goto L8f
            if (r2 != r1) goto Lb9
            java.lang.Object r2 = r6.A04
            X.0ps r2 = (X.C15370ps) r2
            java.lang.Object r8 = r6.A03
            com.instagram.music.common.model.DownloadedTrack r8 = (com.instagram.music.common.model.DownloadedTrack) r8
            java.lang.Object r1 = r6.A02
            X.0ps r1 = (X.C15370ps) r1
            java.lang.Object r5 = r6.A01
            com.instagram.music.common.model.AudioOverlayTrack r5 = (com.instagram.music.common.model.AudioOverlayTrack) r5
            X.AbstractC09560e7.A00(r0)
        L3b:
            r2.A00 = r0
            java.lang.Object r0 = r1.A00
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto Lc1
            if (r5 == 0) goto Lc1
            int r4 = r5.A03
            int r3 = r5.A02
            int r2 = r5.A04
            int r1 = r5.A01
            java.lang.String r12 = r5.A0B
            java.lang.String r13 = r5.A0A
            java.lang.String r14 = r5.A0E
            com.instagram.music.common.model.MusicBrowseCategory r11 = r5.A09
            com.instagram.music.common.model.MusicAssetModel r10 = r5.A08
            int r7 = r8.A01
            r6 = -1
            if (r7 == r6) goto L82
            int r6 = r8.A00
            java.lang.String r0 = r0.getPath()
            X.C14360o3.A07(r0)
            com.instagram.music.common.model.DownloadedTrack r8 = new com.instagram.music.common.model.DownloadedTrack
            r8.<init>(r0, r7, r6)
        L6a:
            X.8Jt r7 = r5.A05
            float r0 = r5.A00
            java.lang.String r15 = r5.A0C
            com.instagram.music.common.model.InstagramAudioApplySource r9 = r5.A07
            com.instagram.music.common.model.AudioOverlayTrack r6 = new com.instagram.music.common.model.AudioOverlayTrack
            r20 = r1
            r19 = r2
            r18 = r3
            r17 = r4
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r6
        L82:
            java.lang.String r0 = r0.getPath()
            X.C14360o3.A07(r0)
            com.instagram.music.common.model.DownloadedTrack r8 = new com.instagram.music.common.model.DownloadedTrack
            r8.<init>(r0, r6, r6)
            goto L6a
        L8f:
            X.AbstractC09560e7.A00(r0)
            X.0ps r2 = new X.0ps
            r2.<init>()
            com.instagram.music.common.model.DownloadedTrack r8 = r5.A06
            if (r8 == 0) goto Lc1
            java.lang.String r0 = r8.A02
            r6.A01 = r5
            r6.A02 = r2
            r6.A03 = r8
            r6.A04 = r2
            r6.A00 = r1
            r1 = r19
            java.lang.Object r0 = A05(r7, r0, r1, r6)
            if (r0 != r4) goto Lb0
            return r4
        Lb0:
            r1 = r2
            goto L3b
        Lb2:
            X.MAP r6 = new X.MAP
            r6.<init>(r7, r4, r3)
            goto L1c
        Lb9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lc1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, com.instagram.music.common.model.AudioOverlayTrack, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r11, java.lang.String r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r3 = 43
            boolean r0 = X.MAO.A02(r14, r3)
            if (r0 == 0) goto L83
            r4 = r14
            X.MAO r4 = (X.MAO) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r10 = 0
            r5 = 1
            if (r0 == 0) goto L30
            if (r0 != r5) goto L8a
            java.lang.Object r8 = r4.A02
            X.0oO r8 = (X.C14510oO) r8
            java.lang.Object r9 = r4.A01
            X.AbstractC09560e7.A00(r1)
        L2b:
            boolean r0 = r8.A00
            if (r0 == 0) goto L89
            return r9
        L30:
            X.AbstractC09560e7.A00(r1)
            java.io.File r7 = new java.io.File
            r7.<init>(r12)
            X.2Pt r0 = r11.A07
            java.io.File r0 = r0.A01()
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r13)
            r2.mkdirs()
            java.lang.String r0 = "audio"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            r1.mkdirs()
            java.lang.String r0 = r7.getName()
            java.io.File r9 = new java.io.File
            r9.<init>(r1, r0)
            boolean r0 = r9.exists()
            if (r0 == 0) goto L60
            return r9
        L60:
            X.0oO r8 = new X.0oO
            r8.<init>()
            X.12L r2 = X.C12L.A00
            r1 = 465496004(0x1bbee7c4, float:3.1582638E-22)
            r0 = 2
            X.0nZ r0 = r2.AOT(r1, r0)
            r11 = 40
            X.MC7 r6 = new X.MC7
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A01 = r9
            r4.A02 = r8
            r4.A00 = r5
            java.lang.Object r0 = X.AbstractC23641Du.A00(r4, r0, r6)
            if (r0 != r3) goto L2b
            return r3
        L83:
            X.MAO r4 = new X.MAO
            r4.<init>(r11, r14, r3)
            goto L16
        L89:
            return r10
        L8a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A05(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 21
            boolean r0 = X.C9CY.A00(r7, r3)
            if (r0 == 0) goto L65
            r5 = r7
            X.9CY r5 = (X.C9CY) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 == r2) goto L49
            if (r1 != r3) goto L6b
            java.lang.Object r6 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.AbstractC09560e7.A00(r0)
        L2b:
            if (r0 == 0) goto L34
            X.8ZT r1 = new X.8ZT
            r1.<init>(r0)
            r6.A00 = r1
        L34:
            X.0eB r4 = X.C0eB.A00
            return r4
        L37:
            X.AbstractC09560e7.A00(r0)
            X.5JK r1 = X.C5JK.A05
            r5.A01 = r6
            r5.A00 = r2
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r0 = r6.A05
            java.lang.Object r0 = r0.A04(r1, r5)
            if (r0 != r4) goto L50
            return r4
        L49:
            java.lang.Object r6 = r5.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r6
            X.AbstractC09560e7.A00(r0)
        L50:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            X.5JK r0 = X.C5JK.A05
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r0 = r6.A0E(r0, r5)
            if (r0 != r4) goto L2b
            return r4
        L65:
            X.9CY r5 = new X.9CY
            r5.<init>(r6, r7, r3)
            goto L16
        L6b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A06(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.5Kv, java.lang.Object] */
    public static final void A07(UserSession userSession, C128175qm c128175qm, ClipsDraftRepository clipsDraftRepository, C47Z c47z) {
        C5Kv c5Kv;
        PendingMediaStore pendingMediaStore = clipsDraftRepository.A06;
        C47Z A03 = pendingMediaStore.A03(c128175qm.A0i);
        if (A03 != null) {
            String str = c128175qm.A0V;
            if (str != null) {
                File file = new File(str);
                if (file.exists() && file.canRead() && file.length() > 0) {
                    A03.A33 = str;
                } else {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("cover photo file path is not accessible. path=%s exists=%s canRead=%s file size=%s", str, Boolean.valueOf(file.exists()), Boolean.valueOf(file.canRead()), Long.valueOf(file.length()));
                    C14360o3.A07(formatStrLocaleSafe);
                    AbstractC12120kG.A07("apply_draft_files_to_pending_media_error", formatStrLocaleSafe, null);
                }
            }
            C5Kv c5Kv2 = A03.A1O;
            String str2 = c128175qm.A0T;
            if (c5Kv2 == null) {
                ?? obj = new Object();
                obj.A03 = str2;
                obj.A01 = null;
                obj.A00 = null;
                obj.A02 = null;
                c5Kv = obj;
            } else {
                c5Kv2.A03 = str2;
                c5Kv = c5Kv2;
            }
            A03.A1O = c5Kv;
            A03.A2Z = c128175qm.A0S;
            A03.A2w = c128175qm.A0X;
            if (A03.A1P != null && C18U.A06(C06090Tz.A05, userSession, 36317929922500308L)) {
                A03.A1P = null;
            }
            A03.A0r = null;
            AbstractC226959zr.A00(clipsDraftRepository.A09, userSession, c128175qm, A03, clipsDraftRepository.A07);
            if (c47z != null && A03.A4a == null) {
                A03.A4a = c47z.A4a;
            }
            pendingMediaStore.A0D(A03, A03.A35);
        }
    }

    private final boolean A08(C128175qm c128175qm, C128175qm c128175qm2) {
        if (this.A0D) {
            C14360o3.A0B(c128175qm, 0);
            C14360o3.A0B(c128175qm2, 1);
            if (C14360o3.A0K(c128175qm.A0T, c128175qm2.A0T) && c128175qm.A0G == EnumC50651MXr.A03 && c128175qm2.A0G == EnumC50651MXr.A02) {
                AbstractC12120kG.A07("ClipsDraftRepository", AnonymousClass001.A0R("ClipsDraft update validation error: ", "INVALID_DRAFT_STATE_CHANGE"), null);
                return false;
            }
            return true;
        }
        return true;
    }

    public final C128175qm A09() {
        AbstractC193598he abstractC193598he;
        Object A02 = this.A02.A02();
        if (!(A02 instanceof C8ZT) || (abstractC193598he = (AbstractC193598he) A02) == null) {
            return null;
        }
        return (C128175qm) abstractC193598he.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0093, code lost:
    
        if (r18.A0D != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0286 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212  */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.0ps] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0116 -> B:59:0x013a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B(X.C128175qm r19, X.InterfaceC25188BCl r20, X.InterfaceC23621Ds r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0B(X.5qm, X.BCl, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0C(X.C128175qm r8, X.InterfaceC23621Ds r9) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0C(X.5qm, X.1Ds):java.lang.Object");
    }

    public final Object A0D(C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        ClipsDraftLocalDataSource clipsDraftLocalDataSource = this.A05;
        C115475Kh c115475Kh = (C115475Kh) AbstractC001800i.A0J(c128175qm.A0v);
        if (c115475Kh == null || (str = c115475Kh.A0G.A0F) == null) {
            return null;
        }
        if (C18U.A06(C06090Tz.A05, clipsDraftLocalDataSource.A00, 36323521969990974L)) {
            Object A00 = AbstractC23641Du.A00(interfaceC23621Ds, C12L.A00.CPG(480314591, 3), new ClipsDraftLocalDataSource$getTempCoverImage$2$1(str, null));
            C1JX c1jx = C1JX.A02;
            return A00;
        }
        return AbstractC209669Pc.A01(str, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0E(X.C5JK r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 19
            boolean r0 = X.C9CY.A00(r7, r3)
            if (r0 == 0) goto L48
            r4 = r7
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L50
            java.lang.Object r0 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r0
            X.AbstractC09560e7.A00(r3)
        L28:
            X.5qm r3 = (X.C128175qm) r3
            if (r3 == 0) goto L4e
            X.8hh r0 = r0.A0C
            java.util.Map r1 = r0.A01
            java.lang.String r0 = r3.A0T
            r1.put(r0, r3)
            return r3
        L36:
            X.AbstractC09560e7.A00(r3)
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r0 = r5.A05
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r6, r4)
            if (r3 != r2) goto L46
            return r2
        L46:
            r0 = r5
            goto L28
        L48:
            X.9CY r4 = new X.9CY
            r4.<init>(r5, r7, r3)
            goto L16
        L4e:
            r3 = 0
            return r3
        L50:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0E(X.5JK, X.1Ds):java.lang.Object");
    }

    public final Object A0G(BC2 bc2, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        Object A01;
        if (z) {
            A01 = A02(bc2, this, interfaceC23621Ds);
        } else {
            A01 = A01(bc2, this, interfaceC23621Ds);
        }
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (X.MY4.A04(r1) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0H(X.OVo r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C89563yw.A01
            X.1Ds r0 = X.C1E2.A02(r10)
            X.3yw r10 = new X.3yw
            r10.<init>(r0)
            com.instagram.common.session.UserSession r2 = r7.A03
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36327297246771693(0x810f7c000b39ed, double:3.036867284918764E-306)
            boolean r4 = X.C18U.A06(r3, r2, r0)
            X.8hh r0 = r7.A0C     // Catch: java.lang.Exception -> Lda
            X.5qm r6 = r0.A00(r9)     // Catch: java.lang.Exception -> Lda
            if (r6 != 0) goto L3f
            java.lang.Integer r0 = X.C05F.A00
            X.O7P r1 = new X.O7P
            r1.<init>(r6, r0)
            X.8jk r0 = new X.8jk
            r0.<init>(r1)
            r10.resumeWith(r0)
            X.8Bh r2 = X.AbstractC183338Bg.A00(r2)
            java.lang.String r1 = "clipsDraftRepository"
            r0 = 351(0x15f, float:4.92E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r2.A0O(r1, r0)
            goto L55
        L3f:
            X.8hi r0 = r7.A0B
            java.lang.String r3 = r6.A0i
            if (r3 != 0) goto L8c
            java.lang.Integer r5 = X.C05F.A00
        L47:
            if (r5 != 0) goto L5a
            r0 = 0
            A07(r2, r6, r7, r0)
            X.3NX r0 = new X.3NX
            r0.<init>(r6)
            r10.resumeWith(r0)
        L55:
            java.lang.Object r0 = r10.A00()
            return r0
        L5a:
            X.8Bh r1 = X.AbstractC183338Bg.A00(r2)
            int r0 = r5.intValue()
            switch(r0) {
                case 1: goto L83;
                case 2: goto L86;
                case 3: goto L89;
                default: goto L65;
            }
        L65:
            java.lang.String r5 = "no_pending_media_id"
        L67:
            X.24Q r4 = r1.A0K
            long r0 = r1.A01
            java.lang.String r2 = "sharesheet_validation_error"
            r4.A09(r0, r2, r5)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = r7.A06
            java.lang.String r0 = java.lang.String.valueOf(r3)
            X.47Z r9 = r1.A04(r0, r5)
            X.P0E r5 = new X.P0E
            r5.<init>(r6, r7, r8, r9, r10)
            r8.A01(r6, r5)
            goto L55
        L83:
            java.lang.String r5 = "stitched_video_file_missing"
            goto L67
        L86:
            java.lang.String r5 = "audio_track_file_missing"
            goto L67
        L89:
            java.lang.String r5 = "audio_track_file_invalid"
            goto L67
        L8c:
            r5 = 0
            if (r4 != 0) goto Lb4
            com.instagram.pendingmedia.store.PendingMediaStore r0 = r0.A00
            X.47Z r0 = r0.A03(r3)
            if (r0 == 0) goto Lb1
            com.instagram.pendingmedia.model.ClipInfo r0 = r0.A1N
            if (r0 == 0) goto Lb1
            java.lang.String r1 = r0.A0F
            if (r1 == 0) goto Lb1
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto Lb1
            boolean r0 = X.MY4.A04(r1)
            if (r0 != 0) goto Lb4
            goto L47
        Lb1:
            java.lang.Integer r5 = X.C05F.A01
            goto L47
        Lb4:
            java.util.List r0 = r6.A0p
            if (r0 == 0) goto Ld0
            java.util.Iterator r1 = r0.iterator()
        Lbc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r1.next()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            java.lang.Integer r0 = X.C193628hi.A00(r0, r4)
            if (r0 == 0) goto Lbc
            r5 = r0
            goto Lbc
        Ld0:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r6.A0N
            if (r0 == 0) goto L47
            java.lang.Integer r5 = X.C193628hi.A00(r0, r4)
            goto L47
        Lda:
            r3 = move-exception
            X.8Bh r2 = X.AbstractC183338Bg.A00(r2)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = r0.getSimpleName()
            X.C14360o3.A07(r1)
            java.lang.String r0 = r3.getMessage()
            r2.A0O(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0H(X.OVo, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0eB A0J(X.C128175qm r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 20
            boolean r0 = X.C9CY.A00(r7, r3)
            if (r0 == 0) goto L61
            r4 = r7
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L44
            if (r0 != r3) goto L67
            java.lang.Object r2 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r2
            X.AbstractC09560e7.A00(r1)
        L26:
            X.2GS r1 = r2.A02
            X.8hk r0 = X.C193648hk.A00
            r1.A0A(r0)
            r0 = 0
            r2.A01 = r0
            com.instagram.common.session.UserSession r1 = r2.A03
            X.75B r0 = X.C8KG.A00(r1)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L41
            X.2Pt r0 = r2.A07
            X.AMc.A05(r1, r0)
        L41:
            X.0eB r0 = X.C0eB.A00
            return r0
        L44:
            X.AbstractC09560e7.A00(r1)
            X.8hh r1 = r5.A0C
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            java.util.Map r0 = r1.A01
            java.lang.String r2 = r6.A0T
            r0.remove(r2)
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r1 = r5.A05
            r4.A01 = r5
            r4.A00 = r3
            X.5JK r0 = r6.A0H
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A00(r0, r1, r2)
            r2 = r5
            goto L26
        L61:
            X.9CY r4 = new X.9CY
            r4.<init>(r5, r7, r3)
            goto L16
        L67:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0J(X.5qm, X.1Ds):X.0eB");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0eB A0K(X.C128175qm r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 39
            boolean r0 = X.MAG.A01(r7, r3)
            if (r0 == 0) goto L57
            r4 = r7
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L3a
            if (r0 != r3) goto L5d
            java.lang.Object r2 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r2
            X.AbstractC09560e7.A00(r1)
        L26:
            com.instagram.common.session.UserSession r1 = r2.A03
            X.75B r0 = X.C8KG.A00(r1)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L37
            X.2Pt r0 = r2.A07
            X.AMc.A05(r1, r0)
        L37:
            X.0eB r0 = X.C0eB.A00
            return r0
        L3a:
            X.AbstractC09560e7.A00(r1)
            X.8hh r1 = r5.A0C
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            java.util.Map r0 = r1.A01
            java.lang.String r2 = r6.A0T
            r0.remove(r2)
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r1 = r5.A05
            r4.A01 = r5
            r4.A00 = r3
            X.5JK r0 = r6.A0H
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A00(r0, r1, r2)
            r2 = r5
            goto L26
        L57:
            X.MAG r4 = new X.MAG
            r4.<init>(r5, r7, r3)
            goto L16
        L5d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository.A0K(X.5qm, X.1Ds):X.0eB");
    }

    public final void A0L() {
        this.A02.A0B(C193588hd.A00);
        this.A01 = null;
        this.A04.A00();
    }

    public final void A0M(C128175qm c128175qm) {
        this.A0C.A01.remove(c128175qm.A0T);
        A0P(C5JK.A05, null);
        this.A04.A00();
    }
}
