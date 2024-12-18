package X;

import android.content.Intent;
import java.util.HashMap;

/* renamed from: X.TZi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64908TZi extends HashMap<String, String> {
    public final /* synthetic */ Intent A00;

    public C64908TZi(Intent intent, String str) {
        this.A00 = intent;
        put("intent", C08770cf.A00(intent));
        put("error", str);
    }
}
