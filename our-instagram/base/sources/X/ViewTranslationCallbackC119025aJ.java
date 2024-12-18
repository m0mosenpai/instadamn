package X;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5aJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTranslationCallbackC119025aJ implements ViewTranslationCallback {
    public static final ViewTranslationCallbackC119025aJ A00 = new Object();

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view) {
        C120895dg c120895dg;
        InterfaceC16820sZ interfaceC16820sZ;
        C14360o3.A0C(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view).A04;
        androidContentCaptureManager.A04 = C05F.A00;
        C01M A06 = androidContentCaptureManager.A06();
        Object[] objArr = A06.A04;
        long[] jArr = A06.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C113505An c113505An = ((C121655fH) objArr[(i << 3) + i3]).A01.A05;
                            if (C5B6.A00(c113505An, AbstractC113545Ar.A0F) != null && (c120895dg = (C120895dg) C5B6.A00(c113505An, AbstractC120875de.A00)) != null && (interfaceC16820sZ = (InterfaceC16820sZ) c120895dg.A01) != null) {
                                interfaceC16820sZ.invoke();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view) {
        C120895dg c120895dg;
        InterfaceC16660sJ interfaceC16660sJ;
        C14360o3.A0C(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view).A04;
        androidContentCaptureManager.A04 = C05F.A00;
        C01M A06 = androidContentCaptureManager.A06();
        Object[] objArr = A06.A04;
        long[] jArr = A06.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C113505An c113505An = ((C121655fH) objArr[(i << 3) + i3]).A01.A05;
                            if (C14360o3.A0K(C5B6.A00(c113505An, AbstractC113545Ar.A0F), true) && (c120895dg = (C120895dg) C5B6.A00(c113505An, AbstractC120875de.A0Q)) != null && (interfaceC16660sJ = (InterfaceC16660sJ) c120895dg.A01) != null) {
                                interfaceC16660sJ.invoke(false);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view) {
        C120895dg c120895dg;
        InterfaceC16660sJ interfaceC16660sJ;
        C14360o3.A0C(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view).A04;
        androidContentCaptureManager.A04 = C05F.A01;
        C01M A06 = androidContentCaptureManager.A06();
        Object[] objArr = A06.A04;
        long[] jArr = A06.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C113505An c113505An = ((C121655fH) objArr[(i << 3) + i3]).A01.A05;
                            if (C14360o3.A0K(C5B6.A00(c113505An, AbstractC113545Ar.A0F), false) && (c120895dg = (C120895dg) C5B6.A00(c113505An, AbstractC120875de.A0Q)) != null && (interfaceC16660sJ = (InterfaceC16660sJ) c120895dg.A01) != null) {
                                interfaceC16660sJ.invoke(true);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
