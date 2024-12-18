package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LrA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49316LrA implements InterfaceC37292Gbt {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC50445MOz A02;
    public final DirectShareTarget A03;
    public final String A04;
    public final ArrayList A05;
    public final ArrayList A06;
    public final boolean A07;
    public final InterfaceC11380iw A08;
    public final String A09;

    public C49316LrA(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC50445MOz interfaceC50445MOz, DirectShareTarget directShareTarget, String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = arrayList;
        this.A06 = arrayList2;
        this.A03 = directShareTarget;
        this.A02 = interfaceC50445MOz;
        this.A07 = z;
        this.A04 = str;
        this.A08 = interfaceC11380iw;
        this.A09 = str2;
    }

    @Override // X.InterfaceC57945Pmr
    public final int Bu9() {
        return 3;
    }

    @Override // X.InterfaceC37292Gbt
    public final boolean CLv(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 0);
        return C14360o3.A0K(this.A03, directShareTarget);
    }

    public static final void A00(C49316LrA c49316LrA) {
        Context context = c49316LrA.A00;
        C9GR.A00(context, context.getResources().getString(2131960472), "direct_share_video_failure", 0);
    }

    @Override // X.InterfaceC37292Gbt
    public final List Axe() {
        return AbstractC166987dD.A1J(this.A03);
    }

    @Override // X.InterfaceC37292Gbt
    public final void ENk() {
        ArrayList arrayList = this.A06;
        List list = arrayList;
        if (arrayList == null) {
            list = C16930sl.A00;
        }
        ArrayList arrayList2 = this.A05;
        List list2 = arrayList2;
        if (arrayList2 == null) {
            list2 = C16930sl.A00;
        }
        if (AbstractC001800i.A0S(list2, list).size() > 1) {
            if (MSV.A00(305).equals(this.A09)) {
                UserSession userSession = this.A01;
                if (C18U.A06(C06090Tz.A05, userSession, 36325085337891548L)) {
                    C41761wQ c41761wQ = new C41761wQ(null);
                    DirectShareTarget directShareTarget = this.A03;
                    C3o9 A06 = AbstractC140946Yw.A06(directShareTarget.A01());
                    String A0w = AbstractC43593JPy.A0w();
                    if (AbstractC140946Yw.A08(directShareTarget.A01()) && A06 != null) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        if (arrayList2 != null) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((AbstractC24481Hr) it.next()).A04(new C48528LdR(this, A1E, 0), C6T2.A01);
                            }
                        }
                        if (arrayList != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((AbstractC24481Hr) it2.next()).A04(new C48528LdR(this, A1E, 1), C6T2.A01);
                            }
                        }
                        C7TH A00 = AbstractC46921Kp2.A00(userSession, directShareTarget.A01());
                        boolean z = this.A07;
                        c41761wQ.A02(AbstractC43592JPx.A0R(A00.ENn(null, null, A06, "share_extension", A0w, null, A1E, z)), C49789Lyw.A00);
                        String str = this.A04;
                        if (str != null && str.length() != 0) {
                            JX0.A00(userSession, directShareTarget).EOf(EnumC46200Kcc.A06, directShareTarget, null, str, "share_extension", null, z);
                        }
                        this.A02.DwB();
                    }
                    return;
                }
            }
        }
        int i = 0;
        if (arrayList2 != null) {
            Iterator it3 = arrayList2.iterator();
            int i2 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    break;
                }
                ((AbstractC24481Hr) next).A04(new C48527LdQ(this, i2, 0), C6T2.A01);
                i2 = i3;
            }
        }
        if (arrayList != null) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                int i4 = i + 1;
                if (i >= 0) {
                    ((AbstractC24481Hr) next2).A04(new C48527LdQ(this, i, 1), C6T2.A01);
                    i = i4;
                } else {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
            }
        }
        this.A02.DwB();
    }
}
