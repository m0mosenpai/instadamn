package X;

import android.content.Context;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LPs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48067LPs implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public ViewOnClickListenerC48067LPs(C45077Jx6 c45077Jx6, C44767Jro c44767Jro, int i, int i2) {
        this.A00 = i2;
        if (2 - i2 != 0) {
            this.A03 = c44767Jro;
            this.A02 = c45077Jx6;
        } else {
            this.A02 = c45077Jx6;
            this.A03 = c44767Jro;
        }
        this.A01 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1714415348);
                ((InterfaceC16620sF) this.A03).invoke(this.A02, Integer.valueOf(this.A01));
                i = 1171277827;
                break;
            case 1:
                A05 = C0f9.A05(191510812);
                ((C38N) ((KEG) this.A03).A06.get(this.A01)).DJj(null, (C38321qM) ((C47758L7e) this.A02).A04.get(9), 9);
                i = 240114193;
                break;
            case 2:
                A05 = C0f9.A05(-925344167);
                C45077Jx6 c45077Jx6 = (C45077Jx6) this.A02;
                ACRType aCRType = c45077Jx6.A02;
                ACRType aCRType2 = ACRType.A05;
                C44767Jro c44767Jro = (C44767Jro) this.A03;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                if (aCRType == aCRType2) {
                    C44535Jmf c44535Jmf = c44767Jro.A0E;
                    Context A0L = AbstractC166997dE.A0L(c44767Jro.A04);
                    String str = c45077Jx6.A08;
                    int i3 = this.A01;
                    C14360o3.A0B(str, 1);
                    C44535Jmf.A00(c44535Jmf, i3);
                    UserSession userSession = c44535Jmf.A03;
                    C43901JbB c43901JbB = (C43901JbB) userSession.A01(C43901JbB.class, new C29900DGo(15, A0L.getApplicationContext(), userSession, new Object()));
                    InterfaceC19630xq A0Y = JQ0.A0Y(c43901JbB.A00);
                    java.util.Set stringSet = A0Y.getStringSet("suggestions_hide_prefs_key", AbstractC31171DnF.A0l());
                    if (stringSet != null) {
                        java.util.Set A0j = AbstractC001800i.A0j(stringSet);
                        if (!A0j.contains(str)) {
                            A0j.add(str);
                            AbstractC43594JPz.A1M(A0Y, "suggestions_hide_prefs_key", A0j);
                        }
                        C43902JbC c43902JbC = c43901JbB.A01;
                        Map map = c43902JbC.A05;
                        Iterator A15 = AbstractC166997dE.A15(map);
                        while (A15.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A15);
                            map.put(A1K.getKey(), C43902JbC.A00(c43902JbC, (List) A1K.getValue()));
                        }
                        AbstractC166987dD.A1Z(new MCF(c43902JbC, str, null, 32), AbstractC167017dG.A0w(C12L.A00, -18));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    C44535Jmf c44535Jmf2 = c44767Jro.A0E;
                    String str2 = c45077Jx6.A08;
                    int i4 = this.A01;
                    C14360o3.A0B(str2, 0);
                    C44535Jmf.A00(c44535Jmf2, i4);
                    C25621Ms A0M = AbstractC31177DnL.A0M(c44535Jmf2.A03);
                    A0M.A0B("clips/acr_browser/delete/");
                    A0M.A9s("acr_metadata_id", str2);
                    C1ON A0e = AbstractC25227BEk.A0e(A0M, K7q.class, LAj.class);
                    A0e.A00 = new C67936V3b(3);
                    C1GJ.A00(c44535Jmf2.A01, c44535Jmf2.A02, A0e);
                }
                i = 1372757335;
                break;
            case 3:
                A05 = C0f9.A05(1155931511);
                C44767Jro c44767Jro2 = (C44767Jro) this.A03;
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                Context A0L2 = AbstractC166997dE.A0L(c44767Jro2.A04);
                UserSession userSession2 = c44767Jro2.A08;
                C50674MYs c50674MYs = new C50674MYs(A0L2, userSession2);
                c50674MYs.A01(new ViewOnClickListenerC48067LPs((C45077Jx6) this.A02, c44767Jro2, this.A01, 2), 2131955221);
                c50674MYs.A03(new ViewOnClickListenerC48063LPo(c44767Jro2, 16), 2131955220);
                new C31727DwY(c50674MYs).A05(c44767Jro2.A02);
                AnonymousClass229.A01(userSession2).A1R(EnumC50631MWs.A02, "ACR_BROWSER_THREE_DOTS_MENU_BUTTON");
                i = 1332585313;
                break;
            case 4:
                A05 = C0f9.A05(-992651861);
                N5W n5w = (N5W) this.A03;
                ViewPager2 viewPager2 = n5w.A01;
                if (viewPager2 != null) {
                    int i6 = viewPager2.A00;
                    int i7 = this.A01;
                    if (i6 == i7 && C14360o3.A0K(this.A02, n5w.A06)) {
                        ((C51052Mh6) n5w.A0B.getValue()).A03(P5F.A00);
                    }
                    ViewPager2 viewPager22 = n5w.A01;
                    if (viewPager22 != null) {
                        viewPager22.A03(i7, true);
                        i = -451308692;
                        break;
                    }
                }
                C14360o3.A0F("viewPager");
                throw C00O.createAndThrow();
            case 5:
                A05 = C0f9.A05(2079121884);
                ((C23031Ai) this.A03).A0c(this.A01 + 1);
                ViewOnClickListenerC48070LPv.A00((ViewOnClickListenerC48070LPv) this.A02);
                i = 1475148193;
                break;
            default:
                C38262Gs5 c38262Gs5 = (C38262Gs5) this.A02;
                C41181vS c41181vS = (C41181vS) this.A03;
                int i8 = this.A01;
                ReelDashboardFragment reelDashboardFragment = c38262Gs5.A0B;
                C105814ps c105814ps = c41181vS.A0d;
                Context context = reelDashboardFragment.getContext();
                context.getClass();
                if (c105814ps != null) {
                    C47Z c47z = c105814ps.A00;
                    C40121td A00 = C40121td.A00(context, reelDashboardFragment.A06);
                    C150856qj.A02(context);
                    A00.A08(c47z);
                    float f = i8;
                    reelDashboardFragment.mListViewPager.A0H(f);
                    reelDashboardFragment.mImageViewPager.A0H(f);
                    return;
                }
                c105814ps.getClass();
                throw AbstractC166987dD.A1D(AnonymousClass001.A0R("Unknown optimistic state: ", c105814ps.getClass().getName()));
        }
        C0f9.A0C(i, A05);
    }

    public ViewOnClickListenerC48067LPs(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }
}
