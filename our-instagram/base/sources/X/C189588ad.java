package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.mediapicker.Folder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189588ad extends AbstractC59962oe implements InterfaceC189598ae, InterfaceC189608af, InterfaceC60072op, InterfaceC189618ag, InterfaceC189628ah, InterfaceC189638ai, InterfaceC189648aj, InterfaceC127465pP, InterfaceC189658ak, InterfaceC189668al, InterfaceC189678am {
    public static final String __redex_internal_original_name = "GalleryPickerFragment";
    public C95394Qz A02;
    public MXB A03;
    public AbstractC193818i2 A04;
    public BB6 A05;
    public GestureDetectorOnGestureListenerC43829JZs A06;
    public MXA A07;
    public ViewOnClickListenerC43832JZv A08;
    public InterfaceC25179BCc A09;
    public AnonymousClass840 A0A;
    public C40121td A0B;
    public BBG A0C;
    public File A0D;
    public AtomicInteger A0E;
    public boolean A0F;
    public C43833JZw A0G;
    public C64842wi A0H;
    public boolean A0I;
    public final InterfaceC09390do A0J;
    public final String A0L;
    public final InterfaceC09390do A0M;
    public C22P A01 = C22P.A5N;
    public int A00 = 10;
    public final InterfaceC41501vz A0K = new InterfaceC41501vz() { // from class: X.9KT
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(1364505959);
            C44316Ji7 c44316Ji7 = (C44316Ji7) obj;
            int A032 = C0f9.A03(-178038943);
            C14360o3.A0B(c44316Ji7, 0);
            if (c44316Ji7.A01) {
                C189588ad c189588ad = C189588ad.this;
                boolean z = c189588ad.A0F;
                if (z && c44316Ji7.A00 < 2) {
                    ViewOnClickListenerC43832JZv viewOnClickListenerC43832JZv = c189588ad.A08;
                    if (viewOnClickListenerC43832JZv != null) {
                        viewOnClickListenerC43832JZv.setNextEnabledWithColor(false);
                    }
                    C14360o3.A0F("actionBar");
                    throw C00O.createAndThrow();
                }
                if (c44316Ji7.A00 == c189588ad.A00 && !z) {
                    C9GR.A09(c189588ad.getContext(), AbstractC166997dE.A0r(AbstractC166997dE.A0N(c189588ad), Integer.valueOf(c189588ad.A00), 2131973246));
                } else {
                    ViewOnClickListenerC43832JZv viewOnClickListenerC43832JZv2 = c189588ad.A08;
                    if (viewOnClickListenerC43832JZv2 != null) {
                        viewOnClickListenerC43832JZv2.setNextEnabledWithColor(true);
                    }
                    C14360o3.A0F("actionBar");
                    throw C00O.createAndThrow();
                }
            }
            C0f9.A0A(844540498, A032);
            C0f9.A0A(-1830962616, A03);
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r1 != false) goto L18;
     */
    @Override // X.InterfaceC189618ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CwJ(android.view.View r6, X.InterfaceC195648l5 r7) {
        /*
            r5 = this;
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.MZu r1 = X.AbstractC50666MYj.A00(r0)
            java.util.List r0 = r5.getFolders()
            r1.A0G(r0)
            com.instagram.common.session.UserSession r2 = r5.getSession()
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36316645727146553(0x8105cc00001239, double:3.0301312210175984E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 == 0) goto L34
            com.instagram.common.session.UserSession r3 = r5.getSession()
            java.lang.String r2 = "posts"
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            java.lang.String r1 = "album_picker_tap"
            r0 = 0
            X.AbstractC208329Jr.A09(r5, r3, r1, r2, r0)
        L34:
            X.8i2 r3 = r5.A04
            com.instagram.common.session.UserSession r1 = r5.getSession()
            X.5rM r0 = X.C128535rM.A00
            boolean r0 = X.AbstractC226319yo.A00(r1, r0)
            if (r0 == 0) goto L84
            if (r3 == 0) goto L70
            com.instagram.creation.base.CreationSession r0 = r5.Asi()
            boolean r0 = r0.A0M
            if (r0 != 0) goto L50
            boolean r0 = r5.A0F
            if (r0 == 0) goto L5f
        L50:
            com.instagram.common.session.UserSession r2 = r5.getSession()
            r0 = 36328736060161787(0x8110cb00013efb, double:3.037777196300296E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)
            if (r0 != 0) goto L6a
        L5f:
            X.JZs r0 = r5.A06
            if (r0 == 0) goto L92
            boolean r1 = r0.A0b()
            r0 = 0
            if (r1 == 0) goto L6b
        L6a:
            r0 = 1
        L6b:
            r0 = r0 ^ 1
            r3.A00(r6, r7, r0)
        L70:
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.22C r1 = X.AnonymousClass229.A01(r0)
            X.JZs r0 = r5.A06
            if (r0 == 0) goto L92
            java.util.List r0 = r0.getFolders()
            r1.A23(r0)
            return
        L84:
            if (r3 == 0) goto L70
            X.0do r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.L9r r0 = (X.C47809L9r) r0
            r0.A02(r3)
            goto L70
        L92:
            java.lang.String r0 = "galleryPickerView"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189588ad.CwJ(android.view.View, X.8l5):void");
    }

    @Override // X.InterfaceC127465pP
    public final void DEF(Exception exc) {
    }

    @Override // X.InterfaceC189638ai
    public final void DEP(Exception exc) {
        MX1.A01(getSession()).A0A(false, exc.getMessage());
    }

    @Override // X.InterfaceC189638ai
    public final void DJ0(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, float f) {
    }

    @Override // X.InterfaceC189658ak
    public final void DTe(C8Z4 c8z4) {
        C14360o3.A0B(c8z4, 0);
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            C14360o3.A0F("galleryPickerView");
            throw C00O.createAndThrow();
        }
        gestureDetectorOnGestureListenerC43829JZs.DTe(c8z4);
    }

    @Override // X.InterfaceC189618ag
    public final boolean DYa(Folder folder) {
        C14360o3.A0B(folder, 0);
        C19280xC A00 = AbstractC31718DwN.A00(C05F.A06);
        A00.A0C("folder_name", folder.A00());
        java.util.Set set = folder.A05;
        A00.A08(Integer.valueOf(set.size()), "folder_size");
        AbstractC11060iN.A00(getSession()).EHW(A00);
        AbstractC50666MYj.A00(getSession()).A0F(getFolders());
        int i = folder.A02;
        if (i == -5) {
            Context context = getContext();
            if (context != null) {
                File A04 = AbstractC13530mf.A04(context);
                this.A0D = A04;
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    LJR.A02(activity, A04, 10002);
                }
            }
        } else if (!set.isEmpty()) {
            GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
            if (gestureDetectorOnGestureListenerC43829JZs == null) {
                C14360o3.A0F("galleryPickerView");
                throw C00O.createAndThrow();
            }
            gestureDetectorOnGestureListenerC43829JZs.setCurrentFolderById(i);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC189618ag
    public final boolean DYb(C24164Ann c24164Ann) {
        C14360o3.A0B(c24164Ann, 0);
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            C14360o3.A0F("galleryPickerView");
            throw C00O.createAndThrow();
        }
        gestureDetectorOnGestureListenerC43829JZs.setCurrentRemoteFolder(c24164Ann);
        return false;
    }

    @Override // X.InterfaceC189618ag
    public final boolean Ei6() {
        return true;
    }

    @Override // X.InterfaceC189678am
    public final /* synthetic */ void EnO(C47Z c47z) {
    }

    @Override // X.InterfaceC189678am
    public final /* synthetic */ void FDD(C47Z c47z) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A06 != null) {
            Configuration configuration2 = requireContext().getResources().getConfiguration();
            C14360o3.A07(configuration2);
            if (AbstractC68606VXh.A00(configuration2, configuration)) {
                GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
                if (gestureDetectorOnGestureListenerC43829JZs == null) {
                    C14360o3.A0F("galleryPickerView");
                    throw C00O.createAndThrow();
                }
                gestureDetectorOnGestureListenerC43829JZs.onConfigurationChanged(configuration);
            }
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        PendingRecipient pendingRecipient = (PendingRecipient) requireArguments().getParcelable("ARG_TARGET_GROUP_PROFILE");
        if (pendingRecipient == null || !pendingRecipient.A0Y) {
            C23031Ai A00 = AbstractC23021Ah.A00(getSession());
            InterfaceC16530ry interfaceC16530ry = A00.A0j;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[169])).booleanValue()) {
                UserSession session = getSession();
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, session, 36316065908068290L) && C18U.A06(c06090Tz, getSession(), 36316065907675069L) && OOI.A01(getSession())) {
                    C193328hC c193328hC = new C193328hC(requireContext());
                    c193328hC.A0j(requireContext().getDrawable(R.drawable.instagram_icons_exceptions_close_friends_filled_56));
                    c193328hC.A0A(2131966113);
                    c193328hC.A09(2131966112);
                    c193328hC.A07();
                    c193328hC.A0H(new DialogInterfaceOnClickListenerC23144ANj(this), 2131965052);
                    C0fJ.A00(c193328hC.A02());
                    C23031Ai A002 = AbstractC23021Ah.A00(getSession());
                    A002.A0j.Egi(A002, true, c0yrArr[169]);
                }
            }
        }
        UserSession session2 = getSession();
        C14360o3.A0B(session2, 0);
        if (C18U.A06(C06090Tz.A05, session2, 36323693768682997L)) {
            InterfaceC171787l8 interfaceC171787l8 = new InterfaceC171787l8() { // from class: X.9KY
                @Override // X.InterfaceC171787l8
                public final /* synthetic */ void D0E() {
                }

                @Override // X.InterfaceC171787l8
                public final /* synthetic */ void Ekt(EnumC168447fe enumC168447fe) {
                }

                @Override // X.InterfaceC171787l8
                public final void Czv() {
                    C189588ad c189588ad = C189588ad.this;
                    UserSession session3 = c189588ad.getSession();
                    if (C18U.A06(AbstractC166997dE.A0U(session3), session3, 36323693768748534L)) {
                        c189588ad.requireActivity().onBackPressed();
                    }
                }
            };
            C0eR c0eR = this.mLifecycleRegistry;
            C14360o3.A07(c0eR);
            Integer num = C05F.A0Y;
            UserSession session3 = getSession();
            C18920wW A02 = AbstractC12220kQ.A02(getSession());
            FragmentActivity requireActivity = requireActivity();
            C14360o3.A0B(session3, 2);
            C57312k6 A003 = AbstractC57302k5.A00(c0eR);
            C9DS c9ds = new C9DS(interfaceC171787l8, A02, session3, num, requireActivity, (InterfaceC23621Ds) null, 13);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9ds, A003);
        }
    }

    public static final AnonymousClass841 A00(C189588ad c189588ad) {
        AnonymousClass840 anonymousClass840 = c189588ad.A0A;
        if (anonymousClass840 == null) {
            C14360o3.A0F("_cameraSession");
            throw C00O.createAndThrow();
        }
        AnonymousClass841 anonymousClass841 = anonymousClass840.A00;
        if (anonymousClass841 != null) {
            return anonymousClass841;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        return (UserSession) this.A0M.getValue();
    }

    @Override // X.InterfaceC189608af
    public final AnonymousClass840 Ak4() {
        AnonymousClass840 anonymousClass840 = this.A0A;
        if (anonymousClass840 == null) {
            C14360o3.A0F("_cameraSession");
            throw C00O.createAndThrow();
        }
        return anonymousClass840;
    }

    @Override // X.InterfaceC189618ag
    public final C43848JaC B7B() {
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            C14360o3.A0F("galleryPickerView");
            throw C00O.createAndThrow();
        }
        return gestureDetectorOnGestureListenerC43829JZs.A11;
    }

    @Override // X.InterfaceC189618ag
    public final EnumC58132lV B7C() {
        return EnumC58132lV.A02;
    }

    @Override // X.InterfaceC189618ag
    public final boolean CYC() {
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            C14360o3.A0F("galleryPickerView");
            throw C00O.createAndThrow();
        }
        if (gestureDetectorOnGestureListenerC43829JZs.A0B == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189638ai
    public final void DHl(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, Folder folder) {
        ViewOnClickListenerC43832JZv viewOnClickListenerC43832JZv = this.A08;
        if (viewOnClickListenerC43832JZv == null) {
            C14360o3.A0F("actionBar");
            throw C00O.createAndThrow();
        }
        viewOnClickListenerC43832JZv.setSelectedFolder(folder);
    }

    @Override // X.InterfaceC189638ai
    public final void DJ1(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        ViewOnClickListenerC43832JZv viewOnClickListenerC43832JZv = this.A08;
        if (viewOnClickListenerC43832JZv == null) {
            C14360o3.A0F("actionBar");
            throw C00O.createAndThrow();
        }
        viewOnClickListenerC43832JZv.A02();
    }

    @Override // X.InterfaceC189638ai
    public final void DS2(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, List list, List list2) {
        String str;
        ViewOnClickListenerC43832JZv viewOnClickListenerC43832JZv = this.A08;
        if (viewOnClickListenerC43832JZv == null) {
            str = "actionBar";
        } else {
            BaseAdapter baseAdapter = viewOnClickListenerC43832JZv.A00;
            baseAdapter.getClass();
            C0fA.A00(baseAdapter, 1687863073);
            MX1.A01(getSession()).A0A(true, null);
            C43833JZw c43833JZw = this.A0G;
            if (c43833JZw == null) {
                str = "feedCaptureNavigationLogger";
            } else {
                c43833JZw.A01.A05();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189668al
    public final void DVn() {
        String str = "galleryPickerView";
        if (this.A0I) {
            GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
            if (gestureDetectorOnGestureListenerC43829JZs != null) {
                ArrayList arrayList = new ArrayList(gestureDetectorOnGestureListenerC43829JZs.A14.A0D.ANA());
                if (arrayList.size() == 1 && ((GalleryItem) arrayList.get(0)).A06()) {
                    C146106i8 c146106i8 = new C146106i8();
                    c146106i8.A0D = requireContext().getString(2131971429);
                    c146106i8.A0I = requireContext().getString(2131971428);
                    c146106i8.A01();
                    String string = requireContext().getString(2131968948);
                    C14360o3.A07(string);
                    c146106i8.A0G = string;
                    c146106i8.A0A(new C23954Ajo());
                    c146106i8.A06();
                    c146106i8.A0O = true;
                    C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs2 = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs2 != null) {
            if (gestureDetectorOnGestureListenerC43829JZs2.A0B == null) {
                return;
            }
            gestureDetectorOnGestureListenerC43829JZs2.A0W(null);
            AnonymousClass840 anonymousClass840 = this.A0A;
            if (anonymousClass840 == null) {
                str = "_cameraSession";
            } else {
                AbstractC53891NsN.A00(requireActivity(), getSession(), anonymousClass840.A00());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189648aj
    public final void ELe(boolean z) {
        C95394Qz c95394Qz = this.A02;
        String str = "stopwatch";
        if (c95394Qz != null) {
            if (c95394Qz.A02) {
                c95394Qz.A01();
            }
            c95394Qz.A02();
            UserSession session = getSession();
            MXB mxb = this.A03;
            if (mxb == null) {
                str = "dialogHelper";
            } else {
                C14360o3.A0B(session, 0);
                mxb.A0A(null, C05F.A0D);
                GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
                if (gestureDetectorOnGestureListenerC43829JZs == null) {
                    str = "galleryPickerView";
                } else {
                    gestureDetectorOnGestureListenerC43829JZs.A0W(new A5B(this));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189618ag
    public final List getCombinedFolders() {
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            C14360o3.A0F("galleryPickerView");
            throw C00O.createAndThrow();
        }
        return gestureDetectorOnGestureListenerC43829JZs.A14.A0C();
    }

    @Override // X.InterfaceC189618ag
    public final C8Z4 getCurrentMixedFolder() {
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            C14360o3.A0F("galleryPickerView");
            throw C00O.createAndThrow();
        }
        return gestureDetectorOnGestureListenerC43829JZs.A14.A0B();
    }

    @Override // X.InterfaceC189618ag
    public final List getFolders() {
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            C14360o3.A0F("galleryPickerView");
            throw C00O.createAndThrow();
        }
        return gestureDetectorOnGestureListenerC43829JZs.getFolders();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0L;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            return false;
        }
        String str = "galleryPickerView";
        if (gestureDetectorOnGestureListenerC43829JZs.getSelectedMediaCount() >= 2) {
            UserSession session = getSession();
            C14360o3.A0B(session, 0);
            if (C18U.A06(C06090Tz.A05, session, 36321507630392854L)) {
                MXB mxb = this.A03;
                if (mxb == null) {
                    str = "dialogHelper";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return mxb.A0A(null, C05F.A0B);
            }
        }
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs2 = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs2 != null) {
            return gestureDetectorOnGestureListenerC43829JZs2.A0e();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC127465pP
    public final void onLocationChanged(Location location) {
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            c1vw.removeLocationUpdates(getSession(), this);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C189588ad() {
        C9E0 c9e0 = new C9E0(this, 31);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E0(new C9E0(this, 32), 33));
        this.A0J = new C60842q8(new C9E0(A00, 34), c9e0, new C9F5(5, null, A00), new C0YZ(ClipsCreationDraftViewModel.class));
        this.A0M = AbstractC60492pY.A02(this);
        this.A0L = "gallery_picker";
    }

    public static final void A01(C189588ad c189588ad) {
        UserSession session = c189588ad.getSession();
        C95394Qz c95394Qz = c189588ad.A02;
        if (c95394Qz == null) {
            C14360o3.A0F("stopwatch");
            throw C00O.createAndThrow();
        }
        AbstractC55109ObQ.A02(c95394Qz, session, C05F.A0N, new MHQ(c189588ad, 40));
    }

    @Override // X.InterfaceC189598ae
    public final void AIe() {
        AnonymousClass257.A00(getSession()).A04();
    }

    @Override // X.InterfaceC189628ah
    public final CreationSession Asi() {
        return ((MX5) A00(this)).A01;
    }

    @Override // X.InterfaceC189598ae
    public final C47Z BcC(String str) {
        return C25A.A00(getSession()).A03(str);
    }

    @Override // X.InterfaceC189628ah
    public final UserSession CE4() {
        return getSession();
    }

    @Override // X.InterfaceC189598ae
    public final void EDa(Runnable runnable) {
        AnonymousClass257.A00(getSession()).A06(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r7 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 9
            if (r6 != r0) goto L32
            r0 = 2
            if (r7 == r0) goto Ld
            r0 = 3
        Lb:
            if (r7 != r0) goto L3d
        Ld:
            androidx.fragment.app.FragmentActivity r4 = r5.getActivity()
            if (r4 == 0) goto L7e
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.MZu r3 = X.AbstractC50666MYj.A00(r0)
            X.249 r2 = X.AnonymousClass249.VIDEO
            java.util.List r1 = java.util.Collections.emptyList()
            X.C14360o3.A07(r1)
            X.840 r0 = r5.A0A
            if (r0 != 0) goto L72
            java.lang.String r0 = "_cameraSession"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L32:
            r0 = 9587(0x2573, float:1.3434E-41)
            if (r6 != r0) goto L3d
            r0 = 9683(0x25d3, float:1.3569E-41)
            if (r7 == r0) goto Ld
            r0 = 9685(0x25d5, float:1.3572E-41)
            goto Lb
        L3d:
            r0 = -1
            if (r7 != r0) goto L7e
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r6 != r0) goto L7e
            java.lang.String r1 = "Required value was null."
            if (r8 == 0) goto L6c
            java.io.File r0 = r5.A0D
            if (r0 == 0) goto L66
            android.net.Uri r2 = X.LJR.A01(r8, r0)
            X.C14360o3.A07(r2)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 1442(0x5a2, float:2.02E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            X.C14360o3.A0C(r1, r0)
            X.MPa r1 = (X.InterfaceC50446MPa) r1
            r1.Cqo(r2)
            return
        L66:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L6c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L72:
            X.83z r0 = r0.A02
            X.83h r0 = r0.A01
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r0.A09
            r3.A0A(r2, r0, r1)
            r4.finish()
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189588ad.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // X.InterfaceC189668al
    public final void onCancel() {
        AbstractC50666MYj.A00(getSession());
        requireActivity().onBackPressed();
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.2fr, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C22P c22p;
        int A02 = C0f9.A02(106587935);
        super.onCreate(bundle);
        this.A0F = requireArguments().getBoolean("standalone_mode", false);
        this.A0I = requireArguments().getBoolean("ARG_IS_QUIET_POSTING_FLOW", false);
        if (requireArguments().get("ARG_CAMERA_ENTRY_POINT") instanceof C22P) {
            Object obj = requireArguments().get("ARG_CAMERA_ENTRY_POINT");
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
            c22p = (C22P) obj;
        } else {
            c22p = C22P.A5N;
        }
        this.A01 = c22p;
        EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
        C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
        if (requireArguments().containsKey("ARG_MUSIC_ATTRIBUTION_CONFIG")) {
            c43846JaA.A00 = (MusicAttributionConfig) requireArguments().getParcelable("ARG_MUSIC_ATTRIBUTION_CONFIG");
        }
        if (requireArguments().containsKey("ARG_IS_EXCLUSIVE_BY_DEFAULT")) {
            c43846JaA.A04 = requireArguments().getBoolean("ARG_IS_EXCLUSIVE_BY_DEFAULT");
        }
        CreationSession creationSession = new CreationSession();
        creationSession.A09 = new MediaCaptureConfig(c43846JaA);
        creationSession.A0A = enumC69983Ch;
        creationSession.A0M = true;
        creationSession.A0B = (PendingRecipient) requireArguments().getParcelable("ARG_TARGET_GROUP_PROFILE");
        creationSession.A0L = requireArguments().getBoolean("ARG_IS_QUIET_POSTING_FLOW", false);
        this.A0A = MX9.A00(this.A01, getSession(), creationSession, new C1815483h(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, true, false, false, false, false));
        C43833JZw c43833JZw = new C43833JZw(getSession());
        this.A0G = c43833JZw;
        c43833JZw.A0Q(requireContext(), C55772hI.A00(getSession()), this);
        C27961Xa A00 = AbstractC54912fq.A00();
        UserSession session = getSession();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0X;
        AbstractC54912fq.A00();
        this.A0H = A00.A02(this, this, session, new Object().A00(), quickPromotionSlot);
        Activity rootActivity = getRootActivity();
        C14360o3.A0A(rootActivity);
        this.A03 = new MXB(rootActivity, getSession(), this);
        this.A0B = C40121td.A0G.A01(requireContext(), getSession());
        FragmentActivity requireActivity = requireActivity();
        MXB mxb = this.A03;
        if (mxb == null) {
            C14360o3.A0F("dialogHelper");
            throw C00O.createAndThrow();
        }
        this.A07 = new MXA(requireActivity, this, mxb, this);
        this.A02 = new C95394Qz();
        this.A00 = (int) C18U.A01(C06090Tz.A06, getSession(), 36609987698497535L);
        if (C18U.A06(C06090Tz.A05, getSession(), 36323483315154217L)) {
            setDayNightMode(EnumC60792q3.A03);
        }
        C0f9.A09(-149719550, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0164, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1.A0z, 36328736060423935L) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0187, code lost:
    
        if (r0.A0c() != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a6  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189588ad.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1509017717);
        super.onDestroy();
        InterfaceC25179BCc interfaceC25179BCc = this.A09;
        if (interfaceC25179BCc != null) {
            interfaceC25179BCc.DV4();
            GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
            if (gestureDetectorOnGestureListenerC43829JZs == null) {
                C14360o3.A0F("galleryPickerView");
                throw C00O.createAndThrow();
            }
            if (gestureDetectorOnGestureListenerC43829JZs.A14.A0D.A07) {
                UserSession userSession = gestureDetectorOnGestureListenerC43829JZs.A0z;
                if (C18U.A06(C06090Tz.A05, userSession, 36326657295923226L)) {
                    C43878Jai A00 = AbstractC43847JaB.A00(userSession);
                    A00.A03.clear();
                    A00.A01 = null;
                    AbstractC43847JaB.A00(userSession).A02 = false;
                }
            }
        }
        C0f9.A09(1377606150, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1719963265);
        super.onDestroyView();
        AbstractC25651Mw.A00(getSession()).A02(this.A0K, C44316Ji7.class);
        C0f9.A09(1942798130, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-457137120);
        super.onPause();
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            C14360o3.A0F("galleryPickerView");
            throw C00O.createAndThrow();
        }
        gestureDetectorOnGestureListenerC43829JZs.A0U();
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            c1vw.removeLocationUpdates(getSession(), this);
            C0f9.A09(-224303087, A02);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
            C0f9.A09(-722652060, A02);
            throw illegalStateException;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(-576413220);
        super.onResume();
        if (!this.A0F) {
            ((MX5) A00(this)).A01.A0P.clear();
        }
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            str = "galleryPickerView";
        } else {
            gestureDetectorOnGestureListenerC43829JZs.A0V();
            C1VW c1vw = C1VW.A00;
            if (c1vw != null) {
                c1vw.requestLocationUpdates(getSession(), this, __redex_internal_original_name);
                C43833JZw c43833JZw = this.A0G;
                if (c43833JZw == null) {
                    str = "feedCaptureNavigationLogger";
                } else {
                    C69613Av c69613Av = c43833JZw.A01;
                    c43833JZw.A07.add(c69613Av);
                    c43833JZw.A06.add(c69613Av);
                    c43833JZw.A0J(DatePickerDialogModule.ARG_MODE, "gallery");
                    C0f9.A09(-298367620, A02);
                    return;
                }
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
                C0f9.A09(-435196362, A02);
                throw illegalStateException;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(688246577);
        super.onStop();
        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A06;
        if (gestureDetectorOnGestureListenerC43829JZs == null) {
            C14360o3.A0F("galleryPickerView");
            throw C00O.createAndThrow();
        }
        if (gestureDetectorOnGestureListenerC43829JZs.A14.A0D.A07) {
            if (C18U.A06(C06090Tz.A05, gestureDetectorOnGestureListenerC43829JZs.A0z, 36326657295923226L)) {
                GestureDetectorOnGestureListenerC43829JZs.A0I(gestureDetectorOnGestureListenerC43829JZs);
            }
        }
        C0f9.A09(396931922, A02);
    }
}
