package X;

import android.os.Environment;
import android.util.Pair;
import com.facebook.react.modules.intent.IntentModule;
import java.io.File;

/* renamed from: X.1Ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23891Ez extends C23191Ay {
    public final C23111Aq A00;
    public final C1F0 A01;

    public C23891Ez(C23111Aq c23111Aq) {
        super(c23111Aq.A05);
        this.A00 = c23111Aq;
        this.A01 = C1F0.A00();
    }

    @Override // X.C23191Ay
    public final File A01(Pair pair) {
        boolean z;
        if (((Number) pair.first).intValue() == 6) {
            Object A02 = this.A01.A00.A02("dev_media_store_external_files", IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            if (A02 instanceof Boolean) {
                z = ((Boolean) A02).booleanValue();
            } else {
                z = false;
            }
            int i = 4;
            int i2 = 2;
            if (z) {
                i2 = 4;
            }
            if (!C0JK.A01().A0A() || Environment.isExternalStorageEmulated()) {
                i = i2;
            }
            return super.A01(new Pair(Integer.valueOf(i), pair.second));
        }
        return super.A01(pair);
    }
}
