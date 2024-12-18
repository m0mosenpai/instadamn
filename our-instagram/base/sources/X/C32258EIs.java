package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.EIs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32258EIs extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ReportTranslationsBottomSheetFragment";
    public Context A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "report_translations_bottomsheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.report_translations_bottomsheet_layout);
        Context context = this.A00;
        if (context != null) {
            IgdsListCell igdsListCell = new IgdsListCell(context, null);
            Context context2 = this.A00;
            if (context2 != null) {
                AbstractC31180DnO.A12(context2, igdsListCell, 2131972415);
                A0C.addView(igdsListCell);
                if (this.A03) {
                    Context context3 = this.A00;
                    if (context3 != null) {
                        A00(A0C, this, AbstractC166997dE.A0p(context3, 2131972408), 66);
                    }
                }
                if (this.A04) {
                    Context context4 = this.A00;
                    if (context4 != null) {
                        A00(A0C, this, AbstractC166997dE.A0p(context4, 2131972416), 67);
                        Context context5 = this.A00;
                        if (context5 != null) {
                            A00(A0C, this, AbstractC166997dE.A0p(context5, 2131972406), 68);
                            Context context6 = this.A00;
                            if (context6 != null) {
                                A00(A0C, this, AbstractC166997dE.A0p(context6, 2131972407), 69);
                                Context context7 = this.A00;
                                if (context7 != null) {
                                    A00(A0C, this, AbstractC166997dE.A0p(context7, 2131972389), 70);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F("context");
        throw C00O.createAndThrow();
    }

    public static void A00(ViewGroup viewGroup, C32258EIs c32258EIs, CharSequence charSequence, int i) {
        ViewOnClickListenerC35690FpP viewOnClickListenerC35690FpP = new ViewOnClickListenerC35690FpP(c32258EIs, i);
        Context context = c32258EIs.A00;
        if (context == null) {
            C14360o3.A0F("context");
            throw C00O.createAndThrow();
        }
        IgdsListCell igdsListCell = new IgdsListCell(context, null);
        igdsListCell.A0I(charSequence);
        igdsListCell.A0G(EnumC53237Nga.A09, true);
        C0fQ.A00(viewOnClickListenerC35690FpP, igdsListCell);
        viewGroup.addView(igdsListCell);
    }

    public static final void A01(EnumC33489ErO enumC33489ErO, EnumC33480ErF enumC33480ErF, C32258EIs c32258EIs) {
        Long A0k;
        String str = c32258EIs.A01;
        if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
            InterfaceC09390do interfaceC09390do = c32258EIs.A05;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0M(c32258EIs, interfaceC09390do), "instagram_reels_translations_error_report");
            if (A0f.isSampled()) {
                A0f.A8R(enumC33480ErF, "translation_type");
                A0f.A8R(enumC33489ErO, "error_type");
                A0f.A9K("media_id", A0k);
                AbstractC25225BEi.A1O(A0f, "report_translations_bottomsheet_fragment");
                String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
                C14360o3.A0B(A0t, 0);
                A0f.A9K("reporter_id", AbstractC003100w.A0k(10, A0t));
                A0f.AAP("locale", C1Q2.A02().getLanguage());
                A0f.Cht();
            }
        }
        AbstractC167007dF.A16(F86.A00(AbstractC25230BEn.A0m(c32258EIs)));
        C146106i8 A0K = AbstractC31171DnF.A0K();
        Context context = c32258EIs.A00;
        if (context == null) {
            C14360o3.A0F("context");
            throw C00O.createAndThrow();
        }
        AbstractC25226BEj.A1N(context, A0K, 2131972413);
        A0K.A02();
        A0K.A07(R.drawable.instagram_circle_check_pano_outline_24);
        AbstractC25233BEq.A1F(A0K);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(38725653);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("show_text_translations_error_rows");
        this.A04 = requireArguments.getBoolean("show_voice_translations_error_rows");
        this.A01 = requireArguments.getString("translation_error_media_id");
        this.A02 = requireArguments.getBoolean("has_closed_caption_translations");
        this.A00 = requireContext();
        C0f9.A09(-689297240, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-250799817);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.report_translations_bottomsheet, false);
        C0f9.A09(1534086398, A02);
        return A0R;
    }
}
