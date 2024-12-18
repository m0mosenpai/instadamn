package X;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.LeU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48592LeU implements MSD {
    public static final String __redex_internal_original_name = "LinkStickerCreationController";
    public C1OK A00;
    public L57 A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC186178Nl A07;
    public final AnonymousClass840 A08;
    public final InterfaceC09390do A09;
    public final int A0A;
    public final ViewStub A0B;
    public final java.util.Set A0C;

    public C48592LeU(Activity activity, ViewStub viewStub, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC186178Nl interfaceC186178Nl, AnonymousClass840 anonymousClass840) {
        C14360o3.A0B(viewStub, 2);
        this.A03 = activity;
        this.A0B = viewStub;
        this.A07 = interfaceC186178Nl;
        this.A08 = anonymousClass840;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        Context context = viewStub.getContext();
        this.A04 = context;
        this.A09 = MHQ.A00(this, 31);
        this.A0A = context.getColor(AbstractC53242c7.A09(activity));
        this.A0C = AbstractC31171DnF.A0l();
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    public static final String A00(C48592LeU c48592LeU) {
        IgEditText igEditText;
        Editable text;
        L57 l57 = c48592LeU.A01;
        if (l57 != null && (igEditText = l57.A06) != null && (text = igEditText.getText()) != null) {
            return text.toString();
        }
        return null;
    }

    public static final void A01(C48592LeU c48592LeU) {
        int i;
        L57 l57 = c48592LeU.A01;
        if (l57 != null) {
            String A00 = A00(c48592LeU);
            if (A00 != null && A00.length() != 0) {
                IgTextView igTextView = l57.A08;
                igTextView.setEnabled(true);
                i = -1;
                igTextView.setTextColor(-1);
                l57.A03.setEnabled(true);
            } else {
                IgTextView igTextView2 = l57.A08;
                igTextView2.setEnabled(false);
                i = c48592LeU.A0A;
                igTextView2.setTextColor(i);
                l57.A03.setEnabled(false);
            }
            l57.A04.setColorFilter(i);
            l57.A07.setTextColor(i);
        }
    }

    public static final void A02(C48592LeU c48592LeU, boolean z) {
        EnumC183928Dt enumC183928Dt;
        if (z) {
            enumC183928Dt = EnumC183928Dt.A0C;
        } else {
            enumC183928Dt = EnumC183928Dt.A08;
        }
        C22C A01 = AnonymousClass229.A01(c48592LeU.A06);
        String valueOf = String.valueOf(enumC183928Dt.A00);
        C1816783z c1816783z = c48592LeU.A08.A02;
        String A04 = c1816783z.A04();
        AbstractC449424y.A01(c1816783z.A03());
        A01.A20("link_sticker_creation", valueOf, A04, c1816783z.A01().A01);
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A0C;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.MSD
    public final void E2K() {
        AnonymousClass229.A01(this.A06).A25(AbstractC43594JPz.A10(EnumC183928Dt.A0C.A00), this.A08.A02.A01().A01);
        if (!AbstractC167007dF.A1W(this.A01)) {
            View inflate = this.A0B.inflate();
            C14360o3.A0A(inflate);
            L57 l57 = new L57(inflate, inflate.requireViewById(R.id.link_sticker_list_cancel_button), inflate.requireViewById(R.id.link_sticker_custom_cta_row), inflate.requireViewById(R.id.link_sticker_custom_cta_edit_container), AbstractC31173DnH.A0I(inflate, R.id.link_sticker_custom_cta_row_icon), (IgEditText) inflate.requireViewById(R.id.link_sticker_custom_cta_edit_text), (IgEditText) inflate.requireViewById(R.id.link_sticker_list_web_url_edit_text), AbstractC31172DnG.A0X(inflate, R.id.link_sticker_list_done_button), AbstractC31172DnG.A0X(inflate, R.id.link_sticker_custom_cta_row_title), AbstractC31172DnG.A0X(inflate, R.id.link_sticker_list_url_entry_description));
            this.A01 = l57;
            this.A0C.add(l57.A01);
            IgTextView igTextView = l57.A09;
            Context context = this.A04;
            String A0p = AbstractC166997dE.A0p(context, 2131969913);
            String A0b = AbstractC31177DnL.A0b(context, A0p, 2131965248);
            C44384JjN c44384JjN = new C44384JjN(context, new C47288Kuz(this));
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0b);
            AnonymousClass773.A05(A0H, c44384JjN, A0p);
            AbstractC31176DnK.A1G(igTextView, A0H);
            igTextView.setHighlightColor(0);
            ViewOnClickListenerC48063LPo.A00(l57.A03, 0, l57);
            ViewOnClickListenerC48063LPo.A00(l57.A08, 1, this);
            ViewOnClickListenerC48063LPo.A00(l57.A00, 2, this);
        }
        A01(this);
        L57 l572 = this.A01;
        if (l572 != null) {
            l572.A03.setVisibility(0);
            l572.A02.setVisibility(8);
            IgEditText igEditText = l572.A06;
            igEditText.requestFocus();
            LO2.A00(igEditText, this, 2);
            AbstractC13880nE.A0R(igEditText);
        }
    }

    @Override // X.MSD
    public final void close() {
        L57 l57 = this.A01;
        if (l57 != null) {
            l57.A06.setText("");
            l57.A06.clearFocus();
            IgEditText igEditText = l57.A05;
            igEditText.setText("");
            igEditText.clearFocus();
            AbstractC13880nE.A0O(l57.A01);
        }
        C1OK c1ok = this.A00;
        if (c1ok != null) {
            c1ok.A00();
        }
        this.A00 = null;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "link_sticker_creation";
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }
}
