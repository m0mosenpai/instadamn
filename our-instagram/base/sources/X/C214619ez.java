package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.9ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214619ez extends C214899fR {
    public static final String __redex_internal_original_name = "ArDynamicAdsCameraFragment";
    public View A00;
    public View A01;
    public C23100AGm A02;
    public AbstractC131215w9 A03;
    public BCJ A04;
    public A4O A05;
    public AX0 A06;
    public C69574Vrd A07;
    public A83 A08;
    public Integer A09;
    public C225609xf A0A;
    public final InterfaceC09390do A0C = AbstractC09440dt.A01(new C57508Pfi(this, 11));
    public final AC1 A0B = new AC1(this);

    @Override // X.C214899fR, X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(1312);
    }

    @Override // X.C214899fR, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC131215w9 abstractC131215w9 = this.A03;
        if (abstractC131215w9 == null) {
            str = "arAdsDataStore";
        } else {
            String str2 = A03().A07;
            if (str2 != null) {
                UPS A00 = abstractC131215w9.A00(str2);
                if (A00 != null) {
                    C69574Vrd c69574Vrd = this.A07;
                    if (c69574Vrd == null) {
                        str = "productCardViewController";
                    } else {
                        c69574Vrd.A00(A00, A03().A02, A03().A01);
                    }
                }
                C23432Aa5.A00(A01().A03.A09).ETP(false);
                ViewGroup viewGroup = super.A00;
                if (viewGroup != null) {
                    int dimension = (int) viewGroup.getResources().getDimension(R.dimen.asset_picker_redesign_sticker_height);
                    ViewGroup viewGroup2 = super.A00;
                    if (viewGroup2 != null) {
                        AbstractC13880nE.A0U(viewGroup2, dimension);
                        AC1 ac1 = this.A0B;
                        int intValue = A04().intValue();
                        if (intValue != 1) {
                            if (intValue == 0) {
                                ac1.A01();
                                return;
                            }
                            return;
                        }
                        ac1.A00();
                        return;
                    }
                }
                str = "instructionView";
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.9xf] */
    @Override // X.C214899fR, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214619ez.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C214899fR, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1638420914);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ar_dynamic_ads_camera_fragment_layout, viewGroup, false);
        C14360o3.A0A(inflate);
        C69574Vrd c69574Vrd = new C69574Vrd(AbstractC56372iV.A01(inflate.findViewById(R.id.product_card_stub), false, false));
        c69574Vrd.A01 = new AB0(this);
        this.A07 = c69574Vrd;
        Integer num = this.A09;
        if (num == null) {
            C14360o3.A0F("effectMode");
            throw C00O.createAndThrow();
        }
        if (num == C05F.A0C) {
            View requireViewById = inflate.requireViewById(R.id.ar_3d_toggle_button);
            this.A00 = requireViewById.requireViewById(R.id.arlayout);
            this.A01 = requireViewById;
            C14360o3.A0C(requireViewById, "null cannot be cast to non-null type com.facebook.arcommercecamera.interfaces.CommerceCameraToggleButton");
            C23100AGm c23100AGm = new C23100AGm((BBL) requireViewById, new C22830A4z(this), this, A04());
            ((View) c23100AGm.A01).setVisibility(0);
            this.A02 = c23100AGm;
            this.A08 = new A83(requireActivity(), AbstractC166987dD.A0r(this.A0M));
        }
        C0f9.A09(-2133159382, A02);
        return inflate;
    }
}
