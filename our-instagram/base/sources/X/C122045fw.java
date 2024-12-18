package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122045fw extends C40781ul {
    public C126275nO A00;
    public Boolean A01;
    public String A02;
    public List A03 = new ArrayList();
    public List A04 = new ArrayList();

    public final C121395ef A00(String str) {
        C14360o3.A0B(str, 0);
        for (C121395ef c121395ef : this.A03) {
            if (C14360o3.A0K(c121395ef.A03, str)) {
                return c121395ef;
            }
        }
        return null;
    }

    public final HashMap A01() {
        HashMap hashMap = new HashMap();
        for (C121395ef c121395ef : this.A03) {
            String str = c121395ef.A03;
            if (str != null) {
                hashMap.put(str, Integer.valueOf(c121395ef.A04.size()));
            }
        }
        return hashMap;
    }
}
