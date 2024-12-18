package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.AllUserStoryTarget;
import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import com.instagram.pendingmedia.model.GroupProfileUserStoryTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.5fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122005fs implements InterfaceC40171tl {
    public int A00;
    public EnumC76383bi A01;
    public C41137IJc A02;
    public ShareType A03;
    public String A04;
    public boolean A05;
    public C3E3 A06;

    @Override // X.InterfaceC40181tm
    public final /* synthetic */ void DEN(InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "MultiConfigStoryTarget";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.IJc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(com.instagram.pendingmedia.model.UserStoryTarget r3, X.C122005fs r4) {
        /*
            if (r3 != 0) goto L6
            r2 = 0
        L3:
            r4.A02 = r2
            return
        L6:
            X.IJc r2 = new X.IJc
            r2.<init>()
            java.lang.String r1 = r3.CBn()
            r2.A05 = r1
            if (r1 == 0) goto L1a
            int r0 = r1.hashCode()
            switch(r0) {
                case -1501566039: goto L22;
                case -798727403: goto L2f;
                case -517433529: goto L40;
                case -195511486: goto L43;
                case 64897: goto L50;
                case 2432460: goto L53;
                case 68091487: goto L56;
                case 702693113: goto L63;
                case 734941130: goto L66;
                case 842397247: goto L69;
                case 1001355831: goto L6c;
                case 1261689812: goto L6f;
                case 1279756998: goto L72;
                case 1702038030: goto L75;
                case 2036774020: goto L78;
                default: goto L1a;
            }
        L1a:
            java.lang.String r1 = "UserStoryTargetHolder must be initialized with a UserStoryTarget object that has a valid type"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L22:
            java.lang.String r0 = "GROUP_PROFILE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            com.instagram.pendingmedia.model.GroupProfileUserStoryTarget r3 = (com.instagram.pendingmedia.model.GroupProfileUserStoryTarget) r3
            r2.A02 = r3
            goto L3
        L2f:
            r0 = 24
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget r3 = (com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget) r3
            r2.A01 = r3
            goto L3
        L40:
            java.lang.String r0 = "SHARE_TO_FRIENDS_STORY"
            goto L7a
        L43:
            java.lang.String r0 = "ALL_WITH_BLACKLIST"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            com.instagram.pendingmedia.model.AllUserStoryTarget r3 = (com.instagram.pendingmedia.model.AllUserStoryTarget) r3
            r2.A00 = r3
            goto L3
        L50:
            java.lang.String r0 = "ALL"
            goto L7a
        L53:
            java.lang.String r0 = "OPAL"
            goto L7a
        L56:
            java.lang.String r0 = "GROUP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            com.instagram.pendingmedia.model.GroupUserStoryTarget r3 = (com.instagram.pendingmedia.model.GroupUserStoryTarget) r3
            r2.A03 = r3
            goto L3
        L63:
            java.lang.String r0 = "PRIVATE_STORY"
            goto L7a
        L66:
            java.lang.String r0 = "HALLPASS"
            goto L7a
        L69:
            java.lang.String r0 = "HIGHLIGHTS"
            goto L7a
        L6c:
            java.lang.String r0 = "FAVORITES"
            goto L7a
        L6f:
            java.lang.String r0 = "EXCLUSIVE_STORY"
            goto L7a
        L72:
            java.lang.String r0 = "FACEBOOK"
            goto L7a
        L75:
            java.lang.String r0 = "CLOSE_FRIENDS"
            goto L7a
        L78:
            java.lang.String r0 = "FACEBOOK_DATING"
        L7a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            com.instagram.pendingmedia.model.SimpleUserStoryTarget r3 = (com.instagram.pendingmedia.model.SimpleUserStoryTarget) r3
            r2.A04 = r3
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122005fs.A00(com.instagram.pendingmedia.model.UserStoryTarget, X.5fs):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.pendingmedia.model.UserStoryTarget A01() {
        /*
            r3 = this;
            X.IJc r2 = r3.A02
            if (r2 == 0) goto L75
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto Lf
            int r0 = r1.hashCode()
            switch(r0) {
                case -1501566039: goto L17;
                case -798727403: goto L22;
                case -517433529: goto L31;
                case -195511486: goto L34;
                case 64897: goto L3f;
                case 2432460: goto L42;
                case 68091487: goto L45;
                case 702693113: goto L50;
                case 734941130: goto L53;
                case 842397247: goto L56;
                case 1001355831: goto L59;
                case 1261689812: goto L5c;
                case 1279756998: goto L5f;
                case 1702038030: goto L62;
                case 2036774020: goto L65;
                default: goto Lf;
            }
        Lf:
            java.lang.String r1 = "UserStoryTargetHolder must have a valid type at the time UserStoryTargetHolder.get() is called"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L17:
            java.lang.String r0 = "GROUP_PROFILE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            com.instagram.pendingmedia.model.GroupProfileUserStoryTarget r0 = r2.A02
            goto L6f
        L22:
            r0 = 24
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget r0 = r2.A01
            goto L6f
        L31:
            java.lang.String r0 = "SHARE_TO_FRIENDS_STORY"
            goto L67
        L34:
            java.lang.String r0 = "ALL_WITH_BLACKLIST"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            com.instagram.pendingmedia.model.AllUserStoryTarget r0 = r2.A00
            goto L6f
        L3f:
            java.lang.String r0 = "ALL"
            goto L67
        L42:
            java.lang.String r0 = "OPAL"
            goto L67
        L45:
            java.lang.String r0 = "GROUP"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            com.instagram.pendingmedia.model.GroupUserStoryTarget r0 = r2.A03
            goto L6f
        L50:
            java.lang.String r0 = "PRIVATE_STORY"
            goto L67
        L53:
            java.lang.String r0 = "HALLPASS"
            goto L67
        L56:
            java.lang.String r0 = "HIGHLIGHTS"
            goto L67
        L59:
            java.lang.String r0 = "FAVORITES"
            goto L67
        L5c:
            java.lang.String r0 = "EXCLUSIVE_STORY"
            goto L67
        L5f:
            java.lang.String r0 = "FACEBOOK"
            goto L67
        L62:
            java.lang.String r0 = "CLOSE_FRIENDS"
            goto L67
        L65:
            java.lang.String r0 = "FACEBOOK_DATING"
        L67:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            com.instagram.pendingmedia.model.SimpleUserStoryTarget r0 = r2.A04
        L6f:
            X.C14360o3.A0A(r0)
            com.instagram.pendingmedia.model.UserStoryTarget r0 = (com.instagram.pendingmedia.model.UserStoryTarget) r0
            return r0
        L75:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122005fs.A01():com.instagram.pendingmedia.model.UserStoryTarget");
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.O3e, java.lang.Object] */
    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ C26461Qb AEa(Context context, C22P c22p, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, ShareType shareType, Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        EnumC53323Ni0 enumC53323Ni0;
        List copyOf;
        O8V o8v = (O8V) obj;
        if (z4) {
            enumC53323Ni0 = EnumC53323Ni0.A0O;
        } else {
            enumC53323Ni0 = EnumC53323Ni0.A0N;
        }
        C25621Ms A01 = C55230Of1.A01(c22p, mediaUploadMetadata, userSession, enumC53323Ni0, str, str4, C16030qx.A00(context), str6, str7, list, z, z2, z3, z5);
        C47Z c47z = o8v.A00;
        C55230Of1.A0J(A01, userSession, AbstractC54080Nve.A00(c47z), j, z);
        UserStoryTarget A012 = A01();
        A012.getClass();
        ShareType shareType2 = this.A03;
        String CBn = A012.CBn();
        if (CBn != null) {
            int hashCode = CBn.hashCode();
            if (hashCode != -1501566039) {
                if (hashCode != -798727403) {
                    if (hashCode == -195511486 && CBn.equals("ALL_WITH_BLACKLIST")) {
                        AbstractC55161OdP.A02(A01, shareType2);
                        copyOf = ((AllUserStoryTarget) A012).A01;
                        if (copyOf != null && (!copyOf.isEmpty())) {
                            A01.A9s("story_blacklisted_viewer_ids", new JSONArray((Collection) copyOf).toString());
                        }
                    }
                    AbstractC55161OdP.A02(A01, shareType2);
                } else {
                    if (CBn.equals(MSV.A00(24))) {
                        AbstractC55161OdP.A02(A01, shareType2);
                        copyOf = ImmutableList.copyOf((Collection) ((CloseFriendsUserStoryTarget) A012).A01);
                        if (copyOf != null) {
                            A01.A9s("story_blacklisted_viewer_ids", new JSONArray((Collection) copyOf).toString());
                        }
                    }
                    AbstractC55161OdP.A02(A01, shareType2);
                }
            } else {
                if (CBn.equals("GROUP_PROFILE")) {
                    AbstractC55161OdP.A02(A01, shareType2);
                    PendingRecipient pendingRecipient = ((GroupProfileUserStoryTarget) A012).A00;
                    if (pendingRecipient != null) {
                        A01.A9s("groups_destination_user_id", pendingRecipient.getId());
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                AbstractC55161OdP.A02(A01, shareType2);
            }
            long j2 = c47z.A0e;
            C14360o3.A0B(userSession, 1);
            AbstractC55161OdP.A01(A01, userSession, AbstractC55161OdP.A00(c47z, true), j2, z);
            C122005fs c122005fs = o8v.A01;
            EnumC76383bi enumC76383bi = c122005fs.A01;
            if (enumC76383bi != EnumC76383bi.A06) {
                A01.A9s("audience", enumC76383bi.A00);
            }
            FanClubInfoDict B4O = C08730cb.A00(userSession).A00().A03.B4O();
            if (enumC76383bi == EnumC76383bi.A07 && B4O != null) {
                A01.A9s("fan_club_id", String.valueOf(B4O.getFanClubId()));
            }
            AE9.A01(A01, userSession, AE9.A00(c47z, c122005fs), str3, str5);
            C188538Ws c188538Ws = c47z.A1Y;
            if (c188538Ws != null) {
                A01.AA6("add_to_highlights", AbstractC35082Fct.A02(c188538Ws));
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36310873291096413L) && AbstractC23021Ah.A00(userSession).A25("reel")) {
                java.util.Set A0I = AbstractC23021Ah.A00(userSession).A0I("reel");
                ?? obj2 = new Object();
                obj2.A00 = A0I;
                C55230Of1.A0K(A01, obj2);
            }
            return A01.A0O();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC40181tm
    public final /* bridge */ /* synthetic */ Object AEm(C47Z c47z) {
        return new O8V(c47z, this);
    }

    @Override // X.InterfaceC40171tl
    public final ShareType BuN() {
        return this.A03;
    }

    @Override // X.InterfaceC40171tl
    public final int C3D() {
        return this.A00;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CRc() {
        return this.A05;
    }

    @Override // X.InterfaceC40181tm
    public final N3A E3U(C3JY c3jy, UserSession userSession) {
        return this.A06.E3U(c3jy, userSession);
    }

    @Override // X.InterfaceC40181tm
    public final void E4y(UserSession userSession, C47Z c47z, C54783OIx c54783OIx) {
        c54783OIx.A00(c47z.A1C, c47z, false);
        AbstractC25651Mw.A00(userSession).E4s(new C70083Cs(c47z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C122005fs(com.instagram.pendingmedia.model.UserStoryTarget r3) {
        /*
            r2 = this;
            r2.<init>()
            A00(r3, r2)
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            if (r3 == r0) goto L50
            java.lang.String r1 = r3.CBn()
            r1.getClass()
            r0 = 24
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L50
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            if (r3 != r0) goto L38
            X.3bi r0 = X.EnumC76383bi.A05
        L23:
            r2.A01 = r0
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A07
            if (r3 != r0) goto L2e
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0I
        L2b:
            r2.A03 = r0
            return
        L2e:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0C
            if (r3 != r0) goto L35
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0X
            goto L2b
        L35:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0V
            goto L2b
        L38:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A03
            if (r3 != r0) goto L3f
            X.3bi r0 = X.EnumC76383bi.A07
            goto L23
        L3f:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A06
            if (r3 != r0) goto L46
            X.3bi r0 = X.EnumC76383bi.A0A
            goto L23
        L46:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A08
            if (r3 != r0) goto L4d
            X.3bi r0 = X.EnumC76383bi.A0C
            goto L23
        L4d:
            X.3bi r0 = X.EnumC76383bi.A06
            goto L23
        L50:
            X.3bi r0 = X.EnumC76383bi.A04
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122005fs.<init>(com.instagram.pendingmedia.model.UserStoryTarget):void");
    }

    @Override // X.InterfaceC40171tl
    public final boolean CUB() {
        if (A01() != UserStoryTarget.A05) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CUC() {
        if (A01() != UserStoryTarget.A04) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC40171tl
    public final boolean CVX() {
        return A01() instanceof GroupProfileUserStoryTarget;
    }

    @Override // X.InterfaceC40181tm
    public final C38321qM DqT(Context context, InterfaceC40821up interfaceC40821up, UserSession userSession, C47Z c47z) {
        A01();
        return this.A06.DqT(context, interfaceC40821up, userSession, c47z);
    }

    @Override // X.InterfaceC40171tl
    public final void ERy(boolean z) {
        this.A05 = z;
    }

    @Override // X.InterfaceC40171tl
    public final void Ef4(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3E3, java.lang.Object] */
    public C122005fs() {
        this.A06 = new Object();
    }
}
