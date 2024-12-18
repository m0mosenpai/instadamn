package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WUg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70403WUg implements InterfaceC03450Gy {
    public final List A00 = new ArrayList();
    public final /* synthetic */ WUI A01;

    @Override // X.InterfaceC03450Gy
    public final void E4z(File file) {
    }

    @Override // X.InterfaceC03450Gy
    public final void E54(File file) {
    }

    public C70403WUg(WUI wui) {
        this.A01 = wui;
    }

    @Override // X.InterfaceC03450Gy
    public final void FDl(File file) {
        WUI wui = this.A01;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = name.substring(lastIndexOf);
            String str = ".cnt";
            if (!".cnt".equals(substring)) {
                str = ".tmp";
                if (!".tmp".equals(substring)) {
                    return;
                }
            }
            String substring2 = name.substring(0, lastIndexOf);
            if (str.equals(".tmp")) {
                int lastIndexOf2 = substring2.lastIndexOf(46);
                if (lastIndexOf2 > 0) {
                    substring2 = substring2.substring(0, lastIndexOf2);
                } else {
                    return;
                }
            }
            String valueOf = String.valueOf(Math.abs(substring2.hashCode() % 100));
            StringBuilder sb = new StringBuilder();
            sb.append(wui.A02);
            if (new File(MSZ.A0u(File.separator, valueOf, sb)).equals(file.getParentFile()) && str == ".cnt") {
                this.A00.add(new C69583Vrm(substring2, file));
            }
        }
    }
}
