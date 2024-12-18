package X;

import android.content.Context;

/* renamed from: X.TuV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65812TuV implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        ((C131785xE) obj).setIsScrollEnabled(((C65822Tuf) obj2).A0B);
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return MSY.A1S(((C65822Tuf) obj).A0B ? 1 : 0, ((C65822Tuf) obj2).A0B ? 1 : 0);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((C131785xE) obj).setIsScrollEnabled(true);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }
}
