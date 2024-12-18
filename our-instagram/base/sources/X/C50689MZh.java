package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.archive.fragment.ArchiveReelPeopleFragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.MZh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50689MZh extends C1P1 {
    public final int A00;
    public final Object A01;

    public C50689MZh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C1ON c1on, Object obj, int i) {
        c1on.A00 = new C50689MZh(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int A032;
        int i2;
        String str;
        String str2;
        int A033;
        Integer num;
        BroadcastFailureType broadcastFailureType;
        int i3;
        String str3;
        Integer num2;
        int i4;
        switch (this.A00) {
            case 0:
                A032 = C0f9.A03(-1621337476);
                C9GR.A0A(AbstractC31172DnG.A06(this.A01), "fetchPeopleList_error");
                i2 = -1564434448;
                C0f9.A0A(i2, A032);
                return;
            case 1:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 368648292);
                super.onFail(abstractC115105If);
                C9GR.A07(AbstractC31172DnG.A07(this.A01), 2131972429);
                i2 = -1397663098;
                C0f9.A0A(i2, A032);
                return;
            case 2:
                A03 = C0f9.A03(107281304);
                N6L n6l = (N6L) this.A01;
                C9GR.A09(n6l.getContext(), AbstractC166997dE.A0N(n6l).getString(2131961896));
                SpinnerImageView spinnerImageView = n6l.A03;
                str = "spinner";
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(C3T1.FAILED);
                    SpinnerImageView spinnerImageView2 = n6l.A03;
                    if (spinnerImageView2 != null) {
                        ViewOnClickListenerC55467OkM.A00(spinnerImageView2, 55, n6l);
                        i = 1049327277;
                        C0f9.A0A(i, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
            case 8:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case 20:
            case 21:
            case 28:
            case 30:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            default:
                super.onFail(abstractC115105If);
                return;
            case 4:
                A032 = C0f9.A03(-710306864);
                Fragment fragment = (Fragment) this.A01;
                C9GR.A09(fragment.getContext(), AbstractC166997dE.A0N(fragment).getString(2131961896));
                i2 = -592793873;
                C0f9.A0A(i2, A032);
                return;
            case 5:
                A032 = C0f9.A03(-21751082);
                C52251NAq c52251NAq = (C52251NAq) this.A01;
                c52251NAq.A0A = false;
                Context context = c52251NAq.A01;
                if (context != null) {
                    MSX.A0v(context, 2131972429);
                }
                i2 = 1040324805;
                C0f9.A0A(i2, A032);
                return;
            case 6:
                A032 = C0f9.A03(-1495249758);
                OEJ oej = (OEJ) this.A01;
                oej.A00 = false;
                MSX.A0v(oej.A01, 2131972429);
                i2 = 1193334374;
                C0f9.A0A(i2, A032);
                return;
            case 7:
                A032 = C0f9.A03(-747853915);
                C14360o3.A0B(abstractC115105If, 0);
                C56342iS c56342iS = C56352iT.A0t;
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A01;
                c56342iS.A03(shareLaterFragment.getActivity()).setIsLoading(false);
                C193328hC A0O = AbstractC31175DnJ.A0O(shareLaterFragment);
                A0O.A0A(2131973868);
                A0O.A09(2131972429);
                AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC55298OgL.A00, A0O, 2131960994);
                Throwable A01 = abstractC115105If.A01();
                C19280xC A0S = AbstractC50522MSa.A0S(shareLaterFragment, "share_later_fragment_share_failure");
                if (A01 != null) {
                    str2 = A01.getMessage();
                } else {
                    str2 = "null";
                }
                A0S.A0C("error", str2);
                UserSession userSession = shareLaterFragment.A00;
                str = "userSession";
                if (userSession != null) {
                    AbstractC31173DnH.A1S(A0S, userSession);
                    String str4 = shareLaterFragment.A07;
                    UserSession userSession2 = shareLaterFragment.A00;
                    if (userSession2 != null) {
                        ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
                        C14360o3.A0A(shareLaterMedia);
                        String str5 = shareLaterMedia.A05;
                        int indexOf = str5.indexOf(95);
                        if (indexOf != -1) {
                            str5 = str5.substring(0, indexOf);
                        }
                        C14360o3.A07(str5);
                        ShareLaterMedia shareLaterMedia2 = shareLaterFragment.A04;
                        C14360o3.A0A(shareLaterMedia2);
                        C55185Odq.A01(shareLaterFragment, userSession2, str4, str5, "share_later", A01, shareLaterMedia2.A02.A00);
                        UserSession userSession3 = shareLaterFragment.A00;
                        if (userSession3 != null) {
                            ShareLaterMedia shareLaterMedia3 = shareLaterFragment.A04;
                            C14360o3.A0A(shareLaterMedia3);
                            String str6 = shareLaterMedia3.A05;
                            C14360o3.A07(str6);
                            AbstractC73317Y7a.A0H(shareLaterFragment, userSession3, str6, "share_later_view", "share", A01);
                            ShareLaterMedia shareLaterMedia4 = shareLaterFragment.A04;
                            C14360o3.A0A(shareLaterMedia4);
                            if (shareLaterMedia4.A07) {
                                UserSession userSession4 = shareLaterFragment.A00;
                                if (userSession4 != null) {
                                    AbstractC55180Odl.A03(userSession4, ShareType.A0H, "feed_share_later", null, shareLaterFragment.A07);
                                }
                            }
                            i2 = 99021409;
                            C0f9.A0A(i2, A032);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 10:
                A03 = C0f9.A03(1263040788);
                i = 1341814597;
                C0f9.A0A(i, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(779399243);
                i = 1068696422;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGTERM /* 15 */:
                A032 = C0f9.A03(1248187485);
                ((OFB) this.A01).A03.A0A(C219499mx.A00);
                i2 = -374784300;
                C0f9.A0A(i2, A032);
                return;
            case 16:
                A032 = C0f9.A03(-1789214807);
                ((OFB) this.A01).A04.A0A(C219499mx.A00);
                i2 = -1447193258;
                C0f9.A0A(i2, A032);
                return;
            case 17:
                A032 = C0f9.A03(1631083784);
                MSX.A0v(((P7I) this.A01).A00, 2131973619);
                i2 = 1722567885;
                C0f9.A0A(i2, A032);
                return;
            case 18:
                A032 = C0f9.A03(-2090284196);
                C9GR.A0F((Context) this.A01, "story_bulk_like_failed", 2131974562);
                i2 = -147991731;
                C0f9.A0A(i2, A032);
                return;
            case Process.SIGSTOP /* 19 */:
                A032 = C0f9.A03(529121262);
                C9GR.A0F(((C55908Orz) this.A01).A02, "story_bulk_like_failed", 2131974562);
                i2 = -775090326;
                C0f9.A0A(i2, A032);
                return;
            case 22:
                A032 = C0f9.A03(-1121273918);
                C52773NXe c52773NXe = (C52773NXe) this.A01;
                C52773NXe.A01(c52773NXe, C05F.A01, false);
                C9GR.A0A(c52773NXe.A02.getContext(), "startAttributedEffectApiCall_error");
                i2 = 932636661;
                C0f9.A0A(i2, A032);
                return;
            case 23:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -1186096714);
                AbstractC25011Ke abstractC25011Ke = (AbstractC25011Ke) this.A01;
                Throwable A012 = abstractC115105If.A01();
                C14360o3.A0A(A012);
                abstractC25011Ke.setException(A012);
                i2 = -680400904;
                C0f9.A0A(i2, A032);
                return;
            case 24:
                A032 = AbstractC167017dG.A0N(abstractC115105If, -1116983798);
                super.onFail(abstractC115105If);
                C56142Ow4 c56142Ow4 = (C56142Ow4) this.A01;
                Toast toast = c56142Ow4.A00;
                if (toast != null) {
                    toast.cancel();
                }
                c56142Ow4.A00 = null;
                C56142Ow4.A00(c56142Ow4, (C52097N2x) abstractC115105If.A00());
                i2 = -1568507695;
                C0f9.A0A(i2, A032);
                return;
            case 25:
                A03 = C0f9.A03(245597055);
                i = -609468412;
                C0f9.A0A(i, A03);
                return;
            case 26:
                A03 = C0f9.A03(-358691037);
                i = 457527704;
                C0f9.A0A(i, A03);
                return;
            case 27:
                A03 = C0f9.A03(-811743212);
                i = 1523254116;
                C0f9.A0A(i, A03);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A032 = AbstractC167017dG.A0N(abstractC115105If, 1470023560);
                super.onFail(abstractC115105If);
                ((AbstractC43842Ja5) this.A01).A0B(C16930sl.A00);
                i2 = 1906497687;
                C0f9.A0A(i2, A032);
                return;
            case 31:
                A032 = C0f9.A03(965059084);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                PIy pIy = ((C52834NZr) this.A01).A03;
                if (pIy != null) {
                    pIy.A04 = AbstractC166987dD.A1E();
                    pIy.A00 = 0;
                    PIy.A04(pIy);
                }
                i2 = 1207309969;
                C0f9.A0A(i2, A032);
                return;
            case 32:
                A033 = C0f9.A03(-1089115977);
                C14360o3.A0B(abstractC115105If, 0);
                C53021Nct c53021Nct = (C53021Nct) this.A01;
                Object A00 = abstractC115105If.A00();
                N3J n3j = (N3J) A00;
                if (n3j != null) {
                    c53021Nct.A0D = n3j;
                }
                String A002 = AbstractC54270Nyq.A00(abstractC115105If);
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Initializing Broadcast Failure (");
                InterfaceC40801un interfaceC40801un = (InterfaceC40801un) A00;
                if (interfaceC40801un != null) {
                    num = Integer.valueOf(interfaceC40801un.getStatusCode());
                } else {
                    num = null;
                }
                A1C.append(num);
                C0K8.A0C("IgLiveStreamingController", MSZ.A0u("): ", A002, A1C));
                c53021Nct.A0a.A0K(false, A002);
                Throwable A013 = abstractC115105If.A01();
                AbstractC55102ObF.A0C(c53021Nct, A013);
                if (c53021Nct.A0D.A00 == 1) {
                    broadcastFailureType = BroadcastFailureType.A05;
                } else {
                    broadcastFailureType = BroadcastFailureType.A03;
                }
                AbstractC55102ObF.A0B(broadcastFailureType, c53021Nct, "API broadcast Init", A002, A013);
                i3 = -1284037691;
                C0f9.A0A(i3, A033);
                return;
            case 33:
                A033 = C0f9.A03(-923146624);
                C14360o3.A0B(abstractC115105If, 0);
                C53021Nct c53021Nct2 = (C53021Nct) this.A01;
                Object A003 = abstractC115105If.A00();
                C52088N2o c52088N2o = (C52088N2o) A003;
                if (c52088N2o != null) {
                    str3 = c52088N2o.A00;
                } else {
                    str3 = null;
                }
                ((AbstractC55102ObF) c53021Nct2).A03 = str3;
                String A004 = AbstractC54270Nyq.A00(abstractC115105If);
                InterfaceC40801un interfaceC40801un2 = (InterfaceC40801un) A003;
                if (interfaceC40801un2 != null) {
                    num2 = Integer.valueOf(interfaceC40801un2.getStatusCode());
                } else {
                    num2 = null;
                }
                C0K8.A0O("IgLiveStreamingController", "Starting Broadcast Failure (%d): %s", num2, A004);
                c53021Nct2.A0a.A0J(false, A004);
                BroadcastFailureType broadcastFailureType2 = BroadcastFailureType.A03;
                C40791um c40791um = (C40791um) A003;
                if (c40791um != null && ((i4 = c40791um.mStatusCode) == 400 || i4 == 403)) {
                    broadcastFailureType2 = BroadcastFailureType.A04;
                }
                OQX.A01(c53021Nct2.A0Y, ((AbstractC55102ObF) c53021Nct2).A07).A00();
                Throwable A014 = abstractC115105If.A01();
                OQW.A00(A014);
                AbstractC55102ObF.A0B(broadcastFailureType2, c53021Nct2, "API Start Broadcast", A004, A014);
                i3 = -894210936;
                C0f9.A0A(i3, A033);
                return;
            case 34:
                A032 = C0f9.A03(-251040906);
                C9GR.A07(((ClipsEditMetadataController) this.A01).A0q.getContext(), 2131956461);
                i2 = 1760036284;
                C0f9.A0A(i2, A032);
                return;
            case 40:
                A032 = C0f9.A03(680911524);
                C56255Oy2 c56255Oy2 = (C56255Oy2) ((C55519OlD) this.A01).A01;
                C9GR.A0A(c56255Oy2.A09, "setArchivePreferenceWithOptimisticUpdate_error");
                C56255Oy2.A04(c56255Oy2);
                i2 = -1262224422;
                C0f9.A0A(i2, A032);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1579860543);
                ArchiveReelPeopleFragment archiveReelPeopleFragment = (ArchiveReelPeopleFragment) this.A01;
                if (archiveReelPeopleFragment.A01) {
                    archiveReelPeopleFragment.A01 = false;
                    ArchiveReelPeopleFragment.A00(archiveReelPeopleFragment);
                }
                i = -42445077;
                break;
            case 3:
                A03 = C0f9.A03(-449584608);
                ((N6L) this.A01).onBackPressed();
                i = -1430907375;
                break;
            case 4:
                A03 = C0f9.A03(-479443522);
                N6L n6l = (N6L) this.A01;
                new Handler(n6l.requireContext().getMainLooper()).post(new PLR(n6l));
                i = -1462041621;
                break;
            case 5:
                A03 = C0f9.A03(647041634);
                O3I o3i = ((C52251NAq) this.A01).A08;
                if (o3i != null) {
                    AbstractC52180N7p abstractC52180N7p = o3i.A00;
                    if (abstractC52180N7p instanceof NMX) {
                        View view = ((NMX) abstractC52180N7p).A02;
                        if (view == null) {
                            C14360o3.A0F("promotePostSharingOverlay");
                            throw C00O.createAndThrow();
                        }
                        view.setVisibility(8);
                    }
                }
                i = -1751592868;
                break;
            case 6:
                A03 = C0f9.A03(101485392);
                FollowersShareFragment.A0K(((OEJ) this.A01).A05.A00, false);
                i = -1491333729;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-1353274440);
                NMW.A04((NMW) this.A01, false);
                i = 166936270;
                break;
            case 24:
                A03 = C0f9.A03(429618296);
                super.onFinish();
                ((C56142Ow4) this.A01).A03 = null;
                i = -1039116229;
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
            case 0:
                A03 = C0f9.A03(1543434216);
                ArchiveReelPeopleFragment archiveReelPeopleFragment = (ArchiveReelPeopleFragment) this.A01;
                if (!archiveReelPeopleFragment.A01) {
                    archiveReelPeopleFragment.A01 = true;
                    ArchiveReelPeopleFragment.A00(archiveReelPeopleFragment);
                }
                i = -419368657;
                break;
            case 5:
                A03 = C0f9.A03(886712582);
                C52251NAq c52251NAq = (C52251NAq) this.A01;
                O3I o3i = c52251NAq.A08;
                if (o3i != null) {
                    AbstractC52180N7p abstractC52180N7p = o3i.A00;
                    if (abstractC52180N7p instanceof NMX) {
                        NMX nmx = (NMX) abstractC52180N7p;
                        View view = nmx.A02;
                        if (view == null) {
                            C14360o3.A0F("promotePostSharingOverlay");
                            throw C00O.createAndThrow();
                        }
                        view.setVisibility(0);
                        View view2 = nmx.mView;
                        if (view2 != null) {
                            AbstractC13880nE.A0O(view2);
                        }
                    }
                }
                c52251NAq.A0A = false;
                i = -1809978289;
                break;
            case 6:
                A03 = C0f9.A03(1344567134);
                OEJ oej = (OEJ) this.A01;
                FollowersShareFragment.A0K(oej.A05.A00, true);
                oej.A00 = false;
                i = -2023997282;
                break;
            case 7:
                A03 = C0f9.A03(1876040560);
                AbstractC31176DnK.A0z(AbstractC31171DnF.A09(this.A01), C56352iT.A0t);
                i = 2092780685;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(71497628);
                NMW.A04((NMW) this.A01, true);
                i = -603329903;
                break;
            case 16:
                A03 = C0f9.A03(803020676);
                ((OFB) this.A01).A04.A0A(C193648hk.A00);
                i = 1394728442;
                break;
            case 34:
                A03 = C0f9.A03(883922565);
                ClipsEditMetadataController.A0G((ClipsEditMetadataController) this.A01, true);
                i = -1421999096;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0540, code lost:
    
        if (r5.A00(X.C51529MpF.class, "shop_cross_tagging_eligibility").A06("eligible_for_cross_tagging") != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x056d, code lost:
    
        if (r5.A00(X.C51533MpJ.class, "shop_cross_tagging_eligibility").A06("eligible_for_cross_tagging") != false) goto L176;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 3578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50689MZh.onSuccess(java.lang.Object):void");
    }
}
