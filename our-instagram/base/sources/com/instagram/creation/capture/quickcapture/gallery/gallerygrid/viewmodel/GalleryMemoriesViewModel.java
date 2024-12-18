package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel;

import X.AbstractC141776au;
import X.AbstractC208910l;
import X.AbstractC25651Mw;
import X.AbstractC52922bZ;
import X.AnonymousClass059;
import X.AnonymousClass625;
import X.C008302x;
import X.C05F;
import X.C06090Tz;
import X.C0UO;
import X.C10E;
import X.C10I;
import X.C10M;
import X.C14360o3;
import X.C16400rl;
import X.C1810981l;
import X.C188758Xr;
import X.C18U;
import X.C1DX;
import X.C208509Kk;
import X.C3DH;
import X.C9BW;
import X.C9D3;
import X.InterfaceC06180Ui;
import X.InterfaceC19390xP;
import X.InterfaceC19630xq;
import X.InterfaceC73153Pq;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel$special$$inlined$map$1$2;
import com.instagram.reels.store.ReelStore;

/* loaded from: classes4.dex */
public final class GalleryMemoriesViewModel extends AbstractC52922bZ {
    public boolean A00;
    public final UserSession A01;
    public final C1DX A02;
    public final InterfaceC73153Pq A03;
    public final InterfaceC19630xq A04;
    public final InterfaceC06180Ui A05;
    public final C0UO A06;
    public final C1810981l A07;
    public final C188758Xr A08;
    public final ReelStore A09;
    public final InterfaceC19390xP A0A;

    public GalleryMemoriesViewModel(UserSession userSession, C1810981l c1810981l, C1DX c1dx, C188758Xr c188758Xr, InterfaceC73153Pq interfaceC73153Pq, InterfaceC19630xq interfaceC19630xq, ReelStore reelStore) {
        AnonymousClass059 A02;
        C14360o3.A0B(interfaceC73153Pq, 2);
        C14360o3.A0B(c1dx, 3);
        C14360o3.A0B(c188758Xr, 5);
        C14360o3.A0B(interfaceC19630xq, 6);
        C14360o3.A0B(c1810981l, 7);
        this.A01 = userSession;
        this.A03 = interfaceC73153Pq;
        this.A02 = c1dx;
        this.A09 = reelStore;
        this.A08 = c188758Xr;
        this.A04 = interfaceC19630xq;
        this.A07 = c1810981l;
        final C008302x A00 = new AnonymousClass625(AbstractC25651Mw.A00(userSession)).A00(C3DH.class);
        final C16400rl c16400rl = new C16400rl(new C9D3(this, null, 32), new InterfaceC19390xP(this) { // from class: X.8Xs
            public final /* synthetic */ GalleryMemoriesViewModel A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = A00.collect(new GalleryMemoriesViewModel$special$$inlined$map$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
        this.A0A = c16400rl;
        if (A02(this)) {
            InterfaceC19390xP interfaceC19390xP = new InterfaceC19390xP(this) { // from class: X.9Kg
                public final /* synthetic */ GalleryMemoriesViewModel A00;

                {
                    this.A00 = this;
                }

                @Override // X.InterfaceC19390xP
                public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                    return AbstractC167017dG.A0i(interfaceC23621Ds, c16400rl, new C9GT(12, interfaceC19960yQ, this.A00));
                }
            };
            A02 = AbstractC208910l.A01(new C9BW(7, (Object) null, A00(null, this, C05F.A01)), AbstractC141776au.A00(this), interfaceC19390xP, C10I.A00);
        } else {
            A02 = AbstractC208910l.A02(C10E.A00(new C9BW(7, (Object) null, A00(null, this, C05F.A01))));
        }
        this.A06 = A02;
        this.A05 = C10M.A00(C05F.A00, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (A02(r8) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r3 = r8.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (X.C188758Xr.A00(r3) != X.C05F.A01) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (((int) X.C18U.A01(X.C06090Tz.A05, r3, 36609128705759077L)) >= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r5 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r8.A00 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r8.A04.getInt("memories_gallery_nux_seen_count", 0) < ((int) X.C18U.A01(X.C06090Tz.A05, r8.A01, 36609128705431396L))) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        return new X.C188778Xt(r9, (int) X.C18U.A01(X.C06090Tz.A05, r8.A01, 36609128705759077L), r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0015, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8.A01, 36327653728992006L) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        if (r7.A03 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (A02(r8) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (X.C188758Xr.A00(r8.A01) == X.C05F.A01) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r4 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C188778Xt A00(X.C206189Bb r7, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r8, java.lang.Integer r9) {
        /*
            if (r7 == 0) goto L7
            java.lang.Object r0 = r7.A03
            r4 = 1
            if (r0 != 0) goto L17
        L7:
            r4 = 0
            com.instagram.common.session.UserSession r3 = r8.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327653728992006(0x810fcf000a3b06, double:3.0370927257103285E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L28
        L17:
            boolean r0 = A02(r8)
            if (r0 == 0) goto L28
            com.instagram.common.session.UserSession r0 = r8.A01
            java.lang.Integer r1 = X.C188758Xr.A00(r0)
            java.lang.Integer r0 = X.C05F.A01
            r5 = 1
            if (r1 == r0) goto L29
        L28:
            r5 = 0
        L29:
            if (r4 == 0) goto L4a
            boolean r0 = A02(r8)
            if (r0 == 0) goto L4a
            com.instagram.common.session.UserSession r3 = r8.A01
            java.lang.Integer r1 = X.C188758Xr.A00(r3)
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L4a
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36609128705759077(0x820fcf000b1765, double:3.2150986344265817E-306)
            long r1 = X.C18U.A01(r2, r3, r0)
            int r0 = (int) r1
            r6 = 1
            if (r0 >= 0) goto L4b
        L4a:
            r6 = 0
        L4b:
            if (r5 == 0) goto L6b
            boolean r0 = r8.A00
            if (r0 != 0) goto L6b
            X.0xq r2 = r8.A04
            java.lang.String r1 = "memories_gallery_nux_seen_count"
            r0 = 0
            int r4 = r2.getInt(r1, r0)
            com.instagram.common.session.UserSession r3 = r8.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36609128705431396(0x820fcf00061764, double:3.215098634219355E-306)
            long r1 = X.C18U.A01(r2, r3, r0)
            int r0 = (int) r1
            r7 = 1
            if (r4 < r0) goto L6c
        L6b:
            r7 = 0
        L6c:
            com.instagram.common.session.UserSession r3 = r8.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36609128705759077(0x820fcf000b1765, double:3.2150986344265817E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            int r4 = (int) r0
            X.8Xt r2 = new X.8Xt
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel.A00(X.9Bb, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel, java.lang.Integer):X.8Xt");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r2 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 34
            boolean r0 = X.MAG.A01(r6, r3)
            if (r0 == 0) goto L58
            r4 = r6
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 != r1) goto L5e
            java.lang.Object r5 = r4.A01
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r5 = (com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel) r5
            X.AbstractC09560e7.A00(r2)
        L28:
            X.9Bb r2 = (X.C206189Bb) r2
            java.lang.Object r2 = r2.A03
            X.1pE r2 = (X.C37771pE) r2
            if (r2 != 0) goto L32
            r0 = 0
            return r0
        L32:
            com.instagram.reels.store.ReelStore r1 = r5.A09
            java.lang.String r0 = r2.A1V
            com.instagram.model.reels.Reel r3 = r1.A0M(r0)
            if (r3 != 0) goto L57
            r0 = 0
            com.instagram.model.reels.Reel r3 = r1.A0I(r2, r0)
            return r3
        L42:
            X.AbstractC09560e7.A00(r2)
            X.3Pq r0 = r5.A03
            X.2Sb r0 = r0.Avd()
            r4.A01 = r5
            r4.A00 = r1
            X.198 r0 = (X.AnonymousClass198) r0
            java.lang.Object r2 = r0.A0E(r4)
            if (r2 != r3) goto L28
        L57:
            return r3
        L58:
            X.MAG r4 = new X.MAG
            r4.<init>(r5, r6, r3)
            goto L16
        L5e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel.A01(com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel, X.1Ds):java.lang.Object");
    }

    public static final boolean A02(GalleryMemoriesViewModel galleryMemoriesViewModel) {
        if (galleryMemoriesViewModel.A07.A08.A00 instanceof C208509Kk) {
            UserSession userSession = galleryMemoriesViewModel.A01;
            if (C18U.A06(C06090Tz.A05, userSession, 36327653728336639L) && C188758Xr.A00(userSession) != C05F.A00) {
                return true;
            }
        }
        return false;
    }
}
