package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Y6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Y6 {
    public int A00;
    public boolean A01;
    public final Activity A02;
    public final AbstractC59962oe A03;
    public final C8Y5 A04;
    public final AnonymousClass857 A05;
    public final UserSession A06;
    public final C1810981l A07;
    public final C8RZ A08;
    public final C8LZ A09;
    public final C183688Ct A0A;
    public final C185948Mo A0B;
    public final AnonymousClass874 A0C;
    public final AnonymousClass874 A0D;
    public final AnonymousClass840 A0E;
    public final C82F A0F;
    public final C188798Xv A0G;
    public final C8GE A0H;
    public final InterfaceC1818984z A0I;
    public final InterfaceC1810081c A0J;
    public final C8FA A0K;
    public final C8JU A0L;
    public final ClipsCreationViewModel A0M;
    public final C183428Bp A0N;
    public final C183468Bt A0O;
    public final C150286pc A0P;
    public final AnonymousClass825 A0Q;
    public final InteractiveDrawableContainer A0R;
    public final MultiListenerTextureView A0S;
    public final C57012jc A0T;
    public final C89F A0U;
    public final C8LJ A0V;
    public final TargetViewSizeProvider A0W;
    public final C1812682c A0X;
    public final C8XA A0Y;
    public final AnonymousClass853 A0Z;
    public final C8LC A0a;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if ((!X.C183688Ct.A0M(r4)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C8Y6 r24, java.lang.String r25, java.lang.String r26) {
        /*
            r1 = 1
            r8 = 0
            r5 = r24
            X.8RZ r0 = r5.A08
            r2 = 0
            r0.A0D(r2)
            X.8Ct r4 = r5.A0A
            X.8ld r0 = r4.A1r
            boolean r0 = r0.A06()
            if (r0 == 0) goto L1d
            boolean r0 = X.C183688Ct.A0M(r4)
            r0 = r0 ^ 1
            r3 = 1
            if (r0 != 0) goto L1e
        L1d:
            r3 = 0
        L1e:
            r4.A0c()
            r4.A0Z()
            com.instagram.pendingmedia.model.UserStoryTarget r6 = com.instagram.pendingmedia.model.UserStoryTarget.A01
            com.instagram.common.session.UserSession r0 = r5.A06
            X.22C r0 = X.AnonymousClass229.A01(r0)
            X.24g r0 = r0.A04
            r0.A09()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0V
            X.ACA r7 = new X.ACA
            r7.<init>(r8, r6, r0)
            X.8LZ r15 = r5.A09
            boolean r0 = r15.A0K()
            if (r0 == 0) goto L6a
            X.8pb r0 = X.EnumC198268pb.A04
        L42:
            int r0 = r0.ordinal()
            r13 = r25
            r14 = r26
            if (r0 == r2) goto L7b
            if (r0 != r1) goto L73
            X.8Mo r6 = r5.A0B
            java.lang.Integer r12 = X.C05F.A00
            java.lang.String r0 = "auto_xpost"
            X.A96 r9 = new X.A96
            r9.<init>(r0, r8, r3, r2)
            r10 = r8
            r11 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r1
            r20 = r2
            r6.A0P(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L6a:
            X.840 r0 = r5.A0E
            X.83z r0 = r0.A02
            X.8pb r0 = r0.A02()
            goto L42
        L73:
            java.lang.String r1 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L7b:
            java.lang.Integer r21 = X.C05F.A00
            java.lang.String r0 = "auto_xpost"
            X.A96 r1 = new X.A96
            r1.<init>(r0, r8, r3, r2)
            X.8Ds r0 = r4.A1E
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A03
            boolean r0 = r0.A0G
            r16 = r8
            r17 = r7
            r18 = r8
            r19 = r1
            r20 = r8
            r22 = r13
            r23 = r14
            r24 = r8
            r25 = r2
            r26 = r0
            r15.A0J(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Y6.A02(X.8Y6, java.lang.String, java.lang.String):void");
    }

    public static C47Z A00(C8Y6 c8y6) {
        C8Y5 c8y5 = c8y6.A04;
        C1816783z c1816783z = c8y6.A0E.A02;
        CameraAREffect A00 = c8y6.A0a.A00();
        C183688Ct c183688Ct = c8y6.A0A;
        return c8y5.A03(A00, c1816783z, c183688Ct.A1E.A03.A00(), c183688Ct.A0X(), c183688Ct.A0W());
    }

    public static C17050sx A01(C8Y6 c8y6) {
        InterfaceC16820sZ c9n0;
        int ordinal = c8y6.A0E.A02.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return null;
            }
            MultiListenerTextureView multiListenerTextureView = c8y6.A0S;
            C14360o3.A0B(multiListenerTextureView, 0);
            c9n0 = new MHQ(multiListenerTextureView, 44);
        } else {
            c9n0 = new C9N0(c8y6.A09);
        }
        return AbstractC09440dt.A01(c9n0);
    }

    private boolean A03() {
        C183918Ds c183918Ds = this.A0A.A1E;
        ReelMoreOptionsModel reelMoreOptionsModel = c183918Ds.A03;
        if (!reelMoreOptionsModel.A0E && (reelMoreOptionsModel.A00() == null || !((BrandedContentTag) c183918Ds.A03.A00().get(0)).A04)) {
            return false;
        }
        return true;
    }

    public static boolean A04(DialogInterface.OnClickListener onClickListener, final C8Y6 c8y6) {
        C183688Ct c183688Ct = c8y6.A0A;
        C183918Ds c183918Ds = c183688Ct.A1E;
        if (!c183918Ds.A03.A0H) {
            AnonymousClass857 anonymousClass857 = c8y6.A05;
            if (!anonymousClass857.A00) {
                UserSession userSession = c8y6.A06;
                if (C4A4.A00(userSession)) {
                    List A00 = c183918Ds.A03.A00();
                    ArrayList A0X = c183688Ct.A0X();
                    String A002 = c183688Ct.A0S().A00();
                    if (A00 == null) {
                        A00 = Collections.emptyList();
                    }
                    List A02 = anonymousClass857.A02(userSession, A002, A0X, A00);
                    if (!A02.isEmpty()) {
                        anonymousClass857.A03(c8y6.A03.requireContext(), new DialogInterface.OnClickListener() { // from class: X.ANk
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C183918Ds c183918Ds2 = C8Y6.this.A0A.A1E;
                                if (c183918Ds2.A00 != null) {
                                    c183918Ds2.A08 = true;
                                    c183918Ds2.A09 = true;
                                    c183918Ds2.A01();
                                }
                            }
                        }, onClickListener, userSession, C05F.A00, "story", A02);
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Bitmap A05() {
        Bitmap bitmap;
        ArrayList A0T = this.A0R.A0T(C210399Se.class);
        C14360o3.A0B(A0T, 0);
        Object A0J = AbstractC001800i.A0J(A0T);
        this.A03.getContext();
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) this.A0W).A0K;
        int width = interfaceC1812882f.getWidth();
        int height = interfaceC1812882f.getHeight();
        interfaceC1812882f.getWidth();
        if (A0J != null) {
            C89F c89f = this.A0U;
            C210399Se c210399Se = c89f.A09;
            if (c210399Se != null) {
                bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                C14360o3.A07(bitmap);
                Canvas canvas = new Canvas(bitmap);
                float f = width;
                RoundedCornerFrameLayout roundedCornerFrameLayout = c89f.A0U;
                float width2 = f / roundedCornerFrameLayout.getWidth();
                canvas.scale(width2, width2);
                float pivotX = roundedCornerFrameLayout.getPivotX() + roundedCornerFrameLayout.getTranslationX();
                float pivotY = roundedCornerFrameLayout.getPivotY() + roundedCornerFrameLayout.getTranslationY();
                canvas.rotate(roundedCornerFrameLayout.getRotation(), pivotX, pivotY);
                canvas.scale(roundedCornerFrameLayout.getScaleX(), roundedCornerFrameLayout.getScaleY(), pivotX, pivotY);
                canvas.translate(roundedCornerFrameLayout.getTranslationX(), roundedCornerFrameLayout.getTranslationY());
                c210399Se.ANp(canvas, Integer.valueOf((int) (f * roundedCornerFrameLayout.getScaleX())), Integer.valueOf((int) (height * roundedCornerFrameLayout.getScaleY())), 0L);
            } else {
                bitmap = null;
            }
        } else {
            bitmap = null;
        }
        Bitmap A01 = ((C8LK) this.A0V.A00.A00()).A01(null, null, null, 1.0f, 1.0f, -1, true, false, true, true);
        int ordinal = this.A0E.A02.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return null;
            }
            MultiListenerTextureView multiListenerTextureView = this.A0S;
            C14360o3.A0B(multiListenerTextureView, 3);
            try {
                Bitmap bitmap2 = multiListenerTextureView.getBitmap();
                if (bitmap2 == null) {
                    return null;
                }
                if (A01 != null || bitmap != null) {
                    Canvas canvas2 = new Canvas(bitmap2);
                    if (A01 != null) {
                        canvas2.drawBitmap(A01, 0.0f, 0.0f, (Paint) null);
                    }
                    if (bitmap != null) {
                        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                }
                return C1NC.A04(bitmap2);
            } catch (OutOfMemoryError e) {
                AbstractC12120kG.A0I(AnonymousClass001.A0R("VideoSendingController", "#getMediaScreenshot_OOM"), e, AbstractC06930Yk.A0E());
                return null;
            }
        }
        return this.A09.A0F(A01, bitmap);
    }

    public final void A06() {
        C150286pc c150286pc = this.A0P;
        if (c150286pc != null && c150286pc.A03) {
            C191478dz c191478dz = (C191478dz) c150286pc.get();
            if (c191478dz.A0O && c191478dz.A0w == C5JK.A05) {
                UserSession userSession = this.A06;
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A05, userSession, 36321507630655002L)) {
                    ((C191478dz) c150286pc.get()).A0J();
                    return;
                }
            }
        }
        Activity activity = this.A02;
        if (activity instanceof InterfaceC53722dB) {
            InterfaceC08430c6 interfaceC08430c6 = this.A03;
            if (interfaceC08430c6 instanceof InterfaceC60072op) {
                ((InterfaceC60072op) interfaceC08430c6).onBackPressed();
                return;
            }
        }
        activity.onBackPressed();
    }

    public final void A07() {
        if (!this.A0E.A02.A01.A07()) {
            AbstractC12120kG.A01(this.A0X.getModuleName(), "No active captured media");
            C9GR.A0B(this.A02, "no_active_captured_media");
            return;
        }
        AGy aGy = AGy.A00;
        aGy.A01("sink", MSV.A00(536));
        aGy.A00();
        if (A04(new DialogInterface.OnClickListener() { // from class: X.ANl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ((C1809981b) C8Y6.this.A0J).A01.A04(new C187668Tj());
            }
        }, this)) {
            return;
        }
        if (A03()) {
            this.A04.A04(A00(this), new InterfaceC16820sZ() { // from class: X.B2u
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    ((C1809981b) C8Y6.this.A0J).A01.A04(new C187668Tj());
                    return C0eB.A00;
                }
            });
        } else if (!A03() && this.A0A.A1E.A03.A0G) {
            this.A04.A05(A00(this), new InterfaceC16820sZ() { // from class: X.B2t
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    final C8Y6 c8y6 = C8Y6.this;
                    C82F c82f = c8y6.A0F;
                    final String str = c82f.A01;
                    final String str2 = c82f.A00;
                    AGy aGy2 = AGy.A00;
                    aGy2.A01("sink", "story");
                    aGy2.A00();
                    DialogInterfaceOnClickListenerC35344FiL dialogInterfaceOnClickListenerC35344FiL = new DialogInterfaceOnClickListenerC35344FiL(c8y6, str, str2, 0);
                    c8y6.A0A.A0b();
                    if (!C8Y6.A04(dialogInterfaceOnClickListenerC35344FiL, c8y6)) {
                        if (!(!C183688Ct.A0M(r1))) {
                            C8Y6.A02(c8y6, str, str2);
                        } else {
                            InterfaceC57990Pna interfaceC57990Pna = new InterfaceC57990Pna() { // from class: X.Aln
                                @Override // X.InterfaceC57990Pna
                                public final void afterSelection(boolean z) {
                                    C8Y6 c8y62 = C8Y6.this;
                                    String str3 = str;
                                    String str4 = str2;
                                    if (z) {
                                        c8y62.A0A.A1r.A05(true, "upsell");
                                    }
                                    C8Y6.A02(c8y62, str3, str4);
                                }
                            };
                            UserSession userSession = c8y6.A06;
                            C200018t5 c200018t5 = new C200018t5(userSession);
                            C54804OJy A00 = AbstractC54221Nxz.A00(c8y6.A02, C82G.A0n, userSession);
                            A00.A05 = interfaceC57990Pna;
                            A00.A0A = str;
                            AbstractC59962oe abstractC59962oe = c8y6.A03;
                            C14360o3.A0B(abstractC59962oe, 0);
                            A00.A01 = abstractC59962oe;
                            c200018t5.A01(null, A00, new InterfaceC57992Pnc() { // from class: X.Alq
                                @Override // X.InterfaceC57992Pnc
                                public final void Dgl(Integer num) {
                                    C8Y6 c8y62 = C8Y6.this;
                                    String str3 = str;
                                    String str4 = str2;
                                    if (num == C05F.A00) {
                                        C8Y6.A02(c8y62, str3, str4);
                                    }
                                }
                            });
                        }
                    }
                    return C0eB.A00;
                }
            });
        } else {
            ((C1809981b) this.A0J).A01.A04(new C187668Tj());
        }
    }

    public C8Y6(C8Y5 c8y5, AnonymousClass857 anonymousClass857, MultiListenerTextureView multiListenerTextureView, C57012jc c57012jc, C1810981l c1810981l, C89F c89f, C8LJ c8lj, C8RZ c8rz, C8LZ c8lz, C183688Ct c183688Ct, C185948Mo c185948Mo, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass874 anonymousClass874, AnonymousClass874 anonymousClass8742, AnonymousClass840 anonymousClass840, C81J c81j, C1812682c c1812682c, C8XA c8xa, C82F c82f, C188798Xv c188798Xv, C8GE c8ge, InterfaceC1818984z interfaceC1818984z, AnonymousClass853 anonymousClass853, C8LC c8lc, InterfaceC1810081c interfaceC1810081c, C8FA c8fa, C8JU c8ju, ClipsCreationViewModel clipsCreationViewModel, C183428Bp c183428Bp, C183468Bt c183468Bt, C150286pc c150286pc, AnonymousClass825 anonymousClass825, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A06 = c81j.A0S;
        this.A02 = c81j.A05;
        c81j.A0M.getClass();
        this.A03 = c81j.A0M;
        this.A0E = anonymousClass840;
        this.A0X = c1812682c;
        this.A0J = interfaceC1810081c;
        this.A0A = c183688Ct;
        this.A05 = anonymousClass857;
        this.A0Z = anonymousClass853;
        this.A0O = c183468Bt;
        this.A0Y = c8xa;
        this.A08 = c8rz;
        this.A09 = c8lz;
        this.A0B = c185948Mo;
        this.A0P = c150286pc;
        this.A0G = c188798Xv;
        this.A0R = interactiveDrawableContainer;
        this.A0S = multiListenerTextureView;
        this.A0H = c8ge;
        this.A07 = c1810981l;
        this.A0N = c183428Bp;
        this.A0I = interfaceC1818984z;
        this.A0C = anonymousClass874;
        this.A0D = anonymousClass8742;
        this.A0L = c8ju;
        this.A0K = c8fa;
        this.A0W = targetViewSizeProvider;
        this.A0U = c89f;
        this.A0V = c8lj;
        this.A0Q = anonymousClass825;
        this.A0M = clipsCreationViewModel;
        this.A04 = c8y5;
        this.A0a = c8lc;
        this.A0T = c57012jc;
        this.A0F = c82f;
    }
}
