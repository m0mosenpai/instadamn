package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* renamed from: X.Cid, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28545Cid implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ DialogInterface.OnDismissListener A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ C18920wW A04;
    public final /* synthetic */ C1P1 A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ ClipsDraftPreviewItemRepository A07;
    public final /* synthetic */ C38321qM A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ InterfaceC16820sZ A0A;

    public DialogInterfaceOnClickListenerC28545Cid(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, C18920wW c18920wW, C1P1 c1p1, UserSession userSession, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, C38321qM c38321qM, String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A06 = userSession;
        this.A07 = clipsDraftPreviewItemRepository;
        this.A08 = c38321qM;
        this.A03 = fragment;
        this.A00 = activity;
        this.A04 = c18920wW;
        this.A05 = c1p1;
        this.A0A = interfaceC16820sZ;
        this.A02 = onDismissListener;
        this.A09 = str;
        this.A01 = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A06;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36325287201682407L)) {
            ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = this.A07;
            C38321qM c38321qM = this.A08;
            String id = c38321qM.getId();
            if (id != null) {
                clipsDraftPreviewItemRepository.A03(id, C30487DbW.A00(this.A03, userSession, c38321qM, 43));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        Fragment fragment = this.A03;
        FragmentActivity activity = fragment.getActivity();
        Activity activity2 = this.A00;
        C38321qM c38321qM2 = this.A08;
        String A03 = C55217Oeg.A03(activity2, userSession, c38321qM2, true);
        EnumC193348hE enumC193348hE = EnumC193348hE.A06;
        C18920wW c18920wW = this.A04;
        C1P1 c1p1 = this.A05;
        InterfaceC16820sZ interfaceC16820sZ = this.A0A;
        DialogInterfaceOnClickListenerC28566Ciy dialogInterfaceOnClickListenerC28566Ciy = new DialogInterfaceOnClickListenerC28566Ciy(fragment, c18920wW, c1p1, userSession, c38321qM2, interfaceC16820sZ, 0);
        String str = this.A09;
        C28482Cha.A02(dialogInterfaceOnClickListenerC28566Ciy, new LMI(this.A01, c18920wW, userSession, str, 2), new DialogInterfaceOnClickListenerC28566Ciy(fragment, c18920wW, c1p1, userSession, c38321qM2, interfaceC16820sZ, 1), this.A02, new DialogInterfaceOnShowListenerC28573Cj5(c18920wW, userSession, str, 1), activity, enumC193348hE, enumC193348hE, 2131957608, A03, 2131957606, 2131957607, 2131954754);
    }
}
