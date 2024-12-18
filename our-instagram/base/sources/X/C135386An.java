package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6An, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135386An implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC68323VMj.A00(this);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setVisibility(((C135296Ae) obj2).A02);
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        if (((C135296Ae) obj2).A02 == ((C135296Ae) obj).A02) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setVisibility(0);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }
}
