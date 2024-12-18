package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Wd9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70575Wd9 implements InterfaceC71973XDg {
    public final long A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;

    public C70575Wd9(String str, String str2, Map map, Map map2, Map map3, long j) {
        AbstractC25233BEq.A0w(1, str, map, map2);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = map;
        this.A05 = map2;
        this.A00 = j;
        this.A03 = map3;
    }

    @Override // X.InterfaceC71973XDg
    public final String getStringForKey(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
            return this.A01;
        }
        Object obj = this.A03.get(str);
        if (obj == null) {
            obj = "";
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // X.InterfaceC71973XDg
    public final String BxO() {
        Object obj;
        Object obj2;
        String str;
        Iterator A15 = AbstractC166997dE.A15(this.A05);
        while (true) {
            obj = null;
            if (A15.hasNext()) {
                obj2 = A15.next();
                if (WDx.A02(this, (XA2) ((Map.Entry) obj2).getValue())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null || (str = (String) entry.getKey()) == null) {
            Iterator A152 = AbstractC166997dE.A15(this.A04);
            while (true) {
                if (!A152.hasNext()) {
                    break;
                }
                Object next = A152.next();
                if (WDx.A03(this, (List) ((Map.Entry) next).getValue())) {
                    obj = next;
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                return (String) entry2.getKey();
            }
            return this.A01;
        }
        return str;
    }

    @Override // X.InterfaceC71973XDg
    public final long C8S() {
        return this.A00;
    }

    @Override // X.InterfaceC71973XDg
    public final String getDisplayName() {
        String str = this.A02;
        if (str == null) {
            return this.A01;
        }
        return str;
    }
}
