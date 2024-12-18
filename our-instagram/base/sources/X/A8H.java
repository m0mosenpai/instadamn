package X;

import java.io.File;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public final class A8H {
    public final String A00;
    public final String A01;
    public final List A02 = AbstractC166987dD.A1E();

    public A8H(C22894A7o c22894A7o) {
        String A0E;
        String A0E2;
        String A00 = AbstractC43591JPw.A00(124);
        C49602Pt c49602Pt = c22894A7o.A00;
        String str = c22894A7o.A01;
        if (str != null) {
            try {
                File file = new File(c49602Pt.A01(), str);
                file.mkdirs();
                A0E = new File(file, AnonymousClass001.A0r("audio_", A00, ".pcm", System.currentTimeMillis())).getAbsolutePath();
            } catch (IOException unused) {
                A0E = AbstractC916948n.A0E(A00, ".pcm");
            }
        } else {
            A0E = AbstractC916948n.A0E(A00, ".pcm");
        }
        C14360o3.A07(A0E);
        this.A00 = A0E;
        if (str != null) {
            try {
                File file2 = new File(c49602Pt.A01(), str);
                file2.mkdirs();
                File file3 = new File(file2, "voiceover");
                file3.mkdirs();
                A0E2 = new File(file3, AnonymousClass001.A0r("audio_", A00, ".wav", System.currentTimeMillis())).getAbsolutePath();
            } catch (IOException unused2) {
                A0E2 = AbstractC916948n.A0E(A00, ".wav");
            }
        } else {
            A0E2 = AbstractC916948n.A0E(A00, ".wav");
        }
        C14360o3.A07(A0E2);
        this.A01 = A0E2;
    }
}
