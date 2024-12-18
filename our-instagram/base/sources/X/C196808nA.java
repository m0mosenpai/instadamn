package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.collect.ImmutableList;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.8nA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196808nA extends C2AG {
    public Bitmap A00;
    public final int A01;
    public final Context A02;
    public final Bitmap A03;
    public final Bitmap A04;
    public final C196708n0 A05;
    public final C196748n4 A06;
    public final C196748n4 A07;
    public final ImmutableList A08;
    public final CameraAREffect A09;
    public final MediaUploadMetadata A0A;
    public final UserSession A0B;
    public final TargetViewSizeProvider A0C;
    public final C8HK A0D;
    public final C184758Hq A0E;
    public final Boolean A0F;
    public final Float A0G;
    public final Float A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Long A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final List A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final byte[] A0X;
    public final byte[] A0Y;
    public final Rect A0Z;

    public C196808nA(Context context, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Rect rect, C196708n0 c196708n0, C196748n4 c196748n4, C196748n4 c196748n42, ImmutableList immutableList, CameraAREffect cameraAREffect, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C8HK c8hk, C184758Hq c184758Hq, Boolean bool, Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, String str, String str2, String str3, String str4, List list, byte[] bArr, byte[] bArr2, int i, boolean z, boolean z2, boolean z3) {
        this.A0B = userSession;
        this.A02 = context;
        this.A0C = targetViewSizeProvider;
        this.A0D = c8hk;
        this.A03 = bitmap;
        this.A0Y = bArr2;
        this.A0X = bArr;
        this.A04 = bitmap2;
        this.A05 = c196708n0;
        this.A0Z = rect;
        this.A0W = z3;
        this.A09 = cameraAREffect;
        this.A08 = immutableList;
        this.A0Q = str2;
        this.A0R = str3;
        this.A06 = c196748n4;
        this.A00 = bitmap3;
        this.A0U = z;
        this.A0P = str;
        this.A0E = c184758Hq;
        this.A01 = i;
        this.A0T = list;
        this.A0S = str4;
        this.A0O = l;
        this.A0K = num3;
        this.A0G = f;
        this.A0I = num;
        this.A0H = f2;
        this.A0J = num2;
        this.A0V = z2;
        this.A0F = bool;
        this.A0L = num4;
        this.A0N = num6;
        this.A07 = c196748n42;
        this.A0M = num5;
        this.A0A = mediaUploadMetadata;
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 549;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        C9GR.A0B(this.A02, "save_captured_photo_failed");
        this.A0D.DYP(exc.getMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196808nA.call():java.lang.Object");
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C183978Ee c183978Ee = (C183978Ee) obj;
        C14360o3.A0B(c183978Ee, 0);
        C8HK c8hk = this.A0D;
        if (!c8hk.CfS()) {
            C174757qB Ajx = c8hk.Ajx();
            if (Ajx != null) {
                Ajx.A0C();
                return;
            }
            return;
        }
        c8hk.DYQ(c183978Ee);
    }
}
