package X;

import android.util.Pair;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.1Rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26771Rh extends LinkedList<Pair<String, String>> {
    public static C26771Rh A02 = new C26771Rh();
    public String A00 = "not_initialized";
    public final C222015v A01 = AbstractC221915u.A00;

    public static synchronized C26771Rh A00() {
        C26771Rh c26771Rh;
        synchronized (C26771Rh.class) {
            c26771Rh = A02;
        }
        return c26771Rh;
    }

    public final String A01() {
        StringWriter stringWriter = new StringWriter();
        try {
            C17z A0A = this.A01.A0A(stringWriter);
            A0A.A0c();
            Iterator<Pair<String, String>> it = iterator();
            while (it.hasNext()) {
                Pair<String, String> next = it.next();
                A0A.A0d();
                A0A.A0r("module");
                A0A.A0u((String) next.first);
                A0A.A0r("click_point");
                A0A.A0u((String) next.second);
                A0A.A0a();
            }
            A0A.A0Z();
            A0A.close();
        } catch (IOException unused) {
            C0K8.A03(C26771Rh.class, "Unable to serialize NavigationQueue");
        }
        return stringWriter.toString();
    }

    public final void A02(InterfaceC11380iw interfaceC11380iw, String str, String str2) {
        super.addFirst(new Pair(str, str2));
        while (size() > 10) {
            super.removeLast();
        }
        this.A00 = interfaceC11380iw.getModuleName();
    }
}
