package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: X.1yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43231yq extends AbstractC43161yj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1yj, java.lang.Object, X.1yq] */
    public static C43231yq A00(UserSession userSession) {
        C43231yq c43231yq = (C43231yq) userSession.A00(C43231yq.class);
        if (c43231yq == null) {
            ?? abstractC43161yj = new AbstractC43161yj(new InterfaceC43191ym() { // from class: X.1ys
                @Override // X.InterfaceC43191ym
                public final C1AV BfP() {
                    return C1AV.A0N;
                }
            }, userSession);
            userSession.A04(C43231yq.class, abstractC43161yj);
            return abstractC43161yj;
        }
        return c43231yq;
    }

    public final void A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = AbstractC85443rZ.A01().matcher(str);
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                arrayList.add(group.substring(1, group.length()));
            }
            InterfaceC19610xo ARD = this.A00.ARD();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    String str2 = (String) next;
                    ARD.E7K(str2, str2);
                    AbstractC43161yj.A01(this, next);
                } catch (IOException unused) {
                }
            }
            ARD.apply();
        }
    }
}
