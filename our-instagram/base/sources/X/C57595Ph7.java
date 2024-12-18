package X;

import android.content.Context;

/* renamed from: X.Ph7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57595Ph7 extends C0YY implements InterfaceC16660sJ {
    public static final C57595Ph7 A00 = new C57595Ph7();

    public C57595Ph7() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C14360o3.A0B(context, 0);
        Object systemService = context.getSystemService("connectivity");
        C14360o3.A0C(systemService, AbstractC58317Pt9.A00(883));
        return systemService;
    }
}
