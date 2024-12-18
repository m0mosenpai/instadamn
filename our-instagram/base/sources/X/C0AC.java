package X;

import android.content.Context;

/* renamed from: X.0AC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AC extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass047 A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0AC(Context context, AnonymousClass047 anonymousClass047, boolean z) {
        super(0);
        this.A00 = context;
        this.A01 = anonymousClass047;
        this.A02 = z;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = AnonymousClass046.A01;
        AnonymousClass045.A00(this.A00, this.A01, AbstractC06930Yk.A06(new C09530e4("event_name", "instacrash_resolved"), new C09530e4("user_is_logged_in", Boolean.valueOf(this.A02))));
        return C0eB.A00;
    }
}
