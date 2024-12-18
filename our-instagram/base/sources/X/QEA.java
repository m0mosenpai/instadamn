package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class QEA extends QEB {
    public View A00;
    public boolean A01;

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        IgRadioGroup igRadioGroup;
        SZO szo;
        boolean z = requireArguments().getBoolean("is_payment_enabled", false);
        ((QEB) this).A09 = requireArguments().getBoolean("is_reconsent_enabled", false);
        ((QEB) this).A08 = requireArguments().getBoolean("is_consent_accepted", false);
        this.A01 = requireArguments().getBoolean("should_always_show_ads_disclosure", false);
        ((QEB) this).A0A = requireArguments().getBoolean("should_show_fbpay_disclosure", false);
        boolean z2 = ((QEB) this).A09;
        java.util.Set set = null;
        LayoutInflater from = LayoutInflater.from(requireActivity());
        if (z2) {
            View inflate = from.inflate(R.layout.layout_autofill_payment, (ViewGroup) null);
            this.A00 = inflate;
            ViewStub A0G = AbstractC31173DnH.A0G(inflate, R.id.autofill_contact_info_stub);
            SOY soy = ((QEB) this).A01;
            if (soy != null) {
                szo = soy.A00("CLICKED_LEARN_MORE", false).A00();
            } else {
                szo = null;
            }
            if (!this.A01 && ((QEB) this).A08) {
                AbstractC63046SbQ.A00(requireActivity(), this.mArguments, this.A00, null, ((QEB) this).A02, szo, 2131966018, R.id.manage_saved_info_caption_stub, 2131953420, z);
            } else {
                AbstractC63046SbQ.A00(requireActivity(), this.mArguments, this.A00, null, ((QEB) this).A02, szo, 2131972706, R.id.autofill_ads_disclosure_stub, 2131953420, z);
                AbstractC31173DnH.A0G(this.A00, R.id.manage_saved_info_caption_stub).inflate();
            }
            igRadioGroup = (IgRadioGroup) A0G.inflate();
            View view = this.A00;
            if (((QEB) this).A02 != null && A0I(true)) {
                C62620SJd c62620SJd = ((QEB) this).A02.A00;
                C14360o3.A0B(c62620SJd, 0);
                Calendar calendar = Calendar.getInstance();
                calendar.add(6, 30);
                long timeInMillis = calendar.getTimeInMillis();
                c62620SJd.A01.A00 = timeInMillis;
                IgdsListCell igdsListCell = (IgdsListCell) view.requireViewById(R.id.automatic_autofill_consent);
                igdsListCell.A0G(EnumC53237Nga.A08, true);
                igdsListCell.setTitleTextSize(45.0f);
                igdsListCell.setChecked(true);
                ((QEB) this).A02.A00.A01.A01 = true;
                Locale locale = Locale.getDefault();
                C14360o3.A0B(locale, 1);
                String format = new SimpleDateFormat("MM/dd/yyyy, hh:mm a", locale).format(new Date(timeInMillis));
                C14360o3.A07(format);
                igdsListCell.A0H(StringFormatUtil.formatStrLocaleSafe(getString(2131956644), format));
                igdsListCell.A0D(new C63533Sp0(this, 0));
                igdsListCell.setVisibility(0);
            }
            ViewOnClickListenerC63508Sob.A01(this.A00.requireViewById(R.id.not_now_button), 9, this);
        } else {
            View inflate2 = from.inflate(R.layout.layout_autofill, (ViewGroup) null);
            this.A00 = inflate2;
            igRadioGroup = (IgRadioGroup) inflate2.requireViewById(R.id.autofill_radio_group);
        }
        AbstractC63046SbQ.A01(this.A00, ((QEB) this).A0A);
        C5G6 c5g6 = ((QEB) this).A02;
        if (c5g6 != null) {
            set = c5g6.A00.A00.A07;
        }
        AbstractC63046SbQ.A02(this, igRadioGroup, ((QEB) this).A07, set, ((QEB) this).A09);
        ViewOnClickListenerC63509Soc.A00(this.A00.requireViewById(R.id.done_button), 5, igRadioGroup, this);
        AlertDialog create = new AlertDialog.Builder(requireActivity()).setView(this.A00).create();
        if (((QEF) this).A00) {
            create.setCanceledOnTouchOutside(false);
        }
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2058975640);
        super.onResume();
        boolean z = ((QEF) this).A00;
        View view = this.A00;
        if (z) {
            AbstractC167007dF.A0x(view.findViewById(R.id.autofill_bottomsheet_drag_handle));
        } else {
            ViewOnTouchListenerC63511Soe.A00(view.requireViewById(R.id.autofill_bottomsheet_drag_handle), 0, this);
        }
        C0f9.A09(-1001714845, A02);
    }
}
