package X;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: X.2sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC62442sj extends AbstractC019307n {
    public Executor A00;
    public volatile C3IC A01;
    public volatile C3IC A02;

    public abstract Object A06();

    @Override // X.AbstractC019307n
    public final boolean A05() {
        if (this.A01 != null) {
            if (!this.A07) {
                this.A04 = true;
            }
            if (this.A02 != null) {
                this.A01 = null;
            } else {
                C3IC c3ic = this.A01;
                c3ic.A01.set(true);
                boolean cancel = c3ic.A00.cancel(false);
                if (cancel) {
                    this.A02 = this.A01;
                }
                this.A01 = null;
                return cancel;
            }
        }
        return false;
    }

    public Executor A07() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public final void A08() {
        if (this.A02 == null && this.A01 != null) {
            if (this.A00 == null) {
                this.A00 = A07();
            }
            C3IC c3ic = this.A01;
            Executor executor = this.A00;
            if (c3ic.A03 != C05F.A00) {
                int intValue = c3ic.A03.intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException(AbstractC111324zv.A00(1525));
                }
                throw new IllegalStateException(AbstractC111324zv.A00(1526));
            }
            c3ic.A03 = C05F.A01;
            executor.execute(c3ic.A00);
        }
    }

    public final void A0A(C3IC c3ic) {
        if (this.A02 == c3ic) {
            if (this.A05) {
                if (this.A07) {
                    A09();
                } else {
                    this.A04 = true;
                }
            }
            SystemClock.uptimeMillis();
            this.A02 = null;
            A08();
        }
    }

    public AbstractC62442sj(Context context) {
        this.A07 = false;
        this.A03 = false;
        this.A06 = true;
        this.A04 = false;
        this.A05 = false;
        super.A01 = context.getApplicationContext();
    }

    @Override // X.AbstractC019307n
    @Deprecated
    public final void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A04(str, fileDescriptor, printWriter, strArr);
        if (this.A01 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.A01);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
        if (this.A02 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.A02);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
    }

    public final void A09() {
        A05();
        this.A01 = new C3IC(this);
        A08();
    }
}
