package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Enum$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66559UMr extends InspectableValue {
    public static final InspectableValue$Enum$Companion Companion = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66559UMr) && C14360o3.A0K(this.A00, ((C66559UMr) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("Enum(value=", this.A00, ')');
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66559UMr(String str, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X07.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
    }
}
