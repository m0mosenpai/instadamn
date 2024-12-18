package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class RkC extends Exception {
    public final List A00;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return AnonymousClass001.A0R("Failed to get cross app signature for: ", AbstractC31175DnJ.A0a(", ", this.A00));
    }

    public RkC(List list) {
        this.A00 = list;
    }
}
