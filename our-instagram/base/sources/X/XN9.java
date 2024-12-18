package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class XN9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public Notification A0A;
    public Notification A0B;
    public PendingIntent A0C;
    public PendingIntent A0D;
    public Context A0E;
    public Bundle A0F;
    public RemoteViews A0G;
    public RemoteViews A0H;
    public RemoteViews A0I;
    public XND A0J;
    public AbstractC72869Xpo A0K;
    public Y20 A0L;
    public IconCompat A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public Object A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public ArrayList A0Y;
    public ArrayList A0Z;

    @Deprecated
    public ArrayList A0a;
    public ArrayList A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026e, code lost:
    
        if (r1.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b6, code lost:
    
        r1 = new X.AbstractC72869Xpo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02c2, code lost:
    
        if (r1.equals("androidx.core.app.NotificationCompat$BigPictureStyle") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02e2, code lost:
    
        if (r1.equals("androidx.core.app.NotificationCompat$InboxStyle") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02f3, code lost:
    
        if (r1.equals("androidx.core.app.NotificationCompat$BigTextStyle") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0304, code lost:
    
        if (r1.equals("androidx.core.app.NotificationCompat$MessagingStyle") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b4, code lost:
    
        if (r2.equals(android.app.Notification.DecoratedCustomViewStyle.class.getName()) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03f1, code lost:
    
        if (r2 != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03f3, code lost:
    
        r1 = r7[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03f5, code lost:
    
        if (r1 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x03fb, code lost:
    
        if (r1.isEmpty() != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03fd, code lost:
    
        r25.A0a.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0402, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0404, code lost:
    
        if (r3 >= r2) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public XN9(android.app.Notification r26, android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XN9.<init>(android.app.Notification, android.content.Context):void");
    }

    public static CharSequence A01(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public static void A02(XN9 xn9, int i, boolean z) {
        Notification notification = xn9.A0A;
        int i2 = notification.flags;
        int i3 = i | i2;
        if (!z) {
            i3 = (i ^ (-1)) & i2;
        }
        notification.flags = i3;
    }

    public final Notification A03() {
        Bundle bundle;
        XNA xna = new XNA(this);
        XN9 xn9 = xna.A06;
        AbstractC72869Xpo abstractC72869Xpo = xn9.A0K;
        if (abstractC72869Xpo != null) {
            abstractC72869Xpo.A05(xna);
        }
        Notification build = xna.A04.build();
        RemoteViews remoteViews = xn9.A0H;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        if (abstractC72869Xpo != null && (bundle = build.extras) != null) {
            abstractC72869Xpo.A03(bundle);
        }
        return build;
    }

    public final void A04(int i) {
        this.A0A.icon = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r6 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(int r4, int r5, int r6) {
        /*
            r3 = this;
            android.app.Notification r2 = r3.A0A
            r2.ledARGB = r4
            r2.ledOnMS = r5
            r2.ledOffMS = r6
            if (r5 == 0) goto Ld
            r1 = 1
            if (r6 != 0) goto Le
        Ld:
            r1 = 0
        Le:
            int r0 = r2.flags
            r0 = r0 & (-2)
            r1 = r1 | r0
            r2.flags = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XN9.A05(int, int, int):void");
    }

    public final void A06(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        this.A0Y.add(new Y0K(pendingIntent, charSequence, i));
    }

    public final void A07(Bitmap bitmap) {
        IconCompat A02;
        if (bitmap == null) {
            A02 = null;
        } else {
            A02 = IconCompat.A02(bitmap);
        }
        this.A0M = A02;
    }

    public final void A08(android.net.Uri uri) {
        Notification notification = this.A0A;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void A09(android.net.Uri uri, int i) {
        Notification notification = this.A0A;
        notification.sound = uri;
        notification.audioStreamType = i;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
    }

    public final void A0A(AbstractC72869Xpo abstractC72869Xpo) {
        if (this.A0K != abstractC72869Xpo) {
            this.A0K = abstractC72869Xpo;
            if (abstractC72869Xpo != null) {
                abstractC72869Xpo.A02(this);
            }
        }
    }

    public final void A0D(CharSequence charSequence) {
        this.A0A.tickerText = A01(charSequence);
    }

    public final void A0E(boolean z) {
        A02(this, 16, z);
    }

    public final void A0B(CharSequence charSequence) {
        this.A0O = A01(charSequence);
    }

    public final void A0C(CharSequence charSequence) {
        this.A0P = A01(charSequence);
    }

    public XN9(Context context, String str) {
        this.A0Y = AbstractC166987dD.A1E();
        this.A0b = AbstractC166987dD.A1E();
        this.A0Z = AbstractC166987dD.A1E();
        this.A0i = true;
        this.A0g = false;
        this.A01 = 0;
        this.A08 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A02 = 0;
        Notification notification = new Notification();
        this.A0A = notification;
        this.A0E = context;
        this.A0U = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.A05 = 0;
        this.A0a = AbstractC166987dD.A1E();
        this.A0c = true;
    }
}
