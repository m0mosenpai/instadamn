package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Lwg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49649Lwg implements C7OC {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49649Lwg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C7OC
    public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
        if (this.A00 != 0) {
            ((C47767L7o) this.A02).A04.A0G(((C148336m3) this.A01).A02, "quick_emoji_tray");
            return;
        }
        C14360o3.A0B(c148336m3, 0);
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A01;
        Resources resources = ((View) this.A02).getResources();
        C14360o3.A07(resources);
        interfaceC16620sF.invoke(c148336m3, resources);
    }
}
