package X;

import android.os.Looper;
import java.util.ArrayList;

/* renamed from: X.VjJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69190VjJ {
    public ArrayList A00;
    public boolean A01;
    public final Looper A02;
    public final U96 A03;

    public C69190VjJ(Looper looper) {
        U96 u96;
        this.A02 = looper;
        if (looper == null) {
            u96 = null;
        } else {
            u96 = new U96(looper, this);
        }
        this.A03 = u96;
        this.A00 = new ArrayList();
    }
}
