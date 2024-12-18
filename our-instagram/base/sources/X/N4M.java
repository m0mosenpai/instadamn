package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N4M extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AudioTranslationsOptionsLanguageSelectorFragment";
    public N5S A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "audio_translations_options_language_selector_fragment";
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.Mqf, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IgdsListCell igdsListCell;
        boolean A1a;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.audio_translations_enabled_group);
        InterfaceC09390do interfaceC09390do = this.A01;
        UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        List A13 = AbstractC43592JPx.A13("eng", "spa");
        C06090Tz c06090Tz = C06090Tz.A05;
        String A04 = C18U.A04(c06090Tz, A0K, 36886042426999486L);
        if (A04.length() != 0) {
            A13 = AbstractC167007dF.A0m(A04, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            String A01 = AbstractC75373a4.A01(A1B);
            C14360o3.A0B(A1B, 1);
            ?? obj = new Object();
            obj.A01 = A1B;
            obj.A00 = A01;
            A1E.add(obj);
        }
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            C51587Mqf c51587Mqf = (C51587Mqf) it2.next();
            View inflate = AbstractC25228BEl.A0P(A0C).inflate(R.layout.audio_translations_language_selector_row, A0C, false);
            if ((inflate instanceof IgdsListCell) && (igdsListCell = (IgdsListCell) inflate) != null) {
                igdsListCell.setTextCellType(EnumC53237Nga.A03);
                igdsListCell.A0I(c51587Mqf.A00);
                List A00 = ((C50985Mfs) this.A02.getValue()).A00();
                if (AbstractC166987dD.A1b(A00)) {
                    A1a = A00.contains(c51587Mqf);
                } else {
                    A1a = AbstractC25225BEi.A1a(c51587Mqf.A01, C1Q2.A03().getISO3Language());
                }
                igdsListCell.setChecked(A1a);
                igdsListCell.A0D(new C55516Ol9(7, igdsListCell, c51587Mqf, this));
                A0C.addView(igdsListCell);
            }
        }
        if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36323092473392068L)) {
            Context A0L = AbstractC166997dE.A0L(view);
            IgTextView igTextView = new IgTextView(A0L);
            AbstractC166987dD.A1P(A0L, igTextView, 2131955319);
            AbstractC50522MSa.A0z(igTextView);
            AbstractC166987dD.A1O(A0L, igTextView, R.color.igds_secondary_text);
            igTextView.setPadding(A0L.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), 0, AbstractC166997dE.A04(A0L, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC167017dG.A0E(A0L));
            A0C.addView(igTextView);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public N4M() {
        C0YZ A1D = AbstractC25225BEi.A1D(C50985Mfs.class);
        this.A02 = AbstractC25225BEi.A0a(new C57515Pfp(this, 41), new C57515Pfp(this, 42), new D8J(35, null, this), A1D);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(530498174);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.audio_translations_enabled_bottomsheet, false);
        C0f9.A09(-823333988, A02);
        return A0R;
    }
}
