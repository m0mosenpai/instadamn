package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.Status;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class TGY implements InterfaceC65457TkT {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C07270a1 A01;
    public final /* synthetic */ InterfaceC65576TnA A02;
    public final /* synthetic */ EnumC31713DwI A03;
    public final /* synthetic */ boolean A04;

    public TGY(Fragment fragment, C07270a1 c07270a1, InterfaceC65576TnA interfaceC65576TnA, EnumC31713DwI enumC31713DwI, boolean z) {
        this.A02 = interfaceC65576TnA;
        this.A00 = fragment;
        this.A03 = enumC31713DwI;
        this.A01 = c07270a1;
        this.A04 = z;
    }

    @Override // X.InterfaceC65457TkT
    public final /* bridge */ /* synthetic */ void D6e(Object obj) {
        InterfaceC65576TnA interfaceC65576TnA;
        String str;
        IgFragmentActivity igFragmentActivity;
        final C63179See c63179See = (C63179See) obj;
        if (c63179See == null) {
            interfaceC65576TnA = this.A02;
            str = "Response from SmartLock was null; indicates SmartLock not supported on device";
        } else {
            Fragment fragment = this.A00;
            final EnumC31713DwI enumC31713DwI = this.A03;
            final C07270a1 c07270a1 = this.A01;
            interfaceC65576TnA = this.A02;
            final boolean z = this.A04;
            C37766Gjh c37766Gjh = new C37766Gjh(c63179See, 3);
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                if ((activity instanceof BaseFragmentActivity) && (igFragmentActivity = (IgFragmentActivity) activity) != null) {
                    igFragmentActivity.registerOnActivityResultListener(c37766Gjh);
                }
                final FragmentActivity activity2 = fragment.getActivity();
                final TGZ tgz = new TGZ(fragment, c37766Gjh, c07270a1, interfaceC65576TnA, enumC31713DwI, 0);
                final TGZ tgz2 = new TGZ(fragment, c37766Gjh, c07270a1, interfaceC65576TnA, enumC31713DwI, 1);
                c63179See.A01 = interfaceC65576TnA;
                T51 t51 = c63179See.A00;
                if (t51 != null) {
                    final CredentialRequest credentialRequest = new CredentialRequest(null, null, null, null, new String[]{MSV.A00(1243)}, 4, true, false, false);
                    t51.A00(new InterfaceC65457TkT() { // from class: X.TGd
                        @Override // X.InterfaceC65457TkT
                        public final void D6e(Object obj2) {
                            final C63179See c63179See2 = c63179See;
                            CredentialRequest credentialRequest2 = credentialRequest;
                            final Activity activity3 = activity2;
                            final EnumC31713DwI enumC31713DwI2 = enumC31713DwI;
                            final InterfaceC65457TkT interfaceC65457TkT = tgz;
                            final InterfaceC65457TkT interfaceC65457TkT2 = tgz2;
                            final AbstractC12990ll abstractC12990ll = c07270a1;
                            final boolean z2 = z;
                            AbstractC1335861e abstractC1335861e = (AbstractC1335861e) obj2;
                            if (abstractC1335861e != null) {
                                abstractC1335861e.A07(new AbstractC60658RGk(SA2.A04, abstractC1335861e));
                                C3U5.A03(credentialRequest2, "request must not be null");
                                RKz rKz = new RKz(credentialRequest2, abstractC1335861e);
                                abstractC1335861e.A06(rKz);
                                rKz.A07(new InterfaceC65404Tjb() { // from class: X.T5A
                                    @Override // X.InterfaceC65404Tjb
                                    public final void Dgz(C61j c61j) {
                                        InterfaceC65576TnA interfaceC65576TnA2;
                                        String str2;
                                        TGU tgu;
                                        String str3;
                                        TQI tqi;
                                        String str4;
                                        String str5;
                                        String str6;
                                        C63179See c63179See3 = c63179See2;
                                        Activity activity4 = activity3;
                                        EnumC31713DwI enumC31713DwI3 = enumC31713DwI2;
                                        InterfaceC65457TkT interfaceC65457TkT3 = interfaceC65457TkT;
                                        InterfaceC65457TkT interfaceC65457TkT4 = interfaceC65457TkT2;
                                        AbstractC12990ll abstractC12990ll2 = abstractC12990ll;
                                        boolean z3 = z2;
                                        InterfaceC65662Tqs interfaceC65662Tqs = (InterfaceC65662Tqs) c61j;
                                        T51 t512 = c63179See3.A00;
                                        if (t512 != null) {
                                            if (interfaceC65662Tqs == null) {
                                                interfaceC65576TnA2 = c63179See3.A01;
                                                if (interfaceC65576TnA2 != null) {
                                                    str2 = "credentialRequestResult null";
                                                } else {
                                                    return;
                                                }
                                            } else {
                                                Status C0F = interfaceC65662Tqs.C0F();
                                                if (C0F != null) {
                                                    PendingIntent pendingIntent = C0F.A01;
                                                    if (pendingIntent != null && C0F.A00 == 6) {
                                                        try {
                                                            C60972Rcu c60972Rcu = new C60972Rcu(abstractC12990ll2, interfaceC65457TkT4, c63179See3.A01, enumC31713DwI3, z3);
                                                            List list = c63179See3.A04;
                                                            synchronized (list) {
                                                                list.add(c60972Rcu);
                                                            }
                                                            C0F.A00(activity4, ((AbstractC62658SKs) c60972Rcu).A00);
                                                            if (z3) {
                                                                C14360o3.A0B(abstractC12990ll2, 0);
                                                                C83753oK.A00(abstractC12990ll2, C05F.A00, "login_smartlock_impression", "login_smart_lock", "smartlock", null, null, null);
                                                                return;
                                                            }
                                                            if (enumC31713DwI3 == null) {
                                                                str6 = null;
                                                            } else {
                                                                str6 = enumC31713DwI3.A01;
                                                            }
                                                            int A0A = AbstractC58323PtF.A0A(abstractC12990ll2);
                                                            boolean A1P = AbstractC167007dF.A1P(t512.A01, 10);
                                                            C14360o3.A0B(abstractC12990ll2, 0);
                                                            C63378Siq.A00(C0F, abstractC12990ll2, str6, A0A, A1P);
                                                            return;
                                                        } catch (IntentSender.SendIntentException unused) {
                                                            C63378Siq c63378Siq = C63378Siq.A00;
                                                            if (enumC31713DwI3 == null) {
                                                                str5 = null;
                                                            } else {
                                                                str5 = enumC31713DwI3.A01;
                                                            }
                                                            c63378Siq.A06(C0F, abstractC12990ll2, str5, "start_resolution", "send_intent_exception", AbstractC58323PtF.A0A(abstractC12990ll2), AbstractC167007dF.A1P(t512.A01, 10));
                                                            tqi = new TQI(activity4, interfaceC65457TkT4, new TGU(null));
                                                        }
                                                    } else if (C0F.A00 == 0) {
                                                        if (!z3) {
                                                            if (enumC31713DwI3 == null) {
                                                                str4 = null;
                                                            } else {
                                                                str4 = enumC31713DwI3.A01;
                                                            }
                                                            int A0A2 = AbstractC58323PtF.A0A(abstractC12990ll2);
                                                            T51 t513 = c63179See3.A00;
                                                            t513.getClass();
                                                            boolean A1P2 = AbstractC167007dF.A1P(t513.A01, 10);
                                                            C14360o3.A0B(abstractC12990ll2, 0);
                                                            long currentTimeMillis = System.currentTimeMillis();
                                                            long A00 = C1Q9.A00();
                                                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll2), "ig_android_smart_lock_auto_sign_in");
                                                            AbstractC31179DnN.A15(A0f);
                                                            AbstractC31178DnM.A15(A0f, currentTimeMillis, A00);
                                                            AbstractC31176DnK.A1J(A0f, A00);
                                                            A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str4);
                                                            AbstractC31178DnM.A13(A0f);
                                                            A0f.A9K("num_one_tap_accounts", AbstractC31171DnF.A0V(A0A2));
                                                            A0f.A7v("is_auto_login_enable", Boolean.valueOf(A1P2));
                                                            boolean z4 = true;
                                                            A0f.A7v("has_status", true);
                                                            if (pendingIntent == null) {
                                                                z4 = false;
                                                            }
                                                            A0f.A7v("has_resolution", Boolean.valueOf(z4));
                                                            A0f.A9K(TraceFieldType.StatusCode, AbstractC167007dF.A0d());
                                                            A0f.AAP(TraceFieldType.StatusMessage, C0F.A03);
                                                            A0f.A7v("status_is_cancelled", false);
                                                            A0f.A7v("status_is_success", true);
                                                            A0f.A7v("status_is_interrupted", false);
                                                            A0f.Cht();
                                                        }
                                                        Credential credential = ((T4o) interfaceC65662Tqs).A00;
                                                        credential.getClass();
                                                        tgu = new TGU(new TGT(credential));
                                                        tqi = new TQI(activity4, interfaceC65457TkT3, tgu);
                                                        activity4.runOnUiThread(tqi);
                                                        return;
                                                    }
                                                }
                                                tgu = null;
                                                if (!z3) {
                                                    C63378Siq c63378Siq2 = C63378Siq.A00;
                                                    if (enumC31713DwI3 == null) {
                                                        str3 = null;
                                                    } else {
                                                        str3 = enumC31713DwI3.A01;
                                                    }
                                                    c63378Siq2.A06(C0F, abstractC12990ll2, str3, "handle_ig_credentials_response", "invalid_status", AbstractC58323PtF.A0A(abstractC12990ll2), AbstractC167007dF.A1P(t512.A01, 10));
                                                }
                                                tqi = new TQI(activity4, interfaceC65457TkT3, tgu);
                                                activity4.runOnUiThread(tqi);
                                                return;
                                            }
                                        } else {
                                            interfaceC65576TnA2 = c63179See3.A01;
                                            if (interfaceC65576TnA2 == null) {
                                                return;
                                            } else {
                                                str2 = "ApiClientWrapper not bound";
                                            }
                                        }
                                        interfaceC65576TnA2.CKO(str2);
                                    }
                                }, TimeUnit.MILLISECONDS, C63179See.A05);
                            }
                        }
                    });
                    return;
                } else if (interfaceC65576TnA == null) {
                    return;
                } else {
                    str = "ApiClientWrapper not bound";
                }
            } else {
                str = "Passed in fragment activity is null; Activity required for fetch";
            }
        }
        interfaceC65576TnA.CKO(str);
    }
}
