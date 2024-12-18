package X;

import com.facebook.flipper.plugins.uidebugger.model.Bounds;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Bounds$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66555UMn extends InspectableValue {
    public static final InspectableValue$Bounds$Companion Companion = new Object();
    public final Bounds A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66555UMn) && C14360o3.A0K(this.A00, ((C66555UMn) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66555UMn(Bounds bounds, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X03.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = bounds;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bounds(value=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
