package X;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.venue.Venue;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class NMW extends AbstractC52180N7p implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "VideoEditMetadataFragment";
    public Location A00;
    public Handler A01;
    public View A02;
    public View A03;
    public TextView A04;
    public BrandedContentGatingInfoIntf A06;
    public BrandedContentProjectMetadataIntf A07;
    public C25671My A08;
    public InterfaceC41501vz A09;
    public InterfaceC41501vz A0A;
    public InterfaceC56392iX A0B;
    public C38321qM A0C;
    public C54972OTe A0D;
    public Venue A0E;
    public String A0G;
    public String A0H;
    public String A0I;
    public ArrayList A0J;
    public ArrayList A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public InterfaceC41501vz A0X;
    public final InterfaceC09390do A0Y;
    public TaggingFeedMultiSelectState shoppingMultiSelectState;
    public String A0F = "";
    public C56448P4j A05 = new C56448P4j(this, 3);

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (getContext() != null) {
            ?? obj = new Object();
            obj.A02 = AbstractC166997dE.A0N(this).getString(2131961593);
            ActionButton A00 = C31722DwR.A00(ViewOnClickListenerC55455Ok9.A00(this, 23), interfaceC56362iU, obj);
            this.A03 = A00;
            A00.setAlpha(AbstractC25230BEn.A00(this.A0T ? 1 : 0));
            interfaceC56362iU.setIsLoading(this.A0S);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "video_edit_metadata_fragment";
    }

    @Override // X.AbstractC52180N7p, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Location lastLocation;
        List list;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = view;
        requireActivity();
        View view2 = this.A02;
        if (view2 != null) {
            this.A0B = AbstractC31173DnH.A0U(view2, R.id.captions_row_stub);
            C56034Ou6 A00 = C56034Ou6.A00(this, 10);
            C25671My c25671My = this.A08;
            str = "eventBus";
            if (c25671My != null) {
                c25671My.A01(A00, C55985OtI.class);
                this.A09 = A00;
                C56034Ou6 A002 = C56034Ou6.A00(this, 11);
                C25671My c25671My2 = this.A08;
                if (c25671My2 != null) {
                    c25671My2.A01(A002, C56017Oto.class);
                    this.A0A = A002;
                    C73450YDt A003 = NearbyVenuesService.A00(this.A00);
                    if (A003 != null) {
                        List items = A003.getItems();
                        this.A0U = true;
                        if (items != null) {
                            list = items.subList(0, Math.min(5, items.size()));
                        } else {
                            list = null;
                        }
                        this.A0L = list;
                        A03(this);
                    }
                    C1VW c1vw = C1VW.A00;
                    if (c1vw != null && (lastLocation = c1vw.getLastLocation(AbstractC166987dD.A0r(this.A0Y), __redex_internal_original_name)) != null && C1VW.A00 != null && AbstractC103794ly.A00(lastLocation)) {
                        A00(lastLocation, this);
                    } else {
                        C1VW c1vw2 = C1VW.A00;
                        if (c1vw2 != null) {
                            c1vw2.requestLocationUpdates(AbstractC166987dD.A0r(this.A0Y), this.A05, "video_edit_metadata_fragment");
                        }
                    }
                    InterfaceC09390do interfaceC09390do = this.A0Y;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.A0D;
                    C14360o3.A0B(A0r, 0);
                    if (AbstractC63302u8.A00(A0r).A04(userMonetizationProductType)) {
                        C54813OKo c54813OKo = new C54813OKo(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), AbstractC63302u8.A00(AbstractC166987dD.A0r(interfaceC09390do)));
                        View view3 = this.A02;
                        if (view3 != null) {
                            View view4 = AbstractC31173DnH.A0U(view3, R.id.monetization_container_stub).getView();
                            if (view4 != null) {
                                TextView A0e = AbstractC166987dD.A0e(view4, R.id.title);
                                TextView A0e2 = AbstractC166987dD.A0e(view4, R.id.description);
                                AbstractC25227BEk.A11(A0e2);
                                MonetizationRepository monetizationRepository = c54813OKo.A02;
                                if (!monetizationRepository.A03(userMonetizationProductType)) {
                                    AbstractC25227BEk.A12(A0e, this, 2131964208);
                                    A0e2.setText(c54813OKo.A01(new C56480P5u(this, 2), "https://www.facebook.com/help/instagram/793848097773634", true));
                                } else {
                                    C38321qM c38321qM = this.A0C;
                                    if (c38321qM != null) {
                                        if (c38321qM.A1C() >= MSZ.A0C(C06090Tz.A05, c54813OKo.A01, 36592958153163518L) && monetizationRepository.A03(userMonetizationProductType)) {
                                            AbstractC25227BEk.A12(A0e, this, 2131964166);
                                            A0e2.setText(c54813OKo.A00(new C56480P5u(this, 3)));
                                            IgdsSwitch igdsSwitch = (IgdsSwitch) view4.findViewById(R.id.allow_ads_switch);
                                            igdsSwitch.setPadding(igdsSwitch.getPaddingStart(), igdsSwitch.getPaddingTop(), 8, igdsSwitch.getPaddingBottom());
                                            igdsSwitch.setGravity(17);
                                            igdsSwitch.setEnabled(true);
                                            igdsSwitch.setChecked(this.A0O);
                                            igdsSwitch.A07 = new P3T(this, 27);
                                            igdsSwitch.setVisibility(0);
                                        } else {
                                            AbstractC25227BEk.A12(A0e, this, 2131964210);
                                            A0e2.setText(c54813OKo.A01(new C56480P5u(this, 4), "https://help.instagram.com/2635536099905516", false));
                                            view4.setVisibility(0);
                                        }
                                    }
                                    str = "editMedia";
                                }
                            }
                        }
                    }
                    if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36311307082793462L)) {
                        View view5 = this.A02;
                        str = "mainView";
                        if (view5 != null) {
                            View view6 = AbstractC31173DnH.A0U(view5, R.id.funded_content_toggle_stub).getView();
                            IgdsSwitch igdsSwitch2 = (IgdsSwitch) AbstractC166987dD.A0c(view6, R.id.funded_content_toggle);
                            View view7 = this.A02;
                            if (view7 != null) {
                                AbstractC43592JPx.A1I(view7, R.id.funded_content_top_divider, 0);
                                C38321qM c38321qM2 = this.A0C;
                                if (c38321qM2 != null) {
                                    Boolean CVH = c38321qM2.A0C.CVH();
                                    if (CVH != null && CVH.booleanValue()) {
                                        igdsSwitch2.setChecked(true);
                                        igdsSwitch2.setEnabled(false);
                                        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), AbstractC25230BEn.A0Q(view6, R.id.funded_content_secondary_text), 2131964200);
                                    } else {
                                        igdsSwitch2.A07 = new P3T(this, 26);
                                    }
                                }
                                str = "editMedia";
                            }
                        }
                    }
                    if (C4A4.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
                        if (!this.A0Q) {
                            C38321qM c38321qM3 = this.A0C;
                            str = "editMedia";
                            if (c38321qM3 != null) {
                                this.A0V = c38321qM3.A5t();
                                C38321qM c38321qM4 = this.A0C;
                                if (c38321qM4 != null) {
                                    this.A0W = c38321qM4.A5t();
                                    C38321qM c38321qM5 = this.A0C;
                                    if (c38321qM5 != null) {
                                        List<InterfaceC102194ip> A3r = c38321qM5.A3r();
                                        ArrayList A0i = AbstractC167007dF.A0i(A3r);
                                        for (InterfaceC102194ip interfaceC102194ip : A3r) {
                                            A0i.add(new BrandedContentTag(interfaceC102194ip.BzF(), AbstractC167007dF.A1T(interfaceC102194ip.BcT()), AbstractC167007dF.A1T(interfaceC102194ip.Ca9())));
                                        }
                                        this.A0M = A0i;
                                        this.A0N = A0i;
                                        this.A0Q = true;
                                        C38321qM c38321qM6 = this.A0C;
                                        if (c38321qM6 != null) {
                                            this.A07 = c38321qM6.A0C.Ai4();
                                        }
                                    }
                                }
                            }
                        }
                        View view8 = this.A02;
                        str = "mainView";
                        if (view8 != null) {
                            View view9 = AbstractC31173DnH.A0U(view8, R.id.branded_content_tagging_stub).getView();
                            view9.setVisibility(0);
                            ViewOnClickListenerC55455Ok9.A01(view9, 24, this);
                            View view10 = this.A02;
                            if (view10 != null) {
                                this.A04 = AbstractC166997dE.A0T(view10, R.id.brand_partners_text);
                                A02(this);
                                MSZ.A1L(this, AbstractC166987dD.A0r(interfaceC09390do), C05F.A0F, C05F.A15, interfaceC09390do);
                            }
                        }
                    }
                    C38321qM c38321qM7 = this.A0C;
                    if (c38321qM7 != null) {
                        if (c38321qM7.A5A()) {
                            InterfaceC56392iX interfaceC56392iX = this.A0B;
                            if (interfaceC56392iX == null) {
                                str = "captionsStubHolder";
                            } else {
                                View view11 = interfaceC56392iX.getView();
                                C0fQ.A00(new ViewOnClickListenerC42034Ik3(25, view11, this), view11);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    str = "editMedia";
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "mainView";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(Location location, NMW nmw) {
        nmw.A00 = location;
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            c1vw.removeLocationUpdates(AbstractC166987dD.A0r(nmw.A0Y), nmw.A05);
        }
        FragmentActivity activity = nmw.getActivity();
        if (activity != null) {
            NearbyVenuesService.A01(activity, location, AbstractC166987dD.A0r(nmw.A0Y), null, AbstractC37302Gc3.A0T());
        }
    }

    public static final void A01(C38321qM c38321qM, NMW nmw) {
        String str;
        nmw.A0C = c38321qM;
        C84923qg A1V = c38321qM.A1V();
        if (A1V == null || (str = A1V.A0e) == null) {
            str = "";
        }
        nmw.A0F(str);
        C38321qM c38321qM2 = nmw.A0C;
        if (c38321qM2 != null) {
            nmw.A0E = c38321qM2.A27();
            C38321qM c38321qM3 = nmw.A0C;
            if (c38321qM3 != null) {
                nmw.A0P = c38321qM3.A4k();
                C38321qM c38321qM4 = nmw.A0C;
                if (c38321qM4 != null) {
                    boolean z = false;
                    ((AbstractC52180N7p) nmw).A03 = AbstractC25229BEm.A1Z(c38321qM4.A0C.BGO());
                    ((AbstractC52180N7p) nmw).A02 = false;
                    C38321qM c38321qM5 = nmw.A0C;
                    if (c38321qM5 != null) {
                        JLR BGK = c38321qM5.A0C.BGK();
                        if (BGK != null) {
                            z = AbstractC166997dE.A1Z(BGK.AaG(), true);
                        }
                        nmw.A0O = z;
                        C38321qM c38321qM6 = nmw.A0C;
                        if (c38321qM6 != null) {
                            nmw.A0K = MSY.A0j(c38321qM6.A3M());
                            C38321qM c38321qM7 = nmw.A0C;
                            if (c38321qM7 != null) {
                                nmw.A0J = MSY.A0j(c38321qM7.A3Q());
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("editMedia");
        throw C00O.createAndThrow();
    }

    public static final void A02(NMW nmw) {
        TextView textView = nmw.A04;
        if (textView != null) {
            nmw.A0Y.getValue();
            List list = nmw.A0N;
            textView.setText(AbstractC55150OdD.A00(nmw.requireContext(), nmw.A07, list, nmw.A0W));
        }
    }

    public static final void A04(NMW nmw, boolean z) {
        nmw.A0S = z;
        FragmentActivity activity = nmw.getActivity();
        if (activity != null) {
            C56352iT.A0t.A03(activity).setIsLoading(nmw.A0S);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0Y);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        List<MediaTaggingInfo> list;
        if (i == 1000 && i2 == -1) {
            if (intent == null || (list = intent.getParcelableArrayListExtra("media_tagging_info_list")) == null) {
                list = C16930sl.A00;
            }
            for (MediaTaggingInfo mediaTaggingInfo : list) {
                if (mediaTaggingInfo != null) {
                    C38321qM c38321qM = this.A0C;
                    if (c38321qM == null) {
                        C14360o3.A0F("editMedia");
                        throw C00O.createAndThrow();
                    }
                    if (C14360o3.A0K(c38321qM.getId(), mediaTaggingInfo.A06)) {
                        this.A0K = mediaTaggingInfo.A0B;
                        this.A0J = mediaTaggingInfo.A0A;
                    }
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        C54972OTe c54972OTe = this.A0D;
        if (c54972OTe == null) {
            str = "logger";
        } else {
            String str2 = this.A0H;
            if (str2 == null) {
                str = "mediaId";
            } else {
                C54972OTe.A00(c54972OTe, "tap_cancel", str2);
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public NMW() {
        C16930sl c16930sl = C16930sl.A00;
        this.A0M = c16930sl;
        this.A0N = c16930sl;
        this.A0K = AbstractC166987dD.A1E();
        this.A0J = AbstractC166987dD.A1E();
        this.A0X = C56034Ou6.A00(this, 9);
        this.A0Y = AbstractC60492pY.A02(this);
    }

    public static final void A03(NMW nmw) {
        if (nmw.getContext() != null) {
            nmw.A0B(nmw.A0D());
            nmw.A0E();
        }
    }

    @Override // X.AbstractC52180N7p, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1020893400);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A0Y;
        this.A08 = AbstractC31176DnK.A0Q(interfaceC09390do);
        this.A01 = AbstractC167007dF.A0J();
        this.A0G = AbstractC153636vY.A01(requireArguments, "igtv_session_id_arg");
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str2 = this.A0G;
        if (str2 == null) {
            str = "composerSessionId";
        } else {
            this.A0D = new C54972OTe(A0r, this, str2);
            String A01 = AbstractC153636vY.A01(requireArguments, "igtv_media_id_arg");
            this.A0H = A01;
            str = "mediaId";
            if (A01 != null) {
                this.A0I = A01;
                C54972OTe c54972OTe = this.A0D;
                if (c54972OTe == null) {
                    str = "logger";
                } else {
                    InterfaceC60442pS interfaceC60442pS = c54972OTe.A01;
                    C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "igtv_composer_start");
                    c82713mZ.A5n = c54972OTe.A02;
                    c82713mZ.A24 = AbstractC166997dE.A0b();
                    c82713mZ.A4x = "edit";
                    c82713mZ.A4P = "tap_edit";
                    c82713mZ.A61 = A01;
                    C32U.A0I(c54972OTe.A00, c82713mZ, interfaceC60442pS, C05F.A00);
                    requireActivity();
                    C25671My c25671My = this.A08;
                    if (c25671My == null) {
                        str = "eventBus";
                    } else {
                        c25671My.A01(this.A0X, C56021Ots.class);
                        C1DX A0Z = AbstractC31176DnK.A0Z(interfaceC09390do);
                        String str3 = this.A0H;
                        if (str3 != null) {
                            C38321qM A022 = A0Z.A02(str3);
                            if (A022 == null) {
                                String str4 = this.A0H;
                                if (str4 != null) {
                                    C1ON A04 = AbstractC2044893h.A04(AbstractC166987dD.A0r(interfaceC09390do), str4);
                                    C50689MZh.A00(A04, this, 13);
                                    schedule(A04);
                                }
                            } else {
                                A01(A022, this);
                            }
                            C0f9.A09(-231545372, A02);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC52180N7p, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-696167539);
        super.onDestroy();
        C25671My c25671My = this.A08;
        if (c25671My == null) {
            C14360o3.A0F("eventBus");
            throw C00O.createAndThrow();
        }
        c25671My.A02(this.A0X, C56021Ots.class);
        C0f9.A09(-1881195353, A02);
    }

    @Override // X.AbstractC52180N7p, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1976126684);
        this.A04 = null;
        super.onDestroyView();
        C0f9.A09(748464690, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-955167111);
        super.onResume();
        C56352iT.A0t.A03(requireActivity()).A0X(this);
        A03(this);
        C0f9.A09(1862399877, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1492565509);
        C25671My c25671My = this.A08;
        String str = "eventBus";
        if (c25671My != null) {
            InterfaceC41501vz interfaceC41501vz = this.A09;
            if (interfaceC41501vz == null) {
                str = "venueSelectedListener";
            } else {
                c25671My.A02(interfaceC41501vz, C55985OtI.class);
                C25671My c25671My2 = this.A08;
                if (c25671My2 != null) {
                    InterfaceC41501vz interfaceC41501vz2 = this.A0A;
                    if (interfaceC41501vz2 == null) {
                        str = "venuesFetchedEventListener";
                    } else {
                        c25671My2.A02(interfaceC41501vz2, C56017Oto.class);
                        super.onStop();
                        C0f9.A09(-1960474956, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
