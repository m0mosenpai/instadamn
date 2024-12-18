package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35131ks extends C1OW implements InterfaceC29171au {
    public static final C1OZ A04 = new C31183DnS();
    public C206209Bd A00;
    public String A01;
    public String A02;
    public String A03;

    public C35131ks() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "dismiss_one_click_upsell";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A03;
        if (str != null) {
            return new DirectThreadKey(str);
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }
}
