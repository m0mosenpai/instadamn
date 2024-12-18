package X;

import android.content.SharedPreferences;

/* renamed from: X.0MT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MT extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ SharedPreferences A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MT(SharedPreferences sharedPreferences) {
        super(0);
        this.A00 = sharedPreferences;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.A00.contains("dummy");
        return C0eB.A00;
    }
}
