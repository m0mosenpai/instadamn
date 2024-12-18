package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;

/* renamed from: X.6XW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6XW {
    public static final /* synthetic */ C0YR[] A0I = {new AnonymousClass013(C6XW.class, "loadingState", "getLoadingState()Lcom/instagram/reels/viewer/superlative/SuperlativeHolder$LoadingState;", 0), new AnonymousClass013(C6XW.class, "isVideoReady", "isVideoReady()Z", 0)};
    public int A00;
    public int A01;
    public C41618Ib8 A02;
    public InterfaceC16820sZ A03;
    public InterfaceC16610sE A04;
    public InterfaceC16610sE A05;
    public boolean A06;
    public final InterfaceC56392iX A07;
    public final C6XY A08;
    public final InterfaceC16530ry A0D;
    public final C6XX A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC16530ry A0H;
    public final InterfaceC09390do A0C = AbstractC09440dt.A01(new C9EU(this, 5));
    public final InterfaceC09390do A0A = AbstractC09440dt.A01(new C9EU(this, 3));
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(new C9EU(this, 2));
    public final InterfaceC09390do A0B = AbstractC09440dt.A01(new C9EU(this, 4));
    public final C19L A0E = AnonymousClass194.A02(C12L.A00.A04);

    public static final C6XZ A00(C6XW c6xw) {
        return (C6XZ) c6xw.A0H.CES(c6xw, A0I[0]);
    }

    public static final void A01(C6XZ c6xz, C6XW c6xw) {
        c6xw.A0H.Egi(c6xw, c6xz, A0I[0]);
    }

    public static final void A02(C6XW c6xw) {
        C140556Xj c140556Xj;
        InterfaceC16820sZ interfaceC16820sZ;
        if (((Boolean) c6xw.A0D.CES(c6xw, A0I[1])).booleanValue() && A00(c6xw) == C6XZ.A02) {
            InterfaceC16820sZ interfaceC16820sZ2 = c6xw.A03;
            if (interfaceC16820sZ2 != null) {
                interfaceC16820sZ2.invoke();
            }
            ((View) c6xw.A0A.getValue()).setVisibility(8);
            Object value = c6xw.A0B.getValue();
            C14360o3.A07(value);
            ((View) value).setVisibility(8);
            c6xw.A04().setVisibility(0);
            c140556Xj = (C140556Xj) c6xw.A0C.getValue();
            interfaceC16820sZ = C140566Xk.A00;
        } else {
            if (A00(c6xw) != C6XZ.A03) {
                return;
            }
            ((View) c6xw.A0A.getValue()).setVisibility(0);
            ((View) c6xw.A09.getValue()).setVisibility(8);
            Object value2 = c6xw.A0B.getValue();
            C14360o3.A07(value2);
            ((View) value2).setVisibility(0);
            c6xw.A04().setVisibility(4);
            c140556Xj = (C140556Xj) c6xw.A0C.getValue();
            interfaceC16820sZ = B82.A00;
        }
        C140556Xj.A00(c140556Xj, interfaceC16820sZ);
    }

    public static final void A03(C6XW c6xw) {
        Object value = c6xw.A0B.getValue();
        C14360o3.A07(value);
        ((View) value).setVisibility(8);
        c6xw.A04().setVisibility(4);
        ((View) c6xw.A0A.getValue()).setVisibility(0);
        ((View) c6xw.A09.getValue()).setVisibility(0);
        A01(C6XZ.A04, c6xw);
        c6xw.A08.A01.clear();
        c6xw.A00 = 0;
        c6xw.A06 = false;
        C41618Ib8 c41618Ib8 = c6xw.A02;
        if (c41618Ib8 == null) {
            C14360o3.A0F("superlativeRenderer");
            throw C00O.createAndThrow();
        }
        C145116gW c145116gW = c41618Ib8.A00;
        if (c145116gW != null) {
            ReelViewerFragment reelViewerFragment = c145116gW.A00;
            ((C147256kA) reelViewerFragment.mViewPager).A02.post(reelViewerFragment.A3M);
        }
    }

    public final ViewGroup A04() {
        return (ViewGroup) this.A0G.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r1.A01 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            r3 = this;
            X.2iX r0 = r3.A07
            r2 = 0
            r0.setVisibility(r2)
            X.6XZ r1 = A00(r3)
            X.6XZ r0 = X.C6XZ.A02
            if (r1 != r0) goto L26
            boolean r0 = r3.A06
            if (r0 == 0) goto L26
        L12:
            X.0do r0 = r3.A0B
            java.lang.Object r1 = r0.getValue()
            X.C14360o3.A07(r1)
            android.view.View r1 = (android.view.View) r1
            X.ARA r0 = new X.ARA
            r0.<init>(r3)
            X.C0fQ.A00(r0, r1)
            return
        L26:
            X.Ib8 r1 = r3.A02
            if (r1 == 0) goto L35
            boolean r0 = r1.A02
            r1.A02 = r2
            if (r0 != 0) goto L12
            boolean r0 = r1.A01
            if (r0 == 0) goto L35
            goto L12
        L35:
            X.0do r0 = r3.A0C
            java.lang.Object r1 = r0.getValue()
            X.6Xj r1 = (X.C140556Xj) r1
            X.B82 r0 = X.B82.A00
            X.C140556Xj.A00(r1, r0)
            android.view.ViewGroup r1 = r3.A04()
            r0 = 4
            r1.setVisibility(r0)
            X.0do r0 = r3.A0B
            java.lang.Object r1 = r0.getValue()
            X.C14360o3.A07(r1)
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            X.0do r0 = r3.A0A
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.0do r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6XW.A05():void");
    }

    public final void A06(C41618Ib8 c41618Ib8, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = c41618Ib8;
        int i = this.A01;
        if (i == 0 && c41618Ib8.A04 == EnumC46183KcL.A03) {
            this.A01 = c41618Ib8.A03.A01.size();
        } else {
            List list = c41618Ib8.A03.A01;
            if (i > list.size() && c41618Ib8.A04 == EnumC46183KcL.A03) {
                this.A01 = list.size();
                A01(C6XZ.A04, this);
                A03(this);
            }
        }
        A05();
        Context context = A04().getContext();
        C14360o3.A07(context);
        if (!AbstractC15820qc.A0F(context) && A00(this) != C6XZ.A02) {
            A01(C6XZ.A03, this);
        } else {
            if (A00(this) == C6XZ.A04) {
                A01(C6XZ.A05, this);
                interfaceC16820sZ.invoke();
                C6XY c6xy = this.A08;
                for (C28186CbZ c28186CbZ : c6xy.A01) {
                    C38321qM c38321qM = c28186CbZ.A03;
                    if (c38321qM != null) {
                        IgImageView igImageView = c28186CbZ.A02;
                        InterfaceC11380iw interfaceC11380iw = c28186CbZ.A01;
                        String str = c28186CbZ.A05;
                        boolean z = c28186CbZ.A07;
                        boolean z2 = c28186CbZ.A06;
                        float f = c28186CbZ.A00;
                        C6XX c6xx = c6xy.A00;
                        if (igImageView.isLaidOut() && !igImageView.isLayoutRequested()) {
                            ExtendedImageUrl A1o = c38321qM.A1o(igImageView.getWidth());
                            if (!z2 && !z) {
                                if (A1o != null) {
                                    igImageView.A0E = new C70822Whf(c6xx);
                                    igImageView.setUrl(A1o, interfaceC11380iw);
                                } else {
                                    igImageView.setVisibility(4);
                                    C37947Gmp.A01(str, "Null image");
                                }
                            } else {
                                C6XY.A00(interfaceC11380iw, A1o, igImageView, c6xx, c6xy, str, f, z, z2);
                            }
                        } else {
                            igImageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC70242WNf(interfaceC11380iw, igImageView, c38321qM, c6xx, c6xy, str, f, z2, z));
                        }
                    } else {
                        Integer num = c28186CbZ.A04;
                        if (num != null) {
                            IgImageView igImageView2 = c28186CbZ.A02;
                            Context context2 = igImageView2.getContext();
                            Resources resources = context2.getResources();
                            int intValue = num.intValue();
                            Drawable drawable = resources.getDrawable(intValue);
                            if (drawable instanceof C3PR) {
                                ((C3PR) drawable).A01(new C23700AeZ(c6xy, c28186CbZ));
                            } else {
                                Bitmap decodeResource = BitmapFactory.decodeResource(context2.getResources(), intValue);
                                if (decodeResource != null) {
                                    igImageView2.setImageBitmap(decodeResource);
                                    c6xy.A00.A01();
                                }
                            }
                        }
                    }
                }
                return;
            }
            if (A00(this) != C6XZ.A03) {
                return;
            }
        }
        A02(this);
    }

    public final void A07(C28186CbZ c28186CbZ) {
        this.A08.A01.add(c28186CbZ);
    }

    public C6XW(ViewStub viewStub, int i) {
        C6XX c6xx = new C6XX(this);
        this.A0F = c6xx;
        this.A08 = new C6XY(c6xx);
        this.A07 = AbstractC56372iV.A01(viewStub, false, false);
        this.A0G = AbstractC09440dt.A01(new C207069El(this, i, 16));
        final C6XZ c6xz = C6XZ.A04;
        this.A0H = new C0YT(c6xz) { // from class: X.6Xa
            @Override // X.C0YT
            public final boolean A01(Object obj, Object obj2, C0YR c0yr) {
                if (obj == C6XZ.A03 && obj2 == C6XZ.A02) {
                    return false;
                }
                return true;
            }
        };
        final boolean z = false;
        this.A0D = new C0YT(z) { // from class: X.6Xb
            @Override // X.C0YT
            public final void A00(Object obj, Object obj2, C0YR c0yr) {
                if (((Boolean) obj2).booleanValue()) {
                    C6XW.A02(C6XW.this);
                }
            }
        };
    }
}
