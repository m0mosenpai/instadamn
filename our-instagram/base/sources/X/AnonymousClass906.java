package X;

import android.content.Context;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import java.lang.ref.WeakReference;

/* renamed from: X.906, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass906 {
    public AudioGraphClientProvider A00;
    public InterfaceC189918bA A01;
    public AudioServiceConfigurationAnnouncer A02;
    public C68680VaG A03;
    public WeakReference A04;
    public boolean A05 = false;
    public final Context A06;
    public final boolean A07;

    public AnonymousClass906(Context context, AudioGraphClientProvider audioGraphClientProvider, AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer, boolean z) {
        this.A06 = context.getApplicationContext();
        this.A07 = z;
        this.A00 = audioGraphClientProvider;
        this.A02 = audioServiceConfigurationAnnouncer;
    }
}
