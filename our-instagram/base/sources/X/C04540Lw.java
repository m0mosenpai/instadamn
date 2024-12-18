package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.0Lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04540Lw implements C0N5 {
    public Iterator A00;
    public final Map A01;

    @Override // X.C0N5
    public final void reset() {
        this.A00 = null;
    }

    @Override // X.C0N5
    public final void A8g(Properties properties) {
        this.A01.putAll(properties);
    }

    @Override // X.C0N5
    public final boolean BX3(C0N4 c0n4) {
        Iterator it = this.A00;
        if (it == null) {
            it = this.A01.entrySet().iterator();
            this.A00 = it;
        }
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) this.A00.next();
            c0n4.A00 = entry.getKey().toString();
            c0n4.A01 = entry.getValue().toString();
            return true;
        }
        return false;
    }

    public C04540Lw(Properties properties) {
        this.A01 = properties;
    }

    @Override // X.C0N5
    public final String[] Bis(List list) {
        String str;
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Object obj = this.A01.get(list.get(i));
            if (obj != null) {
                str = obj.toString();
            } else {
                str = null;
            }
            strArr[i] = str;
        }
        return strArr;
    }

    public C04540Lw() {
        this.A01 = new Properties();
    }
}
