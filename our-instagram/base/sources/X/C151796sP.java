package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: X.6sP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C151796sP extends C03E implements InterfaceC16610sE {
    public C151796sP(Object obj) {
        super(3, obj, C53K.class, "onActivityResult", "onActivityResult(IILandroid/content/Intent;)V", 0);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ((Fragment) this.receiver).onActivityResult(((Number) obj).intValue(), ((Number) obj2).intValue(), (Intent) obj3);
        return C0eB.A00;
    }
}
