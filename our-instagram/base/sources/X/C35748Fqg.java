package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Fqg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35748Fqg implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C35748Fqg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        String str;
        long j;
        EnumC33465Er0 enumC33465Er0;
        Long A0j;
        String str2;
        switch (this.A00) {
            case 0:
                EO4 eo4 = (EO4) this.A01;
                switch (C05F.A00(3)[i].intValue()) {
                    case 1:
                        str = "CALL";
                        break;
                    case 2:
                        str = "TEXT";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                eo4.A03 = str;
                if (eo4.A01 == null || TextUtils.isEmpty(AbstractC167007dF.A0g(eo4.A02.A01))) {
                    return;
                }
                EO4.A00(eo4);
                if (!eo4.A03.equals(eo4.A04)) {
                    eo4.A05 = true;
                }
                eo4.A01.setEnabled(eo4.A05);
                return;
            case 1:
                C34433FFx c34433FFx = ((C33217El5) this.A01).A00;
                if (c34433FFx == null) {
                    return;
                }
                EnumC160877Iv enumC160877Iv = (EnumC160877Iv) C33217El5.A02.get(i);
                C14360o3.A0B(enumC160877Iv, 0);
                G3C g3c = c34433FFx.A00;
                InterfaceC83733oI interfaceC83733oI = g3c.A03.A06;
                if (interfaceC83733oI == null) {
                    return;
                }
                K3a A01 = LIu.A01(g3c.A02);
                long j2 = AbstractC1345466e.A03(interfaceC83733oI).A00;
                int i2 = enumC160877Iv.A00;
                InterfaceExecutorC135866Co ASj = A01.mMailboxApiHandleMetaProvider.ASj(0);
                MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                String A00 = AbstractC43591JPw.A00(1294);
                int A002 = AbstractC1346866s.A00(mailboxFutureImpl);
                TraceInfo A012 = AbstractC1346866s.A01(mailboxFutureImpl, "MailboxTam", A00);
                if (!ASj.ELJ(new C48178LUc(A002, i2, 2, j2, A01, mailboxFutureImpl))) {
                    mailboxFutureImpl.cancel(false);
                    AbstractC1346866s.A02(A002);
                    AbstractC1346866s.A03(A012, "MailboxTam", A00);
                }
                PlatformLogger.platformEventLog(5);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(g3c.A01, "direct_thread_change_membership_controls");
                if (!A0f.isSampled()) {
                    return;
                }
                String A07 = AbstractC1345466e.A07(interfaceC83733oI);
                if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                A0f.A9K(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, Long.valueOf(j));
                int ordinal = enumC160877Iv.ordinal();
                if (ordinal != 0 && ordinal != 2) {
                    if (ordinal == 1) {
                        enumC33465Er0 = EnumC33465Er0.ALL_MEMBERS;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    enumC33465Er0 = EnumC33465Er0.ADMIN_ONLY;
                }
                A0f.A8R(enumC33465Er0, "new_setting");
                A0f.Cht();
                return;
            case 2:
                ENm eNm = (ENm) this.A01;
                List list = eNm.A05;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (i == ((View) list.get(i3)).getId()) {
                        eNm.A00 = i3;
                    }
                }
                return;
            case 3:
                Fragment targetFragment = ((Fragment) this.A01).getTargetFragment();
                if (targetFragment != null) {
                    C33216El4 c33216El4 = (C33216El4) targetFragment;
                    C14360o3.A0A(c33216El4);
                    UserSession userSession = c33216El4.A00;
                    if (userSession != null) {
                        InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
                        A0e.E7D("data_saver_network_resources_quality", i);
                        A0e.apply();
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw AbstractC166997dE.A0g();
            default:
                C56719PFl c56719PFl = (C56719PFl) this.A01;
                DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr = c56719PFl.A0E;
                if (directMessageInteropReachabilityOptionsArr != null) {
                    DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = directMessageInteropReachabilityOptionsArr[i];
                    C52779NXm c52779NXm = c56719PFl.A02;
                    if (c52779NXm != null) {
                        String str3 = c56719PFl.A0A;
                        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = c56719PFl.A00;
                        if (directMessageInteropReachabilityOptions2 == null || (str2 = directMessageInteropReachabilityOptions2.A03) == null) {
                            str2 = "";
                        }
                        String str4 = directMessageInteropReachabilityOptions.A03;
                        C57252Pba c57252Pba = new C57252Pba(24, directMessageInteropReachabilityOptions, c56719PFl);
                        C37061GUv A013 = C37061GUv.A01(c56719PFl, 31);
                        AbstractC167017dG.A1Q(str3, str4);
                        FXR.A01(c52779NXm, AbstractC166987dD.A0r(c52779NXm.A04), str3, str2, str4, C37061GUv.A01(A013, 32), C37061GUv.A01(c57252Pba, 33));
                    }
                    C52779NXm c52779NXm2 = c56719PFl.A02;
                    if (c52779NXm2 != null) {
                        InterfaceC09390do interfaceC09390do = c52779NXm2.A04;
                        if (C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(interfaceC09390do), 36318410958903429L)) {
                            HashMap A0F = AbstractC25230BEn.A0l(interfaceC09390do).A0F();
                            A0F.put("UPDATE_MESSAGING_SETTING", new IGSupervisionUpsellEligibilityStatus(true));
                            AbstractC25230BEn.A0l(interfaceC09390do).A17(A0F);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
