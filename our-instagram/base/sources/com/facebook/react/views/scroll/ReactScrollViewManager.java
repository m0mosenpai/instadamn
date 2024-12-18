package com.facebook.react.views.scroll;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31174DnI;
import X.AbstractC65702TsY;
import X.C05F;
import X.C14360o3;
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
import X.UCw;
import X.VDC;
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
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = ReactScrollViewManager.REACT_CLASS)
/* loaded from: classes11.dex */
public class ReactScrollViewManager extends ViewGroupManager implements XD5 {
    public static final String REACT_CLASS = "RCTScrollView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public X7Z mFpsListener;

    public ReactScrollViewManager(X7Z x7z) {
        super(null);
        this.mFpsListener = x7z;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getCommandsMap() {
        HashMap A0m = AbstractC65702TsY.A0m("scrollTo", 1, "scrollToEnd", 2);
        A0m.put("flashScrollIndicators", 3);
        return A0m;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // X.XD5
    public void scrollToEnd(UCw uCw, C68689VaP c68689VaP) {
        View childAt = uCw.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight() + uCw.getPaddingBottom();
            OverScroller overScroller = uCw.A0U;
            if (overScroller != null && !overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            boolean z = c68689VaP.A00;
            int scrollX = uCw.getScrollX();
            if (z) {
                uCw.E7j(scrollX, height);
                return;
            } else {
                uCw.scrollTo(scrollX, height);
                return;
            }
        }
        throw new RuntimeException("scrollToEnd called on ScrollView without child");
    }

    @ReactProp(name = "horizontal")
    public void setHorizontal(UCw uCw, boolean z) {
    }

    public static Map createExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        C14360o3.A0B(C05F.A0C, 0);
        hashMap.put("topScroll", AbstractC31174DnI.A12("registrationName", "onScroll"));
        C14360o3.A0B(C05F.A00, 0);
        hashMap.put("topScrollBeginDrag", AbstractC31174DnI.A12("registrationName", "onScrollBeginDrag"));
        C14360o3.A0B(C05F.A01, 0);
        hashMap.put("topScrollEndDrag", AbstractC31174DnI.A12("registrationName", "onScrollEndDrag"));
        C14360o3.A0B(C05F.A0N, 0);
        hashMap.put("topMomentumScrollBegin", AbstractC31174DnI.A12("registrationName", "onMomentumScrollBegin"));
        C14360o3.A0B(C05F.A0Y, 0);
        hashMap.put("topMomentumScrollEnd", AbstractC31174DnI.A12("registrationName", "onMomentumScrollEnd"));
        return hashMap;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public UCw createViewInstance(R3N r3n) {
        return new UCw(r3n);
    }

    @Override // X.XD5
    public /* bridge */ /* synthetic */ void flashScrollIndicators(Object obj) {
        ((UCw) obj).A03();
    }

    @Override // X.XD5
    public void scrollTo(UCw uCw, C69060VhB c69060VhB) {
        OverScroller overScroller = uCw.A0U;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        boolean z = c69060VhB.A02;
        int i = c69060VhB.A00;
        int i2 = c69060VhB.A01;
        if (z) {
            uCw.E7j(i, i2);
        } else {
            uCw.scrollTo(i, i2);
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(UCw uCw, int i, Integer num) {
        C63403SjY.A0A(uCw, EnumC61190Rgq.A02, num);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(UCw uCw, String str) {
        Integer A00;
        if (str == null) {
            A00 = null;
        } else {
            A00 = C69829VwF.A00(str);
        }
        C63403SjY.A0C(uCw, A00);
    }

    @ReactProp(name = "fadingEdgeLength")
    public void setFadingEdgeLength(UCw uCw, int i) {
        if (i > 0) {
            uCw.setVerticalFadingEdgeEnabled(true);
        } else {
            i = 0;
            uCw.setVerticalFadingEdgeEnabled(false);
        }
        uCw.setFadingEdgeLength(i);
    }

    @ReactProp(name = "maintainVisibleContentPosition")
    public void setMaintainVisibleContentPosition(UCw uCw, ReadableMap readableMap) {
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
        uCw.setMaintainVisibleContentPosition(c68915VeF);
    }

    @ReactProp(name = "persistentScrollbar")
    public void setPersistentScrollbar(UCw uCw, boolean z) {
        uCw.setScrollbarFadingEnabled(!z);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(UCw uCw, boolean z) {
        uCw.A0E = z;
        uCw.setFocusable(z);
    }

    @ReactProp(name = "snapToOffsets")
    public void setSnapToOffsets(UCw uCw, ReadableArray readableArray) {
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
        uCw.A08 = arrayList;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ Object updateState(View view, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        ((UCw) view).A06 = interfaceC65225TgH;
        return null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(UCw uCw, int i, float f) {
        C63011Saa c63011Saa;
        if (Float.isNaN(f)) {
            c63011Saa = null;
        } else {
            c63011Saa = new C63011Saa(C05F.A00, f);
        }
        C63403SjY.A08(uCw, c63011Saa, VDC.values()[i]);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(UCw uCw, int i, float f) {
        C63403SjY.A09(uCw, EnumC61190Rgq.values()[i], Float.valueOf(f));
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(UCw uCw, int i) {
        uCw.setEndFillColor(i);
    }

    @ReactProp(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(UCw uCw, ReadableArray readableArray) {
        C63403SjY.A07(uCw, readableArray);
    }

    @ReactProp(customType = "Point", name = "contentOffset")
    public void setContentOffset(UCw uCw, ReadableMap readableMap) {
        uCw.setContentOffset(readableMap);
    }

    @ReactProp(name = "decelerationRate")
    public void setDecelerationRate(UCw uCw, float f) {
        uCw.setDecelerationRate(f);
    }

    @ReactProp(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(UCw uCw, boolean z) {
        uCw.A0A = z;
    }

    @ReactProp(name = "enableSyncOnScroll")
    public void setEnableSyncOnScroll(UCw uCw, boolean z) {
        uCw.A0C = z;
    }

    @ReactProp(name = "isInvertedVirtualizedList")
    public void setIsInvertedVirtualizedList(UCw uCw, boolean z) {
        uCw.setVerticalScrollbarPosition(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(UCw uCw, boolean z) {
        uCw.setNestedScrollingEnabled(z);
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(UCw uCw, String str) {
        uCw.setOverScrollMode(C70196WGa.A01(str));
    }

    @ReactProp(name = "overflow")
    public void setOverflow(UCw uCw, String str) {
        uCw.setOverflow(str);
    }

    @ReactProp(name = "pagingEnabled")
    public void setPagingEnabled(UCw uCw, boolean z) {
        uCw.A0D = z;
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(UCw uCw, String str) {
        uCw.A05 = C63234Sfm.A00(str);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(UCw uCw, boolean z) {
        uCw.setRemoveClippedSubviews(z);
    }

    @ReactProp(name = "scrollEventThrottle")
    public void setScrollEventThrottle(UCw uCw, int i) {
        uCw.A00 = i;
    }

    @ReactProp(name = "scrollPerfTag")
    public void setScrollPerfTag(UCw uCw, String str) {
    }

    @ReactProp(name = "sendMomentumEvents")
    public void setSendMomentumEvents(UCw uCw, boolean z) {
        uCw.A0F = z;
    }

    @ReactProp(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(UCw uCw, boolean z) {
        uCw.setVerticalScrollBarEnabled(z);
    }

    @ReactProp(name = "snapToAlignment")
    public void setSnapToAlignment(UCw uCw, String str) {
        uCw.A02 = C70196WGa.A02(str);
    }

    @ReactProp(name = "snapToEnd")
    public void setSnapToEnd(UCw uCw, boolean z) {
        uCw.A0G = z;
    }

    @ReactProp(name = "snapToInterval")
    public void setSnapToInterval(UCw uCw, float f) {
        uCw.A01 = (int) (f * C63356SiD.A00().density);
    }

    @ReactProp(name = "snapToStart")
    public void setSnapToStart(UCw uCw, boolean z) {
        uCw.A0H = z;
    }

    public ReactScrollViewManager() {
        this(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        return new UCw(r3n);
    }

    public void flashScrollIndicators(UCw uCw) {
        uCw.A03();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(UCw uCw, String str, ReadableArray readableArray) {
        C70157WDs.A02(readableArray, this, uCw, str);
    }

    public Object updateState(UCw uCw, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        uCw.A06 = interfaceC65225TgH;
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(UCw uCw, int i, ReadableArray readableArray) {
        C70157WDs.A01(readableArray, this, uCw, i);
    }
}
