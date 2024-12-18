package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gqv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38190Gqv implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    public C38190Gqv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return new C38179Gqk();
            case 1:
                return new C42344Ip6((UserSession) this.A01);
            default:
                final C146036i0 c146036i0 = (C146036i0) this.A01;
                c146036i0.A07.runOnUiThread(new Runnable() { // from class: X.J4I
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9GR.A07(C146036i0.this.A06, 2131973315);
                    }
                });
                return null;
        }
    }
}
