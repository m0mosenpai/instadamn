package X;

import android.os.Looper;
import java.util.HashSet;

/* renamed from: X.R6b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60538R6b extends AbstractC50682Uo {
    public final HashSet A00;

    public C60538R6b(String[] strArr) {
        super(strArr);
        this.A00 = AbstractC166987dD.A1H();
    }

    @Override // X.AbstractC50682Uo
    public final void A00(AbstractC58570Pxo abstractC58570Pxo) {
        Looper myLooper;
        if (this.A00.add(Long.valueOf(Thread.currentThread().getId())) && (myLooper = Looper.myLooper()) != null) {
            C106484r2.A00().A02(myLooper);
        }
    }
}
