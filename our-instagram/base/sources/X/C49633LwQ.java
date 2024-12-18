package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.LwQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49633LwQ implements InterfaceC30956DjD {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ KCX A01;

    public C49633LwQ(Rect rect, KCX kcx) {
        this.A01 = kcx;
        this.A00 = rect;
    }

    @Override // X.InterfaceC30956DjD
    public final void DRe(List list) {
        C54793OJl c54793OJl = this.A01.A0A;
        if (c54793OJl != null) {
            c54793OJl.A00(this.A00, AbstractC46669Kkm.A00(list));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
