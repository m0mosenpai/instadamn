package X;

import android.content.Context;

/* renamed from: X.TuY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65815TuY implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 == null || obj4 == null) {
            return false;
        }
        U44 u44 = (U44) obj3;
        U44 u442 = (U44) obj4;
        return (u44.A01 == u442.A01 && u44.A00 == u442.A00 && u44.A02.equals(u442.A02)) ? false : true;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        C65822Tuf c65822Tuf = (C65822Tuf) obj2;
        if (obj3 != null) {
            c65822Tuf.A0D.A00((U44) obj3);
            return null;
        }
        throw new IllegalStateException("List data was not computed during layout");
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
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
