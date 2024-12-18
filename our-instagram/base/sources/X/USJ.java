package X;

import java.util.Map;

/* loaded from: classes11.dex */
public final class USJ extends AbstractRunnableC94874Os {
    public final /* synthetic */ W8x A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USJ(W8x w8x, String str, Map map) {
        super("transcodeImageV2");
        this.A00 = w8x;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.success(this.A01, null, this.A02, null);
    }
}
