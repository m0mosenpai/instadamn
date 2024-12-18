package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Aw2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C211029Uz A01;

    public Aw2(C211029Uz c211029Uz, int i) {
        this.A01 = c211029Uz;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C211029Uz c211029Uz = this.A01;
        int i = this.A00;
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        List unmodifiableList = Collections.unmodifiableList(((C88M) c211029Uz.A07.getValue()).A08);
        C14360o3.A07(unmodifiableList);
        C88X c88x = (C88X) AbstractC001800i.A0O(unmodifiableList, i);
        if (c88x != null) {
            ((ReboundViewPager) c211029Uz.A0A.getValue()).A0K(i);
            InterfaceC16610sE interfaceC16610sE = c211029Uz.A02;
            if (interfaceC16610sE != null) {
                interfaceC16610sE.invoke(c88x.A0G, c88x.getId(), AbstractC166997dE.A0a());
            }
        }
    }
}
