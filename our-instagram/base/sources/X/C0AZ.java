package X;

import android.content.Context;

/* renamed from: X.0AZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AZ extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass047 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0AZ(Context context, AnonymousClass047 anonymousClass047, long j) {
        super(0);
        this.A01 = context;
        this.A02 = anonymousClass047;
        this.A00 = j;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = AnonymousClass046.A01;
        AnonymousClass045.A00(this.A01, this.A02, AbstractC06930Yk.A06(new C09530e4("crash_count", Long.valueOf(this.A00)), new C09530e4("event_name", "instacrash_detected"), new C09530e4("detection_threshold_count", Integer.valueOf(AnonymousClass046.A00)), new C09530e4("detection_threshold_interval_ms", Integer.valueOf(AnonymousClass046.A01))));
        return C0eB.A00;
    }
}
