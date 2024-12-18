package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.TuR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65808TuR implements InterfaceC77833eB {
    public final U47 A00;
    public final U4E A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.4yw, X.4yt, X.4yu] */
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        C1I3 c1i3;
        RecyclerView recyclerView = (RecyclerView) obj;
        U4E u4e = this.A01;
        U47 u47 = this.A00;
        if (u47.A00 == 1) {
            c1i3 = u47.A01.A02.AgS().Br2();
        } else {
            c1i3 = null;
        }
        u4e.A08 = c1i3;
        u4e.A07 = recyclerView;
        recyclerView.A14(u4e.A06);
        int i = u4e.A00;
        if (i != -1) {
            if (u4e.A0A) {
                if (!u4e.A09.equals("")) {
                    ?? c110814yt = new C110814yt(context);
                    c110814yt.A00 = 0;
                    c110814yt.A03 = true;
                    c110814yt.A01 = 0;
                    c110814yt.A0E(u4e.A09);
                    c110814yt.A00 = u4e.A03;
                    c110814yt.A03 = u4e.A0C;
                    c110814yt.A00 = u4e.A00;
                    AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                    if (abstractC70663Fe != 0) {
                        abstractC70663Fe.A10(c110814yt);
                    }
                } else {
                    recyclerView.A0o(i);
                }
            } else {
                recyclerView.A0n(i);
            }
            u4e.A00 = -1;
            u4e.A0A = false;
            u4e.A09 = "";
            u4e.A03 = 0;
            u4e.A0C = true;
        }
        int i2 = u4e.A01;
        if (i2 != -1 || u4e.A02 != -1) {
            boolean z = u4e.A0B;
            int i3 = u4e.A02;
            if (z) {
                recyclerView.A0t(i2, i3);
            } else {
                recyclerView.scrollBy(i2, i3);
            }
            u4e.A01 = -1;
            u4e.A02 = -1;
            u4e.A0B = false;
        }
        C1I3 c1i32 = u4e.A08;
        if (c1i32 != null) {
            recyclerView.A14(c1i32);
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        U4E u4e = this.A01;
        RecyclerView recyclerView2 = u4e.A07;
        if (recyclerView2 != null) {
            recyclerView2.setImportantForAutofill(0);
        }
        u4e.A07 = null;
        recyclerView.A15(u4e.A06);
        C1I3 c1i3 = u4e.A08;
        if (c1i3 != null) {
            recyclerView.A15(c1i3);
        }
        u4e.A08 = null;
    }

    public C65808TuR(U47 u47, U4E u4e) {
        this.A01 = u4e;
        this.A00 = u47;
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
