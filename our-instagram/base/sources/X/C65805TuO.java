package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.TuO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65805TuO implements InterfaceC77833eB {
    public final C6FG A00;
    public final AbstractC65806TuP A01;

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A01.A0L((View) obj, this.A00, ((AbstractC65806TuP) obj2).A00, obj3, obj4);
    }

    public C65805TuO(C6FG c6fg, AbstractC65806TuP abstractC65806TuP) {
        this.A01 = abstractC65806TuP;
        this.A00 = c6fg;
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
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
