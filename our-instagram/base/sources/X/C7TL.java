package X;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.infocenter.model.InfoCenterFactShareInfo;
import com.instagram.infocenter.model.ShareInfo;
import com.instagram.model.direct.DirectRoomsXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.reels.store.ReelStore;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7TL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TL implements C7TM {
    public final UserSession A00;
    public final C120005by A01;
    public final C2DS A02;
    public final ReelStore A03;
    public final InterfaceC08830cm A04;
    public final C13920nI A05;

    private void A03(InterfaceC37118GXd interfaceC37118GXd, C32068E6u c32068E6u, DirectShareTarget directShareTarget, C2EY c2ey, String str, String str2, String str3, boolean z) {
        A01(new C47625L1k(interfaceC37118GXd, this, str3), this, c32068E6u, null, directShareTarget, c2ey, str, str2, z);
    }

    private void A04(InterfaceC37118GXd interfaceC37118GXd, C32068E6u c32068E6u, DirectShareTarget directShareTarget, String str, String str2) {
        A01(new C47625L1k(interfaceC37118GXd, this, str2), this, c32068E6u, null, directShareTarget, null, str, null, false);
    }

    @Override // X.C7TM
    public final void EN2(final DirectAREffectShare directAREffectShare, DirectShareTarget directShareTarget, String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.Lqe
            /* JADX WARN: Type inference failed for: r3v1, types: [X.1df, X.1ae] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = this;
                boolean z2 = z;
                String str3 = str2;
                DirectAREffectShare directAREffectShare2 = directAREffectShare;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C30761df.class, str3, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A00 = directAREffectShare2;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void EN4(Context context, UserSession userSession, DirectShareTarget directShareTarget, final DirectAnimatedMedia directAnimatedMedia, String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.Lqg
            /* JADX WARN: Type inference failed for: r3v1, types: [X.1ae, X.1eB] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str3 = str2;
                DirectAnimatedMedia directAnimatedMedia2 = directAnimatedMedia;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C29481bP.class, str3, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A03 = directAnimatedMedia2;
                abstractC29011ae.A01 = null;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void ENA(DirectShareTarget directShareTarget, final String str, String str2, final String str3, final boolean z) {
        A03(new InterfaceC37118GXd() { // from class: X.Lqf
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str4 = str3;
                String str5 = str;
                return new C29481bP(new C206409Bx(str5), null, AbstractC31277Doz.A01(c7tl.A00, l1w, bool, C29481bP.class, "", str4, null, z2, false), null, directThreadKey, l, NetInfoModule.CONNECTION_TYPE_NONE, AbstractC31177DnL.A05(), true, false);
            }
        }, new C32068E6u(str3, z, false), directShareTarget, C2EY.A0S, str2, null, "unknown", false);
    }

    @Override // X.C7TM
    public final void ENB(final C38321qM c38321qM, DirectShareTarget directShareTarget, final String str, boolean z) {
        A03(new InterfaceC37118GXd() { // from class: X.LqX
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                String str2 = str;
                return new C30181cZ(AbstractC31277Doz.A05(c7tl.A00, l1w, C30181cZ.class, str2, false), c38321qM, directThreadKey, l, AbstractC31177DnL.A05());
            }
        }, new C32068E6u(str, false, false), directShareTarget, C2EY.A0W, null, null, "unknown", false);
    }

    @Override // X.C7TM
    public final void ENE(DirectShareTarget directShareTarget, final SavedCollection savedCollection, final String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G6C
            /* JADX WARN: Type inference failed for: r4v1, types: [X.1ae, X.1iB] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str3 = str2;
                SavedCollection savedCollection2 = savedCollection;
                String str4 = str;
                JTa A05 = AbstractC31277Doz.A05(c7tl.A00, l1w, C33491iB.class, str3, z2);
                long A052 = AbstractC31177DnL.A05();
                C14360o3.A0B(directThreadKey, 2);
                ?? abstractC29011ae = new AbstractC29011ae(A05, directThreadKey, l, A052);
                abstractC29011ae.A00 = directThreadKey;
                abstractC29011ae.A01 = savedCollection2;
                abstractC29011ae.A02 = str4;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void ENF(final C84923qg c84923qg, DirectShareTarget directShareTarget, final String str, boolean z) {
        final String str2;
        C38321qM c38321qM = c84923qg.A07;
        if (c38321qM != null && c38321qM.A0C.CDj() != null) {
            str2 = c84923qg.A07.A0C.CDj().getUsername();
        } else {
            str2 = null;
        }
        String str3 = c84923qg.A0D;
        final String A0R = AnonymousClass001.A0R("https://www.instagram.com/p/", str3);
        if (c84923qg.A0e != null && str3 != null) {
            A03(new InterfaceC37118GXd() { // from class: X.Lqi
                /* JADX WARN: Type inference failed for: r0v3, types: [X.L3X, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1cm] */
                @Override // X.InterfaceC37118GXd
                public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                    C7TL c7tl = C7TL.this;
                    String str4 = str;
                    C84923qg c84923qg2 = c84923qg;
                    String str5 = str2;
                    String str6 = A0R;
                    JTa A05 = AbstractC31277Doz.A05(c7tl.A00, l1w, C30311cm.class, str4, false);
                    String str7 = c84923qg2.A0G;
                    String str8 = c84923qg2.A0e;
                    str8.getClass();
                    long A052 = AbstractC31177DnL.A05();
                    String str9 = c84923qg2.A0D;
                    str9.getClass();
                    AbstractC167017dG.A1R(directThreadKey, str7);
                    C14360o3.A0B(str6, 6);
                    ?? abstractC29011ae = new AbstractC29011ae(A05, directThreadKey, l, A052);
                    ?? obj = new Object();
                    obj.A00 = str7;
                    obj.A03 = str8;
                    obj.A02 = str5;
                    obj.A04 = str6;
                    obj.A01 = str9;
                    abstractC29011ae.A00 = obj;
                    return abstractC29011ae;
                }
            }, new C32068E6u(str, false, false), directShareTarget, C2EY.A0b, null, null, "unknown", false);
        }
    }

    @Override // X.C7TM
    public final void ENH(final ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, final User user, final String str, final String str2, final String str3, String str4, final String str5, final long j, final boolean z) {
        C81663kb BZQ = AbstractC28761aE.A00(this.A00).BZQ(directShareTarget);
        if (!BZQ.Ay8() && !C161867Mw.A02(BZQ.Aic())) {
            return;
        }
        A03(new InterfaceC37118GXd() { // from class: X.Lqm
            /* JADX WARN: Type inference failed for: r10v1, types: [X.1ae, X.1iV] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X.L9v] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = this;
                boolean z2 = z;
                String str6 = str;
                long j2 = j;
                String str7 = str2;
                String str8 = str3;
                User user2 = user;
                String str9 = str5;
                ImageUrl imageUrl2 = imageUrl;
                UserSession userSession = c7tl.A00;
                JTa A05 = AbstractC31277Doz.A05(userSession, l1w, C33691iV.class, null, z2);
                AbstractC167007dF.A1K(userSession, directThreadKey);
                ?? abstractC29011ae = new AbstractC29011ae(A05, directThreadKey, LCT.A01(userSession, directThreadKey), AbstractC31177DnL.A05());
                ?? obj = new Object();
                obj.A00 = j2;
                obj.A05 = str6;
                obj.A07 = str7;
                obj.A06 = str8;
                obj.A02 = null;
                obj.A03 = user2;
                obj.A04 = str9;
                obj.A01 = imageUrl2;
                abstractC29011ae.A00 = obj;
                return abstractC29011ae;
            }
        }, new C32068E6u(null, z, false), directShareTarget, C2EY.A1i, null, null, "unknown", false);
    }

    @Override // X.C7TM
    public final void ENJ(DirectShareTarget directShareTarget, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, String str7, final String str8, final List list, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G6L
            /* JADX WARN: Type inference failed for: r12v1, types: [X.1ae, X.1bZ] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str9 = str8;
                String str10 = str3;
                String str11 = str4;
                String str12 = str5;
                String str13 = str6;
                List list2 = list;
                String str14 = str;
                String str15 = str2;
                JTa A05 = AbstractC31277Doz.A05(c7tl.A00, l1w, C29581bZ.class, str9, z2);
                long A052 = AbstractC31177DnL.A05();
                QJ0 qj0 = new QJ0(list2, str13, str12, str10, str11, 9);
                ?? abstractC29011ae = new AbstractC29011ae(A05, directThreadKey, l, A052);
                abstractC29011ae.A02 = str14;
                abstractC29011ae.A03 = str15;
                abstractC29011ae.A00 = qj0;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str8, z, false), directShareTarget, str7);
    }

    @Override // X.C7TM
    public final void ENP(DirectShareTarget directShareTarget, String str, final String str2, String str3, final String str4, final String str5, final String str6, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G6G
            /* JADX WARN: Type inference failed for: r5v1, types: [X.1ae, X.1dz] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str7 = str6;
                String str8 = str2;
                String str9 = str4;
                String str10 = str5;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C30961dz.class, str7, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A00 = str8;
                abstractC29011ae.A01 = Collections.singletonList(AbstractC47996LLi.A0I(str9, str10, null));
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str6, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void ENQ(final C38321qM c38321qM, DirectShareTarget directShareTarget, final String str, boolean z, boolean z2) {
        A03(new InterfaceC37118GXd() { // from class: X.LqZ
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                String str2 = str;
                return new C30221cd(AbstractC31277Doz.A05(c7tl.A00, l1w, C30221cd.class, str2, false), c38321qM, directThreadKey, l, AbstractC31177DnL.A05());
            }
        }, new C32068E6u(str, false, false), directShareTarget, C2EY.A1F, null, null, "unknown", false);
    }

    @Override // X.C7TM
    public final void ENT(DirectShareTarget directShareTarget, final GKP gkp, final String str, String str2, final String str3, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G6A
            /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1jN] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str4 = str3;
                GKP gkp2 = gkp;
                String str5 = str;
                JTa A05 = AbstractC31277Doz.A05(c7tl.A00, l1w, C34231jN.class, str4, z2);
                String str6 = gkp2.A08;
                String str7 = gkp2.A09;
                String str8 = gkp2.A07;
                String str9 = gkp2.A02;
                long A052 = AbstractC31177DnL.A05();
                AbstractC167007dF.A1G(directThreadKey, 2, str5);
                ?? abstractC29011ae = new AbstractC29011ae(A05, directThreadKey, l, A052);
                abstractC29011ae.A02 = str6;
                abstractC29011ae.A03 = str7;
                abstractC29011ae.A00 = str5;
                abstractC29011ae.A01 = str8;
                abstractC29011ae.A04 = str9;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str3, z, false), directShareTarget, str2);
    }

    @Override // X.C7TM
    public final void ENU(final C38321qM c38321qM, DirectShareTarget directShareTarget, String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G65
            /* JADX WARN: Type inference failed for: r3v1, types: [X.1ae, X.1cQ] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str3 = str2;
                C38321qM c38321qM2 = c38321qM;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C30101cQ.class, str3, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A00 = new C206409Bx(c38321qM2, (String) null);
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void ENX(final InfoCenterShareInfoIntf infoCenterShareInfoIntf, DirectShareTarget directShareTarget, String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.Lqb
            /* JADX WARN: Type inference failed for: r14v0, types: [X.1dF, X.1ae] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str3 = str2;
                InfoCenterShareInfoIntf infoCenterShareInfoIntf2 = infoCenterShareInfoIntf;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C30541dF.class, str3, z2), directThreadKey, l, AbstractC31177DnL.A05());
                ShareInfo shareInfo = (ShareInfo) infoCenterShareInfoIntf2;
                abstractC29011ae.A01 = shareInfo.A05;
                String str4 = shareInfo.A0A;
                String str5 = shareInfo.A08;
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("#%06X", Integer.valueOf(Color.parseColor(shareInfo.A09) & 16777215));
                String str6 = shareInfo.A07;
                ExtendedImageUrl extendedImageUrl = shareInfo.A01;
                ExtendedImageUrl extendedImageUrl2 = new ExtendedImageUrl(extendedImageUrl.A0A, extendedImageUrl.getWidth(), extendedImageUrl.getHeight());
                ExtendedImageUrl extendedImageUrl3 = shareInfo.A02;
                C910143t A04 = AbstractC47996LLi.A04(null, extendedImageUrl2, new ExtendedImageUrl(extendedImageUrl3.A0A, extendedImageUrl3.getWidth(), extendedImageUrl3.getHeight()), null, str4, str5, str6, 0, 0);
                A04.A1S = formatStrLocaleSafe;
                abstractC29011ae.A02 = Collections.singletonList(A04);
                abstractC29011ae.A00 = infoCenterShareInfoIntf2;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void ENc(DirectShareTarget directShareTarget, final String str, String str2, final String str3, final boolean z) {
        A03(new InterfaceC37118GXd() { // from class: X.Lqc
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str4 = str3;
                String str5 = str;
                return new C29481bP(new C206409Bx(str5), null, AbstractC31277Doz.A01(c7tl.A00, l1w, bool, C29481bP.class, "", str4, null, z2, false), null, directThreadKey, l, NetInfoModule.CONNECTION_TYPE_NONE, AbstractC31177DnL.A05(), false, false);
            }
        }, new C32068E6u(str3, z, false), directShareTarget, C2EY.A19, str2, null, "unknown", false);
    }

    @Override // X.C7TM
    public final void ENe(C148286ly c148286ly, DirectShareTarget directShareTarget, final String str, final String str2, String str3, final String str4, final boolean z) {
        A04(new InterfaceC37118GXd() { // from class: X.G6D
            /* JADX WARN: Type inference failed for: r4v1, types: [X.1ae, X.1cz] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str5 = str4;
                String str6 = str;
                String str7 = str2;
                JTa A05 = AbstractC31277Doz.A05(c7tl.A00, l1w, C30441cz.class, str5, z2);
                long A052 = AbstractC31177DnL.A05();
                C14360o3.A0B(directThreadKey, 2);
                ?? abstractC29011ae = new AbstractC29011ae(A05, directThreadKey, l, A052);
                abstractC29011ae.A03 = AbstractC166987dD.A1J(AbstractC47996LLi.A01());
                abstractC29011ae.A00 = directThreadKey;
                abstractC29011ae.A01 = str6;
                abstractC29011ae.A02 = str7;
                return abstractC29011ae;
            }
        }, new C32068E6u(str4, z, false), directShareTarget, str3, "unknown");
    }

    @Override // X.C7TM
    public final void EO4(DirectShareTarget directShareTarget, final Product product, String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G66
            /* JADX WARN: Type inference failed for: r3v1, types: [X.1ae, X.1dj] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str3 = str2;
                Product product2 = product;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C30801dj.class, str3, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A00 = new C51755Mte(product2.A01);
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void EO7(final MessagingOffPlatformShareType messagingOffPlatformShareType, DirectShareTarget directShareTarget, final String str, final String str2, String str3, final String str4, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G6F
            /* JADX WARN: Type inference failed for: r3v2, types: [X.1ae, X.1jn] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = this;
                boolean z2 = z;
                String str5 = str4;
                String str6 = str;
                String str7 = str2;
                MessagingOffPlatformShareType messagingOffPlatformShareType2 = messagingOffPlatformShareType;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A04(c7tl.A00, l1w, C34491jn.class, str5, null, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A01 = str6;
                abstractC29011ae.A02 = str7;
                abstractC29011ae.A00 = messagingOffPlatformShareType2;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str4, z, false), directShareTarget, str3);
    }

    @Override // X.C7TM
    public final void EO8(DirectShareTarget directShareTarget, final SavedCollection savedCollection, final String str, final String str2, final boolean z, boolean z2) {
        A02(new InterfaceC37118GXd() { // from class: X.G6B
            /* JADX WARN: Type inference failed for: r4v1, types: [X.1ae, X.1iF] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z3 = z;
                String str3 = str2;
                SavedCollection savedCollection2 = savedCollection;
                String str4 = str;
                JTa A05 = AbstractC31277Doz.A05(c7tl.A00, l1w, C33531iF.class, str3, z3);
                long A052 = AbstractC31177DnL.A05();
                C14360o3.A0B(directThreadKey, 2);
                ?? abstractC29011ae = new AbstractC29011ae(A05, directThreadKey, l, A052);
                abstractC29011ae.A00 = directThreadKey;
                abstractC29011ae.A01 = savedCollection2;
                abstractC29011ae.A02 = str4;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void EOC(C148286ly c148286ly, DirectShareTarget directShareTarget, String str, final String str2, final String str3, final String str4, final String str5, final boolean z) {
        A04(new InterfaceC37118GXd() { // from class: X.G6H
            /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1cv] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str6 = str5;
                String str7 = str2;
                String str8 = str3;
                String str9 = str4;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C30401cv.class, str6, z2), directThreadKey, l, AbstractC31177DnL.A05());
                String format = String.format(Locale.US, "https://www.instagram.com/_n/reels_audio_page?audio_id=%s", AbstractC166997dE.A1b(str9, 1));
                C14360o3.A07(format);
                abstractC29011ae.A02 = Collections.singletonList(AbstractC47996LLi.A0H(str7, str8, format));
                abstractC29011ae.A01 = str9;
                return abstractC29011ae;
            }
        }, new C32068E6u(str5, z, false), directShareTarget, str, "unknown");
    }

    @Override // X.C7TM
    public final void EOD(final C38321qM c38321qM, DirectShareTarget directShareTarget, final String str, final boolean z) {
        A03(new InterfaceC37118GXd() { // from class: X.Lqd
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str2 = str;
                return new C30261ch(AbstractC31277Doz.A05(c7tl.A00, l1w, C30261ch.class, str2, z2), c38321qM, directThreadKey, l, AbstractC31177DnL.A05());
            }
        }, new C32068E6u(str, z, false), directShareTarget, C2EY.A1z, null, null, "unknown", false);
    }

    @Override // X.C7TM
    public final void EOK(final DirectRoomsXma directRoomsXma, DirectShareTarget directShareTarget, String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.Lqh
            /* JADX WARN: Type inference failed for: r4v1, types: [X.1ae, X.1br] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str3 = str2;
                DirectRoomsXma directRoomsXma2 = directRoomsXma;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C29761br.class, str3, z2), directThreadKey, l, AbstractC31177DnL.A05());
                String str4 = directRoomsXma2.A04;
                String str5 = directRoomsXma2.A03;
                String str6 = directRoomsXma2.A00;
                abstractC29011ae.A05 = Collections.singletonList(AbstractC47996LLi.A0I(str4, str5, str6));
                abstractC29011ae.A02 = str6;
                abstractC29011ae.A06 = directRoomsXma2.A06;
                abstractC29011ae.A01 = directRoomsXma2.A02;
                abstractC29011ae.A03 = directRoomsXma2.A01;
                abstractC29011ae.A04 = directRoomsXma2.A05;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void EOP(DirectShareTarget directShareTarget, String str, final String str2, final String str3, final String str4, final String str5, final String str6, final List list, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G6K
            /* JADX WARN: Type inference failed for: r8v1, types: [X.1ae, X.1dr] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str7 = str6;
                String str8 = str3;
                String str9 = str4;
                String str10 = str5;
                List list2 = list;
                String str11 = str2;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C30881dr.class, str7, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A01 = str8;
                String format = String.format(Locale.US, "https://www.instagram.com/_n/profile_shop?link_id=%s", AbstractC166997dE.A1b(str8, 1));
                C14360o3.A07(format);
                C910143t A0H = AbstractC47996LLi.A0H(str9, str10, format);
                if (list2 != null) {
                    List A0X = AbstractC001800i.A0X(list2);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj : A0X) {
                        if (((String) obj).length() > 0) {
                            A1E.add(obj);
                        }
                    }
                    ArrayList A0q = AbstractC167017dG.A0q(A1E);
                    Iterator it = A1E.iterator();
                    while (it.hasNext()) {
                        A0q.add(new ExtendedImageUrl(AbstractC166987dD.A1B(it), -1, -1));
                    }
                    if (A0q.size() == 6) {
                        A0H.A1g = A0q;
                    }
                }
                abstractC29011ae.A03 = Collections.singletonList(A0H);
                abstractC29011ae.A02 = str11;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str6, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void EOQ(DirectShareTarget directShareTarget, String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G6P
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
            
                if (r4.length() == 0) goto L11;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
            /* JADX WARN: Type inference failed for: r11v1, types: [X.1ae, X.1dn] */
            @Override // X.InterfaceC37118GXd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC29011ae AXZ(X.L1W r18, com.instagram.model.direct.DirectThreadKey r19, java.lang.Boolean r20, java.lang.Long r21) {
                /*
                    r17 = this;
                    r1 = r17
                    X.7TL r0 = X.C7TL.this
                    boolean r11 = r11
                    java.lang.String r2 = r2
                    java.lang.String r10 = r3
                    java.lang.String r9 = r4
                    java.lang.String r8 = r5
                    java.lang.String r7 = r6
                    java.lang.String r6 = r7
                    java.lang.String r5 = r8
                    java.lang.String r4 = r9
                    java.lang.String r3 = r10
                    com.instagram.common.session.UserSession r1 = r0.A00
                    java.lang.Class<X.1dn> r0 = X.C30841dn.class
                    r12 = r18
                    X.JTa r12 = X.AbstractC31277Doz.A05(r1, r12, r0, r2, r11)
                    long r15 = X.AbstractC31177DnL.A05()
                    X.1dn r11 = new X.1dn
                    r13 = r19
                    r14 = r21
                    r11.<init>(r12, r13, r14, r15)
                    r11.A04 = r10
                    r11.A02 = r9
                    r1 = 4
                    if (r10 == 0) goto L84
                    int r0 = r10.length()
                    if (r0 == 0) goto L84
                    r1 = 3
                    java.util.Locale r2 = java.util.Locale.US
                    java.lang.Object[] r0 = new java.lang.Object[]{r6, r7, r10}
                    java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
                    java.lang.String r0 = "https://www.instagram.com/_n/product_collection?title=%s&merchant_id=%s&link_id=%s"
                L49:
                    java.lang.String r2 = java.lang.String.format(r2, r0, r1)
                    X.C14360o3.A07(r2)
                L50:
                    if (r4 == 0) goto L59
                    int r1 = r4.length()
                    r0 = 0
                    if (r1 != 0) goto L5a
                L59:
                    r0 = 1
                L5a:
                    r1 = 0
                    if (r0 == 0) goto L5e
                    r4 = r1
                L5e:
                    if (r3 == 0) goto L66
                    int r0 = r3.length()
                    if (r0 != 0) goto L67
                L66:
                    r3 = r1
                L67:
                    if (r5 == 0) goto L75
                    int r0 = r5.length()
                    if (r0 == 0) goto L75
                    r0 = -1
                    com.instagram.model.mediasize.ExtendedImageUrl r1 = new com.instagram.model.mediasize.ExtendedImageUrl
                    r1.<init>(r5, r0, r0)
                L75:
                    X.43t r0 = X.AbstractC47996LLi.A0F(r1, r6, r4, r3, r2)
                    java.util.List r0 = java.util.Collections.singletonList(r0)
                    r11.A05 = r0
                    r11.A01 = r7
                    r11.A03 = r8
                    return r11
                L84:
                    int r0 = r9.length()
                    if (r0 != 0) goto L94
                    java.lang.String r1 = "GenericFBAttachment_createPendingShopsCollectionAttachment"
                    java.lang.String r0 = "neither collection_id nor link_id is provided"
                    X.C0w9.A03(r1, r0)
                    java.lang.String r2 = ""
                    goto L50
                L94:
                    java.util.Locale r2 = java.util.Locale.US
                    java.lang.Object[] r0 = new java.lang.Object[]{r9, r8, r7, r6}
                    java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
                    java.lang.String r0 = "https://www.instagram.com/_n/product_collection?collection_id=%s&collection_type=%s&merchant_id=%s&title=%s"
                    goto L49
                */
                throw new UnsupportedOperationException("Method not decompiled: X.G6P.AXZ(X.L1W, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Long):X.1ae");
            }
        }, this, new C32068E6u(str10, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void EOW(DirectShareTarget directShareTarget, final User user, String str, final String str2, final String str3, final String str4, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.Lql
            /* JADX WARN: Type inference failed for: r5v1, types: [X.1ae, X.1e3] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str5 = str2;
                User user2 = user;
                String str6 = str3;
                String str7 = str4;
                JTa A05 = AbstractC31277Doz.A05(c7tl.A00, l1w, C31001e3.class, str5, z2);
                long A052 = AbstractC31177DnL.A05();
                String id = user2.getId();
                String username = user2.getUsername();
                ImageUrl Bhu = user2.Bhu();
                ?? abstractC29011ae = new AbstractC29011ae(A05, directThreadKey, l, A052);
                abstractC29011ae.A02 = id;
                abstractC29011ae.A05 = username;
                abstractC29011ae.A04 = str6;
                abstractC29011ae.A03 = str7;
                abstractC29011ae.A01 = Bhu;
                abstractC29011ae.A00 = AbstractC25225BEi.A0t("https://static.xx.fbcdn.net/rsrc.php/v3/yE/r/YrvGZ_MpBMD.png");
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void EOp(DirectShareTarget directShareTarget, String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.LqY
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Knl] */
            /* JADX WARN: Type inference failed for: r1v1, types: [X.1ae, X.1dA] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C30501dA.class, str2, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A00 = new Object();
                return abstractC29011ae;
            }
        }, this, new C32068E6u(str2, z, false), directShareTarget, str);
    }

    public static C7TL A00(final UserSession userSession) {
        return (C7TL) userSession.A01(C7TL.class, new InterfaceC16820sZ() { // from class: X.7TN
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                final UserSession userSession2 = UserSession.this;
                return new C7TL(userSession2, C13920nI.A00, AbstractC28761aE.A00(userSession2), C1OU.A04(userSession2), new InterfaceC08830cm() { // from class: X.7TO
                    @Override // X.InterfaceC08830cm
                    public final Object get() {
                        return C26141Ov.A01(UserSession.this);
                    }
                });
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r1 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C47625L1k r22, X.C7TL r23, X.C32068E6u r24, X.EnumC46200Kcc r25, com.instagram.model.direct.DirectShareTarget r26, X.C2EY r27, java.lang.String r28, java.lang.String r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TL.A01(X.L1k, X.7TL, X.E6u, X.Kcc, com.instagram.model.direct.DirectShareTarget, X.2EY, java.lang.String, java.lang.String, boolean):void");
    }

    public static void A02(InterfaceC37118GXd interfaceC37118GXd, C7TL c7tl, C32068E6u c32068E6u, DirectShareTarget directShareTarget, String str) {
        c7tl.A04(interfaceC37118GXd, c32068E6u, directShareTarget, str, "unknown");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02c5, code lost:
    
        if (r3.B2W().A00 != X.EnumC46242KdI.A04) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x031c, code lost:
    
        if (r3.Aic().A02() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0321, code lost:
    
        if (r3 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (X.AbstractC159387Cy.A07(r6, r32, r33) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151 A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0155 A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179 A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183 A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0188 A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192 A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197 A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0 A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ac A[Catch: NumberFormatException -> 0x01e0, TryCatch #0 {NumberFormatException -> 0x01e0, blocks: (B:25:0x0094, B:26:0x00b1, B:42:0x00b6, B:46:0x014d, B:48:0x01b1, B:49:0x01b5, B:50:0x01b9, B:52:0x0151, B:54:0x0155, B:57:0x016e, B:60:0x0167, B:63:0x0179, B:64:0x019b, B:65:0x017e, B:66:0x0183, B:67:0x0188, B:68:0x018d, B:69:0x0192, B:70:0x0197, B:71:0x01a0, B:72:0x01ac, B:73:0x00c1, B:76:0x00cb, B:79:0x00d6, B:82:0x00e1, B:85:0x00ec, B:88:0x00f7, B:91:0x0102, B:94:0x010d, B:97:0x0118, B:100:0x0123, B:103:0x012e), top: B:24:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(X.AbstractC29011ae r32, com.instagram.model.direct.DirectThreadKey r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TL.A05(X.1ae, com.instagram.model.direct.DirectThreadKey, java.lang.String):void");
    }

    public final void A06(Context context, DirectShareTarget directShareTarget, String str, int i, int i2, boolean z, boolean z2) {
        UserSession userSession = this.A00;
        C47Z A05 = LLY.A05(context, userSession, directShareTarget.A00(), str, i, i2, z2);
        C2DS c2ds = this.A02;
        C7Q4 A00 = AbstractC47064KrL.A00(A05);
        A00.A0A = z2;
        DirectThreadKey BKb = c2ds.BZQ(directShareTarget).BKb();
        L1W A002 = LCT.A00(userSession, BKb);
        Long BX2 = c2ds.BX2(BKb);
        C26141Ov c26141Ov = (C26141Ov) this.A04.get();
        C31071eB c31071eB = new C31071eB(null, AbstractC31277Doz.A04(userSession, A002, C29481bP.class, null, null, z), A00, BKb, BX2, i, i2, System.currentTimeMillis() * 1000);
        c26141Ov.A0B(c31071eB);
        C162337Ov.A0i(userSession, BKb, C162337Ov.A04(c31071eB.Ar9(), c31071eB.A05(), false), c31071eB.A06(), ((C1OW) c31071eB).A02.A09);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0119, code lost:
    
        if (r4.B2W().A00 != X.EnumC46242KdI.A04) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0174, code lost:
    
        if (r4.Aic().A02() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0179, code lost:
    
        if (r4 != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0157  */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.1er, X.1OW] */
    @Override // X.C7TM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AWc(com.instagram.direct.model.DirectForwardingParams r45, com.instagram.model.direct.DirectShareTarget r46, X.C2EY r47, java.lang.String r48, java.lang.String r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TL.AWc(com.instagram.direct.model.DirectForwardingParams, com.instagram.model.direct.DirectShareTarget, X.2EY, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // X.C7TM
    public final void ENC(final SocialContextType socialContextType, final C38321qM c38321qM, DirectShareTarget directShareTarget, String str, final String str2, final String str3, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G6E
            /* JADX WARN: Type inference failed for: r0v2, types: [X.75n, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v1, types: [X.1ae, X.1cq] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                String str4;
                C7TL c7tl = this;
                boolean z2 = z;
                String str5 = str2;
                C38321qM c38321qM2 = c38321qM;
                String str6 = str3;
                SocialContextType socialContextType2 = socialContextType;
                JTa A04 = AbstractC31277Doz.A04(c7tl.A00, l1w, C30351cq.class, str5, null, z2);
                long A05 = AbstractC31177DnL.A05();
                C14360o3.A0B(directThreadKey, 2);
                ?? abstractC29011ae = new AbstractC29011ae(A04, directThreadKey, l, A05);
                ?? obj = new Object();
                obj.A01 = c38321qM2;
                obj.A03 = str6;
                abstractC29011ae.A00 = obj;
                abstractC29011ae.A01 = str6;
                int ordinal = socialContextType2.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 15) {
                        str4 = null;
                    } else {
                        str4 = "SPOTLIGHT";
                    }
                } else {
                    str4 = "BLEND";
                }
                abstractC29011ae.A02 = str4;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(z, str2), directShareTarget, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r27.equals("direct_reply_to_story_commenter") != false) goto L12;
     */
    @Override // X.C7TM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ENG(X.C148286ly r21, final X.C38321qM r22, final com.instagram.model.direct.DirectPendingLayeredXma r23, com.instagram.model.direct.DirectShareTarget r24, final java.lang.String r25, java.lang.String r26, final java.lang.String r27, final boolean r28, final boolean r29) {
        /*
            r20 = this;
            r2 = r22
            java.lang.String r1 = r2.A2f()
            boolean r0 = r2.A5P()
            r5 = r25
            if (r1 != 0) goto L59
            r8 = 0
        Lf:
            X.1rF r0 = r2.A0C
            com.instagram.user.model.User r0 = r0.CDj()
            r17 = 0
            if (r0 == 0) goto L56
            X.1rF r0 = r2.A0C
            com.instagram.user.model.User r0 = r0.CDj()
            java.lang.String r7 = r0.getUsername()
        L23:
            r16 = r26
            r4 = r27
            if (r27 == 0) goto L33
            java.lang.String r0 = "direct_reply_to_story_commenter"
            boolean r0 = r4.equals(r0)
            r6 = r16
            if (r0 == 0) goto L35
        L33:
            r6 = r17
        L35:
            r0 = 0
            X.E6u r13 = new X.E6u
            r9 = r28
            r13.<init>(r4, r9, r0)
            X.G6O r0 = new X.G6O
            r1 = r20
            r3 = r23
            r10 = r29
            r0.<init>()
            X.2EY r15 = X.C2EY.A0c
            java.lang.String r18 = "unknown"
            r14 = r24
            r11 = r1
            r12 = r0
            r19 = r10
            r11.A03(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L56:
            r7 = r17
            goto L23
        L59:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r5}
            if (r0 == 0) goto L66
            java.lang.String r0 = "https://www.instagram.com/reel/%s?comment_id=%s&open_comments=true"
        L61:
            java.lang.String r8 = X.AbstractC13670mt.A06(r0, r1)
            goto Lf
        L66:
            java.lang.String r0 = "https://www.instagram.com/p/%s?comment_id=%s"
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TL.ENG(X.6ly, X.1qM, com.instagram.model.direct.DirectPendingLayeredXma, com.instagram.model.direct.DirectShareTarget, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override // X.C7TM
    public final void ENV(final EnumC33381EpE enumC33381EpE, DirectShareTarget directShareTarget, final Long l, final String str, String str2, final String str3, final long j, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G6J
            /* JADX WARN: Type inference failed for: r7v1, types: [X.1lN, X.1ae] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l2) {
                String str4;
                C7TL c7tl = this;
                boolean z2 = z;
                String str5 = str3;
                long j2 = j;
                Long l3 = l;
                String str6 = str;
                EnumC33381EpE enumC33381EpE2 = enumC33381EpE;
                UserSession userSession = c7tl.A00;
                JTa A06 = AbstractC31277Doz.A06(userSession, l1w, C35411lN.class, str5, z2, false);
                if (enumC33381EpE2 != null) {
                    str4 = enumC33381EpE2.A00;
                } else {
                    str4 = null;
                }
                long A05 = AbstractC31177DnL.A05();
                AbstractC167007dF.A1J(directThreadKey, 2, userSession);
                ?? abstractC29011ae = new AbstractC29011ae(A06, directThreadKey, l2, A05);
                abstractC29011ae.A02 = directThreadKey;
                abstractC29011ae.A01 = userSession;
                abstractC29011ae.A00 = j2;
                abstractC29011ae.A03 = l3;
                abstractC29011ae.A04 = str6;
                abstractC29011ae.A05 = str4;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(z, str3), directShareTarget, str2);
    }

    @Override // X.C7TM
    public final void ENW(final InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf, DirectShareTarget directShareTarget, String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.Lqa
            /* JADX WARN: Type inference failed for: r3v1, types: [X.1ae, X.1dJ] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str3 = str2;
                InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf2 = infoCenterFactShareInfoIntf;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C1dJ.class, str3, z2), directThreadKey, l, AbstractC31177DnL.A05());
                InfoCenterFactShareInfo infoCenterFactShareInfo = (InfoCenterFactShareInfo) infoCenterFactShareInfoIntf2;
                abstractC29011ae.A03 = infoCenterFactShareInfo.A00;
                abstractC29011ae.A08 = infoCenterFactShareInfo.A0A;
                abstractC29011ae.A09 = infoCenterFactShareInfo.A0B;
                abstractC29011ae.A0B = infoCenterFactShareInfo.A0G;
                abstractC29011ae.A0A = infoCenterFactShareInfo.A0F;
                abstractC29011ae.A05 = infoCenterFactShareInfo.A07;
                abstractC29011ae.A00 = infoCenterFactShareInfoIntf2.BDE();
                abstractC29011ae.A01 = infoCenterFactShareInfoIntf2.Alv();
                abstractC29011ae.A07 = infoCenterFactShareInfo.A09;
                abstractC29011ae.A04 = infoCenterFactShareInfo.A01;
                abstractC29011ae.A06 = infoCenterFactShareInfo.A08;
                abstractC29011ae.A02 = infoCenterFactShareInfoIntf2;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(z, str2), directShareTarget, str);
    }

    @Override // X.C7TM
    public final void ENd(final Context context, DirectShareTarget directShareTarget, final String str, final String str2, String str3, String str4, final String str5, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.Lqk
            /* JADX WARN: Type inference failed for: r6v1, types: [X.1ae, X.1cH] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = this;
                String str6 = str;
                final String str7 = str2;
                Context context2 = context;
                boolean z2 = z;
                String str8 = str5;
                String A01 = C47842LBj.A00().A01(C2EY.A1B, new C47551KzL(str6, new InterfaceC16820sZ() { // from class: X.M8e
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        return str7;
                    }
                }));
                String format = String.format(Locale.getDefault(), context2.getString(2131959762), str7, A01);
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C30011cH.class, str8, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A05 = false;
                abstractC29011ae.A03 = str6;
                abstractC29011ae.A04 = str7;
                IKN ikn = new IKN();
                ikn.A08 = "";
                abstractC29011ae.A01 = ikn;
                abstractC29011ae.A02 = format;
                abstractC29011ae.A05 = false;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(z, str4), directShareTarget, str3);
    }

    @Override // X.C7TM
    public final void ENh(DirectShareTarget directShareTarget, final String str, String str2, final String str3, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G67
            /* JADX WARN: Type inference failed for: r1v2, types: [X.1ae, X.1jR] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str4 = str3;
                String str5 = str;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A04(c7tl.A00, l1w, C34271jR.class, str4, null, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A00 = str5;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(z, str3), directShareTarget, str2);
    }

    @Override // X.C7TM
    public final void ENi(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
        C2DS c2ds = this.A02;
        DirectThreadKey BKb = c2ds.BZQ(directShareTarget).BKb();
        Long BX2 = c2ds.BX2(BKb);
        UserSession userSession = this.A00;
        JTa A03 = AbstractC31277Doz.A03(userSession, LCT.A00(userSession, BKb), C30061cM.class, str3, str2, null, z2, false);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        String str4 = null;
        c38321qM.getClass();
        Integer num = C05F.A00;
        if (z) {
            str4 = str;
        }
        final C30061cM A00 = F6H.A00(null, null, A03, c38321qM, BKb, num, BX2, null, str4, currentTimeMillis, false, z, false);
        A01(new C47625L1k(new InterfaceC37118GXd() { // from class: X.G61
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                return C30061cM.this;
            }
        }, this, "unknown"), this, new C32068E6u(str2, str3, z2, false), null, directShareTarget, null, str, null, z);
    }

    @Override // X.C7TM
    public final void ENw(DirectShareTarget directShareTarget, String str, final String str2, final String str3, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G64
            /* JADX WARN: Type inference failed for: r1v2, types: [X.1ae, X.1jj] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str4 = str3;
                String str5 = str2;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A04(c7tl.A00, l1w, C34451jj.class, str4, null, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A00 = str5;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(z, str3), directShareTarget, str);
        UserSession userSession = this.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36328504131862091L)) {
            C14360o3.A0B(userSession, 1);
            C40701ud A01 = AbstractC40691uc.A01(userSession);
            ArrayList A0B = directShareTarget.A0B();
            C14360o3.A0B(str2, 1);
            C2JO c2jo = new C2JO();
            c2jo.A09(str2, "access_token");
            c2jo.A05("sponsors", A0B);
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A00(c2jo, "data");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            C1GJ.A06(AnonymousClass963.A00(A01.A03(new PandoGraphQLRequest(AbstractC40511uK.A00(), "AddSharedWithSponsorToAdsBoostPostAccessTokenMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59104QXk.class, true, null, 0, null, "xdt_creator_ads_add_shared_with_sponsor_to_ads_boost_post_access_token", new ArrayList()))), -5, 3, false, false);
        }
    }

    @Override // X.C7TM
    public final void EO0(Context context, AnonymousClass442 anonymousClass442, DirectShareTarget directShareTarget, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, boolean z) {
        EnumC46200Kcc enumC46200Kcc;
        if (!TextUtils.isEmpty(str)) {
            enumC46200Kcc = EnumC46200Kcc.A06;
        } else {
            enumC46200Kcc = EnumC46200Kcc.A04;
        }
        A01(new C47625L1k(new C49293Lqn(context, anonymousClass442, this, enumC46200Kcc, directShareTarget, c47z, c183978Ee, str2, str3, z, false), this, "unknown"), this, new C32068E6u(z, str2), enumC46200Kcc, directShareTarget, null, str, null, false);
    }

    @Override // X.C7TM
    public final void EO3(DirectShareTarget directShareTarget, final String str, final String str2, final String str3, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G69
            /* JADX WARN: Type inference failed for: r3v1, types: [X.1ae, X.1lC] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str4 = str3;
                String str5 = str;
                String str6 = str2;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A06(c7tl.A00, l1w, C35301lC.class, str4, z2, false), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A01 = "";
                abstractC29011ae.A00 = str5;
                abstractC29011ae.A01 = str6;
                return abstractC29011ae;
            }
        }, this, new C32068E6u(z, str3), directShareTarget, str2);
    }

    @Override // X.C7TM
    public final void EO5(C148286ly c148286ly, DirectShareTarget directShareTarget, final User user, String str, final String str2, String str3, final boolean z) {
        String A00 = MSV.A00(64);
        A04(new InterfaceC37118GXd() { // from class: X.G68
            /* JADX WARN: Type inference failed for: r4v1, types: [X.1ae, X.1dN] */
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                String str4 = str2;
                User user2 = user;
                ?? abstractC29011ae = new AbstractC29011ae(AbstractC31277Doz.A05(c7tl.A00, l1w, C1dN.class, str4, z2), directThreadKey, l, AbstractC31177DnL.A05());
                abstractC29011ae.A01 = user2;
                abstractC29011ae.A02 = false;
                return abstractC29011ae;
            }
        }, new C32068E6u(str2, z, false), directShareTarget, str, A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0095, code lost:
    
        if (r8 != null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1ae, X.1bn, X.1OW] */
    @Override // X.C7TM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EOB(X.C45001Jvr r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TL.EOB(X.Jvr, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.C7TM
    public final void EOM(DirectShareTarget directShareTarget, String str, final String str2, final boolean z) {
        A02(new InterfaceC37118GXd() { // from class: X.G63
            @Override // X.InterfaceC37118GXd
            public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                C7TL c7tl = C7TL.this;
                boolean z2 = z;
                return new AbstractC29011ae(AbstractC31277Doz.A04(c7tl.A00, l1w, C34371jb.class, str2, null, z2), directThreadKey, l, AbstractC31177DnL.A05());
            }
        }, this, new C32068E6u(z, str2), directShareTarget, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.1ae, X.1eK, X.1OW] */
    @Override // X.C7TM
    public final void EOU(C45001Jvr c45001Jvr, String str) {
        C2DS c2ds = this.A02;
        DirectThreadKey BKb = c2ds.BZQ(c45001Jvr.A01).BKb();
        Long BX2 = c2ds.BX2(BKb);
        UserSession userSession = this.A00;
        JTa A04 = AbstractC31277Doz.A04(userSession, LCT.A00(userSession, BKb), C29721bn.class, str, null, false);
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        String str2 = c45001Jvr.A0J;
        String str3 = c45001Jvr.A0B;
        String str4 = c45001Jvr.A0C;
        String str5 = c45001Jvr.A0D;
        String str6 = c45001Jvr.A0F;
        ?? abstractC29011ae = new AbstractC29011ae(A04, BKb, BX2, currentTimeMillis);
        abstractC29011ae.A01 = str6;
        abstractC29011ae.A00 = new C26069Bfx(str2, str3, str4, str5, 11);
        ((C26141Ov) this.A04.get()).A0B(abstractC29011ae);
        C162337Ov.A0g(userSession, BKb, C2EY.A0z, abstractC29011ae.A06(), abstractC29011ae.A02.A09);
    }

    @Override // X.C7TM
    public final void EOV(C148286ly c148286ly, C32068E6u c32068E6u, C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        A04(new G6I(this, c32068E6u, c38321qM, str, str2), c32068E6u, directShareTarget, str3, str4);
    }

    @Override // X.C7TM
    @Deprecated
    public final void EOX(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2) {
        throw new IllegalStateException("Stub");
    }

    @Override // X.C7TM
    public final void EOf(EnumC46200Kcc enumC46200Kcc, DirectShareTarget directShareTarget, Boolean bool, String str, String str2, String str3, boolean z) {
        DirectThreadKey BKb = this.A02.BZQ(directShareTarget).BKb();
        UserSession userSession = this.A00;
        LCT.A00(userSession, BKb);
        C14360o3.A0B(userSession, 0);
        LJP.A00(null, userSession, null, null, null, null, enumC46200Kcc, BKb, bool, null, null, null, null, null, str, NetInfoModule.CONNECTION_TYPE_NONE, str2, null, null, str3, null, null, null, null, z, false, false);
    }

    @Override // X.C7TM
    public final void EOi(Context context, C26069Bfx c26069Bfx, AnonymousClass442 anonymousClass442, DirectShareTarget directShareTarget, ClipInfo clipInfo, C47Z c47z, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        EnumC46200Kcc enumC46200Kcc;
        if (!TextUtils.isEmpty(str2)) {
            enumC46200Kcc = EnumC46200Kcc.A06;
        } else {
            enumC46200Kcc = EnumC46200Kcc.A04;
        }
        A01(new C47625L1k(new C49294Lqo(context, c26069Bfx, anonymousClass442, this, enumC46200Kcc, clipInfo, c47z, bool, str, str3, str6, str4, str5, z, z2, false, z3), this, "unknown"), this, new C32068E6u(z, str3), enumC46200Kcc, directShareTarget, null, str2, null, false);
    }

    public C7TL(UserSession userSession, C13920nI c13920nI, C2DS c2ds, ReelStore reelStore, InterfaceC08830cm interfaceC08830cm) {
        this.A00 = userSession;
        this.A02 = c2ds;
        this.A04 = interfaceC08830cm;
        this.A05 = c13920nI;
        this.A03 = reelStore;
        this.A01 = C120005by.A00(userSession);
    }

    @Override // X.C7TM
    public final void END(final SocialContextType socialContextType, C148286ly c148286ly, final C38321qM c38321qM, final DirectShareTarget directShareTarget, final String str, final String str2, String str3, final String str4, final String str5, final boolean z) {
        final String valueOf = String.valueOf(C0HN.A00());
        boolean z2 = false;
        if (socialContextType == SocialContextType.A0E) {
            z2 = true;
        }
        C32068E6u c32068E6u = new C32068E6u(str2, z, z2);
        InterfaceC37118GXd interfaceC37118GXd = new InterfaceC37118GXd() { // from class: X.G6N
            /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
            
                if (r11.isEmpty() != false) goto L7;
             */
            @Override // X.InterfaceC37118GXd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC29011ae AXZ(X.L1W r25, com.instagram.model.direct.DirectThreadKey r26, java.lang.Boolean r27, java.lang.Long r28) {
                /*
                    r24 = this;
                    r1 = r24
                    X.7TL r0 = r2
                    java.lang.String r5 = r5
                    boolean r4 = r10
                    java.lang.String r3 = r6
                    java.lang.String r2 = r7
                    X.1qM r8 = r3
                    java.lang.String r11 = r8
                    com.instagram.api.schemas.SocialContextType r6 = r1
                    java.lang.String r12 = r9
                    com.instagram.model.direct.DirectShareTarget r1 = r4
                    com.instagram.common.session.UserSession r0 = r0.A00
                    java.lang.Class<X.1cU> r18 = X.C30141cU.class
                    r15 = 0
                    r17 = r25
                    r20 = r3
                    r21 = r2
                    r22 = r4
                    r23 = r15
                    r19 = r5
                    r16 = r0
                    X.JTa r7 = X.AbstractC31277Doz.A03(r16, r17, r18, r19, r20, r21, r22, r23)
                    long r13 = X.AbstractC31177DnL.A05()
                    boolean r0 = r1.A0Q()
                    if (r0 == 0) goto L41
                    if (r11 == 0) goto L41
                    boolean r0 = r11.isEmpty()
                    r16 = 1
                    if (r0 == 0) goto L43
                L41:
                    r16 = 0
                L43:
                    X.1cU r5 = new X.1cU
                    r9 = r26
                    r10 = r28
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X.G6N.AXZ(X.L1W, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Long):X.1ae");
            }
        };
        C2EY c2ey = C2EY.A0W;
        boolean z3 = false;
        if (str4 != null) {
            z3 = true;
        }
        A03(interfaceC37118GXd, c32068E6u, directShareTarget, c2ey, str, valueOf, str3, z3);
    }

    @Override // X.C7TM
    public final void ENj(final SocialContextType socialContextType, C148286ly c148286ly, final C32068E6u c32068E6u, final C38321qM c38321qM, final DirectShareTarget directShareTarget, Long l, final String str, final String str2, final String str3) {
        final Long valueOf = Long.valueOf(System.currentTimeMillis() * 1000);
        final String valueOf2 = String.valueOf(C0HN.A00());
        A01(new C47625L1k(new InterfaceC37118GXd() { // from class: X.G6M
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0045, code lost:
            
                if (r3.isEmpty() != false) goto L7;
             */
            @Override // X.InterfaceC37118GXd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC29011ae AXZ(X.L1W r21, com.instagram.model.direct.DirectThreadKey r22, java.lang.Boolean r23, java.lang.Long r24) {
                /*
                    r20 = this;
                    r1 = r20
                    X.7TL r0 = r2
                    java.lang.String r13 = r7
                    X.E6u r8 = r3
                    java.lang.String r7 = r8
                    X.1qM r9 = r4
                    java.lang.Long r6 = r6
                    com.instagram.model.direct.DirectShareTarget r4 = r5
                    java.lang.String r3 = r9
                    java.lang.String r2 = r10
                    com.instagram.api.schemas.SocialContextType r1 = r1
                    com.instagram.common.session.UserSession r10 = r0.A00
                    java.lang.Class<X.1cM> r12 = X.C30061cM.class
                    boolean r5 = r8.A02
                    boolean r0 = r8.A03
                    java.lang.String r14 = r8.A01
                    r11 = r21
                    r15 = r7
                    r16 = r5
                    r17 = r0
                    X.JTa r8 = X.AbstractC31277Doz.A03(r10, r11, r12, r13, r14, r15, r16, r17)
                    long r15 = r6.longValue()
                    r13 = 0
                    r7 = 0
                    r6 = 0
                    r10 = r22
                    r10.getClass()
                    boolean r0 = r4.A0Q()
                    if (r0 == 0) goto L47
                    if (r3 == 0) goto L47
                    boolean r0 = r3.isEmpty()
                    r19 = 1
                    if (r0 == 0) goto L49
                L47:
                    r19 = 0
                L49:
                    if (r2 == 0) goto L4c
                    r13 = r2
                L4c:
                    if (r1 == 0) goto L4f
                    r6 = r1
                L4f:
                    r17 = 0
                    r12 = r24
                    r11 = r7
                    r14 = r7
                    r18 = r17
                    X.1cM r0 = X.F6H.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.G6M.AXZ(X.L1W, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Long):X.1ae");
            }
        }, this, "unknown"), this, c32068E6u, null, directShareTarget, null, str, valueOf2, false);
    }
}
