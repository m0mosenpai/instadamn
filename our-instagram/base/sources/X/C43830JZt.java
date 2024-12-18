package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryMediaGridView;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JZt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43830JZt {
    public static boolean A0U;
    public OXR A00;
    public com.instagram.creation.base.ui.mediatabbar.Tab A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final GridLayoutManager A09;
    public final C1I4 A0A;
    public final AbstractC59962oe A0B;
    public final UserSession A0C;
    public final C43835JZy A0D;
    public final InterfaceC195528ks A0E;
    public final C43852JaI A0F;
    public final C43854JaK A0G;
    public final C195448kk A0H;
    public final AnonymousClass841 A0I;
    public final C62882tR A0J;
    public final C4ZF A0K;
    public final ViewOnTouchListenerC195698lA A0L;
    public final C189058Yv A0M;
    public final C195428ki A0N;
    public final ArrayList A0O;
    public final boolean A0P;
    public final FragmentActivity A0Q;
    public final InterfaceC28041Xi A0R;
    public final C43839Ja2 A0S;
    public final InterfaceC16660sJ A0T;

    private final void A05(boolean z) {
        int color;
        int A09;
        Context context = this.A08;
        if (z) {
            color = C1QI.A0B(context, null).getDefaultColor();
        } else {
            color = context.getColor(R.color.grey_7_75_transparent);
        }
        SlideInAndOutIconView slideInAndOutIconView = this.A0G.A02.A04;
        slideInAndOutIconView.A02(color, color);
        if (z) {
            A09 = C1QI.A0C(context, null).getDefaultColor();
        } else {
            A09 = AbstractC167007dF.A09(context, R.attr.igds_color_icon_on_color);
        }
        slideInAndOutIconView.setTextColor(A09);
        slideInAndOutIconView.setIconColor(A09);
    }

    public final void A0I(C8Z4 c8z4) {
        C14360o3.A0B(c8z4, 0);
        String name = c8z4.getName();
        IgTextView igTextView = this.A0G.A02.A03.A01;
        if (igTextView != null) {
            igTextView.setText(name);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2 A[LOOP:0: B:34:0x00cc->B:36:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(java.lang.Integer r19) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43830JZt.A0J(java.lang.Integer):void");
    }

    public static final ArrayList A00(C43830JZt c43830JZt) {
        ArrayList A04 = c43830JZt.A0M.A04();
        InterfaceC28041Xi interfaceC28041Xi = c43830JZt.A0R;
        ArrayList arrayList = new ArrayList();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC28041Xi.apply(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r1.A0V.indexOf(r8) <= (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r14 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r0.equals(r8) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.gallery.model.GalleryItem r24, X.C43830JZt r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43830JZt.A01(com.instagram.common.gallery.model.GalleryItem, X.JZt, boolean):void");
    }

    public static final void A02(C43830JZt c43830JZt) {
        C47292Kv3 c47292Kv3 = c43830JZt.A0F.A00.A15;
        C195838lR c195838lR = c47292Kv3.A00;
        if (c195838lR != null) {
            c195838lR.A00();
        }
        c47292Kv3.A00 = null;
        c43830JZt.A0M.A0A(Integer.MAX_VALUE);
    }

    public static final void A03(C43830JZt c43830JZt) {
        if (C14360o3.A0K(c43830JZt.A01, AbstractC43884Jap.A00) && c43830JZt.A02 == C05F.A00 && A07(c43830JZt)) {
            List list = (List) c43830JZt.A0H.A00.A02();
            if (list == null) {
                list = C16930sl.A00;
            }
            c43830JZt.A0D.A09(c43830JZt.A0B().getName(), list, c43830JZt.A0T);
        }
    }

    public static final void A04(C43830JZt c43830JZt, boolean z) {
        if (C14360o3.A0K(c43830JZt.A01, AbstractC43884Jap.A00) && c43830JZt.A02 == C05F.A00) {
            C8Z4 A0B = c43830JZt.A0B();
            C43835JZy c43835JZy = c43830JZt.A0D;
            if (A0B == c43835JZy.A0J.A02()) {
                if (C18U.A06(C06090Tz.A05, c43830JZt.A0C, 36316645727146553L)) {
                    c43835JZy.A09 = true;
                    c43835JZy.A07();
                }
                List list = (List) c43835JZy.A0L.A02();
                if (list == null) {
                    list = C16930sl.A00;
                }
                c43835JZy.A09(c43830JZt.A0B().getName(), list, c43830JZt.A0T);
                if (z && c43835JZy.A06() != null) {
                    c43830JZt.A03 = true;
                    c43835JZy.EdU(c43835JZy.A06(), true, false);
                    c43830JZt.A03 = false;
                }
            }
        }
    }

    public static final boolean A06(GalleryItem galleryItem, C43830JZt c43830JZt) {
        UserSession userSession = c43830JZt.A0C;
        boolean A04 = galleryItem.A04();
        boolean A06 = galleryItem.A06();
        int A00 = LIK.A00(galleryItem);
        if (A04 && A06 && WGT.A07(userSession, A00)) {
            AbstractC59962oe abstractC59962oe = c43830JZt.A0B;
            AbstractC167017dG.A1N(userSession, abstractC59962oe);
            AbstractC208329Jr.A09(abstractC59962oe, userSession, "invalid_media_selected", "posts", null);
            AbstractC34763FTi.A00(abstractC59962oe.getActivity(), userSession);
            return true;
        }
        return false;
    }

    public static final boolean A08(C43830JZt c43830JZt) {
        if (!A0U && !AbstractC93174Ft.A02(AbstractC13330mJ.A00(c43830JZt.A08))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r0 != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        r6 = (r5 + r4) * 2;
        r0 = r0 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r0 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r8 != false) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a0. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0A() {
        /*
            r11 = this;
            androidx.recyclerview.widget.GridLayoutManager r9 = r11.A09
            int r7 = r9.A1a()
            android.view.View r10 = r9.A0d(r7)
            if (r10 == 0) goto Lc0
            X.8ks r1 = r11.A0E
            X.JZy r0 = r11.A0D
            java.util.List r0 = r0.A0R
            boolean r8 = X.AbstractC166987dD.A1b(r0)
            int r5 = r11.A06
            int r2 = r11.A07
            int r4 = r11.A05
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.3OO r0 = androidx.recyclerview.widget.RecyclerView.A05(r10)
            int r3 = r0.mItemViewType
            boolean r0 = r1 instanceof X.C43834JZx
            if (r0 == 0) goto L96
            X.JZx r1 = (X.C43834JZx) r1
            X.2zD r1 = r1.A07
            X.6wP r6 = r9.A01
            int r0 = r9.A00
            int r7 = r6.A02(r7, r0)
            int r2 = r2 + r4
            java.lang.Class<X.JaN> r0 = X.C43857JaN.class
            int r0 = r1.A01(r0)
            r6 = 0
            if (r3 == r0) goto L8e
            java.lang.Class<X.LZH> r0 = X.LZH.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L8e
            java.lang.Class<X.LZg> r0 = X.C48307LZg.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L8e
            java.lang.Class<X.8l0> r0 = X.C195608l0.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L8e
            java.lang.Class<X.8kz> r0 = X.C195598kz.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L8e
            java.lang.Class<X.LZf> r0 = X.C48306LZf.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L89
            java.lang.Class<X.LZG> r0 = X.LZG.class
            int r0 = r1.A01(r0)
            if (r3 != r0) goto L7b
            if (r7 != 0) goto L89
            r7 = 0
        L73:
            int r7 = r7 * r2
            int r6 = r6 + r7
        L75:
            int r0 = r10.getTop()
            int r6 = r6 - r0
            return r6
        L7b:
            java.lang.Class<X.LZh> r0 = X.C48308LZh.class
            int r0 = r1.A01(r0)
            if (r3 == r0) goto L73
            java.lang.Class<X.LZI> r0 = X.LZI.class
            r1.A01(r0)
            goto L73
        L89:
            int r6 = r5 + r4
            int r7 = r7 + (-1)
            goto L73
        L8e:
            if (r8 == 0) goto L73
            int r5 = r5 + r4
            int r6 = r5 * 2
            int r7 = r7 + (-2)
            goto L73
        L96:
            X.6wP r1 = r9.A01
            int r0 = r9.A00
            int r0 = r1.A02(r7, r0)
            int r2 = r2 + r4
            r6 = 0
            switch(r3) {
                case 0: goto Lb6;
                case 1: goto Laf;
                case 2: goto Lad;
                case 3: goto Laa;
                case 4: goto Lbd;
                case 5: goto Lb6;
                case 6: goto Lb6;
                case 7: goto Lb6;
                case 8: goto Lbd;
                default: goto La3;
            }
        La3:
            java.lang.String r0 = "Invalid view type"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        Laa:
            if (r0 == 0) goto Lb4
            goto Lb8
        Lad:
            if (r0 == 0) goto Lb4
        Laf:
            int r6 = r5 + r4
            int r0 = r0 + (-1)
            goto Lbd
        Lb4:
            r0 = 0
            goto Lbd
        Lb6:
            if (r8 == 0) goto Lbd
        Lb8:
            int r5 = r5 + r4
            int r6 = r5 * 2
            int r0 = r0 + (-2)
        Lbd:
            int r0 = r0 * r2
            int r6 = r6 + r0
            goto L75
        Lc0:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43830JZt.A0A():int");
    }

    public final C8Z4 A0B() {
        C8Z4 c8z4 = (C24164Ann) this.A0D.A0J.A02();
        if (c8z4 == null) {
            c8z4 = this.A0M.A01;
        }
        return c8z4;
    }

    public final ArrayList A0C() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(A00(this));
        arrayList.addAll(C9KQ.A01((List) this.A0H.A06.getValue()));
        arrayList.addAll(A00(this));
        return arrayList;
    }

    public final void A0D() {
        C30R c30r;
        if (!this.A04 && A0L() && !this.A0P && this.A0E.getItemCount() > 0) {
            this.A04 = true;
            SlideInAndOutIconView slideInAndOutIconView = this.A0G.A02.A04;
            slideInAndOutIconView.setVisibility(0);
            C4ZF c4zf = this.A0K;
            WeakReference A16 = AbstractC25225BEi.A16(slideInAndOutIconView);
            java.util.Set set = c4zf.A07;
            set.clear();
            set.add(A16);
            Context context = this.A08;
            slideInAndOutIconView.setIcon(context.getDrawable(R.drawable.instagram_carousel_pano_outline_16));
            slideInAndOutIconView.setIconColor(context.getColor(AbstractC53242c7.A05(context)));
            String A0p = AbstractC166997dE.A0p(context, 2131967895);
            slideInAndOutIconView.setText(A0p);
            AbstractC56952jT.A04(slideInAndOutIconView, C05F.A06);
            slideInAndOutIconView.setContentDescription(A0p);
            slideInAndOutIconView.A03 = C3WD.END;
            slideInAndOutIconView.setAccessibilityDelegate(new C50691MZj(this, 0));
            C43835JZy c43835JZy = this.A0D;
            A05(c43835JZy.A07);
            ViewOnClickListenerC48063LPo.A00(slideInAndOutIconView, 7, this);
            if (!c43835JZy.A07 && AbstractC19730y1.A00(AbstractC12960li.A00).A00.getInt("sidecar_button_nux_clicks", 0) < 3) {
                c30r = C30R.A05;
            } else {
                c30r = C30R.A04;
            }
            c4zf.A02(c30r);
        }
        A0F();
    }

    public final void A0E() {
        com.instagram.creation.base.ui.mediatabbar.Tab tab = this.A01;
        if (((tab != null && tab.equals(AbstractC43884Jap.A00)) || this.A0P) && !A08(this)) {
            if (AbstractC93174Ft.A03(this.A08)) {
                A02(this);
            } else {
                if (!(!A08(this))) {
                    return;
                }
                AbstractC93174Ft.A01(this.A0Q, new C44325JiI(this, 2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r3.A14.A02 != r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F() {
        /*
            r6 = this;
            X.JaK r0 = r6.A0G
            X.JaJ r5 = r0.A02
            boolean r0 = r6.A0P
            r4 = 0
            if (r0 != 0) goto L65
            com.instagram.common.ui.base.IgTextView r0 = r5.A00
            boolean r0 = r0.isSelected()
            if (r0 != 0) goto L65
            com.instagram.common.ui.base.IgTextView r0 = r5.A01
            boolean r0 = r0.isSelected()
            if (r0 != 0) goto L65
            boolean r0 = r6.A0L()
            if (r0 == 0) goto L65
            X.JaI r0 = r6.A0F
            X.JZs r3 = r0.A00
            com.instagram.common.gallery.model.GalleryItem r2 = r3.A0B
            if (r2 == 0) goto L50
            boolean r0 = r2.A01()
            if (r0 != 0) goto L3f
            java.lang.Integer r1 = r2.A09
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 == r0) goto L3f
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L50
            com.instagram.common.gallery.Draft r0 = r2.A02
            if (r0 == 0) goto L50
            boolean r0 = r0.A08
            if (r0 != 0) goto L50
        L3f:
            com.instagram.common.gallery.model.GalleryItem r0 = r3.A0B
            X.C14360o3.A0A(r0)
            java.lang.Integer r0 = r0.A09
            java.lang.Integer r1 = X.C05F.A01
            if (r0 != r1) goto L65
            X.JZt r0 = r3.A14
            java.lang.Integer r0 = r0.A02
            if (r0 == r1) goto L65
        L50:
            com.instagram.common.session.UserSession r3 = r6.A0C
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319463225892301(0x81085c00031dcd, double:3.031913018569566E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L65
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r5.A04
            r0.setVisibility(r4)
            return
        L65:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = r5.A04
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43830JZt.A0F():void");
    }

    public final void A0G(GalleryItem galleryItem, Integer num) {
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            UserSession userSession = this.A0C;
            AbstractC59962oe abstractC59962oe = this.A0B;
            C43835JZy c43835JZy = this.A0D;
            AbstractC208329Jr.A02(abstractC59962oe, remoteMedia, userSession, num, "posts", AbstractC31172DnG.A19(c43835JZy.A0V), c43835JZy.A07);
        }
    }

    public final void A0H(Folder folder, boolean z) {
        C43835JZy c43835JZy = this.A0D;
        c43835JZy.A08(null);
        if (A07(this)) {
            if (AbstractC166997dE.A0c(C06090Tz.A05, this.A0C, 36316645727670848L).booleanValue()) {
                A03(this);
                if (folder == null && !z) {
                    c43835JZy.EYj(folder.A01(), folder.getName());
                    return;
                }
            }
        }
        c43835JZy.A09("", AbstractC166987dD.A1E(), C43885Jaq.A00);
        if (folder == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00d1, code lost:
    
        if (r12 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0201, code lost:
    
        if ((!((X.MX5) r5.A19).A01.A0L) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0290, code lost:
    
        if (r8.A0O.A00.A02 == X.C05F.A0N) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43830JZt.A0K(boolean, boolean):void");
    }

    public final boolean A0L() {
        AnonymousClass841 anonymousClass841 = this.A0I;
        if (anonymousClass841.CLO()) {
            return C36A.A04(this.A0C);
        }
        if (anonymousClass841.AGq() != EnumC69983Ch.A05 && anonymousClass841.AGq() != EnumC69983Ch.A06 && anonymousClass841.AGq() != EnumC69983Ch.A03) {
            return true;
        }
        return false;
    }

    public static final boolean A07(C43830JZt c43830JZt) {
        C8Z4 A0B = c43830JZt.A0B();
        if (A0B.CBv() == C05F.A00 && A0B.BF3() == -1) {
            return true;
        }
        return false;
    }

    public static final boolean A09(C43830JZt c43830JZt, AnonymousClass841 anonymousClass841) {
        if (anonymousClass841.AGq() != EnumC69983Ch.A05 && anonymousClass841.AGq() != EnumC69983Ch.A06 && anonymousClass841.AGq() != EnumC69983Ch.A03) {
            if (!anonymousClass841.CLO() || C36A.A05(c43830JZt.A0C)) {
                MediaCaptureConfig mediaCaptureConfig = ((MX5) anonymousClass841).A01.A09;
                if (mediaCaptureConfig != null && mediaCaptureConfig.A07) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.2pI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, X.2pF] */
    public C43830JZt(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, C43848JaC c43848JaC, C43852JaI c43852JaI, C43854JaK c43854JaK, AnonymousClass841 anonymousClass841, MQK mqk, C195428ki c195428ki, Integer num, int i, boolean z, boolean z2) {
        int A01;
        Integer num2;
        Integer num3;
        Integer num4;
        boolean A1V = AbstractC167007dF.A1V(fragmentActivity);
        C14360o3.A0B(c195428ki, 6);
        this.A0C = userSession;
        this.A0Q = fragmentActivity;
        this.A0B = abstractC59962oe;
        this.A08 = context;
        this.A0I = anonymousClass841;
        this.A0N = c195428ki;
        this.A0G = c43854JaK;
        this.A0F = c43852JaI;
        this.A0P = z;
        Integer num5 = C05F.A00;
        this.A02 = num5;
        this.A0O = AbstractC166987dD.A1E();
        int A0G = AbstractC53242c7.A0G(context, R.attr.mediaPickerSpacing);
        this.A05 = A0G;
        C43839Ja2 c43839Ja2 = new C43839Ja2();
        this.A0S = c43839Ja2;
        this.A0J = new C62882tR(fragmentActivity, c43839Ja2, userSession, 23592983);
        C50260MHp c50260MHp = new C50260MHp(this, 47);
        this.A0T = c50260MHp;
        this.A06 = AbstractC43594JPz.A05(context);
        this.A0H = AbstractC195438kj.A00(userSession);
        RecyclerView recyclerView = c43854JaK.A00;
        recyclerView.setItemAnimator(null);
        if (AbstractC55822hN.A00(userSession) == num5) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318483973347547L);
            if (Boolean.valueOf(A06) != null && A06) {
                recyclerView.setNestedScrollingEnabled(A1V);
            }
        }
        if (recyclerView instanceof GalleryMediaGridView) {
            C44286Jhc.A00(recyclerView, this, 7);
            GridLayoutManager gridLayoutManager = ((GalleryMediaGridView) recyclerView).A01;
            this.A09 = gridLayoutManager;
            int i2 = gridLayoutManager.A00;
            A01 = (AbstractC13880nE.A0A(context) - (A0G * (i2 - 1))) / i2;
        } else {
            recyclerView.A10(new C195638l4(A0G, false));
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context, num.intValue() != 0 ? 4 : 3);
            this.A09 = gridLayoutManager2;
            recyclerView.setLayoutManager(gridLayoutManager2);
            recyclerView.setVisibility(0);
            int i3 = gridLayoutManager2.A00;
            A01 = (AbstractC188878Yd.A01(context) - (A0G * (i3 - 1))) / i3;
        }
        this.A07 = A01;
        C8SF c8sf = new C8SF(fragmentActivity, userSession, num5, A01, A01, false);
        C188958Yl c188958Yl = new C188958Yl(AbstractC018607g.A00(fragmentActivity), c8sf);
        c188958Yl.A04 = userSession;
        c188958Yl.A07 = new C43856JaM(this, c43852JaI);
        c188958Yl.A0B = A1V;
        c188958Yl.A0D = A1V;
        c188958Yl.A09 = A1V;
        if (new Object().A00(userSession)) {
            ?? obj = new Object();
            c188958Yl.A06 = obj;
            c188958Yl.A0C = A1V;
            c188958Yl.A08 = new C49656Lwn(context, userSession, obj);
        }
        if (A09(this, anonymousClass841)) {
            c188958Yl.A03 = EnumC188968Ym.A04;
        }
        c188958Yl.A01 = new C189038Yt(userSession, this.A07);
        C189028Ys c189028Ys = new C189028Ys(c188958Yl);
        C43888Jav c43888Jav = new C43888Jav(this, 3);
        int i4 = this.A09.A00;
        C43835JZy c43835JZy = new C43835JZy(fragmentActivity, c43888Jav, userSession, mqk, i4, i4, i, this.A07, z, AbstractC14490oL.A0E(this.A08));
        this.A0D = c43835JZy;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321022299218998L)) {
            num2 = num5;
        } else {
            num2 = C05F.A01;
        }
        if (C18U.A06(c06090Tz, userSession, 36321022299218998L)) {
            num3 = C05F.A01;
        } else {
            num3 = num5;
        }
        C206279Bk c206279Bk = new C206279Bk(num5, num5, num5, num2, num3);
        if (C18U.A06(c06090Tz, userSession, 36331240026031325L)) {
            num4 = C05F.A01;
        } else {
            num4 = num5;
        }
        C43834JZx c43834JZx = new C43834JZx(context, new C9BW(4, c206279Bk, new C206259Bi(num4, num5, C05F.A01, (Integer) null)), c43839Ja2, c189028Ys.A06, c8sf, userSession, c43835JZy, new C43858JaO(this), z2);
        this.A0E = c43834JZx;
        GridLayoutManager gridLayoutManager3 = this.A09;
        C66362zD c66362zD = c43834JZx.A07;
        int i5 = gridLayoutManager3.A00;
        C14360o3.A0B(c66362zD, 0);
        gridLayoutManager3.A01 = new C43889Jaw(c66362zD, i5, 0);
        c43834JZx.A00 = c50260MHp;
        boolean A00 = AbstractC193398hK.A00(fragmentActivity, userSession);
        boolean z3 = c43835JZy.A0B;
        c43835JZy.A0B = A00;
        if (z3 != A00) {
            c43835JZy.A07();
        }
        this.A0M = new C189058Yv(fragmentActivity, null, c43835JZy, c189028Ys);
        C195658l6 c195658l6 = new C195658l6(recyclerView);
        ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = new ViewOnTouchListenerC195698lA(c43854JaK.A01, userSession, c43835JZy, new C195678l8(c43835JZy, c195658l6, c43834JZx), c195658l6, c43834JZx);
        this.A0L = viewOnTouchListenerC195698lA;
        viewOnTouchListenerC195698lA.A01 = 750L;
        this.A0K = new C4ZF();
        recyclerView.setAdapter(c66362zD);
        C195448kk A002 = AbstractC195438kj.A00(userSession);
        AbstractC43593JPy.A1E(abstractC59962oe, AbstractC31172DnG.A0E(A002.A06), new BAO(24, c43848JaC, this), 20);
        this.A0A = new C44220JgP(this, 4);
        c43835JZy.A08(null);
        AbstractC43593JPy.A1E(abstractC59962oe, c43835JZy.A0L, new C50260MHp(this, 41), 20);
        AbstractC43593JPy.A1E(abstractC59962oe, c43835JZy.A0J, new C50260MHp(this, 42), 20);
        AbstractC43593JPy.A1E(abstractC59962oe, c43835JZy.A0K, new C50260MHp(this, 43), 20);
        if (C18U.A06(c06090Tz, userSession, 36316645727146553L)) {
            A002.A03("posts");
        }
        if (AbstractC166997dE.A0c(c06090Tz, userSession, 36316645727670848L).booleanValue()) {
            AbstractC43593JPy.A1E(abstractC59962oe, A002.A00, new C50260MHp(this, 44), 20);
            A002.A04("posts");
        }
        this.A0R = new C208629Kw(this, 0);
        UserSession userSession2 = this.A0C;
        if (C151866sW.A02(userSession2, false) != C05F.A0C) {
            AbstractC59962oe abstractC59962oe2 = this.A0B;
            C44093JeI c44093JeI = new C44093JeI(this, 6);
            C25621Ms A0M = AbstractC31177DnL.A0M(userSession2);
            A0M.A0B("content_scheduling/get_scheduled_content/");
            A0M.A0P(null, K7v.class, C44066Jdr.class, false);
            C1ON A0N = A0M.A0N();
            A0N.A00 = c44093JeI;
            abstractC59962oe2.schedule(A0N);
        }
        if (A08(this)) {
            c43852JaI.A00(new C44312Ji3(this));
        }
    }
}
