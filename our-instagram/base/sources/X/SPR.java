package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebookpay.addresstypeahead.repositoryimpl.AddressTypeaheadRepositoryImpl;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes10.dex */
public final class SPR {
    public final T2O A01;
    public final Wap A03;
    public final Wap A04;
    public final C69548VrC A05;
    public final C63147Sdt A07;
    public final C2GC A0B;
    public final T2N A0D;
    public final String A0H;
    public final Context A0I;
    public final C69548VrC A0J;
    public final InterfaceC08830cm A0K;
    public final InterfaceC08830cm A0L;
    public final InterfaceC08830cm A0M;
    public final ECPRepositoryImpl A08 = new ECPRepositoryImpl();
    public final C62991SaF A0E = new C62991SaF();
    public final T2M A0F = new T2M();
    public final C62712SNb A0G = new C62712SNb();
    public final C62636SJt A09 = new Object();
    public final OffsitePaymentRepositoryImpl A0C = new Object();
    public final C62635SJs A06 = new Object();
    public final AddressTypeaheadRepositoryImpl A00 = new AddressTypeaheadRepositoryImpl();
    public final C62433SBj A0A = new C62433SBj();
    public final C62432SBh A02 = new C62432SBh();

    public final Fragment A01(Bundle bundle, String str) {
        C14360o3.A0B(str, 0);
        Fragment A01 = ((SNK) this.A0K.get()).A01(bundle, str);
        C14360o3.A07(A01);
        return A01;
    }

    public final C62637SJu A02() {
        Object obj = this.A0L.get();
        C14360o3.A07(obj);
        return (C62637SJu) obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.SJt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.SJs, java.lang.Object] */
    public SPR(Context context, Wap wap, C69548VrC c69548VrC, C2GC c2gc, String str, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        this.A0I = context;
        this.A0K = interfaceC08830cm;
        this.A0M = interfaceC08830cm2;
        this.A03 = wap;
        this.A0J = c69548VrC;
        this.A0B = c2gc;
        this.A0H = str;
        this.A0L = interfaceC08830cm3;
        this.A01 = new T2O(context);
        this.A0D = new T2N(context);
        this.A07 = new C63147Sdt(context);
        this.A04 = wap;
        this.A05 = c69548VrC;
    }

    public final View A00(Context context, ViewGroup viewGroup, VG3 vg3) {
        int i;
        AbstractC167017dG.A1N(context, vg3);
        this.A0M.get();
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        switch (vg3.ordinal()) {
            case 0:
                i = R.layout.ecp_pux_banner;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 10:
            case 11:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 49:
                i = R.layout.ecp_pux_list_cell;
                break;
            case 6:
                i = R.layout.ecp_pux_list_cell_entity;
                break;
            case 8:
                i = R.layout.ecp_pux_price_table;
                break;
            case 9:
                i = R.layout.ecp_disclaimer;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 23:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                i = R.layout.ecp_accordion_view;
                break;
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 44:
            default:
                throw AbstractC37303Gc4.A0M(vg3, "{ECPWidgetFactory} Widget is not found for identifier => ", AbstractC166987dD.A1C());
            case 24:
                i = R.layout.fbpay_button;
                break;
            case 25:
                i = R.layout.ecp_progress_icon_button;
                break;
            case 26:
                i = R.layout.ecp_auto_advance_button;
                break;
            case 37:
                i = R.layout.ecp_confirmation_payment_section_view;
                break;
            case 38:
                i = R.layout.ecp_confirmation_product_upsell_section_header_view;
                break;
            case 39:
                i = R.layout.ecp_confirmation_product_upsell_view;
                break;
            case 40:
                i = R.layout.ecp_anon_checkout_pux_link;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                i = R.layout.ecp_anon_checkout_toggle_shimmer;
                break;
            case 43:
                i = R.layout.ecp_inline_action_menu;
                break;
            case 45:
                i = R.layout.ecp_inline_back_button;
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                i = R.layout.ecp_apm_view;
                break;
            case 47:
                i = R.layout.ecp_email_optin;
                break;
            case 48:
                i = R.layout.ecp_invisible_header;
                break;
            case 51:
                i = R.layout.ecp_incentive_inline_view;
                break;
            case 52:
                i = R.layout.ecp_checkout_optionality;
                break;
        }
        View inflate = from.inflate(i, viewGroup, false);
        C14360o3.A07(inflate);
        return inflate;
    }
}
