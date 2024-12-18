package X;

import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.HashMap;

/* renamed from: X.DwJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31714DwJ extends C1P1 {
    public final int A00;
    public final Object A01;

    public C31714DwJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C1ON c1on, Object obj, int i) {
        c1on.A00 = new C31714DwJ(obj, i);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        String errorMessage;
        switch (this.A00) {
            case 0:
                A0N = C0f9.A03(1533026574);
                ELn eLn = (ELn) this.A01;
                Toast A01 = C9GR.A01(eLn.requireContext(), "load_whitelist_failed", 2131968431, 0);
                if (A01 != null) {
                    A01.show();
                }
                eLn.A0A().A03(eLn.requireContext(), ViewOnClickListenerC35689FpO.A00(eLn, 58), EnumC153216up.A04);
                i = -2091379541;
                break;
            case 1:
            case 5:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 23:
            case 24:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 32:
            default:
                super.onFail(abstractC115105If);
                return;
            case 2:
                A0N = C0f9.A03(112992361);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                C33223ElB c33223ElB = (C33223ElB) this.A01;
                c33223ElB.A07 = true;
                c33223ElB.A06 = false;
                c33223ElB.setItems(AbstractC166987dD.A1J(new Object()));
                C33223ElB.A01(c33223ElB);
                i = -513363366;
                break;
            case 3:
                A0N = C0f9.A03(-2058671761);
                ELn eLn2 = (ELn) this.A01;
                eLn2.A0A().A03(eLn2.requireContext(), null, EnumC153216up.A04);
                i = 1914209848;
                break;
            case 4:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 436361814);
                super.onFail(abstractC115105If);
                EN0 en0 = ((FQ6) this.A01).A00;
                EQ4 eq4 = en0.A00;
                if (eq4 != null) {
                    eq4.A00(null);
                }
                SpinnerImageView spinnerImageView = en0.A02;
                if (spinnerImageView != null) {
                    AbstractC31171DnF.A1M(spinnerImageView);
                }
                SpinnerImageView spinnerImageView2 = en0.A02;
                if (spinnerImageView2 != null) {
                    spinnerImageView2.setClickable(true);
                }
                i = 1275690006;
                break;
            case 6:
                A0N = C0f9.A03(-1942498962);
                ((C34685FPw) this.A01).A00.Dxp();
                i = -578209633;
                break;
            case 7:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -846347600);
                i = -703962378;
                break;
            case 8:
                A0N = C0f9.A03(-983285830);
                Fragment fragment = (Fragment) this.A01;
                AbstractC35275FhA.A03(fragment.requireActivity(), fragment.requireArguments());
                i = 746118966;
                break;
            case 9:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 2032231999);
                super.onFail(abstractC115105If);
                i = 604246553;
                break;
            case 10:
                A0N = C0f9.A03(1385755258);
                ((InterfaceC37203GaE) this.A01).DFf();
                i = -1861029356;
                break;
            case 11:
                A0N = C0f9.A03(1647969011);
                GZV gzv = (GZV) this.A01;
                String str = null;
                Object A00 = abstractC115105If.A00();
                if (A00 != null) {
                    str = ((EDR) A00).A02;
                }
                gzv.Dxy(str);
                i = -1705686000;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0N = C0f9.A03(-1100156192);
                Context context = (Context) this.A01;
                C9GR.A03(context, context.getString(2131974293), "update_friend_map_note_mute_state_failure", 0);
                i = 1862946042;
                break;
            case 14:
                A0N = C0f9.A03(-1219973509);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                EJW ejw = (EJW) this.A01;
                IgdsBottomButtonLayout igdsBottomButtonLayout = ejw.A02;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = ejw.A02;
                if (igdsBottomButtonLayout2 != null) {
                    AbstractC31173DnH.A1H(ejw, igdsBottomButtonLayout2, 2131974872);
                }
                SpinnerImageView spinnerImageView3 = ejw.A03;
                if (spinnerImageView3 != null) {
                    spinnerImageView3.setLoadingStatus(C3T1.FAILED);
                }
                SpinnerImageView spinnerImageView4 = ejw.A03;
                if (spinnerImageView4 != null) {
                    C0fQ.A00(ejw.A06, spinnerImageView4);
                }
                RecyclerView recyclerView = ejw.A00;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                C35155Fex c35155Fex = ejw.A04;
                if (c35155Fex != null) {
                    C34947FaX c34947FaX = c35155Fex.A09;
                    ImmutableList A0L = AbstractC31173DnH.A0L(c34947FaX.A02.keySet());
                    HashMap A012 = C35155Fex.A01(AbstractC31173DnH.A0L(c34947FaX.A01));
                    String str2 = c35155Fex.A01;
                    EnumC33492ErR enumC33492ErR = EnumC33492ErR.BLOCKED_ACCOUNTS;
                    EnumC33486ErL enumC33486ErL = EnumC33486ErL.SUGGESTED_BLOCKS;
                    UserSession userSession = c35155Fex.A07;
                    InterfaceC11380iw interfaceC11380iw = c35155Fex.A06;
                    AbstractC167007dF.A1G(str2, 2, userSession);
                    C14360o3.A0B(interfaceC11380iw, 6);
                    FVC.A01(enumC33492ErR, enumC33486ErL, interfaceC11380iw, userSession, str2, A0L, A012, 6);
                    C9GR.A01(c35155Fex.A05.getApplicationContext(), "block_all_failure", 2131953906, 0);
                    c35155Fex.A02();
                }
                i = 730232649;
                break;
            case Process.SIGTERM /* 15 */:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -807656286);
                super.onFail(abstractC115105If);
                Fragment fragment2 = (Fragment) this.A01;
                String A0m = AbstractC31173DnH.A0m(fragment2);
                if ((abstractC115105If instanceof C115115Ig) && (errorMessage = ((InterfaceC40821up) ((C115115Ig) abstractC115105If).A00).getErrorMessage()) != null && errorMessage.length() != 0) {
                    A0m = errorMessage;
                }
                C9GR.A03(fragment2.getActivity(), A0m, "UserList onFail", 1);
                i = 1261798723;
                break;
            case 17:
                A0N = C0f9.A03(-2117625626);
                C31535DtK c31535DtK = (C31535DtK) this.A01;
                AbstractC31179DnN.A1U(c31535DtK, 16923645);
                C1570473j c1570473j = c31535DtK.A09;
                if (c1570473j != null) {
                    c1570473j.A0E("fetch_request_fail");
                    C1570473j c1570473j2 = c31535DtK.A09;
                    if (c1570473j2 != null) {
                        ((MTJ) c1570473j2).A00.A01();
                        i = 1624892658;
                        break;
                    }
                }
                C14360o3.A0F("latencyPerfLogger");
                throw C00O.createAndThrow();
            case 18:
                A0N = C0f9.A03(811847198);
                C146106i8 A0j = AbstractC25229BEm.A0j();
                A0j.A0H = "batch_remove_spam_followers_request_failed";
                AbstractC31172DnG.A1H(AbstractC166997dE.A0N((Fragment) this.A01), A0j, 2131972299);
                A0j.A06();
                AbstractC25233BEq.A1F(A0j);
                i = -59822764;
                break;
            case 22:
                A0N = C0f9.A03(-1570650811);
                ENR enr = (ENR) this.A01;
                EnumC153216up enumC153216up = EnumC153216up.A04;
                EmptyStateView emptyStateView = enr.A01;
                if (emptyStateView != null) {
                    emptyStateView.A0P(enumC153216up);
                }
                i = 226592450;
                break;
            case 25:
                A0N = C0f9.A03(919027586);
                Fragment fragment3 = (Fragment) ((ViewOnClickListenerC35682FpH) this.A01).A01;
                if (fragment3.getContext() != null) {
                    C9GR.A03(fragment3.getContext(), fragment3.getString(2131974293), "something_went_wrong", 0);
                }
                i = 305663334;
                break;
            case 26:
                A0N = C0f9.A03(1403893040);
                Fragment fragment4 = (Fragment) this.A01;
                if (fragment4.getContext() != null) {
                    C9GR.A0B(fragment4.getContext(), "something_went_wrong");
                }
                i = 1312344154;
                break;
            case 27:
                A0N = C0f9.A03(-1218529032);
                C9GR.A0F((Context) this.A01, "nominate_clips_failed", 2131968663);
                i = -1347900103;
                break;
            case 30:
                A0N = C0f9.A03(251262470);
                i = 132255243;
                break;
            case 31:
                A0N = C0f9.A03(507746444);
                i = -110875583;
                break;
            case 33:
                A0N = C0f9.A03(361359375);
                i = 20509622;
                break;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 20:
                A03 = C0f9.A03(1183324461);
                C23031Ai A00 = AbstractC23021Ah.A00((UserSession) this.A01);
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
                A0w.E7G(AbstractC111324zv.A00(1074), currentTimeMillis);
                A0w.apply();
                i = 1719102911;
                break;
            case 21:
            case 22:
            default:
                super.onFailInBackground(abstractC115105If);
                return;
            case 23:
                A03 = C0f9.A03(1709647404);
                AbstractC167007dF.A0J().post(new RunnableC36930GOz(this, (C32272EJh) this.A01));
                i = -1145908879;
                break;
            case 24:
                A03 = C0f9.A03(2028636841);
                AbstractC167007dF.A0J().post(new GP0(this, (C32272EJh) this.A01));
                i = -2062561091;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 7:
                A03 = C0f9.A03(611884532);
                i = -1704246658;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-104300449);
                C32355ENc c32355ENc = (C32355ENc) this.A01;
                c32355ENc.A02 = false;
                EQM eqm = c32355ENc.A00;
                if (eqm != null) {
                    eqm.A0C = false;
                }
                AbstractC31177DnL.A18(c32355ENc, C56352iT.A0t, false);
                AbstractC31557Dth.A01(c32355ENc, false);
                i = 573602961;
                break;
            case 18:
                A03 = C0f9.A03(414951351);
                AbstractC31557Dth.A00(((Fragment) this.A01).mView, false);
                i = 337978759;
                break;
            case 25:
                A03 = C0f9.A03(-1745289291);
                AbstractC167007dF.A16(((ELl) ((ViewOnClickListenerC35682FpH) this.A01).A01).A04);
                i = -1802394082;
                break;
            case 32:
                A03 = C0f9.A03(-1159105590);
                C36392G3t c36392G3t = (C36392G3t) this.A01;
                C38262Gs5 c38262Gs5 = ((ReelDashboardFragment) c36392G3t.A01).mListAdapter;
                C38264Gs7 c38264Gs7 = (C38264Gs7) c38262Gs5.A0C.get(((C41181vS) c36392G3t.A02).A0j);
                if (c38264Gs7 != null) {
                    c38264Gs7.A0k.A07();
                }
                i = 1314255513;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 6:
                A03 = C0f9.A03(-1444696233);
                i = 1290212786;
                break;
            case 7:
                A03 = C0f9.A03(1322235914);
                i = 1406234886;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-1214587588);
                C32355ENc c32355ENc = (C32355ENc) this.A01;
                c32355ENc.A02 = true;
                EQM eqm = c32355ENc.A00;
                if (eqm != null) {
                    eqm.A0C = true;
                }
                AbstractC31177DnL.A18(c32355ENc, C56352iT.A0t, true);
                AbstractC31557Dth.A01(c32355ENc, true);
                i = 749661992;
                break;
            case 22:
                A03 = C0f9.A03(-2113875281);
                ENR enr = (ENR) this.A01;
                EnumC153216up enumC153216up = EnumC153216up.A06;
                EmptyStateView emptyStateView = enr.A01;
                if (emptyStateView != null) {
                    emptyStateView.A0P(enumC153216up);
                }
                i = 625379416;
                break;
            case 25:
                A03 = C0f9.A03(327058961);
                i = 89006107;
                break;
            case 26:
                A03 = C0f9.A03(-2099255106);
                i = -56753666;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x0792, code lost:
    
        if (X.AbstractC001800i.A0u(X.AbstractC34911FZx.A00, r1) != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x038c, code lost:
    
        if (r0.A06 != false) goto L86;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e0  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 2626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31714DwJ.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 20:
                A03 = C0f9.A03(1819793058);
                int A032 = C0f9.A03(-58100656);
                C23031Ai A00 = AbstractC23021Ah.A00((UserSession) this.A01);
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
                A0w.E7G(AbstractC111324zv.A00(1074), currentTimeMillis);
                A0w.apply();
                C0f9.A0A(1013077606, A032);
                i = -35391406;
                break;
            case 21:
            case 22:
            default:
                super.onSuccessInBackground(obj);
                return;
            case 23:
                A03 = C0f9.A03(-1610701840);
                int A033 = C0f9.A03(-775955793);
                C32272EJh c32272EJh = (C32272EJh) this.A01;
                InterfaceC09390do interfaceC09390do = c32272EJh.A09;
                User A0U = AbstractC31178DnM.A0U(interfaceC09390do);
                A0U.A03.EVl(Boolean.valueOf(c32272EJh.A05));
                A0U.A0c(AbstractC166987dD.A0o(interfaceC09390do));
                c32272EJh.A03 = true;
                C32272EJh.A01(c32272EJh);
                C0f9.A0A(1038189473, A033);
                i = 1502756683;
                break;
            case 24:
                A03 = C0f9.A03(-2115180556);
                int A034 = C0f9.A03(-811880820);
                C32272EJh c32272EJh2 = (C32272EJh) this.A01;
                InterfaceC09390do interfaceC09390do2 = c32272EJh2.A09;
                User A0U2 = AbstractC31178DnM.A0U(interfaceC09390do2);
                A0U2.A03.EZS(Boolean.valueOf(c32272EJh2.A04));
                A0U2.A0c(AbstractC166987dD.A0o(interfaceC09390do2));
                c32272EJh2.A06 = true;
                C32272EJh.A01(c32272EJh2);
                C0f9.A0A(1575881963, A034);
                i = -947536820;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
