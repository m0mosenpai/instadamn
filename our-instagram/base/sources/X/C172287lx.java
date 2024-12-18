package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import java.util.EnumMap;
import java.util.LinkedHashMap;

/* renamed from: X.7lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172287lx {
    public C81W A00;
    public C9Td A01;
    public boolean A02;
    public CameraToolMenuItem A03;
    public boolean A04;
    public final ViewGroup A05;
    public final UserSession A07;
    public final C8GS A08;
    public final boolean A09;
    public final C8GH A0A;
    public final EnumMap A0B = new EnumMap(C81W.class);
    public final C55982hj A06 = C8GO.A00(new C668630d() { // from class: X.7ly
        @Override // X.C668630d, X.InterfaceC55932he
        public final void Dnm(C55982hj c55982hj) {
            C172287lx c172287lx;
            C9Td c9Td;
            C14360o3.A0B(c55982hj, 0);
            if (c55982hj.A09.A00 == 0.0d && c55982hj.A01 == 0.0d && (c9Td = (c172287lx = C172287lx.this).A01) != null) {
                c172287lx.A05.removeView(c9Td);
                c172287lx.A01 = null;
                c172287lx.A00 = null;
            }
            C8GS c8gs = C172287lx.this.A08;
            c8gs.Djc();
            c8gs.ECv();
        }
    }, 3.0d, 15.0d);

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0pT, java.lang.Object] */
    public final void A01(final C81W c81w) {
        AnonymousClass822 c23640AdZ;
        C1811981v A01;
        C14360o3.A0B(c81w, 0);
        final LinkedHashMap cameraToolMenuItemMap = this.A08.getCameraToolMenuItemMap();
        C81W c81w2 = C81W.A0y;
        if (c81w == c81w2) {
            final ?? obj = new Object();
            obj.A00 = -1L;
            c23640AdZ = new AnonymousClass822() { // from class: X.7k1
                @Override // X.AnonymousClass822
                public final /* bridge */ /* synthetic */ void onChanged(Object obj2) {
                    CameraToolMenuItem cameraToolMenuItem;
                    long longValue = ((Number) obj2).longValue();
                    C15130pT c15130pT = obj;
                    if (c15130pT.A00 != longValue) {
                        C81W c81w3 = c81w;
                        if (C8GX.A02(c81w3) != longValue && this.A09 && (cameraToolMenuItem = (CameraToolMenuItem) cameraToolMenuItemMap.get(c81w3)) != null) {
                            cameraToolMenuItem.setSelected(true);
                            cameraToolMenuItem.A06 = null;
                            cameraToolMenuItem.A0B = true;
                            cameraToolMenuItem.postInvalidate();
                            RunnableC24347Aqq runnableC24347Aqq = new RunnableC24347Aqq(cameraToolMenuItem);
                            C11T.A01(runnableC24347Aqq);
                            C11T.A04(runnableC24347Aqq, 1000L);
                        }
                    }
                    c15130pT.A00 = longValue;
                }
            };
            EnumMap enumMap = this.A0A.A03.A0D;
            A01 = (C1811981v) enumMap.get(c81w2);
            if (A01 == null) {
                A01 = new C1811981v(Long.valueOf(C8GX.A02(c81w2)));
                enumMap.put((EnumMap) c81w2, (C81W) A01);
            }
        } else if (c81w == C81W.A0u) {
            c23640AdZ = new C23640AdZ(c81w, this, cameraToolMenuItemMap);
            A01 = C1810981l.A01(c81w, this.A0A.A03);
        } else {
            if (C8GX.A01(c81w) != 1) {
                return;
            }
            EnumMap enumMap2 = this.A0B;
            if (enumMap2.containsKey(c81w)) {
                return;
            }
            AnonymousClass822 anonymousClass822 = new AnonymousClass822() { // from class: X.7m6
                /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
                
                    if (r2 == false) goto L13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
                
                    if (X.C8GX.A00(r4) == r6) goto L6;
                 */
                @Override // X.AnonymousClass822
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Number r13 = (java.lang.Number) r13
                        int r6 = r13.intValue()
                        X.7lx r5 = r2
                        com.instagram.common.session.UserSession r11 = r5.A07
                        X.81W r4 = r1
                        boolean r0 = X.C8GX.A06(r4)
                        if (r0 == 0) goto L19
                        int r0 = X.C8GX.A00(r4)
                        r2 = 1
                        if (r0 != r6) goto L1a
                    L19:
                        r2 = 0
                    L1a:
                        java.util.LinkedHashMap r0 = r3
                        java.lang.Object r3 = r0.get(r4)
                        com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r3 = (com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem) r3
                        if (r3 == 0) goto L8d
                        r3.setSelected(r2)
                        android.view.ViewGroup r0 = r5.A05
                        android.content.Context r10 = r0.getContext()
                        X.C14360o3.A07(r10)
                        android.content.res.Resources r1 = r10.getResources()
                        r0 = 2131165250(0x7f070042, float:1.7944712E38)
                        float r0 = r1.getDimension(r0)
                        int r9 = (int) r0
                        boolean r8 = r5.A09
                        if (r8 != 0) goto L43
                        r7 = 1
                        if (r2 != 0) goto L44
                    L43:
                        r7 = 0
                    L44:
                        java.util.List r2 = X.AbstractC172817mt.A01(r11, r4)
                        r1 = 0
                        if (r6 < 0) goto L5f
                        int r0 = r2.size()
                        if (r6 >= r0) goto L5f
                        java.lang.Object r0 = X.AbstractC001800i.A0O(r2, r6)
                        X.7my r0 = (X.C172867my) r0
                        if (r0 == 0) goto L5f
                        int r0 = r0.A01
                        android.graphics.drawable.Drawable r1 = X.AbstractC172817mt.A00(r10, r0, r9, r7)
                    L5f:
                        r3.A05 = r1
                        r0 = 0
                        r3.A06 = r0
                        r3.invalidate()
                        if (r8 == 0) goto L7e
                        r3.A06 = r0
                        r0 = 1
                        r3.A0B = r0
                        r3.postInvalidate()
                        X.Aqq r2 = new X.Aqq
                        r2.<init>(r3)
                        r0 = 1000(0x3e8, double:4.94E-321)
                        X.C11T.A01(r2)
                        X.C11T.A04(r2, r0)
                    L7e:
                        r3.postInvalidate()
                        X.81W r0 = X.C81W.A10
                        if (r4 != r0) goto L8d
                        X.7l0 r0 = new X.7l0
                        r0.<init>()
                        X.AbstractC010103p.A0B(r3, r0)
                    L8d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C172377m6.onChanged(java.lang.Object):void");
                }
            };
            C1810981l.A00(c81w, this.A0A.A03).A00(anonymousClass822);
            enumMap2.put((EnumMap) c81w, (C81W) anonymousClass822);
            return;
        }
        A01.A00(c23640AdZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.9Td] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, X.9Th, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.BDk] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.UE6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.C81W r23, com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r24) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172287lx.A03(X.81W, com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem):boolean");
    }

    public final void A00() {
        View cameraToolMenuShadow = this.A08.getCameraToolMenuShadow();
        if (cameraToolMenuShadow != null) {
            cameraToolMenuShadow.setVisibility(8);
        }
        if (this.A01 != null) {
            this.A06.A06(0.0d);
        }
    }

    public final void A02(CameraToolMenuItem cameraToolMenuItem, double d, float f, float f2) {
        int BmD;
        float f3;
        ViewGroup viewGroup = this.A05;
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        C9Td c9Td = this.A01;
        if (c9Td != null) {
            C8GS c8gs = this.A08;
            c9Td.setY(c8gs.Bra(cameraToolMenuItem));
            if (d > 0.5d) {
                c9Td.setIsOnRightSide(true);
                BmD = (c8gs.BmD(cameraToolMenuItem) + cameraToolMenuItem.getWidth()) - c9Td.getWidth();
                C81W c81w = this.A00;
                if (c81w != null && C8GX.A01(c81w) == 1) {
                    BmD += dimensionPixelSize;
                }
            } else if (d == 0.5d) {
                BmD = (viewGroup.getWidth() - c9Td.getWidth()) / 2;
            } else {
                BmD = c8gs.BmD(cameraToolMenuItem);
                C81W c81w2 = this.A00;
                if (c81w2 != null && C8GX.A01(c81w2) == 1) {
                    BmD -= dimensionPixelSize;
                }
            }
            c9Td.setTranslationX(BmD);
            C55982hj c55982hj = this.A06;
            float f4 = (float) c55982hj.A09.A00;
            float A02 = AbstractC13600mm.A02(f4, 0.0f, 0.05f * 3.0f, 0.0f, 1.0f);
            float A022 = AbstractC13600mm.A02(f4, 0.2f, 1.0f, 0.0f, 1.0f);
            c9Td.A00(A022);
            if (A022 == 1.0f) {
                AbstractC56932jR.A02(this.A01);
                this.A04 = true;
            } else if (A022 == 0.0f && this.A04) {
                CameraToolMenuItem cameraToolMenuItem2 = this.A03;
                if (cameraToolMenuItem2 != null) {
                    AbstractC56932jR.A02(cameraToolMenuItem2);
                }
                this.A03 = null;
                this.A04 = false;
            }
            if (c55982hj.A01 == 1.0d) {
                f3 = 1.0f - A02;
            } else {
                f3 = 1.0f - A022;
            }
            if (f2 > f3) {
                f2 = f3;
            }
            if (f > f2) {
                f = f2;
            }
            if (f < 0.01f) {
                f = 0.01f;
            }
            cameraToolMenuItem.setAlpha(f);
        }
    }

    public C172287lx(ViewGroup viewGroup, UserSession userSession, C8GH c8gh, C8GS c8gs, boolean z) {
        this.A05 = viewGroup;
        this.A07 = userSession;
        this.A0A = c8gh;
        this.A08 = c8gs;
        this.A09 = z;
    }
}
