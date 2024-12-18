package X;

import android.content.Intent;

/* renamed from: X.GVz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37090GVz extends C0YY implements InterfaceC16660sJ {
    public static final C37090GVz A00 = new C37090GVz();

    public C37090GVz() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Intent intent = (Intent) obj;
        C14360o3.A0B(intent, 0);
        String stringExtra = intent.getStringExtra(AbstractC31198Dnh.A01());
        if (stringExtra != null) {
            return AnonymousClass001.A0R(AbstractC43591JPw.A00(1044), stringExtra);
        }
        return "https://www.instagram.com/stories";
    }
}
