package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.2ce, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53562ce implements InterfaceC65301ThZ {
    public AbstractC53492cX A00;
    public Executor A01;
    public ThreadPoolExecutor A02;
    public final Context A03;
    public final C53532cb A04;
    public final Object A05 = new Object();
    public final C53552cd A06;

    public static void A00(C53562ce c53562ce) {
        synchronized (c53562ce.A05) {
            c53562ce.A00 = null;
            ThreadPoolExecutor threadPoolExecutor = c53562ce.A02;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            c53562ce.A01 = null;
            c53562ce.A02 = null;
        }
    }

    @Override // X.InterfaceC65301ThZ
    public final void ChH(AbstractC53492cX abstractC53492cX) {
        C02R.A03(abstractC53492cX, "LoaderCallback cannot be null");
        Object obj = this.A05;
        synchronized (obj) {
            this.A00 = abstractC53492cX;
        }
        synchronized (obj) {
            if (this.A00 != null) {
                Executor executor = this.A01;
                Executor executor2 = executor;
                if (executor == null) {
                    ThreadPoolExecutor A00 = AbstractC53502cY.A00("emojiCompat");
                    this.A02 = A00;
                    this.A01 = A00;
                    executor2 = A00;
                }
                executor2.execute(new Runnable() { // from class: X.2cg
                    @Override // java.lang.Runnable
                    public final void run() {
                        C53562ce c53562ce = C53562ce.this;
                        Object obj2 = c53562ce.A05;
                        synchronized (obj2) {
                            if (c53562ce.A00 == null) {
                                return;
                            }
                            try {
                                try {
                                    Context context = c53562ce.A03;
                                    C05170Pm A002 = AbstractC53592ch.A00(context, c53562ce.A04);
                                    int i = A002.A00;
                                    if (i == 0) {
                                        C54162eO[] c54162eOArr = A002.A01;
                                        if (c54162eOArr != null && c54162eOArr.length != 0) {
                                            C54162eO c54162eO = c54162eOArr[0];
                                            int i2 = c54162eO.A00;
                                            if (i2 == 2) {
                                                synchronized (obj2) {
                                                    try {
                                                    } catch (Throwable th) {
                                                    }
                                                }
                                            } else if (i2 == 0) {
                                                try {
                                                    AbstractC09780fb.A01("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface", 1507662813);
                                                    Typeface A03 = AbstractC05160Pl.A01.A03(context, null, new C54162eO[]{c54162eO}, 0);
                                                    MappedByteBuffer A01 = AbstractC15460q1.A01(context, c54162eO.A03);
                                                    if (A01 != null && A03 != null) {
                                                        try {
                                                            AbstractC09780fb.A01("EmojiCompat.MetadataRepo.create", -1072887060);
                                                            C54502f7 c54502f7 = new C54502f7(A03, AbstractC54482f2.A00(A01));
                                                            AbstractC09780fb.A00(-1809553841);
                                                            AbstractC09780fb.A00(-802500232);
                                                            synchronized (obj2) {
                                                                try {
                                                                    AbstractC53492cX abstractC53492cX2 = c53562ce.A00;
                                                                    if (abstractC53492cX2 != null) {
                                                                        abstractC53492cX2.A00(c54502f7);
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    throw th2;
                                                                }
                                                            }
                                                            C53562ce.A00(c53562ce);
                                                        } catch (Throwable th3) {
                                                            AbstractC09780fb.A00(-1498751279);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    AbstractC09780fb.A00(849995101);
                                                    throw th4;
                                                }
                                            }
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                }
                            } catch (Throwable th5) {
                                synchronized (obj2) {
                                    AbstractC53492cX abstractC53492cX3 = c53562ce.A00;
                                    if (abstractC53492cX3 != null) {
                                        abstractC53492cX3.A01(th5);
                                    }
                                    C53562ce.A00(c53562ce);
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public C53562ce(Context context, C53532cb c53532cb, C53552cd c53552cd) {
        this.A03 = context.getApplicationContext();
        this.A04 = c53532cb;
        this.A06 = c53552cd;
    }
}
