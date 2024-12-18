package com.facebook.react.uimanager;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.AbstractC58319PtB;
import X.C0I2;
import X.C62856SUd;
import X.C63104Sd8;
import X.EnumC78643fW;
import X.InterfaceC65223TgE;
import X.InterfaceC65225TgH;
import X.InterfaceC65496TlK;
import X.InterfaceC72045XLb;
import X.Q4W;
import X.R3M;
import X.R3N;
import X.SKS;
import X.T0X;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes10.dex */
public abstract class ViewManager extends BaseJavaModule {
    public static final String NAME = "ViewManager";
    public HashMap mRecyclableViews;

    public void addEventEmitters(R3N r3n, View view) {
    }

    public abstract ReactShadowNode createShadowNodeInstance();

    public abstract View createViewInstance(R3N r3n);

    public Map getCommandsMap() {
        return null;
    }

    public InterfaceC65496TlK getDelegate() {
        return null;
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public abstract Class getShadowNodeClass();

    public long measure(Context context, InterfaceC72045XLb interfaceC72045XLb, InterfaceC72045XLb interfaceC72045XLb2, InterfaceC72045XLb interfaceC72045XLb3, float f, EnumC78643fW enumC78643fW, float f2, EnumC78643fW enumC78643fW2, float[] fArr) {
        return 0L;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, EnumC78643fW enumC78643fW, float f2, EnumC78643fW enumC78643fW2, float[] fArr) {
        return 0L;
    }

    public void onAfterUpdateTransaction(View view) {
    }

    public abstract View prepareToRecycleView(R3N r3n, View view);

    @Deprecated
    public void receiveCommand(View view, int i, ReadableArray readableArray) {
    }

    public View recycleView(R3N r3n, View view) {
        return view;
    }

    public void setPadding(View view, int i, int i2, int i3, int i4) {
    }

    public abstract void updateExtraData(View view, Object obj);

    public Object updateState(View view, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        return null;
    }

    private Stack getRecyclableViewStack(int i, boolean z) {
        HashMap hashMap = this.mRecyclableViews;
        if (hashMap == null) {
            return null;
        }
        if (z) {
            Integer valueOf = Integer.valueOf(i);
            if (!hashMap.containsKey(valueOf)) {
                this.mRecyclableViews.put(valueOf, new Stack());
            }
        }
        return (Stack) AbstractC58319PtB.A0n(this.mRecyclableViews, i);
    }

    public View createViewInstance(int i, R3N r3n, SKS sks, InterfaceC65225TgH interfaceC65225TgH) {
        View createViewInstance;
        Object updateState;
        Stack recyclableViewStack = getRecyclableViewStack(r3n.A00, true);
        if (recyclableViewStack != null && !recyclableViewStack.empty()) {
            createViewInstance = (View) recyclableViewStack.pop();
        } else {
            createViewInstance = createViewInstance(r3n);
        }
        createViewInstance.setId(i);
        addEventEmitters(r3n, createViewInstance);
        if (sks != null) {
            updateProperties(createViewInstance, sks);
        }
        if (interfaceC65225TgH != null && (updateState = updateState(createViewInstance, sks, interfaceC65225TgH)) != null) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    public void onSurfaceStopped(int i) {
        HashMap hashMap = this.mRecyclableViews;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i));
        }
    }

    public void setupViewRecycling() {
        if (C62856SUd.A00.enableViewRecycling()) {
            this.mRecyclableViews = AbstractC166987dD.A1G();
        }
    }

    public void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = AbstractC166987dD.A1G();
        }
    }

    public ViewManager(R3M r3m) {
        super(r3m);
        this.mRecyclableViews = null;
    }

    public ReactShadowNode createShadowNodeInstance(R3M r3m) {
        return createShadowNodeInstance();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View createView(int i, R3N r3n, SKS sks, InterfaceC65225TgH interfaceC65225TgH, T0X t0x) {
        View createViewInstance = createViewInstance(i, r3n, sks, interfaceC65225TgH);
        if (createViewInstance instanceof InterfaceC65223TgE) {
            ((Q4W) ((InterfaceC65223TgE) createViewInstance)).A03 = t0x;
        }
        return createViewInstance;
    }

    public Map getNativeProps() {
        Class<?> cls = getClass();
        Class shadowNodeClass = getShadowNodeClass();
        HashMap A1G = AbstractC166987dD.A1G();
        Map map = C63104Sd8.A01;
        ViewManagerPropertyUpdater$Settable viewManagerPropertyUpdater$Settable = (ViewManagerPropertyUpdater$Settable) map.get(cls);
        if (viewManagerPropertyUpdater$Settable == null) {
            viewManagerPropertyUpdater$Settable = (ViewManagerPropertyUpdater$Settable) C63104Sd8.A00(cls);
            if (viewManagerPropertyUpdater$Settable == null) {
                viewManagerPropertyUpdater$Settable = new ViewManagerPropertyUpdater$FallbackViewManagerSetter(cls);
            }
            map.put(cls, viewManagerPropertyUpdater$Settable);
        }
        viewManagerPropertyUpdater$Settable.Bir(A1G);
        Map map2 = C63104Sd8.A00;
        ViewManagerPropertyUpdater$Settable viewManagerPropertyUpdater$Settable2 = (ViewManagerPropertyUpdater$Settable) map2.get(shadowNodeClass);
        if (viewManagerPropertyUpdater$Settable2 == null) {
            viewManagerPropertyUpdater$Settable2 = (ViewManagerPropertyUpdater$Settable) C63104Sd8.A00(shadowNodeClass);
            if (viewManagerPropertyUpdater$Settable2 == null) {
                viewManagerPropertyUpdater$Settable2 = new ViewManagerPropertyUpdater$FallbackShadowNodeSetter(shadowNodeClass);
            }
            map2.put(shadowNodeClass, viewManagerPropertyUpdater$Settable2);
        }
        viewManagerPropertyUpdater$Settable2.Bir(A1G);
        return A1G;
    }

    public void onDropViewInstance(View view) {
        View prepareToRecycleView;
        String str;
        StringBuilder A11;
        Context context = view.getContext();
        if (context == null) {
            str = NAME;
            A11 = AbstractC166997dE.A11("onDropViewInstance: view [");
            A11.append(view.getId());
            A11.append("] has a null context");
        } else if (!(context instanceof R3N)) {
            str = NAME;
            A11 = AbstractC166997dE.A11("onDropViewInstance: view [");
            A11.append(view.getId());
            A11.append("] has a context that is not a ThemedReactContext: ");
            A11.append(context);
        } else {
            R3N r3n = (R3N) context;
            Stack recyclableViewStack = getRecyclableViewStack(r3n.A00, false);
            if (recyclableViewStack == null || (prepareToRecycleView = prepareToRecycleView(r3n, view)) == null) {
                return;
            }
            recyclableViewStack.push(prepareToRecycleView);
            return;
        }
        C0I2.A03(str, A11.toString());
    }

    public void receiveCommand(View view, String str, ReadableArray readableArray) {
        InterfaceC65496TlK delegate = getDelegate();
        if (delegate != null) {
            delegate.E8c(view, str, readableArray);
        }
    }

    public void updateProperties(View view, SKS sks) {
        InterfaceC65496TlK delegate = getDelegate();
        if (delegate != null) {
            Iterator entryIterator = sks.A00.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(entryIterator);
                delegate.Ebq(view, A1K.getValue(), AbstractC31172DnG.A17(A1K));
            }
        } else {
            Class<?> cls = getClass();
            Map map = C63104Sd8.A01;
            ViewManagerPropertyUpdater$ViewManagerSetter viewManagerPropertyUpdater$ViewManagerSetter = (ViewManagerPropertyUpdater$ViewManagerSetter) map.get(cls);
            if (viewManagerPropertyUpdater$ViewManagerSetter == null) {
                viewManagerPropertyUpdater$ViewManagerSetter = (ViewManagerPropertyUpdater$ViewManagerSetter) C63104Sd8.A00(cls);
                if (viewManagerPropertyUpdater$ViewManagerSetter == null) {
                    viewManagerPropertyUpdater$ViewManagerSetter = new ViewManagerPropertyUpdater$FallbackViewManagerSetter(cls);
                }
                map.put(cls, viewManagerPropertyUpdater$ViewManagerSetter);
            }
            Iterator entryIterator2 = sks.A00.getEntryIterator();
            while (entryIterator2.hasNext()) {
                Map.Entry A1K2 = AbstractC166987dD.A1K(entryIterator2);
                viewManagerPropertyUpdater$ViewManagerSetter.Ebp(view, this, A1K2.getValue(), AbstractC31172DnG.A17(A1K2));
            }
        }
        onAfterUpdateTransaction(view);
    }

    public ViewManager() {
        super(null);
        this.mRecyclableViews = null;
    }
}
