package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes9.dex */
public final class OIh {
    public final EnumC53272NhA[] A00;
    public final Context A01;
    public final C58632mM A02;

    public OIh(Context context, C58632mM c58632mM) {
        C14360o3.A0B(context, 1);
        this.A01 = context;
        this.A02 = c58632mM;
        this.A00 = new EnumC53272NhA[]{EnumC53272NhA.A06, EnumC53272NhA.A07, EnumC53272NhA.A08, EnumC53272NhA.A09, EnumC53272NhA.A05};
    }

    public final C54832OLr A00(EnumC53272NhA enumC53272NhA) {
        float f;
        boolean z;
        File file = (File) C58632mM.A00(enumC53272NhA.A01, enumC53272NhA.A02).A00();
        if (file != null) {
            android.net.Uri fromFile = android.net.Uri.fromFile(file);
            int ordinal = enumC53272NhA.ordinal();
            if (ordinal != 0 && ordinal != 4) {
                C14360o3.A0A(fromFile);
                f = enumC53272NhA.A00;
                z = false;
                C14360o3.A0B(fromFile, 0);
            } else {
                C14360o3.A0A(fromFile);
                f = enumC53272NhA.A00;
                C14360o3.A0B(fromFile, 0);
                z = true;
            }
            return new C54832OLr(fromFile, f, f, f, z);
        }
        return null;
    }
}
