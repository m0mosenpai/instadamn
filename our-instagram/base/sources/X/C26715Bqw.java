package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.Locale;

/* renamed from: X.Bqw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26715Bqw extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ContentNotesConsumptionNuxFragment";
    public CP6 A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String format;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC111324zv.A00(2184));
        } else {
            str = null;
        }
        TextView A0N = AbstractC167007dF.A0N(view, R.id.title);
        Context context = view.getContext();
        if (str == null) {
            format = context.getString(2131956700);
        } else {
            format = String.format(Locale.getDefault(), context.getString(2131956701), str);
        }
        A0N.setText(format);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.audience_text);
        InterfaceC09390do interfaceC09390do = this.A01;
        F16.A00(A0N2, AbstractC166987dD.A0r(interfaceC09390do), AbstractC25227BEk.A0v(this, 2131956699));
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC25230BEn.A0l(interfaceC09390do));
        A0w.E77("has_seen_content_note_consumption_nux", true);
        A0w.apply();
        ((C64P) AbstractC166997dE.A0R(view, R.id.note_action_buttons)).setPrimaryAction(context.getString(2131956698), new ViewOnClickListenerC28667ClF(this, 31));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1616727456);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.content_notes_nux_landing, viewGroup, false);
        C0f9.A09(425190566, A02);
        return inflate;
    }
}
