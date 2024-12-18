package X;

import com.facebook.rsys.callmanager.gen.AppModelListener;
import java.util.Map;

/* renamed from: X.Myv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52003Myv extends AppModelListener {
    public final /* synthetic */ C51999Myp A00;

    @Override // com.facebook.rsys.callmanager.gen.AppModelListener
    public final void onModels(Map map) {
        C14360o3.A0B(map, 0);
        C51999Myp c51999Myp = this.A00;
        c51999Myp.A01.A00.invoke(c51999Myp.A08.invoke(map));
    }

    public C52003Myv(C51999Myp c51999Myp) {
        this.A00 = c51999Myp;
    }
}
