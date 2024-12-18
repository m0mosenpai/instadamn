package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class V00 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FundraiserDonationBottomsheetFragment";
    public Context A00;
    public View A01;
    public ScrollView A02;
    public TextView A03;
    public UserSession A04;
    public C44G A05;
    public InterfaceC71931XAz A06;
    public EnumC68135VCu A07;
    public W9B A08;
    public User A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G = false;
    public ABF A0H;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        if (i == 1 && intent != null && i2 == -1) {
            if (AbstractC111324zv.A00(1567).equals(intent.getStringExtra(AbstractC111324zv.A00(303)))) {
                ABF abf = this.A0H;
                String str = this.A0E;
                str.getClass();
                InterfaceC19630xq interfaceC19630xq = abf.A00.A01;
                String A00 = AbstractC111324zv.A00(2894);
                HashSet hashSet = new HashSet(interfaceC19630xq.C2v(A00));
                StringBuilder A11 = AbstractC166997dE.A11(str);
                A11.append(':');
                A11.append(System.currentTimeMillis());
                AbstractC166997dE.A1S(A11, hashSet);
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.EEj(A00);
                ARD.apply();
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7L(A00, hashSet);
                ARD2.apply();
            } else {
                z = false;
            }
            InterfaceC71931XAz interfaceC71931XAz = this.A06;
            if (interfaceC71931XAz != null) {
                interfaceC71931XAz.D2y(z, intent.getBooleanExtra(AbstractC111324zv.A00(1655), false));
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (EnumC68135VCu.LIVE.equals(this.A07)) {
            return "live_fundraiser_consumption_sheet_fragment";
        }
        return "reel_fundraiser_sticker_consumption_sheet_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x04ad, code lost:
    
        if (r2.AlC().booleanValue() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0477, code lost:
    
        if (r11 == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x067b  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V00.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1796120304);
        super.onCreate(bundle);
        C0f9.A09(-1725261479, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-285034191);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_fundraiser_sticker_consumption_sheet);
        C0f9.A09(1819074181, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2039909584);
        super.onDestroyView();
        Object systemService = this.A00.getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.A01.getWindowToken(), 0);
        C0f9.A09(-26699518, A02);
    }
}
