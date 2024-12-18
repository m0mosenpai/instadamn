package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.repository.user.UserNetworkDataSource;
import com.instagram.repository.user.UserRepository$fetchUserInfoUsingReactiveStream$1;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class MV2 extends C4A7 {
    public final C006802i A00;
    public final C2045093j A01;
    public final UserNetworkDataSource A02;
    public final C5K8 A03;
    public final InterfaceC06180Ui A04;
    public final boolean A05;

    public static final User A00(AnonymousClass501 anonymousClass501) {
        if (anonymousClass501 instanceof AnonymousClass500) {
            return new User(((AnonymousClass500) anonymousClass501).A00, null);
        }
        if (anonymousClass501 instanceof C50617MWe) {
            return new User(null, ((C50617MWe) anonymousClass501).A00);
        }
        throw B4Z.A00();
    }

    private final boolean A01(C1P1 c1p1, C1GL c1gl, EnumC2045493n enumC2045493n, AnonymousClass501 anonymousClass501) {
        if (c1gl != null && (anonymousClass501 instanceof AnonymousClass500) && this.A01.A0B(c1p1, c1gl, enumC2045493n, ((AnonymousClass500) anonymousClass501).A00)) {
            return true;
        }
        return false;
    }

    public final InterfaceC19390xP A02(AnonymousClass501 anonymousClass501) {
        C06160Ug A0r;
        int i;
        if (anonymousClass501 instanceof AnonymousClass500) {
            A0r = MSX.A0r(this.A04);
            i = 14;
        } else if (anonymousClass501 instanceof C50617MWe) {
            A0r = MSX.A0r(this.A04);
            i = 15;
        } else {
            throw B4Z.A00();
        }
        return MV5.A00(anonymousClass501, A0r, i);
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [X.0nb, java.util.concurrent.Executor, X.1GL] */
    public final void A03(AnonymousClass706 anonymousClass706, AnonymousClass700 anonymousClass700, AnonymousClass501 anonymousClass501, String str, String str2, int i, boolean z) {
        String str3;
        C006802i c006802i;
        int i2;
        String str4;
        C1Dk A00;
        String str5;
        String str6;
        AbstractC167017dG.A1P(str, str2);
        if (anonymousClass706 instanceof AnonymousClass705) {
            AnonymousClass705 anonymousClass705 = (AnonymousClass705) anonymousClass706;
            str3 = "profile_info_data_source";
            if (A01(anonymousClass705.A00, anonymousClass700.A00, EnumC2045493n.A0D, anonymousClass501)) {
                c006802i = this.A00;
                i2 = 31784979;
                str4 = "legacy_streaming_prefetch";
            } else {
                UserNetworkDataSource userNetworkDataSource = this.A02;
                C1GL c1gl = anonymousClass705.A02;
                InterfaceC24551Hy interfaceC24551Hy = anonymousClass705.A01;
                C14360o3.A0B(interfaceC24551Hy, 6);
                UserSession userSession = userNetworkDataSource.A01;
                C23711Eb c23711Eb = new C23711Eb(userSession, 302881412, 1, false);
                c23711Eb.A05();
                c23711Eb.A01 = AbstractC37303Gc4.A0B(userSession, C2046093u.class, true, false);
                if (C18U.A06(C06090Tz.A05, userSession, 36328117586640071L)) {
                    ((AbstractC23721Ec) c23711Eb).A06 = EnumC23341Bw.CriticalAPI;
                }
                if (anonymousClass501 instanceof AnonymousClass500) {
                    c23711Eb.A0B("users/{user_id}/info_stream/");
                    c23711Eb.A0A = "users/{user_id}/info/";
                    c23711Eb.A0C = "user_info_stream_by_id";
                    str5 = ((AnonymousClass500) anonymousClass501).A00;
                    str6 = CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID;
                } else if (anonymousClass501 instanceof C50617MWe) {
                    c23711Eb.A0B("users/{user_name}/usernameinfo_stream/");
                    c23711Eb.A0A = "users/{user_name}/usernameinfo/";
                    c23711Eb.A0C = "user_info_stream_by_username";
                    str5 = ((C50617MWe) anonymousClass501).A00;
                    str6 = "user_name";
                } else {
                    throw B4Z.A00();
                }
                c23711Eb.A9s(str6, str5);
                AbstractC50522MSa.A1M(c23711Eb, anonymousClass700, str, str2, z);
                C24531Hw A0N = c23711Eb.A0N();
                A0N.A02(interfaceC24551Hy);
                if (i != -1) {
                    A0N.A00 = new C151086rB(i);
                    C19P.A01.add(new C151106rD(i));
                }
                c1gl.schedule(A0N);
                c006802i = this.A00;
                i2 = 31784979;
                str4 = "legacy_streaming_network_request";
            }
        } else if (anonymousClass706 instanceof C52686NSr) {
            C52686NSr c52686NSr = (C52686NSr) anonymousClass706;
            str3 = "profile_info_data_source";
            if (A01(c52686NSr.A01, anonymousClass700.A00, EnumC2045493n.A0A, anonymousClass501)) {
                c006802i = this.A00;
                i2 = 31784979;
                str4 = "graphql_defer_prefetch";
            } else {
                UserNetworkDataSource userNetworkDataSource2 = this.A02;
                C2JL c2jl = c52686NSr.A00;
                C1GL c1gl2 = c52686NSr.A02;
                C14360o3.A0B(c2jl, 4);
                if (anonymousClass501 instanceof AnonymousClass500) {
                    String str7 = ((AnonymousClass500) anonymousClass501).A00;
                    C55684Oo9 A002 = AbstractC54111Nw9.A00();
                    A002.A00(str7);
                    C2JM c2jm = A002.A00;
                    c2jm.A04("from_module", str);
                    c2jm.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                    A002.A01.A02("use_defer", true);
                    A00 = A002.A00();
                } else if (anonymousClass501 instanceof C50617MWe) {
                    String str8 = ((C50617MWe) anonymousClass501).A00;
                    C55673Ony c55673Ony = new C55673Ony();
                    C2JM c2jm2 = c55673Ony.A01;
                    c2jm2.A01("use_defer");
                    boolean z2 = true;
                    C2JM c2jm3 = c55673Ony.A00;
                    c2jm3.A04(AbstractC31193Dnc.A00(), str8);
                    if (str8 == null) {
                        z2 = false;
                    }
                    c55673Ony.A02 = z2;
                    c2jm3.A04("from_module", str);
                    c2jm3.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                    c2jm2.A02("use_defer", true);
                    A00 = c55673Ony.A00();
                } else {
                    throw B4Z.A00();
                }
                C14360o3.A07(A00);
                if (userNetworkDataSource2.A02) {
                    A00.setEnsureCacheWrite(true);
                    A00.setNetworkTimeoutSeconds(4);
                } else if (userNetworkDataSource2.A03) {
                    A00.setCacheFallbackByDuration_EXPERIMENTAL(4000L);
                }
                A00.addTrackedHttpResponseHeader("X-IG-Request-Elapsed-Time-MS");
                C40701ud A01 = AbstractC40691uc.A01(userNetworkDataSource2.A01);
                ?? executorC14110nb = new ExecutorC14110nb(1575610476);
                executorC14110nb.schedule(new MWI(A00, c2jl, A01, executorC14110nb));
                c006802i = this.A00;
                i2 = 31784979;
                str4 = "graphql_defer_network_request";
            }
        } else if (anonymousClass706 instanceof C52684NSp) {
            C52684NSp c52684NSp = (C52684NSp) anonymousClass706;
            C1P1 c1p1 = c52684NSp.A00;
            str3 = "profile_info_data_source";
            if (A01(new NAG(c1p1, c52684NSp), anonymousClass700.A00, EnumC2045493n.A0D, anonymousClass501)) {
                c006802i = this.A00;
                i2 = 31784979;
                str4 = "legacy_rest_prefetch";
            } else {
                C1GL c1gl3 = c52684NSp.A01;
                UserNetworkDataSource userNetworkDataSource3 = this.A02;
                if (c1gl3 != null) {
                    NAG nag = new NAG(c1p1, c52684NSp);
                    C1ON A003 = UserNetworkDataSource.A00(userNetworkDataSource3, anonymousClass700, anonymousClass501, str, str2, false);
                    A003.A00 = nag;
                    AbstractC50522MSa.A1P(A003, i);
                    c1gl3.schedule(A003);
                    c006802i = this.A00;
                    i2 = 31784979;
                    str4 = "legacy_rest_network_request";
                } else {
                    NAG nag2 = new NAG(c1p1, c52684NSp);
                    C1ON A004 = UserNetworkDataSource.A00(userNetworkDataSource3, anonymousClass700, anonymousClass501, str, str2, false);
                    AbstractC50522MSa.A1P(A004, i);
                    NA8 na8 = new NA8(nag2, A004);
                    A004.A00 = na8;
                    userNetworkDataSource3.A00 = na8;
                    C1GJ.A04(A004, 1671325816);
                    c006802i = this.A00;
                    i2 = 31784979;
                    str4 = "legacy_rest_network_request_tps";
                }
            }
        } else if (anonymousClass706 instanceof C52685NSq) {
            C52685NSq c52685NSq = (C52685NSq) anonymousClass706;
            C1P1 c1p12 = c52685NSq.A00;
            str3 = "profile_info_data_source";
            if (A01(new NAH(c1p12, c52685NSq), anonymousClass700.A00, EnumC2045493n.A0A, anonymousClass501)) {
                c006802i = this.A00;
                i2 = 31784979;
                str4 = "graphql_non_defer_prefetch";
            } else {
                C1GL c1gl4 = c52685NSq.A01;
                if (!(anonymousClass501 instanceof AnonymousClass500)) {
                    return;
                }
                UserNetworkDataSource userNetworkDataSource4 = this.A02;
                String str9 = ((AnonymousClass500) anonymousClass501).A00;
                NAH nah = new NAH(c1p12, c52685NSq);
                C14360o3.A0B(str9, 0);
                C55684Oo9 A005 = AbstractC54111Nw9.A00();
                A005.A00(str9);
                C2JM c2jm4 = A005.A00;
                c2jm4.A04("from_module", str);
                c2jm4.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                A005.A01.A01("use_defer");
                C1Dk A006 = A005.A00();
                C14360o3.A07(A006);
                A006.addTrackedHttpResponseHeader("X-IG-Request-Elapsed-Time-MS");
                C1ON A007 = AnonymousClass963.A00(AbstractC40691uc.A01(userNetworkDataSource4.A01).A03(A006));
                A007.A00 = nah;
                c1gl4.schedule(A007);
                c006802i = this.A00;
                i2 = 31784979;
                str4 = "graphql_non_defer_network_request";
            }
        } else {
            if (anonymousClass706 == null) {
                AbstractC166987dD.A1Z(new UserRepository$fetchUserInfoUsingReactiveStream$1(anonymousClass700, this, anonymousClass501, str, str2, null, i, false), super.A01);
                return;
            }
            throw B4Z.A00();
        }
        c006802i.markerAnnotate(i2, i, str3, str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MV2(X.C006802i r4, X.C2045093j r5, com.instagram.repository.user.UserNetworkDataSource r6, X.C5K8 r7, boolean r8) {
        /*
            r3 = this;
            r0 = 1765100087(0x69354a37, float:1.3697878E25)
            r2 = 3
            X.19K r1 = X.C4A8.A01(r0, r2)
            r0 = 2
            X.C14360o3.A0B(r5, r0)
            X.AbstractC25229BEm.A1I(r7, r2, r1)
            java.lang.String r0 = "Profile"
            r3.<init>(r0, r1)
            r3.A02 = r6
            r3.A01 = r5
            r3.A03 = r7
            r3.A05 = r8
            r3.A00 = r4
            X.057 r0 = X.MSY.A0t()
            r3.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MV2.<init>(X.02i, X.93j, com.instagram.repository.user.UserNetworkDataSource, X.5K8, boolean):void");
    }
}
