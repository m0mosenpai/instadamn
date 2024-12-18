package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;

/* renamed from: X.B4k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25010B4k extends HashMap<String, String> {
    public C25010B4k(String str, String str2) {
        put("err_name", "DiskCorruptionError");
        put(TraceFieldType.CallPath, str);
        put("err_message", str2);
    }
}
