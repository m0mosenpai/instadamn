package com.instagram.debug.devoptions.metadata.model;

import X.AbstractC25233BEq;
import X.C14360o3;
import X.InterfaceC16620sF;
import X.InterfaceC66482zP;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverride implements InterfaceC66482zP {
    public boolean hasOverridden;
    public final String name;
    public final InterfaceC16620sF onSave;
    public final Class returnType;
    public Object value;

    public ThreadMetadataOverride(String str, Object obj, Class cls, InterfaceC16620sF interfaceC16620sF) {
        AbstractC25233BEq.A0w(1, str, cls, interfaceC16620sF);
        this.name = str;
        this.value = obj;
        this.returnType = cls;
        this.onSave = interfaceC16620sF;
    }

    public final void update(Object obj) {
        this.value = obj;
        this.hasOverridden = true;
    }

    public final boolean getHasOverridden() {
        return this.hasOverridden;
    }

    @Override // X.InterfaceC66482zP
    public /* bridge */ /* synthetic */ Object getKey() {
        return this.name;
    }

    public final String getName() {
        return this.name;
    }

    public final InterfaceC16620sF getOnSave() {
        return this.onSave;
    }

    public final Class getReturnType() {
        return this.returnType;
    }

    public final Object getValue() {
        return this.value;
    }

    public boolean isContentSame(ThreadMetadataOverride threadMetadataOverride) {
        return C14360o3.A0K(threadMetadataOverride, this);
    }

    @Override // X.InterfaceC66482zP
    public String getKey() {
        return this.name;
    }

    @Override // X.InterfaceC66492zQ
    public /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return C14360o3.A0K(obj, this);
    }
}
