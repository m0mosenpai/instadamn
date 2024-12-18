package com.instagram.react.modules.product;

import X.AbstractC12990ll;
import X.R3M;
import com.facebook.fbreact.specs.NativeIGShoppingPickerModuleSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGShoppingPickerModule")
/* loaded from: classes10.dex */
public class IgReactShoppingPickerModule extends NativeIGShoppingPickerModuleSpec {
    public static final String MODULE_NAME = "IGShoppingPickerModule";
    public static final String PICKER_VALUE_SELECTED = "IGShoppingPickerIndexSelected";
    public final AbstractC12990ll mSession;

    @Override // com.facebook.fbreact.specs.NativeIGShoppingPickerModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGShoppingPickerModule";
    }

    public IgReactShoppingPickerModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mSession = abstractC12990ll;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r10 >= r4.size()) goto L12;
     */
    @Override // com.facebook.fbreact.specs.NativeIGShoppingPickerModuleSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void openPicker(java.lang.String r8, com.facebook.react.bridge.ReadableArray r9, double r10) {
        /*
            r7 = this;
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.ArrayList r0 = r9.toArrayList()
            java.util.Iterator r2 = r0.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Lc
            r4.add(r1)
            goto Lc
        L1e:
            r1 = 0
            r5 = r10
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L2f
            int r0 = r4.size()
            double r2 = (double) r0
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L30
        L2f:
            r0 = 0
        L30:
            X.C18C.A0E(r0)
            X.J5k r1 = new X.J5k
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5)
            X.C63255SgD.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.product.IgReactShoppingPickerModule.openPicker(java.lang.String, com.facebook.react.bridge.ReadableArray, double):void");
    }
}
