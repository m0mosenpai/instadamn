package X;

import java.util.Map;

/* loaded from: classes11.dex */
public final class USM extends AbstractRunnableC94874Os {
    public final /* synthetic */ W8x A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Map A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USM(W8x w8x, String str, String str2, Map map, Map map2) {
        super("transcodeImageV2");
        this.A00 = w8x;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = map;
        this.A04 = map2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.success(this.A01, this.A02, this.A03, this.A04);
    }
}
