package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.SfO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63218SfO {
    public static final Object A06 = AbstractC58318PtA.A0b();
    public static volatile C63218SfO A07;
    public int A00;
    public final SFH A02;
    public final InterfaceC65183TfR A03;
    public final java.util.Set A04;
    public final ReadWriteLock A05 = new ReentrantReadWriteLock();
    public final Handler A01 = AbstractC167007dF.A0J();

    public final CharSequence A02(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return A03(charSequence, 0, length, Integer.MAX_VALUE, 0);
    }

    public static C63218SfO A00() {
        C63218SfO c63218SfO;
        synchronized (A06) {
            C02R.A07(AbstractC167007dF.A1W(A07), "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            c63218SfO = A07;
        }
        return c63218SfO;
    }

    public final int A01() {
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.readLock().lock();
        try {
            return this.A00;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e3, code lost:
    
        if (X.AbstractC167007dF.A1P(r19, 65039) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e6, code lost:
    
        if (r1 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016b, code lost:
    
        if (r15 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015c, code lost:
    
        if (X.AbstractC167007dF.A1P(r19, 65039) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015f, code lost:
    
        if (r1 != false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fa A[Catch: all -> 0x0220, TryCatch #0 {all -> 0x0220, blocks: (B:142:0x0072, B:144:0x0076, B:146:0x007a, B:148:0x0089, B:17:0x0095, B:19:0x009f, B:23:0x00a5, B:25:0x00b1, B:27:0x00b4, B:31:0x00c1, B:36:0x00ce, B:37:0x00dd, B:41:0x00f4, B:68:0x0173, B:72:0x017f, B:73:0x0184, B:59:0x0196, B:62:0x019d, B:50:0x01a3, B:52:0x01ae, B:80:0x0108, B:85:0x012b, B:89:0x0133, B:91:0x0142, B:103:0x01b9, B:106:0x01bf, B:108:0x01cb, B:119:0x01f0, B:122:0x01fa, B:123:0x01ff, B:14:0x008f), top: B:141:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0210 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5 A[Catch: all -> 0x0220, TryCatch #0 {all -> 0x0220, blocks: (B:142:0x0072, B:144:0x0076, B:146:0x007a, B:148:0x0089, B:17:0x0095, B:19:0x009f, B:23:0x00a5, B:25:0x00b1, B:27:0x00b4, B:31:0x00c1, B:36:0x00ce, B:37:0x00dd, B:41:0x00f4, B:68:0x0173, B:72:0x017f, B:73:0x0184, B:59:0x0196, B:62:0x019d, B:50:0x01a3, B:52:0x01ae, B:80:0x0108, B:85:0x012b, B:89:0x0133, B:91:0x0142, B:103:0x01b9, B:106:0x01bf, B:108:0x01cb, B:119:0x01f0, B:122:0x01fa, B:123:0x01ff, B:14:0x008f), top: B:141:0x0072 }] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.text.Spanned, java.lang.CharSequence, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence A03(java.lang.CharSequence r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63218SfO.A03(java.lang.CharSequence, int, int, int, int):java.lang.CharSequence");
    }

    public C63218SfO(InterfaceC65183TfR interfaceC65183TfR, java.util.Set set) {
        this.A00 = 3;
        this.A03 = interfaceC65183TfR;
        C012504o c012504o = new C012504o(0);
        this.A04 = c012504o;
        if (!set.isEmpty()) {
            c012504o.addAll(set);
        }
        this.A02 = new SFH(this);
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.writeLock().lock();
        try {
            this.A00 = 0;
            AbstractC58318PtA.A1Y(readWriteLock);
            if (A01() == 0) {
                SFH sfh = this.A02;
                try {
                    SVP svp = new SVP(sfh);
                    C63604SqC c63604SqC = (C63604SqC) sfh.A00.A03;
                    synchronized (c63604SqC.A05) {
                        Handler handler = c63604SqC.A00;
                        if (handler == null) {
                            HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                            AbstractC09770fa.A00(handlerThread);
                            c63604SqC.A01 = handlerThread;
                            handlerThread.start();
                            handler = MSY.A09(c63604SqC.A01);
                            c63604SqC.A00 = handler;
                        }
                        handler.post(new RunnableC64614TMe(svp, c63604SqC));
                    }
                } catch (Throwable th) {
                    sfh.A00.A04(th);
                }
            }
        } catch (Throwable th2) {
            AbstractC58318PtA.A1Y(readWriteLock);
            throw th2;
        }
    }

    public final void A04(Throwable th) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ReadWriteLock readWriteLock = this.A05;
        readWriteLock.writeLock().lock();
        try {
            this.A00 = 2;
            java.util.Set set = this.A04;
            A1E.addAll(set);
            set.clear();
            AbstractC58318PtA.A1Y(readWriteLock);
            this.A01.post(new TPM(th, A1E, this.A00));
        } catch (Throwable th2) {
            AbstractC58318PtA.A1Y(readWriteLock);
            throw th2;
        }
    }
}
