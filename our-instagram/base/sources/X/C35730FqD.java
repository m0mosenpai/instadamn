package X;

import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.FqD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35730FqD implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C35730FqD(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.1oQ, X.1OW] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String A0g;
        String str;
        ArrayList A1E;
        LGj lGj;
        String str2;
        EnumC82333lv enumC82333lv;
        String str3;
        Integer num;
        InterfaceC19610xo A0w;
        boolean z2;
        int i;
        boolean z3;
        Object value;
        List list;
        switch (this.A00) {
            case 0:
                Integer num2 = ((C33599EtB) this.A01).A00.A01;
                if (num2 == null) {
                    return;
                }
                C31867DzZ c31867DzZ = (C31867DzZ) this.A02;
                int intValue = num2.intValue();
                C32308EKv c32308EKv = c31867DzZ.A00;
                RecyclerView recyclerView = c32308EKv.A00;
                boolean z4 = true;
                if (recyclerView == null || recyclerView.A1D()) {
                    return;
                }
                java.util.Set set = c32308EKv.A0A;
                if (!z) {
                    Integer valueOf = Integer.valueOf(intValue);
                    if (set.contains(valueOf)) {
                        set.remove(valueOf);
                    }
                } else {
                    set.add(Integer.valueOf(intValue));
                }
                for (C33599EtB c33599EtB : c32308EKv.A07) {
                    C32188ECj c32188ECj = c33599EtB.A00;
                    Integer num3 = c32188ECj.A01;
                    if (num3 != null && num3.intValue() == intValue) {
                        c32188ECj.A00 = Boolean.valueOf(z);
                    }
                    if (z) {
                        if (set.size() == 2 && !AbstractC001800i.A0u(set, c32188ECj.A01)) {
                            z3 = false;
                            c33599EtB.A01 = z3;
                        }
                    } else {
                        z3 = true;
                        if (set.size() == 1) {
                            c33599EtB.A01 = z3;
                        }
                    }
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = c32308EKv.A04;
                if (igdsBottomButtonLayout != null) {
                    if (set.size() != 2) {
                        z4 = false;
                    }
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(z4);
                }
                C31867DzZ c31867DzZ2 = c32308EKv.A01;
                if (c31867DzZ2 == null) {
                    str3 = "adapter";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                List list2 = c32308EKv.A07;
                C14360o3.A0B(list2, 0);
                AbstractC31175DnJ.A0x(c31867DzZ2, list2, c31867DzZ2.A01);
                return;
            case 1:
                Integer num4 = ((C32187ECi) this.A01).A01;
                if (num4 == null) {
                    return;
                }
                C31868Dza c31868Dza = (C31868Dza) this.A02;
                int intValue2 = num4.intValue();
                C32307EKu c32307EKu = c31868Dza.A00;
                RecyclerView recyclerView2 = c32307EKu.A00;
                if (recyclerView2 == null || recyclerView2.A1D()) {
                    return;
                }
                java.util.Set set2 = c32307EKu.A09;
                if (!z) {
                    Integer valueOf2 = Integer.valueOf(intValue2);
                    if (set2.contains(valueOf2)) {
                        set2.remove(valueOf2);
                    }
                } else {
                    set2.add(Integer.valueOf(intValue2));
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = c32307EKu.A04;
                if (igdsBottomButtonLayout2 == null) {
                    return;
                }
                igdsBottomButtonLayout2.setPrimaryButtonEnabled(AbstractC31171DnF.A1b(set2));
                return;
            case 2:
                if (!z) {
                    return;
                }
                ((C31804DyO) ((EIY) this.A02).A03.getValue()).A00.Egh(AbstractC34032F0l.A00((Integer) this.A01));
                return;
            case 3:
                boolean z5 = ((C32063E6p) this.A01).A04;
                C27276C2b c27276C2b = (C27276C2b) this.A02;
                if (z5) {
                    A0g = AbstractC31173DnH.A0t(c27276C2b.A04);
                } else {
                    A0g = AbstractC31171DnF.A0g(c27276C2b.A03.getValue());
                }
                BP5 bp5 = (BP5) c27276C2b.A02.getValue();
                C14360o3.A0B(A0g, 1);
                if (z) {
                    str = "thread_details_auto_reply_toggle_on";
                } else {
                    str = "thread_details_auto_reply_toggle_off";
                }
                BP5.A00(bp5, AbstractC166997dE.A0j(A0g), str);
                C25839Bbu c25839Bbu = (C25839Bbu) c27276C2b.A06.getValue();
                LinkedHashMap A03 = AbstractC06930Yk.A03(c25839Bbu.A04);
                Boolean valueOf3 = Boolean.valueOf(z);
                UserSession userSession = c25839Bbu.A00;
                A03.put(userSession.userId, valueOf3);
                C26141Ov A01 = C26141Ov.A01(userSession);
                String str4 = c25839Bbu.A03;
                ?? c1ow = new C1OW(null, null, 1);
                c1ow.A01 = A03;
                c1ow.A00 = str4;
                A01.A0B(c1ow);
                return;
            case 4:
                C32709Eaa c32709Eaa = (C32709Eaa) this.A02;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                FFF fff = c32709Eaa.A00;
                MessageIdentifier messageIdentifier = ((G49) this.A01).A03;
                C14360o3.A0B(messageIdentifier, 0);
                DirectCardGalleryRepository directCardGalleryRepository = fff.A00.A0E().A06;
                String str5 = messageIdentifier.A01;
                C05A c05a = directCardGalleryRepository.A0F;
                AbstractCollection abstractCollection = (AbstractCollection) c05a.getValue();
                if (abstractCollection != null && abstractCollection.contains(str5)) {
                    A1E = AbstractC166987dD.A1E();
                    RandomAccess randomAccess = (ArrayList) c05a.getValue();
                    if (randomAccess == null) {
                        randomAccess = C16930sl.A00;
                    }
                    A1E.addAll(randomAccess);
                    A1E.remove(str5);
                } else {
                    A1E = AbstractC166987dD.A1E();
                    RandomAccess randomAccess2 = (ArrayList) c05a.getValue();
                    if (randomAccess2 == null) {
                        randomAccess2 = C16930sl.A00;
                    }
                    A1E.addAll(randomAccess2);
                    A1E.add(str5);
                }
                c05a.Egh(A1E);
                return;
            case 5:
                ((AbstractC31791DyA) ((EL4) this.A02).A0I.getValue()).A02 = Boolean.valueOf(z);
                ((IgdsListCell) this.A01).setChecked(z);
                return;
            case 6:
                if (!z) {
                    return;
                }
                C31805DyP c31805DyP = (C31805DyP) ((C32249EIi) this.A02).A04.getValue();
                EnumC33411Epi enumC33411Epi = (EnumC33411Epi) this.A01;
                C14360o3.A0B(enumC33411Epi, 0);
                C05A c05a2 = c31805DyP.A00;
                do {
                    value = c05a2.getValue();
                    list = (List) ((C51761Mtk) value).A00;
                    C14360o3.A0B(list, 1);
                } while (!c05a2.AIi(value, new C51761Mtk(enumC33411Epi, list)));
                return;
            case 7:
                String str6 = ((FR9) this.A02).A01;
                if (str6 == null) {
                    return;
                }
                ((FP8) this.A01).A00(str6, z);
                return;
            case 8:
                C2056398n c2056398n = (C2056398n) this.A01;
                AbstractC167007dF.A1L(c2056398n, c2056398n.A0T, C2056398n.A0d, 7, z);
                lGj = ((C33198Ekl) this.A02).A00;
                str2 = null;
                if (lGj != null) {
                    enumC82333lv = EnumC82333lv.A08;
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("enabled", String.valueOf(z));
                    AbstractC31171DnF.A1T("settings", A1G);
                    LGj.A00(lGj, enumC82333lv, AbstractC43591JPw.A00(1353), str2, A1G);
                    return;
                }
                str3 = "suggestedReplyLogger";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 9:
                C2056398n c2056398n2 = (C2056398n) this.A01;
                AbstractC167007dF.A1L(c2056398n2, c2056398n2.A0U, C2056398n.A0d, 8, z);
                lGj = ((C33198Ekl) this.A02).A00;
                str2 = null;
                if (lGj != null) {
                    enumC82333lv = EnumC82333lv.A07;
                    HashMap A1G2 = AbstractC166987dD.A1G();
                    A1G2.put("enabled", String.valueOf(z));
                    AbstractC31171DnF.A1T("settings", A1G2);
                    LGj.A00(lGj, enumC82333lv, AbstractC43591JPw.A00(1353), str2, A1G2);
                    return;
                }
                str3 = "suggestedReplyLogger";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 10:
                UserSession userSession2 = (UserSession) this.A02;
                C36286Fzd A00 = AbstractC34058F1l.A00(userSession2);
                String str7 = userSession2.userId;
                String id = ((C32107E9f) this.A01).A00.getId();
                C14360o3.A0B(str7, 0);
                C40701ud A012 = AbstractC40691uc.A01(A00.A00);
                C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str7, "business_ig_id");
                C0CA.A00(A0T, id, "consumer_ig_id");
                Boolean valueOf4 = Boolean.valueOf(z);
                C0CA.A00(A0T, valueOf4, AbstractC43591JPw.A00(186));
                C2JM A0b = AbstractC25225BEi.A0b();
                A012.ATV(new C35799Frb(0, A00, z), C35843FsJ.A00, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "data"), "AdsEventSharingSettingsSetConsumerOptInStatusMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59381Qde.class, true, null, 64, null, "xfb_set_consumer_opt_in_status_for_biig_ads_event_sharing_settings", AbstractC166987dD.A1E()));
                A00.A02 = valueOf4;
                return;
            case 11:
                C33226ElG c33226ElG = (C33226ElG) this.A02;
                boolean z6 = !z;
                Object obj = this.A01;
                C40701ud c40701ud = c33226ElG.A04;
                if (c40701ud == null) {
                    return;
                }
                C2JM A0b2 = AbstractC25225BEi.A0b();
                C2JM A0b3 = AbstractC25225BEi.A0b();
                AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(GraphQlCallInput.A02, Boolean.valueOf(z6), "is_seo_indexing_opted_out"), A0b2.A00, "data");
                c40701ud.ATV(new C35799Frb(1, c33226ElG, z6), new C31463Ds7(obj, 11), AbstractC35854FsU.A00(A0b2, A0b3));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C33226ElG c33226ElG2 = (C33226ElG) this.A02;
                User user = (User) this.A01;
                if (z) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A01;
                }
                C33226ElG.A03(c33226ElG2, user, num, false);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C33226ElG c33226ElG3 = (C33226ElG) this.A02;
                User user2 = (User) this.A01;
                user2.A03.Ebl(Boolean.valueOf(z));
                C25621Ms A0c = AbstractC167017dG.A0c(AbstractC166987dD.A0o(c33226ElG3.A0E));
                A0c.A0B("users/update_profile_picture_expansion_setting/");
                A0c.A0I("enable_profile_picture_expansion", z);
                C1ON A0Q = AbstractC31177DnL.A0Q(A0c);
                A0Q.A00 = new C32545EUv(9, user2, c33226ElG3, z);
                c33226ElG3.schedule(A0Q);
                return;
            case 14:
                C35042FcF c35042FcF = (C35042FcF) this.A02;
                C14510oO c14510oO = (C14510oO) this.A01;
                if (!c14510oO.A00) {
                    c14510oO.A00 = true;
                    return;
                }
                compoundButton.setEnabled(false);
                UserSession userSession3 = c35042FcF.A04;
                C35830Fs6 c35830Fs6 = new C35830Fs6(3, compoundButton, c35042FcF);
                C35830Fs6 c35830Fs62 = new C35830Fs6(4, compoundButton, c35042FcF);
                C35800Frc c35800Frc = new C35800Frc(compoundButton, c14510oO, z);
                if (z) {
                    FVL.A01(c35800Frc, c35830Fs6, userSession3, C16930sl.A00, true);
                    return;
                } else {
                    FVL.A00(c35800Frc, c35830Fs62, userSession3, C16930sl.A00, true);
                    return;
                }
            case Process.SIGTERM /* 15 */:
                C33216El4 c33216El4 = (C33216El4) this.A02;
                if (z) {
                    C33216El4.A00(c33216El4, false);
                    A0w = AbstractC166987dD.A0w((C23031Ai) this.A01);
                    A0w.E7D("data_saver_mode_on", 1);
                } else {
                    C33216El4.A00(c33216El4, true);
                    A0w = AbstractC166987dD.A0w((C23031Ai) this.A01);
                    A0w.E7D("data_saver_mode_on", 0);
                }
                A0w.apply();
                return;
            case 16:
                UserSession userSession4 = ((C33216El4) this.A02).A00;
                C14360o3.A0A(userSession4);
                C14360o3.A0B(userSession4, 1);
                C1QT A002 = C1QS.A00(userSession4);
                String A003 = AbstractC111324zv.A00(1362);
                InterfaceC19610xo A0w2 = AbstractC166987dD.A0w((C23031Ai) this.A01);
                if (z) {
                    A0w2.E7D(MSV.A00(463), 1);
                    A0w2.apply();
                    z2 = false;
                    AbstractC35091Fd2.A01(null, userSession4, A003, MSV.A00(1228), null);
                    i = 681252206;
                } else {
                    A0w2.E7D(MSV.A00(463), 0);
                    A0w2.apply();
                    z2 = false;
                    AbstractC35091Fd2.A01(null, userSession4, A003, MSV.A00(1227), null);
                    i = 681257100;
                }
                long flowStartForMarker = A002.flowStartForMarker(i, A003, z2);
                A002.flowAnnotate(flowStartForMarker, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A003);
                A002.flowEndSuccess(flowStartForMarker);
                return;
            case 17:
                FJF fjf = (FJF) this.A02;
                C35272Fh7 c35272Fh7 = fjf.A00;
                AbstractC35076Fcn.A02(c35272Fh7.A03, c35272Fh7.A04, "logout_d1_toggle_tapped", fjf.A01, z);
                return;
            default:
                C14360o3.A0B(compoundButton, 0);
                C36731GHa c36731GHa = (C36731GHa) this.A02;
                c36731GHa.A0D = z;
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = c36731GHa.A08;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
        }
    }
}
