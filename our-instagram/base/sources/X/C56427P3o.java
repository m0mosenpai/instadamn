package X;

import android.location.Location;
import androidx.fragment.app.Fragment;

/* renamed from: X.P3o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56427P3o implements InterfaceC57951Pmx, InterfaceC57827Pkt {
    public static final C56427P3o A00 = new Object();

    @Override // X.InterfaceC57951Pmx
    public final Fragment B8N(Object obj) {
        C14360o3.A0B(obj, 0);
        C52552NMy c52552NMy = (C52552NMy) obj;
        AbstractC69933Cc.A01();
        String str = c52552NMy.A02;
        Location location = c52552NMy.A01;
        long j = c52552NMy.A00;
        C14360o3.A0B(str, 0);
        return N5Z.A00(location, str, null, j, true, false);
    }
}
