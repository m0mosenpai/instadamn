package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC06930Yk;
import X.AbstractC68219VIb;
import X.C14360o3;
import X.C16920sk;
import X.C192398fh;
import X.C3R9;
import X.C3RL;
import X.X0D;
import X.X0E;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class MetadataUpdateEvent {
    public final Map A00;
    public static final Companion Companion = new Object();
    public static final C3R9[] A01 = {new C3RL(C192398fh.A00, X0D.A00)};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0E.A00;
        }
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MetadataUpdateEvent(Map map, int i) {
        if ((i & 1) == 0) {
            this.A00 = AbstractC06930Yk.A0E();
        } else {
            this.A00 = map;
        }
    }

    public MetadataUpdateEvent() {
        C16920sk A0E = AbstractC06930Yk.A0E();
        C14360o3.A0B(A0E, 1);
        this.A00 = A0E;
    }
}
