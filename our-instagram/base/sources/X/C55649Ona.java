package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.Ona, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55649Ona implements C6VO {
    public static volatile C6VO A02;
    public File A00;
    public final C23161Av A01;

    @Override // X.C6VO
    public final File BoX(String str) {
        File file = this.A00;
        if (file == null) {
            file = this.A01.AXd(null, 756778003);
            this.A00 = file;
        }
        return MSW.A0w(file, str);
    }

    public C55649Ona(Context context) {
        this.A01 = C23161Av.A00(context);
    }

    @Override // X.C6VO
    public final File COc(String str) {
        return BoX(str);
    }

    @Override // X.C6VO
    public final boolean remove(String str) {
        File BoX = BoX(str);
        if (!BoX.exists()) {
            return false;
        }
        return BoX.delete();
    }

    public C55649Ona() {
    }
}
