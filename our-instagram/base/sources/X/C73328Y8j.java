package X;

import android.content.Context;
import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Y8j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73328Y8j implements YM6, YMU {
    public static C73328Y8j A0C;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final C72666Xkh A08 = new C72666Xkh();
    public final Y0G A09 = new Y0G();
    public final YQ7 A0A;
    public final ImmutableMap A0B;
    public static final ImmutableList A0I = ImmutableList.of((Object) 4300000L, (Object) 3200000L, (Object) 2400000L, (Object) 1700000L, (Object) 860000L);
    public static final ImmutableList A0D = ImmutableList.of((Object) 1500000L, (Object) 980000L, (Object) 750000L, (Object) 520000L, (Object) 290000L);
    public static final ImmutableList A0E = ImmutableList.of((Object) 2000000L, (Object) 1300000L, (Object) 1000000L, (Object) 860000L, (Object) 610000L);
    public static final ImmutableList A0F = ImmutableList.of((Object) 2500000L, (Object) 1700000L, (Object) 1200000L, (Object) 970000L, (Object) 680000L);
    public static final ImmutableList A0G = ImmutableList.of((Object) 4700000L, (Object) 2800000L, (Object) 2100000L, (Object) 1700000L, (Object) 980000L);
    public static final ImmutableList A0H = ImmutableList.of((Object) 2700000L, (Object) 2000000L, (Object) 1600000L, (Object) 1300000L, (Object) 1000000L);

    public static long A00(C73328Y8j c73328Y8j, int i) {
        ImmutableMap immutableMap = c73328Y8j.A0B;
        Number number = (Number) immutableMap.get(Integer.valueOf(i));
        if (number == null && (number = (Number) immutableMap.get(0)) == null) {
            number = 1000000L;
        }
        return number.longValue();
    }

    public static void A01(C73328Y8j c73328Y8j, final int i, final long j, final long j2) {
        if (i == 0 && j == 0 && j2 == c73328Y8j.A07) {
            return;
        }
        c73328Y8j.A07 = j2;
        Iterator it = c73328Y8j.A08.A00.iterator();
        while (it.hasNext()) {
            final C72744XmK c72744XmK = (C72744XmK) it.next();
            if (!c72744XmK.A00) {
                c72744XmK.A01.post(new Runnable() { // from class: X.YIW
                    @Override // java.lang.Runnable
                    public final void run() {
                        C72851Xp7 c72851Xp7;
                        C72744XmK c72744XmK2 = C72744XmK.this;
                        final int i2 = i;
                        final long j3 = j;
                        final long j4 = j2;
                        C73336Y8r c73336Y8r = (C73336Y8r) c72744XmK2.A02;
                        ImmutableList immutableList = c73336Y8r.A06.A01;
                        if (immutableList.isEmpty()) {
                            c72851Xp7 = null;
                        } else {
                            c72851Xp7 = (C72851Xp7) SSP.A00(immutableList);
                        }
                        final C72855XpB A01 = C73336Y8r.A01(c73336Y8r, c72851Xp7);
                        c73336Y8r.A02(new YNF() { // from class: X.Y8c
                            @Override // X.YNF
                            public final void CP5(Object obj) {
                            }
                        }, A01, 1006);
                    }
                });
            }
        }
    }

    public C73328Y8j(Context context, YQ7 yq7, Map map) {
        this.A0B = ImmutableMap.copyOf(map);
        this.A0A = yq7;
        if (context != null) {
            final C63176Seb A00 = C63176Seb.A00(context);
            int A02 = A00.A02();
            this.A00 = A02;
            this.A02 = A00(this, A02);
            final YNH ynh = new YNH() { // from class: X.Y8h
                @Override // X.YNH
                public final void DVM(int i) {
                    int i2;
                    C73328Y8j c73328Y8j = C73328Y8j.this;
                    C73328Y8j c73328Y8j2 = C73328Y8j.A0C;
                    synchronized (c73328Y8j) {
                        if (c73328Y8j.A00 != i) {
                            c73328Y8j.A00 = i;
                            if (i != 1 && i != 0 && i != 8) {
                                long A002 = C73328Y8j.A00(c73328Y8j, i);
                                c73328Y8j.A02 = A002;
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (c73328Y8j.A01 > 0) {
                                    i2 = (int) (elapsedRealtime - c73328Y8j.A04);
                                } else {
                                    i2 = 0;
                                }
                                C73328Y8j.A01(c73328Y8j, i2, c73328Y8j.A03, A002);
                                c73328Y8j.A04 = elapsedRealtime;
                                c73328Y8j.A03 = 0L;
                                c73328Y8j.A05 = 0L;
                                c73328Y8j.A06 = 0L;
                                Y0G y0g = c73328Y8j.A09;
                                y0g.A04.clear();
                                y0g.A00 = -1;
                                y0g.A01 = 0;
                                y0g.A03 = 0;
                            }
                        }
                    }
                }
            };
            CopyOnWriteArrayList copyOnWriteArrayList = A00.A02;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                if (reference.get() == null) {
                    copyOnWriteArrayList.remove(reference);
                }
            }
            copyOnWriteArrayList.add(AbstractC25225BEi.A16(ynh));
            A00.A01.post(new Runnable() { // from class: X.YGz
                @Override // java.lang.Runnable
                public final void run() {
                    ynh.DVM(A00.A02());
                }
            });
            return;
        }
        this.A00 = 0;
        this.A02 = A00(this, 0);
    }
}
