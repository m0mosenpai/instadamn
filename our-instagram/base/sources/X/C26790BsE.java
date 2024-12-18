package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;

/* renamed from: X.BsE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26790BsE extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ContextualBackgroundFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02;
    public final String A03;

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A00(this, false);
        return true;
    }

    public static final void A00(C26790BsE c26790BsE, boolean z) {
        EnumC27371C6a enumC27371C6a;
        ContextualBackgroundViewModel contextualBackgroundViewModel = (ContextualBackgroundViewModel) c26790BsE.A02.getValue();
        C27949CTj c27949CTj = contextualBackgroundViewModel.A00;
        if (z) {
            enumC27371C6a = EnumC27371C6a.A02;
        } else if (((C51739MtM) contextualBackgroundViewModel.A0A.getValue()).A02 == C05F.A00) {
            enumC27371C6a = EnumC27371C6a.A04;
        } else {
            enumC27371C6a = EnumC27371C6a.A03;
        }
        C22C A01 = AnonymousClass229.A01(c27949CTj.A01);
        String str = c27949CTj.A00.A00;
        int ordinal = enumC27371C6a.ordinal();
        int i = 3;
        if (ordinal != 0) {
            i = 2;
            if (ordinal != 1) {
                i = 1;
            }
        }
        A01.A1f(C81W.A05, str, i);
        ((C8XO) c26790BsE.A00.getValue()).A00(C8XI.A04);
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 43), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26790BsE() {
        DH4 dh4 = new DH4(this, 15);
        DH4 dh42 = new DH4(this, 16);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new DH4(dh4, 11));
        this.A02 = AbstractC25225BEi.A0a(new DH4(A00, 12), dh42, new DH0(3, null, A00), AbstractC25225BEi.A1D(ContextualBackgroundViewModel.class));
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new DH4(new DH4(this, 8), 13));
        C0YZ A1D = AbstractC25225BEi.A1D(C8XO.class);
        this.A00 = AbstractC25225BEi.A0a(new DH4(A002, 14), new DH0(5, A002, this), new DH0(4, null, A002), A1D);
        this.A03 = "contextualbackground_fragment";
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1820998453);
        Parcelable parcelable = requireArguments().getParcelable("ORIGINAL_IMAGE_DATA_ARG");
        if (parcelable != null) {
            InterfaceC09390do interfaceC09390do = this.A02;
            ContextualBackgroundViewModel contextualBackgroundViewModel = (ContextualBackgroundViewModel) interfaceC09390do.getValue();
            if (!parcelable.equals(contextualBackgroundViewModel.A08.getValue())) {
                AbstractC166987dD.A1Z(new C57171PZp(parcelable, contextualBackgroundViewModel, (InterfaceC23621Ds) null, 22), AbstractC141776au.A00(contextualBackgroundViewModel));
            }
            ContextualBackgroundViewModel contextualBackgroundViewModel2 = (ContextualBackgroundViewModel) interfaceC09390do.getValue();
            C27949CTj c27949CTj = new C27949CTj(contextualBackgroundViewModel2.A01);
            contextualBackgroundViewModel2.A00 = c27949CTj;
            AnonymousClass229.A01(c27949CTj.A01).A1g(C81W.A05, c27949CTj.A00.A00, 1);
            super.onCreate(bundle);
            C0f9.A09(1940927689, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1491030538, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-765927869);
        ComposeView A00 = AbstractC25319BIo.A00(this, new DS9(8, this, requireArguments().getBoolean("IS_FOOTER_BELOW_MEDIA_ARG")), 265180763);
        C0f9.A09(-447686947, A02);
        return A00;
    }
}
