package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Boolean$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66554UMm extends InspectableValue {
    public static final InspectableValue$Boolean$Companion Companion = new Object();
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66554UMm) && this.A00 == ((C66554UMm) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0L("Boolean(value=", ')', this.A00);
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66554UMm(int i, boolean z) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X02.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = z;
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }
}
