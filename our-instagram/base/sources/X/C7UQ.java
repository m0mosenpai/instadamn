package X;

import android.content.Context;
import com.facebook.stash.core.FileStash;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;

/* renamed from: X.7UQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7UQ {
    public static final C1QY A03;
    public final FileStash A00;
    public final C7UR A01;
    public final C14M A02;

    public final void A00(String str, String str2) {
        byte[] A01;
        C14360o3.A0B(str, 0);
        if (str2 == null) {
            str2 = new C7UT().A00(str);
        }
        FileStash fileStash = this.A00;
        if (fileStash.hasKey(str2)) {
            InputStream read = fileStash.read(str2);
            if (read == null || (A01 = AbstractC37701p7.A01(read, new ArrayDeque(20), 0)) == null) {
                return;
            }
        } else {
            A01 = AbstractC37701p7.A01(this.A02.A08(A03, C2n4.A09.E3L(str), null).A02.AjT(), new ArrayDeque(20), 0);
            if (A01 == null) {
                return;
            }
            OutputStream write = fileStash.write(str2);
            try {
                write.write(A01);
                write.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C20I.A00(write, th);
                    throw th2;
                }
            }
        }
        C7UR c7ur = this.A01;
        if (C7US.A02(str)) {
            C49473Ltm c49473Ltm = new C49473Ltm(c7ur, str, A01);
            if (c7ur.A09) {
                C11T.A02(new JXQ(c49473Ltm, c7ur));
            } else {
                c7ur.A07.execute(new RunnableC1572574g(c49473Ltm, c7ur));
            }
        }
    }

    static {
        C1QX c1qx = new C1QX();
        c1qx.A04 = EnumC23341Bw.Image;
        c1qx.A03 = C1Ef.OnScreen;
        A03 = c1qx.A00();
    }

    public /* synthetic */ C7UQ(FileStash fileStash) {
        C7UR c7ur = C7UR.A0A;
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        C7UR A00 = C7US.A00(context);
        C14M A032 = C14M.A03();
        C14360o3.A0B(A00, 2);
        C14360o3.A0B(A032, 3);
        this.A00 = fileStash;
        this.A01 = A00;
        this.A02 = A032;
    }
}
