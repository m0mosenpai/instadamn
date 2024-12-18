package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class EDK extends C40781ul {
    public List A00;

    @Override // X.C40781ul, X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        List list;
        if (this.mStatusCode == 200 && (list = this.A00) != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }
}
