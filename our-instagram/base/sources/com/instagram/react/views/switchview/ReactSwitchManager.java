package com.instagram.react.views.switchview;

import X.AbstractC05810Sj;
import X.AbstractC78533fL;
import X.AbstractC78733ff;
import X.C14360o3;
import X.C60959Rch;
import X.C63532Soz;
import X.EnumC78643fW;
import X.InterfaceC50872Vi;
import X.R3N;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes10.dex */
public class ReactSwitchManager extends SimpleViewManager {
    public static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new C63532Soz();
    public static final String REACT_CLASS = "AndroidSwitch";

    /* loaded from: classes10.dex */
    public class ReactSwitchShadowNode extends LayoutShadowNode implements InterfaceC50872Vi {
        public int A00;
        public int A01;
        public boolean A02;

        /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.igds.components.switchbutton.IgdsSwitch, android.view.View, X.Rch] */
        @Override // X.InterfaceC50872Vi
        public final long CpA(EnumC78643fW enumC78643fW, EnumC78643fW enumC78643fW2, AbstractC78533fL abstractC78533fL, float f, float f2) {
            if (!this.A02) {
                int i = IgdsSwitch.A0M;
                R3N r3n = this.A0A;
                AbstractC05810Sj.A00(r3n);
                C14360o3.A0B(r3n, 1);
                ?? igdsSwitch = new IgdsSwitch(r3n, null, 0);
                igdsSwitch.A00 = true;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                igdsSwitch.measure(makeMeasureSpec, makeMeasureSpec);
                this.A01 = igdsSwitch.getMeasuredWidth();
                this.A00 = igdsSwitch.getMeasuredHeight();
                this.A02 = true;
            }
            return AbstractC78733ff.A00(this.A01, this.A00);
        }

        public ReactSwitchShadowNode() {
            A09(this);
        }
    }

    public ReactSwitchManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "on")
    public void setOn(C60959Rch c60959Rch, boolean z) {
        c60959Rch.setOnCheckedChangeListener(null);
        c60959Rch.setOn(z);
        c60959Rch.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void addEventEmitters(R3N r3n, View view) {
        ((CompoundButton) view).setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.igds.components.switchbutton.IgdsSwitch, X.Rch] */
    @Override // com.facebook.react.uimanager.ViewManager
    public C60959Rch createViewInstance(R3N r3n) {
        int i = IgdsSwitch.A0M;
        C14360o3.A0B(r3n, 1);
        ?? igdsSwitch = new IgdsSwitch(r3n, null, 0);
        igdsSwitch.A00 = true;
        return igdsSwitch;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(C60959Rch c60959Rch, boolean z) {
        c60959Rch.setEnabled(z);
    }

    public void addEventEmitters(R3N r3n, C60959Rch c60959Rch) {
        c60959Rch.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ ReactShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.igds.components.switchbutton.IgdsSwitch, android.view.View, X.Rch] */
    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        int i = IgdsSwitch.A0M;
        C14360o3.A0B(r3n, 1);
        ?? igdsSwitch = new IgdsSwitch(r3n, null, 0);
        igdsSwitch.A00 = true;
        return igdsSwitch;
    }
}
