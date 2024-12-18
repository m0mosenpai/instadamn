package X;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.1Tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27141Tn {
    public final C23161Av A00;
    public final long A01;
    public final Context A02;
    public final Resources A03;
    public final C27111Tk A04;
    public final boolean A05;
    public final boolean A06;
    public volatile SettableFuture A07;

    public C27141Tn(Context context, Resources resources, C27111Tk c27111Tk, long j, boolean z, boolean z2) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(resources, 2);
        C14360o3.A0B(c27111Tk, 7);
        this.A02 = context;
        this.A03 = resources;
        this.A01 = j;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = c27111Tk;
        this.A00 = C23161Av.A00(context);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final synchronized void A00() {
        if (this.A07 == null) {
            this.A07 = new Object();
            try {
                C23161Av c23161Av = this.A00;
                File AXd = c23161Av.AXd(null, 2093722256);
                ArrayList arrayList = new ArrayList();
                Executor executor = C03220Df.A07;
                Context context = this.A02;
                arrayList.add(new AbstractC03210De("layouts.bin.sha256", "layouts.bin.sha256"));
                arrayList.add(new AbstractC03210De("layouts.bin.xz", "layouts.bin"));
                AbstractC05810Sj.A00(AXd);
                for (int i = 0; i < arrayList.size(); i++) {
                    AbstractC03210De abstractC03210De = (AbstractC03210De) arrayList.get(i);
                    abstractC03210De.A00 = new File(AXd, abstractC03210De.A01);
                }
                new C03220Df(context, AXd, "unpackLayoutBundle", arrayList, executor).A03();
                try {
                    SettableFuture settableFuture = this.A07;
                    C14360o3.A0A(settableFuture);
                    settableFuture.set(new C27221Tw(this.A03, this.A04, new File(AXd, "layouts.bin"), (int) this.A01, this.A05, this.A06));
                } catch (IOException e) {
                    new File(c23161Av.AXd(null, 2093722256), "layouts.bin.sha256").delete();
                    throw new RuntimeException("Unable to initialize mBundledLayoutLoader", e);
                }
            } catch (Throwable th) {
                SettableFuture settableFuture2 = this.A07;
                C14360o3.A0A(settableFuture2);
                settableFuture2.setException(th);
                throw th;
            }
        }
    }
}
