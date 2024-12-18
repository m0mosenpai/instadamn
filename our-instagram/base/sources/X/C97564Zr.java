package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import java.util.ArrayList;

/* renamed from: X.4Zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97564Zr implements InterfaceC97554Zq {
    public View A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public InterfaceC41201vU A03;
    public C101394gx A04;
    public InterfaceC97544Zo A05;
    public C141596ac A06;
    public String A07;
    public String A08;
    public final InterfaceC56392iX A09;
    public final C97574Zs A0A = new C97574Zs(this);
    public final ArrayList A0B = new ArrayList();

    @Override // X.InterfaceC97554Zq
    public final void EoG(UserSession userSession, Runnable runnable) {
        Integer A04;
        C14360o3.A0B(userSession, 0);
        if (this.A03 != null) {
            int[] A042 = AbstractC140306Wi.A04(userSession, A00(), true);
            ArrayList arrayList = this.A0B;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                L8E l8e = (L8E) AbstractC001800i.A0O(arrayList, i);
                if (l8e != null && (A04 = AbstractC009903n.A04(A042, i)) != null) {
                    l8e.A00(A04.intValue(), runnable);
                }
            }
        }
    }

    public final C101394gx A00() {
        C101394gx c101394gx = this.A04;
        if (c101394gx != null) {
            return c101394gx;
        }
        C14360o3.A0F("pollModel");
        throw C00O.createAndThrow();
    }

    public final void A01() {
        this.A09.setVisibility(8);
    }

    public C97564Zr(InterfaceC56392iX interfaceC56392iX) {
        this.A09 = interfaceC56392iX;
    }
}
