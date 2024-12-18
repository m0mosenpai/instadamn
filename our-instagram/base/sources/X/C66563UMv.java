package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Text$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66563UMv extends InspectableValue {
    public static final InspectableValue$Text$Companion Companion = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66563UMv) && C14360o3.A0K(this.A00, ((C66563UMv) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("Text(value=", this.A00, ')');
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66563UMv(String str, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X0B.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
    }
}
