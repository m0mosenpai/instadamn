package X;

import android.view.MotionEvent;

/* renamed from: X.Llv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49007Llv implements C7Q6 {
    public final /* synthetic */ InterfaceC165247aD A00;

    public C49007Llv(InterfaceC165247aD interfaceC165247aD) {
        this.A00 = interfaceC165247aD;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.7Zs, X.7aD] */
    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        C45940KUr c45940KUr;
        C45116Jxl c45116Jxl;
        KT6 kt6 = (KT6) obj;
        ?? r4 = this.A00;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) r4, kt6.BSy(), kt6.BCt())) {
            AbstractC46445Kh5 abstractC46445Kh5 = kt6.A02;
            if ((abstractC46445Kh5 instanceof C45940KUr) && (c45116Jxl = (c45940KUr = (C45940KUr) abstractC46445Kh5).A02) != null) {
                String str = c45116Jxl.A00;
                if (str != null && c45940KUr.A05) {
                    r4.CrA(c45116Jxl.A02, str);
                    return true;
                }
                r4.CrT(c45116Jxl.A02, str, c45116Jxl.A01);
                return true;
            }
            return true;
        }
        return true;
    }
}
