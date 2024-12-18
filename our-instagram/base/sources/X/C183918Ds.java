package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTA;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183918Ds implements C8BD {
    public ImageView A00;
    public InterfaceC41501vz A01;
    public InterfaceC41501vz A02;
    public ReelMoreOptionsModel A03 = C183938Du.A00(null, null, null, null, null, null, null, null, null, EnumC183928Dt.A08, null, null, null, null, false, false, false, false);
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public final View A0A;
    public final AbstractC59962oe A0B;
    public final UserSession A0C;
    public final C183908Dr A0D;
    public final C1816783z A0E;
    public final C8AD A0F;
    public final AnonymousClass856 A0G;
    public final Integer A0H;

    public C183918Ds(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C183908Dr c183908Dr, AnonymousClass840 anonymousClass840, C8AD c8ad, AnonymousClass856 anonymousClass856, Integer num) {
        this.A0E = anonymousClass840.A02;
        this.A0F = c8ad;
        this.A0H = num;
        this.A0B = abstractC59962oe;
        this.A0G = anonymousClass856;
        this.A0C = userSession;
        this.A0A = view;
        this.A0D = c183908Dr;
        this.A04 = abstractC59962oe.getString(C18U.A06(C06090Tz.A05, userSession, 36314377984412186L) ? 2131966904 : 2131954154);
    }

    public final void A00() {
        ImageView imageView = this.A00;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.instagram_user_following_pano_outline_24);
            Context context = this.A0A.getContext();
            imageView.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.os.Parcelable, com.instagram.reels.fragment.model.ReelMoreOptionsModel, java.lang.Object] */
    public final void A01() {
        String str;
        int i;
        boolean z;
        List of;
        UserSession userSession = this.A0C;
        if (C18U.A06(C06090Tz.A05, userSession, 36330454047015800L)) {
            if (this.A01 == null) {
                this.A01 = new InterfaceC41501vz() { // from class: X.Oty
                    @Override // X.InterfaceC41501vz
                    public final void onEvent(Object obj) {
                        C183918Ds c183918Ds = C183918Ds.this;
                        C56021Ots c56021Ots = (C56021Ots) obj;
                        ReelMoreOptionsModel reelMoreOptionsModel = c183918Ds.A03;
                        EnumC183928Dt enumC183928Dt = reelMoreOptionsModel.A09;
                        String str2 = reelMoreOptionsModel.A0C;
                        String str3 = reelMoreOptionsModel.A0B;
                        String str4 = reelMoreOptionsModel.A0A;
                        ProfileShopLink profileShopLink = reelMoreOptionsModel.A06;
                        InstagramShopLink instagramShopLink = reelMoreOptionsModel.A03;
                        ProductCollectionLink productCollectionLink = reelMoreOptionsModel.A04;
                        ProductCollectionLink productCollectionLink2 = reelMoreOptionsModel.A05;
                        ReelProductLink reelProductLink = reelMoreOptionsModel.A08;
                        ReelMultiProductLink reelMultiProductLink = reelMoreOptionsModel.A07;
                        boolean z2 = reelMoreOptionsModel.A0E;
                        boolean z3 = reelMoreOptionsModel.A0G;
                        boolean z4 = reelMoreOptionsModel.A0F;
                        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = reelMoreOptionsModel.A02;
                        List list = c56021Ots.A02;
                        c183918Ds.A03 = C183938Du.A00(c56021Ots.A00.ErN(), c56021Ots.A01, mediaGenAIDetectionMethod, instagramShopLink, productCollectionLink, productCollectionLink2, profileShopLink, reelMultiProductLink, reelProductLink, enumC183928Dt, str4, str3, str2, list, z2, z4, z3, c56021Ots.A03);
                    }
                };
            }
            if (this.A02 == null) {
                this.A02 = new InterfaceC41501vz() { // from class: X.Ad9
                    @Override // X.InterfaceC41501vz
                    public final void onEvent(Object obj) {
                        C183918Ds c183918Ds = C183918Ds.this;
                        C183938Du c183938Du = new C183938Du(c183918Ds.A03);
                        c183938Du.A0E = ((C56023Otu) obj).A00;
                        c183918Ds.A03 = c183938Du.A01();
                    }
                };
            }
            C25671My A00 = AbstractC25651Mw.A00(userSession);
            A00.A01(this.A01, C56021Ots.class);
            A00.A01(this.A02, C56023Otu.class);
            if (this.A03.A00() != null) {
                of = this.A03.A00();
            } else {
                of = ImmutableList.of();
            }
            FT2.A01();
            ReelMoreOptionsModel reelMoreOptionsModel = this.A03;
            Bundle A002 = AbstractC55149OdC.A00(reelMoreOptionsModel.A00, reelMoreOptionsModel.A01, "story", null, of, reelMoreOptionsModel.A0E, true, reelMoreOptionsModel.A0H);
            AbstractC59962oe abstractC59962oe = this.A0B;
            C6XJ c6xj = new C6XJ(abstractC59962oe.requireActivity(), A002, userSession, TransparentModalActivity.class, MSV.A00(167));
            c6xj.A07();
            c6xj.A0C(abstractC59962oe.requireContext());
        } else {
            Bundle bundle = new Bundle();
            ReelMoreOptionsModel reelMoreOptionsModel2 = this.A03;
            EnumC183928Dt enumC183928Dt = reelMoreOptionsModel2.A09;
            String str2 = reelMoreOptionsModel2.A0C;
            String str3 = reelMoreOptionsModel2.A0B;
            String str4 = reelMoreOptionsModel2.A0A;
            ProfileShopLink profileShopLink = reelMoreOptionsModel2.A06;
            InstagramShopLink instagramShopLink = reelMoreOptionsModel2.A03;
            ProductCollectionLink productCollectionLink = reelMoreOptionsModel2.A04;
            ProductCollectionLink productCollectionLink2 = reelMoreOptionsModel2.A05;
            ReelProductLink reelProductLink = reelMoreOptionsModel2.A08;
            ReelMultiProductLink reelMultiProductLink = reelMoreOptionsModel2.A07;
            BrandedContentGatingInfo brandedContentGatingInfo = reelMoreOptionsModel2.A00;
            List list = reelMoreOptionsModel2.A0D;
            BrandedContentProjectMetadata brandedContentProjectMetadata = reelMoreOptionsModel2.A01;
            boolean z2 = reelMoreOptionsModel2.A0H;
            boolean z3 = reelMoreOptionsModel2.A0E;
            boolean z4 = reelMoreOptionsModel2.A0G;
            boolean z5 = reelMoreOptionsModel2.A0F;
            MediaGenAIDetectionMethod mediaGenAIDetectionMethod = reelMoreOptionsModel2.A02;
            if (enumC183928Dt == null) {
                enumC183928Dt = EnumC183928Dt.A08;
            }
            ?? obj = new Object();
            obj.A09 = enumC183928Dt;
            obj.A0C = str2;
            obj.A0B = str3;
            obj.A0A = str4;
            obj.A06 = profileShopLink;
            obj.A03 = instagramShopLink;
            obj.A04 = productCollectionLink;
            obj.A05 = productCollectionLink2;
            obj.A08 = reelProductLink;
            obj.A07 = reelMultiProductLink;
            obj.A00 = brandedContentGatingInfo;
            obj.A0D = list;
            BrandedContentProjectMetadata brandedContentProjectMetadata2 = null;
            if (brandedContentProjectMetadata != null) {
                brandedContentProjectMetadata2 = brandedContentProjectMetadata;
            }
            obj.A01 = brandedContentProjectMetadata2;
            obj.A0H = z2;
            obj.A0E = z3;
            obj.A0G = z4;
            obj.A0F = z5;
            obj.A02 = mediaGenAIDetectionMethod;
            C1816783z c1816783z = this.A0E;
            Integer A03 = c1816783z.A03();
            bundle.putString(MSV.A00(808), this.A04);
            bundle.putParcelable("MORE_OPTIONS_MODEL", obj);
            bundle.putInt(MSV.A00(694), AbstractC449424y.A01(A03));
            bundle.putString(MSV.A00(693), c1816783z.A04());
            bundle.putString(MSV.A00(669), c1816783z.A01().A01);
            boolean z6 = false;
            bundle.putBoolean(MSV.A00(879), false);
            bundle.putBoolean("OWNS_IGTV_VIDEOS", false);
            bundle.putBoolean(MSV.A00(785), false);
            C8AD c8ad = this.A0F;
            C8AG c8ag = C8AE.A0l;
            bundle.putBoolean("HAS_PRODUCT_STICKERS", !c8ad.CcJ(c8ag));
            C1815483h c1815483h = c1816783z.A01;
            String str5 = null;
            if (c1815483h.A03() != null) {
                str = c1815483h.A03().A06();
            } else {
                str = null;
            }
            bundle.putString(MSV.A00(658), str);
            if (c1815483h.A03() != null) {
                i = c1815483h.A03().A07;
            } else {
                i = 0;
            }
            bundle.putInt(MSV.A00(665), i);
            if (c1815483h.A03() != null) {
                z = c1815483h.A03().A14;
            } else {
                z = false;
            }
            bundle.putBoolean(MSV.A00(659), z);
            if (c1815483h.A04() != null) {
                str5 = c1815483h.A04().A0k;
            }
            bundle.putString(MSV.A00(660), str5);
            bundle.putBoolean(MSV.A00(686), false);
            if (this.A08 && !AbstractC172137li.A04(userSession)) {
                z6 = true;
            }
            bundle.putBoolean("GO_TO_BRANDED_CONTENT_OPT_IN", z6);
            bundle.putBoolean("GO_TO_BRANDED_CONTENT_TAG_BUSINESS_PARTNER", this.A09);
            bundle.putBoolean(MSV.A00(668), !((C8NW) this.A0D.A00.A1h.get()).A16().isEmpty());
            if (!c8ad.CcJ(c8ag)) {
                bundle.putString(AbstractC111324zv.A00(1808), this.A05);
                bundle.putString(AbstractC111324zv.A00(1809), this.A06);
            }
            AbstractC59962oe abstractC59962oe2 = this.A0B;
            new C6XJ(abstractC59962oe2.requireActivity(), bundle, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5178)).A0D(abstractC59962oe2, 4217);
        }
        C22C A01 = AnonymousClass229.A01(userSession);
        Boolean valueOf = Boolean.valueOf(this.A03.A0G);
        C448124l c448124l = A01.A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        EnumC114925Hg A0J = c448124l.A0J();
        if (((AbstractC02600Aj) A08).A00.isSampled() && A0J != null) {
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("ADS_MODE_PARTNER_ADS_SETTINGS_BUTTON_TAP");
            C448124l.A00(A08, c448124l);
            A08.A0a(A0J);
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0U();
            A08.A0m(C22F.A08.getModuleName());
            A08.A0R("sticker_tray_session_id", c22m.A0U);
            A08.A0c(c22m.A0A);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0O(MSV.A00(43), valueOf);
            A08.Cht();
        }
    }

    public final void A02(ReelMoreOptionsModel reelMoreOptionsModel) {
        C22997ABw c22997ABw;
        List list;
        ReelCTA A00;
        if (this.A00 != null) {
            this.A03 = reelMoreOptionsModel;
            if (!TextUtils.isEmpty(reelMoreOptionsModel.A0C)) {
                A00 = AJs.A00();
                String str = this.A03.A0C;
                if (str == null) {
                    str = "";
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(AbstractC114965Hm.A00(str));
                C22997ABw c22997ABw2 = new C22997ABw(A00);
                c22997ABw2.A0D = arrayList;
                c22997ABw2.A00();
            } else {
                ReelMoreOptionsModel reelMoreOptionsModel2 = this.A03;
                String str2 = reelMoreOptionsModel2.A0B;
                if (str2 != null) {
                    c22997ABw = new C22997ABw(AJs.A00());
                    c22997ABw.A0B = str2;
                } else {
                    ProfileShopLink profileShopLink = reelMoreOptionsModel2.A06;
                    if (profileShopLink != null) {
                        c22997ABw = new C22997ABw(AJs.A00());
                        c22997ABw.A03 = profileShopLink;
                    } else if (reelMoreOptionsModel2.A03 != null) {
                        A00 = AJs.A00();
                    } else {
                        ProductCollectionLink productCollectionLink = reelMoreOptionsModel2.A04;
                        if (productCollectionLink == null && (productCollectionLink = reelMoreOptionsModel2.A05) == null) {
                            ReelProductLink reelProductLink = reelMoreOptionsModel2.A08;
                            if (reelProductLink != null) {
                                c22997ABw = new C22997ABw(AJs.A00());
                                c22997ABw.A05 = reelProductLink;
                            } else {
                                ReelMultiProductLink reelMultiProductLink = reelMoreOptionsModel2.A07;
                                if (reelMultiProductLink != null) {
                                    c22997ABw = new C22997ABw(AJs.A00());
                                    c22997ABw.A04 = reelMultiProductLink;
                                } else {
                                    EnumC183928Dt enumC183928Dt = reelMoreOptionsModel2.A09;
                                    if (enumC183928Dt == null) {
                                        enumC183928Dt = EnumC183928Dt.A08;
                                    }
                                    if (enumC183928Dt == EnumC183928Dt.A05) {
                                        A00 = AJs.A00();
                                        String B4t = C17060sy.A01.A01(this.A0C).A03.B4t();
                                        ArrayList arrayList2 = new ArrayList();
                                        if (B4t != null) {
                                            arrayList2.add(AbstractC114965Hm.A00(B4t));
                                            C22997ABw c22997ABw3 = new C22997ABw(A00);
                                            c22997ABw3.A0D = arrayList2;
                                            A00 = c22997ABw3.A00();
                                        }
                                    } else {
                                        String str3 = reelMoreOptionsModel2.A0A;
                                        if (str3 != null) {
                                            c22997ABw = new C22997ABw(AJs.A00());
                                            c22997ABw.A09 = "ar_effect";
                                            c22997ABw.A0C = str3;
                                        } else {
                                            list = null;
                                            this.A07 = list;
                                            A00();
                                            C8AD c8ad = this.A0F;
                                            c8ad.Ddd(this.A07);
                                            c8ad.DNC(this.A03.A0H);
                                            c8ad.D8H(this.A03.A0E);
                                            c8ad.D0N(this.A03.A00());
                                            c8ad.DRg(this.A03.A00);
                                            c8ad.Dbh(this.A03.A06);
                                            c8ad.DbO(this.A03.A08);
                                        }
                                    }
                                }
                            }
                        } else {
                            c22997ABw = new C22997ABw(AJs.A00());
                            c22997ABw.A02 = productCollectionLink;
                        }
                    }
                }
                A00 = c22997ABw.A00();
            }
            list = Collections.singletonList(A00);
            this.A07 = list;
            A00();
            C8AD c8ad2 = this.A0F;
            c8ad2.Ddd(this.A07);
            c8ad2.DNC(this.A03.A0H);
            c8ad2.D8H(this.A03.A0E);
            c8ad2.D0N(this.A03.A00());
            c8ad2.DRg(this.A03.A00);
            c8ad2.Dbh(this.A03.A06);
            c8ad2.DbO(this.A03.A08);
        }
    }

    @Override // X.C8BD
    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }
}
