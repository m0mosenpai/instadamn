package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes6.dex */
public final class ELT extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60112ot, CallerContextable {
    public static final String __redex_internal_original_name = "AddProfilePhotoFragment";
    public Bitmap A00;
    public C36325G0u A01;
    public UserSession A02;
    public FO2 A03;
    public GY3 A04;
    public InterfaceC37217GaS A05;
    public C35782FrK A06;
    public C6WQ A07;
    public boolean A09;
    public int A0A;
    public EV8 A0B;
    public Boolean A08 = AbstractC166997dE.A0a();
    public final C69672VtH A0F = new Object();
    public final GY3 A0D = new C36569GAt(this);
    public final GY3 A0C = new C36570GAu(this);
    public final GYL A0E = new C36707GGc(this, 1);

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkF(false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "register_flow_add_profile_photo";
    }

    public static void A00(ELT elt) {
        Bitmap bitmap = elt.A00;
        if (bitmap != null) {
            int height = bitmap.getHeight();
            int i = elt.A0A;
            if (height < i) {
                bitmap = C0fK.A00(bitmap, i, i, true);
            }
        }
        elt.A03.A00 = bitmap;
        elt.A05.FBq(elt.requireContext(), elt.A03);
        elt.A05.FAR(elt.requireContext(), elt.A03);
        elt.A05.FCd(elt.requireContext(), elt.A02, elt.A03);
    }

    public final void A02() {
        AbstractC35174FfR.A00(EnumC72435Xdf.A08, this.A02, "upsell_primary_click");
        new AsyncTaskC31737Dwq(null, this.A01, 0).execute(new Void[0]);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00(this.A02, null, Boolean.valueOf(this.A09), null, "profile_photo");
        C69672VtH c69672VtH = this.A0F;
        Bundle bundle = this.mArguments;
        if (bundle != null && bundle.getString(AbstractC111324zv.A00(625)) != null) {
            c69672VtH.A00(requireArguments(), new C69026Vg2(this.A00, this.A08.booleanValue()));
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(ELT elt, boolean z) {
        InterfaceC37264GbH interfaceC37264GbH;
        FragmentActivity requireActivity = elt.requireActivity();
        if (requireActivity instanceof InterfaceC37264GbH) {
            interfaceC37264GbH = (InterfaceC37264GbH) requireActivity;
        } else {
            interfaceC37264GbH = null;
        }
        if (elt.A09) {
            requireActivity.finish();
            return;
        }
        C69672VtH c69672VtH = elt.A0F;
        Bundle bundle = elt.mArguments;
        if (bundle != null && bundle.getString(AbstractC111324zv.A00(625)) != null) {
            c69672VtH.A01(elt.requireArguments(), new C69026Vg2(elt.A00, elt.A08.booleanValue()));
            return;
        }
        if (interfaceC37264GbH != null) {
            interfaceC37264GbH.CnE(z ? 1 : 0);
            return;
        }
        FJR A00 = C35080Fcr.A00(elt.A02);
        if (A00 != null) {
            String str = A00.A01;
            String str2 = A00.A00;
            Bundle bundle2 = elt.mArguments;
            if (bundle2 != null && bundle2.getString("IgSessionManager.SESSION_TOKEN_KEY") != null) {
                C35080Fcr.A01(elt.getActivity(), AbstractC31176DnK.A0S(elt), str, str2);
                return;
            }
            throw AbstractC166987dD.A14("Cannot call from fragment that is not aware of the current user");
        }
        if (!C83743oJ.A01(elt.A02).A0K(elt.A02.userId)) {
            AbstractC31176DnK.A1A(elt.requireArguments(), new ENu(), AbstractC31177DnL.A0N(elt.requireActivity(), elt.A02));
        } else {
            elt.A06.A00();
        }
    }

    public final void A03(Bitmap bitmap) {
        C35017Fbq.A00().A02();
        this.A00 = bitmap;
        this.A03.A00 = bitmap;
        A00(this);
        this.A05.CxX(requireContext(), this.A03);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.Etf] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ELT elt;
        File file;
        String A0x;
        super.onActivityResult(i, i2, intent);
        C36325G0u c36325G0u = this.A01;
        InterfaceC69973Cg interfaceC69973Cg = c36325G0u.A01;
        if (interfaceC69973Cg != null) {
            interfaceC69973Cg.onActivityResult(i, i2, intent);
        }
        if (intent != null && i2 == -1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && (elt = c36325G0u.A02) != null && (file = c36325G0u.A04) != null) {
                        C67858Uzp c67858Uzp = new C67858Uzp();
                        ?? obj = new Object();
                        obj.A00 = elt;
                        obj.A01 = c67858Uzp;
                        String name = file.getName();
                        C14360o3.A07(name);
                        String str = "";
                        synchronized (C50472Tr.class) {
                            if (C50472Tr.A00 == null) {
                                C50472Tr.A04();
                            }
                            if ("".length() == 0 && !AbstractC31173DnH.A1a(name, ".")) {
                                str = ".jpg";
                                AbstractC31173DnH.A1Z("Filepath requested without extension. title=", name, "PhotoStorage");
                            }
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append(C50472Tr.A00);
                            A1C.append('/');
                            A1C.append(name);
                            A0x = AbstractC166997dE.A0x(str, A1C);
                        }
                        c36325G0u.A04 = new File(A0x);
                        Context requireContext = elt.requireContext();
                        ContentResolver contentResolver = requireContext.getContentResolver();
                        android.net.Uri A00 = FileProvider.A00(requireContext, file);
                        C14360o3.A07(A00);
                        requireContext.revokeUriPermission(A00, 3);
                        C121275eQ c121275eQ = new C121275eQ(new B1P(6, contentResolver, file, file), 482);
                        c121275eQ.A00 = new C215939h9(0, intent, c36325G0u, obj);
                        C1GJ.A03(c121275eQ);
                    }
                } else {
                    String action = intent.getAction();
                    if (action != null) {
                        new AsyncTaskC31737Dwq(AbstractC25227BEk.A0B(action), c36325G0u, 1).execute(new Void[0]);
                    }
                }
            } else {
                File file2 = c36325G0u.A03;
                if (file2 != null) {
                    android.net.Uri A01 = LJR.A01(intent, file2);
                    C14360o3.A07(A01);
                    C36325G0u.A00(A01, c36325G0u);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C1L2.A01(intent, this.A02, this.A0E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r1.getBoolean(X.AbstractC111324zv.A00(4417)) == false) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = -1936050066(0xffffffff8c9a386e, float:-2.376142E-31)
            int r2 = X.C0f9.A02(r0)
            super.onCreate(r4)
            com.instagram.common.session.UserSession r0 = X.AbstractC31176DnK.A0S(r3)
            r3.A02 = r0
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L21
            r0 = 4417(0x1141, float:6.19E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r1 = r1.getBoolean(r0)
            r0 = 1
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            r3.A09 = r0
            com.instagram.common.session.UserSession r1 = r3.A02
            X.G0u r0 = new X.G0u
            r0.<init>(r4, r1, r3)
            r3.A01 = r0
            X.EV8 r0 = new X.EV8
            r0.<init>(r3)
            r3.A0B = r0
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L47
            X.6WQ r1 = X.AbstractC31180DnO.A0T(r3)
            r3.A07 = r1
            android.content.Context r0 = r3.requireContext()
            X.AbstractC31176DnK.A13(r0, r1)
        L47:
            r0 = -1701360348(0xffffffff9a974d24, float:-6.2576764E-23)
            X.C0f9.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELT.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (r1.getBoolean(X.AbstractC111324zv.A00(2343), true) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        if (r1.getBoolean("IS_SIGN_UP_FLOW") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (r1.getBoolean(X.AbstractC111324zv.A00(2340), true) != false) goto L25;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r16, android.view.ViewGroup r17, android.os.Bundle r18) {
        /*
            r15 = this;
            r0 = 1569902709(0x5d92d075, float:1.3223855E18)
            int r2 = X.C0f9.A02(r0)
            r8 = r15
            com.instagram.common.session.UserSession r1 = r15.A02
            java.lang.String r0 = "profile_photo"
            X.AbstractC167017dG.A1N(r1, r0)
            X.C35203Ffv.A01(r1, r0)
            r0 = 2131628958(0x7f0e139e, float:1.8885223E38)
            r4 = r16
            r1 = r17
            android.view.View r6 = X.AbstractC31172DnG.A0A(r4, r1, r0)
            android.view.ViewGroup r3 = X.AbstractC31180DnO.A05(r6)
            com.instagram.common.session.UserSession r1 = r15.A02
            X.FrK r0 = new X.FrK
            r0.<init>(r15, r15, r1)
            r15.A06 = r0
            android.os.Bundle r0 = r15.mArguments
            boolean r1 = X.AbstractC35081Fcs.A02(r0, r1)
            r5 = 1
            r0 = 2131628074(0x7f0e102a, float:1.888343E38)
            if (r1 == 0) goto L39
            r0 = 2131628075(0x7f0e102b, float:1.8883432E38)
        L39:
            r4.inflate(r0, r3, r5)
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r15)
            r0 = 2131165281(0x7f070061, float:1.7944775E38)
            int r0 = X.AbstractC31171DnF.A02(r1, r0)
            r15.A0A = r0
            X.FRR r4 = new X.FRR
            r4.<init>(r15)
            androidx.fragment.app.FragmentActivity r3 = r15.getActivity()
            boolean r0 = r3 instanceof X.InterfaceC37264GbH
            if (r0 == 0) goto Le7
            X.GbH r3 = (X.InterfaceC37264GbH) r3
        L58:
            android.os.Bundle r1 = r15.mArguments
            r10 = -1
            if (r1 == 0) goto L67
            r0 = 2342(0x926, float:3.282E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            int r10 = r1.getInt(r0, r10)
        L67:
            android.os.Bundle r1 = r15.mArguments
            r13 = 0
            if (r1 == 0) goto L79
            r0 = 2343(0x927, float:3.283E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.getBoolean(r0, r5)
            r14 = 0
            if (r0 == 0) goto L7a
        L79:
            r14 = 1
        L7a:
            com.instagram.common.session.UserSession r9 = r15.A02
            X.FrK r0 = r15.A06
            androidx.fragment.app.Fragment r0 = r0.A00
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L8d
            java.lang.String r0 = "IS_SIGN_UP_FLOW"
            boolean r0 = r1.getBoolean(r0)
            r12 = 1
            if (r0 != 0) goto L8e
        L8d:
            r12 = 0
        L8e:
            android.os.Bundle r1 = r15.mArguments
            if (r1 == 0) goto L9f
            r0 = 2340(0x924, float:3.279E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.getBoolean(r0, r5)
            r11 = 0
            if (r0 == 0) goto La0
        L9f:
            r11 = 1
        La0:
            android.os.Bundle r1 = r15.mArguments
            if (r1 == 0) goto Lb0
            r0 = 2337(0x921, float:3.275E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto Lb1
        Lb0:
            r13 = 1
        Lb1:
            X.FO2 r7 = new X.FO2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r15.A03 = r7
            com.instagram.common.session.UserSession r1 = r15.A02
            android.os.Bundle r0 = r15.mArguments
            boolean r0 = X.AbstractC35081Fcs.A02(r0, r1)
            com.instagram.common.session.UserSession r1 = r15.A02
            if (r0 == 0) goto Le1
            X.GAw r0 = new X.GAw
            r0.<init>(r15, r1, r4, r3)
        Lc9:
            r15.A05 = r0
            X.EV8 r0 = r15.A0B
            if (r0 == 0) goto Lda
            androidx.fragment.app.FragmentActivity r1 = r15.requireActivity()
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            X.EV8 r0 = r15.A0B
            r1.registerOnActivityResultListener(r0)
        Lda:
            r0 = -15154339(0xffffffffff18c35d, float:-2.0305704E38)
            X.C0f9.A09(r0, r2)
            return r6
        Le1:
            X.GAv r0 = new X.GAv
            r0.<init>(r1, r4, r3)
            goto Lc9
        Le7:
            r3 = 0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELT.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1028438202);
        super.onDestroy();
        C36325G0u c36325G0u = this.A01;
        c36325G0u.A02 = null;
        c36325G0u.A00 = null;
        C0f9.A09(1437999379, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2115344658);
        super.onDestroyView();
        synchronized (C35017Fbq.A00()) {
        }
        this.A05.D9w(requireContext(), this.A03);
        if (this.A0B != null) {
            ((IgFragmentActivity) requireActivity()).unregisterOnActivityResultListener(this.A0B);
        }
        C0f9.A09(-2009188936, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1924829688);
        super.onResume();
        A00(this);
        requireContext();
        C0f9.A09(619636078, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C36325G0u c36325G0u = this.A01;
        C14360o3.A0B(bundle, 0);
        FIF fif = c36325G0u.A00;
        if (fif != null) {
            bundle.putParcelable("AddAvatarHelper.IMAGE_METADATA", fif.A01);
        }
        File file = c36325G0u.A04;
        if (file != null) {
            bundle.putString("tempCameraPhotoFile", file.getPath());
        }
        File file2 = c36325G0u.A03;
        if (file2 != null) {
            bundle.putString("tempGalleryPhotoFile", file2.getPath());
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A05.E0T(requireContext(), view, this.A03);
        C36325G0u c36325G0u = this.A01;
        ELT elt = c36325G0u.A02;
        if (elt != null) {
            c36325G0u.A01 = AbstractC69933Cc.A00(elt.requireContext(), c36325G0u.A07, new C36323G0s(c36325G0u, elt));
            FIF fif = c36325G0u.A00;
            if (fif != null) {
                elt.A03(fif.A00);
            }
        }
        C35017Fbq A00 = C35017Fbq.A00();
        synchronized (A00) {
        }
        synchronized (A00) {
        }
        synchronized (A00) {
        }
        Boolean.FALSE.equals(null);
    }
}
