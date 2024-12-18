package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.instagram.common.ui.base.IgButton;

/* renamed from: X.PTe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57065PTe implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ IgButton A03;
    public final /* synthetic */ C139686Tx A04;

    public RunnableC57065PTe(View view, IgButton igButton, C139686Tx c139686Tx, long j, long j2) {
        this.A03 = igButton;
        this.A04 = c139686Tx;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect A0U = AbstractC166987dD.A0U();
        IgButton igButton = this.A03;
        igButton.getHitRect(A0U);
        int i = A0U.left;
        C139686Tx c139686Tx = this.A04;
        Context A0L = AbstractC166997dE.A0L(c139686Tx.A00());
        float f = (int) this.A01;
        A0U.left = i - ((int) (AbstractC167007dF.A0K(A0L).density * f));
        A0U.right += (int) (f * AbstractC167007dF.A0K(AbstractC166997dE.A0L(c139686Tx.A00())).density);
        int i2 = A0U.bottom;
        Context A0L2 = AbstractC166997dE.A0L(c139686Tx.A00());
        A0U.bottom = i2 + ((int) (((int) this.A00) * AbstractC167007dF.A0K(A0L2).density));
        this.A02.setTouchDelegate(new TouchDelegate(A0U, igButton));
    }
}
