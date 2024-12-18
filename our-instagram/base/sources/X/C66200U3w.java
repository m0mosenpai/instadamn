package X;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.R;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.U3w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66200U3w implements InterfaceC192128fD {
    public final Context A02;
    public final SparseArray A03;
    public final InterfaceC62872tQ A05;
    public final AbstractC192138fE A06;
    public final Map A07;
    public final Map A08;
    public final U41 A04 = new U41(Looper.getMainLooper(), new U42(this));
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final AtomicReference A0B = new AtomicReference();
    public C6T7 A01 = null;
    public volatile boolean A0C = false;
    public C126545np A00 = null;
    public final java.util.Set A09 = new HashSet();

    public static void A00(C66200U3w c66200U3w, int i) {
        InterfaceC72763Nx interfaceC72763Nx = (InterfaceC72763Nx) c66200U3w.A0B.get();
        if (interfaceC72763Nx != null) {
            C1LN.A01(AnonymousClass001.A0O("BloksSurface_notify_on_render_surface_", i));
            try {
                interfaceC72763Nx.DfM(i);
            } finally {
                C1LN.A00();
            }
        }
    }

    public static void A01(final C66200U3w c66200U3w, C193038gj c193038gj, int i, final int i2) {
        A00(c66200U3w, 10);
        Runnable runnable = new Runnable() { // from class: X.U3y
            @Override // java.lang.Runnable
            public final void run() {
                C66200U3w c66200U3w2 = C66200U3w.this;
                int i3 = i2;
                if (i3 != -1) {
                    C66200U3w.A00(c66200U3w2, i3);
                }
            }
        };
        C1LN.A01("BloksSurface_create_bloks_hosting_component");
        try {
            Map map = c66200U3w.A08;
            map.putAll(c193038gj.A03);
            C6T8 A00 = C6T7.A00(c66200U3w.A02, c193038gj.A00, c66200U3w.A05);
            A00.A01 = map;
            A00.A02 = c66200U3w.A07;
            SparseArray clone = c66200U3w.A03.clone();
            clone.put(R.id.bloks_surface_on_data_rendered_runnable, runnable);
            A00.A00 = clone;
            C6T7 A002 = A00.A00();
            C1LN.A00();
            C66203U3z c66203U3z = new C66203U3z(A002, i);
            U41 u41 = c66200U3w.A04;
            u41.A00(u41.obtainMessage(1, c66203U3z));
        } catch (Throwable th) {
            C1LN.A00();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r3 == 2) goto L16;
     */
    @Override // X.InterfaceC192128fD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dgh(X.AbstractC192138fE r7) {
        /*
            r6 = this;
            X.8gi r0 = r7.A00
            int r3 = r0.A00
            r2 = 4
            if (r3 == r2) goto L3a
            r0 = 5
            if (r3 == r0) goto L3a
            r1 = 3
            r5 = 1
            r0 = 0
            if (r3 != r1) goto L11
            r0 = 1
            r2 = 5
        L11:
            A00(r6, r2)
            if (r0 != 0) goto L3a
            r0 = 6
            A00(r6, r0)
            if (r3 == 0) goto L22
            if (r3 == r5) goto L22
            r0 = 2
            r1 = -1
            if (r3 != r0) goto L24
        L22:
            r1 = 9
        L24:
            boolean r0 = r7 instanceof X.C193038gj
            r4 = 7
            if (r0 == 0) goto L3b
            X.8gj r7 = (X.C193038gj) r7
            boolean r0 = r6.A0C
            r3 = 13
            r2 = 12
            if (r0 == 0) goto L4f
            java.util.List r1 = r7.A02
            java.util.Map r0 = r7.A03
            r6.A02(r1, r0, r2, r3)
        L3a:
            return
        L3b:
            boolean r0 = r7 instanceof X.C215549gU
            if (r0 == 0) goto L3a
            X.9gU r7 = (X.C215549gU) r7
            X.U5q r0 = r7.A00
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.util.Map r1 = r7.A01
            r0 = 11
            r6.A02(r2, r1, r0, r4)
            return
        L4f:
            A01(r6, r7, r4, r1)
            java.util.List r1 = r7.A02
            java.util.Map r0 = r7.A03
            r6.A02(r1, r0, r2, r3)
            r6.A0C = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66200U3w.Dgh(X.8fE):void");
    }

    public C66200U3w(Context context, SparseArray sparseArray, C1338462s c1338462s, InterfaceC62872tQ interfaceC62872tQ, Map map, Map map2) {
        this.A05 = interfaceC62872tQ;
        this.A02 = context;
        this.A03 = sparseArray;
        this.A06 = c1338462s != null ? new C193038gj(c1338462s, C193028gi.A02) : null;
        this.A08 = map;
        this.A07 = map2;
    }

    private void A02(List list, Map map, int i, int i2) {
        if (!list.isEmpty()) {
            A00(this, i);
            U41 u41 = this.A04;
            u41.A00(u41.obtainMessage(2, new UKQ(list, map, i2)));
        }
    }
}
