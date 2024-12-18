package X;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.facebook.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class V7S extends V07 implements InterfaceC11380iw, XGm {
    public static final long A0G = AbstractC43593JPy.A09(TimeUnit.HOURS);
    public static final String __redex_internal_original_name = "DirectLiveLocationMapFragment";
    public LinearLayout A00;
    public C66542ULx A01;
    public BottomSheetBehavior A02;
    public BottomSheetBehavior A03;
    public ImmutableMap A04;
    public IgTextView A05;
    public IgdsButton A06;
    public IgdsButton A07;
    public IgdsButton A08;
    public IgdsButton A09;
    public IgdsPeopleCell A0A;
    public final AnonymousClass987 A0F = new AnonymousClass987();
    public final InterfaceC09390do A0C = C1XM.A00(new C37014GSt(this, 12));
    public final InterfaceC09390do A0D = C1XM.A00(new C37014GSt(this, 13));
    public final InterfaceC09390do A0E = C1XM.A00(new C37014GSt(this, 14));
    public final InterfaceC09390do A0B = C1XM.A00(new C37014GSt(this, 11));

    private final void A02(BottomSheetBehavior bottomSheetBehavior, int i) {
        bottomSheetBehavior.A0N = true;
        bottomSheetBehavior.A0b(true);
        bottomSheetBehavior.A0V((int) AbstractC13880nE.A00(requireContext(), 308.0f));
        bottomSheetBehavior.A0W(i);
        bottomSheetBehavior.A0a(new C67746UxI(bottomSheetBehavior));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.V07, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.center_location_button);
        TFA tfa = super.A01;
        if (tfa != null) {
            if (tfa.A00(__redex_internal_original_name) != null) {
                A0S.setVisibility(0);
                WNO.A00(A0S, 44, this);
            }
            WNO.A00(view.requireViewById(R.id.back_button), 45, this);
            ViewStub A0M = AbstractC167007dF.A0M(view, R.id.location_sharers_bottomsheet);
            if (A0M.getParent() != null) {
                View inflate = A0M.inflate();
                View findViewById = inflate.findViewById(R.id.people_cell_bottomsheet);
                BottomSheetBehavior A01 = BottomSheetBehavior.A01(findViewById);
                C14360o3.A07(A01);
                ScrollView scrollView = (ScrollView) findViewById.findViewById(R.id.people_cell_list_scroll_view);
                if (scrollView != null) {
                    scrollView.setOnScrollChangeListener(new ViewOnScrollChangeListenerC70247WNr(scrollView, A01));
                }
                this.A00 = (LinearLayout) findViewById.findViewById(R.id.people_cell_list);
                IgdsButton igdsButton = null;
                if (AbstractC31177DnL.A1b(this.A0B.getValue())) {
                    IgdsButton igdsButton2 = (IgdsButton) inflate.findViewById(R.id.share_location_button);
                    if (igdsButton2 != null) {
                        WNO.A00(igdsButton2, 46, this);
                    } else {
                        igdsButton2 = null;
                    }
                    this.A08 = igdsButton2;
                    IgTextView igTextView = (IgTextView) inflate.findViewById(R.id.start_live_sharing_footer_info_text);
                    if (igTextView != null) {
                        igTextView.setVisibility(0);
                    } else {
                        igTextView = null;
                    }
                    this.A05 = igTextView;
                }
                IgdsButton igdsButton3 = (IgdsButton) inflate.findViewById(R.id.stop_live_sharing_button);
                if (igdsButton3 != null) {
                    WNO.A00(igdsButton3, 47, this);
                    igdsButton = igdsButton3;
                }
                this.A09 = igdsButton;
                A02(A01, 4);
                this.A02 = A01;
                ViewStub A0M2 = AbstractC167007dF.A0M(view, R.id.single_sharer_bottomsheet);
                if (A0M2.getParent() != null) {
                    View findViewById2 = A0M2.inflate().findViewById(R.id.single_sharer_bottomsheet);
                    BottomSheetBehavior A012 = BottomSheetBehavior.A01(findViewById2);
                    C14360o3.A07(A012);
                    this.A0A = (IgdsPeopleCell) findViewById2.findViewById(R.id.single_sharer);
                    this.A07 = (IgdsButton) findViewById2.findViewById(R.id.message_sharer_button);
                    this.A06 = (IgdsButton) findViewById2.findViewById(R.id.get_directions_to_sharer_button);
                    A02(A012, 5);
                    this.A03 = A012;
                }
            }
            C66542ULx c66542ULx = this.A01;
            if (c66542ULx == null) {
                str = "locationSharingPresenter";
            } else {
                c66542ULx.A0B(bundle);
                return;
            }
        } else {
            str = "locationManager";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        X.C14360o3.A0F(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r5 == (-1)) goto L6;
     */
    @Override // X.X92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void EGb(X.C69761Vuy r20) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V7S.EGb(X.Vuy):void");
    }

    private final IgdsPeopleCell A01(C69782VvJ c69782VvJ, User user) {
        IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(requireContext(), false);
        igdsPeopleCell.A08(user.getUsername(), false);
        igdsPeopleCell.A04(user.Bhu(), null);
        WNX.A00(igdsPeopleCell, c69782VvJ, this, user, 26);
        igdsPeopleCell.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TFA tfa = super.A01;
        if (tfa != null) {
            Location A00 = tfa.A00(__redex_internal_original_name);
            if (A00 != null && !C14360o3.A0K(c69782VvJ.A02, String.valueOf(AbstractC31176DnK.A0g(C17060sy.A01, super.A04).BTC()))) {
                Context requireContext = requireContext();
                String A01 = WFD.A01(requireContext, A00.getLatitude(), A00.getLongitude(), c69782VvJ.A00, c69782VvJ.A01);
                C14360o3.A07(A01);
                igdsPeopleCell.A07(AbstractC31177DnL.A0b(requireContext, A01, 2131959793));
            }
            return igdsPeopleCell;
        }
        C14360o3.A0F("locationManager");
        throw C00O.createAndThrow();
    }

    @Override // X.V07
    public final void A05(C69271Vkf c69271Vkf) {
        super.A05(c69271Vkf);
        c69271Vkf.A02.add(new C70456WWj(this));
        Number number = (Number) this.A0C.getValue();
        Number number2 = (Number) this.A0D.getValue();
        if (number != null && number2 != null) {
            A04(number.doubleValue(), number2.doubleValue());
        }
    }

    @Override // X.V07, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1168436017);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0E;
        String str = (String) interfaceC09390do.getValue();
        if (str != null) {
            InterfaceC09390do interfaceC09390do2 = super.A04;
            C81663kb A0N = ((C2DU) AbstractC28761aE.A00((UserSession) interfaceC09390do2.getValue())).A0N(str);
            if (A0N != null) {
                List BSH = A0N.BSH();
                ArrayList arrayList = new ArrayList();
                for (Object obj : BSH) {
                    if (((User) obj).BTC() != null) {
                        arrayList.add(obj);
                    }
                }
                ArrayList A0U = AbstractC001800i.A0U(arrayList);
                A0U.add(AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do2));
                ArrayList A0q = AbstractC167017dG.A0q(A0U);
                Iterator it = A0U.iterator();
                while (it.hasNext()) {
                    User user = (User) it.next();
                    AbstractC166997dE.A1R(String.valueOf(user.BTC()), user, A0q);
                }
                this.A04 = ImmutableMap.copyOf(AbstractC06930Yk.A08(A0q));
            }
        }
        String str2 = (String) interfaceC09390do.getValue();
        if (str2 != null) {
            Context requireContext = requireContext();
            InterfaceC09390do interfaceC09390do3 = super.A04;
            UserSession userSession = (UserSession) interfaceC09390do3.getValue();
            C14360o3.A0B(userSession, 2);
            C7CR c7cr = new C7CR(requireContext, userSession);
            C69108Vhy c69108Vhy = new C69108Vhy(userSession);
            String str3 = ((UserSession) interfaceC09390do3.getValue()).userId;
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str3)) {
                    this.A01 = new C66542ULx(requireContext, this, userSession, null, null, c69108Vhy, c7cr, null, str2, __redex_internal_original_name, "igd_live_location_xma", "igd_live_location_xma", str3, false);
                    C0f9.A09(195634172, A02);
                    return;
                }
                throw new IllegalArgumentException("\"userId\" must not be null or empty");
            }
            throw new IllegalArgumentException("\"groupishId\" must not be null or empty");
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-748417726, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(874449582);
        C14360o3.A0B(layoutInflater, 0);
        this.A0F.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_location_sharing_xma, viewGroup, false);
        C0f9.A09(1766656320, A02);
        return inflate;
    }

    @Override // X.V07, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2053442620);
        super.onDestroyView();
        C66542ULx c66542ULx = this.A01;
        if (c66542ULx == null) {
            C14360o3.A0F("locationSharingPresenter");
            throw C00O.createAndThrow();
        }
        c66542ULx.A06();
        this.A02 = null;
        this.A00 = null;
        this.A03 = null;
        this.A0A = null;
        this.A08 = null;
        this.A09 = null;
        this.A05 = null;
        this.A07 = null;
        this.A06 = null;
        C0f9.A09(-437872667, A02);
    }

    @Override // X.V07, androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(868614215);
        super.onPause();
        C66542ULx c66542ULx = this.A01;
        if (c66542ULx == null) {
            C14360o3.A0F("locationSharingPresenter");
            throw C00O.createAndThrow();
        }
        c66542ULx.A08();
        C0f9.A09(759781784, A02);
    }

    @Override // X.V07, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(9270900);
        super.onResume();
        C66542ULx c66542ULx = this.A01;
        if (c66542ULx == null) {
            C14360o3.A0F("locationSharingPresenter");
            throw C00O.createAndThrow();
        }
        c66542ULx.A07();
        C0f9.A09(739733245, A02);
    }
}
