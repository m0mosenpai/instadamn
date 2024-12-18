package X;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.WFm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70184WFm {
    public static int A00 = Integer.MAX_VALUE;
    public static final Handler A01 = AbstractC167007dF.A0J();
    public static final int A02 = Math.max((int) (Runtime.getRuntime().availableProcessors() * 1.5f), 3);
    public static volatile C68890Vdm A03;

    public static C68890Vdm A00() {
        if (A03 == null) {
            synchronized (C70184WFm.class) {
                if (A03 == null) {
                    A03 = new C68890Vdm(A02);
                }
            }
        }
        return A03;
    }

    public static void A01(AbstractRunnableC71645Wxs abstractRunnableC71645Wxs) {
        int i = A00;
        A00 = i - 1;
        abstractRunnableC71645Wxs.A00 = i << 32;
        abstractRunnableC71645Wxs.A02 = null;
        abstractRunnableC71645Wxs.A01 = 0L;
        A00().A00.add(abstractRunnableC71645Wxs);
    }

    public static void A02(AbstractRunnableC71645Wxs abstractRunnableC71645Wxs, String str) {
        int i = A00;
        A00 = i - 1;
        abstractRunnableC71645Wxs.A00 = i << 32;
        abstractRunnableC71645Wxs.A02 = str;
        abstractRunnableC71645Wxs.A01 = 0L;
        A00().A00.add(abstractRunnableC71645Wxs);
    }

    public static void A03(String str) {
        BlockingQueue<AbstractRunnableC71645Wxs> blockingQueue = A00().A00;
        for (AbstractRunnableC71645Wxs abstractRunnableC71645Wxs : blockingQueue) {
            if (str.equals(abstractRunnableC71645Wxs.A02)) {
                blockingQueue.remove(abstractRunnableC71645Wxs);
                if (abstractRunnableC71645Wxs instanceof C66532ULm) {
                    C2TD.A09.release();
                } else if (abstractRunnableC71645Wxs instanceof C66534ULo) {
                    ((C66534ULo) abstractRunnableC71645Wxs).A05.A04();
                }
            }
        }
    }
}
