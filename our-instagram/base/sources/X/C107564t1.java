package X;

import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.4t1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107564t1 extends AbstractC107574t2 {
    public final C51282Xb A00 = new C51282Xb();
    public final InterfaceC79483gv A01;

    public static void A01(C107564t1 c107564t1, float f) {
        Object obj;
        C51282Xb c51282Xb = c107564t1.A00;
        short s = c51282Xb.A00;
        for (int i = 0; i < s; i++) {
            Reference reference = (Reference) c51282Xb.A01[c51282Xb.A01(i)];
            if (reference != null && (obj = reference.get()) != null) {
                if ((obj instanceof Drawable) && ((Drawable) obj).getCallback() == null) {
                    reference.clear();
                } else {
                    c107564t1.A01.EOy(obj, f);
                }
            }
        }
    }

    public static void A00(C51282Xb c51282Xb, C107564t1 c107564t1) {
        C51282Xb c51282Xb2 = c107564t1.A00;
        int i = 0;
        while (true) {
            Object[] objArr = c51282Xb2.A01;
            if (i >= 5) {
                break;
            }
            objArr[i] = null;
            i++;
        }
        c51282Xb2.A00 = (short) 0;
        if (c51282Xb != null) {
            short s = c51282Xb.A00;
            for (int i2 = 0; i2 < s; i2++) {
                c51282Xb2.A03(c51282Xb.A01(i2), new WeakReference(c51282Xb.A01[c51282Xb.A01(i2)]));
            }
        }
    }

    public final void A04(float f) {
        super.A00 = f;
        A01(this, f);
    }

    public C107564t1(C51282Xb c51282Xb, InterfaceC79483gv interfaceC79483gv) {
        A00(c51282Xb, this);
        this.A01 = interfaceC79483gv;
    }
}
