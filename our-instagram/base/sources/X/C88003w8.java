package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3w8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88003w8 implements InterfaceC88013w9 {
    public final ConcurrentHashMap A05;
    public boolean A02 = false;
    public boolean A03 = false;
    public long A00 = 0;
    public Handler A01 = null;
    public final C88023wA A04 = new C88023wA();

    @Override // X.InterfaceC88013w9
    public final void AVj() {
        AVg(null);
    }

    @Override // X.InterfaceC88013w9
    public final void Ena() {
        EnF(null);
    }

    public final void A00() {
        if (this.A02) {
            this.A02 = false;
            Handler handler = this.A01;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.A01 = handler;
            }
            handler.removeCallbacks(new RunnableC24244ApB(this));
        }
    }

    @Override // X.InterfaceC88013w9
    public final void AVg(Message message) {
        long j;
        try {
            if (!this.A02) {
                return;
            }
            C88023wA c88023wA = this.A04;
            c88023wA.A04();
            for (C72857XpD c72857XpD : this.A05.values()) {
                if (!c72857XpD.A0C) {
                    long A01 = c88023wA.A01();
                    if (((C88033wB) c88023wA).A02 == -1) {
                        A01 = ((C88033wB) c88023wA).A05 - c72857XpD.A0D;
                    }
                    c72857XpD.A00++;
                    c72857XpD.A08 += A01;
                    if (((C88033wB) c88023wA).A0A) {
                        c72857XpD.A01++;
                        c72857XpD.A07 += A01;
                    }
                    if (A01 > 200) {
                        c72857XpD.A02++;
                        if (A01 > c72857XpD.A03) {
                            c72857XpD.A0A = c88023wA.A07();
                        }
                    }
                    c72857XpD.A03 = Math.max(A01, c72857XpD.A03);
                    long j2 = ((C88033wB) c88023wA).A06;
                    if (j2 > 0) {
                        j = ((C88033wB) c88023wA).A02 - j2;
                    } else {
                        j = -1;
                    }
                    if (j > c72857XpD.A05) {
                        c72857XpD.A05 = j;
                        c72857XpD.A09 = c88023wA.A07();
                        c72857XpD.A04 = c88023wA.A01();
                    }
                }
            }
            c88023wA.A03();
        } finally {
            this.A04.A03();
        }
    }

    @Override // X.InterfaceC88013w9
    public final void EnF(Message message) {
        if (this.A02) {
            C88023wA c88023wA = this.A04;
            c88023wA.A09 = null;
            c88023wA.A05 = -1L;
            c88023wA.A05(message);
            c88023wA.A02();
            c88023wA.A01 = 0;
        }
    }

    public C88003w8(ConcurrentHashMap concurrentHashMap) {
        this.A05 = concurrentHashMap;
    }

    @Override // X.InterfaceC88013w9
    public final void EnU(Looper looper, String str) {
    }
}
