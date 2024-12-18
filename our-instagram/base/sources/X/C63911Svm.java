package X;

import android.os.Looper;
import android.os.Message;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.Svm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63911Svm implements InterfaceC88013w9 {
    public static final C63911Svm A00 = new Object();

    @Override // X.InterfaceC88013w9
    public final void EnF(Message message) {
        String A19;
        C14360o3.A0B(message, 0);
        if (AbstractC020908f.A01()) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            if (message.getTarget() != null) {
                A1C.append(MSY.A0h(message.getTarget()));
            }
            if (message.getCallback() != null) {
                A1C.append("/");
                A1C.append(MSY.A0h(message.getCallback()));
            } else {
                A1C.append("/what:");
                A1C.append(message.what);
            }
            if (A1C.length() > 127) {
                A19 = A1C.substring(0, StringTreeSet.MAX_SYMBOL_COUNT);
                C14360o3.A0A(A19);
            } else {
                A19 = AbstractC166987dD.A19(A1C);
            }
            AbstractC020908f.A00(A19);
        }
    }

    @Override // X.InterfaceC88013w9
    public final void EnU(Looper looper, String str) {
    }

    @Override // X.InterfaceC88013w9
    public final void AVg(Message message) {
        if (AbstractC020908f.A01()) {
            AbstractC021008g.A00();
        }
    }

    @Override // X.InterfaceC88013w9
    public final void AVj() {
        if (AbstractC020908f.A01()) {
            AbstractC021008g.A00();
        }
    }

    @Override // X.InterfaceC88013w9
    public final void Ena() {
        if (AbstractC020908f.A01()) {
            AbstractC020908f.A00("nativePollOnce");
        }
    }
}
