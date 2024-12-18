package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC09440dt;
import X.C3R9;
import X.C71770X3c;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public abstract class InspectableValue extends Inspectable {
    public static final Companion Companion = new Object();
    public static final InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A03, C71770X3c.A00);

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) InspectableValue.A00.getValue();
        }
    }
}
