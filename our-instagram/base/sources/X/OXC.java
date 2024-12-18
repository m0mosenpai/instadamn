package X;

import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class OXC {
    public MediaMetadataRetriever A00;
    public OEB A01;
    public InterfaceC58090PpF A02;
    public double[] A03;
    public double[] A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Handler A08;
    public final LruCache A09;
    public final LruCache A0A;
    public final C18340vL A0B;
    public final long A0C;
    public final UserSession A0D;
    public final String A0E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OXC(com.instagram.common.session.UserSession r10, X.OEB r11, int r12, int r13) {
        /*
            r9 = this;
            r6 = 4
            r2 = r11
            java.lang.String r3 = r11.A05
            r3.getClass()
            long r7 = r11.A03
            r0 = r9
            r1 = r10
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OXC.<init>(com.instagram.common.session.UserSession, X.OEB, int, int):void");
    }

    public final void A02() {
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
        try {
            this.A00.release();
        } catch (Exception unused) {
        }
        this.A08.removeCallbacksAndMessages(null);
        this.A09.evictAll();
        this.A0A.evictAll();
    }

    public final void A00() {
        this.A0B.A00.clear();
        this.A08.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.NAQ, X.U7H] */
    public final void A01() {
        double[] dArr = this.A03;
        InterfaceC58090PpF interfaceC58090PpF = this.A02;
        if (interfaceC58090PpF != null && dArr != null) {
            interfaceC58090PpF.Drf(dArr);
            return;
        }
        U7K u7k = U7H.A04;
        File A11 = AbstractC166987dD.A11(this.A0E);
        long j = this.A0C;
        ?? u7h = new U7H();
        u7h.A02 = A11;
        u7h.A01 = this;
        u7h.A00 = j;
        AbstractC31174DnI.A1N(u7h);
    }

    public final void A03(C53620NnR c53620NnR) {
        int i = c53620NnR.A04;
        int i2 = c53620NnR.A02;
        if (i < i2) {
            while (i <= i2) {
                this.A0B.ATO(new C52384NGf(c53620NnR, this, i));
                i++;
            }
        } else {
            while (i2 >= i) {
                this.A0B.ATO(new C52384NGf(c53620NnR, this, i2));
                i2--;
            }
        }
    }

    public OXC(UserSession userSession, OEB oeb, String str, int i, int i2, int i3, long j) {
        this.A08 = AbstractC167007dF.A0J();
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 10);
        this.A09 = new C50770Mbc(this, maxMemory, 0);
        this.A0A = new C50770Mbc(this, maxMemory, 1);
        this.A0B = new C18340vL(C14120nc.A00(), 1);
        this.A01 = oeb;
        this.A06 = i;
        this.A05 = i2;
        this.A07 = i3;
        this.A0E = str;
        this.A0C = j;
        this.A0D = userSession;
        this.A00 = new MediaMetadataRetriever();
        File A11 = AbstractC166987dD.A11(str);
        try {
            try {
                this.A00.setDataSource(str);
            } catch (FileNotFoundException | RuntimeException e) {
                throw new IOException(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new IOException("Invalid input file", e2);
        } catch (RuntimeException unused) {
            this.A00.setDataSource(new FileInputStream(A11).getFD());
        }
    }
}
