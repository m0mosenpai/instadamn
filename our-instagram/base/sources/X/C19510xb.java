package X;

import android.os.Build;
import android.os.Process;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.systrace.Systrace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.0xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19510xb implements C0f2 {
    @Override // X.C0f2
    public final void DuR() {
        AbstractC09740es abstractC09740es = AbstractC09740es.$redex_init_class;
        if ((64 & C0ev.A02) != 0) {
            Systrace.A01(Process.myTid(), "thread_name", Thread.currentThread().getName());
        }
        if ((1 & C0ev.A02) != 0) {
            StringBuilder sb = new StringBuilder(StringTreeSet.MAX_SYMBOL_COUNT);
            sb.append("Android trace tags: ");
            sb.append(AbstractC02650Ap.A01("debug.atrace.tags.enableflags"));
            sb.append(", Facebook trace tags: ");
            sb.append(C0ev.A02);
            Systrace.A01(0, "process_labels", sb.toString());
        }
        if ((64 & C0ev.A02) != 0) {
            try {
                FileReader fileReader = new FileReader("/proc/self/cmdline");
                try {
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    try {
                        String readLine = bufferedReader.readLine();
                        int indexOf = readLine.indexOf(0);
                        if (indexOf >= 0) {
                            readLine = readLine.substring(0, indexOf);
                        }
                        bufferedReader.close();
                        fileReader.close();
                        Systrace.A01(0, "process_name", readLine);
                        String A03 = AbstractC02650Ap.A03("dalvik.vm.heapgrowthlimit");
                        String A032 = AbstractC02650Ap.A03("dalvik.vm.heapmaxfree");
                        String A033 = AbstractC02650Ap.A03("dalvik.vm.heapminfree");
                        Systrace.A01(0, "process_labels", String.format("device=%s,heapgrowthlimit=%s,heapstartsize=%s,heapminfree=%s,heapmaxfree=%s,heaptargetutilization=%s", Build.MODEL, A03, AbstractC02650Ap.A03("dalvik.vm.heapstartsize"), A032, A033, AbstractC02650Ap.A03("dalvik.vm.heaptargetutilization")));
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // X.C0f2
    public final void DuT() {
        AbstractC09740es abstractC09740es = AbstractC09740es.$redex_init_class;
    }
}
