package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Fp9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35674Fp9 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public ViewOnClickListenerC35674Fp9(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1560510088);
                Context context = (Context) this.A01;
                N48 n48 = (N48) this.A02;
                AbstractC35253Fgm.A02(context, n48, AbstractC166987dD.A0r(n48.A00), this.A03, this.A04, "tap_on_code_media_creation");
                i = 410192838;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(571631608);
                Context context2 = (Context) this.A01;
                N48 n482 = (N48) this.A02;
                AbstractC35253Fgm.A02(context2, n482, AbstractC166987dD.A0r(n482.A00), this.A03, this.A04, "copy_button_media_creation");
                i = 789275877;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(838392483);
                Fragment fragment = (Fragment) this.A02;
                FragmentActivity requireActivity = fragment.requireActivity();
                C3DN A0r = AbstractC31172DnG.A0r(requireActivity);
                if (A0r != null) {
                    ((C3DP) A0r).A0H = new GHE(this.A01, requireActivity, fragment, this.A03, this.A04, 0);
                    A0r.A0B();
                }
                i = -307647519;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(220441908);
                Number number = (Number) this.A01;
                if (number != null) {
                    C44565Jnm c44565Jnm = (C44565Jnm) this.A02;
                    C50695MZq.A00(c44565Jnm.A00, new NL6(this.A04, this.A03, c44565Jnm.A01, number.floatValue()));
                }
                i = -1439727568;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-377188386);
                C34629FNm c34629FNm = (C34629FNm) this.A01;
                EnumC53099NeC enumC53099NeC = (EnumC53099NeC) this.A02;
                String str2 = this.A03;
                String str3 = this.A04;
                int i2 = O06.A00[enumC53099NeC.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                UserSession userSession = c34629FNm.A02;
                                Bundle A0b = AbstractC166987dD.A0b();
                                A0b.putString("bottom_sheet_content_fragment", AbstractC43591JPw.A00(146));
                                A0b.putBoolean("finish_host_activity_on_dismissed", true);
                                String str4 = c34629FNm.A04;
                                A0b.putString(AbstractC111324zv.A00(1171), str4);
                                A0b.putString(AbstractC111324zv.A00(1170), str2);
                                AbstractC25228BEl.A1G(c34629FNm.A00, A0b, userSession, TransparentModalActivity.class, "bottom_sheet");
                                C142846ck A0d = AbstractC31172DnG.A0d(c34629FNm.A06);
                                C2EE c2ee = c34629FNm.A03.A06;
                                String C7q = c2ee.C7q();
                                int AdZ = c2ee.AdZ();
                                Integer valueOf = Integer.valueOf(AdZ);
                                C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                                if (AbstractC25226BEj.A1Z(A0I)) {
                                    AbstractC31175DnJ.A1B(A0I, A0d);
                                    AbstractC31174DnI.A1I(A0I, "poll_options_sheet_rendered");
                                    A0I.A0o(AbstractC111324zv.A00(1106));
                                    A0I.A0p("thread_view");
                                    if (valueOf != null && AdZ == 2) {
                                        str = "subscriber_broadcast";
                                    } else {
                                        str = "broadcast";
                                    }
                                    A0I.A0n(str);
                                    A0I.A0M(EnumC33508Erh.MEMBER_PARTICIPATION_HUB, "entrypoint");
                                    A0I.A0r(str4);
                                    A0I.A0h(AbstractC25233BEq.A0n(C7q));
                                    A0I.A0v(AbstractC25233BEq.A0p("poll_id", str2, AbstractC166987dD.A1L("user_type", "VIEWER")));
                                    A0I.Cht();
                                }
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            Bundle A0b2 = AbstractC166987dD.A0b();
                            String str5 = c34629FNm.A04;
                            if (str5 != null) {
                                A0b2.putString("surface", "challenges");
                                A0b2.putString("collection_id", str2);
                                A0b2.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str5);
                                AbstractC43826JZo.A01(A0b2, AbstractC1345466e.A05(AbstractC31171DnF.A0N(str5)), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
                                A0b2.putString("client_context", str2);
                                A0b2.putSerializable("prompts_entry_point", EnumC33364Eox.A06);
                                A0b2.putParcelable("DirectThreadSharedMediaFragment.DIRECT_MEDIA_REPLY_ELIGIBILITY_CHECKER", new MediaViewerReplyBarEligibilityCheckerImpl(false, false, false));
                                UserSession userSession2 = c34629FNm.A02;
                                Activity activity = c34629FNm.A00;
                                C6XJ A0L = AbstractC31171DnF.A0L(activity, A0b2, userSession2, ModalActivity.class, "direct_card_gallery");
                                A0L.A00 = 1;
                                A0L.A0H = false;
                                A0L.A07();
                                A0L.A0C(activity);
                            }
                        }
                    } else {
                        UserSession userSession3 = c34629FNm.A02;
                        AbstractC34143F4t.A00(c34629FNm.A00, userSession3, EnumC33364Eox.A06, c34629FNm.A04, str2, str3);
                    }
                } else if (str2 != null) {
                    ((G4Q) c34629FNm.A05.getValue()).Cr9(null, str2);
                }
                i = -1266671447;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(1876710462);
                HMY hmy = (HMY) this.A02;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                hmy.A00.Duh((JIN) this.A01, null, this.A03, this.A04);
                i = -1226818080;
                C0f9.A0C(i, A05);
                return;
            case 6:
                UserSession userSession4 = (UserSession) this.A01;
                String str6 = this.A03;
                Fragment fragment2 = (Fragment) this.A02;
                AbstractC34138F4o.A00(fragment2, fragment2.getActivity(), (InterfaceC11380iw) fragment2, userSession4, str6, this.A04);
                return;
            default:
                A05 = C0f9.A05(-1204194148);
                C63397SjR c63397SjR = new C63397SjR((Context) this.A01, (UserSession) this.A02, C2Fb.A1t, this.A03);
                c63397SjR.A0S = this.A04;
                c63397SjR.A0A();
                i = -1275364390;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC35674Fp9(Context context, N48 n48, String str, String str2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = context;
                this.A02 = n48;
                break;
            default:
                this.A02 = n48;
                this.A01 = context;
                break;
        }
        this.A03 = str;
        this.A04 = str2;
    }
}
