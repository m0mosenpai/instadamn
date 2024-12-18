package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KPg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45801KPg extends KCM {
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeDisplayCodeIntroFragment";
    public final InterfaceC09390do A00 = C1XM.A00(new MHP(this, 5));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C64P c64p = (C64P) AbstractC166997dE.A0R(requireView(), R.id.bottom_button);
        KCM.A07(c64p, this, 50);
        KCM.A06(c64p, this, 51);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(requireView(), R.id.display_code_headline);
        igdsHeadline.setHeadline(2131961803);
        igdsHeadline.setBody(2131961801);
        igdsHeadline.EPC(new ViewOnClickListenerC48071LPw(this, 52), 2131961798);
        AbstractC2056898s A0b = AbstractC43592JPx.A0b(this.A00);
        Integer A02 = LLQ.A02(this);
        C14360o3.A0B(A02, 0);
        A0b.A05("OTC_DISPLAY_CODE_CONFIRM_IMPRESSION");
        A0b.A07("ENTRY_POINT", AbstractC46735Kls.A00(A02));
        A0b.A08("IS_OTC_V2", false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-166141941);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_display_code_intro_fragment, viewGroup, false);
        C0f9.A09(-1625186160, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(553549566);
        super.onDestroy();
        AbstractC43592JPx.A0b(this.A00).A02();
        C0f9.A09(1919827603, A02);
    }
}
