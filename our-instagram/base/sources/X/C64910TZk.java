package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.TZk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64910TZk extends HashMap {
    public final int A00 = 2;
    public final Object A01;

    public C64910TZk(SKQ skq, String str) {
        this.A01 = skq;
        put("surface", str);
        put("mechanism", "mechanism_location_sharing_button");
    }

    public C64910TZk(SKQ skq, String str, String str2) {
        this.A01 = skq;
        put("surface", str);
        put("mechanism", "mechanism_location_sharing_button");
        put("result", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64910TZk(C62474SDb c62474SDb, Map map) {
        super(map);
        this.A01 = c62474SDb;
        put("logging_unit_id", null);
    }
}
