package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.ROs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60733ROs extends UDB {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.C0SG
    public final int A0E() {
        return ((QIw) ((QKE) this).A02.A02).A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r2 != null) goto L10;
     */
    @Override // X.C0SG, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach(android.content.Context r7) {
        /*
            r6 = this;
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            super.onAttach(r7)
            android.os.Bundle r3 = r6.mArguments
            r4 = 0
            if (r3 == 0) goto L68
            java.lang.Class<com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures> r2 = com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures.class
            java.lang.String r0 = "CREATOR"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)
            java.lang.Object r1 = r0.get(r4)
            boolean r0 = r1 instanceof android.os.Parcelable.Creator
            if (r0 == 0) goto L6b
            android.os.Parcelable$Creator r1 = (android.os.Parcelable.Creator) r1
            if (r1 == 0) goto L6b
            java.lang.String r0 = "features"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            java.lang.Object r2 = X.C0B1.A01(r1, r0, r2)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures r2 = (com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures) r2
            if (r2 == 0) goto L68
        L30:
            X.0do r0 = r6.A00
            java.lang.Object r1 = r0.getValue()
            X.Q8Y r1 = (X.Q8Y) r1
            java.lang.Integer r0 = r2.A00
            X.C14360o3.A0B(r0, r5)
            r1.A00 = r0
            X.0do r3 = r6.A01
            X.JlN r2 = X.AbstractC58318PtA.A0L(r3)
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto L50
            java.lang.String r0 = "utm"
            android.os.Bundle r4 = r1.getBundle(r0)
        L50:
            X.SZC r0 = X.SZC.A00(r4)
            r2.A00 = r0
            X.JlN r0 = X.AbstractC58318PtA.A0L(r3)
            X.2GT r2 = r0.A03
            r0 = 32
            X.Td4 r1 = new X.Td4
            r1.<init>(r6, r0)
            r0 = 4
            X.AbstractC31180DnO.A1F(r6, r2, r1, r0)
            return
        L68:
            com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures r2 = com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures.A01
            goto L30
        L6b:
            r0 = 61
            java.lang.String r1 = X.AbstractC43591JPw.A00(r0)
            java.util.Map r0 = X.C0YZ.A03
            java.lang.String r0 = X.AbstractC13230m9.A01(r2)
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC60733ROs.onAttach(android.content.Context):void");
    }

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C14360o3.A0B(dialogInterface, 0);
        A02(C05F.A1F, C05F.A01, AbstractC25230BEn.A1b("supportStatus", AbstractC61806Ru0.A00(AbstractC58318PtA.A0L(this.A01).A0A)));
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        try {
            AbstractC10360h2 childFragmentManager = getChildFragmentManager();
            int A00 = QIw.A00(childFragmentManager, this);
            if (!(childFragmentManager.A0O(A00) instanceof Q7f)) {
                C14240no A0K = AbstractC58323PtF.A0K(this);
                A0K.A0G(Q7f.class, A00);
                A0K.A00();
            }
            AbstractC31180DnO.A1F(this, AbstractC58318PtA.A0L(this.A01).A07, new C65075Td4(this, 33), 4);
        } catch (Throwable th) {
            ((QKE) this).A05.EmQ("OxygenInstallSDK_UnexpectedException", th);
            A0G();
        }
    }

    private final void A02(Integer num, Integer num2, C09530e4... c09530e4Arr) {
        Class<?> cls;
        Integer num3;
        C44455JlN A0L = AbstractC58318PtA.A0L(this.A01);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        Fragment A0O = childFragmentManager.A0O(QIw.A00(childFragmentManager, this));
        if (A0O != null) {
            cls = A0O.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls, AbstractC60733ROs.class)) {
            if (C14360o3.A0K(cls, Q7f.class)) {
                num3 = C05F.A00;
            } else if (C14360o3.A0K(cls, C58754Q7g.class)) {
                num3 = C05F.A01;
            } else if (C14360o3.A0K(cls, C58755Q7h.class)) {
                num3 = C05F.A0Y;
            } else if (C14360o3.A0K(cls, Q7c.class)) {
                num3 = C05F.A0N;
            } else if (C14360o3.A0K(cls, Q7b.class)) {
                num3 = C05F.A0C;
            }
            AbstractC58323PtF.A1I(A0L, num, num2, num3, c09530e4Arr);
        }
        num3 = C05F.A0j;
        AbstractC58323PtF.A1I(A0L, num, num2, num3, c09530e4Arr);
    }

    public final void A0G() {
        Integer num = C05F.A1I;
        Integer num2 = C05F.A01;
        InterfaceC09390do interfaceC09390do = this.A01;
        A02(num, num2, AbstractC25230BEn.A1b("supportStatus", AbstractC61806Ru0.A00(AbstractC58318PtA.A0L(interfaceC09390do).A0A)));
        C44455JlN A0L = AbstractC58318PtA.A0L(interfaceC09390do);
        SBB sbb = ((QKE) this).A03;
        String str = A0L.A00.A05;
        C14360o3.A07(str);
        C14360o3.A07(A0L.A00.A04);
        C14360o3.A07(A0L.A00.A00);
        AbstractC14490oL.A07(sbb.A00.requireActivity(), "com.instagram.barcelona", str);
        A07();
    }

    public AbstractC60733ROs() {
        C57238PbM c57238PbM = new C57238PbM(this, 3);
        C57238PbM c57238PbM2 = new C57238PbM(this, 4);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A13 = AbstractC58322PtE.A13(c57238PbM2, enumC09460dv, 5);
        this.A01 = new C60842q8(new C57238PbM(A13, 6), c57238PbM, new C57254Pbc(36, null, A13), new C0YZ(C44455JlN.class));
        C57238PbM c57238PbM3 = new C57238PbM(this, 2);
        InterfaceC09390do A132 = AbstractC58322PtE.A13(new C57238PbM(this, 7), enumC09460dv, 8);
        this.A00 = new C60842q8(new C57238PbM(A132, 9), c57238PbM3, new C57254Pbc(37, null, A132), new C0YZ(Q8Y.class));
    }

    public static final void A01(AbstractC60733ROs abstractC60733ROs) {
        Intent intent;
        PackageManager packageManager;
        FragmentActivity activity = abstractC60733ROs.getActivity();
        if (activity != null && (packageManager = activity.getPackageManager()) != null) {
            intent = packageManager.getLaunchIntentForPackage(AbstractC58318PtA.A0L(abstractC60733ROs.A01).A08.A00());
        } else {
            intent = null;
        }
        abstractC60733ROs.A02(C05F.A02, C05F.A01, AbstractC25229BEm.A1b("supportStatus", AbstractC61806Ru0.A00(AbstractC58318PtA.A0L(abstractC60733ROs.A01).A0A), AbstractC166987dD.A1L("isLaunched", String.valueOf(C0b3.A00().A05().A0G(abstractC60733ROs.getActivity(), intent)))));
        abstractC60733ROs.A07();
    }

    @Override // X.UDB, X.AbstractC66383UEr, X.C0SG
    public final Dialog A0F(Bundle bundle) {
        return new DialogC60732ROr(requireContext(), this, A0E());
    }

    public final boolean A0H() {
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        if (!(childFragmentManager.A0O(QIw.A00(childFragmentManager, this)) instanceof C58755Q7h)) {
            return false;
        }
        A02(C05F.A0Y, C05F.A00, new C09530e4[0]);
        AbstractC10360h2 childFragmentManager2 = getChildFragmentManager();
        C14360o3.A07(childFragmentManager2);
        return childFragmentManager2.A18("javaClass", 1);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int i;
        String str;
        int A02 = C0f9.A02(-1515803724);
        C14360o3.A0B(layoutInflater, 0);
        A02(C05F.A15, C05F.A01, new C09530e4[0]);
        InterfaceC09390do interfaceC09390do = this.A01;
        int intValue = AbstractC58318PtA.A0L(interfaceC09390do).A0A.intValue();
        if (intValue != 1) {
            inflate = null;
            InterfaceC65489TlA interfaceC65489TlA = ((QKE) this).A05;
            if (intValue != 3) {
                Integer num = AbstractC58318PtA.A0L(interfaceC09390do).A0A;
                if (num != null) {
                    str = AbstractC61806Ru0.A00(num);
                } else {
                    str = "null";
                }
                interfaceC65489TlA.EmN("OxygenInstallSDK_SupportStatus", AnonymousClass001.A0R("Fallback on supportStatus = ", str));
                A0G();
                i = -1796309454;
            } else {
                interfaceC65489TlA.EmN("OxygenInstallSDK_AppInstalled", "Install isn't needed since app is already installed");
                A01(this);
                i = -429424700;
            }
        } else {
            inflate = layoutInflater.inflate(((QIw) ((QKE) this).A02.A02).A02, viewGroup, false);
            i = -886476398;
        }
        C0f9.A09(i, A02);
        return inflate;
    }
}
