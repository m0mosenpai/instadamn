package X;

import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1F1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1F1 {
    public File A00;
    public Map A01;
    public ScheduledExecutorService A02;

    /* JADX WARN: Type inference failed for: r5v0, types: [X.1F2, java.io.File] */
    public final C1F5 A00(String str, String str2, String str3) {
        String absolutePath;
        C1F5 c1f5;
        File file = new File(this.A00, str);
        file.mkdirs();
        ?? file2 = new File(file, AnonymousClass001.A0b(str3, ".", str2.hashCode()));
        try {
            absolutePath = file2.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = file2.getAbsolutePath();
        }
        Map map = this.A01;
        Reference reference = (Reference) map.get(absolutePath);
        if (reference == null || (c1f5 = (C1F5) reference.get()) == null) {
            C1F5 c1f52 = new C1F5(new C1F4(file2), this.A02);
            map.put(absolutePath, new WeakReference(c1f52));
            return c1f52;
        }
        return c1f5;
    }
}
