package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* renamed from: X.Cic, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28544Cic implements DialogInterface.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ C1ON A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ClipsDraftPreviewItemRepository A04;
    public final /* synthetic */ C38321qM A05;
    public final /* synthetic */ boolean A06;

    public DialogInterfaceOnClickListenerC28544Cic(Fragment fragment, C1P1 c1p1, C1ON c1on, UserSession userSession, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, C38321qM c38321qM, boolean z) {
        this.A03 = userSession;
        this.A04 = clipsDraftPreviewItemRepository;
        this.A05 = c38321qM;
        this.A00 = fragment;
        this.A06 = z;
        this.A01 = c1p1;
        this.A02 = c1on;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC11380iw A01;
        EnumC120795dP enumC120795dP;
        UserSession userSession = this.A03;
        boolean A06 = C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36325287201682407L);
        if (A06) {
            ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = this.A04;
            C38321qM c38321qM = this.A05;
            String id = c38321qM.getId();
            if (id != null) {
                clipsDraftPreviewItemRepository.A03(id, new C30506Dbp(userSession, 47));
                FragmentActivity activity = this.A00.getActivity();
                String A2u = c38321qM.A2u();
                boolean z = this.A06;
                C14360o3.A0B(userSession, 1);
                if (A2u != null && (A01 = C150856qj.A01(activity)) != null) {
                    if (z) {
                        enumC120795dP = EnumC120795dP.A0I;
                    } else {
                        enumC120795dP = EnumC120795dP.A0X;
                    }
                    AbstractC37670Gi3.A09(enumC120795dP, BQL.A0t, A01, userSession, A2u);
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository2 = this.A04;
        String id2 = this.A05.getId();
        if (id2 != null) {
            clipsDraftPreviewItemRepository2.A02(id2, new DHP(44, userSession, A06));
            C1P1 c1p1 = this.A01;
            if (c1p1 != null) {
                this.A02.A00 = c1p1;
            }
            Fragment fragment = this.A00;
            C1GJ.A00(fragment.requireContext(), AbstractC018607g.A00(fragment), this.A02);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
