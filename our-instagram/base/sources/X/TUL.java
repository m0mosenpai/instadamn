package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TUL implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public TUL(SharedPreferences sharedPreferences, String str, String str2) {
        this.A00 = sharedPreferences;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.A00.getString(this.A01, this.A02);
    }
}
