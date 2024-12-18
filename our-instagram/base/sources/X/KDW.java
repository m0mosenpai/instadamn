package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collection;

/* loaded from: classes8.dex */
public final class KDW extends AbstractC59962oe implements InterfaceC1119153d {
    public static final String __redex_internal_original_name = "OpenCarouselReviewPageFilterFragment";
    public C47442KxX A00;
    public EnumC46210Kcm A01;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final String A04 = "open_carousel_review_page_filter_fragment";
    public final InterfaceC74953Yl A02 = AbstractC25230BEn.A0U(EnumC46210Kcm.A04);

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        Object value;
        C37838Gks c37838Gks;
        C47442KxX c47442KxX = this.A00;
        if (c47442KxX != null) {
            InterfaceC74953Yl interfaceC74953Yl = this.A02;
            EnumC46210Kcm enumC46210Kcm = (EnumC46210Kcm) interfaceC74953Yl.getValue();
            boolean A1a = AbstractC25229BEm.A1a(interfaceC74953Yl.getValue(), this.A01);
            C14360o3.A0B(enumC46210Kcm, 0);
            if (A1a) {
                C05A c05a = ((C38333GtS) c47442KxX.A00.A0D.getValue()).A04;
                do {
                    value = c05a.getValue();
                    c37838Gks = (C37838Gks) value;
                } while (!c05a.AIi(value, C37838Gks.A00(c37838Gks, null, enumC46210Kcm, null, AbstractC001800i.A0T(C49382LsG.A00, (Collection) c37838Gks.A02), null, null, null, 109)));
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2092723040);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30191DRw(this, 5), -1618745220);
        C0f9.A09(-884182577, A02);
        return A00;
    }
}
