package X;

import com.facebook.flipper.plugins.bloksdebugger.Event;
import com.facebook.flipper.plugins.bloksdebugger.InitialState$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66549UMf extends Event {
    public static final InitialState$Companion Companion = new Object();
    public final Object A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66549UMf(Object obj, String str, @Serializable(with = C71699Wz8.class) String str2, String str3, int i) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(C71714Wzf.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A03 = str;
        this.A00 = obj;
        this.A02 = str2;
        this.A01 = str3;
    }
}
