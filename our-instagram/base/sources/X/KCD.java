package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.List;

/* loaded from: classes8.dex */
public final class KCD extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectPermanentMediaSendFragment";
    public C81Y A00;
    public C81I A01;
    public DirectCameraViewModel A02;
    public C48672Ll A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public DirectAggregatedMediaViewerController A0A;
    public C7IK A0B;
    public EnumC92794Ds A0C;
    public DirectThreadKey A0D;
    public boolean A0E;
    public boolean A0F = true;
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "stories_precapture_camera";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C7IM A07;
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        InterfaceC09390do interfaceC09390do = this.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C3I9 c3i9 = null;
        int i = HucClient.BODY_UPLOAD_TIMEOUT_SECONDS;
        this.A0A = new DirectAggregatedMediaViewerController(requireActivity(), A0r, c3i9, i, true, false);
        AnonymousClass988 A0a = AbstractC43594JPz.A0a(AbstractC166987dD.A0r(interfaceC09390do), AnonymousClass988.A1Z);
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36323560625614197L)) {
            setDayNightMode(EnumC60792q3.A03);
            Context A01 = AbstractC53172bz.A01(context);
            A07 = C7ID.A00.A01(A01, A0a, AbstractC125795mU.A00(), C05F.A0C);
        } else {
            A07 = AbstractC86593tX.A07(context, A0a, this.A0E);
        }
        this.A0B = A07.A07;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C57982lB.A0B.A05(requireActivity(), new RunnableC24681AwM(bundle, this));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C48672Ll c48672Ll;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C81I c81i = new C81I();
        this.A01 = c81i;
        registerLifecycleListener(c81i);
        C57982lB.A0B.A05(requireActivity(), new RunnableC24791AyD(bundle, view, this));
        C48672Ll c48672Ll2 = this.A03;
        if (c48672Ll2 == null) {
            c48672Ll2 = new C48672Ll(C12L.A00);
            this.A03 = c48672Ll2;
        }
        AnonymousClass195 anonymousClass195 = c48672Ll2.A00;
        if ((anonymousClass195 == null || !anonymousClass195.isActive()) && (c48672Ll = this.A03) != null) {
            c48672Ll.A00(requireActivity(), getViewLifecycleOwner(), new C9MH(this, 0), true);
        }
        view.post(new M0W(this));
    }

    public static final void A00(KCD kcd, boolean z, boolean z2) {
        int i;
        boolean z3;
        String str;
        View view = kcd.mView;
        if (view != null) {
            if (C57992lC.A03()) {
                i = C57992lC.A01();
            } else {
                i = 0;
            }
            float A08 = 1.0f - (i / AbstractC166987dD.A08(view));
            InterfaceC09390do interfaceC09390do = kcd.A0G;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            EnumC92794Ds enumC92794Ds = kcd.A0C;
            DirectThreadKey directThreadKey = kcd.A0D;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            C06090Tz A0j = AbstractC25225BEi.A0j(A0o, 0);
            boolean A06 = C18U.A06(A0j, A0o, 36323560625089902L);
            boolean A062 = C18U.A06(A0j, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36323560625548660L);
            float A00 = (float) C18U.A00(A0j, AbstractC25230BEn.A0k(interfaceC09390do, 0), 37167985555079631L);
            float A002 = (float) C18U.A00(A0j, AbstractC25230BEn.A0k(interfaceC09390do, 0), 37167985555538384L);
            boolean A003 = new C60352pJ(AbstractC166987dD.A0r(interfaceC09390do)).A00();
            C14360o3.A0B(A0r, 0);
            KCY A004 = LFC.A00(A0r, enumC92794Ds, directThreadKey, A00, A002, A08, false, z, A06, z2, A062, A003, true);
            A004.setDayNightMode(kcd.dayNightMode);
            C48685LgF c48685LgF = new C48685LgF(1, kcd, A004);
            DirectAggregatedMediaViewerController directAggregatedMediaViewerController = kcd.A0A;
            if (directAggregatedMediaViewerController == null) {
                str = "directAggregatedMediaViewerController";
            } else {
                boolean z4 = kcd.A0E;
                String str2 = kcd.A05;
                List list = kcd.A07;
                boolean z5 = kcd.A0F;
                Bundle bundle = kcd.mArguments;
                if (bundle != null) {
                    z3 = bundle.getBoolean(AbstractC111324zv.A00(3565));
                } else {
                    z3 = false;
                }
                A004.A0F = directAggregatedMediaViewerController;
                A004.A0D = c48685LgF;
                A004.A0S = z4;
                A004.A0R = false;
                A004.A01 = 10;
                A004.A02 = 10;
                A004.A0C = null;
                A004.A0L = null;
                A004.A0M = str2;
                if (list != null) {
                    A004.A0O = LIH.A01(list);
                }
                A004.A0H = null;
                A004.A0K = null;
                A004.A0G = null;
                A004.A0Q = z3;
                A004.A0T = z5;
                A004.A0P = true;
                C7IK c7ik = kcd.A0B;
                if (c7ik == null) {
                    str = "theme";
                } else {
                    A004.ADq(c7ik);
                    C3DN A0m = AbstractC25230BEn.A0m(kcd);
                    if (A0m != null) {
                        ((C3DP) A0m).A0H = new C49624LwH(kcd, 2);
                        A0m.A0O(A004, C05F.A00, 0, 255, true);
                    }
                    if (AbstractC166997dE.A1Z(kcd.A04, true) && kcd.A06 != null) {
                        AbstractC46995KqE.A00(kcd.requireContext(), true, false);
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe, X.InterfaceC60042om
    public final boolean getCanShowVoiceMessageBar() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            AbstractC25231BEo.A16(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r7 = this;
            X.3DN r0 = X.AbstractC25230BEn.A0m(r7)
            r1 = 1
            if (r0 == 0) goto L1c
            X.3DP r0 = (X.C3DP) r0
            boolean r0 = r0.A0h
            if (r0 != r1) goto L1c
        Ld:
            r6 = 1
            if (r1 != 0) goto Ld1
            X.81Y r0 = r7.A00
            r5 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r0.A06()
            if (r0 != r6) goto L1e
            return r6
        L1c:
            r1 = 0
            goto Ld
        L1e:
            boolean r0 = r7.A08
            if (r0 == 0) goto Ld1
            java.util.List r2 = r7.A07
            if (r2 == 0) goto Ld1
            int r1 = r2.size()
            r0 = 2
            if (r1 < r0) goto La5
            X.81Y r0 = r7.A00
            if (r0 == 0) goto L7d
            X.81Z r0 = r0.A00
            X.8Rm r0 = r0.A0a
            X.8Ro r0 = r0.A0Y
            java.util.List r0 = r0.A01
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r3 = r0.iterator()
        L41:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r3.next()
            X.9NH r0 = (X.C9NH) r0
            com.instagram.common.gallery.model.GalleryItem r1 = r0.A01
            boolean r0 = r1.A03()
            if (r0 == 0) goto L63
            X.8Ee r0 = r1.A07
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.A07()
        L5d:
            if (r0 == 0) goto L41
            r4.add(r0)
            goto L41
        L63:
            boolean r0 = r1.A06()
            if (r0 == 0) goto L70
            X.8lW r0 = r1.A08
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.A0k
            goto L5d
        L70:
            boolean r0 = r1.A04()
            if (r0 == 0) goto L41
            com.instagram.common.gallery.RemoteMedia r0 = r1.A04
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.A07
            goto L5d
        L7d:
            X.0sl r4 = X.C16930sl.A00
        L7f:
            java.util.Set r4 = X.AbstractC001800i.A0k(r4)
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r2.iterator()
        L8b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            java.lang.String r0 = r0.A0X
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L8b
            r3.add(r1)
            goto L8b
        La4:
            r2 = r3
        La5:
            r7.A07 = r2
            X.81Y r0 = r7.A00
            if (r0 == 0) goto Lbc
            X.81Z r0 = r0.A00
            X.8XA r0 = r0.A17
            if (r0 == 0) goto Lbc
            X.8XB r1 = r0.A00()
            if (r1 == 0) goto Lbc
            java.lang.Integer r0 = X.C05F.A01
            r1.A0B(r0)
        Lbc:
            X.0do r0 = r7.A0G
            X.0ll r3 = X.AbstractC25230BEn.A0k(r0, r5)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323560624762218(0x810c1600042d6a, double:3.034504230113803E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            A00(r7, r0, r5)
            return r6
        Ld1:
            X.AbstractC25231BEo.A16(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCD.onBackPressed():boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        int A02 = C0f9.A02(1599196775);
        super.onCreate(bundle);
        this.A02 = (DirectCameraViewModel) AbstractC153636vY.A00(requireArguments(), DirectCameraViewModel.class, "DirectReplyCameraFragments.ARG_REPLY_VIEW_MODEL");
        requireArguments().getBoolean(AbstractC111324zv.A00(1571));
        this.A0E = requireArguments().getBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IN_SHH_MODE");
        Bundle requireArguments = requireArguments();
        String A00 = AbstractC111324zv.A00(3567);
        if (requireArguments.containsKey(A00)) {
            bool = AbstractC31174DnI.A0n(requireArguments(), A00);
        } else {
            bool = null;
        }
        this.A04 = bool;
        String string = requireArguments().getString(AbstractC111324zv.A00(3568));
        if (string != null) {
            this.A0C = AbstractC46863Knw.A00(string);
        }
        this.A06 = requireArguments().getString("DirectReplyCameraFragments.REPLY_CAM_ARG_REPLIED_TO_MESSAGE");
        this.A0F = requireArguments().getBoolean(AbstractC111324zv.A00(3569), true);
        this.A0D = (DirectThreadKey) requireArguments().getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_KEY");
        setModuleNameV2("stories_precapture_camera");
        C0f9.A09(2103038441, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-426540453);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_media_send, viewGroup, false);
        C0f9.A09(1022529965, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-527027108);
        super.onDestroyView();
        C81Y c81y = this.A00;
        if (c81y != null) {
            c81y.A00();
        }
        this.A00 = null;
        unregisterLifecycleListener(this.A01);
        C81I c81i = this.A01;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A01 = null;
        LI5 A00 = AbstractC46750Km7.A00(AbstractC166987dD.A0r(this.A0G));
        LI5.A01(A00, new C37014GSt(A00, 36));
        if (this.A09) {
            AbstractC46995KqE.A00(requireActivity(), false, true);
        }
        C0f9.A09(1034074739, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(393278925);
        super.onResume();
        Activity rootActivity = getRootActivity();
        C14360o3.A0A(rootActivity);
        this.A0G.getValue();
        AbstractC65987Txg.A00(rootActivity);
        C0f9.A09(-1548691218, A02);
    }
}
