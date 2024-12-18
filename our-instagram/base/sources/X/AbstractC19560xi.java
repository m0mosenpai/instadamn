package X;

import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19560xi {
    public boolean A00;
    public final AbstractServiceC19690xx A01;

    public AbstractC19560xi(AbstractServiceC19690xx abstractServiceC19690xx) {
        C14360o3.A0B(abstractServiceC19690xx, 1);
        C0eQ.A00();
        this.A01 = abstractServiceC19690xx;
    }

    public abstract int A07(Intent intent, int i, int i2);

    public final synchronized void A08() {
        if (!this.A00) {
            this.A00 = true;
            this.A01.A02();
        }
    }

    public abstract IBinder A0B(Intent intent);

    public void A09(Intent intent, int i) {
        this.A01.A06(intent, i);
    }

    public void A0A(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.A01.A07(fileDescriptor, printWriter, strArr);
    }

    public void A0D(Intent intent) {
        this.A01.A05(intent);
    }

    public boolean A0E(Intent intent) {
        return this.A01.A08(intent);
    }

    public void A0F() {
        this.A01.A03();
    }

    public void A0C() {
        A08();
    }
}
