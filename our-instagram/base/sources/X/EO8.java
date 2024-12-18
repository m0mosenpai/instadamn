package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EO8 extends AbstractC43842Ja5 {
    public static final String __redex_internal_original_name = "FanClubMemberListSortingOptionsFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this, C05F.A00);
    }

    public static final void A00(EO8 eo8, Integer num) {
        Integer num2 = C05F.A00;
        boolean z = true;
        C36197FyB c36197FyB = new C36197FyB(num2, AbstractC167007dF.A1X(num, num2));
        Integer num3 = C05F.A01;
        C36197FyB c36197FyB2 = new C36197FyB(num3, AbstractC167007dF.A1X(num, num3));
        Integer num4 = C05F.A0C;
        if (num != num4) {
            z = false;
        }
        eo8.A0B(AbstractC16960so.A1Q(c36197FyB, c36197FyB2, new C36197FyB(num4, z)));
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new EX8(this));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37073GVi.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }
}
