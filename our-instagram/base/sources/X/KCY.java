package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class KCY extends AbstractC59962oe implements InterfaceC60072op, InterfaceC189488aT, InterfaceC50436MOq, MRF {
    public static final String __redex_internal_original_name = "DirectMediaPickerSheetFragment";
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public Fragment A09;
    public C47809L9r A0A;
    public C8EJ A0B;
    public InterfaceC50491MQt A0C;
    public InterfaceC50455MPj A0D;
    public C48632Lf9 A0E;
    public DirectAggregatedMediaViewerController A0F;
    public C7VZ A0G;
    public C2EC A0H;
    public IgdsBottomButtonLayout A0I;
    public DirectThreadKey A0J;
    public InterfaceC83713oG A0K;
    public String A0L;
    public String A0M;
    public List A0N;
    public List A0O;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0Y;
    public float A0Z;
    public View A0b;
    public View A0c;
    public View A0d;
    public C76T A0e;
    public FIW A0f;
    public C7IK A0g;
    public C47765L7l A0h;
    public String A0i;
    public boolean A0j;
    public static final LFC A0t = new Object();
    public static final C55942hf A0s = C55942hf.A00();
    public final MR9 A0p = new C49636LwT(this);
    public float A00 = 0.7f;
    public float A0a = 1.0f;
    public final AnonymousClass987 A0o = new AnonymousClass987();
    public boolean A0T = true;
    public boolean A0P = true;
    public boolean A0X = true;
    public final InterfaceC09390do A0l = AbstractC25225BEi.A0a(new C37014GSt(this, 33), new C37014GSt(this, 32), new C50172MDz(38, null, this), AbstractC25225BEi.A1D(C44551Jmv.class));
    public final InterfaceC09390do A0k = AbstractC25225BEi.A0a(new C37014GSt(this, 34), new C37014GSt(this, 31), new C50172MDz(39, null, this), AbstractC25225BEi.A1D(C44526JmW.class));
    public final MPG A0q = new C49638LwV(this, 0);
    public final C47322KvX A0n = new C47322KvX(this);
    public final InterfaceC09390do A0m = AbstractC60492pY.A02(this);
    public final String A0r = "direct_media_picker_fragment";

    public final void A04(InterfaceC50491MQt interfaceC50491MQt, InterfaceC50455MPj interfaceC50455MPj, DirectAggregatedMediaViewerController directAggregatedMediaViewerController, C7VZ c7vz, C2EC c2ec, InterfaceC83713oG interfaceC83713oG, String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A0F = directAggregatedMediaViewerController;
        this.A0D = interfaceC50455MPj;
        this.A0S = z;
        this.A0R = false;
        this.A01 = i;
        this.A02 = i2;
        this.A0C = interfaceC50491MQt;
        this.A0L = str;
        this.A0M = null;
        this.A0H = c2ec;
        this.A0K = interfaceC83713oG;
        this.A0G = c7vz;
        this.A0Q = z2;
        this.A0T = z3;
        this.A0P = false;
    }

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        View view;
        C14360o3.A0B(c7ik, 0);
        this.A0g = c7ik;
        ViewGroup viewGroup = this.A08;
        if (viewGroup != null) {
            Drawable background = viewGroup.getBackground();
            if (background != null) {
                int i = c7ik.A09;
                background.setColorFilter(i, PorterDuff.Mode.SRC);
                if (!this.A0R) {
                    C30D.A04(requireActivity(), i);
                }
                if ((AbstractC166997dE.A0N(this).getConfiguration().uiMode & 48) != 32 && this.A0G != null) {
                    i = AbstractC56842jH.A06(requireContext().getColor(R.color.grey_0), 191);
                    view = this.A05;
                } else {
                    View view2 = this.A05;
                    if (view2 != null) {
                        view2.setBackgroundColor(AbstractC56842jH.A06(i, 205));
                    }
                    view = this.A06;
                }
                if (view != null) {
                    view.setBackgroundColor(i);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        KCT A00 = A00(this);
        if (A00 != null) {
            A00.ADq(c7ik);
        }
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.MRF
    public final boolean DmO(Medium medium, String str) {
        InterfaceC50491MQt interfaceC50491MQt = this.A0C;
        if (interfaceC50491MQt == null) {
            return false;
        }
        interfaceC50491MQt.DmN(medium, str);
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        C14360o3.A0B(fragment, 0);
        KCT kct = (KCT) fragment;
        MR9 mr9 = this.A0p;
        C7IK c7ik = this.A0g;
        C14360o3.A0B(mr9, 0);
        kct.A03 = mr9;
        C47958LGu c47958LGu = kct.A02;
        if (c47958LGu != null) {
            c47958LGu.A01 = mr9;
            c47958LGu.A09.A00 = mr9;
        }
        kct.ADq(c7ik);
        kct.A00 = this;
        MPG mpg = this.A0q;
        kct.A04 = mpg;
        C47958LGu c47958LGu2 = kct.A02;
        if (c47958LGu2 != null) {
            c47958LGu2.A02 = mpg;
        }
        C47322KvX c47322KvX = this.A0n;
        kct.A01 = c47322KvX;
        if (c47958LGu2 != null) {
            c47958LGu2.A00 = c47322KvX;
        }
        kct.setDayNightMode(this.dayNightMode);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        View view;
        float f = (-i) - i2;
        View view2 = this.A03;
        if (view2 != null) {
            view2.setTranslationY(f);
        }
        View view3 = this.A0b;
        if (view3 != null) {
            view3.setTranslationY(f);
        }
        View view4 = this.A0d;
        if (view4 != null) {
            view4.setTranslationY(f);
        }
        C47765L7l c47765L7l = this.A0h;
        if (c47765L7l == null) {
            C14360o3.A0F("roundedCornerHelper");
            throw C00O.createAndThrow();
        }
        c47765L7l.A00(i);
        C48632Lf9 c48632Lf9 = this.A0E;
        if (c48632Lf9 != null && (view = c48632Lf9.A00.A03) != null) {
            view.setTranslationY(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0105, code lost:
    
        if (X.C161857Mv.A02.A03(r4.A01, r3.Aic()) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:
    
        if (X.C18U.A06(r9, r10, 36330063205253781L) == false) goto L38;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r31, android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCY.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        if (r3 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C26086BgF r27, X.KCY r28, int r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCY.A01(X.BgF, X.KCY, int, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(android.view.View r75, com.instagram.common.gallery.model.GalleryItem r76, X.KCY r77) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCY.A03(android.view.View, com.instagram.common.gallery.model.GalleryItem, X.KCY):boolean");
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.MRF
    public final EnumC188968Ym B9N() {
        InterfaceC50491MQt interfaceC50491MQt = this.A0C;
        if (interfaceC50491MQt != null) {
            return interfaceC50491MQt.B9N();
        }
        return EnumC188968Ym.A02;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return this.A00;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        InterfaceC08430c6 interfaceC08430c6 = this.A09;
        if (interfaceC08430c6 != null && (interfaceC08430c6 instanceof MQG)) {
            return ((MQG) interfaceC08430c6).CQn();
        }
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return this.A0a;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return this.A00;
    }

    @Override // X.MRF
    public final void D2F() {
    }

    @Override // X.MRF
    public final void DKF(boolean z) {
        List list;
        InterfaceC09390do interfaceC09390do = this.A0k;
        ((C44526JmW) interfaceC09390do.getValue()).A00(z);
        C44551Jmv c44551Jmv = (C44551Jmv) this.A0l.getValue();
        DirectThreadKey directThreadKey = this.A0J;
        KCT A00 = A00(this);
        if (A00 != null) {
            list = A00.A00();
        } else {
            list = null;
        }
        boolean A01 = ((C44526JmW) interfaceC09390do.getValue()).A01();
        UserSession userSession = c44551Jmv.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36330063204991635L) && !C18U.A06(c06090Tz, userSession, 36330063205843610L)) {
            return;
        }
        C44551Jmv.A02(c44551Jmv, directThreadKey, list, A01);
    }

    @Override // X.MRF
    public final boolean EjX() {
        return AbstractC167007dF.A1X(((C51758Mth) ((C44526JmW) this.A0k.getValue()).A06.getValue()).A00, C05F.A00);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0r;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0m);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        InterfaceC08430c6 interfaceC08430c6 = this.A09;
        if (interfaceC08430c6 != null && (interfaceC08430c6 instanceof MQG)) {
            return ((MQG) interfaceC08430c6).isScrolledToTop();
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC60072op interfaceC60072op;
        KNU knu;
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A0F;
        if (directAggregatedMediaViewerController != null && directAggregatedMediaViewerController.A0l()) {
            return true;
        }
        C47809L9r c47809L9r = this.A0A;
        if (c47809L9r == null || (knu = c47809L9r.A01) == null || !knu.onBackPressed()) {
            InterfaceC08430c6 interfaceC08430c6 = this.A09;
            if (!(interfaceC08430c6 instanceof InterfaceC60072op) || (interfaceC60072op = (InterfaceC60072op) interfaceC08430c6) == null || !interfaceC60072op.onBackPressed()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        FragmentActivity activity;
        if (!this.A0R && (activity = getActivity()) != null) {
            C30D.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
        }
    }

    public static final KCT A00(KCY kcy) {
        if (!kcy.isResumed()) {
            return null;
        }
        Fragment A0O = kcy.getChildFragmentManager().A0O(R.id.fragment_container);
        if (!(A0O instanceof KCT)) {
            return null;
        }
        return (KCT) A0O;
    }

    public static final void A02(KCY kcy, C48632Lf9 c48632Lf9) {
        View view;
        KCT A00 = A00(kcy);
        if (A00 != null && A00.A02()) {
            List<GalleryItem> A002 = A00.A00();
            C159407Da c159407Da = c48632Lf9.A01;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (GalleryItem galleryItem : A002) {
                if (galleryItem.A02()) {
                    Medium medium = galleryItem.A00;
                    if (medium != null) {
                        galleryItem = AbstractC167017dG.A0d(medium);
                        A1E.add(new C9NH(galleryItem, null));
                    }
                } else if (galleryItem.A04()) {
                    A1E.add(new C9NH(galleryItem, null));
                }
            }
            c159407Da.EWl(A1E);
            if (!kcy.A0V && kcy.A0P && (view = kcy.A0c) != null) {
                view.postDelayed(new RunnableC24440AsL(c48632Lf9), 500L);
            }
        }
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.MRF
    public final boolean DIy(View view, GalleryItem galleryItem) {
        return A03(view, galleryItem, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-805678960);
        super.onCreate(bundle);
        this.A0R = requireArguments().getBoolean("BUNDLE_IS_EMBEDDED");
        this.A0i = requireArguments().getString("BUNDLE_THREAD_TRANSPORT_TYPE");
        this.A0W = requireArguments().getBoolean("BUNDLE_SHOW_SELECT_BUTTON");
        this.A0U = requireArguments().getBoolean("BUNDLE_SHOW_MEDIA_THUMBNAILS");
        this.A0V = requireArguments().getBoolean("BUNDLE_SHOW_NEXT_BUTTON");
        this.A0Y = requireArguments().getBoolean("BUNDLE_SHOW_VIEW_MODE_SELECTOR");
        this.A0Z = requireArguments().getFloat("BUNDLE_ASPECT_RATIO", 1.0f);
        this.A00 = requireArguments().getFloat("BUNDLE_INITIAL_HEIGHT_RATIO", 0.7f);
        this.A0a = requireArguments().getFloat("BUNDLE_MAXIMUM_HEIGHT_RATIO", 1.0f);
        this.A0j = requireArguments().getBoolean("BUNDLE_SHOW_MAGIC_MEDIA_REMIX", false);
        this.A0J = (DirectThreadKey) requireArguments().getParcelable("BUNDLE_DIRECT_THREAD_KEY");
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0m;
        this.A0e = C76S.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do));
        C2EC c2ec = this.A0H;
        if (c2ec == null) {
            DirectThreadKey directThreadKey = this.A0J;
            if (directThreadKey != null) {
                c2ec = AbstractC43594JPz.A0c(AbstractC166987dD.A0r(interfaceC09390do), directThreadKey);
            } else {
                c2ec = null;
            }
        }
        this.A0H = c2ec;
        this.A0X = requireArguments().getBoolean("BUNDLE_SHOW_SEND_BUTTON");
        C0f9.A09(1793923019, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1001954497);
        C14360o3.A0B(layoutInflater, 0);
        if (!this.A0R) {
            this.A0o.A02(viewGroup);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_media_picker, viewGroup, false);
        C0f9.A09(1710102311, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC83703oF A02;
        C83693oE A00;
        String str;
        int i;
        KCT kct;
        int A022 = C0f9.A02(-909401889);
        List<GalleryItem> list = this.A0N;
        if (list == null) {
            Fragment fragment = this.A09;
            if ((fragment instanceof KCT) && (kct = (KCT) fragment) != null) {
                list = kct.A00();
            } else {
                list = null;
            }
        }
        C44526JmW c44526JmW = (C44526JmW) this.A0k.getValue();
        InterfaceC83713oG interfaceC83713oG = c44526JmW.A00;
        if (interfaceC83713oG != null && (A02 = AbstractC140946Yw.A02(interfaceC83713oG)) != null && (A00 = AbstractC140956Yx.A00(A02)) != null && (str = A00.A00) != null) {
            if (C18U.A06(C06090Tz.A05, c44526JmW.A01, 36330063205712536L)) {
                int i2 = 0;
                if (list != null) {
                    i = 0;
                    for (GalleryItem galleryItem : list) {
                        if (galleryItem.A06()) {
                            i++;
                        } else if (galleryItem.A03()) {
                            i2++;
                        }
                    }
                } else {
                    i = 0;
                }
                C18920wW c18920wW = c44526JmW.A02.A00;
                C14360o3.A0B(c18920wW, 0);
                C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c18920wW, "direct_media_gallery_close"), 141);
                if (AbstractC25226BEj.A1Z(A0A)) {
                    A0A.A0R("open_thread_id", str);
                    A0A.A0Q("media_count_photo", AbstractC31171DnF.A0V(i2));
                    A0A.A0Q("media_count_video", AbstractC31171DnF.A0V(i));
                    A0A.Cht();
                }
            }
        }
        this.A0N = null;
        this.A0c = null;
        this.A0I = null;
        this.A04 = null;
        this.A08 = null;
        this.A03 = null;
        this.A0b = null;
        this.A05 = null;
        this.A07 = null;
        if (!this.A0R) {
            this.A0o.A01();
        }
        InterfaceC09390do interfaceC09390do = this.A0m;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36330638730675144L)) {
            this.A09 = null;
        }
        if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36330638731068366L)) {
            C47809L9r c47809L9r = this.A0A;
            if (c47809L9r != null) {
                KNU knu = c47809L9r.A01;
                if (knu != null) {
                    knu.A00 = null;
                    knu.A02 = null;
                }
                c47809L9r.A01 = null;
            }
            this.A0A = null;
        }
        super.onDestroyView();
        C0f9.A09(-706418200, A022);
    }
}
