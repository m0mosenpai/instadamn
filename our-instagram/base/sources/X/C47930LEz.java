package X;

import android.content.Context;
import android.util.LruCache;
import com.facebook.stash.core.Stash;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.LEz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47930LEz {
    public static C47930LEz A08;
    public static final C1QY A09;
    public final Context A00;
    public final InterfaceC08100bW A07 = AbstractC31175DnJ.A0B();
    public final Stash A02 = C1M7.A01().A04(1887470792);
    public final C7UT A03 = new C7UT();
    public final LruCache A01 = new LruCache(100);
    public final ExecutorService A06 = Executors.newSingleThreadExecutor();
    public final ExecutorService A05 = Executors.newSingleThreadExecutor();
    public final Map A04 = AbstractC166987dD.A1I();

    static {
        C1QX c1qx = new C1QX();
        c1qx.A04 = EnumC23341Bw.Image;
        c1qx.A03 = C1Ef.OnScreen;
        A09 = c1qx.A00();
    }

    public C47930LEz(Context context) {
        this.A00 = context;
    }
}
