package X;

import android.os.Bundle;
import com.facebook.R;
import java.util.Collection;

/* renamed from: X.Eas, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32727Eas extends EOD {
    public static final String __redex_internal_original_name = "ChannelDiscoverySuggestionsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC37167GZe A02;
    public final FFK A03;
    public final FP7 A04;
    public final MQH A05;

    /* JADX WARN: Type inference failed for: r13v0, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        InterfaceC09390do interfaceC09390do = super.A05;
        return AbstractC16960so.A1Q(new C32635EYj(this, AbstractC166987dD.A0r(interfaceC09390do), this.A03), new C32646EYu(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do), this.A02, true), new C32628EYc(requireContext(), this.A04), new C43999Jcm(AbstractC166987dD.A0r(interfaceC09390do), this.A05), new Object(), new C65721Tsu(super.A02, null, null, R.layout.direct_empty_view));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public C32727Eas() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A00 = C37055GUl.A00(this, enumC09460dv, 31);
        C37055GUl c37055GUl = new C37055GUl(this, 35);
        InterfaceC09390do A00 = C37055GUl.A00(new C37055GUl(this, 32), enumC09460dv, 33);
        this.A01 = AbstractC25225BEi.A0a(new C37055GUl(A00, 34), c37055GUl, new C50172MDz(31, null, A00), AbstractC25225BEi.A1D(AbstractC32730Eaw.class));
        this.A03 = new FFK(this);
        this.A02 = new G1h(this);
        this.A04 = new FP7(this);
        this.A05 = new C36741GHk(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1276507570);
        super.onCreate(bundle);
        C0f9.A09(-2061139010, A02);
    }
}
