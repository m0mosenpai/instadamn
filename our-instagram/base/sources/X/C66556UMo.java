package X;

import com.facebook.flipper.plugins.uidebugger.model.Color;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Color$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66556UMo extends InspectableValue {
    public static final InspectableValue$Color$Companion Companion = new Object();
    public final Color A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66556UMo) && C14360o3.A0K(this.A00, ((C66556UMo) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66556UMo(Color color, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X04.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = color;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color(value=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
