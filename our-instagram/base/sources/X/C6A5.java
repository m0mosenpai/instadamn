package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6A5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6A5 implements InterfaceC13000lm {
    public final C6DL A00;

    public final File[] A00(File file) {
        File[] fileArr;
        C6DL c6dl = this.A00;
        if (c6dl != null) {
            LEL lel = c6dl.A00;
            synchronized (lel) {
                File[] fileArr2 = (File[]) LEL.A00("list temp directory", new MHH(lel, 27));
                if (fileArr2 != null) {
                    List A0A = AbstractC009903n.A0A(new B0M(), fileArr2);
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (Object obj : A0A) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        File file2 = (File) obj;
                        StringBuilder sb = new StringBuilder();
                        sb.append("copy file: ");
                        sb.append(file2);
                        File file3 = (File) LEL.A00(sb.toString(), new BFI(i, 12, file, file2));
                        if (file3 != null) {
                            arrayList.add(file3);
                        }
                        i = i2;
                    }
                    fileArr = (File[]) arrayList.toArray(new File[0]);
                } else {
                    fileArr = null;
                }
            }
            return fileArr;
        }
        return null;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C6DL c6dl = this.A00;
        if (c6dl != null) {
            try {
                c6dl.A02.interrupt();
            } finally {
                C6DL.A00(c6dl);
            }
        }
    }

    public C6A5(C6DL c6dl) {
        this.A00 = c6dl;
    }
}
