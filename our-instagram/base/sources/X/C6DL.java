package X;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6DL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DL {
    public LEL A00;
    public Process A01;
    public final Thread A02;
    public final Runtime A03;
    public final Thread A04;
    public final AtomicBoolean A05 = new AtomicBoolean(false);

    public static final void A00(C6DL c6dl) {
        if (!c6dl.A05.getAndSet(true)) {
            Process process = c6dl.A01;
            process.destroy();
            process.waitFor();
            LEL lel = c6dl.A00;
            synchronized (lel) {
                if (!lel.A01.getAndSet(true)) {
                    File[] fileArr = (File[]) LEL.A00("list temp directory", new MHH(lel, 27));
                    if (fileArr != null) {
                        for (File file : fileArr) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("deleting ");
                            sb.append(file);
                            LEL.A00(sb.toString(), new MHH(file, 26));
                        }
                    }
                    File file2 = lel.A00;
                    if (file2 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("deleting ");
                        sb2.append(file2);
                        LEL.A00(sb2.toString(), new MHH(file2, 26));
                    }
                    lel.A00 = null;
                }
            }
            try {
                c6dl.A03.removeShutdownHook(c6dl.A04);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public C6DL(File file, Runtime runtime) {
        this.A03 = runtime;
        Thread thread = new Thread(new Runnable() { // from class: X.M1L
            @Override // java.lang.Runnable
            public final void run() {
                C6DL.A00(C6DL.this);
            }
        });
        this.A04 = thread;
        this.A00 = new LEL(file);
        runtime.addShutdownHook(thread);
        String A0R = AnonymousClass001.A0R(file.getPath(), "/msys_logcat_logs");
        String[] strArr = O18.A02;
        C14360o3.A0B(A0R, 0);
        this.A01 = runtime.exec((String[]) AbstractC06960Yn.A0b(AbstractC06960Yn.A0b(AbstractC06960Yn.A0b(new String[]{"logcat"}, new String[]{"-f", A0R}), O18.A00), O18.A02));
        Thread thread2 = new Thread(new M1K(this));
        this.A02 = thread2;
        thread2.start();
    }
}
