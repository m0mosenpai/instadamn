package X;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.Ssc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63722Ssc implements InterfaceC65319Thy {
    @Override // X.InterfaceC65319Thy
    public final /* bridge */ /* synthetic */ boolean AS0(C63729Ssj c63729Ssj, File file, Object obj) {
        try {
            AbstractC63086Sc9.A01(file, (ByteBuffer) obj);
            return true;
        } catch (IOException unused) {
            android.util.Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
