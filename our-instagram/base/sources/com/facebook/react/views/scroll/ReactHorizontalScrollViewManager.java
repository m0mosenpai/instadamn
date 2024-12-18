package com.facebook.react.views.scroll;

import X.AbstractC166997dE;
import X.C05F;
import X.C63011Saa;
import X.C63234Sfm;
import X.C63356SiD;
import X.C63403SjY;
import X.C68689VaP;
import X.C68915VeF;
import X.C69060VhB;
import X.C69829VwF;
import X.C70157WDs;
import X.C70196WGa;
import X.EnumC61190Rgq;
import X.InterfaceC65225TgH;
import X.R3N;
import X.SKS;
import X.UC8;
import X.VDC;
import X.WF1;
import X.X7Z;
import X.XD5;
import android.view.View;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.ArrayList;

@ReactModule(name = ReactHorizontalScrollViewManager.REACT_CLASS)
/* loaded from: classes11.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager implements XD5 {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public X7Z mFpsListener;

    public ReactHorizontalScrollViewManager(X7Z x7z) {
        super(null);
        this.mFpsListener = x7z;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // X.XD5
    public void scrollToEnd(UC8 uc8, C68689VaP c68689VaP) {
        View childAt = uc8.getChildAt(0);
        if (childAt != null) {
            int width = childAt.getWidth() + uc8.getPaddingRight();
            OverScroller overScroller = uc8.A0V;
            if (overScroller != null && !overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            boolean z = c68689VaP.A00;
            int scrollY = uc8.getScrollY();
            if (z) {
                uc8.E7j(width, scrollY);
                return;
            } else {
                uc8.scrollTo(width, scrollY);
                return;
            }
        }
        throw new RuntimeException("scrollToEnd called on HorizontalScrollView without child");
    }

    @ReactProp(name = "horizontal")
    public void setHorizontal(UC8 uc8, boolean z) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public UC8 createViewInstance(R3N r3n) {
        return new UC8(r3n);
    }

    @Override // X.XD5
    public /* bridge */ /* synthetic */ void flashScrollIndicators(Object obj) {
        ((UC8) obj).A07();
    }

    @Override // X.XD5
    public void scrollTo(UC8 uc8, C69060VhB c69060VhB) {
        OverScroller overScroller = uc8.A0V;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        boolean z = c69060VhB.A02;
        int i = c69060VhB.A00;
        int i2 = c69060VhB.A01;
        if (z) {
            uc8.E7j(i, i2);
        } else {
            uc8.scrollTo(i, i2);
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(UC8 uc8, int i, Integer num) {
        C63403SjY.A0A(uc8, EnumC61190Rgq.A02, num);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(UC8 uc8, String str) {
        Integer A00;
        if (str == null) {
            A00 = null;
        } else {
            A00 = C69829VwF.A00(str);
        }
        C63403SjY.A0C(uc8, A00);
    }

    @ReactProp(name = "contentOffset")
    public void setContentOffset(UC8 uc8, ReadableMap readableMap) {
        double d;
        if (readableMap != null) {
            double d2 = 0.0d;
            if (readableMap.hasKey("x")) {
                d = readableMap.getDouble("x");
            } else {
                d = 0.0d;
            }
            if (readableMap.hasKey("y")) {
                d2 = readableMap.getDouble("y");
            }
            uc8.scrollTo((int) WF1.A01((float) d), (int) WF1.A01((float) d2));
            return;
        }
        uc8.scrollTo(0, 0);
    }

    @ReactProp(name = "fadingEdgeLength")
    public void setFadingEdgeLength(UC8 uc8, int i) {
        if (i > 0) {
            uc8.setHorizontalFadingEdgeEnabled(true);
        } else {
            i = 0;
            uc8.setHorizontalFadingEdgeEnabled(false);
        }
        uc8.setFadingEdgeLength(i);
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(UC8 uc8, ReadableMap readableMap) {
        C68915VeF c68915VeF;
        Integer num;
        if (readableMap != null) {
            int i = readableMap.getInt("minIndexForVisible");
            if (readableMap.hasKey("autoscrollToTopThreshold")) {
                num = Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold"));
            } else {
                num = null;
            }
            c68915VeF = new C68915VeF(i, num);
        } else {
            c68915VeF = null;
        }
        uc8.setMaintainVisibleContentPosition(c68915VeF);
    }

    @ReactProp(name = "persistentScrollbar")
    public void setPersistentScrollbar(UC8 uc8, boolean z) {
        uc8.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(UC8 uc8, ReadableArray readableArray) {
        ArrayList arrayList;
        if (readableArray != null && readableArray.size() != 0) {
            float f = C63356SiD.A00().density;
            arrayList = new ArrayList();
            for (int i = 0; i < readableArray.size(); i++) {
                AbstractC166997dE.A1W(arrayList, (int) (readableArray.getDouble(i) * f));
            }
        } else {
            arrayList = null;
        }
        uc8.A06 = arrayList;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ Object updateState(View view, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        ((UC8) view).A04 = interfaceC65225TgH;
        return null;
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(UC8 uc8, int i, float f) {
        C63011Saa c63011Saa;
        if (Float.isNaN(f)) {
            c63011Saa = null;
        } else {
            c63011Saa = new C63011Saa(C05F.A00, f);
        }
        C63403SjY.A08(uc8, c63011Saa, VDC.values()[i]);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(UC8 uc8, int i, float f) {
        C63403SjY.A09(uc8, EnumC61190Rgq.values()[i], Float.valueOf(f));
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(UC8 uc8, int i) {
        uc8.setEndFillColor(i);
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(UC8 uc8, ReadableArray readableArray) {
        C63403SjY.A07(uc8, readableArray);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(UC8 uc8, float f) {
        uc8.setDecelerationRate(f);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(UC8 uc8, boolean z) {
        uc8.A08 = z;
    }

    @ReactProp(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(UC8 uc8, boolean z) {
        uc8.A0A = z;
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(UC8 uc8, boolean z) {
        uc8.setNestedScrollingEnabled(z);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(UC8 uc8, String str) {
        uc8.setOverScrollMode(C70196WGa.A01(str));
    }

    @ReactProp(name = "overflow")
    public void setOverflow(UC8 uc8, String str) {
        uc8.setOverflow(str);
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(UC8 uc8, boolean z) {
        uc8.A0B = z;
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(UC8 uc8, String str) {
        uc8.A03 = C63234Sfm.A00(str);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(UC8 uc8, boolean z) {
        uc8.setRemoveClippedSubviews(z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(UC8 uc8, boolean z) {
        uc8.A0C = z;
    }

    @ReactProp(name = "scrollEventThrottle")
    public void setScrollEventThrottle(UC8 uc8, int i) {
        uc8.A00 = i;
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(UC8 uc8, String str) {
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(UC8 uc8, boolean z) {
        uc8.A0D = z;
    }

    @ReactProp(defaultBoolean = true, name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(UC8 uc8, boolean z) {
        uc8.setHorizontalScrollBarEnabled(z);
    }

    @ReactProp(name = "snapToAlignment")
    public void setSnapToAlignment(UC8 uc8, String str) {
        uc8.A02 = C70196WGa.A02(str);
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(UC8 uc8, boolean z) {
        uc8.A0E = z;
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(UC8 uc8, float f) {
        uc8.A01 = (int) (f * C63356SiD.A00().density);
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(UC8 uc8, boolean z) {
        uc8.A0F = z;
    }

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        return new UC8(r3n);
    }

    public void flashScrollIndicators(UC8 uc8) {
        uc8.A07();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(UC8 uc8, String str, ReadableArray readableArray) {
        C70157WDs.A02(readableArray, this, uc8, str);
    }

    public Object updateState(UC8 uc8, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        uc8.A04 = interfaceC65225TgH;
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(UC8 uc8, int i, ReadableArray readableArray) {
        C70157WDs.A01(readableArray, this, uc8, i);
    }
}
