package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.NGa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52379NGa extends AbstractRunnableC14200nk {
    public O7H A00;
    public String A01;
    public final /* synthetic */ C55105ObK A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52379NGa(C55105ObK c55105ObK, O7H o7h, String str) {
        super(75, 2, false, true);
        this.A02 = c55105ObK;
        this.A01 = str;
        this.A00 = o7h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap decodeFile = BitmapFactory.decodeFile(this.A01, null);
        if (decodeFile != null) {
            C55105ObK c55105ObK = this.A02;
            C50714MaD c50714MaD = c55105ObK.A07;
            O7H o7h = this.A00;
            c50714MaD.put(Integer.valueOf(o7h.A00), decodeFile);
            if (o7h.A01.get() != null) {
                c55105ObK.A06.post(new RunnableC56979PPu(decodeFile, this));
            }
        }
    }
}
