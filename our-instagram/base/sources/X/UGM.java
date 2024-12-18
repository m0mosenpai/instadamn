package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class UGM extends C8S8 {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C102884kP A01;

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    public UGM(C6FG c6fg, C102884kP c102884kP) {
        this.A01 = c102884kP;
        this.A00 = c6fg;
    }

    @Override // X.C8S8
    public final int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        return C8S8.makeMovementFlags(15, 0);
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        if (AbstractC68226VIm.A02 != null) {
            int absoluteAdapterPosition = c3oo.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = c3oo2.getAbsoluteAdapterPosition();
            InterfaceC103384lE A09 = this.A01.A09();
            if (A09 == null) {
                AnonymousClass630 A02 = AnonymousClass634.A02(this.A00);
                if (AbstractC79383gk.A03()) {
                    A02.A00++;
                }
                A02.A0G(new C70695WfI(AbstractC68226VIm.A02.A04), new C67964V4d(this, absoluteAdapterPosition, absoluteAdapterPosition2));
                A02.A08();
            } else if (AbstractC68226VIm.A00 != absoluteAdapterPosition && AbstractC68226VIm.A01 != absoluteAdapterPosition2) {
                C102884kP c102884kP = AbstractC68226VIm.A02;
                C6FX c6fx = new C6FX();
                C6FG c6fg = this.A00;
                c6fx.A01(c6fg);
                c6fx.A03(Integer.valueOf(absoluteAdapterPosition), 1);
                c6fx.A03(Integer.valueOf(absoluteAdapterPosition2), 2);
                AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, A09);
                AbstractC68226VIm.A00 = absoluteAdapterPosition;
                AbstractC68226VIm.A01 = absoluteAdapterPosition2;
                return true;
            }
        }
        return true;
    }

    @Override // X.C8S8
    public final void clearView(RecyclerView recyclerView, C3OO c3oo) {
        super.clearView(recyclerView, c3oo);
        InterfaceC103384lE A0A = this.A01.A0A();
        AbstractC68226VIm.A00 = -1;
        AbstractC68226VIm.A01 = -1;
        if (A0A != null && AbstractC68226VIm.A02 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < AbstractC68226VIm.A02.A0M().size(); i++) {
                arrayList.add(((C102884kP) AbstractC68226VIm.A02.A0M().get(i)).A0D());
            }
            C6FP.A03(this.A00, AbstractC68226VIm.A02, AbstractC31179DnN.A0I(arrayList).A00(), A0A);
        }
    }

    @Override // X.C8S8
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, float f, float f2, int i, boolean z) {
        super.onChildDraw(canvas, recyclerView, c3oo, f, f2, i, z);
        if (z) {
            View view = c3oo.itemView;
            view.setElevation(Math.max(20.0f, view.getElevation()));
        }
    }
}
