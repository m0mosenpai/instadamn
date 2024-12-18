package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import java.util.List;

/* loaded from: classes7.dex */
public final class HDN extends C53Z implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FundraiserPhotoPickerFragment";
    public IJU A00;
    public String A01;
    public List A02;
    public ViewPager A03;
    public IgSegmentedTabLayout A04;
    public C38313Gt2 A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fundraiser_cover_photo_picker";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str = this.A01;
        if (str != null && !str.isEmpty()) {
            interfaceC56362iU.setTitle(str);
        } else {
            interfaceC56362iU.Efu(2131962968);
        }
        interfaceC56362iU.EkS(true);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) getRootActivity()).EfL(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1181978892);
        super.onCreate(bundle);
        C0f9.A09(827241888, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2124493691);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fundraiser_photo_picker);
        C0f9.A09(773672276, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(649524659);
        super.onDestroyView();
        this.A04 = null;
        this.A03 = null;
        C38313Gt2 c38313Gt2 = this.A05;
        c38313Gt2.getClass();
        if (c38313Gt2.A01 != null) {
            C14240no c14240no = new C14240no(getParentFragmentManager());
            c14240no.A03(c38313Gt2.A01);
            c14240no.A01();
            c38313Gt2.A01 = null;
        }
        if (c38313Gt2.A00 != null) {
            C14240no c14240no2 = new C14240no(getParentFragmentManager());
            c14240no2.A03(c38313Gt2.A00);
            c14240no2.A01();
            c38313Gt2.A00 = null;
        }
        this.A05 = null;
        C0f9.A09(-2021025196, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-808408040);
        super.onPause();
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) getRootActivity()).EfL(0);
        }
        C0f9.A09(1942966876, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-994786660);
        super.onResume();
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) getRootActivity()).EfL(8);
        }
        C0f9.A09(1696270639, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.A03 = (ViewPager) view.requireViewById(R.id.view_pager);
        UserSession session = getSession();
        IJU iju = this.A00;
        iju.getClass();
        List list = this.A02;
        list.getClass();
        C38313Gt2 c38313Gt2 = new C38313Gt2(this, iju, session, list);
        this.A05 = c38313Gt2;
        this.A03.setAdapter(c38313Gt2);
        this.A04 = (IgSegmentedTabLayout) view.requireViewById(R.id.tab_layout);
        int size = this.A02.size();
        IgSegmentedTabLayout igSegmentedTabLayout = this.A04;
        if (size > 1) {
            igSegmentedTabLayout.A01(null, new C47673L3g(null, null, null, 2131962973, true));
            this.A04.A01(null, new C47673L3g(null, null, null, 2131962972, true));
            this.A04.setViewPager(this.A03);
            igSegmentedTabLayout = this.A04;
            i = 0;
        } else {
            i = 8;
        }
        igSegmentedTabLayout.setVisibility(i);
    }
}
