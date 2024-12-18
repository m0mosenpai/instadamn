package X;

import android.os.Process;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.Vsh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69640Vsh {
    public final String A00;
    public final String A01;
    public final long A02 = System.currentTimeMillis();
    public final String A03;
    public final String A04;
    public final String A05;
    public final Throwable A06;
    public final Object[] A07;

    public final String toString() {
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            StringBuilder A1C = AbstractC166987dD.A1C();
            String str = this.A04;
            if (!AbstractC167007dF.A1N(str.length())) {
                A1C.append(str);
                A1C.append(": ");
            }
            Object[] objArr = this.A07;
            Locale locale = Locale.ROOT;
            String str2 = this.A03;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            A1C.append(AbstractC58318PtA.A0o(locale, str2, Arrays.copyOf(copyOf, copyOf.length)));
            A0q.put("content", A1C.toString());
            Throwable th = this.A06;
            if (th != null) {
                A0q.put("traces", android.util.Log.getStackTraceString(th));
            }
            A0q.put("time", this.A02);
            A0q.put("thread", this.A05);
            A0q.put("process", Process.myPid());
            return A0q.toString();
        } catch (Exception e) {
            return AbstractC58318PtA.A0o(Locale.ROOT, "Invalid log: %s", AbstractC166997dE.A1b(e.getMessage(), 1));
        }
    }

    public C69640Vsh(String str, String str2, String str3, String str4, Throwable th, Object[] objArr) {
        this.A00 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A06 = th;
        this.A03 = str4;
        this.A07 = objArr;
        String name = Thread.currentThread().getName();
        C14360o3.A07(name);
        this.A05 = name;
    }
}
