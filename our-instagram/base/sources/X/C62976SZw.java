package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.SZw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62976SZw {
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public QBX A04;
    public QBY A05;
    public QBY A06;
    public QBY A07;
    public boolean A08;
    public boolean A09;
    public InterfaceC65632Tpt A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Sv5 A0D;
    public final SZL A0E;
    public final InterfaceC65571Tn4 A0F;
    public final List A0G;

    public final void A02(QBY qby) {
        int i;
        this.A0B = false;
        if (this.A08) {
            AbstractC58318PtA.A1F(this.A0C, qby, 2);
            return;
        }
        if (!this.A09) {
            this.A07 = qby;
            return;
        }
        if (qby.A00 != null) {
            Bitmap bitmap = this.A03;
            if (bitmap != null) {
                this.A0F.E6v(bitmap);
                this.A03 = null;
            }
            QBY qby2 = this.A05;
            this.A05 = qby;
            List list = this.A0G;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Q2P q2p = (Q2P) ((InterfaceC65195Tfd) list.get(size));
                Object callback = q2p.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    q2p.stop();
                    q2p.invalidateSelf();
                } else {
                    q2p.invalidateSelf();
                    QBY qby3 = q2p.A09.A00.A05;
                    if (qby3 != null) {
                        i = qby3.A01;
                    } else {
                        i = -1;
                    }
                    if (i == r7.A0E.A07.A02 - 1) {
                        q2p.A00++;
                    }
                    int i2 = q2p.A01;
                    if (i2 != -1 && q2p.A00 >= i2) {
                        q2p.stop();
                    }
                }
            }
            if (qby2 != null) {
                AbstractC58318PtA.A1F(this.A0C, qby2, 2);
            }
        }
        A00(this);
    }

    public C62976SZw(Bitmap bitmap, ComponentCallbacks2C63416Sju componentCallbacks2C63416Sju, SZL szl, InterfaceC65632Tpt interfaceC65632Tpt, int i, int i2) {
        InterfaceC65571Tn4 interfaceC65571Tn4 = componentCallbacks2C63416Sju.A01;
        Q20 q20 = componentCallbacks2C63416Sju.A00;
        Sv5 A01 = ComponentCallbacks2C63416Sju.A01(q20.getBaseContext());
        Sv5 A012 = ComponentCallbacks2C63416Sju.A01(q20.getBaseContext());
        QBX A0I = new QBX(A012.A01, A012.A02, A012, Bitmap.class).A0I(Sv5.A0A).A0I(new TIW().A0E(S9K.A02).A04().A03().A05(i, i2));
        this.A0G = AbstractC166987dD.A1E();
        this.A0D = A01;
        Handler handler = new Handler(Looper.getMainLooper(), new C63457Skc(this));
        this.A0F = interfaceC65571Tn4;
        this.A0C = handler;
        this.A04 = A0I;
        this.A0E = szl;
        A01(bitmap, interfaceC65632Tpt);
    }

    public static void A00(C62976SZw c62976SZw) {
        int i;
        int i2;
        if (c62976SZw.A09 && !c62976SZw.A0B) {
            QBY qby = c62976SZw.A07;
            if (qby != null) {
                c62976SZw.A07 = null;
                c62976SZw.A02(qby);
                return;
            }
            c62976SZw.A0B = true;
            SZL szl = c62976SZw.A0E;
            SJM sjm = szl.A07;
            int i3 = sjm.A02;
            if (i3 > 0 && (i2 = szl.A02) >= 0) {
                if (i2 < i3) {
                    i = ((SJL) sjm.A0A.get(i2)).A01;
                } else {
                    i = -1;
                }
            } else {
                i = 0;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i;
            int i4 = (szl.A02 + 1) % szl.A07.A02;
            szl.A02 = i4;
            c62976SZw.A06 = new QBY(c62976SZw.A0C, i4, uptimeMillis);
            QBX A00 = QBX.A00(c62976SZw.A04.A0I(new TIW().A08(new C63726Ssg(Double.valueOf(Math.random())))), szl);
            QBX.A02(A00, A00, c62976SZw.A06, S8T.A01);
        }
    }

    public final void A01(Bitmap bitmap, InterfaceC65632Tpt interfaceC65632Tpt) {
        Rs8.A00(interfaceC65632Tpt);
        this.A0A = interfaceC65632Tpt;
        Rs8.A00(bitmap);
        this.A03 = bitmap;
        this.A04 = this.A04.A0I(new TIW().A0D(interfaceC65632Tpt, true));
        this.A00 = C63375Sim.A01(bitmap);
        this.A02 = bitmap.getWidth();
        this.A01 = bitmap.getHeight();
    }
}
