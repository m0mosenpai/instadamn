package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.AyT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24807AyT implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C144366fI A01;
    public final /* synthetic */ boolean A02;

    public RunnableC24807AyT(ViewGroup viewGroup, C144366fI c144366fI, boolean z) {
        this.A01 = c144366fI;
        this.A00 = viewGroup;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC56392iX interfaceC56392iX = this.A01.A00;
        View view = interfaceC56392iX.getView();
        ViewGroup viewGroup = this.A00;
        float A07 = (AbstractC166987dD.A07(viewGroup) / 2.0f) - (AbstractC166987dD.A07(interfaceC56392iX.getView()) / 2.0f);
        int height = viewGroup.getHeight() - interfaceC56392iX.getView().getHeight();
        Resources A0M = AbstractC25228BEl.A0M(viewGroup);
        boolean z = this.A02;
        int i = R.dimen.container_height;
        if (z) {
            i = R.dimen.abc_dialog_padding_material;
        }
        C138436Oz.A02(view, A07, height - A0M.getDimensionPixelSize(i), true);
    }
}
