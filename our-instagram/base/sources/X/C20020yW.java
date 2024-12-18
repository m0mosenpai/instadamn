package X;

import android.content.Context;
import android.os.Process;
import com.facebook.common.dextricks.Constants;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipOutputStream;

/* renamed from: X.0yW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20020yW implements InterfaceC06430Vk, C0VP {
    public static AtomicReference A0A = new AtomicReference(null);
    public C0V1 A00;
    public C0W4 A01;
    public MmapBufferManager A02;
    public C0VQ[] A04;
    public C0VQ[] A05;
    public final Object A07 = new Object();
    public volatile InterfaceC06330Uz A09 = null;
    public C17260tM A03 = null;
    public final Random A08 = new Random();
    public final C09920ft A06 = new C09920ft();

    public C20020yW(Context context, C0V1 c0v1, C0VQ[] c0vqArr) {
        this.A00 = c0v1;
        this.A01 = new C0W4(context);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        do {
            C0VQ c0vq = c0vqArr[i];
            if (c0vq.A06()) {
                arrayList.add(c0vq);
            } else {
                arrayList2.add(c0vq);
            }
            i++;
        } while (i < 32);
        this.A04 = (C0VQ[]) arrayList2.toArray(new C0VQ[arrayList2.size()]);
        this.A05 = (C0VQ[]) arrayList.toArray(new C0VQ[arrayList.size()]);
    }

    public final void A05() {
        C17260tM c17260tM;
        List asList;
        List asList2;
        synchronized (this) {
            c17260tM = this.A03;
        }
        if (c17260tM != null) {
            final C0W4 c0w4 = this.A01;
            File file = c0w4.A05;
            File file2 = c0w4.A06;
            long j = c0w4.A01;
            FilenameFilter filenameFilter = C0W4.A07;
            C0W4.A01(c0w4, file, file2, new FilenameFilter[]{filenameFilter}, j);
            File[] listFiles = file.listFiles(filenameFilter);
            if (listFiles == null) {
                asList = Collections.EMPTY_LIST;
            } else {
                asList = Arrays.asList(listFiles);
            }
            Collections.sort(asList, new Comparator() { // from class: X.0Vz
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((File) obj).getName().compareTo(((File) obj2).getName());
                }
            });
            long j2 = c0w4.A01;
            FilenameFilter filenameFilter2 = C0W4.A08;
            C0W4.A01(c0w4, file, file2, new FilenameFilter[]{filenameFilter2}, j2);
            File[] listFiles2 = file.listFiles(filenameFilter2);
            if (listFiles2 == null) {
                asList2 = Collections.EMPTY_LIST;
            } else {
                asList2 = Arrays.asList(listFiles2);
            }
            Collections.sort(asList2, new Comparator() { // from class: X.0W0
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((File) obj).getName().compareTo(((File) obj2).getName());
                }
            });
            C17260tM.A00(this, c17260tM, asList2);
            C17260tM.A00(this, c17260tM, asList);
        }
    }

    public final void A06(C0V1 c0v1) {
        synchronized (this) {
            if (c0v1.equals(this.A00)) {
                return;
            }
            C09920ft c09920ft = this.A06;
            c09920ft.DVP();
            synchronized (this) {
                this.A00 = c0v1;
                A01(c0v1.B8s(), this);
            }
            c09920ft.D6p();
        }
    }

    public final synchronized void A07(InterfaceC20060yb interfaceC20060yb) {
        this.A06.A00.remove(interfaceC20060yb);
    }

    public final synchronized void A08(C17260tM c17260tM) {
        try {
            if (this.A03 != c17260tM) {
                this.A03 = c17260tM;
                A05();
            }
        } finally {
        }
    }

    @Override // X.C0VP
    public final void DxL(File file, int i) {
        this.A06.DxL(file, 1);
    }

    @Override // X.C0VP
    public final void DxO(File file) {
        synchronized (this) {
            C0W4 c0w4 = this.A01;
            File file2 = c0w4.A06;
            if (C0W4.A03(c0w4, file, new File(file2, file.getName()))) {
                C0W4.A02(c0w4, file2, new FilenameFilter[]{C0W4.A07, C0W4.A08}, c0w4.A00);
            }
        }
        this.A06.DxO(file);
    }

    public static C20020yW A00() {
        C20020yW c20020yW = (C20020yW) A0A.get();
        if (c20020yW != null) {
            return c20020yW;
        }
        throw new IllegalStateException("TraceOrchestrator has not been initialized");
    }

    public static void A01(InterfaceC06330Uz interfaceC06330Uz, C20020yW c20020yW) {
        if (!interfaceC06330Uz.equals(c20020yW.A09)) {
            c20020yW.A09 = interfaceC06330Uz;
            C06360Vc c06360Vc = C06360Vc.A0A;
            if (c06360Vc != null) {
                AtomicReference atomicReference = c06360Vc.A05;
                C0DN.A00(atomicReference.get(), interfaceC06330Uz, atomicReference);
                return;
            }
            throw new IllegalStateException("Performing config change before TraceControl has been initialized");
        }
    }

    private void A02(TraceContext traceContext) {
        for (Buffer buffer : traceContext.A0F) {
            if (!this.A02.deallocateBuffer(buffer)) {
                android.util.Log.e("Profilo/TraceOrchestrator", AnonymousClass001.A0R("Could not release memory for buffer for trace: ", traceContext.A0D));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.0W3] */
    private void A03(TraceContext traceContext) {
        File file;
        File parentFile;
        String name;
        C0W3 c0w3;
        File file2 = traceContext.A0A;
        boolean z = true;
        if (!file2.isDirectory() || file2.list().length <= 1) {
            z = false;
        }
        boolean z2 = false;
        File file3 = traceContext.A0A;
        if (z) {
            file = null;
            if (file3.isDirectory()) {
                File file4 = new File(file3.getParent(), AnonymousClass001.A0R(file3.getName(), ".zip.tmp"));
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file4), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
                    try {
                        ZipOutputStream zipOutputStream = new ZipOutputStream(bufferedOutputStream);
                        try {
                            AbstractC05190Pp.A01(file3, ".", zipOutputStream);
                            zipOutputStream.flush();
                            zipOutputStream.finish();
                            zipOutputStream.close();
                            bufferedOutputStream.close();
                            file = file4;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                    file4.delete();
                }
            }
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss", Locale.US).format(new Date());
            parentFile = file.getParentFile();
            name = AnonymousClass001.A0g(format, "-", file.getName());
        } else {
            File[] listFiles = file3.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                file = listFiles[0];
                parentFile = traceContext.A0A.getParentFile();
                name = file.getName();
            } else {
                return;
            }
        }
        File file5 = new File(parentFile, name);
        if (file.renameTo(file5)) {
            C09920ft c09920ft = this.A06;
            if (c09920ft.AGE(traceContext, file5)) {
                synchronized (this) {
                    if ((traceContext.A03 & 3) != 0) {
                        z2 = true;
                    }
                    C0W4 c0w4 = this.A01;
                    c0w4.A04(file5, z2);
                    A05();
                    c0w3 = c0w4.A02;
                    c0w4.A02 = new Object();
                }
                c09920ft.DuP(traceContext);
                c09920ft.DuO(c0w3.A02 + c0w3.A03 + c0w3.A01 + c0w3.A04, c0w3.A06, c0w3.A05, c0w3.A00);
            }
        }
    }

    public final File A04(C0VQ c0vq, TraceContext traceContext) {
        File file;
        if ((traceContext.A03 & 2) == 0) {
            HashSet A03 = ProvidersRegistry.A00.A03(c0vq.getSupportedProviders());
            if (!A03.isEmpty()) {
                synchronized (this) {
                    file = this.A01.A06;
                }
                File file2 = new File(new File(file, traceContext.A0D.replace("+", "_p_").replace("/", "_s_")), "extra");
                if (!file2.isDirectory() && !file2.mkdirs()) {
                    android.util.Log.w("Profilo/TraceOrchestrator", "Failed to create extra data file! This could be because another process created it");
                    if (!file2.exists() || !file2.isDirectory()) {
                        return null;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("main");
                sb.append("-");
                sb.append(Process.myPid());
                sb.append("-");
                sb.append((String) A03.iterator().next());
                return new File(file2, sb.toString());
            }
        }
        return null;
    }

    @Override // X.InterfaceC06430Vk
    public final void DuU(TraceContext traceContext, int i) {
        InterfaceC06330Uz interfaceC06330Uz;
        int optSystemConfigParamInt;
        try {
            this.A06.DuU(traceContext, i);
            android.util.Log.w("Profilo/TraceOrchestrator", AnonymousClass001.A0R("Trace is aborted with code: ", C0VV.A00(i)));
            C06360Vc c06360Vc = C06360Vc.A0A;
            if (c06360Vc != null) {
                c06360Vc.A07(traceContext.A06, i);
                File file = traceContext.A0A;
                if (file.exists()) {
                    synchronized (this) {
                        try {
                            interfaceC06330Uz = this.A09;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (interfaceC06330Uz != null && i == 4 && (optSystemConfigParamInt = interfaceC06330Uz.optSystemConfigParamInt("system_config.timed_out_upload_sample_rate", 0)) != 0 && this.A08.nextInt(optSystemConfigParamInt) == 0) {
                        A03(traceContext);
                    }
                    try {
                        AbstractC05190Pp.A00(file);
                    } catch (Exception e) {
                        android.util.Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e);
                    }
                }
                return;
            }
            throw new IllegalStateException("No TraceControl when cleaning up aborted trace");
        } finally {
            A02(traceContext);
        }
    }

    @Override // X.InterfaceC06430Vk
    public final void DuV(TraceContext traceContext) {
        try {
            this.A06.DuV(traceContext);
            if (traceContext.A0A.exists()) {
                A03(traceContext);
                try {
                    AbstractC05190Pp.A00(traceContext.A0A);
                } catch (Exception e) {
                    android.util.Log.e("Profilo/TraceOrchestrator", "failed to delete directory", e);
                }
            }
        } finally {
            A02(traceContext);
        }
    }

    @Override // X.InterfaceC06430Vk
    public final void DuW(TraceContext traceContext, Throwable th) {
        android.util.Log.e("Profilo/TraceOrchestrator", "Write exception", th);
        this.A06.DuW(traceContext, th);
        DuU(traceContext, 8);
    }

    @Override // X.InterfaceC06430Vk
    public final void DuX(TraceContext traceContext) {
        this.A06.DuX(traceContext);
    }
}
