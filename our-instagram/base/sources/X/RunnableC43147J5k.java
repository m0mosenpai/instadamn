package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import java.util.ArrayList;

/* renamed from: X.J5k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43147J5k implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ IgReactShoppingPickerModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ ArrayList A03;

    public RunnableC43147J5k(IgReactShoppingPickerModule igReactShoppingPickerModule, String str, ArrayList arrayList, double d) {
        this.A01 = igReactShoppingPickerModule;
        this.A02 = str;
        this.A03 = arrayList;
        this.A00 = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgReactShoppingPickerModule igReactShoppingPickerModule = this.A01;
        AbstractC12990ll abstractC12990ll = igReactShoppingPickerModule.mSession;
        IA1.A00((FragmentActivity) igReactShoppingPickerModule.getCurrentActivity(), abstractC12990ll, null, new J15(this, 0), this.A02, this.A03, (int) this.A00);
    }
}
