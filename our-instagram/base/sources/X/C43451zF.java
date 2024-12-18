package X;

import android.content.Context;
import android.graphics.Rect;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43451zF implements InterfaceC43471zH {
    public final Context A00;
    public final InterfaceC43361z6 A01;
    public final InterfaceC42441xY A02;
    public final boolean A03;
    public final C43501zK A04;
    public final C43331z2 A05;
    public final C43341z4 A06;
    public final C43041yX A07;
    public final InterfaceC43071ya A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        if (r7 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C72133Lm.A01() == false) goto L6;
     */
    @Override // X.InterfaceC43471zH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DLN(X.InterfaceC11380iw r19, com.instagram.common.typedurl.ImageUrl r20, java.lang.String r21, int r22, int r23, int r24, int r25, int r26, int r27, boolean r28) {
        /*
            r18 = this;
            r0 = 2
            r9 = r20
            X.C14360o3.A0B(r9, r0)
            r0 = 6
            r10 = r21
            X.C14360o3.A0B(r10, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L19
            boolean r0 = X.C72133Lm.A01()
            r7 = 1
            if (r0 != 0) goto L1a
        L19:
            r7 = 0
        L1a:
            r4 = r18
            X.1zK r5 = r4.A04
            java.lang.String r6 = r9.getUrl()
            X.C14360o3.A07(r6)
            r8 = r19
            if (r19 == 0) goto L2f
            java.lang.String r3 = r8.getModuleName()
            if (r3 != 0) goto L31
        L2f:
            java.lang.String r3 = ""
        L31:
            X.1yz r0 = r5.A02
            int r1 = r0.A00
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r17 = r28
            if (r1 <= 0) goto Lc8
            java.util.Random r0 = r5.A04
            int r0 = r0.nextInt(r1)
            if (r0 != 0) goto Lc8
            com.instagram.common.session.UserSession r1 = r5.A03
            r0 = 0
            X.0wW r2 = X.AbstractC12220kQ.A01(r0, r1)
            java.lang.String r1 = "ig_image_display"
            X.0kM r0 = r2.A00
            X.0Ai r2 = r2.A00(r0, r1)
            java.lang.String r0 = "image_url"
            r2.AAP(r0, r6)
            long r0 = (long) r13
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "image_width"
            r2.A9K(r0, r1)
            long r0 = (long) r14
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "image_height"
            r2.A9K(r0, r1)
            long r0 = (long) r12
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "view_width"
            r2.A9K(r0, r1)
            long r0 = (long) r11
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "view_height"
            r2.A9K(r0, r1)
            int r0 = r5.A01
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "screen_width"
            r2.A8I(r0, r1)
            int r0 = r5.A00
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "screen_height"
            r2.A8I(r0, r1)
            java.lang.String r0 = "module"
            r2.AAP(r0, r3)
            if (r28 == 0) goto Lb0
            r0 = 1
            if (r7 != 0) goto Lb1
        Lb0:
            r0 = 0
        Lb1:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "rendered_as_hdr"
            r2.A7v(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "hdr_mode_enabled"
            r2.A7v(r0, r1)
            r2.Cht()
        Lc8:
            X.1z6 r7 = r4.A01
            r15 = r26
            r16 = r27
            r7.DLM(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43451zF.DLN(X.0iw, com.instagram.common.typedurl.ImageUrl, java.lang.String, int, int, int, int, int, int, boolean):void");
    }

    @Override // X.InterfaceC43471zH
    public final void DLT(InterfaceC11380iw interfaceC11380iw, EnumC82173le enumC82173le, ImageUrl imageUrl, String str, String str2, int i) {
        C14360o3.A0B(enumC82173le, 3);
        this.A01.DLT(interfaceC11380iw, enumC82173le, imageUrl, str, str2, i);
    }

    private final C59062n7 A00(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, IgImageView igImageView) {
        WeakReference weakReference;
        String str;
        ImmutableMap immutableMap = this.A05.A00;
        if (immutableMap != null && (str = (String) immutableMap.get(interfaceC11380iw.getModuleName())) != null) {
            interfaceC11380iw = new C19270xB(str);
        }
        if (this.A09) {
            weakReference = new WeakReference(igImageView.getOverlay());
        } else {
            weakReference = null;
        }
        C59072n8 A00 = C59062n7.A00(new C206189Bb(imageUrl, weakReference, igImageView.A0M), new C9BH(interfaceC11380iw), ((ImageCacheKey) imageUrl.AjX()).A03);
        A00.A00(this.A08);
        return A00.A01();
    }

    private final void A01(ImageUrl imageUrl, IgImageView igImageView, InterfaceC11380iw interfaceC11380iw) {
        if ((this.A03 && igImageView.A0M) || C43341z4.A07.A02(this.A05, imageUrl)) {
            if (this.A0A) {
                C57112jm A01 = AbstractC58982mw.A01(AbstractC58952mt.A00(igImageView));
                if (A01 != null) {
                    C57112jm.A01(this.A07, A00(interfaceC11380iw, imageUrl, igImageView), A01, AbstractC58952mt.A00(igImageView));
                }
            } else {
                C57112jm A00 = AbstractC58982mw.A00(igImageView);
                if (A00 != null) {
                    A00.A05(igImageView, A00(interfaceC11380iw, imageUrl, igImageView));
                }
            }
            C43341z4 c43341z4 = this.A06;
            AtomicInteger atomicInteger = igImageView.A0a;
            C14360o3.A0B(atomicInteger, 1);
            if (C43341z4.A07.A02(c43341z4.A01, imageUrl)) {
                C43341z4.A00(c43341z4, imageUrl).A0F = atomicInteger;
            }
        }
    }

    private final void A02(IgImageView igImageView, ImageUrl imageUrl) {
        if (imageUrl == null || ((this.A03 && igImageView.A0M) || C43341z4.A07.A02(this.A05, imageUrl))) {
            if (this.A0A) {
                C57112jm A01 = AbstractC58982mw.A01(AbstractC58952mt.A00(igImageView));
                if (A01 != null) {
                    C57112jm.A02(this.A07, A01, AbstractC58952mt.A00(igImageView));
                    return;
                }
                return;
            }
            C57112jm A00 = AbstractC58982mw.A00(igImageView);
            if (A00 == null) {
                return;
            }
            A00.A04(igImageView);
        }
    }

    @Override // X.InterfaceC43471zH
    public final void Cxe(ImageUrl imageUrl, IgImageView igImageView, InterfaceC11380iw interfaceC11380iw) {
        if (imageUrl != null && interfaceC11380iw != null) {
            A01(imageUrl, igImageView, interfaceC11380iw);
        }
    }

    @Override // X.InterfaceC43471zH
    public final void DLJ(ImageUrl imageUrl) {
        C43341z4 c43341z4 = this.A06;
        if (C43341z4.A07.A02(c43341z4.A01, imageUrl)) {
            C59082n9 A00 = C43341z4.A00(c43341z4, imageUrl);
            C006802i c006802i = A00.A0R;
            long currentMonotonicTimestampNanos = c006802i.currentMonotonicTimestampNanos();
            int i = A00.A0M;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            c006802i.markerPoint(23410213, i, "BLUR_REMOVED", currentMonotonicTimestampNanos, timeUnit);
            c006802i.markerPoint(23399201, i, "BLUR_REMOVED", currentMonotonicTimestampNanos, timeUnit);
        }
    }

    @Override // X.InterfaceC43471zH
    public final void DLR(ImageUrl imageUrl) {
        final C59082n9 A00 = C43341z4.A00(this.A06, imageUrl);
        Integer num = A00.A0B;
        Integer num2 = C05F.A0Y;
        boolean z = false;
        if (num != num2) {
            z = true;
        }
        A00.A0B = num2;
        if (A00.A08 != -1 && z) {
            boolean z2 = A00.A0a;
            if (z2) {
                if (A00.A0Z) {
                    final long currentMonotonicTimestampNanos = A00.A0R.currentMonotonicTimestampNanos();
                    C59082n9.A05(A00, new Runnable() { // from class: X.D1V
                        @Override // java.lang.Runnable
                        public final void run() {
                            C59082n9.A03(C59082n9.this, 23410213, currentMonotonicTimestampNanos);
                        }
                    }, 427135662);
                } else {
                    C59082n9.A03(A00, 23410213, -1L);
                }
            }
            if (A00.A0Q.A00(z2)) {
                final long currentMonotonicTimestampNanos2 = A00.A0R.currentMonotonicTimestampNanos();
                C59082n9.A05(A00, new Runnable() { // from class: X.BIl
                    @Override // java.lang.Runnable
                    public final void run() {
                        C59082n9.A03(C59082n9.this, 23399201, currentMonotonicTimestampNanos2);
                    }
                }, 1492230029);
            }
        }
    }

    @Override // X.InterfaceC43471zH
    public final void DgC(ImageUrl imageUrl) {
        this.A06.A04(imageUrl);
    }

    public C43451zF(Context context, C43321yz c43321yz, InterfaceC43361z6 interfaceC43361z6, C43331z2 c43331z2, C43341z4 c43341z4, UserSession userSession, InterfaceC42441xY interfaceC42441xY) {
        C43041yX c43041yX;
        this.A00 = context;
        this.A05 = c43331z2;
        this.A06 = c43341z4;
        this.A02 = interfaceC42441xY;
        this.A01 = interfaceC43361z6;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0A = C18U.A06(c06090Tz, userSession, 36327713857944373L);
        synchronized (C43041yX.A02) {
            int i = C43041yX.A01 + 1;
            C43041yX.A01 = i;
            c43041yX = new C43041yX(AnonymousClass001.A0O("_UniqueKey_", i));
        }
        this.A07 = c43041yX;
        this.A09 = C1C0.A00(userSession);
        this.A03 = C18U.A06(c06090Tz, userSession, 2342162017173379913L);
        this.A04 = new C43501zK(c43321yz, userSession, AbstractC13880nE.A0A(context), AbstractC13880nE.A09(context));
        this.A08 = new InterfaceC43071ya() { // from class: X.1zM
            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                Integer CFq = interfaceC57162jr.CFq(c59062n7);
                C14360o3.A07(CFq);
                Rect rect = new Rect();
                interfaceC57162jr.BA6(rect, c59062n7);
                if (CFq == C05F.A00) {
                    C43451zF c43451zF = C43451zF.this;
                    C206189Bb c206189Bb = (C206189Bb) c59062n7.A03;
                    ImageUrl imageUrl = (ImageUrl) c206189Bb.A03;
                    InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) ((C9BH) c59062n7.A04).A00;
                    c43451zF.A01.E0Y(rect, interfaceC11380iw, imageUrl, (WeakReference) c206189Bb.A00);
                    InterfaceC42441xY interfaceC42441xY2 = c43451zF.A02;
                    if (interfaceC42441xY2 != null) {
                        interfaceC42441xY2.DLO(imageUrl, interfaceC11380iw.getModuleName());
                        return;
                    }
                    return;
                }
                if (CFq != C05F.A0C) {
                    return;
                }
                C43451zF c43451zF2 = C43451zF.this;
                ImageUrl imageUrl2 = (ImageUrl) ((C206189Bb) c59062n7.A03).A03;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) ((C9BH) c59062n7.A04).A00;
                c43451zF2.A01.E0b(c43451zF2.A00, interfaceC11380iw2, imageUrl2);
                InterfaceC42441xY interfaceC42441xY3 = c43451zF2.A02;
                if (interfaceC42441xY3 == null) {
                    return;
                }
                interfaceC42441xY3.DLQ(imageUrl2, interfaceC11380iw2.getModuleName());
            }
        };
    }

    @Override // X.InterfaceC43471zH
    public final void DA1(IgImageView igImageView, ImageUrl imageUrl) {
        A02(igImageView, imageUrl);
    }

    @Override // X.InterfaceC43471zH
    public final void DxZ(IgImageView igImageView, ImageUrl imageUrl) {
        A02(igImageView, imageUrl);
    }

    @Override // X.InterfaceC43471zH
    public final void Dxa(ImageUrl imageUrl, IgImageView igImageView, InterfaceC11380iw interfaceC11380iw) {
        A01(imageUrl, igImageView, interfaceC11380iw);
    }
}
