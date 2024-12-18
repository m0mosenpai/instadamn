package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.LQp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewStubOnInflateListenerC48089LQp implements ViewStub.OnInflateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ViewStubOnInflateListenerC48089LQp(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        switch (this.A00) {
            case 0:
                AbstractC166997dE.A0S((View) this.A02, R.id.subscriptions_sticker_card).setBackground(new C220769p0((Context) this.A01, ((C48623Lez) this.A03).A05));
                return;
            case 1:
                C14360o3.A0A(view);
                AbstractC46731Klo.A00(view, (AbstractC46509Ki8) this.A01, (MQZ) this.A02);
                view.setVisibility(0);
                C44731JrE c44731JrE = (C44731JrE) this.A03;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c44731JrE.A00 = view;
                return;
            default:
                return;
        }
    }
}
