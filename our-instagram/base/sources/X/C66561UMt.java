package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Size$Companion;
import com.facebook.flipper.plugins.uidebugger.model.Size;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66561UMt extends InspectableValue {
    public static final InspectableValue$Size$Companion Companion = new Object();
    public final Size A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66561UMt) && C14360o3.A0K(this.A00, ((C66561UMt) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66561UMt(Size size, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X09.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = size;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Size(value=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
