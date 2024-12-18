package com.instagram.showreel.composition.ui.reels;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC139396Su;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25234BEr;
import X.BFR;
import X.C0w9;
import X.C138746Qe;
import X.C139406Sv;
import X.C14360o3;
import X.C17280tP;
import X.C25614BUb;
import X.C29066Crt;
import X.C38321qM;
import X.C41181vS;
import X.C6QC;
import X.C6QX;
import X.C84823qW;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC127355pE;
import X.InterfaceC138736Qd;
import X.InterfaceC139356Sq;
import X.InterfaceC31147Dmq;
import X.InterfaceC62872tQ;
import X.J8V;
import X.WG4;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.rendercore.text.RCTextView;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class IgReelsShowreelCompositionView extends IgShowreelCompositionView {
    public View A00;
    public View A01;
    public InterfaceC139356Sq A02;
    public UserSession A03;
    public boolean A04;
    public final Map A05;
    public final InterfaceC09390do A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgReelsShowreelCompositionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A05 = AbstractC166987dD.A1G();
        this.A06 = AbstractC09440dt.A01(new J8V(this, 20));
        AbstractC25234BEr.A1O(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC127345pD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.view.View r11, java.lang.Integer r12, java.lang.String r13, float r14, float r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.showreel.composition.ui.reels.IgReelsShowreelCompositionView.A02(android.view.View, java.lang.Integer, java.lang.String, float, float, int, int):void");
    }

    public final void setShowreelAnimation(UserSession userSession, IgShowreelComposition igShowreelComposition, InterfaceC138736Qd interfaceC138736Qd, InterfaceC62872tQ interfaceC62872tQ, Map map, C41181vS c41181vS, View view, View view2, InterfaceC11380iw interfaceC11380iw) {
        List list;
        C6QX A0G;
        Map map2;
        Set keySet;
        IgShowreelComposition igShowreelComposition2;
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A0a(1, igShowreelComposition, interfaceC138736Qd, interfaceC62872tQ, map);
        C14360o3.A0B(c41181vS, 5);
        C25614BUb controller = getController();
        C29066Crt c29066Crt = new C29066Crt(this, 0);
        if (!controller.CXh() || (igShowreelComposition2 = controller.A04) == null || !igShowreelComposition2.equals(igShowreelComposition)) {
            ListenableFuture listenableFuture = controller.A07.A00;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
            }
            controller.A01 = c41181vS;
            ((BFR) controller).A00 = 0.0f;
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null && c38321qM.A0z() > 0 && c38321qM.A0y() > 0) {
                ((BFR) controller).A00 = c38321qM.A0z() / c38321qM.A0y();
            }
            controller.A04 = igShowreelComposition;
            controller.A00 = interfaceC11380iw;
            InterfaceC127355pE interfaceC127355pE = controller.A08;
            interfaceC127355pE.DQ8(1);
            C139406Sv A00 = AbstractC139396Su.A00(interfaceC138736Qd, igShowreelComposition);
            C138746Qe A002 = BFR.A00(A00, userSession, controller);
            SparseArray sparseArray = new SparseArray();
            C41181vS c41181vS2 = controller.A01;
            if (c41181vS2 != null && (A0G = c41181vS2.A0G()) != null && (map2 = A0G.A08) != null && (keySet = map2.keySet()) != null) {
                list = AbstractC001800i.A0a(keySet);
            } else {
                list = null;
            }
            sparseArray.put(R.id.showreel_mention_list, list);
            controller.A02(sparseArray, A002, c29066Crt, interfaceC62872tQ, userSession, igShowreelComposition, map);
            interfaceC127355pE.CJk(A00);
            controller.A02 = A002;
            controller.A05 = A00.A02;
        }
        this.A03 = userSession;
        this.A00 = view;
        this.A01 = view2;
    }

    private final C84823qW A00(RectF rectF, float f, float f2, int i) {
        Map map = this.A05;
        C84823qW c84823qW = (C84823qW) map.get(rectF);
        if (c84823qW == null) {
            c84823qW = new C84823qW();
            map.put(rectF, c84823qW);
        }
        c84823qW.A03 = f;
        c84823qW.A04 = f2;
        c84823qW.A00 = i;
        return c84823qW;
    }

    @Override // com.instagram.showreel.composition.ui.IgShowreelCompositionView
    public C25614BUb getController() {
        return (C25614BUb) this.A06.getValue();
    }

    @Override // com.instagram.showreel.composition.ui.IgShowreelCompositionView, X.InterfaceC115845Ly
    public final void E0c() {
        int i;
        ColorDrawable colorDrawable;
        int i2;
        InterfaceC09390do interfaceC09390do;
        ColorDrawable colorDrawable2;
        int i3;
        ColorDrawable colorDrawable3;
        super.E0c();
        C17280tP A0y = AbstractC166987dD.A0y();
        if (AbstractC167017dG.A1b(A0y, A0y.A1n, C17280tP.A4G, 38)) {
            View[] viewArr = {this.A00, this.A01};
            ArrayList A1E = AbstractC166987dD.A1E();
            WG4.A03(this, WG4.A00, A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof ScalingTextureView) {
                    Object parent = view.getParent();
                    if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                        WeakHashMap weakHashMap = WG4.A01;
                        Drawable background = view.getBackground();
                        if ((background instanceof ColorDrawable) && (colorDrawable2 = (ColorDrawable) background) != null) {
                            i2 = colorDrawable2.getColor();
                        } else {
                            i2 = 0;
                        }
                        weakHashMap.put(view, Integer.valueOf(i2));
                        interfaceC09390do = WG4.A03;
                        view.setBackgroundColor(AbstractC167027dH.A01(interfaceC09390do));
                    }
                } else if (view instanceof RCTextView) {
                    WeakHashMap weakHashMap2 = WG4.A01;
                    Drawable background2 = view.getBackground();
                    if ((background2 instanceof ColorDrawable) && (colorDrawable3 = (ColorDrawable) background2) != null) {
                        i3 = colorDrawable3.getColor();
                    } else {
                        i3 = 0;
                    }
                    weakHashMap2.put(view, Integer.valueOf(i3));
                    interfaceC09390do = WG4.A04;
                    view.setBackgroundColor(AbstractC167027dH.A01(interfaceC09390do));
                }
            }
            int i4 = 0;
            do {
                View view2 = viewArr[i4];
                if (view2 != null) {
                    WeakHashMap weakHashMap3 = WG4.A01;
                    Drawable background3 = view2.getBackground();
                    if ((background3 instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background3) != null) {
                        i = colorDrawable.getColor();
                    } else {
                        i = 0;
                    }
                    weakHashMap3.put(view2, Integer.valueOf(i));
                    view2.setBackgroundColor(AbstractC167027dH.A01(WG4.A02));
                }
                i4++;
            } while (i4 < 2);
        }
    }

    @Override // com.instagram.showreel.composition.ui.IgShowreelCompositionView, X.InterfaceC115845Ly
    public final void E0l() {
        super.E0l();
        C17280tP A0y = AbstractC166987dD.A0y();
        if (AbstractC167017dG.A1b(A0y, A0y.A1n, C17280tP.A4G, 38)) {
            WG4 wg4 = WG4.A00;
            View[] viewArr = {this.A00, this.A01};
            ArrayList A1E = AbstractC166987dD.A1E();
            WG4.A03(this, wg4, A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof ScalingTextureView) {
                    Object parent = view.getParent();
                    if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                        Object orDefault = WG4.A01.getOrDefault(view, 0);
                        C14360o3.A07(orDefault);
                        view.setBackgroundColor(((Number) orDefault).intValue());
                    }
                } else if (view instanceof RCTextView) {
                    Object orDefault2 = WG4.A01.getOrDefault(view, 0);
                    C14360o3.A07(orDefault2);
                    view.setBackgroundColor(((Number) orDefault2).intValue());
                }
            }
            int i = 0;
            do {
                View view2 = viewArr[i];
                if (view2 != null) {
                    Object orDefault3 = WG4.A01.getOrDefault(view2, 0);
                    C14360o3.A07(orDefault3);
                    view2.setBackgroundColor(((Number) orDefault3).intValue());
                }
                i++;
            } while (i < 2);
        }
    }

    @Override // com.instagram.showreel.composition.ui.IgShowreelCompositionView
    public InterfaceC31147Dmq getCompositionController() {
        return getController();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IgProgressImageView igProgressImageView;
        String str;
        ImageUrl imageUrl;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A04) {
            this.A04 = true;
            C6QC videoView = getCompositionController().getVideoView();
            ImageUrl imageUrl2 = null;
            if (videoView != null) {
                igProgressImageView = videoView.A00;
            } else {
                igProgressImageView = null;
            }
            if (igProgressImageView != null && getController().A00 != null && getController().A01 != null) {
                C41181vS c41181vS = getController().A01;
                if (c41181vS != null) {
                    imageUrl = c41181vS.A08(getContext());
                } else {
                    imageUrl = null;
                }
                C41181vS c41181vS2 = getController().A01;
                if (c41181vS2 != null) {
                    imageUrl2 = c41181vS2.A06();
                }
                if (imageUrl != null && imageUrl2 != null) {
                    InterfaceC11380iw interfaceC11380iw = getController().A00;
                    if (interfaceC11380iw != null) {
                        videoView.A00.setUrlWithFallback(imageUrl, imageUrl2, interfaceC11380iw);
                        return;
                    }
                    return;
                }
                str = "Thumbnail or sized image url is null";
            } else {
                str = "Could not locate view by tag";
            }
            C0w9.A03("IgReelsShowreelCompositionView", str);
        }
    }

    @Override // com.instagram.showreel.composition.ui.IgShowreelCompositionView, X.InterfaceC115845Ly
    public final void reset() {
        super.reset();
        this.A04 = false;
        this.A05.clear();
    }

    public final void setInteractivityListener(InterfaceC139356Sq interfaceC139356Sq) {
        this.A02 = interfaceC139356Sq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgReelsShowreelCompositionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A05 = AbstractC166987dD.A1G();
        this.A06 = AbstractC09440dt.A01(new J8V(this, 20));
        AbstractC25234BEr.A1O(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgReelsShowreelCompositionView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A05 = AbstractC166987dD.A1G();
        this.A06 = AbstractC09440dt.A01(new J8V(this, 20));
        AbstractC25234BEr.A1O(this);
    }
}
