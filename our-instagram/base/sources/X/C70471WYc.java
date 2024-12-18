package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.WYc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70471WYc implements X9R {
    public final Map A00 = new HashMap();

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.VJN] */
    @Override // X.X9R
    public final void AUo(Integer num, String str, String str2, long j) {
        VJN vjn;
        String A0B = AnonymousClass001.A0B("LiteOverlayRenderer");
        Map map = this.A00;
        if (!map.containsKey(A0B)) {
            VCU vcu = VCU.FAILED_TO_DRAW;
            ?? obj = new Object();
            obj.A01 = vcu;
            obj.A02 = "LiteOverlayRenderer";
            map.put(A0B, obj);
            vjn = obj;
        } else {
            VJN vjn2 = (VJN) map.get(A0B);
            vjn = vjn2;
            if (vjn2 == null) {
                return;
            }
        }
        vjn.A00++;
    }
}
