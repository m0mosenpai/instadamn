package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Evv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33769Evv {
    public static Map A00(C5JN c5jn) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5jn.B0M() != null) {
            A1I.put("editing_locked_message", c5jn.B0M());
        }
        if (c5jn.CSv() != null) {
            A1I.put("is_editing_locked", c5jn.CSv());
        }
        if (c5jn.BPw() != null) {
            A1I.put("max_num_addresses", c5jn.BPw());
        }
        if (c5jn.BPx() != null) {
            A1I.put("max_num_edits", c5jn.BPx());
        }
        if (c5jn.BXe() != null) {
            A1I.put("num_edits", c5jn.BXe());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
