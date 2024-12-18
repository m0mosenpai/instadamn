package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class JT6 extends C2US {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC62602sz A03;
    public final C65842yM A04;
    public final ArrayList A05 = AbstractC166987dD.A1E();
    public final KEW A06;
    public final boolean A07;

    public JT6(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C8NZ c8nz, InterfaceC62602sz interfaceC62602sz, boolean z) {
        this.A03 = interfaceC62602sz;
        this.A07 = z;
        C65842yM c65842yM = new C65842yM(context, R.layout.layout_empty_sticker_load_more_view);
        this.A04 = c65842yM;
        KEW kew = new KEW(context, interfaceC11380iw, userSession, null, c8nz, "", true, true);
        this.A06 = kew;
        this.A01 = true;
        init(kew, c65842yM);
        addModel(this.A03, null, this.A04);
    }

    public static final void A00(JT6 jt6, ArrayList arrayList) {
        int i = 3;
        if (jt6.A07) {
            i = 2;
        }
        C17v A0B = C17s.A0B(C17s.A0C(0, arrayList.size()), i);
        int i2 = A0B.A00;
        int i3 = A0B.A01;
        int i4 = A0B.A02;
        if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
            while (true) {
                jt6.addModel(new C47537Kz4(new C153126ug(arrayList, i2, i), i), null, jt6.A06);
                if (i2 == i3) {
                    break;
                } else {
                    i2 += i4;
                }
            }
        }
        jt6.notifyDataSetChangedSmart();
    }

    public final void A01(List list) {
        ArrayList arrayList = this.A05;
        arrayList.addAll(list);
        clear();
        A00(this, arrayList);
        if (this.A01) {
            addModel(this.A03, null, this.A04);
        }
    }
}
