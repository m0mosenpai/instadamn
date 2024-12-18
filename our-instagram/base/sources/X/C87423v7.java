package X;

import com.instagram.api.schemas.NavBarCameraDestination;
import java.io.IOException;

/* renamed from: X.3v7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87423v7 {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3v6, X.1um, X.1ul] */
    public static C3v6 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("camera_destination".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    NavBarCameraDestination navBarCameraDestination = (NavBarCameraDestination) NavBarCameraDestination.A01.get(A1P);
                    if (navBarCameraDestination == null) {
                        navBarCameraDestination = NavBarCameraDestination.A08;
                    }
                    c40791um.A01 = navBarCameraDestination;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            NavBarCameraDestination navBarCameraDestination2 = c40791um.A01;
            C14360o3.A0A(navBarCameraDestination2);
            c40791um.A00 = new C108184u4(navBarCameraDestination2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
