package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V0I extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromotePagedPreviewFragment";
    public C70399WUb A00;
    public XIGIGBoostCallToAction A02;
    public XIGIGBoostDestination A03;
    public AudioOverlayTrack A04;
    public String A05;
    public String A06;
    public List A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A01 = true;
    public final InterfaceC09390do A0F = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_paged_preview";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TabLayout tabLayout = (TabLayout) AbstractC166997dE.A0R(view, R.id.promote_preview_tab_layout);
        ViewPager2 viewPager2 = (ViewPager2) AbstractC166997dE.A0R(view, R.id.promote_preview_view_pager);
        this.A01 = true;
        UserSession userSession = (UserSession) this.A0F.getValue();
        XIGIGBoostDestination xIGIGBoostDestination = this.A03;
        if (xIGIGBoostDestination == null) {
            str = "selectedDestination";
        } else {
            List list = this.A07;
            if (list == null) {
                str = "instagramPositions";
            } else {
                String str2 = this.A05;
                if (str2 == null) {
                    str = "mediaId";
                } else {
                    XIGIGBoostCallToAction xIGIGBoostCallToAction = this.A02;
                    if (xIGIGBoostCallToAction == null) {
                        str = "callToAction";
                    } else {
                        boolean z = this.A0A;
                        boolean z2 = this.A0B;
                        boolean z3 = this.A09;
                        boolean z4 = this.A0D;
                        boolean z5 = this.A0E;
                        String str3 = this.A06;
                        boolean z6 = this.A0C;
                        List list2 = this.A08;
                        if (list2 == null) {
                            str = "specialRequirementCategories";
                        } else {
                            viewPager2.setAdapter(new UKK(this, xIGIGBoostCallToAction, xIGIGBoostDestination, userSession, this.A04, str2, str3, list, list2, z, z2, z3, z4, z5, z6));
                            new JZX(viewPager2, tabLayout, new C55798Oq9(this, 0)).A00();
                            viewPager2.A05(new C65861TvO(this, 1));
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0F.getValue();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131970828);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        IllegalStateException illegalStateException;
        int i;
        ArrayList<String> stringArrayList;
        String string;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        ArrayList<String> arrayList;
        Object parcelable;
        int A02 = C0f9.A02(-1727949669);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AudioOverlayTrack audioOverlayTrack = null;
        if (bundle2 != null) {
            str = bundle2.getString("destination");
        } else {
            str = null;
        }
        if (str != null) {
            this.A03 = XIGIGBoostDestination.valueOf(str);
            Bundle bundle3 = this.mArguments;
            boolean z6 = false;
            if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("instagram_positions")) != null) {
                ArrayList A0q = AbstractC167017dG.A0q(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    C14360o3.A0A(next);
                    A0q.add(AdsAPIInstagramPosition.valueOf(next));
                }
                InterfaceC09390do interfaceC09390do = this.A0F;
                UserSession userSession = (UserSession) interfaceC09390do.getValue();
                XIGIGBoostDestination xIGIGBoostDestination = this.A03;
                if (xIGIGBoostDestination != null) {
                    ArrayList A00 = C6PZ.A00(xIGIGBoostDestination, userSession, A0q);
                    ArrayList arrayList2 = new ArrayList();
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
                        arrayList2.add(next2);
                    }
                    this.A07 = arrayList2;
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 != null && (string = bundle4.getString("media_id")) != null) {
                        this.A05 = string;
                        Bundle bundle5 = this.mArguments;
                        if (bundle5 != null && (string2 = bundle5.getString("call_to_action")) != null) {
                            this.A02 = XIGIGBoostCallToAction.valueOf(string2);
                            Bundle bundle6 = this.mArguments;
                            if (bundle6 != null) {
                                z = bundle6.getBoolean("is_fb_placement_eligible");
                            } else {
                                z = false;
                            }
                            this.A0A = z;
                            Bundle bundle7 = this.mArguments;
                            if (bundle7 != null) {
                                z2 = bundle7.getBoolean("is_fb_placement_selected");
                            } else {
                                z2 = false;
                            }
                            this.A0B = z2;
                            Bundle bundle8 = this.mArguments;
                            if (bundle8 != null) {
                                z3 = bundle8.getBoolean("is_ad_format_preferences_eligible");
                            } else {
                                z3 = false;
                            }
                            this.A09 = z3;
                            Bundle bundle9 = this.mArguments;
                            if (bundle9 != null) {
                                z4 = bundle9.getBoolean("should_show_creative_optimization_toggle");
                            } else {
                                z4 = false;
                            }
                            this.A0D = z4;
                            Bundle bundle10 = this.mArguments;
                            if (bundle10 != null) {
                                z5 = bundle10.getBoolean("should_show_multi_advertiser_ads_toggle");
                            } else {
                                z5 = false;
                            }
                            this.A0E = z5;
                            Bundle bundle11 = this.mArguments;
                            if (bundle11 != null) {
                                str2 = bundle11.getString("political_ad_byline_text");
                            } else {
                                str2 = null;
                            }
                            this.A06 = str2;
                            Bundle bundle12 = this.mArguments;
                            if (bundle12 != null) {
                                z6 = bundle12.getBoolean("is_political_ads");
                            }
                            this.A0C = z6;
                            Bundle bundle13 = this.mArguments;
                            if (bundle13 == null || (arrayList = bundle13.getStringArrayList("special_requirement_categories")) == null) {
                                arrayList = new ArrayList<>();
                            }
                            this.A08 = arrayList;
                            int i2 = Build.VERSION.SDK_INT;
                            Bundle bundle14 = this.mArguments;
                            if (i2 >= 33) {
                                if (bundle14 != null) {
                                    parcelable = AbstractC53062bn.A01(bundle14, AudioOverlayTrack.class, "selected_audio_overlay_track");
                                    audioOverlayTrack = (AudioOverlayTrack) parcelable;
                                }
                                this.A04 = audioOverlayTrack;
                                this.A00 = AbstractC43594JPz.A0N(interfaceC09390do);
                                C0f9.A09(-1717729936, A02);
                                return;
                            }
                            if (bundle14 != null) {
                                parcelable = bundle14.getParcelable("selected_audio_overlay_track");
                                audioOverlayTrack = (AudioOverlayTrack) parcelable;
                            }
                            this.A04 = audioOverlayTrack;
                            this.A00 = AbstractC43594JPz.A0N(interfaceC09390do);
                            C0f9.A09(-1717729936, A02);
                            return;
                        }
                        illegalStateException = new IllegalStateException("Required value was null.");
                        i = 384364960;
                    } else {
                        illegalStateException = new IllegalStateException("Required value was null.");
                        i = -1923082090;
                    }
                }
                C14360o3.A0F("selectedDestination");
                throw C00O.createAndThrow();
            }
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -1944458711;
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -948142409;
        }
        C0f9.A09(i, A02);
        throw illegalStateException;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(893069297);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_fragment_paged_preview, viewGroup, false);
        C0f9.A09(2122042238, A02);
        return inflate;
    }
}
