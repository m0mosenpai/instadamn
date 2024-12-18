package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.AcV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23576AcV implements InterfaceC25165BBl {
    public final /* synthetic */ List A00;

    public C23576AcV(List list) {
        this.A00 = list;
    }

    @Override // X.InterfaceC25165BBl
    public final void DEa(JSONObject jSONObject) {
        for (BCK bck : this.A00) {
            if (bck.AFf(jSONObject)) {
                bck.CJB(jSONObject);
            }
        }
    }
}
