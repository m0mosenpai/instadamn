package X;

import android.content.Context;

/* renamed from: X.Ph9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57597Ph9 extends C0YY implements InterfaceC16660sJ {
    public static final C57597Ph9 A00 = new C57597Ph9();

    public C57597Ph9() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.NnF] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C14360o3.A0B(context, 0);
        ?? obj2 = new Object();
        obj2.A00 = new C109574wj(context.getAssets());
        return obj2;
    }
}
