package X;

import com.facebook.flipper.plugins.uidebugger.model.Coordinate3D;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Coordinate3D$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66557UMp extends InspectableValue {
    public static final InspectableValue$Coordinate3D$Companion Companion = new Object();
    public final Coordinate3D A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66557UMp) && C14360o3.A0K(this.A00, ((C66557UMp) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66557UMp(Coordinate3D coordinate3D, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X06.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = coordinate3D;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coordinate3D(value=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
