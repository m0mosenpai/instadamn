package X;

import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: X.83b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1814883b {
    public BDB A00;
    public final LinkedList A01 = new LinkedList();

    public final void A00(JSONObject jSONObject) {
        BDB bdb = this.A00;
        if (bdb != null && bdb.isAlive()) {
            bdb.enqueueEvent(jSONObject);
        } else {
            this.A01.add(jSONObject);
        }
    }
}
