package X;

import com.google.common.collect.EvictingQueue;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.ABf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22980ABf {
    public EvictingQueue A00;
    public final SimpleDateFormat A03 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
    public final Object A02 = new Object();
    public final java.util.Set A04 = AbstractC166987dD.A1H();
    public StringBuilder A01 = AbstractC166987dD.A1C();

    public final void A00(String str, String str2, String str3, Throwable th, Date date) {
        String format;
        String str4;
        StringBuilder A1C = AbstractC166987dD.A1C();
        Object obj = this.A02;
        synchronized (obj) {
            format = this.A03.format(date);
            C14360o3.A07(format);
        }
        A1C.append(format);
        A1C.append("> ");
        if (str.length() != 0) {
            C0J9 c0j9 = C0JA.A00().A00;
            if (c0j9 == null || (str4 = c0j9.A00) == null || str4.length() == 0) {
                str4 = "main";
            }
            A1C.append(str);
            A1C.append(" [");
            A1C.append(str4);
            A1C.append("] ");
        }
        A1C.append(str2);
        A1C.append(": ");
        A1C.append(str3);
        if (th != null) {
            A1C.append('\n');
            A1C.append(C0JY.A00(th));
        }
        String A19 = AbstractC166987dD.A19(A1C);
        synchronized (obj) {
            EvictingQueue evictingQueue = this.A00;
            if (evictingQueue == null) {
                evictingQueue = new EvictingQueue(1000);
                this.A00 = evictingQueue;
            }
            evictingQueue.add(A19);
        }
    }
}
