package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.common.session.UserSession;

/* renamed from: X.0AP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AP extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0AP(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            return new C0DV((UserSession) this.A01);
        }
        SharedPreferences sharedPreferences = ((Context) this.A01).getSharedPreferences("devprefs", 0);
        C14360o3.A07(sharedPreferences);
        return sharedPreferences;
    }
}
