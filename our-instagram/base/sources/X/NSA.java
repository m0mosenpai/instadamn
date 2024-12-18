package X;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class NSA extends AbstractC140596Xn {
    public final Activity A00;
    public final RecyclerView A01;
    public final C155306yJ A02;
    public final InterfaceC63982vJ A03;

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        View view;
        C14360o3.A0B(reel, 0);
        C3OO A00 = A00(reel);
        if (A00 != null && (view = A00.itemView) != null) {
            return C6PN.A03(AbstractC31174DnI.A0A(view));
        }
        return C6PN.A02();
    }

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
        C14360o3.A0B(reel, 0);
        this.A01.A0n(this.A02.A02(reel.getId()));
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
        View view;
        C14360o3.A0B(reel, 0);
        C3OO A00 = A00(reel);
        if (A00 != null && (view = A00.itemView) != null) {
            view.setVisibility(4);
            view.setAlpha(0.0f);
            view.setScaleX(0.95f);
            view.setScaleY(0.95f);
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
        View view;
        AbstractC167007dF.A1K(reel, c41181vS);
        super.A0A(reel, c41181vS);
        C3OO A00 = A00(reel);
        if (A00 != null && (view = A00.itemView) != null) {
            view.setVisibility(0);
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            AbstractC50523MSb.A1K(A01);
            A01.A0H();
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
        C14360o3.A0B(reel, 0);
        this.A01.A0n(this.A02.A02(reel.getId()));
    }

    private final C3OO A00(Reel reel) {
        int A02 = this.A02.A02(reel.getId());
        if (A02 == -1) {
            return null;
        }
        return this.A01.A0W(A02, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSA(Activity activity, RecyclerView recyclerView, C155306yJ c155306yJ, InterfaceC63982vJ interfaceC63982vJ) {
        super(activity, interfaceC63982vJ);
        MSZ.A1O(activity, c155306yJ);
        this.A00 = activity;
        this.A03 = interfaceC63982vJ;
        this.A01 = recyclerView;
        this.A02 = c155306yJ;
    }
}
