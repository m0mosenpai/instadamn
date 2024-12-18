package X;

import android.content.Context;

/* renamed from: X.U4k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66214U4k implements InterfaceC77833eB {
    public final /* synthetic */ InterfaceC72001XEp A00;

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        if (obj3 != null) {
            ((C131565ws) this.A00.BDI()).setRenderTree(((C135266Ab) obj3).A01);
        }
        return null;
    }

    public C66214U4k(InterfaceC72001XEp interfaceC72001XEp) {
        this.A00 = interfaceC72001XEp;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        C102884kP c102884kP = (C102884kP) obj;
        C102884kP c102884kP2 = (C102884kP) obj2;
        if (AbstractC103044kf.A00() != null) {
            if (obj3 != null) {
                return true;
            }
            return false;
        }
        if (c102884kP.A08(40) != c102884kP2.A08(40)) {
            return true;
        }
        return false;
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
