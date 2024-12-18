package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ESD extends AbstractC65632xz {
    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "Header";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return i == 0 ? 0 : Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(429972440);
        AbstractC167017dG.A1P(view, obj);
        int i2 = 0;
        if (((AbstractC65332xV) obj).A02() == 0) {
            i2 = 8;
        }
        view.setVisibility(i2);
        C0f9.A0A(1872632510, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -113837115);
        if (i == 0) {
            View A0A = AbstractC31176DnK.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_privacy_label_view);
            C0f9.A0A(1161331551, A0G);
            return A0A;
        }
        IllegalArgumentException A0n = AbstractC25230BEn.A0n(AbstractC111324zv.A00(645), i);
        C0f9.A0A(-752629305, A0G);
        throw A0n;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(AbstractC25228BEl.A1Y(i));
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
