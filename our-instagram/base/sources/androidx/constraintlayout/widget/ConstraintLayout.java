package androidx.constraintlayout.widget;

import X.AbstractC56072hv;
import X.AbstractC56282iH;
import X.AbstractC56312iK;
import X.AbstractC56322iM;
import X.AbstractC72454Xdz;
import X.C110964z8;
import X.C152726u0;
import X.C3OH;
import X.C56062hu;
import X.C56082hw;
import X.C56262iF;
import X.C56302iJ;
import X.C5GE;
import X.C68872VdU;
import X.EnumC56102hy;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {
    public static C68872VdU A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public SparseArray A08;
    public SparseArray A09;
    public C56062hu A0A;
    public C56262iF A0B;
    public C5GE A0C;
    public C110964z8 A0D;
    public ArrayList A0E;
    public HashMap A0F;
    public boolean A0G;
    public AbstractC72454Xdz A0H;

    @Override // android.view.View
    public final void forceLayout() {
        this.A0G = true;
        this.A02 = -1;
        this.A01 = -1;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C56302iJ(-2, -2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.A0G = true;
        this.A02 = -1;
        this.A01 = -1;
        super.requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    private void A00(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        C56062hu c56062hu = this.A0A;
        c56062hu.A0m = this;
        C56262iF c56262iF = this.A0B;
        c56062hu.A08 = c56262iF;
        c56062hu.A0A.A02 = c56262iF;
        this.A08.put(getId(), this);
        this.A0D = null;
        if (attrs != null) {
            Context context = getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC56282iH.A01, defStyleAttr, defStyleRes);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.A06 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A06);
                } else if (index == 17) {
                    this.A05 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A05);
                } else if (index == 14) {
                    this.A04 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A04);
                } else if (index == 15) {
                    this.A03 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A03);
                } else if (index == 113) {
                    this.A07 = obtainStyledAttributes.getInt(index, this.A07);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.A0C = new C5GE(context, this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A0C = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C110964z8 c110964z8 = new C110964z8();
                        this.A0D = c110964z8;
                        XmlResourceParser xml = context.getResources().getXml(resourceId2);
                        try {
                            try {
                                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                    if (eventType != 0) {
                                        if (eventType == 2) {
                                            String name = xml.getName();
                                            C152726u0 A01 = C110964z8.A01(context, Xml.asAttributeSet(xml), false);
                                            if (name.equalsIgnoreCase("Guideline")) {
                                                A01.A03.A14 = true;
                                            }
                                            c110964z8.A00.put(Integer.valueOf(A01.A00), A01);
                                        }
                                    } else {
                                        xml.getName();
                                    }
                                }
                            } catch (XmlPullParserException e) {
                                e.printStackTrace();
                            }
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.A0D = null;
                    }
                    this.A00 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c56062hu.A0d(this.A07);
    }

    public static C68872VdU getSharedValues() {
        C68872VdU c68872VdU = A0I;
        if (c68872VdU == null) {
            C68872VdU c68872VdU2 = new C68872VdU();
            A0I = c68872VdU2;
            return c68872VdU2;
        }
        return c68872VdU;
    }

    private void setWidgetBaseline(C56082hw widget, C56302iJ layoutParams, SparseArray idToWidget, int baselineTarget, EnumC56102hy type) {
        View view = (View) this.A08.get(baselineTarget);
        C56082hw c56082hw = (C56082hw) idToWidget.get(baselineTarget);
        if (c56082hw != null && view != null && (view.getLayoutParams() instanceof C56302iJ)) {
            layoutParams.A17 = true;
            EnumC56102hy enumC56102hy = EnumC56102hy.BASELINE;
            if (type == enumC56102hy) {
                C56302iJ c56302iJ = (C56302iJ) view.getLayoutParams();
                c56302iJ.A17 = true;
                c56302iJ.A0x.A0q = true;
            }
            widget.A0A(enumC56102hy).A06(c56082hw.A0A(type), layoutParams.A0B, layoutParams.A0O, true);
            widget.A0q = true;
            widget.A0A(EnumC56102hy.TOP).A03();
            widget.A0A(EnumC56102hy.BOTTOM).A03();
        }
    }

    public final C56082hw A0C(View view) {
        if (view == this) {
            return this.A0A;
        }
        if (view != null) {
            if (!(view.getLayoutParams() instanceof C56302iJ)) {
                view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
                if (!(view.getLayoutParams() instanceof C56302iJ)) {
                    return null;
                }
            }
            return ((C56302iJ) view.getLayoutParams()).A0x;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.A0E;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            int i = 0;
            do {
                arrayList.get(i);
                i++;
            } while (i < size);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i4 + ((int) ((parseInt4 / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public int getMaxHeight() {
        return this.A03;
    }

    public int getMaxWidth() {
        return this.A04;
    }

    public int getMinHeight() {
        return this.A05;
    }

    public int getMinWidth() {
        return this.A06;
    }

    public int getOptimizationLevel() {
        return this.A0A.A01;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C56062hu c56062hu = this.A0A;
        String str = c56062hu.A0o;
        if (str == null) {
            int id2 = getId();
            if (id2 != -1) {
                str = getContext().getResources().getResourceEntryName(id2);
            } else {
                str = "parent";
            }
            c56062hu.A0o = str;
        }
        if (c56062hu.A0n == null) {
            c56062hu.A0n = str;
        }
        Iterator it = ((AbstractC56072hv) c56062hu).A00.iterator();
        while (it.hasNext()) {
            C56082hw c56082hw = (C56082hw) it.next();
            View view = (View) c56082hw.A0m;
            if (view != null) {
                if (c56082hw.A0o == null && (id = view.getId()) != -1) {
                    c56082hw.A0o = getContext().getResources().getResourceEntryName(id);
                }
                if (c56082hw.A0n == null) {
                    c56082hw.A0n = c56082hw.A0o;
                }
            }
        }
        c56062hu.A0T(sb);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021d, code lost:
    
        if ((r10 instanceof X.AbstractC56322iM) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x021f, code lost:
    
        ((X.AbstractC56322iM) r10).A07(r1, r5.A0H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0228, code lost:
    
        if (r0.A15 == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022a, code lost:
    
        r1 = (X.C3OH) r1;
        r12 = r0.A0j;
        r11 = r0.A0k;
        r10 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0236, code lost:
    
        if (r10 == (-1.0f)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023a, code lost:
    
        if (r10 <= (-1.0f)) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023c, code lost:
    
        r1.A00 = r10;
        r1.A02 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0240, code lost:
    
        r1.A03 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0245, code lost:
    
        if (r12 == (-1)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0247, code lost:
    
        if (r12 <= (-1)) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0249, code lost:
    
        r1.A00 = -1.0f;
        r1.A02 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024e, code lost:
    
        if (r11 == (-1)) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0250, code lost:
    
        if (r11 <= (-1)) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0252, code lost:
    
        r1.A00 = -1.0f;
        r1.A02 = -1;
        r1.A03 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0259, code lost:
    
        r13 = r0.A0l;
        r12 = r0.A0m;
        r11 = r0.A0n;
        r10 = r0.A0o;
        r9 = r0.A0h;
        r9 = r0.A0i;
        r9 = r0.A08;
        r14 = r0.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x026c, code lost:
    
        if (r14 == (-1)) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x026e, code lost:
    
        r11 = (X.C56082hw) r7.get(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0274, code lost:
    
        if (r11 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0276, code lost:
    
        r10 = r0.A00;
        r9 = r0.A0I;
        r21 = X.EnumC56102hy.CENTER;
        r1.A0R(r21, r21, r11, r9, 0);
        r1.A00 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x028b, code lost:
    
        if (r19 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028d, code lost:
    
        r10 = r0.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x028f, code lost:
    
        if (r10 != (-1)) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0293, code lost:
    
        if (r0.A0L == (-1)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0295, code lost:
    
        r9 = r0.A0L;
        r1.A0V = r10;
        r1.A0W = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x029e, code lost:
    
        if (r0.A14 != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02a2, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r0).width != (-1)) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a6, code lost:
    
        if (r0.A11 == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a8, code lost:
    
        r10 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02aa, code lost:
    
        r1.A14[0] = r10;
        r1.A0A(X.EnumC56102hy.LEFT).A02 = ((android.view.ViewGroup.MarginLayoutParams) r0).leftMargin;
        r1.A0A(X.EnumC56102hy.RIGHT).A02 = ((android.view.ViewGroup.MarginLayoutParams) r0).rightMargin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c4, code lost:
    
        if (r0.A18 != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c8, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r0).height != (-1)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02cc, code lost:
    
        if (r0.A10 == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ce, code lost:
    
        r10 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d0, code lost:
    
        r1.A14[1] = r10;
        r1.A0A(X.EnumC56102hy.TOP).A02 = ((android.view.ViewGroup.MarginLayoutParams) r0).topMargin;
        r1.A0A(X.EnumC56102hy.BOTTOM).A02 = ((android.view.ViewGroup.MarginLayoutParams) r0).bottomMargin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e8, code lost:
    
        r15 = r0.A0z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02eb, code lost:
    
        if (r15 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ed, code lost:
    
        r13 = r15.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02f1, code lost:
    
        if (r13 == 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f3, code lost:
    
        r12 = -1;
        r11 = r15.indexOf(44);
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02fb, code lost:
    
        if (r11 <= 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ff, code lost:
    
        if (r11 >= (r13 - 1)) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0301, code lost:
    
        r10 = r15.substring(0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x030b, code lost:
    
        if (r10.equalsIgnoreCase("W") == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x030d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x030e, code lost:
    
        r10 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0339, code lost:
    
        if (r10.equalsIgnoreCase("H") == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033b, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0310, code lost:
    
        r9 = r15.indexOf(58);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0316, code lost:
    
        if (r9 < 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0319, code lost:
    
        if (r9 >= (r13 - 1)) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x031b, code lost:
    
        r11 = r15.substring(r10, r9);
        r10 = r15.substring(r9 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0329, code lost:
    
        if (r11.length() <= 0) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x032f, code lost:
    
        if (r10.length() <= 0) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x047d, code lost:
    
        r11 = java.lang.Float.parseFloat(r11);
        r10 = java.lang.Float.parseFloat(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0487, code lost:
    
        if (r11 <= 0.0f) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x048b, code lost:
    
        if (r10 <= 0.0f) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x048d, code lost:
    
        if (r12 != 1) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x048f, code lost:
    
        r10 = java.lang.Math.abs(r10 / r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04af, code lost:
    
        if (r10 <= 0.0f) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04b1, code lost:
    
        r1.A01 = r10;
        r1.A09 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0495, code lost:
    
        r10 = java.lang.Math.abs(r11 / r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x049b, code lost:
    
        r10 = r15.substring(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04a3, code lost:
    
        if (r10.length() <= 0) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04a5, code lost:
    
        r10 = java.lang.Float.parseFloat(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04aa, code lost:
    
        r1.A01 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x033d, code lost:
    
        r10 = X.C05F.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0340, code lost:
    
        r1.A14[1] = X.C05F.A0C;
        r1.A0H(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x034a, code lost:
    
        r1.A14[1] = X.C05F.A00;
        r9 = ((android.view.ViewGroup.LayoutParams) r0).height;
        r1.A0H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0355, code lost:
    
        if (r9 != (-2)) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0357, code lost:
    
        r1.A14[1] = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x035e, code lost:
    
        r10 = X.C05F.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0362, code lost:
    
        r1.A14[0] = X.C05F.A0C;
        r1.A0I(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x036d, code lost:
    
        r1.A14[0] = X.C05F.A00;
        r9 = ((android.view.ViewGroup.LayoutParams) r0).width;
        r1.A0I(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0378, code lost:
    
        if (r9 != (-2)) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x037a, code lost:
    
        r1.A14[0] = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0382, code lost:
    
        if (r13 == (-1)) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0384, code lost:
    
        r13 = (X.C56082hw) r7.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x038a, code lost:
    
        if (r13 == null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x038c, code lost:
    
        r21 = X.EnumC56102hy.LEFT;
        r12 = ((android.view.ViewGroup.MarginLayoutParams) r0).leftMargin;
        r20 = r1;
        r22 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0394, code lost:
    
        r20.A0R(r21, r22, r13, r12, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x039b, code lost:
    
        if (r11 == (-1)) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x039d, code lost:
    
        r11 = (X.C56082hw) r7.get(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03a3, code lost:
    
        if (r11 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03a5, code lost:
    
        r21 = X.EnumC56102hy.RIGHT;
        r22 = X.EnumC56102hy.LEFT;
        r10 = ((android.view.ViewGroup.MarginLayoutParams) r0).rightMargin;
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03ad, code lost:
    
        r20.A0R(r21, r22, r11, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03b6, code lost:
    
        r10 = r0.A0u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03b8, code lost:
    
        if (r10 == (-1)) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03ba, code lost:
    
        r12 = (X.C56082hw) r7.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03c0, code lost:
    
        if (r12 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03c2, code lost:
    
        r21 = X.EnumC56102hy.TOP;
        r11 = ((android.view.ViewGroup.MarginLayoutParams) r0).topMargin;
        r10 = r0.A0U;
        r20 = r1;
        r22 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03cc, code lost:
    
        r20.A0R(r21, r22, r12, r11, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03d5, code lost:
    
        r10 = r0.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03d7, code lost:
    
        if (r10 == (-1)) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03d9, code lost:
    
        r12 = (X.C56082hw) r7.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03df, code lost:
    
        if (r12 == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03e1, code lost:
    
        r21 = X.EnumC56102hy.BOTTOM;
        r22 = X.EnumC56102hy.TOP;
        r11 = ((android.view.ViewGroup.MarginLayoutParams) r0).bottomMargin;
        r10 = r0.A0P;
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03eb, code lost:
    
        r20.A0R(r21, r22, r12, r11, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03f4, code lost:
    
        r10 = r0.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03f6, code lost:
    
        if (r10 == (-1)) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03f8, code lost:
    
        r25 = X.EnumC56102hy.BASELINE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03fa, code lost:
    
        setWidgetBaseline(r1, r0, r7, r10, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x040a, code lost:
    
        if (r9 < 0.0f) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x040c, code lost:
    
        r1.A02 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x040e, code lost:
    
        r10 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0412, code lost:
    
        if (r10 < 0.0f) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0414, code lost:
    
        r1.A06 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0418, code lost:
    
        r10 = r0.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x041a, code lost:
    
        if (r10 == (-1)) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x041c, code lost:
    
        r25 = X.EnumC56102hy.TOP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x041f, code lost:
    
        r10 = r0.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0421, code lost:
    
        if (r10 == (-1)) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0423, code lost:
    
        r25 = X.EnumC56102hy.BOTTOM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0426, code lost:
    
        r10 = r0.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0428, code lost:
    
        if (r10 == (-1)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x042a, code lost:
    
        r12 = (X.C56082hw) r7.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0430, code lost:
    
        if (r12 == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0432, code lost:
    
        r21 = X.EnumC56102hy.BOTTOM;
        r11 = ((android.view.ViewGroup.MarginLayoutParams) r0).bottomMargin;
        r10 = r0.A0P;
        r20 = r1;
        r22 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x043d, code lost:
    
        r10 = r0.A0t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x043f, code lost:
    
        if (r10 == (-1)) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0441, code lost:
    
        r12 = (X.C56082hw) r7.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0447, code lost:
    
        if (r12 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0449, code lost:
    
        r21 = X.EnumC56102hy.TOP;
        r22 = X.EnumC56102hy.BOTTOM;
        r11 = ((android.view.ViewGroup.MarginLayoutParams) r0).topMargin;
        r10 = r0.A0U;
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0455, code lost:
    
        if (r10 == (-1)) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0457, code lost:
    
        r11 = (X.C56082hw) r7.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x045d, code lost:
    
        if (r11 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x045f, code lost:
    
        r21 = X.EnumC56102hy.RIGHT;
        r10 = ((android.view.ViewGroup.MarginLayoutParams) r0).rightMargin;
        r20 = r1;
        r22 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0469, code lost:
    
        if (r12 == (-1)) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x046b, code lost:
    
        r13 = (X.C56082hw) r7.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0471, code lost:
    
        if (r13 == null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0473, code lost:
    
        r21 = X.EnumC56102hy.LEFT;
        r22 = X.EnumC56102hy.RIGHT;
        r12 = ((android.view.ViewGroup.MarginLayoutParams) r0).leftMargin;
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04e8, code lost:
    
        r5.A09.A01(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0122, code lost:
    
        r13 = (X.AbstractC56322iM) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x012c, code lost:
    
        if (r13.isInEditMode() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x012e, code lost:
    
        r13.setIds(r13.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0133, code lost:
    
        r0 = r13.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0135, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0137, code lost:
    
        r0 = (X.C3O7) r0;
        r0.A00 = 0;
        java.util.Arrays.fill(r0.A01, (java.lang.Object) null);
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0144, code lost:
    
        if (r12 >= r13.A00) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0146, code lost:
    
        r1 = r13.A05[r12];
        r15 = r26.A08;
        r0 = (android.view.View) r15.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0152, code lost:
    
        if (r0 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0154, code lost:
    
        r14 = r13.A04;
        r7 = (java.lang.String) r14.get(java.lang.Integer.valueOf(r1));
        r1 = X.AbstractC56322iM.A00(r13, r26, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0164, code lost:
    
        if (r1 == 0) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0166, code lost:
    
        r13.A05[r12] = r1;
        r14.put(java.lang.Integer.valueOf(r1), r7);
        r0 = (android.view.View) r15.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0177, code lost:
    
        if (r0 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01a0, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0179, code lost:
    
        r7 = r13.A02;
        r14 = A0C(r0);
        r7 = (X.C3O7) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0181, code lost:
    
        if (r14 == r7) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0183, code lost:
    
        if (r14 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0185, code lost:
    
        r15 = r7.A00 + 1;
        r1 = r7.A01;
        r0 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x018c, code lost:
    
        if (r15 <= r0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x018e, code lost:
    
        r1 = (X.C56082hw[]) java.util.Arrays.copyOf(r1, r0 * 2);
        r7.A01 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0198, code lost:
    
        r0 = r7.A00;
        r1[r0] = r14;
        r7.A00 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x01a3, code lost:
    
        r7 = (X.C3O7) r13.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x01a9, code lost:
    
        if ((r7 instanceof X.C3OI) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x01ab, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x01ae, code lost:
    
        if (r1 >= r7.A00) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01b0, code lost:
    
        r0 = r7.A01[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x01b4, code lost:
    
        if (r0 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x01b6, code lost:
    
        r0.A0s = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x01b8, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x01bb, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01bd, code lost:
    
        if (r9 >= r10) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0609, code lost:
    
        if (r16 == 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0613, code lost:
    
        r9 = java.lang.Math.max(0, r26.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0611, code lost:
    
        if (r16 == 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x061d, code lost:
    
        if (r16 == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0627, code lost:
    
        r0 = java.lang.Math.max(0, r26.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0625, code lost:
    
        if (r16 == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0117, code lost:
    
        if (r10 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0119, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011a, code lost:
    
        if (r0 >= r8) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011c, code lost:
    
        getChildAt(r0);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c1, code lost:
    
        r7 = r26.A09;
        r7.clear();
        r7.put(0, r5);
        r7.put(getId(), r5);
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d1, code lost:
    
        if (r9 >= r8) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d3, code lost:
    
        r0 = getChildAt(r9);
        r7.put(r0.getId(), A0C(r0));
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e7, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e9, code lost:
    
        if (r0 >= r8) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01eb, code lost:
    
        r10 = getChildAt(r0);
        r1 = A0C(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f3, code lost:
    
        if (r1 == null) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f5, code lost:
    
        r0 = (X.C56302iJ) r10.getLayoutParams();
        ((X.AbstractC56072hv) r5).A00.add(r1);
        r9 = r1.A0h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0202, code lost:
    
        if (r9 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0204, code lost:
    
        ((X.AbstractC56072hv) r9).A00.remove(r1);
        r1.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020e, code lost:
    
        r1.A0h = r5;
        r0.A00();
        r1.A0R = r10.getVisibility();
        r1.A0m = r10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void setId(int id) {
        SparseArray sparseArray = this.A08;
        sparseArray.remove(getId());
        super.setId(id);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int value) {
        if (value != this.A03) {
            this.A03 = value;
            requestLayout();
        }
    }

    public void setMaxWidth(int value) {
        if (value != this.A04) {
            this.A04 = value;
            requestLayout();
        }
    }

    public void setMinHeight(int value) {
        if (value != this.A05) {
            this.A05 = value;
            requestLayout();
        }
    }

    public void setMinWidth(int value) {
        if (value != this.A06) {
            this.A06 = value;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(AbstractC72454Xdz constraintsChangedListener) {
        this.A0H = constraintsChangedListener;
        C5GE c5ge = this.A0C;
        if (c5ge != null) {
            c5ge.A02 = constraintsChangedListener;
        }
    }

    public void setOptimizationLevel(int level) {
        this.A07 = level;
        this.A0A.A0d(level);
    }

    public ConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.A08 = new SparseArray();
        this.A0E = new ArrayList(4);
        this.A0A = new C56062hu();
        this.A06 = 0;
        this.A05 = 0;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0G = true;
        this.A07 = 257;
        this.A0D = null;
        this.A0C = null;
        this.A00 = -1;
        this.A0F = new HashMap();
        this.A02 = -1;
        this.A01 = -1;
        this.A09 = new SparseArray();
        this.A0B = new C56262iF(this, this);
        A00(attrs, defStyleAttr, defStyleRes);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.2iJ, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object] */
    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        String str;
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attrs);
        marginLayoutParams.A0V = -1;
        marginLayoutParams.A0W = -1;
        marginLayoutParams.A02 = -1.0f;
        marginLayoutParams.A12 = true;
        marginLayoutParams.A0Y = -1;
        marginLayoutParams.A0Z = -1;
        marginLayoutParams.A0p = -1;
        marginLayoutParams.A0q = -1;
        marginLayoutParams.A0u = -1;
        marginLayoutParams.A0t = -1;
        marginLayoutParams.A0G = -1;
        marginLayoutParams.A0F = -1;
        marginLayoutParams.A0C = -1;
        marginLayoutParams.A0E = -1;
        marginLayoutParams.A0D = -1;
        marginLayoutParams.A0H = -1;
        marginLayoutParams.A0I = 0;
        marginLayoutParams.A00 = 0.0f;
        marginLayoutParams.A0r = -1;
        marginLayoutParams.A0s = -1;
        marginLayoutParams.A0N = -1;
        marginLayoutParams.A0M = -1;
        marginLayoutParams.A0R = Integer.MIN_VALUE;
        marginLayoutParams.A0U = Integer.MIN_VALUE;
        marginLayoutParams.A0S = Integer.MIN_VALUE;
        marginLayoutParams.A0P = Integer.MIN_VALUE;
        marginLayoutParams.A0T = Integer.MIN_VALUE;
        marginLayoutParams.A0Q = Integer.MIN_VALUE;
        marginLayoutParams.A0O = Integer.MIN_VALUE;
        marginLayoutParams.A0B = 0;
        marginLayoutParams.A19 = true;
        marginLayoutParams.A13 = true;
        marginLayoutParams.A03 = 0.5f;
        marginLayoutParams.A09 = 0.5f;
        marginLayoutParams.A0z = null;
        marginLayoutParams.A01 = 0.0f;
        marginLayoutParams.A0J = 1;
        marginLayoutParams.A04 = -1.0f;
        marginLayoutParams.A0A = -1.0f;
        marginLayoutParams.A0X = 0;
        marginLayoutParams.A0v = 0;
        marginLayoutParams.A0b = 0;
        marginLayoutParams.A0a = 0;
        marginLayoutParams.A0f = 0;
        marginLayoutParams.A0e = 0;
        marginLayoutParams.A0d = 0;
        marginLayoutParams.A0c = 0;
        marginLayoutParams.A06 = 1.0f;
        marginLayoutParams.A05 = 1.0f;
        marginLayoutParams.A0K = -1;
        marginLayoutParams.A0L = -1;
        marginLayoutParams.A0g = -1;
        marginLayoutParams.A11 = false;
        marginLayoutParams.A10 = false;
        marginLayoutParams.A0y = null;
        marginLayoutParams.A0w = 0;
        marginLayoutParams.A14 = true;
        marginLayoutParams.A18 = true;
        marginLayoutParams.A17 = false;
        marginLayoutParams.A15 = false;
        marginLayoutParams.A16 = false;
        marginLayoutParams.A0l = -1;
        marginLayoutParams.A0m = -1;
        marginLayoutParams.A0n = -1;
        marginLayoutParams.A0o = -1;
        marginLayoutParams.A0h = Integer.MIN_VALUE;
        marginLayoutParams.A0i = Integer.MIN_VALUE;
        marginLayoutParams.A08 = 0.5f;
        marginLayoutParams.A0x = new C56082hw();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC56282iH.A01);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC56312iK.A00.get(index);
            switch (i2) {
                case 1:
                    marginLayoutParams.A0g = obtainStyledAttributes.getInt(index, marginLayoutParams.A0g);
                    continue;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0H);
                    marginLayoutParams.A0H = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.A0H = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    marginLayoutParams.A0I = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0I);
                    continue;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, marginLayoutParams.A00) % 360.0f;
                    marginLayoutParams.A00 = f;
                    if (f < 0.0f) {
                        marginLayoutParams.A00 = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    marginLayoutParams.A0V = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.A0V);
                    continue;
                case 6:
                    marginLayoutParams.A0W = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.A0W);
                    continue;
                case 7:
                    marginLayoutParams.A02 = obtainStyledAttributes.getFloat(index, marginLayoutParams.A02);
                    continue;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0Y);
                    marginLayoutParams.A0Y = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.A0Y = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0Z);
                    marginLayoutParams.A0Z = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.A0Z = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0p);
                    marginLayoutParams.A0p = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.A0p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0q);
                    marginLayoutParams.A0q = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.A0q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0u);
                    marginLayoutParams.A0u = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.A0u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0t);
                    marginLayoutParams.A0t = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.A0t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0G);
                    marginLayoutParams.A0G = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.A0G = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case Process.SIGTERM /* 15 */:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0F);
                    marginLayoutParams.A0F = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.A0F = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0C);
                    marginLayoutParams.A0C = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.A0C = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0r);
                    marginLayoutParams.A0r = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.A0r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0s);
                    marginLayoutParams.A0s = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.A0s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case Process.SIGSTOP /* 19 */:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0N);
                    marginLayoutParams.A0N = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.A0N = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0M);
                    marginLayoutParams.A0M = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.A0M = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 21:
                    marginLayoutParams.A0R = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0R);
                    continue;
                case 22:
                    marginLayoutParams.A0U = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0U);
                    continue;
                case 23:
                    marginLayoutParams.A0S = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0S);
                    continue;
                case 24:
                    marginLayoutParams.A0P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0P);
                    continue;
                case 25:
                    marginLayoutParams.A0T = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0T);
                    continue;
                case 26:
                    marginLayoutParams.A0Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0Q);
                    continue;
                case 27:
                    marginLayoutParams.A11 = obtainStyledAttributes.getBoolean(index, marginLayoutParams.A11);
                    continue;
                case 28:
                    marginLayoutParams.A10 = obtainStyledAttributes.getBoolean(index, marginLayoutParams.A10);
                    continue;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    marginLayoutParams.A03 = obtainStyledAttributes.getFloat(index, marginLayoutParams.A03);
                    continue;
                case 30:
                    marginLayoutParams.A09 = obtainStyledAttributes.getFloat(index, marginLayoutParams.A09);
                    continue;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.A0b = i3;
                    if (i3 == 1) {
                        str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.A0a = i4;
                    if (i4 == 1) {
                        str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.A0f = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0f);
                        continue;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.A0f) == -2) {
                            marginLayoutParams.A0f = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.A0d = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0d);
                        continue;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.A0d) == -2) {
                            marginLayoutParams.A0d = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.A06 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.A06));
                    marginLayoutParams.A0b = 2;
                    continue;
                case 36:
                    try {
                        marginLayoutParams.A0e = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0e);
                        continue;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.A0e) == -2) {
                            marginLayoutParams.A0e = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.A0c = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0c);
                        continue;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.A0c) == -2) {
                            marginLayoutParams.A0c = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.A05 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.A05));
                    marginLayoutParams.A0a = 2;
                    continue;
                default:
                    switch (i2) {
                        case 44:
                            C110964z8.A05(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.A04 = obtainStyledAttributes.getFloat(index, marginLayoutParams.A04);
                            break;
                        case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                            marginLayoutParams.A0A = obtainStyledAttributes.getFloat(index, marginLayoutParams.A0A);
                            break;
                        case 47:
                            marginLayoutParams.A0X = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.A0v = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.A0K = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.A0K);
                            break;
                        case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                            marginLayoutParams.A0L = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.A0L);
                            break;
                        case 51:
                            marginLayoutParams.A0y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0E);
                            marginLayoutParams.A0E = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.A0E = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.A0D);
                            marginLayoutParams.A0D = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.A0D = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            marginLayoutParams.A0B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0B);
                            break;
                        case 55:
                            marginLayoutParams.A0O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A0O);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C110964z8.A04(obtainStyledAttributes, marginLayoutParams, index, 0);
                                    marginLayoutParams.A19 = true;
                                    break;
                                case 65:
                                    C110964z8.A04(obtainStyledAttributes, marginLayoutParams, index, 1);
                                    marginLayoutParams.A13 = true;
                                    break;
                                case 66:
                                    marginLayoutParams.A0w = obtainStyledAttributes.getInt(index, marginLayoutParams.A0w);
                                    break;
                                case 67:
                                    marginLayoutParams.A12 = obtainStyledAttributes.getBoolean(index, marginLayoutParams.A12);
                                    break;
                                default:
                                    continue;
                            }
                    }
            }
            Log.e("ConstraintLayout", str);
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.A00();
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C56302iJ c56302iJ = (C56302iJ) childAt.getLayoutParams();
            C56082hw c56082hw = c56302iJ.A0x;
            if (childAt.getVisibility() != 8 || c56302iJ.A15 || c56302iJ.A16 || isInEditMode) {
                int A08 = c56082hw.A08();
                int A09 = c56082hw.A09();
                childAt.layout(A08, A09, c56082hw.A07() + A08, c56082hw.A06() + A09);
            }
        }
        ArrayList arrayList = this.A0E;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        do {
            ((AbstractC56322iM) arrayList.get(i)).A09(this);
            i++;
        } while (i < size);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C56082hw A0C = A0C(view);
        if ((view instanceof Guideline) && !(A0C instanceof C3OH)) {
            C56302iJ c56302iJ = (C56302iJ) view.getLayoutParams();
            C3OH c3oh = new C3OH();
            c56302iJ.A0x = c3oh;
            c56302iJ.A15 = true;
            c3oh.A0c(c56302iJ.A0g);
        }
        if (view instanceof AbstractC56322iM) {
            AbstractC56322iM abstractC56322iM = (AbstractC56322iM) view;
            abstractC56322iM.A04();
            ((C56302iJ) view.getLayoutParams()).A16 = true;
            ArrayList arrayList = this.A0E;
            if (!arrayList.contains(abstractC56322iM)) {
                arrayList.add(abstractC56322iM);
            }
        }
        this.A08.put(view.getId(), view);
        this.A0G = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A08.remove(view.getId());
        C56082hw A0C = A0C(view);
        ((AbstractC56072hv) this.A0A).A00.remove(A0C);
        A0C.A0B();
        this.A0E.remove(view);
        this.A0G = true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof C56302iJ;
    }

    public void setConstraintSet(C110964z8 set) {
        this.A0D = set;
    }

    public ConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.A08 = new SparseArray();
        this.A0E = new ArrayList(4);
        this.A0A = new C56062hu();
        this.A06 = 0;
        this.A05 = 0;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0G = true;
        this.A07 = 257;
        this.A0D = null;
        this.A0C = null;
        this.A00 = -1;
        this.A0F = new HashMap();
        this.A02 = -1;
        this.A01 = -1;
        this.A09 = new SparseArray();
        this.A0B = new C56262iF(this, this);
        A00(attrs, defStyleAttr, 0);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.2iJ, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(p);
        marginLayoutParams.A0V = -1;
        marginLayoutParams.A0W = -1;
        marginLayoutParams.A02 = -1.0f;
        marginLayoutParams.A12 = true;
        marginLayoutParams.A0Y = -1;
        marginLayoutParams.A0Z = -1;
        marginLayoutParams.A0p = -1;
        marginLayoutParams.A0q = -1;
        marginLayoutParams.A0u = -1;
        marginLayoutParams.A0t = -1;
        marginLayoutParams.A0G = -1;
        marginLayoutParams.A0F = -1;
        marginLayoutParams.A0C = -1;
        marginLayoutParams.A0E = -1;
        marginLayoutParams.A0D = -1;
        marginLayoutParams.A0H = -1;
        marginLayoutParams.A0I = 0;
        marginLayoutParams.A00 = 0.0f;
        marginLayoutParams.A0r = -1;
        marginLayoutParams.A0s = -1;
        marginLayoutParams.A0N = -1;
        marginLayoutParams.A0M = -1;
        marginLayoutParams.A0R = Integer.MIN_VALUE;
        marginLayoutParams.A0U = Integer.MIN_VALUE;
        marginLayoutParams.A0S = Integer.MIN_VALUE;
        marginLayoutParams.A0P = Integer.MIN_VALUE;
        marginLayoutParams.A0T = Integer.MIN_VALUE;
        marginLayoutParams.A0Q = Integer.MIN_VALUE;
        marginLayoutParams.A0O = Integer.MIN_VALUE;
        marginLayoutParams.A0B = 0;
        marginLayoutParams.A19 = true;
        marginLayoutParams.A13 = true;
        marginLayoutParams.A03 = 0.5f;
        marginLayoutParams.A09 = 0.5f;
        marginLayoutParams.A0z = null;
        marginLayoutParams.A01 = 0.0f;
        marginLayoutParams.A0J = 1;
        marginLayoutParams.A04 = -1.0f;
        marginLayoutParams.A0A = -1.0f;
        marginLayoutParams.A0X = 0;
        marginLayoutParams.A0v = 0;
        marginLayoutParams.A0b = 0;
        marginLayoutParams.A0a = 0;
        marginLayoutParams.A0f = 0;
        marginLayoutParams.A0e = 0;
        marginLayoutParams.A0d = 0;
        marginLayoutParams.A0c = 0;
        marginLayoutParams.A06 = 1.0f;
        marginLayoutParams.A05 = 1.0f;
        marginLayoutParams.A0K = -1;
        marginLayoutParams.A0L = -1;
        marginLayoutParams.A0g = -1;
        marginLayoutParams.A11 = false;
        marginLayoutParams.A10 = false;
        marginLayoutParams.A0y = null;
        marginLayoutParams.A0w = 0;
        marginLayoutParams.A14 = true;
        marginLayoutParams.A18 = true;
        marginLayoutParams.A17 = false;
        marginLayoutParams.A15 = false;
        marginLayoutParams.A16 = false;
        marginLayoutParams.A0l = -1;
        marginLayoutParams.A0m = -1;
        marginLayoutParams.A0n = -1;
        marginLayoutParams.A0o = -1;
        marginLayoutParams.A0h = Integer.MIN_VALUE;
        marginLayoutParams.A0i = Integer.MIN_VALUE;
        marginLayoutParams.A08 = 0.5f;
        marginLayoutParams.A0x = new C56082hw();
        return marginLayoutParams;
    }

    public ConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.A08 = new SparseArray();
        this.A0E = new ArrayList(4);
        this.A0A = new C56062hu();
        this.A06 = 0;
        this.A05 = 0;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0G = true;
        this.A07 = 257;
        this.A0D = null;
        this.A0C = null;
        this.A00 = -1;
        this.A0F = new HashMap();
        this.A02 = -1;
        this.A01 = -1;
        this.A09 = new SparseArray();
        this.A0B = new C56262iF(this, this);
        A00(attrs, 0, 0);
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.A08 = new SparseArray();
        this.A0E = new ArrayList(4);
        this.A0A = new C56062hu();
        this.A06 = 0;
        this.A05 = 0;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0G = true;
        this.A07 = 257;
        this.A0D = null;
        this.A0C = null;
        this.A00 = -1;
        this.A0F = new HashMap();
        this.A02 = -1;
        this.A01 = -1;
        this.A09 = new SparseArray();
        this.A0B = new C56262iF(this, this);
        A00(null, 0, 0);
    }
}
