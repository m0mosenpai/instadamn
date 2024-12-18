package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.T0z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64148T0z implements InterfaceC93784Jk {
    public static final ExecutorC64806TUu A0E = ExecutorC64806TUu.A00();
    public C62704SMs A00;
    public final Handler A01;
    public final C62546SFx A02;
    public final C4N8 A03;
    public final InterfaceC65366Tiy A04;
    public final String A06;
    public final String A07;
    public final Context A0A;
    public final C62484SDl A0B;
    public final C62952SYu A0C;
    public final C61550RpV A0D;
    public final Queue A08 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A09 = AbstractC166997dE.A17();
    public final Runnable A05 = new RunnableC64580TKr(this);

    public C64148T0z(Context context, C62952SYu c62952SYu, C4N8 c4n8, InterfaceC65366Tiy interfaceC65366Tiy, InterfaceC65366Tiy interfaceC65366Tiy2, C61550RpV c61550RpV, String str, String str2, String str3, String str4) {
        this.A0A = context;
        this.A03 = c4n8;
        this.A04 = interfaceC65366Tiy2;
        this.A07 = str4;
        this.A06 = str3;
        this.A0C = c62952SYu;
        this.A01 = new Q3b(context.getMainLooper(), this, 1);
        this.A0B = new C62484SDl(context.getApplicationContext(), c62952SYu, str);
        this.A02 = new C62546SFx(context.getApplicationContext(), c62952SYu, interfaceC65366Tiy, str, str2);
        this.A0D = c61550RpV;
        if (this.A00 != null) {
            A00(this);
        }
        C62704SMs c62704SMs = new C62704SMs();
        c62704SMs.A04 = this.A06;
        c62704SMs.A05 = this.A07;
        AtomicReference atomicReference = new AtomicReference("");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        atomicReference.set(((C4N7) this.A03).getString("fb_uid", ""));
        countDownLatch.countDown();
        try {
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C0K8.A0G("DefaultAnalyticsLogger", "Waiting for fb user id interrupted", e);
        }
        String str5 = (String) atomicReference.get();
        c62704SMs.A06 = TextUtils.isEmpty(str5) ? "0" : str5;
        c62704SMs.A03 = "567310203415052";
        c62704SMs.A02 = this.A04;
        this.A00 = c62704SMs;
    }

    public static void A00(C64148T0z c64148T0z) {
        C62704SMs c62704SMs = c64148T0z.A00;
        List list = c62704SMs.A07;
        if (!list.isEmpty()) {
            C62484SDl c62484SDl = c64148T0z.A0B;
            String str = "failed to close writer";
            C62952SYu c62952SYu = c62484SDl.A00;
            c62952SYu.A00(new SP7("log_event_attempted", 1L));
            File file = c62484SDl.A01;
            if (!file.exists() && !file.mkdir()) {
                C0K8.A0C("AnalyticsStorage", "Unable to open analytics storage.");
            }
            UUID uuid = c62704SMs.A08;
            if (uuid == null) {
                uuid = UUID.randomUUID();
                c62704SMs.A08 = uuid;
            }
            File A0w = MSW.A0w(file, AbstractC58318PtA.A0k("%s_%d.batch", AbstractC25228BEl.A1Z(uuid.toString(), c62704SMs.A00)));
            if (A0w.exists() && !A0w.delete()) {
                C0K8.A0P("AnalyticsStorage", "File %s was not deleted", A0w);
            }
            c62704SMs.A01 = System.currentTimeMillis();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(A0w);
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF8");
                    try {
                        try {
                            outputStreamWriter.write(c62704SMs.toString());
                            c62952SYu.A00(new SP7("log_event_file_size_in_bytes", r0.length()));
                            c62952SYu.A00(new SP7("log_event_succeeded", 1L));
                        } catch (IOException e) {
                            C0K8.A0I("AnalyticsStorage", "failed to write session to file", e);
                        }
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e2) {
                            e = e2;
                            C0K8.A0I("AnalyticsStorage", str, e);
                            list.clear();
                            c62704SMs.A00++;
                        }
                    } catch (Throwable th) {
                        try {
                            outputStreamWriter.close();
                            throw th;
                        } catch (IOException e3) {
                            C0K8.A0I("AnalyticsStorage", "failed to close writer", e3);
                            throw th;
                        }
                    }
                } catch (UnsupportedEncodingException e4) {
                    C0K8.A0I("AnalyticsStorage", "UTF8 encoding is not supported", e4);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        str = "failed to close output stream";
                        C0K8.A0I("AnalyticsStorage", str, e);
                        list.clear();
                        c62704SMs.A00++;
                    }
                }
            } catch (FileNotFoundException e6) {
                C0K8.A0M("AnalyticsStorage", "Batch file creation failed %s", e6, A0w);
            }
            list.clear();
            c62704SMs.A00++;
        }
    }

    public static void A01(C64148T0z c64148T0z, Runnable runnable) {
        c64148T0z.A08.add(runnable);
        if (c64148T0z.A09.compareAndSet(false, true)) {
            A0E.execute(c64148T0z.A05);
        }
    }

    @Override // X.InterfaceC93784Jk
    public final void reportEvent(C63302Sh6 c63302Sh6) {
        boolean z;
        C61550RpV c61550RpV = this.A0D;
        Map map = c63302Sh6.A06;
        if (map.containsKey("l")) {
            z = Boolean.parseBoolean(AbstractC166987dD.A1A("l", map));
        } else {
            C4N8 c4n8 = c61550RpV.A00;
            EnumC74133Ur[] enumC74133UrArr = EnumC74133Ur.A02;
            if (!((C4N7) c4n8).getBoolean("LOG_ANALYTICS_EVENTS", false)) {
                z = ((C4N7) c61550RpV.A00).getBoolean("is_employee", false);
            }
            A01(this, new RunnableC64642TNy(c63302Sh6, this));
        }
        if (!z) {
            return;
        }
        A01(this, new RunnableC64642TNy(c63302Sh6, this));
    }
}
