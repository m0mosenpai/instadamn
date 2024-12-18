package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.P3i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56421P3i implements InterfaceC57951Pmx, InterfaceC57827Pkt {
    public static final C56421P3i A00 = new Object();

    @Override // X.InterfaceC57951Pmx
    public final Fragment B8N(Object obj) {
        EnumC53119NeW enumC53119NeW = EnumC53119NeW.A02;
        C45508KCx c45508KCx = new C45508KCx();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("igtv_upload_gallery_fragment_mode_arg", enumC53119NeW);
        c45508KCx.setArguments(A0b);
        return c45508KCx;
    }
}
