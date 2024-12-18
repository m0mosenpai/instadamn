package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.TuS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65809TuS implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Rect rect = ((C65822Tuf) obj2).A04;
        if (rect != null) {
            view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return !C2I7.A00(((C65822Tuf) obj).A04, ((C65822Tuf) obj2).A04);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setPadding(0, 0, 0, 0);
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
