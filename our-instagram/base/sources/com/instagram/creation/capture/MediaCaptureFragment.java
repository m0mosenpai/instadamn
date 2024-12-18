package com.instagram.creation.capture;

import X.AbstractC001800i;
import X.AbstractC13530mf;
import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC208329Jr;
import X.AbstractC226319yo;
import X.AbstractC23451Ch;
import X.AbstractC25230BEn;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31718DwN;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.AbstractC43594JPz;
import X.AbstractC43840Ja3;
import X.AbstractC43841Ja4;
import X.AbstractC43847JaB;
import X.AbstractC43884Jap;
import X.AbstractC44422JkI;
import X.AbstractC50666MYj;
import X.AbstractC53242c7;
import X.AbstractC53891NsN;
import X.AbstractC54912fq;
import X.AnonymousClass229;
import X.AnonymousClass249;
import X.AnonymousClass257;
import X.AnonymousClass840;
import X.AnonymousClass841;
import X.C006802i;
import X.C05F;
import X.C06090Tz;
import X.C0K8;
import X.C0f9;
import X.C0fA;
import X.C0fX;
import X.C128535rM;
import X.C131965xW;
import X.C131975xX;
import X.C14360o3;
import X.C149686oL;
import X.C16910sj;
import X.C16930sl;
import X.C17320tT;
import X.C1815483h;
import X.C183978Ee;
import X.C18U;
import X.C19280xC;
import X.C193328hC;
import X.C195868lW;
import X.C196188m9;
import X.C198308pf;
import X.C1VW;
import X.C22P;
import X.C24164Ann;
import X.C25A;
import X.C27961Xa;
import X.C3HB;
import X.C43830JZt;
import X.C43833JZw;
import X.C43848JaC;
import X.C44265JhC;
import X.C44272JhO;
import X.C44279JhV;
import X.C44281JhX;
import X.C44288Jhe;
import X.C44290Jhg;
import X.C44316Ji7;
import X.C449124v;
import X.C47809L9r;
import X.C50692MZl;
import X.C53Z;
import X.C55772hI;
import X.C55982hj;
import X.C56024Otv;
import X.C5SU;
import X.C5SV;
import X.C64842wi;
import X.C69613Av;
import X.C6WI;
import X.C8Z4;
import X.C9KS;
import X.DialogInterfaceOnClickListenerC35301Fha;
import X.DialogInterfaceOnClickListenerC48023LMs;
import X.EnumC114925Hg;
import X.EnumC193318hB;
import X.EnumC33422Ept;
import X.EnumC40111tc;
import X.EnumC44287Jhd;
import X.EnumC58132lV;
import X.EnumC60792q3;
import X.EnumC69983Ch;
import X.FA7;
import X.GestureDetectorOnGestureListenerC43829JZs;
import X.GestureDetectorOnGestureListenerC44266JhD;
import X.HandlerC44284Jha;
import X.InterfaceC09390do;
import X.InterfaceC189608af;
import X.InterfaceC189618ag;
import X.InterfaceC189638ai;
import X.InterfaceC189668al;
import X.InterfaceC195648l5;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.InterfaceC25173BBt;
import X.InterfaceC41501vz;
import X.InterfaceC50446MPa;
import X.InterfaceC60072op;
import X.L0T;
import X.LJR;
import X.MN7;
import X.MN8;
import X.MSF;
import X.MSV;
import X.MX1;
import X.ViewOnClickListenerC43832JZv;
import X.ViewOnClickListenerC44269JhH;
import X.ViewOnClickListenerC48064LPp;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.mediapicker.Folder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

/* loaded from: classes8.dex */
public class MediaCaptureFragment extends C53Z implements InterfaceC60072op, InterfaceC189618ag, InterfaceC189638ai, InterfaceC189668al, InterfaceC25173BBt, MN7, MN8 {
    public float A00;
    public C50692MZl A02;
    public C44265JhC A03;
    public AnonymousClass840 A04;
    public C196188m9 A05;
    public File A06;
    public boolean A07;
    public boolean A08;
    public Tab A0A;
    public C43833JZw A0B;
    public C1815483h A0C;
    public InterfaceC19630xq A0D;
    public C64842wi A0E;
    public L0T A0F;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public ViewOnClickListenerC43832JZv mActionBar;
    public View mActionBarShadow;
    public MSF mCaptureProvider;
    public View mCaptureView;
    public GestureDetectorOnGestureListenerC43829JZs mGalleryPickerView;
    public GestureDetectorOnGestureListenerC44266JhD mMediaTabHost;
    public AbstractC44422JkI mUnifiedCaptureView;
    public C22P A09 = C22P.A5N;
    public int A01 = 10;
    public final HandlerC44284Jha A0L = new HandlerC44284Jha(this);
    public final InterfaceC41501vz A0K = new C44288Jhe(this, 1);
    public String A0G = null;

    @Override // X.InterfaceC189638ai
    public final void DJ0(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, float f) {
        float min = Math.min(f, 0.0f);
        this.A00 = min;
        this.mActionBar.setTranslationY(min);
        this.mActionBarShadow.setTranslationY(this.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[SYNTHETIC] */
    @Override // X.InterfaceC25173BBt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DRK(java.util.List r7) {
        /*
            r6 = this;
            r3 = 0
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r5 = r7.iterator()
        L9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r2 = r5.next()
            X.8pf r2 = (X.C198308pf) r2
            X.8pb r0 = r2.A05
            int r1 = r0.ordinal()
            java.lang.String r0 = "Required value was null."
            if (r1 == r3) goto L50
            X.8lW r2 = r2.A03
            if (r2 == 0) goto L7b
            java.lang.String r0 = r2.A0k
            java.io.File r1 = X.AbstractC166987dD.A11(r0)
            r0 = 3
            com.instagram.common.gallery.Medium r1 = X.C8IU.A03(r1, r0, r3)
            int r0 = r2.A09
            r1.A07 = r0
            java.lang.String r0 = r2.A0f
            if (r0 == 0) goto L38
            r1.A0P = r0
        L38:
            java.lang.String r0 = r2.A0g
            if (r0 == 0) goto L3e
            r1.A0Q = r0
        L3e:
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A0P
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.A0K
            r1.A0M = r0
            java.lang.String r0 = r2.A0j
        L48:
            if (r0 == 0) goto L4c
            r1.A0S = r0
        L4c:
            r4.add(r1)
            goto L9
        L50:
            X.8Ee r2 = r2.A02
            if (r2 == 0) goto L80
            java.io.File r1 = r2.A03()
            X.C14360o3.A0B(r1, r3)
            r0 = 1
            com.instagram.common.gallery.Medium r1 = X.C8IU.A03(r1, r0, r3)
            int r0 = r2.A07
            r1.A07 = r0
            java.lang.String r0 = r2.A0a
            if (r0 == 0) goto L6a
            r1.A0P = r0
        L6a:
            java.lang.String r0 = r2.A0b
            if (r0 == 0) goto L70
            r1.A0Q = r0
        L70:
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A0E
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.A0K
            r1.A0M = r0
            java.lang.String r0 = r2.A0c
            goto L48
        L7b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L80:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L85:
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            X.MPa r2 = (X.InterfaceC50446MPa) r2
            if (r2 == 0) goto L9f
            com.instagram.creation.activity.MediaCaptureActivity r2 = (com.instagram.creation.activity.MediaCaptureActivity) r2
            int r1 = r4.size()
            r0 = 1
            if (r1 != r0) goto La0
            java.lang.Object r0 = r4.get(r3)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            r2.A09(r0)
        L9f:
            return r3
        La0:
            com.instagram.common.session.UserSession r1 = r2.A04
            X.840 r0 = r2.A09
            X.841 r0 = r0.A00
            r0.getClass()
            X.AbstractC46688Kl5.A00(r2, r1, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.MediaCaptureFragment.DRK(java.util.List):boolean");
    }

    @Override // X.InterfaceC189618ag
    public final boolean Ei6() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "tabbed_gallery_camera";
    }

    private void A00() {
        Integer num;
        Tab currentTab = this.mMediaTabHost.getCurrentTab();
        MSF msf = this.mCaptureProvider;
        if (msf != null) {
            num = ((ViewOnClickListenerC44269JhH) msf).A0A;
        } else {
            num = null;
        }
        InterfaceC19630xq interfaceC19630xq = this.A0D;
        C14360o3.A0B(interfaceC19630xq, 1);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        if (currentTab != null) {
            ARD.E7D("__CAPTURE_TAB_V2__", currentTab.A00);
        }
        if (num != null) {
            ARD.E7D("__CAMERA_FACING__", num.intValue());
        }
        ARD.apply();
    }

    public static void A01(MediaCaptureFragment mediaCaptureFragment) {
        double d;
        C55982hj c55982hj;
        MSF msf = mediaCaptureFragment.mCaptureProvider;
        msf.getClass();
        boolean CKp = msf.CKp();
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD = mediaCaptureFragment.mMediaTabHost;
        if (CKp) {
            gestureDetectorOnGestureListenerC44266JhD.A03(AbstractC43884Jap.A02, false);
            GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD2 = mediaCaptureFragment.mMediaTabHost;
            d = 1.0d;
            gestureDetectorOnGestureListenerC44266JhD2.A0I.setEnabled(false);
            c55982hj = gestureDetectorOnGestureListenerC44266JhD2.A0H;
        } else {
            d = 0.0d;
            gestureDetectorOnGestureListenerC44266JhD.A0I.setEnabled(true);
            c55982hj = gestureDetectorOnGestureListenerC44266JhD.A0H;
        }
        c55982hj.A06(d);
        mediaCaptureFragment.mActionBar.A02();
    }

    public static void A02(MediaCaptureFragment mediaCaptureFragment, float f) {
        float f2;
        float right;
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = mediaCaptureFragment.mGalleryPickerView;
        if (mediaCaptureFragment.A0I) {
            f2 = ((mediaCaptureFragment.mMediaTabHost.A0I.getChildCount() - 1) * mediaCaptureFragment.mActionBar.getWidth()) - f;
        } else {
            f2 = -f;
        }
        gestureDetectorOnGestureListenerC43829JZs.setTranslationX(f2);
        View view = mediaCaptureFragment.mCaptureView;
        if (mediaCaptureFragment.A0I) {
            right = ((mediaCaptureFragment.mMediaTabHost.A0I.getChildCount() - 2) * mediaCaptureFragment.mActionBar.getWidth()) - f;
        } else {
            right = mediaCaptureFragment.mGalleryPickerView.getRight() + (-f);
        }
        view.setTranslationX(right);
    }

    @Override // X.InterfaceC189618ag
    public final C43848JaC B7B() {
        return this.mGalleryPickerView.A11;
    }

    @Override // X.InterfaceC189618ag
    public final EnumC58132lV B7C() {
        return EnumC58132lV.A03;
    }

    @Override // X.InterfaceC189618ag
    public final boolean CYC() {
        return AbstractC167007dF.A1W(this.mGalleryPickerView.A0B);
    }

    @Override // X.InterfaceC189638ai
    public final void DHl(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, Folder folder) {
        this.mActionBar.setSelectedFolder(folder);
    }

    @Override // X.InterfaceC189638ai
    public final void DJ1(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        this.mActionBar.A02();
    }

    @Override // X.InterfaceC189638ai
    public final void DS2(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, List list, List list2) {
        Tab currentTab = this.mMediaTabHost.getCurrentTab();
        if (!this.A0J && list.isEmpty() && currentTab == AbstractC43884Jap.A00) {
            this.mMediaTabHost.A03(AbstractC43884Jap.A01, false);
        }
        this.A0J = true;
        BaseAdapter baseAdapter = this.mActionBar.A00;
        baseAdapter.getClass();
        C0fA.A00(baseAdapter, 1687863073);
        MX1.A01(getSession()).A0A(true, null);
        this.A0B.A01.A05();
    }

    @Override // X.InterfaceC189668al
    public final void DVn() {
        EnumC44287Jhd enumC44287Jhd;
        long j;
        C195868lW c195868lW;
        MSF msf = this.mCaptureProvider;
        if (msf != null) {
            enumC44287Jhd = ((ViewOnClickListenerC44269JhH) msf).A06;
        } else {
            enumC44287Jhd = EnumC44287Jhd.A04;
        }
        int ordinal = enumC44287Jhd.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                msf.getClass();
                boolean A1O = AbstractC167007dF.A1O((((ViewOnClickListenerC44269JhH) msf).A0e.A06.A01.A00() > 3000.0d ? 1 : (((ViewOnClickListenerC44269JhH) msf).A0e.A06.A01.A00() == 3000.0d ? 0 : -1)));
                MSF msf2 = this.mCaptureProvider;
                if (A1O) {
                    msf2.E6C();
                } else {
                    final ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) msf2;
                    Context context = viewOnClickListenerC44269JhH.getContext();
                    final C5SU c5su = new C5SU((Activity) context, new C149686oL(context.getString(2131976709)));
                    c5su.A03(viewOnClickListenerC44269JhH.A0S);
                    c5su.A07(C5SV.A06);
                    c5su.A02();
                    View rootView = viewOnClickListenerC44269JhH.getRootView();
                    if (rootView != null) {
                        rootView.post(new Runnable() { // from class: X.M3B
                            @Override // java.lang.Runnable
                            public final void run() {
                                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH2 = ViewOnClickListenerC44269JhH.this;
                                C5SW A00 = c5su.A00();
                                viewOnClickListenerC44269JhH2.A07 = A00;
                                A00.A07(viewOnClickListenerC44269JhH2.A0a);
                            }
                        });
                    }
                    ViewOnClickListenerC44269JhH.A06(viewOnClickListenerC44269JhH, true);
                    return;
                }
            } else {
                return;
            }
        } else {
            GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.mGalleryPickerView;
            if (gestureDetectorOnGestureListenerC43829JZs.A0B == null) {
                return;
            }
            AnonymousClass249 mediaType = gestureDetectorOnGestureListenerC43829JZs.getMediaType();
            this.A0C.A0o.clear();
            Iterator it = this.mGalleryPickerView.A1H.iterator();
            while (it.hasNext()) {
                Medium A0P = AbstractC43592JPx.A0P(it);
                if (A0P != null) {
                    this.A0C.A0o.add(A0P);
                }
            }
            if (mediaType != AnonymousClass249.VIDEO && this.A09 != C22P.A37) {
                UserSession session = getSession();
                C1815483h c1815483h = this.A0C;
                boolean A1a = AbstractC167017dG.A1a(session, c1815483h);
                C14360o3.A0B(mediaType, 3);
                int ordinal2 = c1815483h.A01().ordinal();
                int i = -1;
                if (ordinal2 != 0) {
                    if (ordinal2 == A1a && (c195868lW = ((C198308pf) c1815483h.A0n.get(c1815483h.A00)).A03) != null) {
                        i = c195868lW.A0F;
                    }
                } else {
                    C183978Ee c183978Ee = ((C198308pf) c1815483h.A0n.get(c1815483h.A00)).A02;
                    if (c183978Ee != null) {
                        i = c183978Ee.A08;
                    }
                }
                List list = c1815483h.A0o;
                Medium medium = (Medium) AbstractC001800i.A0O(AbstractC31172DnG.A19(list), 0);
                long j2 = 0;
                if (medium != null) {
                    j = medium.A04;
                } else {
                    j = 0;
                }
                Long valueOf = Long.valueOf(j);
                Medium medium2 = (Medium) AbstractC001800i.A0O(AbstractC31172DnG.A19(list), 0);
                if (medium2 != null) {
                    j2 = medium2.A0B;
                }
                List A1J = AbstractC166987dD.A1J(AbstractC16960so.A1Q(valueOf, Long.valueOf(j2)));
                List A19 = AbstractC31172DnG.A19(list);
                ArrayList A0i = AbstractC167007dF.A0i(A19);
                Iterator it2 = A19.iterator();
                while (it2.hasNext()) {
                    Medium A0l = AbstractC166987dD.A0l(it2);
                    A0i.add(AbstractC16960so.A1Q(AbstractC31171DnF.A0V(A0l.A04), AbstractC31171DnF.A0V(A0l.A0B)));
                }
                List A192 = AbstractC31172DnG.A19(list);
                ArrayList A0i2 = AbstractC167007dF.A0i(A192);
                Iterator it3 = A192.iterator();
                while (it3.hasNext()) {
                    AbstractC166997dE.A1X(A0i2, AbstractC166987dD.A0l(it3).A01());
                }
                List A193 = AbstractC31172DnG.A19(list);
                ArrayList A0i3 = AbstractC167007dF.A0i(A193);
                Iterator it4 = A193.iterator();
                while (it4.hasNext()) {
                    A0i3.add(AbstractC166987dD.A0l(it4).A0X);
                }
                C449124v c449124v = AnonymousClass229.A01(session).A0A;
                String str = c1815483h.A0F;
                C14360o3.A07(str);
                c449124v.A0Z(EnumC193318hB.A04, EnumC114925Hg.FEED, mediaType, c1815483h.A09, str, null, A1J, A0i, A0i2, A0i3, i, false);
            }
            this.mGalleryPickerView.A0W(null);
        }
        C50692MZl c50692MZl = this.A02;
        c50692MZl.getClass();
        AnonymousClass841 A00 = c50692MZl.A04.A00();
        Activity activity = c50692MZl.A02;
        C14360o3.A0A(activity);
        AbstractC53891NsN.A00(activity, c50692MZl.A03, A00);
    }

    @Override // X.InterfaceC189618ag
    public final boolean DYa(Folder folder) {
        C19280xC A00 = AbstractC31718DwN.A00(C05F.A06);
        A00.A0C("folder_name", folder.A00());
        Set set = folder.A05;
        A00.A08(Integer.valueOf(set.size()), "folder_size");
        AbstractC31173DnH.A1S(A00, getSession());
        UserSession session = getSession();
        List folders = this.mGalleryPickerView.getFolders();
        C14360o3.A0B(session, 0);
        AbstractC50666MYj.A00(session).A0F(folders);
        int i = folder.A02;
        if (i == -5) {
            File A04 = AbstractC13530mf.A04(requireContext());
            this.A06 = A04;
            A04.getClass();
            LJR.A03(this, A04, 10002);
        } else if (!set.isEmpty()) {
            this.mGalleryPickerView.setCurrentFolderById(i);
            boolean A06 = C18U.A06(C06090Tz.A05, getSession(), 36316645727146553L);
            ViewOnClickListenerC43832JZv viewOnClickListenerC43832JZv = this.mActionBar;
            if (A06) {
                viewOnClickListenerC43832JZv.setSelectedMixedFolder(folder);
                return true;
            }
            viewOnClickListenerC43832JZv.setSelectedFolder(folder);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC189618ag
    public final boolean DYb(C24164Ann c24164Ann) {
        this.mGalleryPickerView.setCurrentRemoteFolder(c24164Ann);
        this.mActionBar.setSelectedMixedFolder(c24164Ann);
        return false;
    }

    @Override // X.InterfaceC189618ag
    public final List getCombinedFolders() {
        return this.mGalleryPickerView.A14.A0C();
    }

    @Override // X.InterfaceC189618ag
    public final C8Z4 getCurrentMixedFolder() {
        return this.mGalleryPickerView.A14.A0B();
    }

    @Override // X.InterfaceC189618ag
    public final List getFolders() {
        return this.mGalleryPickerView.getFolders();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH;
        boolean z = true;
        if (!this.mGalleryPickerView.A0e()) {
            MSF msf = this.mCaptureProvider;
            z = false;
            if (msf != null) {
                if (this.A0H) {
                    this.A0H = false;
                    viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) msf;
                    if (viewOnClickListenerC44269JhH.A06 == EnumC44287Jhd.A02 && viewOnClickListenerC44269JhH.CKp()) {
                        C193328hC A0I = AbstractC31171DnF.A0I(viewOnClickListenerC44269JhH.getContext());
                        A0I.A0A(2131960951);
                        A0I.A09(2131960954);
                        DialogInterfaceOnClickListenerC48023LMs.A01(A0I, viewOnClickListenerC44269JhH, 12, 2131960955);
                        AbstractC31176DnK.A16(new DialogInterfaceOnClickListenerC35301Fha(2), A0I, 2131960956);
                        return true;
                    }
                    if (AbstractC43594JPz.A0Q(viewOnClickListenerC44269JhH.getContext()).CPp()) {
                        return false;
                    }
                } else {
                    viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) msf;
                    if (viewOnClickListenerC44269JhH.A06 == EnumC44287Jhd.A02 && viewOnClickListenerC44269JhH.CKp()) {
                        C44272JhO c44272JhO = viewOnClickListenerC44269JhH.A0e;
                        if (c44272JhO.A01()) {
                            ViewOnClickListenerC44269JhH.A01(viewOnClickListenerC44269JhH);
                            c44272JhO.A06.A00();
                            viewOnClickListenerC44269JhH.A07();
                            return true;
                        }
                        viewOnClickListenerC44269JhH.A08();
                        return true;
                    }
                    if (AbstractC43594JPz.A0Q(viewOnClickListenerC44269JhH.getContext()).CPp()) {
                        return false;
                    }
                }
                UserSession userSession = viewOnClickListenerC44269JhH.A0e.A04;
                C25A.A00(userSession).A0C(EnumC40111tc.A0a, C16910sj.A00);
                AnonymousClass257.A00(userSession).A04();
                return false;
            }
        }
        return z;
    }

    @Override // X.InterfaceC189618ag
    public final void CwJ(View view, InterfaceC195648l5 interfaceC195648l5) {
        InterfaceC09390do interfaceC09390do;
        UserSession session = getSession();
        List folders = this.mGalleryPickerView.getFolders();
        C14360o3.A0B(session, 0);
        AbstractC50666MYj.A00(session).A0G(folders);
        if (C18U.A06(C06090Tz.A05, getSession(), 36316645727146553L)) {
            UserSession session2 = getSession();
            C14360o3.A0B(session2, 0);
            AbstractC208329Jr.A09(this, session2, "album_picker_tap", "posts", null);
        }
        C9KS c9ks = new C9KS(requireContext(), this, getSession());
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.mGalleryPickerView;
        c9ks.A00 = gestureDetectorOnGestureListenerC43829JZs;
        C43830JZt c43830JZt = gestureDetectorOnGestureListenerC43829JZs.A14;
        if (C43830JZt.A09(c43830JZt, c43830JZt.A0I)) {
            interfaceC09390do = c9ks.A04;
            ((C47809L9r) interfaceC09390do.getValue()).A04.A00 = true;
        } else {
            if (AbstractC226319yo.A00(getSession(), C128535rM.A00)) {
                c9ks.A00(view, interfaceC195648l5, false);
                return;
            }
            interfaceC09390do = c9ks.A04;
        }
        ((C47809L9r) interfaceC09390do.getValue()).A02(c9ks);
    }

    @Override // X.InterfaceC189638ai
    public final void DEP(Exception exc) {
        MX1.A01(getSession()).A0A(false, exc.getMessage());
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && (i2 == 9683 || i2 == 9685)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                UserSession session = getSession();
                C1815483h c1815483h = this.A0C;
                AbstractC167017dG.A1R(session, c1815483h);
                if (i2 == 9683) {
                    AbstractC50666MYj.A00(session).A0A(AnonymousClass249.VIDEO, c1815483h.A09, C16930sl.A00);
                }
                activity.setResult(i2, intent);
                activity.finish();
                return;
            }
            return;
        }
        if (i2 != -1 || i != 10002) {
            return;
        }
        intent.getClass();
        File file = this.A06;
        file.getClass();
        ((InterfaceC50446MPa) requireActivity()).Cqo(LJR.A01(intent, file));
    }

    @Override // X.InterfaceC189668al
    public final void onCancel() {
        AbstractC50666MYj.A00(getSession());
        this.A0H = true;
        ((Activity) requireContext()).onBackPressed();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.2fr, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(679246545);
        super.onCreate(bundle);
        UserSession session = getSession();
        C43833JZw c43833JZw = new C43833JZw(session);
        this.A0B = c43833JZw;
        c43833JZw.A0Q(requireContext(), C55772hI.A00(session), this);
        SharedPreferences preferences = requireActivity().getPreferences(0);
        preferences.getClass();
        this.A0D = new C17320tT(preferences, "MediaCaptureFragment");
        this.A03 = new C44265JhC(requireActivity(), this);
        AnonymousClass840 Ak4 = ((InterfaceC189608af) requireContext()).Ak4();
        this.A04 = Ak4;
        if (Ak4.A00().AGq() == EnumC69983Ch.A02 && AbstractC43840Ja3.A00(session)) {
            setDayNightMode(EnumC60792q3.A03);
        }
        Bundle A0B = AbstractC31177DnL.A0B(this);
        this.A07 = A0B.getBoolean("standalone_mode", false);
        String A00 = MSV.A00(672);
        if (A0B.get(A00) instanceof C22P) {
            this.A09 = (C22P) A0B.get(A00);
        }
        if (bundle == null) {
            int intExtra = requireActivity().getIntent().getIntExtra("mediaCaptureTab", -1);
            if (intExtra >= 0 && !this.A07) {
                this.A0A = AbstractC43884Jap.A00(intExtra);
            }
            this.A0G = requireActivity().getIntent().getStringExtra("META_GALLERY_ALBUM_TYPE");
        }
        this.A0I = AbstractC13620mo.A02(requireContext());
        C27961Xa A002 = AbstractC54912fq.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0g;
        AbstractC54912fq.A00();
        this.A0E = A002.A02(this, this, session, new Object().A00(), quickPromotionSlot);
        C6WI.A01();
        if (C6WI.A01().A0A != null) {
            this.A0F = new L0T(requireContext());
        }
        this.A0C = new C1815483h(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, true, false, false, false, false);
        this.A01 = AbstractC166997dE.A0i(C06090Tz.A06, getSession(), 36609987698497535L).intValue();
        C0f9.A09(-1004418587, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(810733209);
        Context requireContext = requireContext();
        this.mMediaTabHost = new GestureDetectorOnGestureListenerC44266JhD(requireContext);
        this.A0B.A01.A04();
        Context themedContext = getThemedContext();
        boolean z = this.A07;
        String str = this.A0G;
        int i = this.A01;
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = new GestureDetectorOnGestureListenerC43829JZs(themedContext, this.A09, this, getSession(), this, this.A04, str, i, z);
        this.mGalleryPickerView = gestureDetectorOnGestureListenerC43829JZs;
        AnonymousClass840 anonymousClass840 = this.A04;
        if (anonymousClass840.A00().CPp() || (this.A07 && AbstractC43593JPy.A0R(anonymousClass840).A0J)) {
            gestureDetectorOnGestureListenerC43829JZs.A0Z(null, AbstractC43847JaB.A00(getSession()).A03, -1);
        } else {
            gestureDetectorOnGestureListenerC43829JZs.setCurrentFolderByIdAndSelectFirstItem(-1);
        }
        this.mGalleryPickerView.setId(R.id.gallery_picker_view);
        this.mGalleryPickerView.setTopOffset(C3HB.A00(requireContext()));
        this.mGalleryPickerView.A06 = this.mMediaTabHost.getTabHeight();
        this.A08 = AbstractC167007dF.A1X(AbstractC43841Ja4.A01(requireContext()), C05F.A0N);
        View inflate = layoutInflater.inflate(R.layout.delete_clip_button, (ViewGroup) this.mMediaTabHost, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, 0);
        inflate.setLayoutParams(layoutParams);
        if (this.A08) {
            ((ViewGroup.LayoutParams) layoutParams).height = C3HB.A00(requireContext());
            layoutParams.gravity = 49;
            AbstractC13880nE.A0Y(inflate, AbstractC166987dD.A0C(requireContext(), 2));
        } else {
            ((ViewGroup.LayoutParams) layoutParams).height = this.mMediaTabHost.getTabHeight();
            layoutParams.gravity = 81;
        }
        ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = new ViewOnClickListenerC44269JhH(requireContext, this.A0B.A00);
        viewOnClickListenerC44269JhH.setDeleteClipButton(inflate, new C44290Jhg(1, inflate, this));
        this.mCaptureView = viewOnClickListenerC44269JhH;
        this.mCaptureProvider = viewOnClickListenerC44269JhH;
        viewOnClickListenerC44269JhH.A04 = this;
        viewOnClickListenerC44269JhH.A05 = (InterfaceC50446MPa) requireActivity();
        ViewOnClickListenerC43832JZv viewOnClickListenerC43832JZv = new ViewOnClickListenerC43832JZv(getThemedContext(), getSession(), false, false, AbstractC167007dF.A1X(this.A04.A00().AGq(), EnumC69983Ch.A05));
        this.mActionBar = viewOnClickListenerC43832JZv;
        if (this.A07) {
            viewOnClickListenerC43832JZv.A01();
        }
        this.mActionBar.setBaseDelegate(this);
        this.mActionBar.setGalleryDelegate(this, this.mGalleryPickerView);
        this.mActionBar.setFeedCaptureDelegate(this);
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD = this.mMediaTabHost;
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs2 = this.mGalleryPickerView;
        C14360o3.A0B(gestureDetectorOnGestureListenerC43829JZs2, 0);
        gestureDetectorOnGestureListenerC44266JhD.A0L.add(gestureDetectorOnGestureListenerC43829JZs2);
        Tab currentTab = gestureDetectorOnGestureListenerC44266JhD.getCurrentTab();
        gestureDetectorOnGestureListenerC43829JZs2.Drk(currentTab, currentTab);
        MediaCaptureConfig mediaCaptureConfig = AbstractC43593JPy.A0R(this.A04).A09;
        if (mediaCaptureConfig != null && mediaCaptureConfig.A06) {
            this.mMediaTabHost.addView(this.mGalleryPickerView, 0);
        }
        MSF msf = this.mCaptureProvider;
        if (msf != null) {
            GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD2 = this.mMediaTabHost;
            gestureDetectorOnGestureListenerC44266JhD2.A0L.add(msf);
            Tab currentTab2 = gestureDetectorOnGestureListenerC44266JhD2.getCurrentTab();
            msf.Drk(currentTab2, currentTab2);
        }
        this.mMediaTabHost.addView(this.mCaptureView, 1);
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD3 = this.mMediaTabHost;
        ViewOnClickListenerC43832JZv viewOnClickListenerC43832JZv2 = this.mActionBar;
        C14360o3.A0B(viewOnClickListenerC43832JZv2, 0);
        gestureDetectorOnGestureListenerC44266JhD3.A0L.add(viewOnClickListenerC43832JZv2);
        viewOnClickListenerC43832JZv2.A01 = gestureDetectorOnGestureListenerC44266JhD3.getCurrentTab();
        this.mMediaTabHost.addView(this.mActionBar, 2);
        this.mMediaTabHost.addView(inflate, 3);
        View inflate2 = layoutInflater.inflate(R.layout.action_bar_shadow, (ViewGroup) this.mMediaTabHost, false);
        this.mActionBarShadow = inflate2;
        this.mMediaTabHost.addView(inflate2);
        this.mMediaTabHost.setThemeBackground(getThemedContext());
        C44279JhV c44279JhV = new C44279JhV(this);
        ArrayList A1E = AbstractC166987dD.A1E();
        MediaCaptureConfig mediaCaptureConfig2 = AbstractC43593JPy.A0R(this.A04).A09;
        if (mediaCaptureConfig2 != null && mediaCaptureConfig2.A06) {
            A1E.add(AbstractC43884Jap.A00);
        }
        MediaCaptureConfig mediaCaptureConfig3 = AbstractC43593JPy.A0R(this.A04).A09;
        if (mediaCaptureConfig3 != null && mediaCaptureConfig3.A09) {
            A1E.add(AbstractC43884Jap.A01);
        }
        MediaCaptureConfig mediaCaptureConfig4 = AbstractC43593JPy.A0R(this.A04).A09;
        if (mediaCaptureConfig4 != null && mediaCaptureConfig4.A0A) {
            A1E.add(AbstractC43884Jap.A02);
        }
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD4 = this.mMediaTabHost;
        gestureDetectorOnGestureListenerC44266JhD4.A0I.setTabs(A1E, new ViewOnClickListenerC48064LPp(gestureDetectorOnGestureListenerC44266JhD4, 56));
        Stream stream = A1E.stream();
        final C44281JhX c44281JhX = C44281JhX.A00;
        gestureDetectorOnGestureListenerC44266JhD4.A01 = stream.mapToInt(new ToIntFunction(c44281JhX) { // from class: X.JhW
            public final /* synthetic */ InterfaceC16660sJ A00;

            {
                C14360o3.A0B(c44281JhX, 1);
                this.A00 = c44281JhX;
            }

            @Override // java.util.function.ToIntFunction
            public final /* synthetic */ int applyAsInt(Object obj) {
                return AbstractC166987dD.A0H(this.A00.invoke(obj));
            }
        }).min().orElse(0);
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD5 = this.mMediaTabHost;
        boolean A1S = AbstractC25230BEn.A1S(A1E.size(), 1);
        gestureDetectorOnGestureListenerC44266JhD5.A05 = A1S;
        gestureDetectorOnGestureListenerC44266JhD5.A0I.setVisibility(AbstractC167007dF.A05(A1S ? 1 : 0));
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD6 = this.mMediaTabHost;
        gestureDetectorOnGestureListenerC44266JhD6.A0L.add(c44279JhV);
        gestureDetectorOnGestureListenerC44266JhD6.getCurrentTab();
        this.mGalleryPickerView.A0H = this;
        this.A00 = 0.0f;
        AbstractC25651Mw.A00(getSession()).A01(this.A0K, C44316Ji7.class);
        this.A0E.DiZ();
        InterfaceC19630xq interfaceC19630xq = this.A0D;
        C14360o3.A0B(interfaceC19630xq, 0);
        Tab A00 = AbstractC43884Jap.A00(interfaceC19630xq.getInt("__CAPTURE_TAB_V2__", 0));
        interfaceC19630xq.getInt("__CAMERA_FACING__", 0);
        Tab tab = this.A0A;
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD7 = this.mMediaTabHost;
        if (tab == null) {
            gestureDetectorOnGestureListenerC44266JhD7.A03(A00, false);
        } else {
            gestureDetectorOnGestureListenerC44266JhD7.A03(tab, false);
            A00();
        }
        GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD8 = this.mMediaTabHost;
        C0f9.A09(-2134920274, A02);
        return gestureDetectorOnGestureListenerC44266JhD8;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1748398873);
        super.onDestroy();
        this.A02 = null;
        FA7.A00(getSession()).A03(EnumC33422Ept.A07, "edit_profile_picture_cancel");
        C0f9.A09(-68504693, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1138467989);
        super.onDestroyView();
        AbstractC25651Mw.A00(getSession()).A02(this.A0K, C44316Ji7.class);
        this.mGalleryPickerView.A0H = null;
        this.mMediaTabHost.A0L.clear();
        ViewOnClickListenerC43832JZv viewOnClickListenerC43832JZv = this.mActionBar;
        viewOnClickListenerC43832JZv.A02 = null;
        viewOnClickListenerC43832JZv.setGalleryDelegate(null, null);
        this.mActionBar.A03 = null;
        MSF msf = this.mCaptureProvider;
        if (msf != null) {
            ((ViewOnClickListenerC44269JhH) msf).A04 = null;
        }
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setBackgroundDrawableResource(AbstractC53242c7.A0D(requireContext()));
        MediaCaptureFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(695626853, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2027390713);
        super.onPause();
        A00();
        C1VW c1vw = C1VW.A00;
        c1vw.getClass();
        UserSession session = getSession();
        C50692MZl c50692MZl = this.A02;
        c50692MZl.getClass();
        c1vw.removeLocationUpdates(session, c50692MZl);
        C1VW.A00.cancelSignalPackageRequest(getSession(), this.A02);
        this.A0L.removeMessages(1);
        C44265JhC c44265JhC = this.A03;
        if (c44265JhC.A06 == null) {
            C0K8.A0D("PreciseOrientationEventListener", "Cannot detect sensors. Invalid disable");
        } else if (c44265JhC.A05) {
            C0fX.A00(c44265JhC.A04, c44265JhC.A07);
            c44265JhC.A05 = false;
        }
        this.mGalleryPickerView.A0U();
        MSF msf = this.mCaptureProvider;
        if (msf != null) {
            ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) msf;
            viewOnClickListenerC44269JhH.A0Y.A0C();
            if (viewOnClickListenerC44269JhH.A0H) {
                viewOnClickListenerC44269JhH.A0H = false;
                viewOnClickListenerC44269JhH.A0B();
            }
            viewOnClickListenerC44269JhH.A0C = false;
            Dialog dialog = viewOnClickListenerC44269JhH.A02;
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
            ViewOnClickListenerC44269JhH.A06(viewOnClickListenerC44269JhH, false);
            C55982hj c55982hj = viewOnClickListenerC44269JhH.A0W;
            c55982hj.A08(c55982hj.A01, true);
            AbstractC25651Mw.A00(viewOnClickListenerC44269JhH.A0a).A02(viewOnClickListenerC44269JhH.A0Z, C56024Otv.class);
        }
        C0f9.A09(-2049000454, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(396772774);
        super.onResume();
        InterfaceC19630xq interfaceC19630xq = this.A0D;
        C14360o3.A0B(interfaceC19630xq, 0);
        Tab tab = AbstractC43884Jap.A00;
        Tab A00 = AbstractC43884Jap.A00(interfaceC19630xq.getInt("__CAPTURE_TAB_V2__", 0));
        int i = interfaceC19630xq.getInt("__CAMERA_FACING__", 0);
        Integer valueOf = Integer.valueOf(i);
        Window A0H = AbstractC31174DnI.A0H(this);
        A0H.getClass();
        A0H.setBackgroundDrawable(new ColorDrawable(AbstractC31173DnH.A03(requireContext(), requireContext(), R.attr.igds_color_secondary_background)));
        if (!this.A07) {
            AbstractC43593JPy.A0R(this.A04).A0P.clear();
        }
        this.A02 = new C50692MZl(requireActivity(), getSession(), this.A03, this.A04);
        C1VW c1vw = C1VW.A00;
        c1vw.getClass();
        c1vw.requestLocationUpdates(getSession(), this.A02, "MediaCaptureFragment");
        C43833JZw c43833JZw = this.A0B;
        if (tab.equals(A00)) {
            C69613Av c69613Av = c43833JZw.A01;
            c43833JZw.A07.add(c69613Av);
            c43833JZw.A06.add(c69613Av);
            str = "gallery";
        } else {
            C69613Av c69613Av2 = c43833JZw.A00;
            c43833JZw.A07.add(c69613Av2);
            c43833JZw.A06.add(c69613Av2);
            str = "camera";
        }
        c43833JZw.A0J(DatePickerDialogModule.ARG_MODE, str);
        this.A0L.sendEmptyMessage(1);
        this.mGalleryPickerView.A0V();
        MSF msf = this.mCaptureProvider;
        if (msf != null) {
            int i2 = 0;
            if (valueOf != null) {
                i2 = i;
            }
            msf.setInitialCameraFacing(i2);
            ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) msf;
            C006802i.A0p.markerStart(android.R.xml.autotext);
            if (AbstractC23451Ch.A07(viewOnClickListenerC44269JhH.getContext(), "android.permission.CAMERA")) {
                ViewOnClickListenerC44269JhH.A02(viewOnClickListenerC44269JhH);
            } else {
                ViewOnClickListenerC44269JhH.A05(viewOnClickListenerC44269JhH);
            }
            AbstractC25651Mw.A00(viewOnClickListenerC44269JhH.A0a).A01(viewOnClickListenerC44269JhH.A0Z, C56024Otv.class);
        }
        C196188m9 c196188m9 = this.A05;
        if (c196188m9 == null) {
            c196188m9 = new C196188m9(getSession());
            this.A05 = c196188m9;
        }
        c196188m9.A06("feed_composer_prefetch", false);
        UserSession session = getSession();
        C131975xX c131975xX = C131965xW.A05;
        C131975xX.A00(session).A08(null);
        C0f9.A09(1797210174, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(651514294);
        super.onStart();
        UserSession session = getSession();
        C1815483h c1815483h = this.A0C;
        AbstractC167017dG.A1N(session, c1815483h);
        AnonymousClass229.A01(session).A1u(c1815483h.A05());
        C0f9.A09(218041820, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(2018108677);
        super.onStop();
        UserSession session = getSession();
        C14360o3.A0B(session, 0);
        AnonymousClass229.A01(session).A0Z();
        C0f9.A09(-1460515552, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        L0T l0t = this.A0F;
        if (l0t != null && !l0t.A00) {
            C193328hC A0I = AbstractC31171DnF.A0I(l0t.A01);
            A0I.A0A(2131953233);
            A0I.A09(2131953232);
            A0I.A07();
            AbstractC166987dD.A1W(A0I);
            l0t.A00 = true;
        }
    }
}
