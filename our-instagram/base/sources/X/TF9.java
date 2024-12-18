package X;

import com.facebook.react.modules.intent.IntentModule;

/* loaded from: classes10.dex */
public final class TF9 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IdVerificationLogger";
    public final C18920wW A00;

    public final void A00(EnumC61065Ree enumC61065Ree, EnumC61067Reg enumC61067Reg, String str) {
        EnumC61064Red enumC61064Red;
        if (str == null) {
            enumC61064Red = EnumC61064Red.A02;
        } else if (!str.equals("idv_reactive")) {
            return;
        } else {
            enumC61064Red = EnumC61064Red.A01;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_idv_client");
        A0f.A8R(enumC61064Red.A00, "product");
        A0f.A8R(enumC61065Ree.A00, "action");
        A0f.A8R(enumC61067Reg.A00, "screen");
        A0f.AAP(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, null);
        A0f.Cht();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "id_verification";
    }

    public TF9(AbstractC12990ll abstractC12990ll) {
        this.A00 = AbstractC12220kQ.A01(this, abstractC12990ll);
    }
}
