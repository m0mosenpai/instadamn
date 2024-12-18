package X;

import android.view.View;
import java.util.AbstractCollection;

/* renamed from: X.P5s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56478P5s implements InterfaceC57961Pn7 {
    public final int A00;
    public final View.OnClickListener A01;
    public final Integer A02;
    public final boolean A03;

    public static void A00(View.OnClickListener onClickListener, Integer num, AbstractCollection abstractCollection, int i, boolean z) {
        abstractCollection.add(new C56478P5s(onClickListener, num, i, z));
    }

    @Override // X.InterfaceC57961Pn7
    public final Integer BKE() {
        return C05F.A00;
    }

    public C56478P5s(View.OnClickListener onClickListener, Integer num, int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A02 = num;
        this.A01 = onClickListener;
    }
}
