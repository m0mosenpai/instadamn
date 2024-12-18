package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.Cba, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28187Cba {
    public static final C27716CKj A08 = new Object();
    public final C27904CRp A00;
    public final InterfaceC58009Pnt A01;
    public final Object A02;
    public final String A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final InterfaceC09390do A06;
    public final InterfaceC16610sE A07;

    public /* synthetic */ C28187Cba(View view, C07X c07x, C27904CRp c27904CRp, InterfaceC58009Pnt interfaceC58009Pnt, Object obj, String str) {
        WeakReference weakReference;
        C29642D5f c29642D5f = new C29642D5f(A08, 7);
        this.A03 = str;
        this.A02 = obj;
        this.A01 = interfaceC58009Pnt;
        this.A00 = c27904CRp;
        this.A07 = c29642D5f;
        this.A05 = AbstractC25225BEi.A16(view);
        if (c07x != null) {
            weakReference = AbstractC25225BEi.A16(c07x);
        } else {
            weakReference = null;
        }
        this.A04 = weakReference;
        this.A06 = AbstractC09440dt.A01(C29892DGg.A00(this, 26));
    }
}
