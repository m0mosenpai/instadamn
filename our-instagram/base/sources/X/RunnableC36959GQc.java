package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import java.util.ArrayList;

/* renamed from: X.GQc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36959GQc implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ SF3 A01;
    public final /* synthetic */ IgReactCommentModerationModule A02;
    public final /* synthetic */ ArrayList A03;

    public RunnableC36959GQc(FragmentActivity fragmentActivity, SF3 sf3, IgReactCommentModerationModule igReactCommentModerationModule, ArrayList arrayList) {
        this.A02 = igReactCommentModerationModule;
        this.A00 = fragmentActivity;
        this.A03 = arrayList;
        this.A01 = sf3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C140966Yy A0r = AbstractC25225BEi.A0r(this.A00, this.A02.mSession);
        AnonymousClass548.A00().A00();
        ArrayList<? extends Parcelable> arrayList = this.A03;
        SF3 sf3 = this.A01;
        AbstractC167017dG.A1N(arrayList, sf3);
        C67893V1b c67893V1b = new C67893V1b();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelableArrayList(AbstractC111324zv.A00(1512), arrayList);
        c67893V1b.setArguments(A0b);
        c67893V1b.A01 = sf3;
        A0r.A0E(c67893V1b);
        A0r.A04();
    }
}
