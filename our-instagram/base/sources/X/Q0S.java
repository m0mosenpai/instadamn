package X;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class Q0S implements C11R {
    public final C58681Pzu A00;
    public final String A01;
    public final Executor A02;
    public final C1ON A03;

    @Override // X.C11R
    public final int getRunnableId() {
        return -8;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    public static final String A00(Q0U q0u) {
        C3JY c3jy = q0u.A00;
        InputStream inputStream = null;
        InterfaceC26481Qd A00 = c3jy.A00();
        if (A00 != null) {
            inputStream = A00.AjT();
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine);
                } else {
                    String A19 = AbstractC166987dD.A19(stringBuffer);
                    bufferedReader.close();
                    return A19;
                }
            }
        } finally {
        }
    }

    @Override // X.C11R
    public final String getName() {
        return this.A03.A05;
    }

    @Override // X.C11R
    public final void onFinish() {
        this.A03.onFinish();
    }

    @Override // X.C11R
    public final void onStart() {
        this.A03.onStart();
    }

    @Override // X.C11R
    public final void run() {
        this.A03.run();
    }

    public Q0S(C1ON c1on, C58681Pzu c58681Pzu, String str, Executor executor) {
        this.A01 = str;
        this.A03 = c1on;
        this.A02 = executor;
        this.A00 = c58681Pzu;
        c1on.A00 = new C66081TzI(this, 2);
    }
}
