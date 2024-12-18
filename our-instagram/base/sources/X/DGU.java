package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallLaunchConfig;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallPostItem;
import go.Seq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DGU extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DGU(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static DGU A00(C5Tl c5Tl, Object obj, int i) {
        DGU dgu = new DGU(obj, i);
        c5Tl.FBy(dgu);
        return dgu;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AbstractC52922bZ abstractC52922bZ;
        C141796aw A00;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        C25884Bck c25884Bck;
        WallMenuConfig wallMenuConfig;
        ArrayList A0q;
        boolean z;
        switch (this.A00) {
            case 0:
                ((C27955CTv) this.A01).A00();
                return C0eB.A00;
            case 1:
                ((L86) this.A01).A00();
                return C0eB.A00;
            case 2:
                AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A01, false);
                return C0eB.A00;
            case 3:
                return ((C27955CTv) this.A01).A00.getValue();
            case 4:
                return Integer.valueOf(AbstractC25231BEo.A0E(((CT6) this.A01).A05));
            case 5:
                C27955CTv c27955CTv = (C27955CTv) this.A01;
                return Boolean.valueOf(C14360o3.A0K(c27955CTv.A01.A06.getValue(), c27955CTv.A02));
            case 6:
                abstractC52922bZ = (AbstractC52922bZ) this.A01;
                A00 = AbstractC141776au.A00(abstractC52922bZ);
                interfaceC23621Ds = null;
                i = 28;
                AbstractC166987dD.A1Z(new PYu(abstractC52922bZ, interfaceC23621Ds, i), A00);
                return C0eB.A00;
            case 7:
                return Boolean.valueOf(AbstractC167007dF.A1O(((LazyStaggeredGridState) this.A01).A0D.A05.BIi()));
            case 8:
                abstractC52922bZ = (AbstractC52922bZ) this.A01;
                A00 = AbstractC141776au.A00(abstractC52922bZ);
                interfaceC23621Ds = null;
                i = 32;
                AbstractC166987dD.A1Z(new PYu(abstractC52922bZ, interfaceC23621Ds, i), A00);
                return C0eB.A00;
            case 9:
                ((C25868BcP) this.A01).A01();
                return C0eB.A00;
            case 10:
            case Process.SIGTERM /* 15 */:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 11:
                ((C25884Bck) this.A01).A04(false);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c25884Bck = (C25884Bck) this.A01;
                wallMenuConfig = new WallMenuConfig();
                wallMenuConfig.A00 = AbstractC25228BEl.A10(2131976991);
                List<User> list = ((WallPostItem) ((C26066Bfu) c25884Bck.A0A.getValue()).A02).Bez().A08;
                A0q = AbstractC167017dG.A0q(list);
                for (User user : list) {
                    A0q.add(C25884Bck.A00(user, null, new C29895DGj(34, user, c25884Bck), false));
                }
                wallMenuConfig.A01.addAll(A0q);
                C25884Bck.A02(new C29443CyJ(wallMenuConfig), c25884Bck);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c25884Bck = (C25884Bck) this.A01;
                c25884Bck.A04(false);
                A0q = AbstractC166987dD.A1E();
                List<User> list2 = c25884Bck.A05;
                if (list2.size() > 1) {
                    A0q.add(C25884Bck.A00((User) AbstractC001800i.A0I(list2), (User) list2.get(1), C29892DGg.A00(c25884Bck, 15), AbstractC167007dF.A1P(c25884Bck.A06.size(), list2.size())));
                }
                ArrayList A0q2 = AbstractC167017dG.A0q(list2);
                for (User user2 : list2) {
                    List list3 = c25884Bck.A06;
                    if (list3.size() == 1) {
                        z = true;
                        if (C14360o3.A0K(((User) AbstractC001800i.A0I(list3)).getId(), user2.getId())) {
                            A0q2.add(C25884Bck.A00(user2, null, new C29895DGj(35, user2, c25884Bck), z));
                        }
                    }
                    z = false;
                    A0q2.add(C25884Bck.A00(user2, null, new C29895DGj(35, user2, c25884Bck), z));
                }
                A0q.addAll(A0q2);
                if (AbstractC25226BEj.A1b(A0q)) {
                    wallMenuConfig = new WallMenuConfig();
                    wallMenuConfig.A00 = AbstractC25228BEl.A10(2131976988);
                    wallMenuConfig.A01.addAll(A0q);
                    C25884Bck.A02(new C29443CyJ(wallMenuConfig), c25884Bck);
                }
                return C0eB.A00;
            case 14:
                C25884Bck c25884Bck2 = (C25884Bck) this.A01;
                c25884Bck2.A04(false);
                List list4 = c25884Bck2.A06;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    User A02 = ((C18A) c25884Bck2.A07.getValue()).A02(AbstractC25226BEj.A15(it).getId());
                    if (A02 != null) {
                        A1E.add(A02);
                    }
                }
                C0UO c0uo = c25884Bck2.A0B;
                String str = ((C5C3) ((C26066Bfu) c0uo.getValue()).A05).A01.A00;
                if (!A1E.isEmpty() && str.length() != 0) {
                    ArrayList A0q3 = AbstractC167017dG.A0q(A1E);
                    Iterator it2 = A1E.iterator();
                    while (it2.hasNext()) {
                        A0q3.add(new PendingRecipient(AbstractC25226BEj.A15(it2)));
                    }
                    C122145g6 c122145g6 = new C122145g6(A0q3);
                    DirectShareTarget directShareTarget = new DirectShareTarget(c122145g6, null, c122145g6.A00, false);
                    WallPostItem wallPostItem = (WallPostItem) ((C26066Bfu) c0uo.getValue()).A02;
                    UserSession userSession = c25884Bck2.A01;
                    String str2 = wallPostItem.Bez().A06;
                    C14360o3.A0B(str2, 3);
                    if (directShareTarget.A01() instanceof InterfaceC83703oF) {
                        C7YG A002 = C7YF.A00(userSession);
                        InterfaceC83713oG A01 = directShareTarget.A01();
                        C14360o3.A0C(A01, AbstractC43591JPw.A00(86));
                        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
                        C14360o3.A07(unmodifiableList);
                        A002.A02((InterfaceC83703oF) A01, unmodifiableList, new C50366MLs(userSession, directShareTarget, str2, str, (String) null, 5), true);
                    }
                    c25884Bck2.Eln(AbstractC25228BEl.A10(2131973315));
                }
                C25884Bck.A03(c25884Bck2, DQ4.A00);
                return C0eB.A00;
            case 16:
                return new C27004Bvj(AbstractC166987dD.A0r(((N5A) this.A01).A01));
            case 17:
            case 23:
            case 27:
            case 33:
            case 45:
                return this.A01;
            case 18:
            case 24:
            case 28:
            case 34:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC25226BEj.A1C(this.A01);
            case Process.SIGSTOP /* 19 */:
            case 25:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 35:
            case 47:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 20:
            case 39:
            case 49:
                return C56352iT.A0t.A04((Fragment) this.A01);
            case 21:
                C26763Brk c26763Brk = (C26763Brk) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c26763Brk.A04);
                Parcelable parcelable = c26763Brk.requireArguments().getParcelable(AbstractC111324zv.A00(1931));
                if (parcelable != null) {
                    return new C27023Bw2(A0r, (WallLaunchConfig) parcelable);
                }
                throw AbstractC166997dE.A0g();
            case 22:
                ((C26763Brk) this.A01).A01 = null;
                return C0eB.A00;
            case 26:
                AbstractC52113N4l abstractC52113N4l = (AbstractC52113N4l) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(abstractC52113N4l.A06);
                EnumC53206Ng4 enumC53206Ng4 = (EnumC53206Ng4) abstractC52113N4l.A04.getValue();
                InterfaceC09390do interfaceC09390do = abstractC52113N4l.A05;
                InterfaceC15070pN interfaceC15070pN = ((C51014MgM) interfaceC09390do.getValue()).A04;
                Context requireContext = abstractC52113N4l.requireContext();
                C08790ch A003 = AbstractC018607g.A00(abstractC52113N4l);
                C0eR c0eR = abstractC52113N4l.mLifecycleRegistry;
                C14360o3.A07(c0eR);
                return new C52322NDl(requireContext, c0eR, A003, A0r2, enumC53206Ng4, ((C51014MgM) interfaceC09390do.getValue()).A01, interfaceC15070pN);
            case 30:
                int i2 = ((Fragment) this.A01).requireArguments().getInt("wall_media_picker_tab_type");
                for (EnumC53206Ng4 enumC53206Ng42 : EnumC53206Ng4.values()) {
                    if (enumC53206Ng42.A00 == i2) {
                        return enumC53206Ng42;
                    }
                }
                return EnumC53206Ng4.A04;
            case 31:
                Fragment fragment = ((Fragment) this.A01).mParentFragment;
                C14360o3.A0C(fragment, "null cannot be cast to non-null type com.instagram.wonderwall.ui.fragment.WallMediaPickerTabFragment");
                return ((N5H) fragment).A07.getValue();
            case 32:
                C1UC requireActivity = ((Fragment) this.A01).requireActivity();
                C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(21));
                return ((C2d4) requireActivity).AYT();
            case 36:
                return new C52266NBh(AbstractC166987dD.A0r(((N5H) this.A01).A06));
            case 37:
                Parcelable parcelable2 = ((Fragment) this.A01).requireArguments().getParcelable(MSV.A00(934));
                if (parcelable2 != null) {
                    return parcelable2;
                }
                throw AbstractC166997dE.A0g();
            case 38:
                ((KDC) this.A01).A02.getValue();
                return new Object();
            case 40:
                C26809BsX c26809BsX = (C26809BsX) this.A01;
                return new C27043BwN(AbstractC166987dD.A0r(c26809BsX.A06), (WallInfo) c26809BsX.A07.getValue(), (WallPostItem) c26809BsX.requireArguments().getParcelable(MSV.A00(935)), c26809BsX.requireArguments().getString(MSV.A00(1717)));
            case Seq.NULL_REFNUM /* 41 */:
                Fragment fragment2 = (Fragment) this.A01;
                return new C48781Lho(fragment2.requireActivity(), C30482DbR.A00(fragment2, 34));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C26809BsX c26809BsX2 = (C26809BsX) this.A01;
                UserSession A0r3 = AbstractC166987dD.A0r(c26809BsX2.A06);
                C8BK c8bk = c26809BsX2.A01;
                C8BM c8bm = c26809BsX2.A00;
                AbstractC25233BEq.A0v(1, A0r3, c8bk, c8bm);
                Context requireContext2 = c26809BsX2.requireContext();
                EnumC1810381f enumC1810381f = EnumC1810381f.A05;
                ImmutableList of = ImmutableList.of((Object) AudioTrackType.A03, (Object) AudioTrackType.A04);
                C14360o3.A07(of);
                return new C8BP(requireContext2, null, of, MusicProduct.A0Q, c26809BsX2, A0r3, null, null, null, c8bm, c8bk, null, C8BO.A09, enumC1810381f, null, false, true, false, true, false);
            case 43:
                C25868BcP c25868BcP = (C25868BcP) ((C26809BsX) this.A01).A03.getValue();
                AudioOverlayTrack audioOverlayTrack = c25868BcP.A00;
                if (audioOverlayTrack != null) {
                    C25868BcP.A00(new C29436CyC(audioOverlayTrack), c25868BcP);
                }
                return C0eB.A00;
            case 44:
                ((C25868BcP) ((C26809BsX) this.A01).A03.getValue()).A02(true);
                return C0eB.A00;
            case 48:
                Parcelable parcelable3 = ((Fragment) this.A01).requireArguments().getParcelable(MSV.A00(959));
                if (parcelable3 != null) {
                    return parcelable3;
                }
                throw AbstractC166997dE.A0g();
        }
    }
}
