package com.instagram.debug.devoptions.metadata.view;

import X.C14360o3;
import X.InterfaceC09250da;
import X.InterfaceC14180ni;
import X.InterfaceC16660sJ;
import X.InterfaceC58362lv;

/* loaded from: classes6.dex */
public final /* synthetic */ class ThreadMetadataOverrideFragment$sam$androidx_lifecycle_Observer$0 implements InterfaceC14180ni, InterfaceC58362lv {
    public final /* synthetic */ InterfaceC16660sJ function;

    public ThreadMetadataOverrideFragment$sam$androidx_lifecycle_Observer$0(InterfaceC16660sJ interfaceC16660sJ) {
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
        return C14360o3.A0K(this.function, ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.function.hashCode();
    }
}