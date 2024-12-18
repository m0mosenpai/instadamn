package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.5jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123995jD implements InterfaceC77833eB {
    public static final C123995jD A00 = new Object();

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        return !obj.equals(obj2);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC68323VMj.A00(this);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C206259Bi c206259Bi = (C206259Bi) obj2;
        C14360o3.A0B(view, 1);
        C14360o3.A0B(c206259Bi, 2);
        C76623c7 c76623c7 = (C76623c7) c206259Bi.A02;
        c76623c7.A00.getId();
        ((InterfaceC75403a7) c206259Bi.A04).EDq(view, ((EnumC65592xv) c206259Bi.A01).ordinal(), c76623c7.A01, c206259Bi.A03);
        return C0eB.A00;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        C206259Bi c206259Bi = (C206259Bi) obj2;
        C14360o3.A0B(view, 1);
        C14360o3.A0B(c206259Bi, 2);
        ((C76623c7) c206259Bi.A02).A00.getId();
        ((InterfaceC75403a7) c206259Bi.A04).F9l(view);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }
}
