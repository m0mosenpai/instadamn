package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC167007dF;
import X.C14360o3;
import X.InterfaceC09250da;
import X.InterfaceC14180ni;
import X.InterfaceC16660sJ;
import X.InterfaceC58362lv;

/* loaded from: classes11.dex */
public final /* synthetic */ class SandboxSelectorFragment$sam$androidx_lifecycle_Observer$0 implements InterfaceC14180ni, InterfaceC58362lv {
    public final /* synthetic */ InterfaceC16660sJ function;

    public SandboxSelectorFragment$sam$androidx_lifecycle_Observer$0(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        this.function = interfaceC16660sJ;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.function;
    }

    @Override // X.InterfaceC58362lv
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC58362lv) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.function);
    }

    public final int hashCode() {
        return this.function.hashCode();
    }
}
