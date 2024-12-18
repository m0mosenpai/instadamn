package X;

import java.util.HashMap;

/* renamed from: X.A9k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22940A9k {
    public final long A00;
    public final long A01;
    public final AbstractC12990ll A02;
    public final String A03;
    public final String A04;
    public final HashMap A05;

    public C22940A9k(AbstractC12990ll abstractC12990ll, String str, String str2, HashMap hashMap, long j, long j2) {
        this.A02 = abstractC12990ll;
        this.A03 = str;
        this.A05 = hashMap;
        this.A00 = j;
        this.A01 = j2;
        if (str2 == null) {
            str2 = null;
            if (str == null || hashMap == null) {
                AbstractC25241Le.A02("IgBloksActionDataEmitter", "appId and params should not be null when fetching an async action");
            } else {
                str2 = AnonymousClass001.A0R(AbstractC191888ek.A00(hashMap, str, null), "loaded_screen_query");
            }
        }
        this.A04 = str2;
    }
}
