package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.M6e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50015M6e implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ L7W A01;
    public final /* synthetic */ EnumC58132lV A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public RunnableC50015M6e(View view, L7W l7w, EnumC58132lV enumC58132lV, String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = l7w;
        this.A00 = view;
        this.A03 = str;
        this.A02 = enumC58132lV;
        this.A04 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L7W l7w = this.A01;
        FragmentActivity activity = l7w.A01.getActivity();
        if (activity != null) {
            View view = this.A00;
            String str = this.A03;
            EnumC58132lV enumC58132lV = this.A02;
            InterfaceC16820sZ interfaceC16820sZ = this.A04;
            int height = (view.getHeight() / 2) + AbstractC166997dE.A0D(activity.getResources());
            C5SU A0Q = AbstractC31178DnM.A0Q(activity, view, str);
            A0Q.A06(enumC58132lV);
            if (enumC58132lV != EnumC58132lV.A03) {
                height = -height;
            }
            A0Q.A04(view, 0, height, true);
            A0Q.A04 = new C220479oX(3, interfaceC16820sZ, l7w);
            A0Q.A00().A06();
        }
    }
}
