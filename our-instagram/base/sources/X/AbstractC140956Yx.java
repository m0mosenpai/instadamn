package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.6Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140956Yx {
    public static final C83693oE A00(InterfaceC83703oF interfaceC83703oF) {
        if (interfaceC83703oF instanceof C83693oE) {
            return (C83693oE) interfaceC83703oF;
        }
        return null;
    }

    public static final DirectThreadKey A01(InterfaceC83703oF interfaceC83703oF) {
        if (interfaceC83703oF instanceof C83693oE) {
            return new DirectThreadKey(((C83693oE) interfaceC83703oF).A00, null);
        }
        if (interfaceC83703oF instanceof C122145g6) {
            return new DirectThreadKey(((C122145g6) interfaceC83703oF).A00);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadTarget: ");
        sb.append(interfaceC83703oF);
        throw new IllegalStateException(sb.toString());
    }
}
