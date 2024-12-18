package androidx.sharetarget;

import X.AbstractC58318PtA;
import X.AbstractC61577Rq1;
import X.C005001p;
import X.C56I;
import X.C58495PwN;
import X.MSW;
import X.RunnableC58487PwE;
import X.RunnableC58491PwI;
import X.RunnableC58493PwL;
import X.RunnableC58503PwW;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class ShortcutInfoCompatSaverImpl extends AbstractC61577Rq1 {
    public static final Object A07 = AbstractC58318PtA.A0b();
    public static volatile ShortcutInfoCompatSaverImpl A08;
    public final Context A00;
    public final File A01;
    public final File A02;
    public final ExecutorService A05;
    public final ExecutorService A06;
    public final Map A04 = new C005001p(0);
    public final Map A03 = new C005001p(0);

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (A08 == null) {
            synchronized (A07) {
                if (A08 == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    A08 = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        return A08;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.56I] */
    public final void A01(C56I c56i) {
        RunnableC58493PwL runnableC58493PwL = new RunnableC58493PwL(this, new ArrayList(this.A04.values()));
        ?? obj = new Object();
        this.A06.submit(new RunnableC58487PwE(obj, this, runnableC58493PwL));
        obj.addListener(new RunnableC58491PwI(c56i, this, obj), this.A05);
    }

    public final void A02(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C58495PwN) it.next()).A01;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        for (File file : this.A01.listFiles()) {
            if (!arrayList.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.01p, java.util.Map] */
    public ShortcutInfoCompatSaverImpl(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.A00 = context.getApplicationContext();
        this.A05 = executorService;
        this.A06 = executorService2;
        File A0w = MSW.A0w(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.A01 = MSW.A0w(A0w, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.A02 = MSW.A0w(A0w, "targets.xml");
        executorService.submit(new RunnableC58503PwW(this, A0w));
    }
}
