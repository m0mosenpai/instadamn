package X;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class WUN implements InterfaceC71948XBz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WGO A01;
    public final /* synthetic */ C68663VZz A02;
    public final /* synthetic */ List A03;

    public WUN(WGO wgo, C68663VZz c68663VZz, List list, int i) {
        this.A01 = wgo;
        this.A03 = list;
        this.A02 = c68663VZz;
        this.A00 = i;
    }

    @Override // X.InterfaceC71948XBz
    public final /* bridge */ /* synthetic */ void DqR(Bundle bundle, Object obj) {
        WGO wgo = this.A01;
        List unmodifiableList = Collections.unmodifiableList(this.A03);
        C67836Uz9 c67836Uz9 = ((C68737VbG) obj).A00;
        String str = c67836Uz9.A01;
        if (str != null) {
            wgo.A08 = str;
            C69451Vna c69451Vna = wgo.A0O;
            C69383VmT c69383VmT = c67836Uz9.A00;
            Integer num = c69383VmT.A00;
            C14360o3.A0A(num);
            c69451Vna.A00 = num.intValue();
            Integer num2 = c69383VmT.A01;
            C14360o3.A0A(num2);
            c69451Vna.A01 = num2.intValue();
            Integer num3 = c69383VmT.A02;
            C14360o3.A0A(num3);
            c69451Vna.A02 = num3.intValue();
            Integer num4 = c69383VmT.A05;
            C14360o3.A0A(num4);
            c69451Vna.A03 = num4.intValue();
            C14360o3.A0A(c69383VmT.A03);
            C14360o3.A0A(c69383VmT.A04);
            C14360o3.A0A(c69383VmT.A06);
            c69451Vna.A04 = r0.intValue();
            boolean z = c67836Uz9.A03;
            if (!z) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (C68966Vf4 c68966Vf4 : c67836Uz9.A02) {
                    String str2 = c68966Vf4.A01;
                    C14360o3.A0A(str2);
                    String str3 = c68966Vf4.A00;
                    C14360o3.A0A(str3);
                    if (str2 != null && !str2.isEmpty() && !hashSet.contains(str2)) {
                        hashSet.add(str2);
                        C69053Vgu c69053Vgu = new C69053Vgu(Long.parseLong(str2), str3);
                        c69053Vgu.A00 = C05F.A00;
                        arrayList.add(c69053Vgu);
                    }
                }
                SKN skn = wgo.A0U;
                ((SQLiteOpenHelper) skn.A00).getWritableDatabase().delete(AbstractC58317Pt9.A00(257), null, null);
                skn.A00(arrayList);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("in_sync", z);
            bundle2.putBoolean("full_upload", false);
            C69758Vuv c69758Vuv = wgo.A0V;
            bundle2.putString("root_hash", c69758Vuv.A01());
            bundle2.putInt("processed_contact_count", wgo.A02);
            bundle2.putLong("last_upload_success_time", c69758Vuv.A00());
            bundle2.putLong("time_spent", System.currentTimeMillis() - wgo.A07);
            bundle2.putInt("num_of_retries", wgo.A04);
            bundle2.putString("ccu_session_id", wgo.A08);
            bundle2.putString("family_device_id", null);
            Iterator it = wgo.A0Q.A01.iterator();
            while (it.hasNext()) {
                ((InterfaceC71991XEe) it.next()).D8N(bundle2);
            }
            wgo.A0U.A00(unmodifiableList);
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putString(TraceFieldType.FailureReason, "create_session_fail");
            bundle3.putInt("num_of_retries", wgo.A04);
            bundle3.putString("failure_message", "create session result is null");
            C69541Vr5 c69541Vr5 = wgo.A0Q;
            WGO.A01(bundle3, wgo);
            Iterator it2 = c69541Vr5.A01.iterator();
            while (it2.hasNext()) {
                ((InterfaceC71991XEe) it2.next()).D8M(bundle3);
            }
            wgo.A0S.A02(false, "create_session_invalid_response");
        }
        WGO.A04(wgo);
    }

    @Override // X.InterfaceC71948XBz
    public final void onFailure(Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putString(TraceFieldType.FailureReason, "create_session_fail");
        bundle.putString("failure_message", th.getMessage());
        WGO wgo = this.A01;
        bundle.putBoolean("full_upload", false);
        bundle.putInt("num_of_retries", wgo.A04);
        bundle.putString("family_device_id", (String) wgo.A0P.A00.get());
        C69541Vr5 c69541Vr5 = wgo.A0Q;
        WGO.A01(bundle, wgo);
        Iterator it = c69541Vr5.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC71991XEe) it.next()).D8M(bundle);
        }
        int i = wgo.A04 - 1;
        wgo.A04 = i;
        if (i >= 0) {
            WGO.A05(wgo, this.A02, this.A03, this.A00);
        } else {
            wgo.A0S.A01(TraceFieldType.FailureReason, AnonymousClass001.A0R("Session create failed with ", th.getMessage()));
            WGO.A04(wgo);
        }
    }
}
