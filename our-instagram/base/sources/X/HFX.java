package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class HFX extends AbstractC65632xz {
    public final IHS A00;
    public final C62862tP A01;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "Nudge";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((C103464lM) obj).A06.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        this.A00.A00.A04(view);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C103464lM c103464lM = (C103464lM) obj;
        C14360o3.A0B(anonymousClass306, 0);
        AbstractC167017dG.A1P(c103464lM, obj2);
        anonymousClass306.A7b(0, c103464lM, obj2);
        IHS ihs = this.A00;
        C63622uj c63622uj = ihs.A01;
        String str = c103464lM.A06;
        C14360o3.A07(str);
        AbstractC31176DnK.A1V(ihs.A02, C59062n7.A00(c103464lM, obj2, str), c63622uj, str);
    }

    public HFX(C62862tP c62862tP, IHS ihs) {
        this.A01 = c62862tP;
        this.A00 = ihs;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1185592021);
        AbstractC167017dG.A1P(view, obj);
        C103464lM c103464lM = (C103464lM) obj;
        Object tag = view.getTag();
        if (tag != null) {
            AbstractC40631Hzp.A00(this.A01, (IGS) tag, c103464lM);
            C0f9.A0A(1757124378, A03);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0A(-1489727396, A03);
            throw A0g;
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-347032625);
        View A0A = AbstractC31172DnG.A0A(AbstractC31177DnL.A0E(viewGroup, 1), viewGroup, R.layout.bloks_netego_feed_item);
        A0A.setTag(new IGS(viewGroup, A0A));
        C0f9.A0A(378930936, A03);
        return A0A;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        AbstractC167017dG.A1O(view, obj);
        C103464lM c103464lM = (C103464lM) obj;
        IHS ihs = this.A00;
        C14360o3.A0B(c103464lM, 0);
        C57112jm c57112jm = ihs.A00;
        C63622uj c63622uj = ihs.A01;
        String str = c103464lM.A06;
        C14360o3.A07(str);
        AbstractC37304Gc5.A0u(view, c57112jm, c63622uj, str);
    }
}
