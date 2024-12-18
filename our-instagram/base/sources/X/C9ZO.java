package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;

/* renamed from: X.9ZO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZO extends C0T6 {
    public final Context A00;
    public final Bitmap A01;
    public final TargetViewSizeProvider A02;
    public final CameraSpec A03;
    public final C199008r1 A04;
    public final AbstractC224009uj A05;
    public final C183978Ee A06;
    public final C195868lW A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZO) {
                C9ZO c9zo = (C9ZO) obj;
                if (!C14360o3.A0K(this.A07, c9zo.A07) || !C14360o3.A0K(this.A06, c9zo.A06) || !C14360o3.A0K(this.A05, c9zo.A05) || !C14360o3.A0K(this.A04, c9zo.A04) || !C14360o3.A0K(this.A01, c9zo.A01) || !C14360o3.A0K(this.A00, c9zo.A00) || !C14360o3.A0K(this.A02, c9zo.A02) || !C14360o3.A0K(this.A08, c9zo.A08) || !C14360o3.A0K(this.A09, c9zo.A09) || !C14360o3.A0K(this.A03, c9zo.A03) || this.A0A != c9zo.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0A, (((AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A00, (AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A05, ((AbstractC167017dG.A0M(this.A07) * 31) + AbstractC167017dG.A0M(this.A06)) * 31 * 31)) + AbstractC167017dG.A0M(this.A01)) * 31))) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
    }

    public C9ZO(Context context, Bitmap bitmap, TargetViewSizeProvider targetViewSizeProvider, CameraSpec cameraSpec, C199008r1 c199008r1, AbstractC224009uj abstractC224009uj, C183978Ee c183978Ee, C195868lW c195868lW, String str, String str2, boolean z) {
        this.A07 = c195868lW;
        this.A06 = c183978Ee;
        this.A05 = abstractC224009uj;
        this.A04 = c199008r1;
        this.A01 = bitmap;
        this.A00 = context;
        this.A02 = targetViewSizeProvider;
        this.A08 = str;
        this.A09 = str2;
        this.A03 = cameraSpec;
        this.A0A = z;
    }
}
