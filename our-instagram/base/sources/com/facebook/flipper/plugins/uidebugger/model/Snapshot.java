package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.X0I;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class Snapshot {
    public static final Companion Companion = new Object();
    public final int A00;
    public final String A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0I.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Snapshot(String str, int i, int i2) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X0I.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = i2;
        this.A01 = str;
    }
}
