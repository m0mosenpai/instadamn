package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.save.model.SavedCollection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EU1 extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public EU1(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj4;
        this.A04 = obj5;
        this.A01 = obj2;
        this.A05 = obj3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-117401724);
                AbstractC63248Sg4.A01((AbstractC10360h2) this.A04);
                Context context = (Context) this.A03;
                C0w9.A03("AppStartupUtil", "ClipItemRequestTask onFail");
                C9GR.A0C(context, "ClipItemRequestTask onFail");
                i = 1150264531;
                break;
            case 1:
                A03 = C0f9.A03(359769757);
                AbstractC63248Sg4.A01((AbstractC10360h2) this.A04);
                Context context2 = (Context) this.A03;
                C0w9.A03("AppStartupUtil", "SingleMediaRequest onFail for navigation to insights");
                C9GR.A0C(context2, "SingleMediaRequest onFail for navigation to insights");
                i = 976170972;
                break;
            case 2:
                A03 = C0f9.A03(-1340322703);
                AbstractC31171DnF.A1N(this.A03);
                C9GR.A0C((Context) this.A01, "removeHighlightMedia_unknown_error_occured");
                i = 548510624;
                break;
            case 3:
                A03 = C0f9.A03(-898771422);
                AbstractC35260Fgu.A07((Context) this.A03, (InterfaceC11380iw) this.A01, (UserSession) this.A05, (SavedCollection) this.A02, (List) this.A04);
                i = -1042323078;
                break;
            case 4:
                A03 = C0f9.A03(960190260);
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A05;
                List list = (List) this.A03;
                C25671My A00 = AbstractC25651Mw.A00(abstractC12990ll);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    FXM.A00(abstractC12990ll, EnumC77213d7.A03, EnumC77213d7.A04, AbstractC31172DnG.A0i(it));
                }
                A00.E4s(new C36116Fwq(EnumC33416Epn.A05, null, list));
                Context context3 = (Context) this.A02;
                G97 g97 = new G97(this, 11);
                C38321qM A0x = AbstractC25225BEi.A0x(list, 0);
                int size = list.size();
                AbstractC167007dF.A1D(context3, 0, A0x);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC31181DnP.A0P(context3.getResources(), A0x, A0K, R.plurals.save_home_bulk_edit_unsave_failure_notification, size);
                A0K.A0A(g97);
                A0K.A0G = AbstractC166997dE.A0q(context3.getResources(), 2131972568);
                AbstractC31178DnM.A1S(A0K);
                i = -1270687406;
                break;
            default:
                A03 = C0f9.A03(11872240);
                AbstractC166987dD.A1Y(this.A02);
                i = -1820397874;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1684735352);
                super.onStart();
                AbstractC63248Sg4.A02((AbstractC10360h2) this.A04);
                i = 1968550181;
                break;
            case 1:
                A03 = C0f9.A03(740685436);
                AbstractC63248Sg4.A02((AbstractC10360h2) this.A04);
                i = -838992307;
                break;
            case 2:
                A03 = C0f9.A03(126925277);
                C0fJ.A00((Dialog) this.A03);
                i = 1662146467;
                break;
            case 3:
            case 4:
            default:
                super.onStart();
                return;
            case 5:
                A03 = C0f9.A03(890496473);
                super.onStart();
                AbstractC166987dD.A1Y(this.A03);
                i = 685499333;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1502432976);
                C38874H9w c38874H9w = (C38874H9w) obj;
                int A032 = C0f9.A03(1348375665);
                super.onSuccess(c38874H9w);
                AbstractC63248Sg4.A01((AbstractC10360h2) this.A04);
                C38321qM c38321qM = c38874H9w.A00;
                AEM.A00((Bundle) this.A02, (FragmentActivity) this.A03, (UserSession) this.A05, c38321qM);
                C0f9.A0A(236638082, A032);
                i = 122329678;
                break;
            case 1:
                A03 = C0f9.A03(-194885832);
                int A033 = C0f9.A03(1641746121);
                AbstractC63248Sg4.A01((AbstractC10360h2) this.A04);
                C38321qM c38321qM2 = (C38321qM) AbstractC166987dD.A16(((C74293Vk) obj).A06);
                if (c38321qM2 != null) {
                    F7S.A00((Fragment) ((C1GL) ((InterfaceC59992oh) ((InterfaceC11380iw) this.A02))), (UserSession) this.A05, c38321qM2, "app_startup");
                } else {
                    Context context = (Context) this.A03;
                    C0w9.A03("AppStartupUtil", "null media fetched for navigation to insights");
                    C9GR.A0C(context, "null media fetched for navigation to insights");
                }
                C0f9.A0A(-948164073, A033);
                i = -1670556515;
                break;
            case 2:
                A03 = C0f9.A03(-1649838365);
                EBB ebb = (EBB) obj;
                int A0N = AbstractC167017dG.A0N(ebb, 1111744759);
                AbstractC31171DnF.A1N(this.A03);
                UserSession userSession = (UserSession) this.A05;
                Reel reel = (Reel) this.A04;
                AbstractC54894OPp.A01(ebb, userSession, reel, AbstractC166987dD.A1J(this.A02));
                if (ebb.A00 != null) {
                    Context context2 = (Context) this.A01;
                    C9GR.A09(context2, AbstractC31177DnL.A0b(context2, reel.A0r, 2131964513));
                }
                C0f9.A0A(-1229138617, A0N);
                i = 680688194;
                break;
            case 3:
                A03 = C0f9.A03(446928496);
                int A034 = C0f9.A03(2119748611);
                Context context3 = (Context) this.A03;
                SavedCollection savedCollection = (SavedCollection) this.A02;
                List list = (List) this.A04;
                AbstractC35236FgV.A04(context3, (C38321qM) AbstractC166987dD.A16(list), savedCollection, list.size());
                C0f9.A0A(-740659661, A034);
                i = -1029320484;
                break;
            case 4:
                A03 = C0f9.A03(-711132063);
                int A035 = C0f9.A03(-1457295806);
                Context context4 = (Context) this.A02;
                List list2 = (List) this.A03;
                C38321qM A0x = AbstractC25225BEi.A0x(list2, 0);
                int size = list2.size();
                boolean A1R = AbstractC167007dF.A1R(0, context4, A0x);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                A0K.A0D = AbstractC167017dG.A0k(context4.getResources(), size, R.plurals.save_home_bulk_edit_unsave_success_notification);
                A0K.A0O = A1R;
                A0K.A09 = A0x.A1S();
                A0K.A03();
                AbstractC31178DnM.A1S(A0K);
                Runnable runnable = (Runnable) this.A04;
                if (runnable != null) {
                    runnable.run();
                }
                C0f9.A0A(304639725, A035);
                i = -1040110607;
                break;
            default:
                A03 = C0f9.A03(-1860966156);
                C38889HAl c38889HAl = (C38889HAl) obj;
                int A0N2 = AbstractC167017dG.A0N(c38889HAl, 1731172594);
                IFP ifp = c38889HAl.A01;
                C38321qM c38321qM3 = c38889HAl.A00;
                if (ifp != null) {
                    AbstractC25225BEi.A1U(this.A01, ifp);
                } else if (c38889HAl.A03 != null && c38321qM3 != null) {
                    ((InterfaceC16620sF) this.A04).invoke(c38321qM3, c38889HAl);
                    long j = C42274Iny.A04;
                    I93.A00((UserSession) this.A05).A00();
                } else {
                    AbstractC166987dD.A1Y(this.A02);
                }
                C0f9.A0A(1527126864, A0N2);
                i = -73672559;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
