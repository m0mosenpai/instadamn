package com.instagram.user.model;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC003100w;
import X.AbstractC06930Yk;
import X.AbstractC06950Ym;
import X.AbstractC12990ll;
import X.AbstractC13230m9;
import X.AbstractC151186rL;
import X.AbstractC25651Mw;
import X.AbstractC39881tC;
import X.AbstractC47068KrP;
import X.AnonymousClass001;
import X.AnonymousClass172;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C0YZ;
import X.C0w9;
import X.C14360o3;
import X.C150866ql;
import X.C16920sk;
import X.C16930sl;
import X.C16Z;
import X.C17L;
import X.C17M;
import X.C17N;
import X.C17O;
import X.C17P;
import X.C17Q;
import X.C17R;
import X.C18U;
import X.C1DY;
import X.C2AS;
import X.C39891tD;
import X.C43P;
import X.C44B;
import X.C72093Lh;
import X.C9Ay;
import X.EnumC154216wW;
import X.EnumC199318rY;
import X.EnumC222416a;
import X.EnumC33406Epd;
import X.HandlerC39971tL;
import X.InterfaceC37262GbF;
import X.InterfaceC81773kp;
import X.InterfaceC82273lo;
import X.JLK;
import X.WDp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.FanClubStatusSyncInfo;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.api.schemas.IGUserThirdPartyDownloads;
import com.instagram.api.schemas.ProfilePicUrlInfo;
import com.instagram.api.schemas.ProfilePicUrlInfoImpl;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDict;
import com.instagram.api.schemas.UserRelatedAccountsInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class User implements Parcelable, AnonymousClass172, C17L, C17M, C17N {
    public static HandlerC39971tL A07;
    public static final SimpleImageUrl A08 = new SimpleImageUrl("");
    public static final Parcelable.Creator CREATOR = new C9Ay(72);
    public int A00;
    public long A01;
    public C17Q A02;
    public C17P A03;
    public Integer A04;
    public Map A05;
    public final boolean A06;

    public final void A0Y() {
        this.A03.Ebg(false);
    }

    public final void A0c(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        String username = this.A03.getUsername();
        if (username == null || username.length() == 0) {
            C0w9.A04("username_missing_during_update", AnonymousClass001.A0g("Username for user ", getId(), " was null when broadcasting an update."), 1);
        }
        AbstractC25651Mw.A00(abstractC12990ll).E4s(new C2AS(this));
    }

    public final void A0d(AbstractC12990ll abstractC12990ll) {
        int intValue;
        C14360o3.A0B(abstractC12990ll, 0);
        Integer B7S = this.A03.B7S();
        if (B7S != null && (intValue = B7S.intValue()) > 0) {
            this.A03.EUj(Integer.valueOf(intValue - 1));
            A0c(abstractC12990ll);
        }
    }

    public final void A0e(AbstractC12990ll abstractC12990ll) {
        int intValue;
        C14360o3.A0B(abstractC12990ll, 0);
        Integer B7X = this.A03.B7X();
        if (B7X != null && (intValue = B7X.intValue()) > 0) {
            this.A03.EUk(Integer.valueOf(intValue - 1));
            A0c(abstractC12990ll);
        }
    }

    public final void A0h(UserSession userSession, User user, boolean z) {
        FriendshipStatus A00;
        C14360o3.A0B(userSession, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36327164104554842L)) {
            this.A03.En4();
        }
        FriendshipStatus B8n = user.A03.B8n();
        if (B8n != null) {
            FriendshipStatus B8n2 = this.A03.B8n();
            if (B8n2 != null && (A00 = AbstractC39881tC.A00(B8n2, B8n)) != null) {
                B8n = A00;
            }
        } else {
            B8n = null;
        }
        if (!z || !(this.A03 instanceof C72093Lh)) {
            this.A03.FB0(user.A03);
        }
        FollowStatus B7L = user.B7L();
        FollowStatus followStatus = FollowStatus.A08;
        if (B7L != followStatus) {
            this.A03.EUi(user.B7L());
            boolean A06 = C18U.A06(c06090Tz, userSession, 36317320039371842L);
            C17P c17p = this.A03;
            FollowStatus A0F = user.A0F();
            if (A06) {
                if (A0F == followStatus) {
                    A0F = this.A03.B7P();
                }
                c17p.EWv(A0F);
            } else {
                c17p.EWv(A0F);
            }
        }
        if (B8n != null && C18U.A06(c06090Tz, userSession, 36326356648212304L)) {
            this.A03.EUq(B8n);
        }
        if (!z) {
            if (B8n != null && !C18U.A06(c06090Tz, userSession, 36326356648212304L)) {
                this.A03.EUq(B8n);
            }
            ImageUrl Bhu = user.Bhu();
            String url = Bhu.getUrl();
            C14360o3.A07(url);
            if (url.length() > 0) {
                this.A03.Ebk(Bhu);
            }
            ImageUrl BGB = user.A03.BGB();
            if (BGB == null) {
                BGB = A08;
            }
            String url2 = BGB.getUrl();
            C14360o3.A07(url2);
            if (url2.length() > 0) {
                this.A03.EVv(BGB);
            }
            ImageUrl C67 = user.A03.C67();
            if (C67 == null) {
                C67 = A08;
            }
            String url3 = C67.getUrl();
            C14360o3.A07(url3);
            if (url3.length() > 0) {
                this.A03.EfX(C67);
            }
            if (user.A03.BB5() != null && C14360o3.A0K(user.A03.BB5(), true)) {
                this.A03.Ebj(null);
                this.A03.EVh(null);
            }
            if (user.A2H()) {
                this.A03.ER3(Boolean.valueOf(user.A1K()));
            }
            if (!user.A2H()) {
                this.A03.Eai(user.A03.Bce());
            }
            if (!user.A2H()) {
                this.A03.Eaj(user.A03.Bcf());
            }
            if (C14360o3.A0K(user.A03.Bvs(), true)) {
                this.A03.EYN(user.A03.BNu());
            }
            if (user.A03.C6W() != null) {
                this.A03.Efa(user.A03.C6W());
            }
            if (user.A03.B4P() != null) {
                A0Z();
            }
            this.A03.Edw(user.A03.Bum());
            this.A03.EUO(user.A03.B5s());
            this.A03.EWI(user.A03.BJ9());
            this.A03.ERq(user.A03.Apq());
            this.A03.EWG(user.A03.CX0());
            this.A03.EPN(user.A03.AZx());
            this.A00 = user.A00;
        }
        this.A03.E6n();
    }

    public final void A0n(Integer num) {
        Boolean bool;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue != 2) {
            if (intValue != 1) {
                bool = null;
            } else {
                bool = false;
            }
        } else {
            bool = true;
        }
        A0m(bool);
    }

    @Override // X.AnonymousClass178
    public final boolean CS0(C150866ql c150866ql) {
        C14360o3.A0B(c150866ql, 0);
        if (C14360o3.A0K(this.A03.CRy(), true)) {
            String userId = this.A03.getUserId();
            if (userId == null) {
                userId = "";
            }
            UserSession userSession = c150866ql.A00;
            if (userId.equals(userSession.userId) || C18U.A06(C06090Tz.A05, userSession, 36323672293912033L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(getId());
        parcel.writeString(this.A03.getUsername());
        parcel.writeString(this.A03.getFullName());
        parcel.writeString(this.A03.Ag3());
        WDp.A01(parcel, this.A03.Cb1());
        parcel.writeParcelable(this.A03.B8n(), i);
        WDp.A01(parcel, this.A03.CfY());
        parcel.writeParcelable(this.A03.Bhu(), i);
        parcel.writeParcelable(this.A03.BSX(), i);
        parcel.writeParcelable(this.A03.Bt7(), i);
        WDp.A01(parcel, this.A03.Ay5());
        WDp.A01(parcel, this.A03.Bwt());
        parcel.writeString(this.A03.getStorefrontAttributionUsername());
    }

    public final int A00() {
        Integer CHA = this.A03.CHA();
        if (CHA != null) {
            return CHA.intValue();
        }
        return -1;
    }

    public final int A01() {
        Integer Ae8 = this.A03.Ae8();
        if (Ae8 != null) {
            return Ae8.intValue();
        }
        return 0;
    }

    public final int A02() {
        Integer AfF = this.A03.AfF();
        if (AfF != null) {
            return AfF.intValue();
        }
        return 0;
    }

    public final int A03() {
        Integer BTN = this.A03.BTN();
        if (BTN != null) {
            return BTN.intValue();
        }
        return 0;
    }

    public final int A04() {
        Integer Bor = this.A03.Bor();
        if (Bor != null) {
            return Bor.intValue();
        }
        return 0;
    }

    public final int A05() {
        Integer CCv = this.A03.CCv();
        if (CCv != null) {
            return CCv.intValue();
        }
        return 0;
    }

    public final int A06() {
        Integer C9m = this.A03.C9m();
        if (C9m != null) {
            return C9m.intValue();
        }
        return 0;
    }

    public final TreeUpdaterJNI A07() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserDict", AbstractC06930Yk.A06(new C09530e4("__typename", "XDTUserDict"), new C09530e4("strong_id__", getId())));
    }

    public final ImmutableList A08() {
        List Bhf = this.A03.Bhf();
        if (Bhf != null) {
            return ImmutableList.copyOf((Collection) Bhf);
        }
        return null;
    }

    public final IGLiveNotificationPreference A09() {
        IGLiveNotificationPreference BO2 = this.A03.BO2();
        if (BO2 == null) {
            return IGLiveNotificationPreference.A05;
        }
        return BO2;
    }

    public final SellerShoppableFeedType A0A() {
        SellerShoppableFeedType Bt7 = this.A03.Bt7();
        if (Bt7 == null) {
            return SellerShoppableFeedType.A06;
        }
        return Bt7;
    }

    public final UserBannerInlineOtherProfileDict A0B() {
        UserRelatedAccountsInfoDict BTO = this.A03.BTO();
        if (BTO != null) {
            return BTO.AfQ();
        }
        return null;
    }

    public final ExtendedImageUrl A0D() {
        ProfilePicUrlInfo BD7 = this.A03.BD7();
        if (BD7 != null) {
            return new ExtendedImageUrl(BD7.getUrl(), BD7.getWidth(), BD7.getHeight());
        }
        return null;
    }

    public final JLK A0E() {
        Boolean CbH = this.A03.CbH();
        if (CbH != null && CbH.booleanValue()) {
            return this.A03.B3F();
        }
        return null;
    }

    public final FollowStatus A0F() {
        FollowStatus BLV = this.A03.BLV();
        if (BLV == null) {
            return FollowStatus.A08;
        }
        return BLV;
    }

    public final EnumC154216wW A0G() {
        C44B AiG = this.A03.AiG();
        if (AiG == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(AiG.BKO());
        if (!jSONObject.has(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS) || !jSONObject.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS).equals("ok") || !jSONObject.has("notification_setting_type")) {
            return null;
        }
        return EnumC154216wW.values()[jSONObject.getInt("notification_setting_type")];
    }

    public final User A0H(C1DY c1dy) {
        C17O A01;
        C17P c17p = this.A03;
        if (c17p instanceof C17O) {
            return this;
        }
        if (c17p instanceof C39891tD) {
            A01 = ((C39891tD) c17p).A00(c1dy);
        } else if (c17p instanceof C72093Lh) {
            A01 = ((C72093Lh) c17p).A01(c1dy);
        } else {
            Class<?> cls = c17p.getClass();
            Map map = C0YZ.A03;
            C14360o3.A0B(cls, 1);
            throw new Exception(AnonymousClass001.A0R("data is an unknown type: ", AbstractC13230m9.A01(cls)));
        }
        return new User(A01);
    }

    public final EnumC222416a A0I() {
        Integer AY8 = this.A03.AY8();
        if (AY8 != null) {
            return C16Z.A00(AY8.intValue());
        }
        return null;
    }

    public final Boolean A0J() {
        Boolean Cb1 = this.A03.Cb1();
        if (Cb1 == null) {
            FriendshipStatus B8n = this.A03.B8n();
            if (B8n != null) {
                return B8n.Cb1();
            }
            return null;
        }
        return Cb1;
    }

    public final Integer A0K() {
        String Aio = this.A03.Aio();
        if (Aio != null && Aio.length() != 0) {
            try {
                if (Aio.equals("UNKNOWN")) {
                    return C05F.A00;
                }
                if (Aio.equals("CALL")) {
                    return C05F.A01;
                }
                if (Aio.equals("TEXT")) {
                    return C05F.A0C;
                }
                throw new IllegalArgumentException(Aio);
            } catch (IllegalArgumentException unused) {
                return C05F.A00;
            }
        }
        return C05F.A01;
    }

    public final Integer A0L() {
        String BO6 = this.A03.BO6();
        if (BO6 != null) {
            for (Integer num : C05F.A00(4)) {
                if (C14360o3.A0K(AbstractC47068KrP.A00(num), BO6)) {
                    return num;
                }
            }
        }
        return null;
    }

    public final String A0N() {
        String BkX;
        InterfaceC81773kp Ag4 = this.A03.Ag4();
        if (Ag4 == null || (BkX = Ag4.BkX()) == null) {
            return this.A03.Ag3();
        }
        return BkX;
    }

    public final String A0O() {
        String algorithm;
        C43P Amp = this.A03.Amp();
        if (Amp == null || (algorithm = Amp.getAlgorithm()) == null) {
            return "";
        }
        return algorithm;
    }

    public final String A0P() {
        String str;
        String fullName = this.A03.getFullName();
        if (fullName == null || (str = (String) AbstractC001900j.A0R(fullName, new String[]{" "}, 0).get(0)) == null || str.length() == 0) {
            return getUsername();
        }
        return str;
    }

    public final String A0Q() {
        String fullName = this.A03.getFullName();
        if (fullName == null) {
            return "";
        }
        return fullName;
    }

    public final List A0R() {
        InterfaceC37262GbF Ag1 = this.A03.Ag1();
        if (Ag1 != null) {
            return Ag1.BJ1();
        }
        return null;
    }

    public final List A0S() {
        List<String> B12 = this.A03.B12();
        if (B12 != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(B12, 10));
            for (String str : B12) {
                Object obj = EnumC33406Epd.A01.get(str);
                if (obj != null) {
                    arrayList.add(obj);
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A0R("Unrecognized value ", str));
                }
            }
            return arrayList;
        }
        return null;
    }

    public final List A0T() {
        List B19 = this.A03.B19();
        if (B19 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = B19.iterator();
            while (it.hasNext()) {
                Object obj = EnumC199318rY.A01.get(it.next());
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public final List A0U() {
        String A0D;
        List Bhg = this.A03.Bhg();
        ArrayList arrayList = null;
        if (Bhg != null) {
            List<InterfaceC82273lo> A0a = AbstractC001800i.A0a(Bhg);
            arrayList = new ArrayList();
            for (InterfaceC82273lo interfaceC82273lo : A0a) {
                C14360o3.A0B(interfaceC82273lo, 0);
                if (interfaceC82273lo.getUsername() != null && (A0D = AnonymousClass001.A0D(interfaceC82273lo.getUsername(), '@')) != null) {
                    arrayList.add(A0D);
                }
            }
        }
        return arrayList;
    }

    public final void A0V() {
        Integer Afv = this.A03.Afv();
        if (Afv != null) {
            int intValue = Afv.intValue();
            if (A1j()) {
                this.A03.EQG(Integer.valueOf(intValue - 1));
            }
        }
    }

    public final void A0W() {
        int intValue;
        Integer BQb = this.A03.BQb();
        if (BQb != null && (intValue = BQb.intValue()) > 0) {
            this.A03.EYn(Integer.valueOf(intValue - 1));
        }
    }

    public final void A0X() {
        int i;
        C17P c17p = this.A03;
        Integer BQb = c17p.BQb();
        if (BQb != null) {
            i = BQb.intValue() + 1;
        } else {
            i = 0;
        }
        c17p.EYn(Integer.valueOf(i));
    }

    public final void A0Z() {
        C17Q c17q;
        FanClubStatusSyncInfo B4P = this.A03.B4P();
        boolean CQf = CQf();
        if (B4P != null) {
            if (CQf) {
                c17q = C17Q.A02;
            } else if (B4P.C3R()) {
                c17q = C17Q.A06;
            } else if (B4P.B1B()) {
                c17q = C17Q.A03;
            } else if (!B4P.C3R()) {
                c17q = C17Q.A05;
            }
            this.A02 = c17q;
        }
        c17q = C17Q.A08;
        this.A02 = c17q;
    }

    public final void A0a(int i) {
        this.A03.EQE(Integer.valueOf(i));
    }

    public final void A0b(int i) {
        this.A03.EWI(Integer.valueOf(i));
    }

    public final void A0f(AbstractC12990ll abstractC12990ll) {
        Integer B7S = this.A03.B7S();
        if (B7S != null) {
            this.A03.EUj(Integer.valueOf(B7S.intValue() + 1));
            A0c(abstractC12990ll);
        }
    }

    public final void A0g(AbstractC12990ll abstractC12990ll) {
        Integer B7X = this.A03.B7X();
        if (B7X != null) {
            this.A03.EUk(Integer.valueOf(B7X.intValue() + 1));
            A0c(abstractC12990ll);
        }
    }

    public final void A0i(ImageUrl imageUrl) {
        this.A03.Ebk(imageUrl);
    }

    public final void A0j(ExtendedImageUrl extendedImageUrl) {
        this.A03.EVh(new ProfilePicUrlInfoImpl(extendedImageUrl.getHeight(), extendedImageUrl.A0A, extendedImageUrl.getWidth()));
    }

    public final void A0k(FollowStatus followStatus) {
        this.A03.EUi(followStatus);
    }

    public final void A0l(EnumC222416a enumC222416a) {
        if (enumC222416a != null) {
            this.A03.EPA(Integer.valueOf(enumC222416a.A00));
        }
    }

    public final void A0m(Boolean bool) {
        this.A03.EbZ(bool);
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0H = bool;
        c17p.EUq(c17r.A00());
    }

    public final void A0o(Integer num) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0Q = num;
        c17p.EUq(c17r.A00());
    }

    public final void A0p(Long l) {
        String str;
        C17P c17p = this.A03;
        if (l != null) {
            str = l.toString();
        } else {
            str = null;
        }
        c17p.EWH(str);
    }

    public final void A0q(String str) {
        this.A03.EUr(str);
    }

    public final void A0r(String str) {
        SimpleImageUrl simpleImageUrl;
        C17P c17p = this.A03;
        if (str != null) {
            simpleImageUrl = new SimpleImageUrl(str);
        } else {
            simpleImageUrl = null;
        }
        c17p.Ebk(simpleImageUrl);
    }

    public final void A0s(String str) {
        String username = this.A03.getUsername();
        if (username == null || username.length() == 0) {
            C17P c17p = this.A03;
            if (c17p instanceof C17O) {
                C14360o3.A0C(c17p, "null cannot be cast to non-null type com.instagram.user.model.UserDict");
                ((C17O) c17p).A7e = str;
            }
            C17P c17p2 = this.A03;
            if (c17p2 instanceof C39891tD) {
                C14360o3.A0C(c17p2, "null cannot be cast to non-null type com.instagram.user.model.MutablePandoUserDict");
                ((C39891tD) c17p2).A01(str);
            }
            C17P c17p3 = this.A03;
            if (c17p3 instanceof C72093Lh) {
                C14360o3.A0C(c17p3, "null cannot be cast to non-null type com.instagram.user.model.LiveTreeUserDict");
                ((C72093Lh) c17p3).A01.updateOptionalStringValueByHashCode(-265713450, str);
            }
        }
    }

    public final void A0t(List list) {
        this.A03.ERJ(list);
    }

    public final void A0u(List list) {
        this.A03.Ec1(list);
    }

    public final void A0v(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A00 = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
        if (z) {
            this.A03.EUi(FollowStatus.A06);
        }
    }

    public final void A0w(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A06 = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A0x(boolean z) {
        C17P c17p = this.A03;
        c17p.EU9(AbstractC151186rL.A00(c17p.B4P(), Boolean.valueOf(z), null));
        A0Z();
    }

    public final void A0y(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A09 = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A0z(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A02 = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A10(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        Boolean valueOf = Boolean.valueOf(z);
        c17r.A01 = valueOf;
        c17p.EUq(c17r.A00());
        this.A03.EUl(valueOf);
    }

    public final void A11(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0E = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A12(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0D = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A13(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0F = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A14(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0L = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A15(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0G = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A16(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A03 = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A17(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A05 = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A18(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0B = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A19(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0C = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A1A(boolean z) {
        this.A03.Ec0(Boolean.valueOf(z));
    }

    public final void A1B(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0I = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A1C(boolean z) {
        this.A03.Egl(Boolean.valueOf(z));
    }

    public final void A1D(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0K = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A1E(boolean z) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A0M = Boolean.valueOf(z);
        c17p.EUq(c17r.A00());
    }

    public final void A1F(boolean z) {
        C17P c17p = this.A03;
        c17p.EU9(AbstractC151186rL.A00(c17p.B4P(), null, Boolean.valueOf(z)));
        A0Z();
    }

    public final void A1G(boolean z) {
        IGUserThirdPartyDownloads iGUserThirdPartyDownloads;
        C17P c17p = this.A03;
        if (z) {
            iGUserThirdPartyDownloads = IGUserThirdPartyDownloads.A05;
        } else {
            iGUserThirdPartyDownloads = IGUserThirdPartyDownloads.A04;
        }
        c17p.Efh(iGUserThirdPartyDownloads);
    }

    public final void A1H(boolean z, boolean z2) {
        C17P c17p = this.A03;
        C17R c17r = new C17R(c17p.B8n());
        c17r.A03 = Boolean.valueOf(z);
        c17r.A01 = Boolean.valueOf(z2);
        c17p.EUq(c17r.A00());
    }

    public final boolean A1I() {
        Boolean AeE = this.A03.AeE();
        if (AeE != null) {
            return AeE.booleanValue();
        }
        return false;
    }

    public final boolean A1J() {
        Boolean AkH = this.A03.AkH();
        if (AkH != null) {
            return AkH.booleanValue();
        }
        return false;
    }

    public final boolean A1L() {
        Boolean AkO = this.A03.AkO();
        if (AkO != null) {
            return AkO.booleanValue();
        }
        return false;
    }

    public final boolean A1M() {
        Boolean Akr = this.A03.Akr();
        if (Akr != null) {
            return Akr.booleanValue();
        }
        return false;
    }

    public final boolean A1O() {
        Boolean Al2 = this.A03.Al2();
        if (Al2 != null) {
            return Al2.booleanValue();
        }
        return false;
    }

    public final boolean A1P() {
        Boolean AlA = this.A03.AlA();
        if (AlA != null) {
            return AlA.booleanValue();
        }
        return false;
    }

    public final boolean A1Q() {
        Boolean AaY = this.A03.AaY();
        if (AaY != null) {
            return AaY.booleanValue();
        }
        return false;
    }

    public final boolean A1R() {
        Boolean BCB = this.A03.BCB();
        if (BCB != null) {
            return BCB.booleanValue();
        }
        return false;
    }

    public final boolean A1S() {
        Boolean BCI = this.A03.BCI();
        if (BCI != null) {
            return BCI.booleanValue();
        }
        return false;
    }

    public final boolean A1T() {
        Boolean BCO = this.A03.BCO();
        if (BCO != null) {
            return BCO.booleanValue();
        }
        return false;
    }

    public final boolean A1U() {
        if (C14360o3.A0K(this.A03.CYe(), true) || this.A03.Aah() == IGAIAgentType.A06) {
            return true;
        }
        return false;
    }

    public final boolean A1V() {
        Boolean CZP = this.A03.CZP();
        if (CZP != null) {
            return CZP.booleanValue();
        }
        return false;
    }

    public final boolean A1W() {
        Boolean CbR = this.A03.CbR();
        if (CbR != null) {
            return CbR.booleanValue();
        }
        return false;
    }

    public final boolean A1X() {
        Boolean CcX = this.A03.CcX();
        if (CcX != null) {
            return CcX.booleanValue();
        }
        return false;
    }

    public final boolean A1Y() {
        Boolean Cck = this.A03.Cck();
        if (Cck != null) {
            return Cck.booleanValue();
        }
        return false;
    }

    public final boolean A1Z() {
        Boolean CH9 = this.A03.CH9();
        if (CH9 != null) {
            return CH9.booleanValue();
        }
        return false;
    }

    public final boolean A1a() {
        return C14360o3.A0K(this.A03.Cg9(), true);
    }

    public final boolean A1b() {
        Boolean BoK = this.A03.BoK();
        if (BoK != null) {
            return BoK.booleanValue();
        }
        return false;
    }

    public final boolean A1c() {
        Boolean BvV = this.A03.BvV();
        if (BvV != null) {
            return BvV.booleanValue();
        }
        return false;
    }

    public final boolean A1d() {
        Boolean Bvd = this.A03.Bvd();
        if (Bvd != null) {
            return Bvd.booleanValue();
        }
        return false;
    }

    public final boolean A1e() {
        Boolean Bvu = this.A03.Bvu();
        if (Bvu != null) {
            return Bvu.booleanValue();
        }
        return false;
    }

    public final boolean A1f() {
        Boolean Bwx = this.A03.Bwx();
        if (Bwx == null || !Bwx.booleanValue()) {
            Boolean BwV = this.A03.BwV();
            if (BwV != null && BwV.booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A1g() {
        Boolean Bwt = this.A03.Bwt();
        if (Bwt != null) {
            return Bwt.booleanValue();
        }
        return false;
    }

    public final boolean A1h() {
        Boolean CEE = this.A03.CEE();
        if (CEE != null) {
            return CEE.booleanValue();
        }
        return false;
    }

    public final boolean A1i() {
        Boolean BBW = this.A03.BBW();
        if (BBW != null) {
            return BBW.booleanValue();
        }
        return false;
    }

    public final boolean A1j() {
        Integer Afv = this.A03.Afv();
        if (Afv == null || Afv.intValue() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean A1k() {
        Boolean BB5 = this.A03.BB5();
        if (BB5 != null) {
            return BB5.booleanValue();
        }
        return false;
    }

    public final boolean A1l() {
        Boolean BBb = this.A03.BBb();
        if (BBb != null) {
            return BBb.booleanValue();
        }
        return true;
    }

    public final boolean A1m() {
        return C14360o3.A0K(this.A03.BBf(), true);
    }

    public final boolean A1n() {
        Boolean BBs = this.A03.BBs();
        if (BBs != null) {
            return BBs.booleanValue();
        }
        return false;
    }

    public final boolean A1o() {
        Boolean BCH = this.A03.BCH();
        if (BCH != null) {
            return BCH.booleanValue();
        }
        return false;
    }

    public final boolean A1p() {
        Boolean BVx;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (BVx = B8n.BVx()) != null) {
            return BVx.booleanValue();
        }
        return false;
    }

    public final boolean A1r() {
        Boolean CZD;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (CZD = B8n.CZD()) != null) {
            return CZD.booleanValue();
        }
        return false;
    }

    public final boolean A1s() {
        Boolean CPz = this.A03.CPz();
        if (CPz != null) {
            return CPz.booleanValue();
        }
        return false;
    }

    public final boolean A1t() {
        Boolean CQg;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (CQg = B8n.CQg()) != null) {
            return CQg.booleanValue();
        }
        return false;
    }

    public final boolean A1u() {
        Integer AY8 = this.A03.AY8();
        if (AY8 != null && AY8.intValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean A1v() {
        Boolean CR7 = this.A03.CR7();
        if (CR7 != null && CR7.booleanValue()) {
            String B5D = this.A03.B5D();
            if (B5D == null || B5D.length() == 0) {
                String B4t = this.A03.B4t();
                if (B4t == null || B4t.length() == 0) {
                    String B4p = this.A03.B4p();
                    if (B4p != null && B4p.length() != 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean A1w() {
        Boolean CQa;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (CQa = B8n.CQa()) != null) {
            return CQa.booleanValue();
        }
        return false;
    }

    public final boolean A1x() {
        Integer AY8 = this.A03.AY8();
        if (AY8 != null && AY8.intValue() == 3) {
            return true;
        }
        return false;
    }

    public final boolean A1y() {
        Boolean CUE = this.A03.CUE();
        if (CUE != null) {
            return CUE.booleanValue();
        }
        return false;
    }

    public final boolean A1z() {
        Boolean CUQ = this.A03.CUQ();
        if (CUQ != null) {
            return CUQ.booleanValue();
        }
        return false;
    }

    public final boolean A20() {
        Boolean CUS = this.A03.CUS();
        if (CUS != null) {
            return CUS.booleanValue();
        }
        return false;
    }

    public final boolean A21() {
        Boolean CUT = this.A03.CUT();
        if (CUT != null) {
            return CUT.booleanValue();
        }
        return false;
    }

    public final boolean A22() {
        Boolean CUO = this.A03.CUO();
        if (CUO != null) {
            return CUO.booleanValue();
        }
        return false;
    }

    public final boolean A23() {
        Boolean CUg;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (CUg = B8n.CUg()) != null) {
            return CUg.booleanValue();
        }
        return false;
    }

    public final boolean A24() {
        Boolean B5s = this.A03.B5s();
        if (B5s != null) {
            return B5s.booleanValue();
        }
        return false;
    }

    public final boolean A25() {
        Boolean CV2 = this.A03.CV2();
        if (CV2 != null) {
            return CV2.booleanValue();
        }
        return false;
    }

    public final boolean A26() {
        Boolean B7V;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (B7V = B8n.B7V()) != null) {
            return B7V.booleanValue();
        }
        return false;
    }

    public final boolean A27() {
        Boolean CV4;
        FriendshipStatus B8n = this.A03.B8n();
        if ((B8n != null && (CV4 = B8n.B7Q()) != null) || (CV4 = this.A03.CV4()) != null) {
            return CV4.booleanValue();
        }
        return false;
    }

    public final boolean A28() {
        FriendshipStatus B8n = this.A03.B8n();
        if ((B8n == null || B8n.B7Q() == null) && this.A03.CV4() == null) {
            return true;
        }
        return false;
    }

    public final boolean A29() {
        Boolean CVR;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (CVR = B8n.CVR()) != null) {
            return CVR.booleanValue();
        }
        return true;
    }

    public final boolean A2A() {
        Boolean BHO;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (BHO = B8n.BHO()) != null) {
            return BHO.booleanValue();
        }
        return false;
    }

    public final boolean A2B() {
        Boolean CWs = this.A03.CWs();
        if (CWs != null) {
            return CWs.booleanValue();
        }
        return false;
    }

    public final boolean A2C() {
        List AY0 = this.A03.AY0();
        if (AY0 != null && AY0.contains(0)) {
            return true;
        }
        return false;
    }

    public final boolean A2D() {
        Boolean CYP = this.A03.CYP();
        if (CYP != null) {
            return CYP.booleanValue();
        }
        return true;
    }

    public final boolean A2E() {
        Boolean CZ7 = this.A03.CZ7();
        if (CZ7 != null) {
            return CZ7.booleanValue();
        }
        return false;
    }

    public final boolean A2F() {
        Boolean CZ8 = this.A03.CZ8();
        if (CZ8 != null) {
            return CZ8.booleanValue();
        }
        return false;
    }

    public final boolean A2G() {
        return C14360o3.A0K(this.A03.BW1(), true);
    }

    public final boolean A2I() {
        Integer AY8 = this.A03.AY8();
        if (AY8 == null || AY8.intValue() != 2) {
            Integer AY82 = this.A03.AY8();
            if (AY82 != null && AY82.intValue() == 3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A2J() {
        Boolean Cb8 = this.A03.Cb8();
        if (Cb8 != null) {
            return Cb8.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A2K() {
        /*
            r2 = this;
            X.17P r0 = r2.A03
            java.util.List r0 = r0.Bjm()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.model.User.A2K():boolean");
    }

    public final boolean A2L() {
        Boolean CcI = this.A03.CcI();
        if (CcI != null) {
            return CcI.booleanValue();
        }
        return false;
    }

    public final boolean A2M() {
        Boolean Bw0 = this.A03.Bw0();
        if (Bw0 != null) {
            return Bw0.booleanValue();
        }
        return false;
    }

    public final boolean A2N() {
        Boolean Cf4 = this.A03.Cf4();
        if (Cf4 != null) {
            return Cf4.booleanValue();
        }
        return false;
    }

    public final boolean A2O() {
        Boolean Cfx;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (Cfx = B8n.Cfx()) != null) {
            return Cfx.booleanValue();
        }
        return false;
    }

    public final boolean A2P() {
        if (this.A03.BEC() != IGUserHighlightsTrayType.A04) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass176
    public final FollowStatus B7L() {
        FollowStatus B7P = this.A03.B7P();
        if (B7P == null) {
            FriendshipStatus B8n = this.A03.B8n();
            if (B8n != null) {
                if (C14360o3.A0K(B8n.BaD(), true)) {
                    return FollowStatus.A07;
                }
                Boolean B7V = B8n.B7V();
                if (B7V != null) {
                    if (B7V.booleanValue()) {
                        return FollowStatus.A05;
                    }
                    return FollowStatus.A06;
                }
            }
            return FollowStatus.A08;
        }
        return B7P;
    }

    @Override // X.AnonymousClass172
    public final String B8y() {
        String fullName = this.A03.getFullName();
        if (fullName == null || fullName.length() == 0) {
            return getUsername();
        }
        return fullName;
    }

    @Override // X.C17G
    public final int BJ8() {
        Integer BJ9 = this.A03.BJ9();
        if (BJ9 != null) {
            return BJ9.intValue();
        }
        return 0;
    }

    @Override // X.C17K
    public final Long BTC() {
        String interopMessagingUserFbid = this.A03.getInteropMessagingUserFbid();
        if (interopMessagingUserFbid != null) {
            return AbstractC003100w.A0k(10, interopMessagingUserFbid);
        }
        return null;
    }

    @Override // X.AnonymousClass173
    public final ImageUrl Bhu() {
        ImageUrl Bhu = this.A03.Bhu();
        if (Bhu == null) {
            return A08;
        }
        return Bhu;
    }

    @Override // X.AnonymousClass175
    public final Integer Bkb() {
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null) {
            return B8n.Bkc();
        }
        return null;
    }

    @Override // X.AnonymousClass174
    public final boolean CPk() {
        return this.A06;
    }

    @Override // X.C17I
    public final boolean CQf() {
        Boolean AgM;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (AgM = B8n.AgM()) != null) {
            return AgM.booleanValue();
        }
        return false;
    }

    @Override // X.C17A
    public final boolean CQw() {
        Boolean CQv = this.A03.CQv();
        if (CQv != null) {
            return CQv.booleanValue();
        }
        return false;
    }

    @Override // X.C17H
    public final boolean CYY() {
        Boolean CYZ;
        FriendshipStatus B8n = this.A03.B8n();
        if ((B8n == null || (CYZ = B8n.CYZ()) == null || !CYZ.booleanValue()) && !CQf()) {
            return false;
        }
        return true;
    }

    @Override // X.C17J
    public final boolean CYb() {
        Boolean CYa;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (CYa = B8n.CYa()) != null) {
            return CYa.booleanValue();
        }
        return false;
    }

    @Override // X.AnonymousClass177
    public final boolean Cey() {
        Boolean Cex;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (Cex = B8n.Cex()) != null) {
            return Cex.booleanValue();
        }
        return false;
    }

    @Override // X.C17L
    public final TreeUpdaterJNI F7o() {
        return this.A03.F7o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
            return C14360o3.A0K(getId(), ((User) obj).getId());
        }
        return false;
    }

    @Override // X.C17F
    public final String getFullName() {
        return this.A03.getFullName();
    }

    @Override // X.C17D
    public final String getId() {
        String strongId = this.A03.getStrongId();
        if (strongId == null) {
            String id = this.A03.getId();
            if (id == null) {
                String pk = this.A03.getPk();
                if (pk == null) {
                    String userId = this.A03.getUserId();
                    if (userId == null) {
                        return "";
                    }
                    return userId;
                }
                return pk;
            }
            return id;
        }
        return strongId;
    }

    @Override // X.C17B
    public final String getShortName() {
        return this.A03.getShortName();
    }

    @Override // X.C17E
    public final String getUsername() {
        String username = this.A03.getUsername();
        if (username == null) {
            return "";
        }
        return username;
    }

    @Override // X.AnonymousClass172
    public final boolean isConnected() {
        Boolean CRd = this.A03.CRd();
        if (CRd != null) {
            return CRd.booleanValue();
        }
        return false;
    }

    @Override // X.AnonymousClass172
    public final boolean isRestricted() {
        Boolean Cc1;
        FriendshipStatus B8n = this.A03.B8n();
        if (B8n != null && (Cc1 = B8n.Cc1()) != null) {
            return Cc1.booleanValue();
        }
        return false;
    }

    @Override // X.AnonymousClass172
    public final boolean isVerified() {
        Boolean CfY = this.A03.CfY();
        if (CfY != null) {
            return CfY.booleanValue();
        }
        return false;
    }

    public User(C17P c17p) {
        this.A03 = c17p;
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        this.A05 = c16920sk;
        this.A01 = System.currentTimeMillis();
        this.A02 = C17Q.A08;
        String strongId = this.A03.getStrongId();
        if (strongId == null || strongId.length() == 0) {
            C17P c17p2 = this.A03;
            String id = c17p2.getId();
            if (id == null && (id = this.A03.getPk()) == null) {
                id = this.A03.getUserId();
            }
            c17p2.Ef3(id);
        }
        this.A06 = this.A03.Aah() != null;
    }

    public final ImageUrl A0C() {
        ExtendedImageUrl A0D = A0D();
        if (A0D == null) {
            return Bhu();
        }
        return A0D;
    }

    public final Integer A0M() {
        Boolean A0J = A0J();
        if (C14360o3.A0K(A0J, true)) {
            return C05F.A0C;
        }
        if (C14360o3.A0K(A0J, false)) {
            return C05F.A01;
        }
        if (A0J == null) {
            return C05F.A00;
        }
        throw new RuntimeException();
    }

    public final boolean A1K() {
        Boolean AkI;
        if (!A2H() || (AkI = this.A03.AkI()) == null) {
            return false;
        }
        return AkI.booleanValue();
    }

    public final boolean A1N() {
        return A0T().contains(EnumC199318rY.A06);
    }

    public final boolean A1q() {
        Boolean BBt;
        if (BJ8() == 1 || (BBt = this.A03.BBt()) == null || BBt.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A2H() {
        if (!A2I() && !CQw()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return getId().hashCode();
    }

    public final String toString() {
        return getId();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.17P, java.lang.Object, X.17O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public User(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            X.17O r0 = new X.17O
            r0.<init>()
            r0.A7U = r2
            r0.A6o = r2
            r0.A73 = r2
            r0.A7d = r2
            r0.A7e = r3
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.model.User.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.17P, java.lang.Object] */
    @Deprecated(message = "User has immutable fields set at construction time. Use the other constructor. ")
    public User() {
        this(new Object());
    }
}
