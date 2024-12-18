package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TUI implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Boolean A01;
    public final /* synthetic */ String A02;

    public TUI(SharedPreferences sharedPreferences, Boolean bool, String str) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.A00.getBoolean(this.A02, this.A01.booleanValue()));
    }
}
