package X;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kkb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46658Kkb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0e5] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static List A00(AbstractC12990ll abstractC12990ll, File file, InterfaceC16660sJ interfaceC16660sJ) {
        ?? c09540e5;
        byte[] A0X;
        boolean A1U = AbstractC167007dF.A1U(interfaceC16660sJ);
        Object invoke = interfaceC16660sJ.invoke(file);
        C06090Tz c06090Tz = C06090Tz.A05;
        int A07 = AbstractC25225BEi.A07(c06090Tz, abstractC12990ll, 36605770041464150L);
        if (A07 > 0) {
            long length = file.length();
            if (length != 0 && length >= A07) {
                String canonicalPath = ((File) interfaceC16660sJ.invoke(file)).getCanonicalPath();
                int A072 = AbstractC25225BEi.A07(c06090Tz, abstractC12990ll, 36605770041529687L);
                if (A072 > 0) {
                    int ceil = (int) Math.ceil(((float) length) / A072);
                    byte[] A09 = AbstractC57194Pae.A09(file);
                    try {
                        C17u A0C = C17s.A0C(A1U ? 1 : 0, ceil);
                        c09540e5 = AbstractC167017dG.A0q(A0C);
                        Iterator it = A0C.iterator();
                        while (it.hasNext()) {
                            int A00 = ((AbstractC16880sg) it).A00();
                            int i = A00 + 1;
                            File A11 = AbstractC166987dD.A11(AnonymousClass001.A0o(canonicalPath, "@chunk_", "_of_", i, ceil));
                            C17u A0C2 = C17s.A0C(A00 * A072, Math.min(i * A072, (int) length));
                            if (A0C2.isEmpty()) {
                                A0X = new byte[0];
                            } else {
                                A0X = AbstractC06960Yn.A0X(A09, A0C2.A00, A0C2.A01 + 1);
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(A11);
                            try {
                                fileOutputStream.write(A0X);
                                fileOutputStream.close();
                                c09540e5.add(A11);
                            } finally {
                            }
                        }
                    } catch (Throwable th) {
                        c09540e5 = new C09540e5(th);
                    }
                    boolean z = c09540e5 instanceof C09540e5;
                    if (!z) {
                        file.getPath();
                    }
                    Throwable A002 = C09550e6.A00(c09540e5);
                    if (A002 != null) {
                        C0K8.A0H("AttachmentChunker", AnonymousClass001.A0g("", "Failed to chunk ", file.getPath()), A002);
                    }
                    List A1J = AbstractC166987dD.A1J(invoke);
                    List list = c09540e5;
                    if (z) {
                        list = A1J;
                    }
                    return list;
                }
            } else {
                file.getPath();
            }
        }
        return AbstractC166987dD.A1J(invoke);
    }
}
