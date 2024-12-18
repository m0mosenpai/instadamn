package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class ETZ extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public ETZ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A02 = obj;
        this.A06 = obj4;
        this.A04 = obj7;
        this.A05 = obj6;
        this.A03 = obj5;
        this.A07 = obj3;
        this.A01 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        C38321qM c38321qM;
        InterfaceC76653cC interfaceC76653cC;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(617729978);
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.A04;
                atomicBoolean.set(true);
                if (((AtomicInteger) this.A06).decrementAndGet() == 0) {
                    ((C54809OKh) this.A03).A00();
                    Context context = (Context) this.A01;
                    UserSession userSession = (UserSession) this.A07;
                    ArrayList arrayList = (ArrayList) this.A02;
                    if (atomicBoolean.get()) {
                        C9GR.A0F(context, "delete_media_all_stories_failed", 2131957678);
                    } else {
                        AbstractC54139Nwb.A00(context, userSession, arrayList);
                    }
                }
                i = -405545999;
                break;
            case 1:
                A03 = C0f9.A03(-547742876);
                C14360o3.A0B(abstractC115105If, 0);
                C41151IJq c41151IJq = (C41151IJq) this.A03;
                boolean z = abstractC115105If instanceof C115115Ig;
                if (z) {
                    C1P1 c1p1 = (C1P1) this.A02;
                    if (c1p1 != null) {
                        c1p1.onFail(abstractC115105If);
                    }
                    UserSession userSession2 = (UserSession) this.A07;
                    InterfaceC38391qT interfaceC38391qT = (InterfaceC38391qT) this.A05;
                    FXM.A01(userSession2, interfaceC38391qT, C57602kZ.A00(userSession2).A0O(interfaceC38391qT));
                    Object obj = this.A06;
                    if (obj == C05F.A01) {
                        if ((interfaceC38391qT instanceof InterfaceC76653cC) && (interfaceC76653cC = (InterfaceC76653cC) interfaceC38391qT) != null) {
                            C1563670g A00 = AbstractC40891I9p.A00(userSession2);
                            A00.A02.put(interfaceC76653cC.BIa(), AbstractC31173DnH.A0g());
                            A00.A02(interfaceC76653cC);
                        }
                    } else if (obj == C05F.A00 && (interfaceC38391qT instanceof C38321qM) && (c38321qM = (C38321qM) interfaceC38391qT) != null) {
                        Object obj2 = this.A04;
                        EnumC77213d7 enumC77213d7 = EnumC77213d7.A04;
                        if (obj2 == enumC77213d7) {
                            enumC77213d7 = EnumC77213d7.A03;
                        }
                        I0I.A00(userSession2, c38321qM, enumC77213d7);
                    }
                }
                if (z) {
                    C57602kZ.A00((UserSession) this.A07).A0N(c41151IJq, false);
                }
                GZO gzo = (GZO) this.A01;
                if (gzo != null) {
                    gzo.onFail(abstractC115105If);
                }
                i = -886611846;
                break;
            default:
                A03 = C0f9.A03(2104301830);
                List list = (List) this.A04;
                SavedCollection savedCollection = (SavedCollection) this.A06;
                SavedCollection savedCollection2 = (SavedCollection) this.A03;
                C25671My A002 = AbstractC25651Mw.A00((AbstractC12990ll) this.A07);
                AbstractC35086Fcx.A02(savedCollection, savedCollection2, list);
                C36116Fwq.A00(A002, savedCollection2, list);
                AbstractC35236FgV.A03((Context) this.A02, (C38321qM) AbstractC166987dD.A16(list), new G97(this, 12), list.size());
                i = -1493097759;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        InterfaceC76653cC interfaceC76653cC;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(2025841190);
                int A032 = C0f9.A03(-1096494881);
                ArrayList arrayList = (ArrayList) this.A02;
                arrayList.add(this.A05);
                if (((AtomicInteger) this.A06).decrementAndGet() == 0) {
                    ((C54809OKh) this.A03).A00();
                    Context context = (Context) this.A01;
                    UserSession userSession = (UserSession) this.A07;
                    if (((AtomicBoolean) this.A04).get()) {
                        C9GR.A0F(context, "delete_media_all_stories_failed", 2131957678);
                    } else {
                        AbstractC54139Nwb.A00(context, userSession, arrayList);
                    }
                }
                C0f9.A0A(2117818324, A032);
                i = -1150835163;
                break;
            case 1:
                A03 = C0f9.A03(-1051801739);
                InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
                int A0N = AbstractC167017dG.A0N(interfaceC40821up, 1541692578);
                C41151IJq c41151IJq = (C41151IJq) this.A03;
                UserSession userSession2 = (UserSession) this.A07;
                C57602kZ.A00(userSession2).A0N(c41151IJq, true);
                C1P1 c1p1 = (C1P1) this.A02;
                if (c1p1 != null) {
                    c1p1.onSuccess(interfaceC40821up);
                }
                if (this.A06 == C05F.A01) {
                    InterfaceC38391qT interfaceC38391qT = (InterfaceC38391qT) this.A05;
                    if ((interfaceC38391qT instanceof InterfaceC76653cC) && (interfaceC76653cC = (InterfaceC76653cC) interfaceC38391qT) != null) {
                        interfaceC76653cC.Ed3((EnumC77213d7) this.A04);
                        C1563670g A00 = AbstractC40891I9p.A00(userSession2);
                        A00.A02.put(interfaceC76653cC.BIa(), AbstractC31173DnH.A0g());
                        A00.A02(interfaceC76653cC);
                    }
                }
                GZO gzo = (GZO) this.A01;
                if (gzo != null) {
                    gzo.Dpp(interfaceC40821up);
                }
                C0f9.A0A(2000184820, A0N);
                i = 944263056;
                break;
            default:
                A03 = C0f9.A03(-1598083248);
                int A033 = C0f9.A03(873365116);
                Context context2 = (Context) this.A02;
                SavedCollection savedCollection = (SavedCollection) this.A06;
                List list = (List) this.A04;
                C38321qM A0x = AbstractC25225BEi.A0x(list, 0);
                int size = list.size();
                AbstractC167007dF.A1D(context2, 0, A0x);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                A0K.A0D = context2.getResources().getQuantityString(R.plurals.save_home_bulk_edit_move_success_notification, size, AbstractC25228BEl.A1Z(savedCollection.A0G, size));
                A0K.A09 = A0x.A1S();
                A0K.A03();
                AbstractC31178DnM.A1S(A0K);
                Runnable runnable = (Runnable) this.A05;
                if (runnable != null) {
                    runnable.run();
                }
                C0f9.A0A(926108422, A033);
                i = -1586673246;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
