package com.facebook.react.views.swiperefresh;

import X.AbstractC167007dF;
import X.AbstractC31174DnI;
import X.AbstractC65702TsY;
import X.AbstractC70462WWz;
import X.C63233Sfl;
import X.C66494UJz;
import X.InterfaceC65496TlK;
import X.R3N;
import X.WT8;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = SwipeRefreshLayoutManager.REACT_CLASS)
/* loaded from: classes11.dex */
public class SwipeRefreshLayoutManager extends ViewGroupManager {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    public final InterfaceC65496TlK mDelegate;

    public SwipeRefreshLayoutManager() {
        super(null);
        this.mDelegate = new AbstractC70462WWz(this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.UJz, androidx.swiperefreshlayout.widget.SwipeRefreshLayout] */
    @Override // com.facebook.react.uimanager.ViewManager
    public C66494UJz createViewInstance(R3N r3n) {
        ?? swipeRefreshLayout = new SwipeRefreshLayout(r3n, null);
        swipeRefreshLayout.A03 = false;
        swipeRefreshLayout.A06 = false;
        swipeRefreshLayout.A01 = 0.0f;
        swipeRefreshLayout.A05 = false;
        swipeRefreshLayout.A02 = ViewConfiguration.get(r3n).getScaledTouchSlop();
        return swipeRefreshLayout;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return AbstractC31174DnI.A12("SIZE", AbstractC65702TsY.A0m("DEFAULT", 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(customType = "ColorArray", name = "colors")
    public void setColors(C66494UJz c66494UJz, ReadableArray readableArray) {
        int[] iArr;
        int i;
        if (readableArray != null) {
            iArr = new int[readableArray.size()];
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                if (readableArray.getType(i2) == ReadableType.Map) {
                    i = C63233Sfl.A00(c66494UJz.getContext(), readableArray.getMap(i2)).intValue();
                } else {
                    i = readableArray.getInt(i2);
                }
                iArr[i2] = i;
            }
        } else {
            iArr = new int[0];
        }
        c66494UJz.setColorSchemeColors(iArr);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(R3N r3n, C66494UJz c66494UJz) {
        c66494UJz.A0E = new WT8(r3n, c66494UJz, this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC65496TlK getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C66494UJz c66494UJz, String str, ReadableArray readableArray) {
        if (str.equals("setNativeRefreshing") && readableArray != null) {
            c66494UJz.setRefreshing(readableArray.getBoolean(0));
        }
    }

    public /* bridge */ /* synthetic */ void setNativeRefreshing(View view, boolean z) {
        ((SwipeRefreshLayout) view).setRefreshing(z);
    }

    @ReactProp(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(C66494UJz c66494UJz, Integer num) {
        int intValue;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        c66494UJz.setProgressBackgroundColorSchemeColor(intValue);
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public /* bridge */ /* synthetic */ void setProgressViewOffset(View view, float f) {
        ((C66494UJz) view).setProgressViewOffset(f);
    }

    @ReactProp(name = "refreshing")
    public /* bridge */ /* synthetic */ void setRefreshing(View view, boolean z) {
        ((SwipeRefreshLayout) view).setRefreshing(z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        HashMap hashMap = new HashMap();
        hashMap.put("topRefresh", AbstractC31174DnI.A12("registrationName", "onRefresh"));
        exportedCustomDirectEventTypeConstants.putAll(hashMap);
        return exportedCustomDirectEventTypeConstants;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(C66494UJz c66494UJz, boolean z) {
        c66494UJz.setEnabled(z);
    }

    @ReactProp(name = "size")
    public void setSize(C66494UJz c66494UJz, Dynamic dynamic) {
        int asInt;
        if (dynamic.isNull()) {
            asInt = 1;
        } else if (dynamic.getType() == ReadableType.Number) {
            asInt = dynamic.asInt();
        } else {
            if (dynamic.getType() == ReadableType.String) {
                setSize(c66494UJz, dynamic.asString());
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
        c66494UJz.setSize(asInt);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.UJz, androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View] */
    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        ?? swipeRefreshLayout = new SwipeRefreshLayout(r3n, null);
        swipeRefreshLayout.A03 = false;
        swipeRefreshLayout.A06 = false;
        swipeRefreshLayout.A01 = 0.0f;
        swipeRefreshLayout.A05 = false;
        swipeRefreshLayout.A02 = ViewConfiguration.get(r3n).getScaledTouchSlop();
        return swipeRefreshLayout;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z) {
        view.setEnabled(z);
    }

    public void setNativeRefreshing(C66494UJz c66494UJz, boolean z) {
        c66494UJz.setRefreshing(z);
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(C66494UJz c66494UJz, float f) {
        c66494UJz.setProgressViewOffset(f);
    }

    @ReactProp(name = "refreshing")
    public void setRefreshing(C66494UJz c66494UJz, boolean z) {
        c66494UJz.setRefreshing(z);
    }

    public void setSize(C66494UJz c66494UJz, String str) {
        int i;
        if (str != null && !str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
            if (str.equals("large")) {
                i = 0;
            } else {
                throw AbstractC167007dF.A0c("Size must be 'default' or 'large', received: ", str);
            }
        } else {
            i = 1;
        }
        c66494UJz.setSize(i);
    }

    public void setSize(C66494UJz c66494UJz, int i) {
        c66494UJz.setSize(i);
    }
}
