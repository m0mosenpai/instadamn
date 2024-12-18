package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4RW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RW implements C4RS {
    public final CopyOnWriteArraySet A00;
    public final Handler A01;

    @Override // X.C4RS
    public final void D9S(final long j, final String str, final boolean z) {
        this.A01.post(new Runnable() { // from class: X.4bo
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).D9S(j, str, z);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void Cy0(final C98704bq c98704bq) {
        this.A01.post(new Runnable() { // from class: X.Tsv
            @Override // java.lang.Runnable
            public final void run() {
                C4RW c4rw = C4RW.this;
                C98704bq c98704bq2 = c98704bq;
                Iterator it = c4rw.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).Cy0(c98704bq2);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void D5g(final String str, final boolean z) {
        this.A01.post(new Runnable() { // from class: X.4ba
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).D5g(str, z);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void D9T(final int i, final int i2, final int i3, final int i4) {
        this.A01.post(new Runnable() { // from class: X.5ij
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).D9T(i, i2, i3, i4);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void DBq(final C98704bq c98704bq, final String str, final List list, final long j, final boolean z) {
        this.A01.post(new Runnable() { // from class: X.4bs
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    C4RS c4rs = (C4RS) it.next();
                    C98704bq c98704bq2 = c98704bq;
                    long j2 = j;
                    String str2 = str;
                    List list2 = list;
                    if (list2 == null) {
                        list2 = new ArrayList();
                    }
                    c4rs.DBq(c98704bq2, str2, list2, j2, z);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void DER(C117275Sm c117275Sm, String str, String str2, String str3, long j) {
        this.A01.post(new RunnableC71619WxR(this, c117275Sm, str, str2, str3, j));
    }

    @Override // X.C4RS
    public final void DIJ(String str, long j) {
        this.A01.post(new RunnableC71546Wvv(this, str, j));
    }

    @Override // X.C4RS
    public final void DLl(String str, byte[] bArr, long j) {
        this.A01.post(new RunnableC71592Wwo(this, str, bArr, j));
    }

    @Override // X.C4RS
    public final void DPI(boolean z) {
        this.A01.post(new RunnableC71430Wts(this, z));
    }

    @Override // X.C4RS
    public final void DPK(String str, byte[] bArr, long j, long j2) {
        this.A01.post(new RunnableC71607WxD(this, str, bArr, j, j2));
    }

    @Override // X.C4RS
    public final void DPS(C68692VaS c68692VaS) {
        this.A01.post(new RunnableC71432Wtu(this, c68692VaS));
    }

    @Override // X.C4RS
    public final void DTa(Object obj) {
        this.A01.post(new RunnableC71431Wtt(this, obj));
    }

    @Override // X.C4RS
    public final void DVN(byte[] bArr, long j) {
        this.A01.post(new RunnableC71545Wvu(this, bArr, j));
    }

    @Override // X.C4RS
    public final void DY8(final String str, final String str2) {
        this.A01.post(new Runnable() { // from class: X.4TI
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).DY8(str, str2);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void DZ0() {
        this.A01.post(new Runnable() { // from class: X.5jY
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).DZ0();
                }
            }
        });
    }

    @Override // X.C4RS
    public final void DZ1(C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
        this.A01.post(new RunnableC71618WxQ(this, c5n5, c117275Sm, c4rv, c4ru, str));
    }

    @Override // X.C4RS
    public final void DZ6(final EnumC46692Ch enumC46692Ch) {
        this.A01.post(new Runnable() { // from class: X.Wtn
            @Override // java.lang.Runnable
            public final void run() {
                C4RW c4rw = C4RW.this;
                EnumC46692Ch enumC46692Ch2 = enumC46692Ch;
                Iterator it = c4rw.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).DZ6(enumC46692Ch2);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void DZA(C4RU c4ru, float f, long j) {
        this.A01.post(new RunnableC71591Wwn(this, c4ru, f, j));
    }

    @Override // X.C4RS
    public final void DaU(final long j, final String str) {
        this.A01.post(new Runnable() { // from class: X.4Z3
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).DaU(j, str);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void DaY() {
        this.A01.post(new Runnable() { // from class: X.4Sl
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).DaY();
                }
            }
        });
    }

    @Override // X.C4RS
    public final void Dny(final C4RV c4rv, final C4RU c4ru, final String str, final long j, final boolean z, final boolean z2) {
        this.A01.post(new Runnable() { // from class: X.4Ys
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    C4RS c4rs = (C4RS) it.next();
                    C4RU c4ru2 = c4ru;
                    C4RV c4rv2 = c4rv;
                    boolean z3 = z;
                    boolean z4 = z2;
                    c4rs.Dny(c4rv2, c4ru2, str, j, z3, z4);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void Dou(final long j, final long j2, final boolean z, final boolean z2, final boolean z3) {
        this.A01.post(new Runnable() { // from class: X.4Z4
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).Dou(j, j2, z, z2, z3);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void Dp7(final C5n5 c5n5) {
        this.A01.post(new Runnable() { // from class: X.Wto
            @Override // java.lang.Runnable
            public final void run() {
                C4RW c4rw = C4RW.this;
                C5n5 c5n52 = c5n5;
                Iterator it = c4rw.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).Dp7(c5n52);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void DpT(boolean z) {
        this.A01.post(new RunnableC71429Wtr(this, z));
    }

    @Override // X.C4RS
    public final void DtM(List list) {
        this.A01.post(new RunnableC71428Wtq(this, list));
    }

    @Override // X.C4RS
    public final void Duk(C117275Sm c117275Sm, C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, List list, long j) {
        this.A01.post(new RunnableC71634Wxg(this, c117275Sm, c98704bq, c98704bq2, str, str2, list, j));
    }

    @Override // X.C4RS
    public final void Dyn(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01.post(new RunnableC65793TuB(this, c4rv, c4ru, str, str2, str3, str4, j, z));
    }

    @Override // X.C4RS
    public final void Dyu(final C5n5 c5n5, final C4RV c4rv, final C4RU c4ru, final Integer num, final String str, final String str2, final String str3, final boolean z, final boolean z2) {
        this.A01.post(new Runnable() { // from class: X.5n7
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    C4RS c4rs = (C4RS) it.next();
                    C4RU c4ru2 = c4ru;
                    String str4 = str;
                    String str5 = str2;
                    C4RV c4rv2 = c4rv;
                    c4rs.Dyu(c5n5, c4rv2, c4ru2, num, str4, str5, str3, z, z2);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void DzE(final C5n5 c5n5, final C4RV c4rv, final C4RU c4ru, final Integer num, final String str, final String str2, final String str3, final String str4, final String str5, final long j, final long j2, final boolean z) {
        this.A01.post(new Runnable() { // from class: X.5th
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    C4RS c4rs = (C4RS) it.next();
                    C4RU c4ru2 = c4ru;
                    String str6 = str;
                    String str7 = str2;
                    C4RV c4rv2 = c4rv;
                    C5n5 c5n52 = c5n5;
                    long j3 = j;
                    Integer num2 = num;
                    long j4 = j2;
                    c4rs.DzE(c5n52, c4rv2, c4ru2, num2, str6, str7, str3, str4, str5, j3, j4, z);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void Dzn() {
        this.A01.post(new Runnable() { // from class: X.4TK
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).Dzn();
                }
            }
        });
    }

    @Override // X.C4RS
    public final void Dzs() {
        this.A01.post(new RunnableC71264Wqt(this));
    }

    @Override // X.C4RS
    public final void Dzu(final int i, final int i2, final float f) {
        this.A01.post(new Runnable() { // from class: X.4c1
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).Dzu(i, i2, f);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void E08(final C4RV c4rv, final C4RU c4ru, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final long j, final boolean z, final boolean z2) {
        this.A01.post(new Runnable() { // from class: X.4Z5
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    C4RS c4rs = (C4RS) it.next();
                    C4RU c4ru2 = c4ru;
                    String str8 = str;
                    String str9 = str2;
                    C4RV c4rv2 = c4rv;
                    boolean z3 = z;
                    boolean z4 = z2;
                    c4rs.E08(c4rv2, c4ru2, str8, str9, str3, str4, str5, str6, str7, j, z3, z4);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void E1K(final boolean z, final boolean z2) {
        this.A01.post(new Runnable() { // from class: X.4Z2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).E1K(z, z2);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void E1j(C117275Sm c117275Sm) {
        this.A01.post(new RunnableC71427Wtp(this, c117275Sm));
    }

    @Override // X.C4RS
    public final void onCues(final List list) {
        this.A01.post(new Runnable() { // from class: X.5ox
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).onCues(list);
                }
            }
        });
    }

    @Override // X.C4RS
    public final void onDrawnToSurface() {
        this.A01.post(new Runnable() { // from class: X.4c3
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C4RW.this.A00.iterator();
                while (it.hasNext()) {
                    ((C4RS) it.next()).onDrawnToSurface();
                }
            }
        });
    }

    @Override // X.C4RS
    public final void onSeeking(long j) {
        this.A01.post(new RunnableC65862TvP(this, j));
    }

    public C4RW(Handler handler, C4RS c4rs) {
        this.A01 = handler;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A00 = copyOnWriteArraySet;
        copyOnWriteArraySet.add(c4rs);
    }
}
