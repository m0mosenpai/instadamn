package X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18960wc implements InterfaceC12070kB {
    public static C18960wc A03;
    public final C0ZS A00;
    public final C0eG A01;
    public final C0Q2 A02;

    @Override // X.InterfaceC12070kB
    public final C19010wh Bd8() {
        return null;
    }

    @Override // X.InterfaceC12070kB
    public final InterfaceC07320a6 AqE() {
        return this.A02;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Q2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.0R9] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.0kD] */
    public C18960wc(Context context, ExecutorC19230x5 executorC19230x5) {
        C109574wj c109574wj = new C109574wj(context.getAssets());
        Object obj = new Object();
        C0w9 c0w9 = C0w9.A01;
        final ?? obj2 = new Object();
        C0R1 c0r1 = new C0R1(context, 1);
        C19000wg c19000wg = new InterfaceC08830cm() { // from class: X.0wg
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return new C11A();
            }
        };
        C18990wf c18990wf = new InterfaceC08830cm() { // from class: X.0wf
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return new Object();
            }
        };
        C18980we c18980we = new InterfaceC08830cm() { // from class: X.0we
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return new C10p();
            }
        };
        C0R1 c0r12 = new C0R1(c0w9, 2);
        C0R1 c0r13 = new C0R1(obj, 3);
        C0eG c0eG = new C0eG(AwakeTimeSinceBootClock.INSTANCE, c109574wj, new Object(), executorC19230x5, obj2, new Random(), c0r1, c19000wg, c18990wf, c18980we, c0r12, c0r13);
        this.A01 = c0eG;
        final C08400c3 A01 = c0eG.A01();
        C14360o3.A07(A01);
        this.A02 = new InterfaceC07320a6(A01, obj2) { // from class: X.0Q2
            public final C08400c3 A00;
            public final C12090kD A01;
            public final HashMap A03 = new HashMap();
            public final HashMap A02 = new HashMap();

            @Override // X.InterfaceC07320a6
            public final synchronized void AHr(int i) {
                this.A02.remove(Integer.valueOf(i));
            }

            @Override // X.InterfaceC07320a6
            public final synchronized void AHu(int i) {
                this.A03.remove(Integer.valueOf(i));
            }

            @Override // X.C0XM
            public final long BqB(int i) {
                synchronized (this) {
                    Integer num = (Integer) this.A02.get(Integer.valueOf(i));
                    if (num == null && (num = (Integer) this.A03.get(Integer.valueOf((short) (i >> 16)))) == null) {
                        return this.A00.BqB(i);
                    }
                    return AbstractC06750Xr.A00(num.intValue(), 4, 1);
                }
            }

            @Override // X.InterfaceC07320a6
            public final synchronized void E38(int i, int i2) {
                this.A02.put(Integer.valueOf(i), 1);
            }

            @Override // X.InterfaceC07320a6
            public final synchronized void E39(int i, int i2) {
                this.A03.put(Integer.valueOf(i), 1);
            }

            @Override // X.C0XM
            public final int EKK(int i, String str) {
                C14360o3.A0B(str, 1);
                return this.A00.EKK(i, str);
            }

            @Override // X.C0XM
            public final C0XN AsU() {
                return this.A00.AsU();
            }

            @Override // X.C0XM
            public final long BTS(int i) {
                return this.A00.BTS(i);
            }

            @Override // X.C0XM
            public final boolean CY1(int i) {
                return this.A00.CY1(i);
            }

            @Override // X.C0XM
            public final int E7i(int i) {
                return this.A00.E7i(i);
            }

            @Override // X.InterfaceC07320a6
            public final void Egb(String str) {
                this.A01.A00 = str;
                C08400c3 c08400c3 = this.A00;
                AtomicReference atomicReference = c08400c3.A01;
                if (str == null) {
                    atomicReference.set(null);
                    c08400c3.A02.get();
                } else {
                    atomicReference.set(null);
                    c08400c3.A00.execute(new C0ZM(c08400c3));
                }
            }

            {
                this.A00 = A01;
                this.A01 = obj2;
            }
        };
        this.A00 = c0eG.A00;
    }
}
