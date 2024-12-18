package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.Ekz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33211Ekz extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TranslationOptionsFragment";
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final String A07 = "translation_options";
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (!this.A02) {
            interfaceC56362iU.Efu(2131973614);
        }
    }

    @Override // X.AbstractC33235ElU
    public final int getBottomPadding() {
        return 0;
    }

    @Override // X.AbstractC33235ElU
    public final int getTopPadding() {
        return 0;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        boolean z = this.A02;
        ArrayList A1E = AbstractC166987dD.A1E();
        InterfaceC09390do interfaceC09390do = this.A06;
        boolean A04 = AbstractC75373a4.A04(AbstractC166987dD.A0r(interfaceC09390do));
        boolean A02 = AbstractC75373a4.A02(AbstractC166987dD.A0r(interfaceC09390do));
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36328173419511079L) && this.A02) {
            A1E.add(new C35200Ffs(ViewOnClickListenerC35679FpE.A00(this, 1), 2131975718));
        }
        if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36328173419380005L) && this.A02) {
            A1E.add(new C35200Ffs(ViewOnClickListenerC35679FpE.A00(this, 0), 2131961104));
            C35246Fgf.A02(A1E, 2131961105);
        }
        if (A04) {
            AbstractC33235ElU.A09(this, A1E, 2, 2131953391, AbstractC75373a4.A07(AbstractC166987dD.A0r(interfaceC09390do)));
            C35246Fgf.A02(A1E, 2131953392);
        }
        if (A02) {
            AbstractC33235ElU.A09(this, A1E, 3, 2131953389, AbstractC75373a4.A05(AbstractC166987dD.A0r(interfaceC09390do)));
            C35246Fgf.A02(A1E, 2131953390);
        }
        boolean A07 = AbstractC75373a4.A07(AbstractC166987dD.A0r(interfaceC09390do));
        boolean A05 = AbstractC75373a4.A05(AbstractC166987dD.A0r(interfaceC09390do));
        if ((A07 && (this.A03 || this.A05)) || (A05 && this.A04)) {
            A1E.add(new C35200Ffs(new ViewOnClickListenerC35583Fna(this, 0, A07, A05), 2131972414));
        }
        if (z) {
            setBottomSheetMenuItems(A1E);
        } else {
            setItems(A1E);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // X.AbstractC33235ElU
    public final boolean isElevated() {
        return this.A02;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1628238721);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getBoolean("is_surface_elevated");
        this.A00 = AbstractC31173DnH.A0k(requireArguments, "entrypoint");
        this.A01 = requireArguments.getString("media_id");
        this.A03 = requireArguments.getBoolean("media_has_caption_translations");
        this.A05 = requireArguments.getBoolean("media_has_sticker_dubbing");
        this.A04 = requireArguments.getBoolean("media_has_dubbing");
        C0f9.A09(2029097885, A02);
    }
}
