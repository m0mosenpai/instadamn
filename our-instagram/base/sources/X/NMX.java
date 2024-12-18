package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.DexStore;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;

/* loaded from: classes9.dex */
public final class NMX extends AbstractC52180N7p implements InterfaceC60442pS, InterfaceC60072op, InterfaceC58119Ppi, InterfaceC53852dP {
    public static final String __redex_internal_original_name = "VideoUploadMetadataFragment";
    public Location A00;
    public View A01;
    public View A02;
    public TextView A03;
    public ImmutableList A04;
    public InterfaceC41501vz A05;
    public InterfaceC41501vz A06;
    public InterfaceC41501vz A07;
    public InterfaceC41501vz A08;
    public InterfaceC41501vz A09;
    public C54966OSw A0A;
    public PJQ A0B;
    public C54646OBx A0C;
    public C54688ODo A0D;
    public C50990Mfx A0E;
    public OD8 A0F;
    public OBy A0G;
    public OES A0H;
    public String A0I;
    public List A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public View A0Q;
    public ConstraintLayout A0R;
    public C40121td A0S;
    public boolean A0T;
    public final InterfaceC09390do A0W;
    public final CallerContext A0Z = CallerContext.A01(__redex_internal_original_name);
    public final InterfaceC09390do A0Y = C57551PgP.A00(this, new C57551PgP(this, 3), new C57251PbZ(32, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 4);
    public final InterfaceC09390do A0X = C57551PgP.A01(this, 5);
    public final InterfaceC09390do A0V = C1XM.A00(C57538PgC.A01(this, 48));
    public boolean A0M = true;
    public final C56448P4j A0U = new C56448P4j(this, 4);

    private final N8d A00(UserSession userSession, String str) {
        if (userSession == null) {
            return null;
        }
        C131975xX c131975xX = C131965xW.A05;
        C130135uJ A0Q = MSX.A0Q(userSession);
        if (A0Q == null) {
            return null;
        }
        int A04 = AbstractC25233BEq.A04(this);
        return new N8d(new C012804r(16, str), C05F.A01, userSession, A0Q, this, str, A04, 0);
    }

    public static final void A04(C130135uJ c130135uJ, NMX nmx) {
        OD8 od8;
        c130135uJ.A00 = true;
        C131975xX c131975xX = C131965xW.A05;
        InterfaceC09390do interfaceC09390do = nmx.A0W;
        C131975xX.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0A(c130135uJ);
        if ((nmx.A0K || C196218mC.A00(AbstractC166987dD.A0r(interfaceC09390do))) && (od8 = nmx.A0F) != null) {
            od8.A00 = true;
        }
        A09(nmx);
    }

    @Override // X.InterfaceC53852dP
    public final void DHI(C47Z c47z) {
        String id;
        C14360o3.A0B(c47z, 0);
        C38321qM c38321qM = c47z.A1C;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            A08(this);
            C52251NAq A0C = A0C();
            boolean A0s = NNE.A00(this).A0s();
            if (A0C.A01 != null && A0C.A00() && A0C.A0A) {
                C1Y6 A00 = AbstractC69888VxF.A00();
                C1Y5 A002 = VRF.A00();
                String str = A0C.A0E;
                UserSession userSession = A0C.A0D;
                Context context = A0C.A01;
                if (context != null) {
                    WEX A003 = A002.A00(context, userSession, id, str);
                    A003.A0B = A0s;
                    A00.A0B(A003);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    @Override // X.InterfaceC53852dP
    public final /* synthetic */ void DSR(C47Z c47z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_video_sharing_settings";
    }

    @Override // X.AbstractC52180N7p, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String obj;
        BitmapDrawable bitmapDrawable;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Location lastLocation;
        List list;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (!requireActivity().isFinishing()) {
            InterfaceC09390do interfaceC09390do = this.A0Y;
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), MSW.A0b(interfaceC09390do).A04, new C57561PgZ(this, 30), 33);
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), MSW.A0b(interfaceC09390do).A03, new C57561PgZ(this, 31), 33);
            if (MSX.A1W(this)) {
                AbstractC31174DnI.A1E(getViewLifecycleOwner(), AbstractC31172DnG.A0E(MSW.A0b(interfaceC09390do).A0J), new C57561PgZ(this, 32), 33);
            }
            OES oes = this.A0H;
            if (oes != null) {
                if (oes.A04) {
                    InterfaceC09390do interfaceC09390do2 = this.A0W;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                    C23031Ai A10 = AbstractC25226BEj.A10(this.A0X);
                    NNE A0O = MSY.A0O(this);
                    CallerContext callerContext = C55622On7.A03;
                    C50990Mfx c50990Mfx = (C50990Mfx) MSW.A0F(new NDT(A0r, new C55622On7(this, AbstractC166987dD.A0r(interfaceC09390do2)), A0O, A10, new C57551PgP(this, 2)), this).A00(C50990Mfx.class);
                    this.A0E = c50990Mfx;
                    this.A0F = new OD8(getViewLifecycleOwner(), c50990Mfx, new C57551PgP(this, 1));
                }
                OES oes2 = this.A0H;
                if (oes2 != null) {
                    if (oes2.A02.A01) {
                        this.A0C = new C54646OBx(new AnonymousClass857(requireActivity()), this, AbstractC166987dD.A0r(this.A0W));
                    }
                    OES oes3 = this.A0H;
                    if (oes3 != null) {
                        if (oes3.A01) {
                            C56034Ou6 A00 = C56034Ou6.A00(this, 12);
                            MSX.A0F(this).A01(A00, C56021Ots.class);
                            this.A06 = A00;
                        }
                        OES oes4 = this.A0H;
                        if (oes4 != null) {
                            if (oes4.A02.A02) {
                                MSW.A0b(interfaceC09390do).A0M.A0Q = AbstractC75343a1.A06(AbstractC166987dD.A0r(this.A0W));
                            }
                            if (this.A0H != null) {
                                C56034Ou6 A002 = C56034Ou6.A00(this, 15);
                                MSX.A0F(this).A01(A002, C55985OtI.class);
                                this.A08 = A002;
                                C56034Ou6 A003 = C56034Ou6.A00(this, 16);
                                MSX.A0F(this).A01(A003, C56017Oto.class);
                                this.A09 = A003;
                                C73450YDt A004 = NearbyVenuesService.A00(this.A00);
                                if (A004 != null) {
                                    List items = A004.getItems();
                                    this.A0P = true;
                                    if (items != null) {
                                        int size = items.size();
                                        if (size > 5) {
                                            size = 5;
                                        }
                                        list = items.subList(0, size);
                                    } else {
                                        list = null;
                                    }
                                    this.A0J = list;
                                    A09(this);
                                }
                                C1VW c1vw = C1VW.A00;
                                if (c1vw != null && (lastLocation = c1vw.getLastLocation(AbstractC166987dD.A0r(this.A0W), __redex_internal_original_name)) != null && C1VW.A00 != null && AbstractC103794ly.A00(lastLocation)) {
                                    A02(lastLocation, this);
                                } else {
                                    C1VW c1vw2 = C1VW.A00;
                                    if (c1vw2 != null) {
                                        c1vw2.requestLocationUpdates(AbstractC166987dD.A0r(this.A0W), this.A0U, "ig_video_sharing_settings");
                                    }
                                }
                                if (MSW.A0c(this).A0i) {
                                    C56034Ou6 A005 = C56034Ou6.A00(this, 13);
                                    MSX.A0F(this).A01(A005, C56003Ota.class);
                                    this.A07 = A005;
                                    C56034Ou6 A006 = C56034Ou6.A00(this, 14);
                                    MSX.A0F(this).A01(A006, C56002OtZ.class);
                                    this.A05 = A006;
                                }
                                boolean A1W = MSX.A1W(this);
                                this.A0M = !A1W;
                                if (A1W) {
                                    AbstractC31174DnI.A1E(getViewLifecycleOwner(), MSW.A0c(this).A0j, new C57561PgZ(this, 33), 33);
                                }
                                C47Z A007 = NNE.A00(this);
                                A0E();
                                TextView A0e = AbstractC166987dD.A0e(AbstractC43594JPz.A0F(view, R.id.action_buttons_stub), R.id.post_button);
                                this.A03 = A0e;
                                if (A0e != null) {
                                    AbstractC25227BEk.A12(A0e, this, 2131973639);
                                    ViewOnClickListenerC55465OkK.A01(A0e, 39, A007, this);
                                    OXy.A01(A0e, this.A0L);
                                    AbstractC56952jT.A01(A0e);
                                    ViewGroup.LayoutParams layoutParams = A0e.getLayoutParams();
                                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                        i = marginLayoutParams.topMargin;
                                    } else {
                                        i = 0;
                                    }
                                    AbstractC13880nE.A0U(A0e, i);
                                } else {
                                    A0e = null;
                                }
                                this.A01 = A0e;
                                this.A02 = view.findViewById(R.id.post_sharing_overlay);
                                this.A0R = (ConstraintLayout) view.findViewById(R.id.metadata_container);
                                C131975xX c131975xX = C131965xW.A05;
                                InterfaceC09390do interfaceC09390do3 = this.A0W;
                                C130135uJ A0Q = MSX.A0Q(AbstractC166987dD.A0r(interfaceC09390do3));
                                boolean A1W2 = MSX.A1W(this);
                                A0G();
                                if (!A1W2) {
                                    if (!this.A0T && A0Q != null && C131975xX.A02(A0Q)) {
                                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do3);
                                        C14360o3.A0B(A0r2, 0);
                                        if (C131975xX.A01(A0r2) && !A0Q.A00 && A0Q.A05) {
                                            A05(A0Q, this, true);
                                            this.A0T = true;
                                        }
                                    }
                                    AbstractC86593tX.A0h(AbstractC166987dD.A0r(interfaceC09390do3), requireContext(), requireActivity());
                                } else {
                                    C23031Ai A008 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do3));
                                    InterfaceC16530ry interfaceC16530ry = A008.A7V;
                                    C0YR[] c0yrArr = C23031Ai.A8c;
                                    if (!AbstractC167017dG.A1b(A008, interfaceC16530ry, c0yrArr, 284)) {
                                        if (C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do3)).A0M() == C05F.A0C) {
                                            obj = requireContext().getString(2131965561);
                                        } else {
                                            StringBuilder A1C = AbstractC166987dD.A1C();
                                            AbstractC31172DnG.A1D(requireContext(), A1C, 2131965562);
                                            A1C.append('\n');
                                            A1C.append('\n');
                                            AbstractC31172DnG.A1D(requireContext(), A1C, 2131965563);
                                            obj = A1C.toString();
                                        }
                                        C14360o3.A0A(obj);
                                        C193328hC A0O2 = AbstractC31175DnJ.A0O(this);
                                        AbstractC31172DnG.A1C(requireContext(), A0O2, 2131965564);
                                        A0O2.A0r(obj);
                                        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_reels_outline_96);
                                        if (drawable != null) {
                                            bitmapDrawable = C3LQ.A03(requireActivity(), drawable, AbstractC31173DnH.A03(getContext(), requireActivity(), R.attr.igds_color_gradient_red), AbstractC31173DnH.A03(getContext(), requireActivity(), R.attr.igds_color_gradient_purple));
                                        } else {
                                            bitmapDrawable = null;
                                        }
                                        A0O2.A0j(bitmapDrawable);
                                        A0O2.A07();
                                        A0O2.A0I(DialogInterfaceOnClickListenerC55320Ogi.A00(this, 4), 2131965052);
                                        A0O2.A0g(null);
                                        AbstractC166987dD.A1W(A0O2);
                                        C23031Ai A009 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do3));
                                        AbstractC167007dF.A1L(A009, A009.A7V, c0yrArr, 284, true);
                                    }
                                }
                                OAL oal = (OAL) MSW.A0b(interfaceC09390do).A0E.getValue();
                                C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, oal.A00), "ig_camera_share_sheet_load"), 205);
                                if (AbstractC25226BEj.A1Z(A0A)) {
                                    A0A.A0a(EnumC114925Hg.FEED);
                                    A0A.A0M(C22P.A5N, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                                    A0A.A0W(1);
                                    MSW.A1P(EnumC50631MWs.A0L, A0A);
                                    A0A.A0c(AnonymousClass249.VIDEO);
                                    A0A.A0R("camera_session_id", oal.A01);
                                    A0A.A0m("ig_video_sharing_settings");
                                    A0A.A0O("funded_content_available", false);
                                    A0A.A0M(EnumC193318hB.A03, "capture_type");
                                    A0A.A0O("is_panavision", false);
                                    A0A.A0O("is_feed_fork", true);
                                    A0A.Cht();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
    }

    public static final IGTVUploadViewModel A01(NMX nmx) {
        return MSW.A0b(nmx.A0Y);
    }

    public static final void A02(Location location, NMX nmx) {
        nmx.A00 = location;
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            c1vw.removeLocationUpdates(AbstractC166987dD.A0r(nmx.A0W), nmx.A0U);
        }
        FragmentActivity activity = nmx.getActivity();
        if (activity != null) {
            NearbyVenuesService.A01(activity, location, AbstractC166987dD.A0r(nmx.A0W), null, AbstractC37302Gc3.A0T());
        }
    }

    public static void A03(AbstractC02600Aj abstractC02600Aj, Long l, int i, int i2) {
        abstractC02600Aj.A0Q("posting_surface", l);
        abstractC02600Aj.A0R("product", "");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A05(IgReactMediaPickerNativeModule.WIDTH, Long.valueOf(i));
        c0Zx.A05(IgReactMediaPickerNativeModule.HEIGHT, Long.valueOf(i2));
        abstractC02600Aj.A0N(c0Zx, "input_metadata");
        abstractC02600Aj.A0R("media_original_folder", "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04ea  */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.O3e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, X.1tl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.NMX r31) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMX.A06(X.NMX):void");
    }

    public static final void A08(NMX nmx) {
        Object obj;
        InterfaceC09390do interfaceC09390do = nmx.A0Y;
        IGTVUploadViewModel A0b = MSW.A0b(interfaceC09390do);
        C22P c22p = A0b.A00;
        if (c22p != C22P.A3A && !A0b.A06() && c22p != C22P.A39) {
            obj = C52534NMg.A00;
        } else {
            obj = C52533NMf.A00;
        }
        MSW.A0b(interfaceC09390do).A04(nmx, obj);
    }

    public final UserSession A0G() {
        return AbstractC166987dD.A0r(this.A0W);
    }

    @Override // X.InterfaceC58119Ppi
    public final boolean BCs() {
        InterfaceC09390do interfaceC09390do = this.A0Y;
        IGTVUploadViewModel A0b = MSW.A0b(interfaceC09390do);
        IGTVDraftsRepository iGTVDraftsRepository = (IGTVDraftsRepository) A0b.A0C.getValue();
        Object obj = iGTVDraftsRepository.A00.get(A0b.A0B);
        if (obj != null) {
            IGTVUploadViewModel A0b2 = MSW.A0b(interfaceC09390do);
            OD8 od8 = this.A0F;
            if (od8 != null) {
                C196218mC.A00(od8.A02.A04);
            }
            String str = MSX.A0R(super.A06).A02;
            if (str.length() == 0) {
                str = null;
            }
            return AbstractC25225BEi.A1a(A0b2.A01(str), obj);
        }
        return false;
    }

    @Override // X.InterfaceC58119Ppi
    public final void Cyw() {
        MSW.A0b(this.A0Y).A04(this, C52530NMc.A00);
    }

    @Override // X.InterfaceC58119Ppi
    public final void DAV() {
        MSW.A0b(this.A0Y).A04(this, C52530NMc.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0W);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r12, int r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMX.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A0Y;
        if (AbstractC167007dF.A1W(MSW.A0b(interfaceC09390do).A0M.A0C)) {
            ((C56062Ouf) this.A0V.getValue()).onBackPressed();
            return true;
        }
        if (A0C().A00() && MSW.A0b(interfaceC09390do).A02) {
            C40121td c40121td = this.A0S;
            if (c40121td == null) {
                C14360o3.A0F("pendingMediaManager");
                throw C00O.createAndThrow();
            }
            c40121td.A0I(this);
            A08(this);
            return true;
        }
        MSW.A0b(interfaceC09390do).A04(this, C52528NMa.A00);
        return false;
    }

    public NMX() {
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A04 = of;
        this.A0W = AbstractC60492pY.A02(this);
    }

    public static final void A05(C130135uJ c130135uJ, NMX nmx, boolean z) {
        FragmentActivity requireActivity = nmx.requireActivity();
        N5K A00 = AbstractC53951NtO.A00("video_feed");
        A00.A01 = new C56367P1c(1, nmx, c130135uJ);
        C189448aO A0y = AbstractC25225BEi.A0y(AbstractC166987dD.A0r(nmx.A0W));
        AbstractC25225BEi.A1Q(A0y, false);
        A0y.A0U = new C56758PHa(4, nmx, c130135uJ);
        A0y.A0F = ViewConfiguration.get(requireActivity).getScaledPagingTouchSlop();
        C189478aR A002 = A0y.A00();
        if (z) {
            AbstractC166987dD.A1Z(new PZP(A002, requireActivity, A00, null, 6), C07Y.A00(requireActivity));
        } else {
            A002.A02(requireActivity, A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.A01 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.NMX r17) {
        /*
            X.NAq r0 = r17.A0C()
            boolean r0 = r0.A00()
            if (r0 == 0) goto L96
            X.NNE r2 = X.MSY.A0O(r17)
            X.P45 r0 = X.MSW.A0c(r17)
            com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata r0 = r0.A0B
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.A01
            r13 = 1
            if (r0 != 0) goto L1c
        L1b:
            r13 = 0
        L1c:
            X.NAq r0 = r17.A0C()
            X.P45 r1 = X.MSW.A0c(r17)
            java.lang.String r5 = r1.A0H
            X.47Z r3 = X.NNE.A00(r17)
            boolean r1 = r3.CKm()
            r11 = 1
            r15 = 0
            if (r1 == 0) goto L8c
            java.util.List r1 = r3.A4C
            if (r1 == 0) goto L8c
            int r1 = r1.size()
            if (r1 != r11) goto L8c
            java.util.List r1 = r3.A4C
            if (r1 == 0) goto L91
            java.lang.Object r1 = X.AbstractC001800i.A0O(r1, r15)
            com.instagram.pendingmedia.model.BrandedContentTag r1 = (com.instagram.pendingmedia.model.BrandedContentTag) r1
            if (r1 == 0) goto L91
            boolean r1 = r1.A03
            if (r1 != 0) goto L8a
            r17.A0G()
        L4f:
            X.47Z r3 = r2.A02
            boolean r12 = r3.A0s()
            com.instagram.user.model.UpcomingEventImpl r1 = r3.A1p
            boolean r14 = X.AbstractC167007dF.A1W(r1)
            int r8 = r3.A0R
            int r9 = r3.A0S
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r2.A02()
            long r1 = r4.toSeconds(r1)
            double r6 = (double) r1
            boolean r17 = r3.A0t()
            java.util.List r1 = r3.A0K()
            int r10 = r1.size()
            r16 = 1
            com.instagram.common.session.UserSession r4 = r0.A0D
            X.1ON r2 = X.WDz.A02(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1P1 r1 = r0.A0C
            r2.A00 = r1
            X.1GL r0 = r0.A05
            if (r0 == 0) goto L89
            r0.schedule(r2)
        L89:
            return
        L8a:
            r11 = 0
            goto L4f
        L8c:
            boolean r11 = r3.CKm()
            goto L4f
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L96:
            A06(r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMX.A07(X.NMX):void");
    }

    public static final void A09(NMX nmx) {
        if (nmx.getContext() != null) {
            nmx.A0B(nmx.A0D());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0687, code lost:
    
        if (X.AbstractC25226BEj.A10(r11).A01.getInt("igtv_creation_monetization_toggle_turn_off_count", 0) > 2) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x06aa, code lost:
    
        if (r5.A00 == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0336, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r12, 0), r12, 36323122537901069L) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04a4, code lost:
    
        if (r7.A00 != true) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x050d, code lost:
    
        if (r7.A00 != true) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x058a, code lost:
    
        if (r7 != null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x06fe, code lost:
    
        if (r36.A0O == false) goto L238;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Type inference failed for: r4v18, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    @Override // X.AbstractC52180N7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A0D() {
        /*
            Method dump skipped, instructions count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMX.A0D():java.util.ArrayList");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        boolean A1W = MSX.A1W(this);
        A0G();
        int i = 2131973680;
        if (A1W) {
            i = 2131973859;
        }
        interfaceC56362iU.Efu(i);
        if (AbstractC167007dF.A1W(MSW.A0b(this.A0Y).A0M.A0C)) {
            String A0v = AbstractC25227BEk.A0v(this, 2131964187);
            C57538PgC A01 = C57538PgC.A01(this, 47);
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A0K = A0v;
            AbstractC31176DnK.A1B(ViewOnClickListenerC55455Ok9.A00(A01, 41), A0B, interfaceC56362iU);
        }
    }

    @Override // X.AbstractC52180N7p, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C54741OFs c54741OFs;
        int A02 = C0f9.A02(-703337488);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0Y;
        this.A0H = (OES) MSW.A0b(interfaceC09390do).A0I.getValue();
        C40131tg c40131tg = C40121td.A0G;
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do2 = this.A0W;
        this.A0S = c40131tg.A01(requireActivity, AbstractC166987dD.A0r(interfaceC09390do2));
        OES oes = this.A0H;
        if (oes != null) {
            if (oes.A06) {
                this.A0D = new C54688ODo(AbstractC31177DnL.A09(this), AbstractC166987dD.A0r(interfaceC09390do2), MSW.A0b(interfaceC09390do), new C54813OKo(requireContext(), AbstractC166987dD.A0r(interfaceC09390do2), AbstractC63302u8.A00(AbstractC166987dD.A0r(interfaceC09390do2))));
            }
            if (this.A0H != null) {
                this.A0G = new OBy(this, AbstractC166987dD.A0r(interfaceC09390do2), this, MSW.A0b(interfaceC09390do));
                if (MSX.A1W(this) && this.A04.isEmpty() && (c54741OFs = MSW.A0c(this).A0D) != null) {
                    IGTVUploadViewModel A0b = MSW.A0b(interfaceC09390do);
                    PZ1.A01(A0b, c54741OFs.A09, AbstractC141776au.A00(A0b), 3);
                }
                C0f9.A09(651571247, A02);
                return;
            }
        }
        C14360o3.A0F(DexStore.CONFIG_FILENAME);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC52180N7p, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(589761261);
        super.onDestroy();
        InterfaceC41501vz interfaceC41501vz = this.A06;
        if (interfaceC41501vz != null) {
            MSX.A0F(this).A02(interfaceC41501vz, C56021Ots.class);
        }
        InterfaceC41501vz interfaceC41501vz2 = this.A08;
        if (interfaceC41501vz2 != null) {
            MSX.A0F(this).A02(interfaceC41501vz2, C55985OtI.class);
        }
        InterfaceC41501vz interfaceC41501vz3 = this.A09;
        if (interfaceC41501vz3 != null) {
            MSX.A0F(this).A02(interfaceC41501vz3, C56017Oto.class);
        }
        InterfaceC41501vz interfaceC41501vz4 = this.A07;
        if (interfaceC41501vz4 != null) {
            MSX.A0F(this).A02(interfaceC41501vz4, C56003Ota.class);
        }
        InterfaceC41501vz interfaceC41501vz5 = this.A05;
        if (interfaceC41501vz5 != null) {
            MSX.A0F(this).A02(interfaceC41501vz5, C56002OtZ.class);
        }
        C0f9.A09(254309928, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C209359Nt c209359Nt;
        RunnableC208819Lp runnableC208819Lp;
        int A02 = C0f9.A02(1293326007);
        super.onPause();
        PJQ pjq = this.A0B;
        if (pjq != null && (c209359Nt = pjq.A01.A08) != null && (runnableC208819Lp = c209359Nt.A00) != null) {
            runnableC208819Lp.A01();
        }
        C0f9.A09(-463658179, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1613716886);
        super.onResume();
        C50990Mfx c50990Mfx = this.A0E;
        if (c50990Mfx != null) {
            C131975xX c131975xX = C131965xW.A05;
            if (C131975xX.A01(c50990Mfx.A04)) {
                C131975xX.A00(AbstractC166987dD.A0r(this.A0W)).A08(null);
            }
        }
        C131975xX c131975xX2 = C131965xW.A05;
        C131975xX.A00(AbstractC166987dD.A0r(this.A0W)).A00 = NNE.A00(this);
        A09(this);
        C50990Mfx c50990Mfx2 = this.A0E;
        if (c50990Mfx2 != null) {
            c50990Mfx2.A01();
        }
        PJQ pjq = this.A0B;
        if (pjq != null) {
            C9KK c9kk = pjq.A01;
            c9kk.A07 = pjq;
            c9kk.A00();
        }
        C0f9.A09(-1045041649, A02);
    }
}
