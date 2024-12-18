package X;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class NA1 extends C1P1 {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ EditMediaInfoFragment A03;

    public NA1(EditMediaInfoFragment editMediaInfoFragment, String str, boolean z, boolean z2) {
        this.A03 = editMediaInfoFragment;
        this.A02 = z;
        this.A01 = z2;
        this.A00 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1715772476);
        EditMediaInfoFragment editMediaInfoFragment = this.A03;
        FragmentActivity activity = editMediaInfoFragment.getActivity();
        String A01 = AbstractC172137li.A01(abstractC115105If);
        if (TextUtils.isEmpty(A01)) {
            A01 = AbstractC166997dE.A0N(editMediaInfoFragment).getString(2131961661);
        }
        C9GR.A03(activity, A01, "edit_error", 0);
        C0f9.A0A(900496924, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-222286425);
        EditMediaInfoFragment.A0L(this.A03, false);
        C0f9.A0A(-512049995, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1480582827);
        EditMediaInfoFragment.A0L(this.A03, true);
        C0f9.A0A(177562707, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(-950780963);
        N3N n3n = (N3N) obj;
        int A032 = C0f9.A03(-2066039261);
        EditMediaInfoFragment editMediaInfoFragment = this.A03;
        EditMediaInfoFragment.A0I(editMediaInfoFragment, n3n.A00);
        editMediaInfoFragment.A02.post(new Runnable() { // from class: X.PM9
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr;
                Integer num;
                String str2;
                String str3;
                long j;
                Long A0j;
                NA1 na1 = NA1.this;
                EditMediaInfoFragment editMediaInfoFragment2 = na1.A03;
                if (editMediaInfoFragment2.isResumed()) {
                    if (na1.A02) {
                        C9GR.A07(editMediaInfoFragment2.requireContext(), 2131962391);
                    }
                    if (na1.A01) {
                        String str4 = editMediaInfoFragment2.A0R;
                        if (str4 != null) {
                            strArr = str4.split("_");
                        } else {
                            strArr = new String[0];
                        }
                        C38321qM c38321qM = editMediaInfoFragment2.A0I;
                        String str5 = null;
                        if (c38321qM != null && c38321qM.A0C.App() != null) {
                            num = AbstractC40899I9x.A00(editMediaInfoFragment2.A0I.A0C.App());
                        } else {
                            num = null;
                        }
                        UserSession session = editMediaInfoFragment2.getSession();
                        int length = strArr.length;
                        if (length > 0) {
                            str2 = strArr[0];
                        } else {
                            str2 = null;
                        }
                        if (num != null) {
                            str3 = AbstractC40900I9y.A00(num);
                        } else {
                            str3 = null;
                        }
                        if (length > 1) {
                            str5 = strArr[1];
                        }
                        C14360o3.A0B(session, 1);
                        if (str2 != null && (A0j = AbstractC166997dE.A0j(str2)) != null) {
                            j = A0j.longValue();
                        } else {
                            j = -1;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str5 == null) {
                            str5 = "-1";
                        }
                        C4SX A00 = C4SX.A00(str5);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, session), "instagram_shopping_commerce_media_untagging_interaction");
                        if (A0f.isSampled()) {
                            A0f.A9K("ig_media_id", Long.valueOf(j));
                            AbstractC50523MSb.A0u(A00, A0f, "show_modal_on_edit", str3);
                        }
                        FragmentActivity requireActivity = editMediaInfoFragment2.requireActivity();
                        C193328hC A0H = AbstractC31171DnF.A0H(requireActivity);
                        A0H.A09(2131956520);
                        A0H.A0s(true);
                        A0H.A0A(2131956522);
                        A0H.A0J(new DialogInterfaceOnClickListenerC55252OfQ(1), 2131956521);
                        A0H.A0I(DialogInterfaceOnClickListenerC55321Ogj.A00(na1, requireActivity, 22), 2131956519);
                        DialogInterfaceOnDismissListenerC55324Ogm.A00(A0H, na1, 8);
                        AbstractC166987dD.A1W(A0H);
                        return;
                    }
                    editMediaInfoFragment2.getParentFragmentManager().A12();
                }
            }
        });
        String str2 = this.A00;
        if (str2 != null) {
            String str3 = editMediaInfoFragment.A0R;
            if (str3 != null) {
                AtomicBoolean atomicBoolean = C38321qM.A0i;
                str = C38801rC.A06(str3);
            } else {
                str = null;
            }
            AnonymousClass229.A01(editMediaInfoFragment.getSession()).A1z("SHARE_SHEET_REPLACE_AUDIO_DONE", str, str2);
        }
        C38321qM c38321qM = n3n.A00;
        C186808Px A00 = AbstractC186788Pv.A00(editMediaInfoFragment.getSession());
        String id = c38321qM.getId();
        id.getClass();
        List A002 = A00.A00(id);
        List A3g = c38321qM.A3g();
        C28531Zo.A04.A0G(editMediaInfoFragment.getSession(), "FEED", A3g, A002);
        Iterator it = A3g.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            DirectShareTarget directShareTarget = new DirectShareTarget(A15);
            if (AbstractC186788Pv.A01(editMediaInfoFragment.getSession()) || (A002 != null && AbstractC31175DnJ.A1X(A15, A002))) {
                C28531Zo c28531Zo = C28531Zo.A04;
                editMediaInfoFragment.requireContext();
                c28531Zo.A0B(editMediaInfoFragment.getSession(), c38321qM, directShareTarget);
            }
        }
        C0f9.A0A(2048372023, A032);
        C0f9.A0A(789132886, A03);
    }
}
