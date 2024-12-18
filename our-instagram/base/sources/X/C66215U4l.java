package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.U4l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66215U4l implements InterfaceC77833eB {
    public final /* synthetic */ List A00;

    public C66215U4l(List list) {
        this.A00 = list;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        C2WS c2ws = (C2WS) obj;
        c2ws.setTouchDelegate(new C66216U4m(c2ws, this.A00));
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setTouchDelegate(null);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
