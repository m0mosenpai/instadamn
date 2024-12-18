package X;

import com.instagram.quickpromotion.model.FilterType;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94494Nb {
    public FilterType A00 = FilterType.A19;
    public C94514Ne A01;
    public String A02;
    public List A03;

    public final C94514Ne A00(String str) {
        List list = this.A03;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C14360o3.A0K(((C94514Ne) next).A02, str)) {
                obj = next;
                break;
            }
        }
        return (C94514Ne) obj;
    }

    public final String toString() {
        String str;
        List list = this.A03;
        if (list != null) {
            str = AbstractC001800i.A0P(" : ", "", "", list, null);
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{ QPFilter: value: ");
        sb.append(this.A01);
        sb.append(", filter_type:");
        sb.append(this.A00);
        sb.append(", unknown_action:");
        sb.append(this.A02);
        sb.append(", extra_data: ");
        sb.append(str);
        return sb.toString();
    }
}
