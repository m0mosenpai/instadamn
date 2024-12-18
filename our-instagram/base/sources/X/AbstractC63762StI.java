package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.StI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63762StI implements InterfaceC65570Tn3 {
    public Object A00;
    public final AssetManager A01;
    public final String A02;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return C05F.A00;
    }

    @Override // X.InterfaceC65570Tn3
    public final void ChQ(EnumC61107RfN enumC61107RfN, InterfaceC65471Tko interfaceC65471Tko) {
        Object openFd;
        try {
            AssetManager assetManager = this.A01;
            String str = this.A02;
            if (this instanceof QB7) {
                openFd = assetManager.open(str);
            } else {
                openFd = assetManager.openFd(str);
            }
            this.A00 = openFd;
            interfaceC65471Tko.D9H(openFd);
        } catch (IOException e) {
            android.util.Log.isLoggable("AssetPathFetcher", 3);
            interfaceC65471Tko.DPj(e);
        }
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
        Object obj = this.A00;
        if (obj == null) {
            return;
        }
        try {
            if (this instanceof QB7) {
                ((InputStream) obj).close();
            } else {
                ((AssetFileDescriptor) obj).close();
            }
        } catch (IOException unused) {
        }
    }

    public AbstractC63762StI(AssetManager assetManager, String str) {
        this.A01 = assetManager;
        this.A02 = str;
    }
}
