package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Number$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66560UMs extends InspectableValue {
    public static final InspectableValue$Number$Companion Companion = new Object();
    public final Number A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66560UMs) && C14360o3.A0K(this.A00, ((C66560UMs) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66560UMs(Number number, @Serializable(with = C71700Wz9.class) int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X08.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = number;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC111324zv.A00(1702));
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
