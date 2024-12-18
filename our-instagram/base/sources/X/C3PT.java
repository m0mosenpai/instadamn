package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.3PT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PT implements C1NJ {
    public static final java.util.Set A08 = new HashSet();
    public int A00;
    public Paint A01;
    public InterfaceC59502nt A02;
    public ImageUrl A03;
    public volatile Bitmap A06;
    public volatile boolean A07;
    public final Queue A05 = new ConcurrentLinkedQueue();
    public List A04 = new ArrayList();

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        this.A07 = false;
        java.util.Set set = A08;
        synchronized (set) {
            this.A05.clear();
            set.remove(this);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public static void A00(C3PT c3pt) {
        InterfaceC59502nt interfaceC59502nt;
        List list = c3pt.A04;
        if (list != null && list.isEmpty() && c3pt.A05.isEmpty() && (interfaceC59502nt = c3pt.A02) != null) {
            interfaceC59502nt.AGO();
            c3pt.A07 = false;
        }
    }

    public static void A01(C3PT c3pt) {
        java.util.Set set = A08;
        synchronized (set) {
            if (c3pt.A05.isEmpty()) {
                set.remove(c3pt);
            }
        }
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        List list = this.A04;
        this.A04 = null;
        this.A06 = c73033Pe.A01;
        while (true) {
            C3Se c3Se = (C3Se) this.A05.poll();
            if (c3Se == null) {
                break;
            } else {
                c3Se.CzZ(this.A06);
            }
        }
        A01(this);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Drawable drawable = (Drawable) ((Reference) list.get(i)).get();
            if (drawable != null) {
                drawable.invalidateSelf();
            }
        }
        list.clear();
        this.A04 = list;
    }

    public C3PT(Paint paint) {
        this.A01 = paint;
    }
}
