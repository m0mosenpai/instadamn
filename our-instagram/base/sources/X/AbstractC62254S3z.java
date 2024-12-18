package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.S3z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62254S3z {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        C6FG c6fg = (C6FG) c6fw.A03(0);
        Object A03 = c6fw.A03(1);
        List list = c6fw.A00;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 2);
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 3);
        Fragment A01 = C6BQ.A01(c6fq);
        boolean equals = "front".equals(A03);
        SML sml = new SML(c6fg, c6fq, A0t, A0t2);
        Context requireContext = A01.requireContext();
        PackageManager packageManager = requireContext.getPackageManager();
        if (packageManager == null) {
            num = C05F.A0N;
        } else {
            boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera.front");
            boolean hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera");
            if (equals) {
                if (!hasSystemFeature) {
                    num = C05F.A00;
                }
            } else if (!hasSystemFeature2) {
                sml.A00(C05F.A00);
            }
            if (!AbstractC23451Ch.A07(requireContext, "android.permission.CAMERA")) {
                num = C05F.A01;
            } else {
                File A04 = AbstractC13530mf.A04(requireContext);
                try {
                    C54846OMr c54846OMr = new C54846OMr();
                    C14360o3.A0B(A04, 0);
                    c54846OMr.A03 = A04;
                    android.net.Uri A012 = new N0P().A01(requireContext, c54846OMr.A00());
                    C14360o3.A07(A012);
                    C60929Rbj c60929Rbj = new C60929Rbj(2, sml, A04, c6fq);
                    Intent A0E = AbstractC58318PtA.A0E("android.media.action.IMAGE_CAPTURE");
                    A0E.putExtra("output", A012);
                    C6BQ.A0K(c6fq, c60929Rbj);
                    C12260kU.A07(A01, A0E, 1);
                    return null;
                } catch (ActivityNotFoundException | IOException unused) {
                    sml.A00(C05F.A0N);
                    A04.delete();
                    return null;
                }
            }
        }
        sml.A00(num);
        return null;
    }
}
