package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C3R9;
import X.C3SG;
import X.C3TW;
import X.C71726Wzr;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class BoxData {
    public static final C3R9[] A03;
    public static final Companion Companion = new Object();
    public final List A00;
    public final List A01;
    public final List A02;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71726Wzr.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.flipper.plugins.uidebugger.model.BoxData$Companion, java.lang.Object] */
    static {
        C3TW c3tw = C3TW.A00;
        A03 = new C3R9[]{new C3SG(c3tw), new C3SG(c3tw), new C3SG(c3tw)};
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BoxData(int i, List list, List list2, List list3) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71726Wzr.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A01 = list;
        this.A00 = list2;
        this.A02 = list3;
    }
}
