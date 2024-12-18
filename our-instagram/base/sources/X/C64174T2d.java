package X;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.T2d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64174T2d implements InterfaceC102444jN, Serializable {
    public final AbstractC910944l A00;
    public final C913945y A01;

    @Override // X.InterfaceC102444jN
    public final Object BXX(AnonymousClass469 anonymousClass469) {
        C913945y c913945y = this.A01;
        String str = "<UNKNOWN>";
        Iterator it = C914045z.A00;
        if (c913945y != null) {
            str = String.format("\"%s\"", c913945y);
        }
        throw new RB7(anonymousClass469, c913945y, String.format("Invalid `null` value encountered for property %s", str));
    }

    public C64174T2d(AbstractC910944l abstractC910944l, C913945y c913945y) {
        this.A01 = c913945y;
        this.A00 = abstractC910944l;
    }

    @Override // X.InterfaceC102444jN
    public final /* synthetic */ Object AXq(AnonymousClass469 anonymousClass469) {
        BXX(anonymousClass469);
        throw C00O.createAndThrow();
    }
}
