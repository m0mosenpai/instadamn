package X;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.ComponentActivity;

/* renamed from: X.0Tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06020Tq extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ ComponentActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06020Tq(ComponentActivity componentActivity) {
        super(0);
        this.A00 = componentActivity;
    }

    @Override // X.InterfaceC16820sZ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C152386tO invoke() {
        Bundle bundle;
        ComponentActivity componentActivity = this.A00;
        Application application = componentActivity.getApplication();
        if (componentActivity.getIntent() != null) {
            bundle = componentActivity.getIntent().getExtras();
        } else {
            bundle = null;
        }
        return new C152386tO(application, bundle, componentActivity);
    }
}
