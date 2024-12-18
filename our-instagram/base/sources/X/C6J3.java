package X;

import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.6J3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6J3 extends C0YY implements InterfaceC16660sJ {
    public static final C6J3 A00 = new C6J3();

    public C6J3() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z = false;
        if (((MailboxNullable) obj).value != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
