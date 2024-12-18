package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SFt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62542SFt {
    public final Handler A00;
    public final STU A01;
    public final AtomicReference A02 = new AtomicReference();

    public C62542SFt(Looper looper, STU stu) {
        this.A00 = new Handler(looper);
        this.A01 = stu;
    }
}
