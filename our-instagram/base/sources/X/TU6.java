package X;

import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TU6 implements Callable {
    public final /* synthetic */ C63Q A00;
    public final /* synthetic */ String A01;

    public TU6(C63Q c63q, String str) {
        this.A00 = c63q;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C63Q c63q = this.A00;
        String str = this.A01;
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryDiskCache", "removeResponseForKey", ':'));
            c63q.A01.A00.remove(str);
            Object obj = c63q.A05.get();
            C14360o3.A07(obj);
            C63Q.A00(c63q, AbstractC06930Yk.A09(str, AbstractC06930Yk.A0B((Map) obj)));
            C1LN.A00();
            return C0eB.A00;
        } catch (Throwable th) {
            C1LN.A00();
            throw th;
        }
    }
}
