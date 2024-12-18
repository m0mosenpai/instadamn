package com.instagram.react.modules.product;

import X.AbstractC018607g;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC192798gL;
import X.AbstractC43594JPz;
import X.AbstractC58321PtD;
import X.C08790ch;
import X.C192108fB;
import X.C1GJ;
import X.C32394EOv;
import X.C62862tP;
import X.C63255SgD;
import X.R3M;
import X.TF5;
import X.TRE;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGBloksNavigationReactModuleSpec;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ReactModule(name = "IGBloksNavigationReactModule")
/* loaded from: classes10.dex */
public class IgReactBloksNavigationModule extends NativeIGBloksNavigationReactModuleSpec {
    public static final String MODULE_NAME = "IGBloksNavigationReactModule";
    public AbstractC12990ll mSession;

    @Override // com.facebook.fbreact.specs.NativeIGBloksNavigationReactModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGBloksNavigationReactModule";
    }

    @Override // com.facebook.fbreact.specs.NativeIGBloksNavigationReactModuleSpec
    @ReactMethod
    public void navigate(double d, String str, String str2, ReadableMap readableMap) {
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 != null && (A01 instanceof FragmentActivity)) {
            C63255SgD.A01(new TRE(A01, this, str, str2, parseParams(readableMap)));
        }
    }

    private HashMap parseParams(ReadableMap readableMap) {
        HashMap A1G;
        if (readableMap != null) {
            A1G = readableMap.toHashMap();
        } else {
            A1G = AbstractC166987dD.A1G();
        }
        HashMap A1G2 = AbstractC166987dD.A1G();
        Iterator A14 = AbstractC166997dE.A14(A1G);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            if (A1K.getValue() instanceof String) {
                AbstractC43594JPz.A1S(A1G2, A1K);
            }
        }
        return A1G2;
    }

    public IgReactBloksNavigationModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mSession = abstractC12990ll;
    }

    @Override // com.facebook.fbreact.specs.NativeIGBloksNavigationReactModuleSpec
    @ReactMethod
    public void runAction(double d, String str, ReadableMap readableMap) {
        FragmentActivity fragmentActivity = (FragmentActivity) AbstractC58321PtD.A0b(this).A01();
        C62862tP A04 = C62862tP.A04(fragmentActivity, new TF5(this), this.mSession);
        HashMap parseParams = parseParams(readableMap);
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        C08790ch A00 = AbstractC018607g.A00(fragmentActivity);
        AbstractC192798gL A042 = C192108fB.A04(this.mSession, str, parseParams);
        A042.A00(new C32394EOv(11, this, A04));
        C1GJ.A00(A01, A00, A042);
    }
}
