package com.instagram.igtv.uploadflow.upload;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC43593JPy;
import X.AbstractC52922bZ;
import X.AbstractC53477Nl4;
import X.AbstractC58242lg;
import X.AnonymousClass191;
import X.C05A;
import X.C10E;
import X.C14360o3;
import X.C1XM;
import X.C22P;
import X.C23031Ai;
import X.C2GS;
import X.C2GT;
import X.C47Z;
import X.C51649Mrg;
import X.C51661Mrs;
import X.C51667Mry;
import X.C51669Ms0;
import X.C51715Msk;
import X.C51737MtK;
import X.C54037Nun;
import X.C54741OFs;
import X.C55042OZo;
import X.C57375PdZ;
import X.C57551PgP;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC58204PrA;
import X.JQ0;
import X.MSW;
import X.NND;
import X.NNE;
import X.O3M;
import X.O80;
import X.OAK;
import X.OKf;
import X.P45;
import X.PZP;
import android.graphics.RectF;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class IGTVUploadViewModel extends AbstractC52922bZ implements InterfaceC11380iw, InterfaceC58204PrA {
    public static final long A0N = AbstractC43593JPy.A09(TimeUnit.DAYS);
    public C22P A00;
    public AbstractC53477Nl4 A01;
    public boolean A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GS A05;
    public final UserSession A06;
    public final OAK A07;
    public final C55042OZo A08;
    public final OKf A09;
    public final O3M A0A;
    public final String A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final C05A A0J;
    public final C54037Nun A0K;
    public final C23031Ai A0L;
    public final /* synthetic */ P45 A0M;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if (r6.equals(X.NN7.A00) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r6.equals(r0) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r6.equals(X.NN6.A00) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.InterfaceC60442pS r5, java.lang.Object r6) {
        /*
            r4 = this;
            r2 = 0
            X.OZo r1 = r4.A08
            boolean r0 = r1.A02
            if (r0 == 0) goto Lb
            boolean r0 = r6 instanceof X.C52528NMa
            if (r0 != 0) goto L27
        Lb:
            if (r5 == 0) goto L27
            X.NX0 r0 = r1.A07
            android.util.Pair r0 = r0.A00
            java.lang.Object r3 = r0.first
            X.C14360o3.A07(r3)
            boolean r0 = r3 instanceof X.C56422P3j
            if (r0 == 0) goto L38
            X.NN7 r0 = X.NN7.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L80
        L22:
            X.0do r0 = r1.A0A
            r0.getValue()
        L27:
            r1.A02 = r2
            X.NX0 r1 = r1.A07
            r1.A04(r6)
            boolean r0 = r6 instanceof X.InterfaceC57823Pkp
            if (r0 == 0) goto L37
            X.OSA r0 = X.OSA.A00
            r1.A04(r0)
        L37:
            return
        L38:
            boolean r0 = r3 instanceof X.C56433P3u
            if (r0 != 0) goto L80
            boolean r0 = r3 instanceof X.C56416P3d
            if (r0 != 0) goto L65
            X.P3g r0 = X.C56419P3g.A00
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L65
            boolean r0 = r3 instanceof X.C56424P3l
            if (r0 == 0) goto L68
            X.NMk r0 = X.C52538NMk.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L22
            X.NMj r0 = X.C52537NMj.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L22
            X.NMl r0 = X.C52539NMl.A00
        L5e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L27
            goto L22
        L65:
            X.NMo r0 = X.C52542NMo.A00
            goto L5e
        L68:
            boolean r0 = r3 instanceof X.C56417P3e
            if (r0 != 0) goto L70
            boolean r0 = r3 instanceof X.C56420P3h
            if (r0 == 0) goto L27
        L70:
            X.NN5 r0 = X.NN5.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L22
            X.NN6 r0 = X.NN6.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L22
        L80:
            X.NMa r0 = X.C52528NMa.A00
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel.A04(X.2pS, java.lang.Object):void");
    }

    @Override // X.InterfaceC58204PrA
    public final void EbD(float f) {
        this.A0M.EbD(f);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "IGTVUploadInteractor";
    }

    @Override // X.InterfaceC58204PrA
    public final void setTitle(String str) {
        C14360o3.A0B(str, 0);
        this.A0M.A0N = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[Catch: 470 -> 0x00a7, TryCatch #0 {470 -> 0x00a7, blocks: (B:11:0x0048, B:12:0x004b, B:13:0x0054, B:15:0x005b, B:21:0x0073, B:23:0x0089, B:25:0x008d, B:26:0x0091, B:29:0x00a0, B:17:0x006e, B:30:0x00a4, B:36:0x0032), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[EDGE_INSN: B:32:0x00a4->B:30:0x00a4 BREAK  A[LOOP:0: B:13:0x0054->B:17:0x006e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r5, java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 43
            boolean r0 = X.MAK.A01(r7, r3)
            if (r0 == 0) goto L24
            r4 = r7
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L2a
            java.lang.Object r6 = r4.A02
            goto L48
        L24:
            X.MAK r4 = new X.MAK
            r4.<init>(r5, r7, r3)
            goto L16
        L2a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2f:
            X.AbstractC09560e7.A00(r1)
            X.0do r0 = r5.A0G     // Catch: X.AnonymousClass470 -> La7
            java.lang.Object r1 = r0.getValue()     // Catch: X.AnonymousClass470 -> La7
            com.instagram.igtv.repository.series.IGTVSeriesRepository r1 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r1     // Catch: X.AnonymousClass470 -> La7
            com.instagram.common.session.UserSession r0 = r5.A06     // Catch: X.AnonymousClass470 -> La7
            java.lang.String r0 = r0.userId     // Catch: X.AnonymousClass470 -> La7
            X.AbstractC31172DnG.A1V(r5, r6, r4, r2)     // Catch: X.AnonymousClass470 -> La7
            java.lang.Object r1 = r1.A05(r0, r4)     // Catch: X.AnonymousClass470 -> La7
            if (r1 != r3) goto L4b
            return r3
        L48:
            X.AbstractC09560e7.A00(r1)     // Catch: X.AnonymousClass470 -> La7
        L4b:
            X.EBf r1 = (X.C32158EBf) r1     // Catch: X.AnonymousClass470 -> La7
            java.util.List r3 = r1.A00     // Catch: X.AnonymousClass470 -> La7
            r5 = 0
            java.util.Iterator r2 = r3.iterator()     // Catch: X.AnonymousClass470 -> La7
        L54:
            boolean r0 = r2.hasNext()     // Catch: X.AnonymousClass470 -> La7
            r1 = -1
            if (r0 == 0) goto La4
            java.lang.Object r0 = r2.next()     // Catch: X.AnonymousClass470 -> La7
            X.HAw r0 = (X.C38900HAw) r0     // Catch: X.AnonymousClass470 -> La7
            java.lang.String r0 = r0.A03     // Catch: X.AnonymousClass470 -> La7
            java.lang.String r0 = X.OZN.A02(r0)     // Catch: X.AnonymousClass470 -> La7
            boolean r0 = X.C14360o3.A0K(r0, r6)     // Catch: X.AnonymousClass470 -> La7
            if (r0 == 0) goto L6e
            goto L71
        L6e:
            int r5 = r5 + 1
            goto L54
        L71:
            if (r5 == r1) goto La4
            java.lang.Object r4 = r3.get(r5)     // Catch: X.AnonymousClass470 -> La7
            X.HAw r4 = (X.C38900HAw) r4     // Catch: X.AnonymousClass470 -> La7
            java.lang.String r3 = r4.A03     // Catch: X.AnonymousClass470 -> La7
            X.C14360o3.A07(r3)     // Catch: X.AnonymousClass470 -> La7
            java.lang.String r2 = r4.A08     // Catch: X.AnonymousClass470 -> La7
            X.C14360o3.A07(r2)     // Catch: X.AnonymousClass470 -> La7
            X.Hdx r1 = r4.A00     // Catch: X.AnonymousClass470 -> La7
            X.Hdx r0 = X.EnumC39587Hdx.A0A     // Catch: X.AnonymousClass470 -> La7
            if (r1 != r0) goto La0
            java.util.List r0 = r4.A0B     // Catch: X.AnonymousClass470 -> La7
            if (r0 != 0) goto L91
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()     // Catch: X.AnonymousClass470 -> La7
        L91:
            int r1 = r0.size()     // Catch: X.AnonymousClass470 -> La7
            X.OTv r0 = new X.OTv     // Catch: X.AnonymousClass470 -> La7
            r0.<init>(r5, r1, r3, r2)     // Catch: X.AnonymousClass470 -> La7
            X.NNG r3 = new X.NNG     // Catch: X.AnonymousClass470 -> La7
            r3.<init>(r0)     // Catch: X.AnonymousClass470 -> La7
            goto La3
        La0:
            java.util.List r0 = r4.A0A     // Catch: X.AnonymousClass470 -> La7
            goto L91
        La3:
            return r3
        La4:
            X.NNH r3 = X.NNH.A00     // Catch: X.AnonymousClass470 -> La7
            return r3
        La7:
            r1 = move-exception
            java.lang.String r0 = "IGTVUploadInteractor"
            r1.A00(r0)
            X.NNI r3 = X.NNI.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel.A00(com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final C51649Mrg A01(String str) {
        int i;
        long currentTimeMillis;
        RectF rectF;
        NNE A02 = A02();
        C14360o3.A0B(A02, 0);
        P45 p45 = this.A0M;
        O80 o80 = p45.A0C;
        if (o80 != null) {
            i = o80.A00;
            currentTimeMillis = o80.A01;
        } else {
            i = -1;
            currentTimeMillis = System.currentTimeMillis();
        }
        Medium medium = A02.A00;
        String str2 = medium.A0X;
        int i2 = medium.A07;
        C47Z c47z = A02.A02;
        C51667Mry c51667Mry = new C51667Mry(str2, i2, c47z.A0H, c47z.A0G, A02.A02());
        String str3 = p45.A0N;
        String str4 = p45.A0H;
        C51737MtK A0d = AbstractC25225BEi.A0d(p45.A05, p45.A06, 19);
        C51661Mrs c51661Mrs = new C51661Mrs(0, c47z.A02, c47z.A5x);
        C51669Ms0 c51669Ms0 = new C51669Ms0(p45.A0J, p45.A04, p45.A03, p45.A02, p45.A0Y, p45.A0Z);
        MediaCroppingCoordinates mediaCroppingCoordinates = p45.A09;
        RectF rectF2 = null;
        if (mediaCroppingCoordinates != null) {
            rectF = new RectF(mediaCroppingCoordinates.A01, mediaCroppingCoordinates.A03, mediaCroppingCoordinates.A02, mediaCroppingCoordinates.A00);
        } else {
            rectF = null;
        }
        MediaCroppingCoordinates mediaCroppingCoordinates2 = p45.A0A;
        if (mediaCroppingCoordinates2 != null) {
            rectF2 = new RectF(mediaCroppingCoordinates2.A01, mediaCroppingCoordinates2.A03, mediaCroppingCoordinates2.A02, mediaCroppingCoordinates2.A00);
        }
        boolean z = p45.A0b;
        String str5 = p45.A0M;
        boolean z2 = p45.A0h;
        boolean z3 = p45.A0Q;
        boolean z4 = p45.A0R;
        boolean z5 = p45.A0a;
        boolean z6 = p45.A0f;
        List list = p45.A0O;
        if (list == null) {
            list = AbstractC166987dD.A1E();
        }
        return new C51649Mrg(rectF, rectF2, A0d, c51661Mrs, new C51715Msk(p45.A08, list, z3, z4, z5, z6, p45.A0T, p45.A0e), c51669Ms0, c51667Mry, p45.A0B, str3, str4, str5, str, i, currentTimeMillis, true, z, z2, true);
    }

    public final NNE A02() {
        AbstractC53477Nl4 abstractC53477Nl4 = this.A01;
        C14360o3.A0C(abstractC53477Nl4, "null cannot be cast to non-null type com.instagram.igtv.uploadflow.upload.IGTVUploadAsset.ValidUploadAsset");
        return (NNE) abstractC53477Nl4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(int r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel.A03(int, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r3.A2q == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C54741OFs r11) {
        /*
            r10 = this;
            X.P45 r2 = r10.A0M
            r2.A0D = r11
            com.instagram.common.session.UserSession r0 = r10.A06
            r6 = 0
            r9 = 1
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.C25A.A00(r0)
            java.lang.String r0 = r11.A0C
            X.47Z r3 = r1.A03(r0)
            if (r3 != 0) goto L3a
            X.47Z r3 = X.AbstractC209399Nx.A01(r0)
            java.lang.String r0 = r11.A09
            r3.A2U = r0
            long r0 = r11.A08
            r3.A0a = r0
            boolean r0 = r11.A0H
            r3.A5x = r0
            java.util.ArrayList r0 = r11.A02
            r3.A4C = r0
            boolean r0 = X.AbstractC25226BEj.A1b(r0)
            r3.A5i = r0
            int r0 = r11.A01
            r3.A0H = r0
            int r0 = r11.A00
            r3.A0G = r0
            int r0 = r11.A07
            r3.A07 = r0
        L3a:
            java.lang.String r0 = r3.A3o
            if (r0 != 0) goto L40
            java.lang.String r0 = r2.A0N
        L40:
            r2.setTitle(r0)
            java.lang.String r0 = r3.A2Z
            if (r0 != 0) goto L49
            java.lang.String r0 = r2.A0H
        L49:
            r2.ERB(r0)
            boolean r0 = r3.A5M
            r2.A0Y = r0
            boolean r0 = r3.A5L
            r2.A0Z = r0
            int r0 = r3.A05
            r2.A02 = r0
            int r0 = r3.A07
            r2.A01 = r0
            java.lang.String r0 = r3.A33
            r2.A0J = r0
            X.OFs r1 = r2.A0D
            if (r1 == 0) goto Lb0
            int r0 = r3.A0H
        L66:
            r2.A04 = r0
            if (r1 == 0) goto Lad
            int r0 = r3.A0G
        L6c:
            r2.A03 = r0
            java.util.List r0 = r3.A4C
            r2.A0O = r0
            boolean r0 = r3.A5i
            r2.A0f = r0
            com.instagram.api.schemas.BrandedContentGatingInfo r0 = r3.A0s
            r2.A07 = r0
            com.instagram.api.schemas.BrandedContentProjectMetadata r0 = r3.A0t
            r2.A08 = r0
            boolean r0 = r3.A5Z
            r2.A0b = r0
            X.3bi r1 = r3.A1F
            X.3bi r0 = X.EnumC76383bi.A07
            if (r1 != r0) goto L8d
            java.lang.String r1 = r3.A2q
            r0 = 1
            if (r1 != 0) goto L8e
        L8d:
            r0 = 0
        L8e:
            r2.A0U = r0
            java.lang.String r4 = r3.A35
            r5 = 0
            r7 = r6
            r8 = r6
            com.instagram.common.gallery.Medium r1 = X.C8IU.A04(r4, r5, r6, r7, r8, r9)
            X.NNE r0 = new X.NNE
            r0.<init>(r1, r10, r3, r9)
            r10.A01 = r0
            boolean r0 = r11.A05
            r2.A0b = r0
            boolean r0 = r11.A06
            r2.A0c = r0
            boolean r0 = r11.A04
            r2.A0U = r0
            return
        Lad:
            int r0 = r3.A0B
            goto L6c
        Lb0:
            int r0 = r3.A0C
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel.A05(X.OFs):void");
    }

    public final boolean A06() {
        return AbstractC167007dF.A1X(this.A00, C22P.A3B);
    }

    @Override // X.InterfaceC58204PrA
    public final boolean Aca() {
        return this.A0M.A0Q;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean Acb() {
        return this.A0M.A0R;
    }

    @Override // X.InterfaceC58204PrA
    public final BrandedContentProjectMetadataIntf Ai4() {
        return this.A0M.A08;
    }

    @Override // X.InterfaceC58204PrA
    public final List Ai7() {
        return this.A0M.A0O;
    }

    @Override // X.InterfaceC58204PrA
    public final String Alc() {
        return this.A0M.A0H;
    }

    @Override // X.InterfaceC58204PrA
    public final int AsK() {
        return this.A0M.A02;
    }

    @Override // X.InterfaceC58204PrA
    public final int AsL() {
        return this.A0M.A03;
    }

    @Override // X.InterfaceC58204PrA
    public final int AsO() {
        return this.A0M.A04;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean B2r() {
        return this.A0M.A0U;
    }

    @Override // X.InterfaceC58204PrA
    public final String B2w() {
        return this.A0M.A0L;
    }

    @Override // X.InterfaceC58204PrA
    public final MediaCroppingCoordinates B5v() {
        return this.A0M.A09;
    }

    @Override // X.InterfaceC58204PrA
    public final int B6Q() {
        return this.A0M.A05;
    }

    @Override // X.InterfaceC58204PrA
    public final int B6S() {
        return this.A0M.A06;
    }

    @Override // X.InterfaceC58204PrA
    public final BrandedContentGatingInfoIntf BQl() {
        return this.A0M.A07;
    }

    @Override // X.InterfaceC58204PrA
    public final NewFundraiserInfo BWi() {
        return this.A0M.A0E;
    }

    @Override // X.InterfaceC58204PrA
    public final List BcK() {
        return this.A0M.A0P;
    }

    @Override // X.InterfaceC58204PrA
    public final float Bes() {
        return this.A0M.A00;
    }

    @Override // X.InterfaceC58204PrA
    public final C54741OFs Bf0() {
        return this.A0M.A0D;
    }

    @Override // X.InterfaceC58204PrA
    public final C2GS Bf1() {
        return this.A0M.A0j;
    }

    @Override // X.InterfaceC58204PrA
    public final MediaCroppingCoordinates Bhh() {
        return this.A0M.A0A;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean BuK() {
        return this.A0M.A0h;
    }

    @Override // X.InterfaceC58204PrA
    public final IGTVShoppingMetadata Buk() {
        return this.A0M.A0B;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean CRp() {
        return this.A0M.A0Z;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean CVG() {
        return this.A0M.A0a;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean CXE() {
        return this.A0M.A0d;
    }

    @Override // X.InterfaceC58204PrA
    public final void EQV(BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf) {
        this.A0M.A08 = brandedContentProjectMetadataIntf;
    }

    @Override // X.InterfaceC58204PrA
    public final void EQW(List list) {
        this.A0M.A0O = list;
    }

    @Override // X.InterfaceC58204PrA
    public final void ERB(String str) {
        this.A0M.A0H = str;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESG(boolean z) {
        this.A0M.A0Y = z;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESH(String str) {
        this.A0M.A0J = str;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESI(boolean z) {
        this.A0M.A0Z = z;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESJ(int i) {
        this.A0M.A02 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESK(int i) {
        this.A0M.A03 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESN(int i) {
        this.A0M.A04 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void EUX(int i) {
        this.A0M.A05 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void EUZ(int i) {
        this.A0M.A06 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void EWs(boolean z) {
        this.A0M.A0d = z;
    }

    @Override // X.InterfaceC58204PrA
    public final void EaU(boolean z) {
        this.A0M.A0f = z;
    }

    @Override // X.InterfaceC58204PrA
    public final void Eae(List list) {
        this.A0M.A0P = list;
    }

    @Override // X.InterfaceC58204PrA
    public final void Edr(boolean z) {
        this.A0M.A0h = z;
    }

    @Override // X.InterfaceC58204PrA
    public final String getTitle() {
        return this.A0M.A0N;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean isPaidPartnership() {
        return this.A0M.A0f;
    }

    public IGTVUploadViewModel(UserSession userSession, OAK oak, C55042OZo c55042OZo, OKf oKf, O3M o3m, C54037Nun c54037Nun, C23031Ai c23031Ai, String str) {
        JQ0.A1O(str, userSession, c55042OZo, o3m, oak);
        AbstractC167007dF.A1J(oKf, 6, c23031Ai);
        this.A0M = new P45();
        this.A0B = str;
        this.A06 = userSession;
        this.A08 = c55042OZo;
        this.A0A = o3m;
        this.A07 = oak;
        this.A09 = oKf;
        this.A0K = c54037Nun;
        this.A0L = c23031Ai;
        this.A00 = C22P.A5N;
        this.A0I = C57551PgP.A01(this, 28);
        this.A01 = NND.A00;
        this.A04 = AbstractC58242lg.A00(AnonymousClass191.A00, new PZP(this, null, 8));
        C2GS A0E = MSW.A0E();
        this.A05 = A0E;
        this.A03 = A0E;
        this.A0C = C57551PgP.A01(this, 23);
        this.A0G = C57551PgP.A01(this, 26);
        this.A0F = C57551PgP.A01(this, 25);
        this.A0J = C10E.A00(ImmutableList.of());
        this.A0H = C57551PgP.A01(this, 27);
        this.A0D = C1XM.A00(C57375PdZ.A00);
        this.A0E = C57551PgP.A01(this, 24);
    }
}
