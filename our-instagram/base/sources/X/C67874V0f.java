package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.V0f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67874V0f extends AbstractC59962oe implements XEK, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromotePreviewFragment";
    public View A00;
    public SpinnerImageView A01;
    public XIGIGBoostCallToAction A02;
    public XIGIGBoostDestination A03;
    public W6E A04;
    public ImageUrl A05;
    public C38321qM A06;
    public AudioOverlayTrack A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Map A0F = new LinkedHashMap();
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);

    @Override // X.XEK
    public final void D8d(boolean z) {
        AbstractC65702TsY.A0q();
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_back_button", false);
        C67865Uzw c67865Uzw = new C67865Uzw();
        c67865Uzw.setArguments(bundle);
        C189448aO A0g = AbstractC25231BEo.A0g(this.A0G);
        AbstractC25225BEi.A1Q(A0g, false);
        AbstractC31177DnL.A14(this, c67865Uzw, A0g);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_story_eligible_preview";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ArrayList<String> stringArrayList;
        String string;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        AudioOverlayTrack audioOverlayTrack;
        String str3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC65703TsZ.A1K(this);
        InterfaceC09390do interfaceC09390do = this.A0G;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        Context context = getContext();
        C14360o3.A0C(context, MSV.A00(0));
        this.A04 = new W6E((FragmentActivity) context, this, userSession);
        Bundle bundle2 = this.mArguments;
        ImageUrl imageUrl = null;
        if (bundle2 != null) {
            str = bundle2.getString("destination");
        } else {
            str = null;
        }
        if (str != null) {
            this.A03 = XIGIGBoostDestination.valueOf(str);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("instagram_positions")) != null) {
                ArrayList A0i = AbstractC167007dF.A0i(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    C14360o3.A0A(next);
                    A0i.add(AdsAPIInstagramPosition.valueOf(next));
                }
                UserSession userSession2 = (UserSession) interfaceC09390do.getValue();
                XIGIGBoostDestination xIGIGBoostDestination = this.A03;
                if (xIGIGBoostDestination != null) {
                    ArrayList A00 = C6PZ.A00(xIGIGBoostDestination, userSession2, A0i);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = A00.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) next2;
                        if (adsAPIInstagramPosition == AdsAPIInstagramPosition.A0A) {
                            XIGIGBoostDestination xIGIGBoostDestination2 = this.A03;
                            if (xIGIGBoostDestination2 != null) {
                                if (C6PZ.A03(adsAPIInstagramPosition, xIGIGBoostDestination2, (UserSession) interfaceC09390do.getValue())) {
                                }
                            }
                        }
                        arrayList.add(next2);
                    }
                    this.A0B = arrayList;
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 != null && (string = bundle4.getString("media_id")) != null) {
                        this.A09 = string;
                        Bundle bundle5 = this.mArguments;
                        if (bundle5 != null && (string2 = bundle5.getString("call_to_action")) != null) {
                            this.A02 = XIGIGBoostCallToAction.valueOf(string2);
                            Bundle bundle6 = this.mArguments;
                            if (bundle6 != null) {
                                z = bundle6.getBoolean("is_fb_placement_eligible");
                            } else {
                                z = false;
                            }
                            this.A0C = z;
                            Bundle bundle7 = this.mArguments;
                            if (bundle7 != null) {
                                z2 = bundle7.getBoolean("is_fb_placement_selected");
                            } else {
                                z2 = false;
                            }
                            this.A0D = z2;
                            Bundle bundle8 = this.mArguments;
                            if (bundle8 != null) {
                                bundle8.getBoolean("is_ad_format_preferences_eligible");
                            }
                            Bundle bundle9 = this.mArguments;
                            if (bundle9 != null) {
                                z3 = bundle9.getBoolean("should_show_creative_optimization_toggle");
                            } else {
                                z3 = false;
                            }
                            this.A0E = z3;
                            Bundle bundle10 = this.mArguments;
                            if (bundle10 != null) {
                                bundle10.getBoolean("should_show_multi_advertiser_ads_toggle");
                            }
                            Bundle bundle11 = this.mArguments;
                            if (bundle11 != null) {
                                str2 = bundle11.getString("political_ad_byline_text");
                            } else {
                                str2 = null;
                            }
                            this.A0A = str2;
                            int i = Build.VERSION.SDK_INT;
                            Bundle bundle12 = this.mArguments;
                            if (i >= 33) {
                                if (bundle12 != null) {
                                    audioOverlayTrack = (AudioOverlayTrack) AbstractC53062bn.A01(bundle12, AudioOverlayTrack.class, "selected_audio_overlay_track");
                                }
                                audioOverlayTrack = null;
                            } else {
                                if (bundle12 != null) {
                                    audioOverlayTrack = (AudioOverlayTrack) bundle12.getParcelable("selected_audio_overlay_track");
                                }
                                audioOverlayTrack = null;
                            }
                            this.A07 = audioOverlayTrack;
                            Bundle bundle13 = this.mArguments;
                            if (bundle13 != null) {
                                str3 = bundle13.getString("ab_text_banner_text");
                            } else {
                                str3 = null;
                            }
                            this.A08 = str3;
                            Bundle bundle14 = this.mArguments;
                            if (bundle14 != null) {
                                imageUrl = (ImageUrl) bundle14.getParcelable("ab_test_banner_url");
                            }
                            this.A05 = imageUrl;
                            this.A01 = AbstractC31180DnO.A0V(view);
                            this.A00 = view.requireViewById(R.id.preview_screen_content_view);
                            C1DX A0Z = AbstractC31176DnK.A0Z(interfaceC09390do);
                            String str4 = this.A09;
                            String str5 = "mediaId";
                            if (str4 != null) {
                                this.A06 = A0Z.A02(AnonymousClass001.A0T(str4, ((UserSession) interfaceC09390do.getValue()).userId, '_'));
                                SpinnerImageView spinnerImageView = this.A01;
                                if (spinnerImageView == null) {
                                    C14360o3.A0F("loadingSpinner");
                                } else {
                                    spinnerImageView.setLoadingStatus(C3T1.LOADING);
                                    View view2 = this.A00;
                                    if (view2 == null) {
                                        C14360o3.A0F("previewScreenContentView");
                                    } else {
                                        view2.setVisibility(8);
                                        W6E w6e = this.A04;
                                        if (w6e == null) {
                                            str5 = "dataFetcher";
                                        } else {
                                            String str6 = this.A09;
                                            if (str6 != null) {
                                                XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                                                if (xIGIGBoostCallToAction == null) {
                                                    str5 = "callToAction";
                                                } else {
                                                    String obj = xIGIGBoostCallToAction.toString();
                                                    List list = this.A0B;
                                                    if (list == null) {
                                                        str5 = "instagramPositions";
                                                    } else {
                                                        ArrayList A0i2 = AbstractC167007dF.A0i(list);
                                                        Iterator it3 = list.iterator();
                                                        while (it3.hasNext()) {
                                                            AbstractC166997dE.A1S(it3.next(), A0i2);
                                                        }
                                                        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0i2);
                                                        C44093JeI c44093JeI = new C44093JeI(this, 2);
                                                        C2JM c2jm = new C2JM();
                                                        PromoteData promoteData = w6e.A03;
                                                        UserSession userSession3 = promoteData.A0y;
                                                        boolean A1X = AbstractC43594JPz.A1X(c2jm, PublicKeyCredentialControllerUtility.JSON_KEY_ID, userSession3.userId);
                                                        c2jm.A04("media_id", str6);
                                                        c2jm.A04("call_to_action", obj);
                                                        c2jm.A05("instagram_positions", copyOf);
                                                        c2jm.A05("regulated_categories", promoteData.A03());
                                                        C195928le A002 = C195928le.A00(userSession3);
                                                        C18C.A0E(A1X);
                                                        A002.ATV(new C70434WVm(c44093JeI, 2), new WW0(c44093JeI, 7), new C907442n(c2jm, C66574UNk.class, "IGBoostPlacementWebviewPreviewInfoQuery", false));
                                                        AbstractC65702TsY.A1M(AbstractC43594JPz.A0N(interfaceC09390do), VG4.A08);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                throw C00O.createAndThrow();
                            }
                            C14360o3.A0F(str5);
                            throw C00O.createAndThrow();
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                C14360o3.A0F("selectedDestination");
                throw C00O.createAndThrow();
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(C67874V0f c67874V0f) {
        boolean z;
        String str = "previewScreenContentView";
        SpinnerImageView spinnerImageView = c67874V0f.A01;
        if (spinnerImageView == null) {
            C14360o3.A0F("loadingSpinner");
        } else {
            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
            View view = c67874V0f.A00;
            if (view != null) {
                view.setVisibility(0);
                Bundle bundle = c67874V0f.mArguments;
                if (bundle != null) {
                    z = bundle.getBoolean("is_view_pager_child");
                } else {
                    z = false;
                }
                FragmentActivity activity = c67874V0f.getActivity();
                if (activity != null) {
                    View view2 = c67874V0f.A00;
                    if (view2 != null) {
                        UserSession userSession = (UserSession) c67874V0f.A0G.getValue();
                        XIGIGBoostDestination xIGIGBoostDestination = c67874V0f.A03;
                        if (xIGIGBoostDestination == null) {
                            str = "selectedDestination";
                        } else {
                            List list = c67874V0f.A0B;
                            if (list == null) {
                                str = "instagramPositions";
                            } else {
                                boolean z2 = c67874V0f.A0C;
                                boolean z3 = c67874V0f.A0D;
                                boolean z4 = c67874V0f.A0E;
                                VRT.A00(view2, activity, xIGIGBoostDestination, c67874V0f, c67874V0f, userSession, c67874V0f.A05, c67874V0f.A08, list, z, z2, z3, z4);
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
        }
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0G.getValue();
    }

    @Override // X.XEK
    public final void DF9() {
        String str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C70170WEm c70170WEm = C70170WEm.A00;
            UserSession userSession = (UserSession) this.A0G.getValue();
            C38321qM c38321qM = this.A06;
            Map map = this.A0F;
            String str2 = this.A09;
            if (str2 == null) {
                str = "mediaId";
            } else {
                XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                if (xIGIGBoostCallToAction == null) {
                    str = "callToAction";
                } else {
                    List list = this.A0B;
                    if (list == null) {
                        str = "instagramPositions";
                    } else {
                        c70170WEm.A03(activity, xIGIGBoostCallToAction, userSession, c38321qM, str2, list, map);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.XEK
    public final void DGW() {
        boolean z;
        Object obj;
        String str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C70170WEm c70170WEm = C70170WEm.A00;
            InterfaceC09390do interfaceC09390do = this.A0G;
            UserSession userSession = (UserSession) interfaceC09390do.getValue();
            C38321qM c38321qM = this.A06;
            Map map = this.A0F;
            String str2 = this.A09;
            if (str2 == null) {
                str = "mediaId";
            } else {
                XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                if (xIGIGBoostCallToAction == null) {
                    str = "callToAction";
                } else {
                    List list = this.A0B;
                    if (list == null) {
                        str = "instagramPositions";
                    } else {
                        UserSession userSession2 = (UserSession) interfaceC09390do.getValue();
                        XIGIGBoostDestination xIGIGBoostDestination = this.A03;
                        if (xIGIGBoostDestination == null) {
                            str = "selectedDestination";
                        } else {
                            C14360o3.A0B(userSession2, 1);
                            Iterator it = list.iterator();
                            while (true) {
                                z = false;
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (obj == AdsAPIInstagramPosition.A0A) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) obj;
                            if (adsAPIInstagramPosition != null) {
                                z = C6PZ.A03(adsAPIInstagramPosition, xIGIGBoostDestination, userSession2);
                            }
                            c70170WEm.A04(activity, xIGIGBoostCallToAction, userSession, c38321qM, str2, map, z);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.XEK
    public final void Ddc() {
        String str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C70170WEm c70170WEm = C70170WEm.A00;
            UserSession userSession = (UserSession) this.A0G.getValue();
            C38321qM c38321qM = this.A06;
            Map map = this.A0F;
            String str2 = this.A09;
            if (str2 == null) {
                str = "mediaId";
            } else {
                XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                if (xIGIGBoostCallToAction == null) {
                    str = "callToAction";
                } else {
                    c70170WEm.A02(activity, xIGIGBoostCallToAction, userSession, c38321qM, this.A07, str2, this.A0A, map);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.XEK
    public final void DpD() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            UserSession userSession = (UserSession) this.A0G.getValue();
            Map map = this.A0F;
            AbstractC167017dG.A1P(userSession, map);
            C70170WEm.A00(activity, (LEI) map.get(AdsAPIInstagramPosition.A0F), userSession);
        }
    }

    @Override // X.XEK
    public final void DpE() {
        AbstractC31177DnL.A0u(requireActivity(), (UserSession) this.A0G.getValue(), C2Fb.A35, MSV.A00(467));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131970828);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-610369369);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_preview, false);
        C0f9.A09(-428924392, A02);
        return A0R;
    }
}
