package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.PhoneNumberUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public abstract class ESM extends C1P1 {
    public FragmentActivity A00;
    public C07270a1 A01;
    public String A02;
    public boolean A03;

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(1520443802);
        super.onFail(abstractC115105If);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            C0w9.A03("Show error message when fail to validate link's token for shared phone recovery flow on unvetted devices", "Fail to validate token in SMS Link");
            C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
            A0H.A0A(2131975766);
            A0H.A09(2131972429);
            A0H.A07();
            AbstractC31178DnM.A1R(A0H, true);
            C006802i.A0p.markerAnnotate(725095506, TraceFieldType.FailureReason, "network_error");
            C006802i.A0p.markerEnd(725095506, (short) 3);
            i = -1355300295;
        } else {
            i = 113174387;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-1973092632);
        C32195ECq c32195ECq = (C32195ECq) obj;
        int A032 = C0f9.A03(-1494460276);
        super.onSuccess(c32195ECq);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            C07270a1 c07270a1 = this.A01;
            C006802i.A0p.markerPoint(725095506, "network_complete");
            String str = c32195ECq.A01;
            String str2 = this.A02;
            if (AbstractC31189DnY.A00().equals(str2)) {
                String formatNumber = PhoneNumberUtils.formatNumber(str.replace("+", ""));
                Pattern pattern = AbstractC13670mt.A01;
                if (formatNumber == null) {
                    formatNumber = "";
                }
                str = AbstractC31181DnP.A0I(fragmentActivity, formatNumber).toString();
            }
            AbstractC31172DnG.A1A();
            ArrayList<? extends Parcelable> arrayList = c32195ECq.A02;
            String str3 = c32195ECq.A00;
            boolean z = this.A03;
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            Bundle A09 = AbstractC31176DnK.A09("IgSessionManager.LOGGED_OUT_TOKEN");
            A09.putParcelableArrayList("lookup_users", arrayList);
            A09.putString("login_nonce", str3);
            A09.putString("recovery_handle_type", str2);
            A09.putString("recovery_handle", str);
            A09.putBoolean("is_shared_phone_recovery_via_link", z);
            A09.putAll(A0b);
            abstractC59962oe.setArguments(A09);
            AbstractC31181DnP.A0b(abstractC59962oe, fragmentActivity, c07270a1);
            i = -2044462089;
        } else {
            i = 943397175;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-97425919, A03);
    }
}
