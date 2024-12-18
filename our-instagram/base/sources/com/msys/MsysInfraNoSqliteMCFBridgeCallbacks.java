package com.msys;

import X.AbstractC25011Ke;
import X.AnonymousClass001;
import X.C0eB;
import X.C136096Dr;
import X.C6EA;
import com.facebook.msys.mcf.MsysError;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public class MsysInfraNoSqliteMCFBridgeCallbacks {

    /* loaded from: classes3.dex */
    public abstract class MCIAuxiliaryDatabasesActivationCallback {
        private void callbackJNI(int i, MsysError msysError) {
            C136096Dr c136096Dr;
            Map map;
            C6EA c6ea = (C6EA) this;
            Integer valueOf = Integer.valueOf(i);
            if (msysError != null) {
                msysError.getMessage();
                c136096Dr = c6ea.A00;
                c136096Dr.A00.A04(AnonymousClass001.A0O("aux_db_open_failed_", i));
                map = c136096Dr.A01;
                AbstractC25011Ke abstractC25011Ke = (AbstractC25011Ke) map.get(valueOf);
                if (abstractC25011Ke != null) {
                    abstractC25011Ke.setException(new RuntimeException(msysError.getMessage()));
                }
            } else {
                c136096Dr = c6ea.A00;
                map = c136096Dr.A01;
                AbstractC25011Ke abstractC25011Ke2 = (AbstractC25011Ke) map.get(valueOf);
                if (abstractC25011Ke2 != null) {
                    abstractC25011Ke2.set(C0eB.A00);
                }
            }
            Collection values = map.values();
            if (values == null || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (!((AbstractC25011Ke) it.next()).isDone()) {
                        return;
                    }
                }
            }
            c136096Dr.A00.A04("aux_db_activated_all");
        }
    }
}
