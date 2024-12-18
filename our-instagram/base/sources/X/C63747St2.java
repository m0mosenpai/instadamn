package X;

import java.io.InputStream;
import java.util.Queue;

/* renamed from: X.St2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63747St2 implements InterfaceC65470Tkn {
    public final C63361SiK A00;
    public final C63360SiJ A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        C61005RdY c61005RdY;
        boolean z;
        C61043ReF c61043ReF;
        C61043ReF c61043ReF2;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof C61005RdY) {
            c61005RdY = (C61005RdY) inputStream;
            z = false;
        } else {
            c61005RdY = new C61005RdY(this.A00, inputStream);
            z = true;
        }
        Queue queue = C61043ReF.A02;
        synchronized (queue) {
            c61043ReF = (C61043ReF) queue.poll();
            c61043ReF2 = c61043ReF;
        }
        if (c61043ReF == null) {
            c61043ReF2 = new InputStream();
        }
        c61043ReF2.A01 = c61005RdY;
        C61003RdW c61003RdW = new C61003RdW(c61043ReF2);
        C63852Suk c63852Suk = new C63852Suk(c61005RdY, c61043ReF2);
        try {
            C63360SiJ c63360SiJ = this.A01;
            C63791Stl A01 = C63360SiJ.A01(c63729Ssj, c63852Suk, c63360SiJ, new C63854Sum(c63360SiJ.A02, c61003RdW, c63360SiJ.A04), i, i2);
            c61043ReF2.A00 = null;
            c61043ReF2.A01 = null;
            synchronized (queue) {
                queue.offer(c61043ReF2);
            }
            if (z) {
                c61005RdY.A01();
            }
            return A01;
        } catch (Throwable th) {
            c61043ReF2.A00 = null;
            c61043ReF2.A01 = null;
            synchronized (queue) {
                queue.offer(c61043ReF2);
                if (z) {
                    c61005RdY.A01();
                }
                throw th;
            }
        }
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        C62997SaL c62997SaL = C63360SiJ.A05;
        return true;
    }

    public C63747St2(C63361SiK c63361SiK, C63360SiJ c63360SiJ) {
        this.A01 = c63360SiJ;
        this.A00 = c63361SiK;
    }
}
