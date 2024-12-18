package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.6Bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135566Bh implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC68323VMj.A00(this);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setTag(R.id.image_component_uri_tag, obj2);
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setTag(R.id.image_component_uri_tag, null);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return !C6AO.A00(obj2, obj);
    }
}
