package X;

import com.facebook.flipper.plugins.uidebugger.model.Coordinate;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Coordinate$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66558UMq extends InspectableValue {
    public static final InspectableValue$Coordinate$Companion Companion = new Object();
    public final Coordinate A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66558UMq) && C14360o3.A0K(this.A00, ((C66558UMq) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66558UMq(Coordinate coordinate, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X05.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = coordinate;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coordinate(value=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
