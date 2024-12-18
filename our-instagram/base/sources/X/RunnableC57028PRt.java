package X;

import com.instagram.common.gallery.Medium;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.PRt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57028PRt implements Runnable {
    public final /* synthetic */ C51035Mgj A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public RunnableC57028PRt(C51035Mgj c51035Mgj, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c51035Mgj;
        this.A01 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashMap linkedHashMap;
        List A05;
        C51035Mgj c51035Mgj = this.A00;
        C1817984o c1817984o = c51035Mgj.A01;
        Medium medium = (Medium) AbstractC001800i.A0J(c51035Mgj.A02);
        if (medium != null && (A05 = c1817984o.A05(medium.A0X, medium.A03)) != null) {
            linkedHashMap = C51035Mgj.A01(A05);
        } else {
            linkedHashMap = null;
        }
        this.A01.invoke(linkedHashMap);
    }
}
