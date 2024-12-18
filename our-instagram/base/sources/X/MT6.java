package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class MT6 extends AbstractC57193Pad {
    public static final String A01(File file) {
        C14360o3.A0B(file, 0);
        String name = file.getName();
        C14360o3.A07(name);
        return AbstractC001900j.A0I(name, "", '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0sl] */
    public static final boolean A05(File file, File file2) {
        ?? A0q;
        ?? A0q2;
        String path = file.getPath();
        C14360o3.A0A(path);
        int A00 = CLV.A00(path);
        String A0w = AbstractC25227BEk.A0w(path, 0, A00);
        String A0z = AbstractC43592JPx.A0z(path, A00);
        if (A0z.length() == 0) {
            A0q = C16930sl.A00;
        } else {
            List A0Q = AbstractC001900j.A0Q(A0z, new char[]{File.separatorChar}, 0);
            A0q = AbstractC167017dG.A0q(A0Q);
            Iterator it = A0Q.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC166987dD.A11(AbstractC166987dD.A1B(it)));
            }
        }
        File A11 = AbstractC166987dD.A11(A0w);
        C14360o3.A0B(A0q, 2);
        String path2 = file2.getPath();
        C14360o3.A0A(path2);
        int A002 = CLV.A00(path2);
        String A0w2 = AbstractC25227BEk.A0w(path2, 0, A002);
        String A0z2 = AbstractC43592JPx.A0z(path2, A002);
        if (A0z2.length() == 0) {
            A0q2 = C16930sl.A00;
        } else {
            List A0Q2 = AbstractC001900j.A0Q(A0z2, new char[]{File.separatorChar}, 0);
            A0q2 = AbstractC167017dG.A0q(A0Q2);
            Iterator it2 = A0Q2.iterator();
            while (it2.hasNext()) {
                A0q2.add(AbstractC166987dD.A11(AbstractC166987dD.A1B(it2)));
            }
        }
        File A112 = AbstractC166987dD.A11(A0w2);
        C14360o3.A0B(A0q2, 2);
        if (!A11.equals(A112) || A0q.size() < A0q2.size()) {
            return false;
        }
        return A0q.subList(0, A0q2.size()).equals(A0q2);
    }

    public static final void A03(File file) {
        C73556YKj c73556YKj = new C73556YKj(new PV1(file, C05F.A01));
        while (true) {
            boolean z = true;
            while (c73556YKj.hasNext()) {
                File file2 = (File) c73556YKj.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return;
        }
    }

    public static final String A02(File file) {
        String name = file.getName();
        C14360o3.A07(name);
        int A07 = AbstractC001900j.A07(name, ".", name.length() - 1);
        if (A07 != -1) {
            return AbstractC25227BEk.A0w(name, 0, A07);
        }
        return name;
    }

    public static final void A04(File file, File file2, boolean z) {
        AbstractC167017dG.A1N(file, file2);
        if (file.exists()) {
            if (file2.exists()) {
                if (z) {
                    if (!file2.delete()) {
                        throw new C53094Ne7(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new C53094Ne7(file, file2, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (!file2.mkdirs()) {
                    throw new C53094Ne7(file, file2, "Failed to create target directory.");
                }
                return;
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream A0x = MSW.A0x(file2);
                try {
                    AbstractC54919OQu.A00(fileInputStream, A0x);
                    A0x.close();
                    fileInputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C20I.A00(fileInputStream, th);
                    throw th2;
                }
            }
        } else {
            throw new C53094Ne7(file, null, "The source file doesn't exist.");
        }
    }
}
