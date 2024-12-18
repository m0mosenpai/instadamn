package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.EHq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32232EHq extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CollectionSelectMediaFragment";
    public C34522FJi A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_collection_select_media";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            String str2 = null;
            if (intent != null) {
                str2 = intent.getStringExtra("arg_guide_selected_media_id");
                str = intent.getStringExtra("arg_guide_selected_image_path");
            } else {
                str = null;
            }
            C34522FJi c34522FJi = this.A00;
            if (c34522FJi == null) {
                C14360o3.A0F("mediaSelectedCallback");
                throw C00O.createAndThrow();
            }
            C6FQ c6fq = c34522FJi.A00;
            InterfaceC103384lE interfaceC103384lE = c34522FJi.A01;
            C6FX A0I = AbstractC31179DnN.A0I(str2);
            A0I.A02(str);
            AbstractC25227BEk.A1M(c6fq, A0I, interfaceC103384lE);
        }
        C14240no c14240no = new C14240no(getParentFragmentManager());
        c14240no.A03(this);
        c14240no.A00();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1098622856);
        super.onCreate(bundle);
        C0f9.A09(-1039084858, A02);
    }
}
