package X;

import java.util.Map;

/* renamed from: X.YIa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73530YIa implements Runnable {
    public final /* synthetic */ YAS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public RunnableC73530YIa(YAS yas, String str, Map map, boolean z) {
        this.A00 = yas;
        this.A01 = str;
        this.A03 = z;
        this.A02 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.DHE(this.A01, this.A02, this.A03);
    }
}
