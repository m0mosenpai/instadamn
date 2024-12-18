package com.fasterxml.jackson.databind.ext;

import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C16R;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.net.URI;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

/* loaded from: classes10.dex */
public class NioPathDeserializer extends StdScalarDeserializer {
    public static final boolean A00;

    public NioPathDeserializer() {
        super(Path.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (!c16l.A19(C16R.A0J)) {
            anonymousClass469.A0T(c16l, Path.class);
        } else {
            String A1P = c16l.A1P();
            if (A1P.indexOf(58) < 0 || (A00 && A1P.length() >= 2 && Character.isLetter(A1P.charAt(0)) && A1P.charAt(1) == ':')) {
                return Paths.get(A1P, new String[0]);
            }
            try {
                URI uri = new URI(A1P);
                try {
                    return Paths.get(uri);
                } catch (FileSystemNotFoundException e) {
                    try {
                        String scheme = uri.getScheme();
                        Iterator it = ServiceLoader.load(FileSystemProvider.class).iterator();
                        while (it.hasNext()) {
                            FileSystemProvider fileSystemProvider = (FileSystemProvider) it.next();
                            if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                                return fileSystemProvider.getPath(uri);
                            }
                        }
                        anonymousClass469.A0f(A0H(), e);
                        throw C00O.createAndThrow();
                    } catch (Throwable th) {
                        th = th;
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, e);
                        anonymousClass469.A0f(A0H(), th);
                        throw C00O.createAndThrow();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw C00O.createAndThrow();
    }

    static {
        File[] listRoots = File.listRoots();
        int length = listRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String path = listRoots[i].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i++;
        }
        A00 = z;
    }
}
