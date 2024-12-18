package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* renamed from: X.Ciy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28566Ciy implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public DialogInterfaceOnClickListenerC28566Ciy(Fragment fragment, C18920wW c18920wW, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A03 = c38321qM;
            this.A05 = c18920wW;
            this.A06 = userSession;
            this.A01 = fragment;
            this.A04 = c1p1;
            this.A02 = interfaceC16820sZ;
        } else {
            this.A04 = c38321qM;
            this.A05 = c18920wW;
            this.A06 = userSession;
            this.A02 = fragment;
            this.A01 = c1p1;
            this.A03 = interfaceC16820sZ;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj;
        switch (this.A00) {
            case 0:
                String id = ((C38321qM) this.A04).getId();
                if (id != null) {
                    C18920wW c18920wW = (C18920wW) this.A05;
                    UserSession userSession = (UserSession) this.A06;
                    String str = userSession.userId;
                    C14360o3.A0B(str, 1);
                    C41684IdD.A00(c18920wW, str, id, "delete_both_click");
                    C1ON A04 = AbstractC55151OdE.A04(userSession, id, AbstractC166987dD.A1J("FB"));
                    Fragment fragment = (Fragment) this.A02;
                    A04.A00 = new C39474Hc0(c18920wW, (C1P1) this.A01, userSession.userId, id);
                    Context context = fragment.getContext();
                    if (context != null) {
                        C1GJ.A00(context, AbstractC018607g.A00(fragment), A04);
                    }
                    obj = this.A03;
                    break;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            case 1:
                String id2 = ((C38321qM) this.A03).getId();
                if (id2 != null) {
                    C18920wW c18920wW2 = (C18920wW) this.A05;
                    UserSession userSession2 = (UserSession) this.A06;
                    String str2 = userSession2.userId;
                    C14360o3.A0B(str2, 1);
                    C41684IdD.A00(c18920wW2, str2, id2, AbstractC111324zv.A00(2236));
                    C1ON A03 = AbstractC55151OdE.A03(userSession2, id2);
                    Fragment fragment2 = (Fragment) this.A01;
                    A03.A00 = new C39475Hc1(c18920wW2, (C1P1) this.A04, userSession2.userId, id2);
                    Context context2 = fragment2.getContext();
                    if (context2 != null) {
                        C1GJ.A00(context2, AbstractC018607g.A00(fragment2), A03);
                    }
                    obj = this.A02;
                    break;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            default:
                Fragment fragment3 = (Fragment) this.A03;
                FragmentActivity activity = fragment3.getActivity();
                EnumC193348hE enumC193348hE = EnumC193348hE.A03;
                UserSession userSession3 = (UserSession) this.A06;
                C38321qM c38321qM = (C38321qM) this.A04;
                String id3 = c38321qM.getId();
                if (id3 != null) {
                    C28482Cha.A02(new DialogInterfaceOnClickListenerC28544Cic(fragment3, (C1P1) this.A01, AbstractC55151OdE.A04(userSession3, id3, AbstractC166987dD.A1J("FB")), userSession3, ClipsDraftPreviewItemRepository.A09.A00(AbstractC25231BEo.A0L(fragment3), userSession3), c38321qM, true), new DialogInterfaceOnClickListenerC28537CiV(this.A05, 18), null, (DialogInterface.OnDismissListener) this.A02, C28482Cha.A00(fragment3.getActivity(), userSession3, c38321qM, true), activity, enumC193348hE, null, null, null, 2131966912, 2131957663, 2131968687);
                    return;
                }
                throw AbstractC166997dE.A0g();
        }
        AbstractC25228BEl.A1P(obj);
    }

    public DialogInterfaceOnClickListenerC28566Ciy(DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, C1P1 c1p1, UserSession userSession, C38321qM c38321qM) {
        this.A00 = 2;
        this.A03 = fragment;
        this.A06 = userSession;
        this.A04 = c38321qM;
        this.A01 = c1p1;
        this.A02 = onDismissListener;
        this.A05 = onClickListener;
    }
}
