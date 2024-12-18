package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import com.facebook.react.modules.intent.IntentModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SZ9 {
    public static final Map A07 = AbstractC58319PtB.A0A();
    public static final String[] A08 = {"key", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Object A02;
    public final List A03;
    public final android.net.Uri A04;
    public final Runnable A05;
    public volatile Map A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.01p] */
    public final /* synthetic */ Map A00() {
        Map map;
        Cursor A01 = C0fI.A01(this.A00, this.A04, null, null, A08, null, 919598255);
        if (A01 == null) {
            return Collections.emptyMap();
        }
        try {
            int count = A01.getCount();
            if (count == 0) {
                map = Collections.emptyMap();
            } else {
                if (count <= 256) {
                    map = new C005001p(count);
                } else {
                    map = new HashMap(count, 1.0f);
                }
                while (A01.moveToNext()) {
                    map.put(A01.getString(0), A01.getString(1));
                }
            }
            return map;
        } finally {
            A01.close();
        }
    }

    public SZ9(ContentResolver contentResolver, android.net.Uri uri, Runnable runnable) {
        Q23 q23 = new Q23(this);
        this.A01 = q23;
        this.A02 = AbstractC58318PtA.A0b();
        this.A03 = AbstractC166987dD.A1E();
        contentResolver.getClass();
        this.A00 = contentResolver;
        this.A04 = uri;
        this.A05 = runnable;
        contentResolver.registerContentObserver(uri, false, q23);
    }
}
