package X;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.ObU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55111ObU {
    public static final Bitmap A00(String str) {
        Object A1D;
        if (str == null) {
            return null;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            A1D = ALv.A00.A02(mediaMetadataRetriever, 256, 256);
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        Throwable A00 = C09550e6.A00(A1D);
        if (A00 != null) {
            C0K8.A0F("PendingMediaWorkerUtils", "Failed to create bitmap from video file path", A00);
        }
        return (Bitmap) (A1D instanceof C09540e5 ? null : A1D);
    }

    public static final Bitmap A01(String str) {
        Object A1D;
        if (str == null) {
            return null;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            A1D = ALv.A01(mediaMetadataRetriever);
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        Throwable A00 = C09550e6.A00(A1D);
        if (A00 != null) {
            C0K8.A0F("PendingMediaWorkerUtils", "Failed to create bitmap from video file path", A00);
        }
        return (Bitmap) (A1D instanceof C09540e5 ? null : A1D);
    }

    public static final boolean A03(ShareType shareType) {
        if (!AbstractC14490oL.A0C(AbstractC12290kX.A00)) {
            return true;
        }
        if (shareType != null) {
            AbstractC54100Nvy abstractC54100Nvy = AbstractC54100Nvy.$redex_init_class;
            switch (shareType.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 9:
                case 16:
                    return true;
            }
        }
        return false;
    }

    public static final Object A02(UserSession userSession, PendingMediaStore pendingMediaStore, InterfaceC23621Ds interfaceC23621Ds) {
        if (!pendingMediaStore.A0E()) {
            C73163Pr c73163Pr = new C73163Pr();
            AnonymousClass257.A00(userSession).A06(new PNQ(c73163Pr));
            Object A0E = c73163Pr.A0E(interfaceC23621Ds);
            if (A0E == C1JX.A02) {
                return A0E;
            }
        }
        return C0eB.A00;
    }
}
