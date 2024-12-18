package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.msys.mca.MessageSyncService;
import com.facebook.msys.mci.AccountSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T8M implements C2JL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public T8M(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(th, 0);
                ((AbstractC25011Ke) this.A01).setException(th);
                return;
            case 1:
                C14360o3.A0B(th, 0);
                ((C00V) this.A01).Cv1(new ActivityResult(0, AbstractC31171DnF.A04().putExtra("result_type", "refresh_token")));
                C63295Sgw c63295Sgw = C63295Sgw.A00;
                AbstractC58323PtF.A19((Bundle) this.A02, (InterfaceC02550Ad) this.A03, c63295Sgw, C05F.A1I, th);
                return;
            default:
                C14360o3.A0B(th, 0);
                C0K8.A0O(AbstractC43591JPw.A00(669), AbstractC111324zv.A00(3624), AbstractC58319PtB.A1Z(th));
                return;
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C63295Sgw c63295Sgw;
        InterfaceC02550Ad interfaceC02550Ad;
        Integer num;
        Bundle bundle;
        String str2;
        Object obj2;
        Object obj3;
        AccountSession accountSession;
        AccountSession accountSession2;
        switch (this.A00) {
            case 0:
                Map map = (Map) obj;
                C14360o3.A0B(map, 0);
                SYP syp = ((SHH) this.A03).A01;
                Map map2 = (Map) this.A02;
                ArrayList A12 = AbstractC166997dE.A12(map2, 0);
                SZQ szq = SYP.A02;
                A12.addAll(szq.A02(map2));
                A12.addAll(syp.A00(map2));
                A12.addAll(szq.A01(map2));
                A12.addAll(SZQ.A00(map2));
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A12.iterator();
                while (it.hasNext()) {
                    BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) it.next();
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    if (browserExtensionsAutofillData instanceof TelephoneAutofillData) {
                        str = "telephone-autofill-data";
                    } else if (browserExtensionsAutofillData instanceof NameAutofillData) {
                        str = "name-autofill-data";
                    } else if (browserExtensionsAutofillData instanceof EmailAutofillData) {
                        str = "email-autofill-data";
                    } else {
                        str = "address-autofill-data";
                    }
                    Collection collection = (Collection) map.get(str);
                    if (collection != null) {
                        A1E2.addAll(collection);
                    }
                    if (!(A1E2 instanceof Collection) || !A1E2.isEmpty()) {
                        Iterator it2 = A1E2.iterator();
                        while (it2.hasNext()) {
                            if (browserExtensionsAutofillData.Cdx((FbAutofillData) it2.next())) {
                                break;
                            }
                        }
                    }
                    if (!A1E2.contains(browserExtensionsAutofillData)) {
                        MSZ.A1P(browserExtensionsAutofillData, A1E);
                    }
                }
                ((AbstractC25011Ke) this.A01).set(A1E);
                return;
            case 1:
                AnonymousClass436 anonymousClass436 = (AnonymousClass436) obj;
                if (anonymousClass436 != null && (obj2 = (InterfaceC65647TqI) anonymousClass436.Bos()) != null && (obj3 = (InterfaceC65646TqH) ((C2JS) obj2).getOptionalTreeField(0, "xfb_amazon_bwp_refresh_access_token(extra_data:$extra_data)", QKU.class, -1052618405)) != null) {
                    C2JS c2js = (C2JS) obj3;
                    String optionalStringField = c2js.getOptionalStringField(0, "access_token");
                    int coercedIntField = c2js.getCoercedIntField(1, "expiry_time");
                    Integer valueOf = Integer.valueOf(coercedIntField);
                    if (optionalStringField != null && valueOf != null && coercedIntField != 0) {
                        Intent putExtra = AbstractC31171DnF.A04().putExtra("result_type", "refresh_token").putExtra("access_token", optionalStringField).putExtra("expiry_time", coercedIntField);
                        C14360o3.A07(putExtra);
                        ((C00V) this.A01).Cv1(new ActivityResult(-1, putExtra));
                        c63295Sgw = C63295Sgw.A00;
                        interfaceC02550Ad = (InterfaceC02550Ad) this.A03;
                        num = C05F.A15;
                        bundle = (Bundle) this.A02;
                        str2 = null;
                        c63295Sgw.A02(bundle, interfaceC02550Ad, num, str2);
                        return;
                    }
                }
                c63295Sgw = C63295Sgw.A00;
                interfaceC02550Ad = (InterfaceC02550Ad) this.A03;
                num = C05F.A1I;
                bundle = (Bundle) this.A02;
                str2 = "null access token";
                c63295Sgw.A02(bundle, interfaceC02550Ad, num, str2);
                return;
            default:
                if (obj != null && !obj.equals(C64K.A05)) {
                    LJd lJd = (LJd) this.A03;
                    MessageSyncService messageSyncService = (MessageSyncService) this.A01;
                    if (!lJd.A0J.get()) {
                        if (AbstractC166987dD.A1a(AbstractC47132Ef.A00(lJd.A0C.A01).A0w.get())) {
                            if (lJd.A04 == null) {
                                synchronized (messageSyncService) {
                                    accountSession2 = messageSyncService.mAccountSession;
                                }
                                lJd.A04 = new C135656Br(accountSession2);
                            }
                            synchronized (messageSyncService) {
                                accountSession = messageSyncService.mAccountSession;
                            }
                            AbstractC46541Kig.A00(new C135656Br(accountSession), new C65075Td4(lJd, 27));
                            return;
                        }
                        lJd.A07 = false;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
