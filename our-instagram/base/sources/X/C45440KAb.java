package X;

import android.os.Bundle;

/* renamed from: X.KAb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45440KAb extends AbstractC45465KBa {
    public static final String __redex_internal_original_name = "CommentAvatarStickerGridFragment";
    public String A01;
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(new C29906DGu(this, 30), new C29906DGu(this, 29), new D8L(23, null, this), AbstractC25225BEi.A1D(C167377dr.class));
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(new C29906DGu(this, 31), new C29906DGu(this, 28), new D8L(24, null, this), AbstractC25225BEi.A1D(C143266dR.class));
    public String A00 = "ig_comments";
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return AnonymousClass001.A0R(str, "_avatar_sticker_grid");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1196100047);
        super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A01 = string;
            super.A04 = EnumC143286dT.A05;
            this.A0H = true;
            this.A0J = true;
            this.A0F = true;
            C0f9.A09(-1646538573, A02);
            return;
        }
        IllegalStateException A14 = AbstractC166987dD.A14("previous module required");
        C0f9.A09(-1885466775, A02);
        throw A14;
    }
}
