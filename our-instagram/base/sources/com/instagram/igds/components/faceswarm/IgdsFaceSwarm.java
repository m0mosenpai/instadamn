package com.instagram.igds.components.faceswarm;

import X.AbstractC001800i;
import X.AbstractC06950Ym;
import X.AbstractC125325le;
import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC16960so;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AmS;
import X.AnonymousClass001;
import X.BR8;
import X.BR9;
import X.BRA;
import X.C00O;
import X.C09530e4;
import X.C0eB;
import X.C14360o3;
import X.C1XM;
import X.C24083AmT;
import X.C25547BRj;
import X.C3PZ;
import X.C51761Mtk;
import X.C57251PbZ;
import X.C7I;
import X.C7Y;
import X.C9C2;
import X.C9EM;
import X.D2M;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.O0B;
import X.RunnableC56990PQg;
import X.XNN;
import X.XNO;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IgdsFaceSwarm extends FrameLayout {
    public static final List A0K = AbstractC16960so.A1Q(Float.valueOf(32.0f), Float.valueOf(24.0f), Float.valueOf(20.0f), Float.valueOf(16.0f));
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Runnable A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public float A0B;
    public int A0C;
    public Drawable A0D;
    public Drawable A0E;
    public View A0F;
    public final List A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final boolean A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsFaceSwarm(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        this.A0C = 4;
        this.A09 = true;
        this.A0A = true;
        this.A0B = 1.0f;
        this.A0J = AbstractC13620mo.A02(context);
        this.A08 = true;
        this.A0G = new ArrayList();
        this.A0H = C1XM.A00(new C9EM(this, 26));
        this.A0I = C1XM.A00(new C9EM(context, 27));
        View.inflate(context, R.layout.igds_faceswarm, this);
        this.A0F = requireViewById(R.id.faceswarm_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1R, 0, 0);
            C14360o3.A07(obtainStyledAttributes);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(6, (int) AbstractC13880nE.A00(context, 72.0f));
            this.A09 = obtainStyledAttributes.getBoolean(3, true);
            this.A0A = obtainStyledAttributes.getBoolean(5, true);
            this.A06 = obtainStyledAttributes.getInt(7, 0);
            this.A05 = obtainStyledAttributes.getInt(2, 0);
            this.A04 = obtainStyledAttributes.getInt(4, 0);
            this.A08 = obtainStyledAttributes.getBoolean(0, true);
            this.A02 = context.getColor(obtainStyledAttributes.getResourceId(1, AbstractC53242c7.A0H(context, R.attr.igds_color_pill_background)));
            obtainStyledAttributes.recycle();
            A03();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A0D;
        Drawable drawable2 = this.A0E;
        if (drawable != null) {
            A04(canvas, drawable, this.A00, this.A01, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            if (drawable2 == null) {
                return;
            }
            Rect bounds = drawable2.getBounds();
            C14360o3.A07(bounds);
            A04(canvas, drawable2, this.A00, this.A01, bounds.right - bounds.left, bounds.bottom - bounds.top);
        }
    }

    public final void setFaceSwarmItems(List list, InterfaceC11380iw interfaceC11380iw) {
        int i;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        List A0d = AbstractC001800i.A0d(list, this.A0C);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0d, 10));
        Iterator it = A0d.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9C2) it.next()).A01());
        }
        boolean z = this.A08;
        int size = arrayList.size();
        if (z) {
            List list2 = this.A0G;
            int i2 = -1;
            if (size == list2.size()) {
                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(arrayList.indexOf(((BRA) it2.next()).A00.A01())));
                }
                if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        if (((Number) it3.next()).intValue() == -1 && (i3 = i3 + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                    if (i3 != 0) {
                        if (i3 == 1) {
                            Iterator it4 = arrayList2.iterator();
                            int i4 = 0;
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((Number) it4.next()).intValue() == -1) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    i4 = -1;
                                    break;
                                }
                            }
                            BRA bra = (BRA) list2.get(i4);
                            int A00 = A00(arrayList);
                            if (A00 == -1) {
                                return;
                            }
                            A02();
                            C9C2 c9c2 = (C9C2) list.get(A00);
                            CircularImageView circularImageView = bra.A01;
                            list2.set(i4, new BRA(c9c2, circularImageView));
                            this.A07 = new D2M(interfaceC11380iw, bra, list, A00);
                            C57251PbZ c57251PbZ = new C57251PbZ(7, arrayList, this);
                            AbstractC125325le A0F = AbstractC125325le.A01(circularImageView, 0).A0E(O0B.A00).A0F(true);
                            A0F.A0O(circularImageView.getRotation(), circularImageView.getRotation());
                            A0F.A0P(0.5f, -1.0f);
                            A0F.A0Q(0.5f, -1.0f);
                            A0F.A05 = new C24083AmT(c57251PbZ);
                            A0F.A0H();
                            return;
                        }
                        A06(A0d, interfaceC11380iw);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(A0d, 10));
                Iterator it5 = A0d.iterator();
                while (it5.hasNext()) {
                    Object obj = ((C9C2) it5.next()).A01;
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    arrayList3.add(Integer.valueOf(i));
                }
                ArrayList arrayList4 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(((BRA) it6.next()).A00.A01());
                }
                if (arrayList3.equals(arrayList4)) {
                    return;
                }
                A05(this, arrayList);
                return;
            }
            if (arrayList.size() == list2.size() + 1) {
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        if (!arrayList.contains(((BRA) it7.next()).A00.A01())) {
                        }
                    }
                }
                int A002 = A00(arrayList);
                CircularImageView circularImageView2 = (CircularImageView) getImageViews().get(list2.size());
                C14360o3.A07(getContext());
                int A003 = (int) (((int) AbstractC13880nE.A00(r1, ((Number) A0K.get(A002)).floatValue())) * this.A0B);
                C3PZ.A01((C9C2) list.get(A002), interfaceC11380iw, circularImageView2);
                circularImageView2.setScaleX(0.1f);
                circularImageView2.setScaleY(0.1f);
                float f = A003 / 2.0f;
                circularImageView2.setX((getWidth() / 2) - f);
                circularImageView2.setY((getHeight() / 2) - f);
                circularImageView2.getLayoutParams().height = A003;
                circularImageView2.getLayoutParams().width = A003;
                circularImageView2.setAlpha(0.0f);
                circularImageView2.setRotation(-this.A0F.getRotation());
                circularImageView2.setVisibility(0);
                A02();
                list2.add(A002, new BRA((C9C2) list.get(A002), circularImageView2));
                circularImageView2.post(new RunnableC56990PQg(this, arrayList));
                return;
            }
            if (arrayList.size() == list2.size() - 1) {
                ArrayList arrayList5 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(Integer.valueOf(arrayList.indexOf(((BRA) it8.next()).A00.A01())));
                }
                if (!(arrayList5 instanceof Collection) || !arrayList5.isEmpty()) {
                    Iterator it9 = arrayList5.iterator();
                    int i5 = 0;
                    while (it9.hasNext()) {
                        if (((Number) it9.next()).intValue() == -1 && (i5 = i5 + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                    if (i5 == 1) {
                        Iterator it10 = arrayList5.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it10.hasNext()) {
                                break;
                            }
                            if (((Number) it10.next()).intValue() == -1) {
                                i2 = i6;
                                break;
                            }
                            i6++;
                        }
                        BRA bra2 = (BRA) list2.get(i2);
                        A02();
                        CircularImageView circularImageView3 = bra2.A01;
                        float width = getWidth() / 2;
                        float height = getHeight() / 2;
                        int width2 = circularImageView3.getWidth() / 2;
                        AbstractC125325le A0F2 = AbstractC125325le.A01(circularImageView3, 0).A0F(true);
                        float f2 = width2;
                        A0F2.A0P(0.0f, f2);
                        A0F2.A0Q(0.0f, f2);
                        A0F2.A0M(1.0f, 0.0f);
                        A0F2.A0J(width - f2);
                        A0F2.A0K(height - f2);
                        A0F2.A0O(circularImageView3.getRotation(), circularImageView3.getRotation());
                        A0F2.A05 = new AmS(circularImageView3);
                        A0F2.A0H();
                        list2.remove(i2);
                        A05(this, arrayList);
                        return;
                    }
                }
            }
            A06(A0d, interfaceC11380iw);
            A06(list, interfaceC11380iw);
            return;
        }
        List list3 = this.A0G;
        if (size == list3.size()) {
            ArrayList arrayList6 = new ArrayList(AbstractC06950Ym.A1E(list3, 10));
            Iterator it11 = list3.iterator();
            while (it11.hasNext()) {
                arrayList6.add(Integer.valueOf(arrayList.indexOf(((BRA) it11.next()).A00.A01())));
            }
            if ((arrayList6 instanceof Collection) && arrayList6.isEmpty()) {
                return;
            }
            Iterator it12 = arrayList6.iterator();
            int i7 = 0;
            while (it12.hasNext()) {
                if (((Number) it12.next()).intValue() == -1 && (i7 = i7 + 1) < 0) {
                    AbstractC16960so.A1T();
                    throw C00O.createAndThrow();
                }
            }
            if (i7 == 0) {
                return;
            }
        }
        A06(A0d, interfaceC11380iw);
    }

    public final void setImageUrls(List list, InterfaceC11380iw interfaceC11380iw) {
        C9C2 c9c2;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        List<ImageUrl> A0d = AbstractC001800i.A0d(list, this.A0C);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0d, 10));
        for (ImageUrl imageUrl : A0d) {
            if (imageUrl != null) {
                c9c2 = new C9C2((Drawable) null, imageUrl, (String) null, 6);
            } else {
                c9c2 = new C9C2(getPlaceholderDrawable(), (ImageUrl) null, (String) null, 5);
            }
            arrayList.add(c9c2);
        }
        setFaceSwarmItems(arrayList, interfaceC11380iw);
    }

    public final void setPreferredFourItemTemplate(C7Y c7y) {
        C14360o3.A0B(c7y, 0);
        this.A05 = c7y.A00;
    }

    public final void setPreferredThreeItemTemplate(C7I c7i) {
        C14360o3.A0B(c7i, 0);
        this.A06 = c7i.A00;
    }

    private final void A02() {
        Runnable runnable = this.A07;
        if (runnable != null) {
            runnable.run();
        }
        this.A07 = null;
        List imageViews = getImageViews();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(imageViews, 10));
        Iterator it = imageViews.iterator();
        while (it.hasNext()) {
            AbstractC125325le A01 = AbstractC125325le.A01((View) it.next(), 0);
            A01.A0G();
            arrayList.add(A01);
        }
        AbstractC125325le.A01(this.A0F, 0).A0G();
    }

    public static final void A05(IgdsFaceSwarm igdsFaceSwarm, List list) {
        List list2 = igdsFaceSwarm.A0G;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(list.indexOf(((BRA) it.next()).A00.A01())));
        }
        float f = igdsFaceSwarm.A0B;
        int i = igdsFaceSwarm.A04;
        Map map = XNN.A00;
        String A0P = AbstractC001800i.A0P("", "", "", arrayList, null);
        for (XNO xno : XNO.values()) {
            if (C14360o3.A0K(xno.A00, A0P)) {
                C25547BRj c25547BRj = (C25547BRj) XNN.A00.get(xno);
                if (c25547BRj != null) {
                    C25547BRj A01 = XNN.A01(c25547BRj, f, i);
                    ArrayList arrayList2 = new ArrayList();
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        BRA bra = (BRA) list2.get(i2);
                        BR8 br8 = (BR8) ((List) A01.A01).get(i2);
                        CircularImageView circularImageView = bra.A01;
                        C25547BRj c25547BRj2 = new C25547BRj(new Point((int) circularImageView.getX(), (int) circularImageView.getY()), circularImageView.getWidth(), 5);
                        Context context = igdsFaceSwarm.getContext();
                        C14360o3.A07(context);
                        float A00 = AbstractC13880nE.A00(context, br8.A00);
                        Point point = br8.A02;
                        arrayList2.add(new C51761Mtk(38, c25547BRj2, new C25547BRj(new Point((int) AbstractC13880nE.A04(context, point.x), (int) AbstractC13880nE.A04(context, point.y)), A00, 5)));
                    }
                    View view = igdsFaceSwarm.A0F;
                    float f2 = A01.A00;
                    C14360o3.A0B(view, 2);
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        CircularImageView circularImageView2 = ((BRA) list2.get(i3)).A01;
                        C25547BRj c25547BRj3 = (C25547BRj) ((C51761Mtk) arrayList2.get(i3)).A02;
                        C25547BRj c25547BRj4 = (C25547BRj) ((C51761Mtk) arrayList2.get(i3)).A00;
                        float f3 = c25547BRj4.A00;
                        float f4 = c25547BRj3.A00;
                        float f5 = f3 / f4;
                        Point point2 = (Point) c25547BRj4.A01;
                        float f6 = (f3 - f4) * 0.5f;
                        AbstractC125325le A0E = AbstractC125325le.A00(circularImageView2).A0E(O0B.A00);
                        A0E.A0P(f5, -1.0f);
                        A0E.A0Q(f5, -1.0f);
                        A0E.A0J(point2.x + f6);
                        A0E.A0K(point2.y + f6);
                        A0E.A0O(circularImageView2.getRotation(), -f2);
                        A0E.A0M(circularImageView2.getAlpha(), 1.0f);
                        A0E.A0H();
                    }
                    AbstractC125325le A0E2 = AbstractC125325le.A00(view).A0E(O0B.A00);
                    A0E2.A0O(view.getRotation(), f2);
                    A0E2.A0H();
                    return;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("IgdsFaceSwarm: Invalid template key for rank description ", A0P));
            }
        }
        throw new IllegalArgumentException("IgdsFaceSwarm: Given rank list does not match any template");
    }

    private final void A06(List list, InterfaceC11380iw interfaceC11380iw) {
        this.A0G.clear();
        C25547BRj A00 = XNN.A00(this.A0B, list.size(), this.A06, this.A05, this.A04);
        A02();
        List<View> imageViews = getImageViews();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(imageViews, 10));
        for (View view : imageViews) {
            view.setVisibility(8);
            view.setRotation(0.0f);
            arrayList.add(C0eB.A00);
        }
        View view2 = this.A0F;
        view2.setRotation(A00.A00);
        view2.post(new BR9(A00, interfaceC11380iw, this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List getImageViews() {
        return (List) this.A0H.getValue();
    }

    private final Drawable getPlaceholderDrawable() {
        return (Drawable) this.A0I.getValue();
    }

    public final Drawable getBottomBadgeDrawable() {
        return this.A0D;
    }

    public final void setBackgroundCircleColor(int i) {
        this.A02 = i;
        A03();
    }

    public final void setBottomBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.A0D = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            invalidate();
        }
    }

    public final void setCustomSizePx(int i) {
        this.A03 = i;
        A03();
    }

    public final void setIsContained(boolean z) {
        this.A09 = z;
        A03();
    }

    public final void setPresenceBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.A0E = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            invalidate();
        }
    }

    public final void setScaleUpWhenNotContained(boolean z) {
        this.A0A = z;
        A03();
    }

    private final int A00(List list) {
        int i = 0;
        for (Object obj : list) {
            List list2 = this.A0G;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BRA) it.next()).A00.A01());
            }
            if (!(!arrayList.contains(obj))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    private final void A03() {
        View view;
        Context context = getContext();
        C14360o3.A07(context);
        C09530e4 A00 = C3PZ.A00(AbstractC13880nE.A01(context, this.A03), this.A09, this.A0A);
        this.A0B = ((Number) A00.A00).floatValue();
        this.A0C = ((Number) A00.A01).intValue();
        if (this.A09) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(this.A02);
            view = this.A0F;
            view.setBackground(shapeDrawable);
        } else {
            view = this.A0F;
            view.setBackground(null);
        }
        float f = this.A0B;
        if (f != 1.0f) {
            int A002 = (int) AbstractC13880nE.A00(context, f * 72.0f);
            view.setLayoutParams(new FrameLayout.LayoutParams(A002, A002));
        }
        this.A00 = AbstractC13880nE.A00(context, 10.0f) * this.A0B;
        this.A01 = AbstractC13880nE.A00(context, 10.0f) * this.A0B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r5.A0A == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(android.graphics.Canvas r6, android.graphics.drawable.Drawable r7, float r8, float r9, int r10, int r11) {
        /*
            r5 = this;
            r4 = 1022739087(0x3cf5c28f, float:0.03)
            r6.save()
            boolean r0 = r5.A09
            if (r0 != 0) goto L11
            boolean r0 = r5.A0A
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            if (r0 != 0) goto L13
        L11:
            r1 = 1065353216(0x3f800000, float:1.0)
        L13:
            int r0 = r5.getWidth()
            float r3 = (float) r0
            float r3 = r3 * r1
            int r0 = r5.getHeight()
            float r2 = (float) r0
            float r2 = r2 * r1
            float r0 = (float) r11
            float r1 = r2 - r0
            float r2 = r2 * r4
            float r1 = r1 - r2
            float r1 = r1 + r9
            boolean r0 = r5.A0J
            if (r0 == 0) goto L35
            float r3 = r3 * r4
            float r3 = r3 - r8
        L2b:
            r6.translate(r3, r1)
            r7.draw(r6)
            r6.restore()
            return
        L35:
            float r0 = (float) r10
            float r0 = r3 - r0
            float r3 = r3 * r4
            float r0 = r0 - r3
            float r3 = r0 + r8
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.faceswarm.IgdsFaceSwarm.A04(android.graphics.Canvas, android.graphics.drawable.Drawable, float, float, int, int):void");
    }

    public final void setCustomSizeDp(int i) {
        Context context = getContext();
        C14360o3.A07(context);
        this.A03 = (int) AbstractC13880nE.A04(context, i);
        A03();
    }

    public final void setAdditionalRotation(int i) {
        this.A04 = i;
    }

    public final void setAnimateChanges(boolean z) {
        this.A08 = z;
    }

    public final void setBottomBadgeAdditionalHorizontalOffset(float f) {
        this.A00 = f;
    }

    public final void setBottomBadgeAdditionalVerticalOffset(float f) {
        this.A01 = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsFaceSwarm(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsFaceSwarm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsFaceSwarm(Context context) {
        this(context, null, 0, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ IgdsFaceSwarm(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
