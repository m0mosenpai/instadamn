package X;

import android.content.ClipData;
import android.content.Context;
import java.util.List;

/* renamed from: X.Az9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24848Az9 implements Runnable {
    public final /* synthetic */ ClipData A00;
    public final /* synthetic */ C7GE A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public RunnableC24848Az9(ClipData clipData, C7GE c7ge, List list, boolean z) {
        this.A02 = list;
        this.A00 = clipData;
        this.A01 = c7ge;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A02;
        if (!list.isEmpty() && list.size() == this.A00.getItemCount()) {
            C7FG c7fg = (C7FG) this.A01.A01.get();
            if (c7fg != null) {
                c7fg.A06(null, null, null, null, AbstractC46669Kkm.A00(list), true, false);
                return;
            }
            return;
        }
        if (this.A03) {
            Context context = (Context) this.A01.A00.get();
            if (context == null) {
                return;
            }
            C9GR.A06(context, 2131976701);
            return;
        }
        C7GF.A00(this.A01);
    }
}
