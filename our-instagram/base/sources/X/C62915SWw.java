package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.ar.core.dependencies.f;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.SWw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62915SWw {
    public Context A00;
    public f A01;
    public final ServiceConnection A02;
    public final Queue A03;
    public volatile int A04;

    public C62915SWw() {
    }

    public C62915SWw(byte[] bArr) {
        this.A03 = new ArrayDeque();
        this.A04 = 1;
        this.A02 = new ServiceConnectionC63436SkF(this);
    }
}
