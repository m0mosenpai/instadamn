package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TGc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64490TGc implements InterfaceC65457TkT {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ InterfaceC65531Tm1 A02;
    public final /* synthetic */ EnumC31713DwI A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C64490TGc(Fragment fragment, ImageUrl imageUrl, InterfaceC65531Tm1 interfaceC65531Tm1, EnumC31713DwI enumC31713DwI, String str, String str2, boolean z) {
        this.A00 = fragment;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A06 = z;
        this.A03 = enumC31713DwI;
        this.A02 = interfaceC65531Tm1;
    }

    @Override // X.InterfaceC65457TkT
    public final /* bridge */ /* synthetic */ void D6e(Object obj) {
        String str;
        FragmentActivity activity;
        IgFragmentActivity igFragmentActivity;
        final C63179See c63179See = (C63179See) obj;
        Fragment fragment = this.A00;
        String str2 = this.A05;
        String str3 = this.A04;
        ImageUrl imageUrl = this.A01;
        final boolean z = this.A06;
        final EnumC31713DwI enumC31713DwI = this.A03;
        InterfaceC65531Tm1 interfaceC65531Tm1 = this.A02;
        if (str3.length() == 0) {
            str = "Password is empty";
        } else {
            if (c63179See != null && (activity = fragment.getActivity()) != null) {
                C37766Gjh c37766Gjh = new C37766Gjh(c63179See, 3);
                if ((activity instanceof BaseFragmentActivity) && (igFragmentActivity = (IgFragmentActivity) activity) != null) {
                    igFragmentActivity.registerOnActivityResultListener(c37766Gjh);
                }
                final FragmentActivity activity2 = fragment.getActivity();
                final C64493TGf c64493TGf = new C64493TGf(fragment, c37766Gjh, interfaceC65531Tm1);
                if (c63179See.A00 == null) {
                    return;
                }
                try {
                    final Credential credential = new Credential(AbstractC08820cl.A03(imageUrl.getUrl()), str2, null, str3, null, null, null, null);
                    T51 t51 = c63179See.A00;
                    t51.getClass();
                    t51.A00(new InterfaceC65457TkT() { // from class: X.TGb
                        @Override // X.InterfaceC65457TkT
                        public final void D6e(Object obj2) {
                            String str4;
                            final C63179See c63179See2 = c63179See;
                            Credential credential2 = credential;
                            final Activity activity3 = activity2;
                            final EnumC31713DwI enumC31713DwI2 = enumC31713DwI;
                            final boolean z2 = z;
                            final InterfaceC65531Tm1 interfaceC65531Tm12 = c64493TGf;
                            AbstractC1335861e abstractC1335861e = (AbstractC1335861e) obj2;
                            if (abstractC1335861e != null) {
                                C3U5.A03(credential2, "credential must not be null");
                                abstractC1335861e.A07(new RL0(credential2, abstractC1335861e)).A07(new InterfaceC65404Tjb() { // from class: X.T59
                                    @Override // X.InterfaceC65404Tjb
                                    public final void Dgz(C61j c61j) {
                                        String str5;
                                        final C63179See c63179See3 = c63179See2;
                                        final Activity activity4 = activity3;
                                        final EnumC31713DwI enumC31713DwI3 = enumC31713DwI2;
                                        final boolean z3 = z2;
                                        final InterfaceC65531Tm1 interfaceC65531Tm13 = interfaceC65531Tm12;
                                        final Status status = (Status) c61j;
                                        String str6 = null;
                                        if (status != null) {
                                            int i = status.A00;
                                            if (i <= 0) {
                                                InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
                                                ARD.E77("preference_smartlock_credential_have_been_saved", true);
                                                ARD.apply();
                                                activity4.runOnUiThread(new Runnable() { // from class: X.TLj
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        InterfaceC65531Tm1.this.D6d(true, null);
                                                    }
                                                });
                                                if (z3) {
                                                    AbstractC12990ll abstractC12990ll = c63179See3.A03;
                                                    C14360o3.A0B(abstractC12990ll, 0);
                                                    C83753oK.A01(abstractC12990ll, "login_smartlock_save_success", "login_smart_lock", "smartlock", null);
                                                } else {
                                                    AbstractC12990ll abstractC12990ll2 = c63179See3.A03;
                                                    if (enumC31713DwI3 != null) {
                                                        str6 = enumC31713DwI3.A01;
                                                    }
                                                    C14360o3.A0B(abstractC12990ll2, 0);
                                                    C63378Siq.A05(abstractC12990ll2, str6, null, true, false);
                                                }
                                                if (AbstractC27461Uz.getInstance() != null) {
                                                    ((SmartLockPluginImpl) AbstractC27461Uz.getInstance()).A00 = true;
                                                    return;
                                                }
                                                return;
                                            }
                                            if (status.A01 != null) {
                                                activity4.runOnUiThread(new Runnable() { // from class: X.TRK
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        final C63179See c63179See4 = c63179See3;
                                                        InterfaceC65531Tm1 interfaceC65531Tm14 = interfaceC65531Tm13;
                                                        final EnumC31713DwI enumC31713DwI4 = enumC31713DwI3;
                                                        final boolean z4 = z3;
                                                        final Activity activity5 = activity4;
                                                        final Status status2 = status;
                                                        interfaceC65531Tm14.DgW(new InterfaceC37130GXr() { // from class: X.TGh
                                                            @Override // X.InterfaceC37130GXr
                                                            public final void EKA(InterfaceC65457TkT interfaceC65457TkT) {
                                                                C63179See c63179See5 = c63179See4;
                                                                EnumC31713DwI enumC31713DwI5 = enumC31713DwI4;
                                                                boolean z5 = z4;
                                                                Activity activity6 = activity5;
                                                                Status status3 = status2;
                                                                try {
                                                                    AbstractC12990ll abstractC12990ll3 = c63179See5.A03;
                                                                    C60971Rct c60971Rct = new C60971Rct(c63179See5.A02, abstractC12990ll3, interfaceC65457TkT, enumC31713DwI5, z5);
                                                                    List list = c63179See5.A04;
                                                                    synchronized (list) {
                                                                        list.add(c60971Rct);
                                                                    }
                                                                    PendingIntent pendingIntent = status3.A01;
                                                                    pendingIntent.getClass();
                                                                    activity6.startIntentSenderForResult(pendingIntent.getIntentSender(), ((AbstractC62658SKs) c60971Rct).A00, null, 0, 0, 0);
                                                                    if (z5) {
                                                                        C14360o3.A0B(abstractC12990ll3, 0);
                                                                        C83753oK.A01(abstractC12990ll3, "login_smartlock_save_impression", "login_smart_lock", "smartlock", null);
                                                                    }
                                                                } catch (IntentSender.SendIntentException unused) {
                                                                    if (!z5) {
                                                                        AbstractC12990ll abstractC12990ll4 = c63179See5.A03;
                                                                        enumC31713DwI5.getClass();
                                                                        String str7 = enumC31713DwI5.A01;
                                                                        C14360o3.A0B(abstractC12990ll4, 0);
                                                                        C63378Siq.A04(abstractC12990ll4, str7, "save", "cannot_show_dialog");
                                                                        activity6.runOnUiThread(new TQI(activity6, interfaceC65457TkT, Boolean.FALSE));
                                                                    }
                                                                }
                                                            }
                                                        });
                                                    }
                                                });
                                                return;
                                            }
                                            if (!z3) {
                                                AbstractC12990ll abstractC12990ll3 = c63179See3.A03;
                                                if (enumC31713DwI3 != null) {
                                                    str6 = enumC31713DwI3.A01;
                                                }
                                                String num = Integer.toString(i);
                                                C14360o3.A0B(abstractC12990ll3, 0);
                                                C63378Siq.A05(abstractC12990ll3, str6, num, false, false);
                                            }
                                            interfaceC65531Tm13.D6d(false, status.A03);
                                            return;
                                        }
                                        if (!z3) {
                                            AbstractC12990ll abstractC12990ll4 = c63179See3.A03;
                                            if (enumC31713DwI3 == null) {
                                                str5 = null;
                                            } else {
                                                str5 = enumC31713DwI3.A01;
                                            }
                                            C14360o3.A0B(abstractC12990ll4, 0);
                                            C63378Siq.A05(abstractC12990ll4, str5, null, false, false);
                                        }
                                        interfaceC65531Tm13.D6d(false, null);
                                    }
                                }, TimeUnit.MILLISECONDS, C63179See.A05);
                                return;
                            }
                            if (!z2) {
                                AbstractC12990ll abstractC12990ll = c63179See2.A03;
                                if (enumC31713DwI2 == null) {
                                    str4 = null;
                                } else {
                                    str4 = enumC31713DwI2.A01;
                                }
                                C14360o3.A0B(abstractC12990ll, 0);
                                C63378Siq.A05(abstractC12990ll, str4, null, false, false);
                            }
                            interfaceC65531Tm12.D6d(false, null);
                        }
                    });
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            }
            str = "SmartLock broker or Activity null";
        }
        interfaceC65531Tm1.D6d(false, str);
    }
}
