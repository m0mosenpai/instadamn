package X;

import java.util.Map;

/* loaded from: classes12.dex */
public final class YID implements Runnable {
    public final /* synthetic */ YAS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public YID(YAS yas, String str, Map map) {
        this.A00 = yas;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.DHA(this.A01, this.A02);
    }
}