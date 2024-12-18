package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OEs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54715OEs {
    public int A00;
    public final Context A01;
    public final C55000OUz A03;
    public final AudioManager A07;
    public final Runnable A05 = new PL8(this);
    public final Runnable A04 = new PL7(this);
    public final Handler A02 = AbstractC167007dF.A0J();
    public final AtomicBoolean A06 = AbstractC166997dE.A17();

    public C54715OEs(Context context, AudioManager audioManager, C55000OUz c55000OUz) {
        this.A01 = context;
        this.A07 = audioManager;
        this.A03 = c55000OUz;
    }
}
