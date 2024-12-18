package com.instagram.tagging.widget;

import X.AbstractC125325le;
import X.AbstractC41370ISx;
import X.AbstractC50789Mc6;
import X.AbstractC54237NyI;
import X.AbstractC80603ip;
import X.AnonymousClass426;
import X.C104694nZ;
import X.C38321qM;
import X.C39384HaQ;
import X.C39385HaR;
import X.C39386HaS;
import X.C51750MtZ;
import X.C57746PjZ;
import X.C72276XaZ;
import X.C73482YFf;
import X.C75113Zb;
import X.C76733cL;
import X.C80223iB;
import X.EnumC53319Nhv;
import X.EnumC53372NjN;
import X.J0L;
import X.OXO;
import X.PHG;
import X.PHI;
import X.PHJ;
import X.PU8;
import X.RunnableC57011PRc;
import X.YN7;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.facebook.R;
import com.instagram.api.schemas.FBTagType;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class TagsLayout extends ViewGroup {
    public YN7 A00;
    public boolean A01;

    public void A05(AbstractC50789Mc6 abstractC50789Mc6) {
    }

    private List getOverlaps() {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (!hashSet.contains(Integer.valueOf(i))) {
                hashSet.add(Integer.valueOf(i));
                ArrayList arrayList = new ArrayList(8);
                linkedList.add(arrayList);
                arrayList.add(getChildAt(i));
                Rect rect = new Rect(((AbstractC50789Mc6) getChildAt(i)).getDrawingBounds());
                for (int i2 = i + 1; i2 < childCount; i2++) {
                    if (((AbstractC50789Mc6) getChildAt(i2)).A04 && Rect.intersects(rect, ((AbstractC50789Mc6) getChildAt(i2)).getDrawingBounds())) {
                        rect.union(((AbstractC50789Mc6) getChildAt(i2)).getDrawingBounds());
                        hashSet.add(Integer.valueOf(i2));
                        arrayList.add(getChildAt(i2));
                    }
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r23, 36323040933456763L) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50789Mc6 A02(com.instagram.common.session.UserSession r23, X.C38321qM r24, com.instagram.tagging.model.Tag r25, com.instagram.user.model.User r26, boolean r27, boolean r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.widget.TagsLayout.A02(com.instagram.common.session.UserSession, X.1qM, com.instagram.tagging.model.Tag, com.instagram.user.model.User, boolean, boolean, boolean, boolean):X.Mc6");
    }

    public final void A03() {
        int i;
        if (this.A01) {
            int[] iArr = new int[35];
            int[] iArr2 = new int[36];
            for (List list : getOverlaps()) {
                Collections.sort(list, new PU8(this));
                iArr2[0] = -1;
                int i2 = 0;
                while (i2 < list.size()) {
                    int[] A00 = A00(list, i2, i2);
                    int i3 = i2;
                    while (true) {
                        i = A00[0];
                        if (i < iArr2[i3]) {
                            i3 = iArr[i3 - 1];
                            A00 = A00(list, i3, i2);
                        }
                    }
                    int i4 = i2 + 1;
                    iArr2[i4] = i + A00[1];
                    iArr[i2] = i3;
                    i2 = i4;
                }
            }
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            ((AbstractC50789Mc6) getChildAt(i5)).A04();
        }
    }

    public void setTags(List list, C80223iB c80223iB, C75113Zb c75113Zb, int i, boolean z, boolean z2, UserSession userSession) {
        AbstractC50789Mc6 abstractC50789Mc6;
        String str;
        list.getClass();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z3 = c80223iB.A08;
        if (z3) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Tag tag = (Tag) it.next();
                if (tag.A01() == EnumC53319Nhv.A08) {
                    linkedList2.add(tag);
                }
            }
        }
        if (linkedList2.size() == 2 || linkedList2.size() == 3) {
            User user = c80223iB.A03;
            C38321qM c38321qM = c80223iB.A01;
            boolean z4 = c80223iB.A07;
            Product product = (Product) ((Tag) linkedList2.get(0)).A02();
            Product product2 = (Product) ((Tag) linkedList2.get(1)).A02();
            Context context = getContext();
            C39386HaS c39386HaS = new C39386HaS(context, new PointF(0.0f, 1.0f), userSession, c38321qM, product.A07, product2.A07, true, true, z4);
            c39386HaS.A05(AbstractC41370ISx.A00(context, c39386HaS.getTextLayoutParams(), product, linkedList2.size(), AbstractC54237NyI.A00(userSession, product, user), true), R.color.design_dark_default_color_on_background);
            c39386HaS.setVisibility(0);
            c39386HaS.setClickable(true);
            c39386HaS.setTag(linkedList2.get(0));
            addView(c39386HaS);
            C76733cL c76733cL = c80223iB.A02;
            if (c76733cL != null) {
                ((AbstractC50789Mc6) c39386HaS).A03 = c76733cL;
            }
            if (c75113Zb != null) {
                ((AbstractC50789Mc6) c39386HaS).A01 = c75113Zb;
            }
            ((AbstractC50789Mc6) c39386HaS).A00 = i;
            linkedList.add(c39386HaS);
        }
        Object obj = userSession.userId;
        AbstractC50789Mc6 abstractC50789Mc62 = null;
        Iterator it2 = list.iterator();
        loop1: while (true) {
            abstractC50789Mc6 = abstractC50789Mc62;
            while (it2.hasNext()) {
                Tag tag2 = (Tag) it2.next();
                if (tag2.A00() != null && (!(tag2 instanceof FBUserTag) || ((FBUserTag) tag2).A01 != FBTagType.A07)) {
                    if (linkedList2.size() != 2 && linkedList2.size() != 3) {
                        abstractC50789Mc62 = A02(userSession, c80223iB.A01, tag2, c80223iB.A03, c80223iB.A05, c80223iB.A07, z3, c80223iB.A06);
                        if (abstractC50789Mc62 instanceof C39384HaQ) {
                            ((C39384HaQ) abstractC50789Mc62).A06 = new PHI(this, c80223iB);
                        } else if (abstractC50789Mc62 instanceof C39385HaR) {
                            ((C39385HaR) abstractC50789Mc62).A04 = new PHG(this);
                        }
                        C76733cL c76733cL2 = c80223iB.A02;
                        if (c76733cL2 != null) {
                            abstractC50789Mc62.A03 = c76733cL2;
                        }
                        if (c75113Zb != null) {
                            abstractC50789Mc62.A01 = c75113Zb;
                        }
                        abstractC50789Mc62.A00 = i;
                        linkedList.add(abstractC50789Mc62);
                        if ((tag2 instanceof PeopleTag) && tag2.getId().equals(obj)) {
                            break;
                        }
                    }
                }
            }
        }
        if (c80223iB.A05 && (str = c80223iB.A04) != null) {
            ArrayList A02 = AnonymousClass426.A02(list);
            if (AnonymousClass426.A04(A02)) {
                AnonymousClass426.A03(null, EnumC53372NjN.CROSSPOST_WITH_FB_TAGS_REVEAL_CLICK, null, userSession, userSession.userId, str, null, AnonymousClass426.A01(str, A02), null);
            }
        }
        if (abstractC50789Mc6 != null) {
            abstractC50789Mc6.bringToFront();
        }
        if (z) {
            this.A00 = new C73482YFf(this, linkedList, list, z2);
        }
        post(new RunnableC57011PRc(this, linkedList));
    }

    public TagsLayout(Context context) {
        super(context);
        this.A01 = true;
    }

    private int[] A00(List list, int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        OXO A02 = ((AbstractC50789Mc6) list.get(i)).A02();
        int max = Math.max(0, (((int) A02.A07.x) + A02.A05.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)) - A02.A0A.width());
        OXO A022 = ((AbstractC50789Mc6) list.get(i2)).A02();
        int min = (Math.min(measuredWidth - A022.A0A.width(), ((int) A022.A07.x) - A022.A05.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)) + ((AbstractC50789Mc6) list.get(i2)).getBubbleWidth()) - max;
        int i3 = 0;
        for (int i4 = i; i4 <= i2; i4++) {
            i3 += ((AbstractC50789Mc6) list.get(i4)).getBubbleWidth();
        }
        if (i3 <= min) {
            max = ((AbstractC50789Mc6) list.get(i)).getPreferredBounds().left - (((((AbstractC50789Mc6) list.get(i)).getPreferredBounds().left + i3) - ((AbstractC50789Mc6) list.get(i2)).getPreferredBounds().right) / 2);
            min = i3;
        }
        int max2 = Math.max(0, max);
        int i5 = 0;
        while (i <= i2) {
            int bubbleWidth = (((AbstractC50789Mc6) list.get(i)).getBubbleWidth() * min) / i3;
            ((AbstractC50789Mc6) list.get(i)).A02().A03(max2 + i5 + (bubbleWidth / 2));
            i5 += bubbleWidth;
            i++;
        }
        return new int[]{max2, min};
    }

    public final void A04(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            AbstractC50789Mc6 abstractC50789Mc6 = (AbstractC50789Mc6) getChildAt(i);
            if (z) {
                PHJ phj = new PHJ(abstractC50789Mc6, this);
                AbstractC125325le A01 = AbstractC125325le.A01(abstractC50789Mc6, 1);
                if (A01.A0W()) {
                    A01.A05 = new J0L(abstractC50789Mc6, phj, A01);
                } else {
                    AbstractC80603ip.A05(abstractC50789Mc6, phj);
                }
            } else {
                PointF relativeTagPosition = abstractC50789Mc6.getRelativeTagPosition();
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, relativeTagPosition.x, relativeTagPosition.y);
                scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation.setDuration(200L);
                scaleAnimation.setAnimationListener(new C72276XaZ(abstractC50789Mc6, this));
                abstractC50789Mc6.startAnimation(scaleAnimation);
            }
        }
        if (!z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            startAnimation(alphaAnimation);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Interpolator accelerateDecelerateInterpolator;
        A03();
        YN7 yn7 = this.A00;
        if (yn7 != null) {
            C73482YFf c73482YFf = (C73482YFf) yn7;
            c73482YFf.A00.A00 = null;
            for (AbstractC50789Mc6 abstractC50789Mc6 : c73482YFf.A01) {
                if (c73482YFf.A03) {
                    PointF relativeTagPosition = abstractC50789Mc6.getRelativeTagPosition();
                    AbstractC125325le A0C = AbstractC125325le.A01(abstractC50789Mc6, 1).A0D(new C104694nZ()).A0C(250L);
                    A0C.A0U(0.0f, 1.0f, relativeTagPosition.x);
                    A0C.A0V(0.0f, 1.0f, relativeTagPosition.y);
                    A0C.A0H();
                } else {
                    boolean z2 = false;
                    if (c73482YFf.A02.size() < 3) {
                        z2 = true;
                    }
                    PointF relativeTagPosition2 = abstractC50789Mc6.getRelativeTagPosition();
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, relativeTagPosition2.x, relativeTagPosition2.y);
                    if (z2) {
                        accelerateDecelerateInterpolator = new OvershootInterpolator();
                    } else {
                        accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
                    }
                    scaleAnimation.setInterpolator(accelerateDecelerateInterpolator);
                    scaleAnimation.setDuration(200L);
                    abstractC50789Mc6.startAnimation(scaleAnimation);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(i, i2);
        }
        setMeasuredDimension(size, size2);
    }

    private void setTagsLayoutListener(YN7 yn7) {
        this.A00 = yn7;
    }

    public TagsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = true;
    }

    public void setTags(List list, boolean z, UserSession userSession) {
        setTags(list, new C80223iB(new C51750MtZ(new C57746PjZ(null, 23), 11), null, null, null, null, false, false, false, false), null, -1, z, false, userSession);
    }

    public TagsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = true;
    }
}
