package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes8.dex */
public final class LQF implements View.OnLongClickListener {
    public final /* synthetic */ C75Y A00;
    public final /* synthetic */ C1574475a A01;
    public final /* synthetic */ AbstractC158757Al A02;

    public LQF(C75Y c75y, C1574475a c1574475a, AbstractC158757Al abstractC158757Al) {
        this.A00 = c75y;
        this.A02 = abstractC158757Al;
        this.A01 = c1574475a;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C75Y c75y = this.A00;
        AbstractC158757Al abstractC158757Al = this.A02;
        C1574475a c1574475a = this.A01;
        MessageIdentifier messageIdentifier = new MessageIdentifier(abstractC158757Al.A04(), null);
        C7QX c7qx = new C7QX(null, new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), C7P3.A0S, C2EY.A0G, messageIdentifier, null, null, 0L, false, false, false, abstractC158757Al.A08(), false);
        RectF A0G = AbstractC13880nE.A0G(c1574475a.A00);
        ((InterfaceC165307aJ) c75y.A01).El9(new PointF(A0G.centerX(), A0G.centerY()), c7qx, c7qx.A02, 0L, false, c75y.A02.A1U);
        return true;
    }
}
