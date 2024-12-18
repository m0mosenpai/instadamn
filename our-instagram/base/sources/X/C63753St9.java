package X;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: X.St9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63753St9 implements InterfaceC65631Tps {
    public final InterfaceC65631Tps A00;
    public final InterfaceC65571Tn4 A01;

    @Override // X.InterfaceC65319Thy
    public final /* bridge */ /* synthetic */ boolean AS0(C63729Ssj c63729Ssj, File file, Object obj) {
        return this.A00.AS0(c63729Ssj, file, new C63791Stl(((BitmapDrawable) ((InterfaceC65558Tme) obj).get()).getBitmap(), this.A01));
    }

    @Override // X.InterfaceC65631Tps
    public final Integer B1o(C63729Ssj c63729Ssj) {
        return this.A00.B1o(c63729Ssj);
    }

    public C63753St9(InterfaceC65631Tps interfaceC65631Tps, InterfaceC65571Tn4 interfaceC65571Tn4) {
        this.A01 = interfaceC65571Tn4;
        this.A00 = interfaceC65631Tps;
    }
}
