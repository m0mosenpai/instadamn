package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlinx.coroutines.android.AndroidDispatcherFactory;

/* renamed from: X.SSz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62827SSz {
    public static final List A01(ClassLoader classLoader) {
        List A00;
        try {
            ArrayList list = Collections.list(classLoader.getResources(AbstractC58319PtB.A0t(AndroidDispatcherFactory.class, "META-INF/services/")));
            ArrayList A10 = AbstractC31174DnI.A10(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                java.net.URL url = (java.net.URL) it.next();
                String obj = url.toString();
                if (AbstractC002300n.A0h(obj, "jar", false)) {
                    String A0K = AbstractC001900j.A0K(obj, "jar:file:", obj);
                    String A0J = AbstractC001900j.A0J(A0K, A0K, '!');
                    String A0K2 = AbstractC001900j.A0K(obj, "!/", obj);
                    JarFile jarFile = new JarFile(A0J, false);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(A0K2)), ReactWebViewManager.HTML_ENCODING));
                        try {
                            A00 = A00(bufferedReader);
                            bufferedReader.close();
                            try {
                                jarFile.close();
                            } catch (Throwable th) {
                                throw th;
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            try {
                                jarFile.close();
                                throw th3;
                            } catch (Throwable th4) {
                                C2Ql.A01(th2, th4);
                                throw th2;
                            }
                        }
                    }
                } else {
                    BufferedReader A0h = AbstractC58320PtC.A0h(url.openStream());
                    try {
                        A00 = A00(A0h);
                        A0h.close();
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            C20I.A00(A0h, th5);
                            throw th6;
                        }
                    }
                }
                AnonymousClass016.A16(A00, A10);
            }
            java.util.Set A0k = AbstractC001800i.A0k(A10);
            if (!A0k.isEmpty()) {
                ArrayList A0q = AbstractC167017dG.A0q(A0k);
                Iterator it2 = A0k.iterator();
                while (it2.hasNext()) {
                    Class<?> cls = Class.forName(AbstractC166987dD.A1B(it2), false, classLoader);
                    if (AndroidDispatcherFactory.class.isAssignableFrom(cls)) {
                        A0q.add(AndroidDispatcherFactory.class.cast(AbstractC58320PtC.A0t(cls)));
                    } else {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Expected service of class ");
                        A1C.append(AndroidDispatcherFactory.class);
                        throw AbstractC37303Gc4.A0M(cls, ", but found ", A1C);
                    }
                }
                return A0q;
            }
            throw AbstractC166987dD.A12("No providers were loaded with FastServiceLoader");
        } catch (Throwable unused) {
            return AbstractC001800i.A0a(ServiceLoader.load(AndroidDispatcherFactory.class, classLoader));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r4.add(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A00(java.io.BufferedReader r5) {
        /*
            java.util.LinkedHashSet r4 = X.AbstractC31171DnF.A0l()
        L4:
            java.lang.String r1 = r5.readLine()
            if (r1 != 0) goto Lf
            java.util.List r0 = X.AbstractC001800i.A0a(r4)
            return r0
        Lf:
            java.lang.String r0 = "#"
            java.lang.String r0 = X.AbstractC001900j.A0L(r1, r0, r1)
            java.lang.String r3 = X.AbstractC25228BEl.A1A(r0)
            r2 = 0
        L1a:
            int r0 = r3.length()
            if (r2 >= r0) goto L38
            char r1 = r3.charAt(r2)
            r0 = 46
            if (r1 == r0) goto L35
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = "Illegal service provider class name: "
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r0, r3)
            throw r0
        L35:
            int r2 = r2 + 1
            goto L1a
        L38:
            if (r0 <= 0) goto L4
            r4.add(r3)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62827SSz.A00(java.io.BufferedReader):java.util.List");
    }
}
