package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Unknown$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class UMw extends InspectableValue {
    public static final InspectableValue$Unknown$Companion Companion = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof UMw) && C14360o3.A0K(this.A00, ((UMw) obj).A00));
    }

    public final String toString() {
        return AnonymousClass001.A0S("Unknown(value=", this.A00, ')');
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ UMw(String str, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X0C.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }
}
