package X;

import java.io.IOException;

/* loaded from: classes8.dex */
public final class M75 implements Runnable {
    public final /* synthetic */ C45113Jxi A00;
    public final /* synthetic */ C196948nP A01;
    public final /* synthetic */ C203248yh A02;
    public final /* synthetic */ A0Y A03;
    public final /* synthetic */ C48515LdD A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public M75(C45113Jxi c45113Jxi, C196948nP c196948nP, C203248yh c203248yh, A0Y a0y, C48515LdD c48515LdD, String str, String str2) {
        this.A04 = c48515LdD;
        this.A01 = c196948nP;
        this.A02 = c203248yh;
        this.A06 = str;
        this.A05 = str2;
        this.A00 = c45113Jxi;
        this.A03 = a0y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis;
        C48515LdD c48515LdD = this.A04;
        C196948nP c196948nP = this.A01;
        C203248yh c203248yh = this.A02;
        String str = this.A06;
        String str2 = this.A05;
        C45113Jxi c45113Jxi = this.A00;
        if (c45113Jxi != null) {
            currentTimeMillis = c45113Jxi.A00;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        try {
            C11T.A02(new RunnableC49990M5f(new C45113Jxi(c203248yh, str2, str, currentTimeMillis), c48515LdD, str2));
        } catch (IOException unused) {
            if (this.A03 != null) {
                c196948nP.A02();
            }
        }
    }
}
