package X;

import android.content.Context;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.Pta, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58339Pta implements InterfaceC65301ThZ {
    public final Context A00;

    @Override // X.InterfaceC65301ThZ
    public final void ChH(final AbstractC53492cX abstractC53492cX) {
        final ThreadPoolExecutor A00 = AbstractC53502cY.A00("EmojiCompatInitializer");
        A00.execute(new Runnable() { // from class: X.2ca
            /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
            
                r10 = r2.authority;
                r9 = ((android.content.pm.PackageItemInfo) r2).packageName;
                r7 = r6.getPackageInfo(r9, 64).signatures;
                r6 = new java.util.ArrayList();
                r2 = r7.length;
                r1 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
            
                if (r1 >= r2) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
            
                r6.add(r7[r1].toByteArray());
                r1 = r1 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
            
                r1 = new X.C53562ce(r8, new X.C53532cb(r10, r9, "emojicompat-emoji-font", java.util.Collections.singletonList(r6)), X.AbstractC53542cc.A00);
                new X.C58340Ptb();
                r0 = r1.A05;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
            
                monitor-enter(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
            
                r1.A01 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
            
                monitor-exit(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
            
                r1.ChH(new X.C53572cf(r4, r5, r3));
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
            
                r1 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
            
                throw r1;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r11 = this;
                    X.Pta r5 = r2
                    X.2cX r4 = r1
                    java.util.concurrent.ThreadPoolExecutor r3 = r3
                    android.content.Context r8 = r5.A00     // Catch: java.lang.Throwable -> L96
                    android.content.pm.PackageManager r6 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L96
                    java.lang.String r0 = "Package manager required to locate emoji font provider"
                    X.C02R.A03(r6, r0)     // Catch: java.lang.Throwable -> L96
                    java.lang.String r0 = "androidx.content.action.LOAD_EMOJI_FONT"
                    android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L96
                    r1.<init>(r0)     // Catch: java.lang.Throwable -> L96
                    r0 = 0
                    java.util.List r0 = r6.queryIntentContentProviders(r1, r0)     // Catch: java.lang.Throwable -> L96
                    java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Throwable -> L96
                L21:
                    boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L96
                    if (r0 == 0) goto L8e
                    java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L96
                    android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch: java.lang.Throwable -> L96
                    android.content.pm.ProviderInfo r2 = r0.providerInfo     // Catch: java.lang.Throwable -> L96
                    r1 = 1
                    if (r2 == 0) goto L21
                    android.content.pm.ApplicationInfo r0 = r2.applicationInfo     // Catch: java.lang.Throwable -> L96
                    if (r0 == 0) goto L21
                    int r0 = r0.flags     // Catch: java.lang.Throwable -> L96
                    r0 = r0 & 1
                    if (r0 != r1) goto L21
                    java.lang.String r10 = r2.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    java.lang.String r9 = r2.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    r0 = 64
                    android.content.pm.PackageInfo r0 = r6.getPackageInfo(r9, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    android.content.pm.Signature[] r7 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    java.util.ArrayList r6 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    r6.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    int r2 = r7.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    r1 = 0
                L4f:
                    if (r1 >= r2) goto L5d
                    r0 = r7[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    r6.add(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    int r1 = r1 + 1
                    goto L4f
                L5d:
                    java.util.List r1 = java.util.Collections.singletonList(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    java.lang.String r0 = "emojicompat-emoji-font"
                    X.2cb r2 = new X.2cb     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    r2.<init>(r10, r9, r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L87 java.lang.Throwable -> L96
                    X.2cd r0 = X.AbstractC53542cc.A00     // Catch: java.lang.Throwable -> L96
                    X.2ce r1 = new X.2ce     // Catch: java.lang.Throwable -> L96
                    r1.<init>(r8, r2, r0)     // Catch: java.lang.Throwable -> L96
                    X.Ptb r0 = new X.Ptb     // Catch: java.lang.Throwable -> L96
                    r0.<init>()     // Catch: java.lang.Throwable -> L96
                    java.lang.Object r0 = r1.A05     // Catch: java.lang.Throwable -> L96
                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L96
                    r1.A01 = r3     // Catch: java.lang.Throwable -> L84
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                    X.2cf r0 = new X.2cf     // Catch: java.lang.Throwable -> L96
                    r0.<init>()     // Catch: java.lang.Throwable -> L96
                    r1.ChH(r0)     // Catch: java.lang.Throwable -> L96
                    return
                L84:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                    goto L95
                L87:
                    r1 = move-exception
                    java.lang.String r0 = "emoji2.text.DefaultEmojiConfig"
                    android.util.Log.wtf(r0, r1)     // Catch: java.lang.Throwable -> L96
                L8e:
                    java.lang.String r0 = "EmojiCompat font provider not available on this device."
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L96
                    r1.<init>(r0)     // Catch: java.lang.Throwable -> L96
                L95:
                    throw r1     // Catch: java.lang.Throwable -> L96
                L96:
                    r0 = move-exception
                    r4.A01(r0)
                    r3.shutdown()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC53522ca.run():void");
            }
        });
    }

    public C58339Pta(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
