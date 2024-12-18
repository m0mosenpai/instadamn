package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.Bro, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26767Bro extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CaptionSettingFragment";
    public Context A00;
    public boolean A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A01) {
            interfaceC56362iU.Efu(2131973570);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "caption_settings_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object value;
        Integer num;
        CharSequence charSequence;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C25820Bbb c25820Bbb = (C25820Bbb) this.A03.getValue();
        C05A c05a = c25820Bbb.A01;
        do {
            value = c05a.getValue();
            UserSession userSession = c25820Bbb.A00;
            if (AbstractC75343a1.A07(userSession)) {
                num = C05F.A00;
            } else if (AbstractC75373a4.A06(userSession)) {
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
            C14360o3.A0B(num, 0);
        } while (!c05a.AIi(value, new C51756Mtf(25, num)));
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.clips_translations_always_show_captions_button);
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
        igdsListCell.setTextCellType(enumC53237Nga);
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.clips_translations_show_translated_captions_button);
        igdsListCell2.setTextCellType(enumC53237Nga);
        IgdsListCell igdsListCell3 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.clips_translations_never_show_captions_button);
        igdsListCell3.setTextCellType(enumC53237Nga);
        igdsListCell.A0D(new C28693Clf(this, 0));
        igdsListCell2.A0D(new C28693Clf(this, 1));
        igdsListCell3.A0D(new C28693Clf(this, 2));
        BYX byx = new BYX(this, 1);
        Context context = this.A00;
        if (context != null) {
            String A0p = AbstractC166997dE.A0p(context, 2131956032);
            TextView A0N = AbstractC167007dF.A0N(view, R.id.clips_translations_show_translated_captions_description);
            AbstractC25227BEk.A11(A0N);
            boolean z = this.A01;
            Context context2 = this.A00;
            if (z) {
                if (context2 != null) {
                    charSequence = AbstractC167007dF.A0f(context2, A0p, 2131956030);
                    A0N.setText(charSequence);
                    C07S c07s = C07S.STARTED;
                    C07X viewLifecycleOwner = getViewLifecycleOwner();
                    AbstractC166987dD.A1Z(new MCR(viewLifecycleOwner, c07s, igdsListCell, igdsListCell3, this, igdsListCell2, (InterfaceC23621Ds) null, 12), C07Y.A00(viewLifecycleOwner));
                    return;
                }
            } else if (context2 != null) {
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC167007dF.A0f(context2, A0p, 2131956030));
                AnonymousClass773.A05(A0H, byx, A0p);
                charSequence = A0H;
                A0N.setText(charSequence);
                C07S c07s2 = C07S.STARTED;
                C07X viewLifecycleOwner2 = getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new MCR(viewLifecycleOwner2, c07s2, igdsListCell, igdsListCell3, this, igdsListCell2, (InterfaceC23621Ds) null, 12), C07Y.A00(viewLifecycleOwner2));
                return;
            }
        }
        C14360o3.A0F("context");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C26767Bro() {
        X32 x32 = new X32(this, 40);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X32(new X32(this, 37), 38));
        this.A03 = AbstractC25225BEi.A0a(new X32(A00, 39), x32, new D8L(3, null, A00), AbstractC25225BEi.A1D(C25820Bbb.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1552901272);
        super.onCreate(bundle);
        this.A00 = requireContext();
        this.A01 = requireArguments().getBoolean("is_in_app_settings");
        C0f9.A09(-1047148223, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(256438936);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.caption_setting_bottomsheet, false);
        C0f9.A09(1895311162, A02);
        return A0R;
    }
}
