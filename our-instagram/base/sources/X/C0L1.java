package X;

import android.app.Application;
import com.facebook.common.build.BuildConstants;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.0L1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0L1 {
    public final Application A00;
    public final C04230Kp A01;
    public final C0PI A02;

    public abstract C024209q A00(C0M6 c0m6);

    public abstract C0OP A01();

    public abstract Integer A02();

    public File[] A05(C0M6 c0m6, File file) {
        return null;
    }

    public void A03(final C0M6 c0m6, File file, File file2) {
        File[] listFiles;
        StringBuilder sb;
        String str;
        File[] listFiles2;
        File[] listFiles3;
        File[] listFiles4;
        File file3 = file;
        if (A02() == C05F.A00) {
            file3 = file2;
        }
        if (file3 != null) {
            C0PI c0pi = this.A02;
            final C0OP A01 = A01();
            Object obj = C0PI.A05;
            synchronized (obj) {
                listFiles = file.listFiles(new FileFilter() { // from class: X.0PF
                    @Override // java.io.FileFilter
                    public final boolean accept(File file4) {
                        C0M6 c0m62 = C0M6.this;
                        C0OP c0op = A01;
                        if (file4 != null && file4.getName().startsWith(c0m62.A00) && file4.getName().endsWith(AnonymousClass001.A0R(c0op.A00, "_prop.txt"))) {
                            return true;
                        }
                        return false;
                    }
                });
                if (listFiles == null) {
                    listFiles = C0PI.A06;
                }
            }
            if (listFiles.length != 0) {
                for (File file4 : listFiles) {
                    if (!C0PI.A02(file, file4.getName())) {
                        file4.getName();
                        String name = file4.getName();
                        boolean z = false;
                        if (C0M4.A00 == 3) {
                            z = true;
                        }
                        if (z) {
                            String name2 = file.getName();
                            str = name2.substring(name2.indexOf(45) + 1);
                            sb = new StringBuilder();
                            sb.append(name.replace("_prop.txt", "_"));
                        } else {
                            if (C0PI.A04 == null) {
                                C0PI.A04 = AbstractC04200Km.A00();
                            }
                            sb = new StringBuilder();
                            sb.append(name.replace("_prop.txt", "_"));
                            str = C0PI.A04;
                        }
                        sb.append(str);
                        File file5 = new File(c0pi.A01, sb.toString());
                        file5.mkdirs();
                        synchronized (obj) {
                            listFiles2 = file3.listFiles(new C14410oD(c0m6, 2));
                            if (listFiles2 == null) {
                                listFiles2 = C0PI.A06;
                            }
                        }
                        C024209q A00 = A00(c0m6);
                        A00.A01(C0LK.A2p, BuildConstants.A00());
                        A00.A01(C0LK.A2q, BuildConstants.A01());
                        final boolean z2 = true;
                        A00.A00(C0LK.A09, true);
                        C10850hu c10850hu = C0LK.A97;
                        Application application = this.A00;
                        A00.A03(c10850hu, application.getApplicationInfo().publicSourceDir);
                        String installerPackageName = application.getPackageManager().getInstallerPackageName(application.getPackageName());
                        if (installerPackageName != null) {
                            A00.A03(C0LK.A96, installerPackageName);
                        }
                        ArrayList arrayList = new ArrayList(Arrays.asList(listFiles2));
                        if (!arrayList.contains(file4)) {
                            arrayList.add(file4);
                        }
                        File[] A05 = A05(c0m6, file);
                        if (A05 != null) {
                            for (File file6 : A05) {
                                arrayList.add(file6);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        synchronized (obj) {
                            listFiles3 = file3.listFiles(new FileFilter() { // from class: X.0PH
                                @Override // java.io.FileFilter
                                public final boolean accept(File file7) {
                                    C0M6 c0m62 = C0M6.this;
                                    boolean z3 = z2;
                                    if (file7 != null && ((file7.getName().startsWith(c0m62.A00) || c0m62 == C0M6.LARGE_REPORT) && ((!z3 || file7.getName().contains("suppl_")) && file7.getName().endsWith("_attach.txt")))) {
                                        return true;
                                    }
                                    return false;
                                }
                            });
                            if (listFiles3 == null) {
                                listFiles3 = C0PI.A06;
                            }
                        }
                        for (File file7 : listFiles3) {
                            if (!C0PI.A02(file, file7.getName())) {
                                arrayList2.add(file7);
                            }
                        }
                        final boolean z3 = false;
                        synchronized (obj) {
                            listFiles4 = file.listFiles(new FileFilter() { // from class: X.0PH
                                @Override // java.io.FileFilter
                                public final boolean accept(File file72) {
                                    C0M6 c0m62 = C0M6.this;
                                    boolean z32 = z3;
                                    if (file72 != null && ((file72.getName().startsWith(c0m62.A00) || c0m62 == C0M6.LARGE_REPORT) && ((!z32 || file72.getName().contains("suppl_")) && file72.getName().endsWith("_attach.txt")))) {
                                        return true;
                                    }
                                    return false;
                                }
                            });
                            if (listFiles4 == null) {
                                listFiles4 = C0PI.A06;
                            }
                        }
                        for (File file8 : listFiles4) {
                            if (!C0PI.A02(file, file8.getName())) {
                                arrayList2.add(file8);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            c0pi.A03(null, file5, AnonymousClass001.A0R(c0m6.A00, AnonymousClass001.A0R(A01.A00, "_attach.txt")), arrayList2);
                        }
                        arrayList.addAll(arrayList2);
                        c0pi.A03(A00, file5, AnonymousClass001.A0R(c0m6.A00, AnonymousClass001.A0R(A01.A00, "_report.txt")), arrayList);
                        C0PI.A01(file, file4.getName());
                        C0PI.A01(file, file4.getName().replace("_prop.txt", "_attach.txt"));
                    }
                }
            }
        }
    }

    public C0L1(Application application, C04230Kp c04230Kp, C0PI c0pi) {
        this.A00 = application;
        this.A01 = c04230Kp;
        this.A02 = c0pi;
    }

    public /* synthetic */ void A04(C0M6 c0m6, File file, File file2, String str) {
        A03(c0m6, file, file2);
    }
}
