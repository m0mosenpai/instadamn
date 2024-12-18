package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.X0K;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class TraversalError {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0K.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TraversalError(String str, String str2, String str3, String str4, int i) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(X0K.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = str4;
    }
}
