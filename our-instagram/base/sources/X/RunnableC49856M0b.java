package X;

import java.util.List;

/* renamed from: X.M0b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49856M0b implements Runnable {
    public final /* synthetic */ C44527JmX A00;

    public RunnableC49856M0b(C44527JmX c44527JmX) {
        this.A00 = c44527JmX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44527JmX c44527JmX = this.A00;
        if (c44527JmX.A02()) {
            C47297Kv8 c47297Kv8 = c44527JmX.A01;
            if (c47297Kv8 != null) {
                if (!c47297Kv8.A00.isEmpty()) {
                    int i = c44527JmX.A00;
                    C47297Kv8 c47297Kv82 = c44527JmX.A01;
                    if (c47297Kv82 != null) {
                        if (i >= c47297Kv82.A00.size()) {
                            c44527JmX.A00 = 0;
                        }
                        C05A c05a = c44527JmX.A04;
                        C45098JxS c45098JxS = (C45098JxS) c05a.getValue();
                        C47297Kv8 c47297Kv83 = c44527JmX.A01;
                        if (c47297Kv83 != null) {
                            List list = c47297Kv83.A00;
                            int i2 = c44527JmX.A00;
                            c44527JmX.A00 = i2 + 1;
                            KzF kzF = (KzF) list.get(i2);
                            C73 c73 = c45098JxS.A01;
                            boolean z = c45098JxS.A05;
                            String str = c45098JxS.A03;
                            String str2 = c45098JxS.A02;
                            boolean z2 = c45098JxS.A06;
                            String str3 = c45098JxS.A04;
                            AbstractC167017dG.A1O(c73, str);
                            c05a.Egh(new C45098JxS(kzF, c73, str, str2, str3, z, z2));
                        }
                    }
                }
                c44527JmX.A02.postDelayed(this, 4000L);
                return;
            }
            C14360o3.A0F("randomizedGhostPrompts");
            throw C00O.createAndThrow();
        }
    }
}
