package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.TPz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64694TPz implements Runnable {
    public final /* synthetic */ C58621Pyp A00;
    public final /* synthetic */ C63210SfF A01;
    public final /* synthetic */ C1RU A02;

    public RunnableC64694TPz(C58621Pyp c58621Pyp, C63210SfF c63210SfF, C1RU c1ru) {
        this.A02 = c1ru;
        this.A00 = c58621Pyp;
        this.A01 = c63210SfF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Object obj;
        String str2;
        IOException A0y;
        C1RU c1ru = this.A02;
        C58621Pyp c58621Pyp = this.A00;
        C63210SfF c63210SfF = this.A01;
        java.util.Set set = c58621Pyp.A02;
        if (set.isEmpty()) {
            c63210SfF.A04(null, 3);
            return;
        }
        try {
            C1RT c1rt = c1ru.A04;
            ArrayList A1E = AbstractC166987dD.A1E();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    A1E.add(c1rt.A01.A02(AbstractC166987dD.A1B(it)));
                }
                C26791Rl c26791Rl = c1rt.A02;
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0c();
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    A0A.A0u(AbstractC166987dD.A1B(it2));
                }
                A0A.A0Z();
                A0A.close();
                C25621Ms A0M = AbstractC31173DnH.A0M(c26791Rl.A00);
                A0M.A0B("android_modules/download/");
                A0M.AA6("hashes", stringWriter.toString());
                A0M.A0S(RaW.class, C62812SSi.class);
                ((AbstractC23721Ec) A0M).A05 = C1Ef.OffScreen;
                A0M.A0R = true;
                C1ON A0N = A0M.A0N();
                int size = A1E.size();
                AtomicReference atomicReference = new AtomicReference();
                A0N.A00 = new C58530Pwy(8, c26791Rl, atomicReference);
                C1GJ.A02(A0N);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                if (atomicReference.get() != null) {
                    Iterator A1J = AbstractC25226BEj.A1J(atomicReference.get());
                    while (A1J.hasNext()) {
                        SM3 sm3 = (SM3) A1J.next();
                        A1E2.add(new C0g8(sm3.A02, sm3.A01, sm3.A00));
                    }
                    int size2 = A1E2.size();
                    if (size == size2) {
                        c63210SfF.A03(null, 1, A1E2.size());
                        if (A1E2.isEmpty()) {
                            c63210SfF.A04(AbstractC166987dD.A18("Failed to download module - no metadata found."), 4);
                        }
                        HashSet A1H = AbstractC166987dD.A1H();
                        boolean z = false;
                        Iterator it3 = A1E2.iterator();
                        while (it3.hasNext()) {
                            C0g8 c0g8 = (C0g8) it3.next();
                            String str3 = c0g8.A02;
                            if (!set.contains(str3)) {
                                C0K8.A0Q("FacebookVoltronDownloader", "DownloadableAppModuleMetadata for unrequested module: %s", c0g8);
                            } else if (c0g8.A00 != null) {
                                A1H.add(str3);
                            }
                        }
                        Iterator it4 = set.iterator();
                        while (it4.hasNext()) {
                            String A1B = AbstractC166987dD.A1B(it4);
                            if (!A1H.contains(A1B)) {
                                RuntimeException A18 = AbstractC166987dD.A18("Failed to download module - no metadata found.");
                                int i = 0;
                                C0K8.A0O("DownloadStateHandler", "Server metadata not found for app module %s, hash %s. (Expected for local builds. See https://fburl.com/ms5kw160.)", A1B, C0g3.A00().A02(A1B));
                                R8F[] r8fArr = c63210SfF.A06;
                                do {
                                    R8F r8f = r8fArr[i];
                                    if (r8f instanceof R8D) {
                                        ((R8D) r8f).A00.A05(A1B, C05F.A0Y);
                                    }
                                    if (r8f instanceof R8D) {
                                        ((R8D) r8f).A00.A05(A1B, C05F.A0N);
                                    }
                                    i++;
                                } while (i < 2);
                                C63210SfF.A00(c63210SfF, A18, 4);
                                z = true;
                            }
                        }
                        if (A1E2.isEmpty()) {
                            c63210SfF.A04(AbstractC166987dD.A18("Failed to download module - no metadata found."), 4);
                            return;
                        }
                        Iterator it5 = A1E2.iterator();
                        while (it5.hasNext()) {
                            C0g8 c0g82 = (C0g8) it5.next();
                            Map map = c1ru.A05;
                            synchronized (map) {
                                try {
                                    str = c0g82.A02;
                                    obj = map.get(str);
                                    if (obj == null) {
                                        obj = AbstractC58318PtA.A0b();
                                        map.put(str, obj);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            synchronized (obj) {
                                try {
                                    C0g3 A00 = C0g3.A00();
                                    int A002 = AbstractC10100gN.A00(str);
                                    if (A00.A01(A002) != C05F.A0C && (str2 = c0g82.A00) != null && !str2.isEmpty()) {
                                        try {
                                            R8F[] r8fArr2 = c63210SfF.A06;
                                            int i2 = 0;
                                            do {
                                                R8F r8f2 = r8fArr2[i2];
                                                if (r8f2 instanceof R8D) {
                                                    ((R8D) r8f2).A00.A05(str, C05F.A0Y);
                                                }
                                                i2++;
                                            } while (i2 < 2);
                                            C10040gH c10040gH = c1ru.A03;
                                            try {
                                                InputStream AjT = C14M.A03().A08(MSY.A0J().A00(), C2n4.A09.E3L(str2), null).A02.AjT();
                                                try {
                                                    synchronized (c10040gH) {
                                                        C0g3 c0g3 = c10040gH.A02;
                                                        if (c0g3.A06(c10040gH.A00)) {
                                                            int A003 = AbstractC09930fu.A00(str);
                                                            if (A003 >= 0) {
                                                                String A02 = c0g3.A02(str);
                                                                A02.getClass();
                                                                File A03 = c10040gH.A01.A03(str, A02);
                                                                c10040gH.A03.FEU(A03, AjT, str, A02);
                                                                c10040gH.A04[A003] = Boolean.valueOf(A03.exists());
                                                            } else {
                                                                C0K8.A0Q("VoltronModuleCache", "Checking cache for %s but module does not exist", str);
                                                                A0y = MSW.A0y("invalid module found");
                                                            }
                                                        } else {
                                                            A0y = MSW.A0y("Unable to load module metadata");
                                                        }
                                                        throw A0y;
                                                        break;
                                                    }
                                                    c63210SfF.A02(c0g82, null, 1);
                                                    AjT.close();
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    AjT.close();
                                                    throw th;
                                                    break;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (IOException e) {
                                            C0K8.A0L("FacebookVoltronDownloader", "downloading module %s failed", e, str);
                                            c63210SfF.A02(c0g82, e, 2);
                                        }
                                    } else {
                                        C0g3.A00().A01(A002);
                                        c63210SfF.A02(c0g82, null, 1);
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                        }
                        if (!z) {
                            return;
                        }
                        c63210SfF.A04(null, 2);
                        C0K8.A0C("FacebookVoltronDownloader", "startDownload failed due to invalid modules");
                        return;
                    }
                    throw MSW.A0y(StringFormatUtil.formatStrLocaleSafe("Failed to download some module metadata files, expected %s, got %s", Integer.valueOf(size), Integer.valueOf(size2)));
                }
            } catch (Exception e2) {
                if (e2 instanceof IOException) {
                    IOException iOException = (IOException) e2;
                    c63210SfF.A03(iOException, 2, 0);
                    throw iOException;
                }
                throw AbstractC58318PtA.A0f(e2);
            }
        } catch (IOException e3) {
            c63210SfF.A04(e3, 2);
            C0K8.A0F("FacebookVoltronDownloader", "startDownload failed", e3);
        }
    }
}
