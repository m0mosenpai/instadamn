package X;

import android.content.res.AssetManager;
import android.os.Build;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: X.085, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass085 {
    public boolean A00 = false;
    public byte[] A01;
    public AnonymousClass086[] A02;
    public final AssetManager A03;
    public final C08C A04;
    public final File A05;
    public final String A06;
    public final byte[] A07;
    public final Executor A08;

    public static void A00(final AnonymousClass085 anonymousClass085, final Object obj, final int i) {
        anonymousClass085.A08.execute(new Runnable() { // from class: X.084
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass085 anonymousClass0852 = AnonymousClass085.this;
                anonymousClass0852.A04.Dh5(i, obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fa  */
    /* JADX WARN: Type inference failed for: r1v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v30, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AnonymousClass085 A01() {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass085.A01():X.085");
    }

    public final boolean A02() {
        if (this.A07 == null) {
            A00(this, Integer.valueOf(Build.VERSION.SDK_INT), 3);
            return false;
        }
        File file = this.A05;
        if (file.exists()) {
            if (!file.canWrite()) {
                A00(this, null, 4);
                return false;
            }
        } else {
            try {
                file.createNewFile();
            } catch (IOException unused) {
                A00(this, null, 4);
                return false;
            }
        }
        this.A00 = true;
        return true;
    }

    public AnonymousClass085(AssetManager assetManager, C08C c08c, File file, String str, Executor executor) {
        this.A03 = assetManager;
        this.A08 = executor;
        this.A04 = c08c;
        this.A06 = str;
        this.A05 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 28:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                    bArr = C08P.A05;
                    break;
                default:
                    bArr = C08P.A06;
                    break;
            }
        }
        this.A07 = bArr;
    }
}
