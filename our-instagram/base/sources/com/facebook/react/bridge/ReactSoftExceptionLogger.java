package com.facebook.react.bridge;

import X.AbstractC166987dD;
import X.AbstractC31173DnH;
import X.AbstractC43594JPz;
import X.AnonymousClass001;
import X.C0I2;
import X.InterfaceC65217Tg8;
import X.TXX;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public class ReactSoftExceptionLogger {
    public static final List A00 = new CopyOnWriteArrayList();

    public static void addListener(InterfaceC65217Tg8 interfaceC65217Tg8) {
        AbstractC43594JPz.A1Q(interfaceC65217Tg8, A00);
    }

    public static void clearListeners() {
        A00.clear();
    }

    public static void logSoftException(String str, Throwable th) {
        List list = A00;
        if (list.size() > 0) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("logSoftException");
            }
            return;
        }
        C0I2.A05(str, "Unhandled SoftException", th);
    }

    public static void removeListener(InterfaceC65217Tg8 interfaceC65217Tg8) {
        A00.remove(interfaceC65217Tg8);
    }

    public static void logSoftExceptionVerbose(String str, Throwable th) {
        logSoftException(AnonymousClass001.A11(str, "|", AbstractC31173DnH.A0q(th), ":", th.getMessage()), th);
    }

    public static void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        TXX.A00(str2, str);
    }
}
