package X;

import com.facebook.flipper.plugins.uidebugger.model.Inspectable;
import com.facebook.flipper.plugins.uidebugger.model.InspectableObject$Companion;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66553UMl extends Inspectable {
    public final Map A00;
    public static final InspectableObject$Companion Companion = new Object();
    public static final C3R9[] A01 = {new C3RL(C192398fh.A00, (C3R9) Inspectable.A00.getValue())};

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66553UMl) && C14360o3.A0K(this.A00, ((C66553UMl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66553UMl(Map map, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X01.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InspectableObject(fields=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
