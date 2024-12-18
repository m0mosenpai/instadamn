package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ProfilePicUrlInfo;
import com.instagram.api.schemas.TextPostAppUserFediverseInfo;
import com.instagram.api.schemas.UserRelatedAccountsInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.recommended.FollowListData;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GUn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37057GUn extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37057GUn(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C37057GUn(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ProfilePicUrlInfo profilePicUrlInfo = (ProfilePicUrlInfo) this.A01;
                if (profilePicUrlInfo != null) {
                    return profilePicUrlInfo.F7o();
                }
                return null;
            case 1:
                C5F4 c5f4 = (C5F4) this.A01;
                if (c5f4 != null) {
                    return c5f4.F7o();
                }
                return null;
            case 2:
                InterfaceC101464h8 interfaceC101464h8 = (InterfaceC101464h8) this.A01;
                if (interfaceC101464h8 != null) {
                    return interfaceC101464h8.F7o();
                }
                return null;
            case 3:
                InterfaceC81833l1 interfaceC81833l1 = (InterfaceC81833l1) this.A01;
                if (interfaceC81833l1 != null) {
                    return interfaceC81833l1.F7o();
                }
                return null;
            case 4:
                UserRelatedAccountsInfoDict userRelatedAccountsInfoDict = (UserRelatedAccountsInfoDict) this.A01;
                if (userRelatedAccountsInfoDict != null) {
                    return userRelatedAccountsInfoDict.F7o();
                }
                return null;
            case 5:
                InterfaceC223316m interfaceC223316m = (InterfaceC223316m) this.A01;
                if (interfaceC223316m != null) {
                    return interfaceC223316m.F7o();
                }
                return null;
            case 6:
                InterfaceC109984xS interfaceC109984xS = (InterfaceC109984xS) this.A01;
                if (interfaceC109984xS != null) {
                    return interfaceC109984xS.F7o();
                }
                return null;
            case 7:
                InterfaceC81183jn interfaceC81183jn = (InterfaceC81183jn) this.A01;
                if (interfaceC81183jn != null) {
                    return interfaceC81183jn.F7o();
                }
                return null;
            case 8:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                List list = (List) this.A01;
                if (list != null) {
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC31178DnM.A1U(A0q, it);
                    }
                    return A0q;
                }
                return null;
            case 9:
                List list2 = (List) this.A01;
                if (list2 != null) {
                    ArrayList A0q2 = AbstractC167017dG.A0q(list2);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        A0q2.add(((InterfaceC82273lo) it2.next()).F7o());
                    }
                    return A0q2;
                }
                return null;
            case 10:
                InterfaceC37270GbN interfaceC37270GbN = (InterfaceC37270GbN) this.A01;
                if (interfaceC37270GbN != null) {
                    return interfaceC37270GbN.F7o();
                }
                return null;
            case 11:
                List list3 = (List) this.A01;
                if (list3 != null) {
                    ArrayList A0q3 = AbstractC167017dG.A0q(list3);
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        A0q3.add(((InterfaceC106844rl) it3.next()).F7o());
                    }
                    return A0q3;
                }
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                List list4 = (List) this.A01;
                if (list4 != null) {
                    ArrayList A0q4 = AbstractC167017dG.A0q(list4);
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        A0q4.add(((C43K) it4.next()).F7o());
                    }
                    return A0q4;
                }
                return null;
            case 14:
                InterfaceC37263GbG interfaceC37263GbG = (InterfaceC37263GbG) this.A01;
                if (interfaceC37263GbG != null) {
                    return interfaceC37263GbG.F7o();
                }
                return null;
            case Process.SIGTERM /* 15 */:
                InterfaceC128105qe interfaceC128105qe = (InterfaceC128105qe) this.A01;
                if (interfaceC128105qe != null) {
                    return interfaceC128105qe.F7o();
                }
                return null;
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            default:
                InterfaceC111194zh interfaceC111194zh = (InterfaceC111194zh) this.A01;
                if (interfaceC111194zh != null) {
                    return interfaceC111194zh.F7o();
                }
                return null;
            case 20:
                InterfaceC43578JMm interfaceC43578JMm = (InterfaceC43578JMm) this.A01;
                if (interfaceC43578JMm != null) {
                    return interfaceC43578JMm.F7o();
                }
                return null;
            case 21:
                InterfaceC223716s interfaceC223716s = (InterfaceC223716s) this.A01;
                if (interfaceC223716s != null) {
                    return interfaceC223716s.F7o();
                }
                return null;
            case 22:
                InterfaceC43518JKe interfaceC43518JKe = (InterfaceC43518JKe) this.A01;
                if (interfaceC43518JKe != null) {
                    return interfaceC43518JKe.F7o();
                }
                return null;
            case 23:
                InterfaceC1119953o interfaceC1119953o = (InterfaceC1119953o) this.A01;
                if (interfaceC1119953o != null) {
                    return interfaceC1119953o.F7o();
                }
                return null;
            case 24:
                TextPostAppUserFediverseInfo textPostAppUserFediverseInfo = (TextPostAppUserFediverseInfo) this.A01;
                if (textPostAppUserFediverseInfo != null) {
                    return textPostAppUserFediverseInfo.F7o();
                }
                return null;
            case 25:
                List list5 = (List) this.A01;
                if (list5 != null) {
                    ArrayList A0q5 = AbstractC167017dG.A0q(list5);
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        A0q5.add(((UpcomingEvent) it5.next()).F7o());
                    }
                    return A0q5;
                }
                return null;
            case 26:
                return AbstractC31172DnG.A13(AbstractC31179DnN.A04(this.A01), "MuteSettingsFragment.ARG_SELECTED_FROM");
            case 27:
                return AbstractC31172DnG.A13(AbstractC31179DnN.A04(this.A01), "MuteSettingsFragment.ARG_DISPLAYED_USER_ID");
            case 28:
                return new C31508Dss((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC31179DnN.A04(this.A01).getString("CommentPollVotersListFragment.MEDIA_ID");
            case 30:
                return AbstractC31171DnF.A0D(AnonymousClass001.A0R(AbstractC31172DnG.A13(AbstractC31179DnN.A04(this.A01), "CommentPollVotersListFragment.SOURCE_MODULE"), "_comment_poll_voters"));
            case 31:
                return AbstractC31179DnN.A04(this.A01).getString("CommentPollVotersListFragment.POLL_ID");
            case 32:
                ENS ens = (ENS) this.A01;
                return new C38E((InterfaceC11380iw) ens.A03.getValue(), AbstractC166987dD.A0r(ens.A07), new C38C(ens));
            case 33:
                return Boolean.valueOf(AbstractC31172DnG.A1X(AbstractC31179DnN.A04(this.A01), "CommentPollVotersListFragment.SHOULD_SHOW_EMPTY_STATE"));
            case 34:
                return this.A01;
            case 35:
                return AbstractC25226BEj.A1C(this.A01);
            case 36:
                return AbstractC167027dH.A0B(this.A01);
            case 37:
                return new EW2(AbstractC166987dD.A0r(((ENS) this.A01).A07));
            case 38:
                return C17060sy.A01.A01(C31535DtK.A03((C31535DtK) this.A01));
            case 39:
                return FCX.A00(C31535DtK.A03((C31535DtK) this.A01));
            case 40:
                FollowListData followListData = ((C31535DtK) this.A01).A0D;
                if (followListData == null) {
                    C14360o3.A0F("followListData");
                    throw C00O.createAndThrow();
                }
                int ordinal = followListData.A00.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 0) {
                        return null;
                    }
                    return EnumC33366Eoz.A04;
                }
                return EnumC33366Eoz.A05;
            case Seq.NULL_REFNUM /* 41 */:
                return AnonymousClass189.A00(C31535DtK.A03((C31535DtK) this.A01));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new FQ7((UserSession) this.A01);
            case 43:
                return C17060sy.A01.A01(((FQ7) this.A01).A00);
            case 44:
                C26707Bqo c26707Bqo = (C26707Bqo) this.A01;
                C38321qM A02 = AbstractC31176DnK.A0Z(c26707Bqo.A01).A02(c26707Bqo.requireArguments().getString("arg_media_id"));
                if (A02 != null) {
                    return A02;
                }
                throw AbstractC166987dD.A14("Media must not be null");
            case 45:
                EN1 en1 = (EN1) this.A01;
                return FCZ.A00(en1.requireArguments(), AbstractC166987dD.A0r(en1.A05));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return Boolean.valueOf(AbstractC31172DnG.A1X(AbstractC31179DnN.A04(this.A01), AbstractC111324zv.A00(85)));
            case 47:
                EN1 en12 = (EN1) this.A01;
                InterfaceC09390do interfaceC09390do = en12.A05;
                MTJ mtj = new MTJ(AbstractC166987dD.A0r(interfaceC09390do), "likers", 31784966);
                AbstractC31178DnM.A0m(en12.requireContext(), mtj, en12, interfaceC09390do);
                return mtj;
            case 48:
                EN1 en13 = (EN1) this.A01;
                return new C27897CRi(en13, AbstractC166987dD.A0r(en13.A05), en13.getModuleName());
            case 49:
                C27897CRi c27897CRi = (C27897CRi) ((EN1) this.A01).A04.getValue();
                C12260kU.A0G(c27897CRi.A00.requireContext(), AbstractC08820cl.A03(MSV.A00(49)));
                return C0eB.A00;
        }
    }
}
